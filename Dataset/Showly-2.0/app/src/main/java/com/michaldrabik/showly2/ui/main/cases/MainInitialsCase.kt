package com.michaldrabik.showly2.ui.main.cases

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import android.telephony.TelephonyManager
import androidx.core.content.edit
import androidx.core.os.LocaleListCompat
import com.google.firebase.ktx.Firebase
import com.google.firebase.messaging.FirebaseMessaging
import com.google.firebase.remoteconfig.ktx.remoteConfig
import com.michaldrabik.common.Config
import com.michaldrabik.repository.RatingsRepository
import com.michaldrabik.repository.SettingsRepository
import com.michaldrabik.repository.UserTraktManager
import com.michaldrabik.showly2.BuildConfig
import com.michaldrabik.ui_base.Logger
import com.michaldrabik.ui_base.common.AppCountry
import com.michaldrabik.ui_base.fcm.NotificationChannel
import com.michaldrabik.ui_settings.helpers.AppLanguage
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.supervisorScope
import timber.log.Timber
import java.util.Locale
import javax.inject.Inject
import javax.inject.Named

@ViewModelScoped
class MainInitialsCase @Inject constructor(
  @ApplicationContext private val context: Context,
  private val userTraktManager: UserTraktManager,
  private val ratingsRepository: RatingsRepository,
  private val settingsRepository: SettingsRepository,
  @Named("miscPreferences") private var miscPreferences: SharedPreferences,
) {

  suspend fun setInitialRun(value: Boolean) {
    val settings = settingsRepository.load()
    settings.let {
      settingsRepository.update(it.copy(isInitialRun = value))
    }
  }

  suspend fun isInitialRun(): Boolean {
    val settings = settingsRepository.load()
    return settings.isInitialRun
  }

  @SuppressLint("NewApi")
  suspend fun initializeFcm() {
    FirebaseMessaging.getInstance().run {
      val isEnabled = settingsRepository.load().pushNotificationsEnabled
      val suffix = if (BuildConfig.DEBUG) "-debug" else ""
      if (isEnabled) {
        subscribeToTopic(NotificationChannel.GENERAL_INFO.topicName + suffix)
        subscribeToTopic(NotificationChannel.SHOWS_INFO.topicName + suffix)
      } else {
        unsubscribeFromTopic(NotificationChannel.GENERAL_INFO.topicName + suffix)
        unsubscribeFromTopic(NotificationChannel.SHOWS_INFO.topicName + suffix)
      }
    }
  }

  fun setInitialCountry() {
    var country = (context.getSystemService(Context.TELEPHONY_SERVICE) as? TelephonyManager)?.simCountryIso
    if (country == null) {
      val locale = LocaleListCompat.getAdjustedDefault()
      country = if (locale.size() > 1) {
        locale.get(1).country
      } else {
        locale.get(0).country
      }
    }
    if (!country.isNullOrBlank()) {
      AppCountry.values().forEach { appCountry ->
        if (appCountry.code.equals(country, ignoreCase = true)) {
          settingsRepository.country = appCountry.code
          return
        }
      }
    }
  }

  fun setLanguage(appLanguage: AppLanguage) {
    settingsRepository.language = appLanguage.code
  }

  fun checkInitialLanguage(): AppLanguage {
    val locale = LocaleListCompat.getAdjustedDefault()
    if (locale.size() == 1 && !locale[0].language.equals(Locale("en").language)) {
      AppLanguage.values().forEach { appLanguage ->
        if (appLanguage.code.equals(locale[0].language, ignoreCase = true)) {
          return appLanguage
        }
      }
    }
    if (locale.size() > 1 && !locale[1].language.equals(Locale("en").language)) {
      AppLanguage.values().forEach { appLanguage ->
        if (appLanguage.code.equals(locale[1].language, ignoreCase = true)) {
          return appLanguage
        }
      }
    }

    return AppLanguage.ENGLISH
  }

  suspend fun preloadRatings() = supervisorScope {
    try {
      if (!userTraktManager.isAuthorized()) return@supervisorScope
      val token = userTraktManager.checkAuthorization().token

      awaitAll(
        async { ratingsRepository.shows.preloadShowsRatings(token) },
        async { ratingsRepository.shows.preloadEpisodesRatings(token) },
        async {
          if (settingsRepository.isMoviesEnabled) {
            ratingsRepository.movies.preloadMoviesRatings(token)
          }
        }
      )
    } catch (error: Throwable) {
      Logger.record(error, "Source" to "MainInitialsCase::initRatings()")
    }
  }

  fun loadRemoteConfig() {
    Firebase.remoteConfig.fetchAndActivate().addOnCompleteListener { task ->
      if (task.isSuccessful) {
        val updated = task.result
        Timber.d("Remote Config params updated: $updated")
      } else {
        Timber.e("Remote Config fetch failed!")
      }
    }
  }

  fun showWhatsNew(isInitialRun: Boolean): Boolean {
    val keyAppVersion = "APP_VERSION"
    val keyAppVersionName = "APP_VERSION_NAME"

    val version = miscPreferences.getInt(keyAppVersion, 0)
    val name = miscPreferences.getString(keyAppVersionName, "")

    fun isPatchUpdate(): Boolean {
      if (name.isNullOrBlank()) return false

      val major = name.split(".").getOrNull(0)?.toIntOrNull()
      val minor = name.split(".").getOrNull(1)?.toIntOrNull()

      val currentMajor = BuildConfig.VERSION_NAME.split(".").getOrNull(0)?.toIntOrNull()
      val currentMinor = BuildConfig.VERSION_NAME.split(".").getOrNull(1)?.toIntOrNull()

      if (major == currentMajor && minor == currentMinor) return true
      return false
    }

    miscPreferences.edit {
      putInt(keyAppVersion, BuildConfig.VERSION_CODE).apply()
      putString(keyAppVersionName, BuildConfig.VERSION_NAME).apply()
    }

    if (Config.SHOW_WHATS_NEW &&
      BuildConfig.VERSION_CODE > version &&
      BuildConfig.VERSION_NAME != name &&
      !isInitialRun &&
      !isPatchUpdate()
    ) {
      return true
    }
    return false
  }
}
