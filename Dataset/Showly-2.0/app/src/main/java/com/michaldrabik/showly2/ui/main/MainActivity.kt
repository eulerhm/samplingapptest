package com.michaldrabik.showly2.ui.main

import android.content.Intent
import android.os.Bundle
import android.view.ViewGroup
import android.view.animation.DecelerateInterpolator
import androidx.activity.addCallback
import androidx.activity.viewModels
import androidx.annotation.IdRes
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.snackbar.BaseTransientBottomBar.LENGTH_INDEFINITE
import com.google.android.play.core.appupdate.AppUpdateManager
import com.google.android.play.core.review.ReviewManagerFactory
import com.jakewharton.processphoenix.ProcessPhoenix
import com.michaldrabik.common.Config
import com.michaldrabik.common.Mode
import com.michaldrabik.common.Mode.MOVIES
import com.michaldrabik.common.Mode.SHOWS
import com.michaldrabik.showly2.BuildConfig
import com.michaldrabik.showly2.R
import com.michaldrabik.showly2.ui.BillingActivity
import com.michaldrabik.showly2.ui.views.WhatsNewView
import com.michaldrabik.showly2.utilities.NetworkObserver
import com.michaldrabik.ui_base.Analytics
import com.michaldrabik.ui_base.common.OnShowsMoviesSyncedListener
import com.michaldrabik.ui_base.common.OnTabReselectedListener
import com.michaldrabik.ui_base.common.OnTraktSyncListener
import com.michaldrabik.ui_base.events.Event
import com.michaldrabik.ui_base.events.EventObserver
import com.michaldrabik.ui_base.events.ShowsMoviesSyncComplete
import com.michaldrabik.ui_base.events.TraktQuickSyncSuccess
import com.michaldrabik.ui_base.events.TraktSyncError
import com.michaldrabik.ui_base.events.TraktSyncProgress
import com.michaldrabik.ui_base.events.TraktSyncSuccess
import com.michaldrabik.ui_base.sync.ShowsMoviesSyncService
import com.michaldrabik.ui_base.utilities.NavigationHost
import com.michaldrabik.ui_base.utilities.SnackbarHost
import com.michaldrabik.ui_base.utilities.TipsHost
import com.michaldrabik.ui_base.utilities.extensions.dimenToPx
import com.michaldrabik.ui_base.utilities.extensions.fadeIn
import com.michaldrabik.ui_base.utilities.extensions.fadeOut
import com.michaldrabik.ui_base.utilities.extensions.gone
import com.michaldrabik.ui_base.utilities.extensions.onClick
import com.michaldrabik.ui_base.utilities.extensions.openWebUrl
import com.michaldrabik.ui_base.utilities.extensions.showInfoSnackbar
import com.michaldrabik.ui_base.utilities.extensions.visible
import com.michaldrabik.ui_base.utilities.extensions.visibleIf
import com.michaldrabik.ui_model.Tip
import com.michaldrabik.ui_model.Tip.MENU_DISCOVER
import com.michaldrabik.ui_model.Tip.MENU_MODES
import com.michaldrabik.ui_model.Tip.MENU_MY_SHOWS
import com.michaldrabik.ui_settings.helpers.AppLanguage
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.view_bottom_menu.*
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import timber.log.Timber

@AndroidEntryPoint
class MainActivity :
  BillingActivity(),
  EventObserver,
  NetworkObserver,
  SnackbarHost,
  NavigationHost,
  TipsHost {

  companion object {
    private const val NAVIGATION_TRANSITION_DURATION_MS = 350L
    private const val ARG_NAVIGATION_VISIBLE = "ARG_NAVIGATION_VISIBLE"
  }

  private val viewModel by viewModels<MainViewModel>()

  private val navigationHeightPad by lazy { dimenToPx(R.dimen.bottomNavigationHeightPadded) }
  private val navigationHeight by lazy { dimenToPx(R.dimen.bottomNavigationHeight) }
  private val decelerateInterpolator by lazy { DecelerateInterpolator(2F) }
  private val tips by lazy {
    mapOf(
      MENU_DISCOVER to tutorialTipDiscover,
      MENU_MY_SHOWS to tutorialTipMyShows,
      MENU_MODES to tutorialTipModeMenu
    )
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    setupBackPressed()
    setupViewModel()
    setupNavigation()
    setupTips()
    setupView()

    restoreState(savedInstanceState)
    onNewIntent(intent)
  }

  override fun onStart() {
    super.onStart()
    ShowsMoviesSyncService.initialize(applicationContext)
  }

  override fun onNewIntent(intent: Intent?) {
    super.onNewIntent(intent)
    handleAppShortcut(intent)
    handleNotification(intent?.extras) { hideNavigation(false) }
    handleTraktAuthorization(intent?.data)
  }

  private fun setupViewModel() {
    lifecycleScope.launch {
      repeatOnLifecycle(Lifecycle.State.STARTED) {
        with(viewModel) {
          launch { uiState.collect { render(it) } }
          initialize()
          refreshTraktSyncSchedule()
        }
      }
    }
  }

  private fun setupView() {
    with(bottomMenuView) {
      isModeMenuEnabled = moviesEnabled()
      onModeSelected = { setMode(it) }
    }
  }

  private fun setupNavigation() {
    findNavControl()?.run {
      val graph = navInflater.inflate(R.navigation.navigation_graph)
      graph.startDestination = when (viewModel.getMode()) {
        SHOWS -> R.id.progressFragment
        MOVIES -> R.id.progressMoviesMainFragment
        else -> throw IllegalStateException()
      }
      setGraph(graph)
    }
    with(bottomNavigationView) {
      setOnNavigationItemSelectedListener { item ->
        if (selectedItemId == item.itemId) {
          doForFragments { (it as? OnTabReselectedListener)?.onTabReselected() }
          return@setOnNavigationItemSelectedListener true
        }

        val target = when (item.itemId) {
          R.id.menuProgress -> getMenuProgressAction()
          R.id.menuDiscover -> getMenuDiscoverAction()
          R.id.menuCollection -> getMenuCollectionAction()
          R.id.menuNews -> R.id.actionNavigateNewsFragment
          else -> throw IllegalStateException("Invalid menu item.")
        }

        findNavControl()?.navigate(target)
        showNavigation(true)
        return@setOnNavigationItemSelectedListener true
      }
      menu.findItem(R.id.menuNews).isVisible = viewModel.newsEnabled()
    }
  }

  private fun setupBackPressed() {
    onBackPressedDispatcher.addCallback(this) {
      if (tutorialView.isVisible) {
        tutorialView.fadeOut()
        return@addCallback
      }
      findNavControl()?.run {
        when (currentDestination?.id) {
          R.id.discoverFragment,
          R.id.discoverMoviesFragment,
          R.id.followedShowsFragment,
          R.id.followedMoviesFragment,
          R.id.listsFragment,
          R.id.newsFragment,
          -> {
            bottomNavigationView.selectedItemId = R.id.menuProgress
          }
          else -> {
            remove()
            super.onBackPressed()
          }
        }
      }
    }
  }

  private fun setupTips() {
    tips.entries.forEach { (tip, view) ->
      view.visibleIf(!isTipShown(tip))
      view.onClick {
        it.gone()
        showTip(tip)
      }
    }
  }

  override fun showTip(tip: Tip) {
    tutorialView.showTip(tip)
    viewModel.setTipShown(tip)
  }

  override fun isTipShown(tip: Tip) = viewModel.isTipShown(tip)

  override fun hideNavigation(animate: Boolean) {
    bottomNavigationView.run {
      isEnabled = false
      isClickable = false
    }
    tips.values.forEach { it.gone() }
    snackbarHost.translationY = navigationHeight.toFloat()
    bottomNavigationWrapper.animate()
      .translationYBy(navigationHeightPad.toFloat())
      .setDuration(if (animate) NAVIGATION_TRANSITION_DURATION_MS else 0)
      .setInterpolator(decelerateInterpolator)
      .start()
  }

  override fun showNavigation(animate: Boolean) {
    bottomNavigationView.run {
      isEnabled = true
      isClickable = true
    }
    tips.entries.forEach { (tip, view) -> view.visibleIf(!isTipShown(tip)) }
    snackbarHost.translationY = 0F
    bottomNavigationWrapper.animate()
      .translationY(0F)
      .setDuration(if (animate) NAVIGATION_TRANSITION_DURATION_MS else 0)
      .setInterpolator(decelerateInterpolator)
      .start()
  }

  override fun openTab(@IdRes navigationId: Int) {
    bottomNavigationView.selectedItemId = navigationId
  }

  override fun openDiscoverTab() = openTab(R.id.menuDiscover)

  override fun setMode(mode: Mode, force: Boolean) {
    if (force || viewModel.getMode() != mode) {
      viewModel.setMode(mode)
      val target = when (bottomNavigationView.selectedItemId) {
        R.id.menuDiscover -> getMenuDiscoverAction()
        R.id.menuCollection -> getMenuCollectionAction()
        R.id.menuProgress -> getMenuProgressAction()
        R.id.menuNews -> R.id.actionNavigateNewsFragment
        else -> 0
      }
      if (target != 0) {
        findNavControl()?.navigate(target)
      }
    }
  }

  override fun getMode() = viewModel.getMode()

  override fun moviesEnabled() = viewModel.moviesEnabled()

  private fun render(uiState: MainUiState) {
    uiState.run {
      isInitialRun?.let {
        if (it.consume() == true) {
          viewModel.checkInitialLanguage()
        }
      }
      showWhatsNew?.let {
        if (it.consume() == true) showWhatsNewDialog()
      }
      showRateApp?.let {
        if (it.consume() == true) {
          launchInAppReview()
          Analytics.logInAppRateDisplayed()
        }
      }
      initialLanguage?.let { event ->
        event.consume()?.let {
          showWelcomeDialog(it)
        }
      }
    }
  }

  private fun showWelcomeDialog(language: AppLanguage) {
    openTab(R.id.menuDiscover)
    with(welcomeView) {
      setLanguage(language)
      fadeIn()
      onOkClickListener = {
        fadeOut()
        welcomeViewMask.gone()
        if (language != AppLanguage.ENGLISH) {
          showWelcomeLanguageDialog(language)
        }
      }
    }
    with(welcomeViewMask) {
      fadeIn()
      onClick { /* NOOP */ }
    }
  }

  private fun showWelcomeLanguageDialog(language: AppLanguage) {
    with(welcomeLanguageView) {
      setLanguage(language)
      fadeIn()
      onYesClick = {
        viewModel.setLanguage(language)
        fadeOut()
        welcomeViewMask.fadeOut()
        postDelayed(
          {
            try {
              ProcessPhoenix.triggerRebirth(applicationContext)
            } catch (error: Throwable) {
              Runtime.getRuntime().exit(0)
            }
          },
          300
        )
      }
      onNoClick = {
        fadeOut()
        welcomeViewMask.fadeOut()
      }
    }
    welcomeViewMask.visible()
  }

  private fun launchInAppReview() {
    val manager = ReviewManagerFactory.create(applicationContext)
    val request = manager.requestReviewFlow()
    request.addOnCompleteListener {
      if (it.isSuccessful) {
        val flow = manager.launchReviewFlow(this@MainActivity, it.result)
        flow.addOnCompleteListener { viewModel.completeAppRate() }
      }
    }
  }

  override fun onSaveInstanceState(outState: Bundle) {
    outState.putBoolean(ARG_NAVIGATION_VISIBLE, bottomNavigationWrapper.translationY == 0F)
    super.onSaveInstanceState(outState)
  }

  private fun restoreState(savedInstanceState: Bundle?) {
    val isNavigationVisible = savedInstanceState?.getBoolean(ARG_NAVIGATION_VISIBLE, true) ?: true
    if (!isNavigationVisible) hideNavigation(true)
  }

  private fun doForFragments(action: (Fragment) -> Unit) {
    findNavControl()?.currentDestination?.id?.let {
      val navHost = supportFragmentManager.findFragmentById(R.id.navigationHost)
      navHost?.childFragmentManager?.primaryNavigationFragment?.let { action(it) }
    }
  }

  override fun onNetworkAvailableListener(isAvailable: Boolean) =
    runOnUiThread {
      statusView.visibleIf(!isAvailable)
      statusView.text = getString(R.string.errorNoInternetConnection)
    }

  override fun onNewEvent(event: Event) {
    runOnUiThread {
      when (event) {
        is ShowsMoviesSyncComplete -> {
          if (event.count > 0) {
            doForFragments { (it as? OnShowsMoviesSyncedListener)?.onShowsMoviesSyncFinished() }
          }
          viewModel.refreshAnnouncements()
        }
        is TraktSyncSuccess -> {
          doForFragments { (it as? OnTraktSyncListener)?.onTraktSyncComplete() }
        }
        is TraktSyncError -> {
          doForFragments { (it as? OnTraktSyncListener)?.onTraktSyncComplete() }
        }
        is TraktSyncProgress -> {
          doForFragments { (it as? OnTraktSyncListener)?.onTraktSyncProgress() }
        }
        is TraktQuickSyncSuccess -> {
          val text = resources.getQuantityString(R.plurals.textTraktQuickSyncComplete, event.count, event.count)
          provideSnackbarLayout().showInfoSnackbar(text)
        }
        else -> Timber.d("Event ignored. Noop.")
      }
    }
  }

  private fun handleAppShortcut(intent: Intent?) {
    when {
      intent == null -> return
      intent.extras?.containsKey("extraShortcutProgress") == true ->
        bottomNavigationView.selectedItemId = R.id.menuProgress
      intent.extras?.containsKey("extraShortcutDiscover") == true ->
        bottomNavigationView.selectedItemId = R.id.menuDiscover
      intent.extras?.containsKey("extraShortcutCollection") == true ->
        bottomNavigationView.selectedItemId = R.id.menuCollection
      intent.extras?.containsKey("extraShortcutSearch") == true -> {
        bottomNavigationView.selectedItemId = R.id.menuDiscover
        val action = when (viewModel.getMode()) {
          SHOWS -> R.id.actionDiscoverFragmentToSearchFragment
          MOVIES -> R.id.actionDiscoverMoviesFragmentToSearchFragment
          else -> throw IllegalStateException()
        }
        findNavControl()?.navigate(action)
      }
    }
  }

  private fun showWhatsNewDialog() {
    MaterialAlertDialogBuilder(this, R.style.AlertDialog)
      .setBackground(ContextCompat.getDrawable(this, R.drawable.bg_dialog))
      .setView(WhatsNewView(this))
      .setCancelable(false)
      .setPositiveButton(R.string.textClose) { _, _ -> }
      .setNeutralButton("Twitter") { _, _ -> openWebUrl(Config.TWITTER_URL) }
      .show()
  }

  private fun getMenuDiscoverAction() = when (viewModel.getMode()) {
    SHOWS -> R.id.actionNavigateDiscoverFragment
    MOVIES -> R.id.actionNavigateDiscoverMoviesFragment
    else -> throw IllegalStateException()
  }

  private fun getMenuCollectionAction() = when (viewModel.getMode()) {
    SHOWS -> R.id.actionNavigateFollowedShowsFragment
    MOVIES -> R.id.actionNavigateFollowedMoviesFragment
    else -> throw IllegalStateException()
  }

  private fun getMenuProgressAction() = when (viewModel.getMode()) {
    SHOWS -> R.id.actionNavigateProgressFragment
    MOVIES -> R.id.actionNavigateProgressMoviesFragment
    else -> throw IllegalStateException()
  }

  override fun onUpdateDownloaded(appUpdateManager: AppUpdateManager) {
    provideSnackbarLayout().showInfoSnackbar(getString(R.string.textUpdateDownloaded), R.string.textUpdateInstall, LENGTH_INDEFINITE) {
      Analytics.logInAppUpdate(
        BuildConfig.VERSION_NAME,
        BuildConfig.VERSION_CODE.toLong()
      )
      appUpdateManager.completeUpdate()
    }
  }

  override fun findNavControl() = findNavHostFragment()?.findNavController()

  override fun provideSnackbarLayout(): ViewGroup = snackbarHost
}
