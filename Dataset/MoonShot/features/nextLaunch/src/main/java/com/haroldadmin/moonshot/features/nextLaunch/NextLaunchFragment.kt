package com.haroldadmin.moonshot.features.nextLaunch

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.airbnb.epoxy.EpoxyController
import com.haroldadmin.moonshot.MainViewModel
import com.haroldadmin.moonshot.base.ComplexMoonShotFragment
import com.haroldadmin.moonshot.base.asyncController
import com.haroldadmin.moonshot.base.layoutAnimation
import com.haroldadmin.moonshot.core.Resource
import com.haroldadmin.moonshot.core.invoke
import com.haroldadmin.moonshot.di.appComponent
import com.haroldadmin.moonshot.features.nextLaunch.di.DaggerNextLaunchComponent
import com.haroldadmin.moonshot.models.DatePrecision
import com.haroldadmin.moonshot.models.launch.Launch
import com.haroldadmin.moonshot.features.nextLaunch.databinding.FragmentNextLaunchBinding
import com.haroldadmin.moonshot.utils.formatDate
import com.haroldadmin.moonshot.views.errorView
import com.haroldadmin.moonshot.views.launchCard
import com.haroldadmin.moonshot.views.detailCard
import com.haroldadmin.vector.activityViewModel
import com.haroldadmin.vector.fragmentViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import java.util.Date
import javax.inject.Inject
import com.haroldadmin.moonshot.R as appR

@ExperimentalCoroutinesApi
class NextLaunchFragment : ComplexMoonShotFragment<NextLaunchViewModel, NextLaunchState>() {

    private var _binding: FragmentNextLaunchBinding? = null
    private val binding: FragmentNextLaunchBinding
        get() = _binding!!

    @Inject
    lateinit var viewModelFactory: NextLaunchViewModel.Factory
    @Inject
    lateinit var mainViewModelFactory: MainViewModel.Factory

    private val mainViewModel: MainViewModel by activityViewModel { initState, savedStateHandle ->
        mainViewModelFactory.create(initState, savedStateHandle)
    }

    override val viewModel: NextLaunchViewModel by fragmentViewModel { initState, _ ->
        viewModelFactory.create(initState)
    }

    override fun initDI() {
        DaggerNextLaunchComponent.builder()
            .appComponent(appComponent())
            .build()
            .inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentNextLaunchBinding.inflate(inflater, container, false)

        mainViewModel.setTitle(getString(appR.string.title_next_launch))

        binding.rvNextLaunch.apply {
            setController(epoxyController)
            layoutAnimation = layoutAnimation(appR.anim.layout_animation_fade_in)
        }

        binding.swipeRefreshLayout.setOnRefreshListener {
            viewModel.getNextLaunch()
        }

        return binding.root
    }

    override fun renderer(state: NextLaunchState) {
        binding.swipeRefreshLayout.isRefreshing = !state.nextLaunchResource.isComplete
        // TODO Change this to [com.airbnb.epoxy.EpoxyController.requestModelBuild]
        epoxyController.setData(state)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun epoxyController() = asyncController(viewModel) { state ->
        when (val launch = state.nextLaunchResource) {

            is Resource.Success -> {
                buildLaunchModels(launch())
                countdownView {
                    id("launch-countdown")
                    launchResource(launch)
                }
            }

            is Resource.Error<Launch, *> -> {
                errorView {
                    id("next-launch-error")
                    errorText(getString(R.string.fragmentNextLaunchErrorMessage))
                }
                launch()?.let {
                    buildLaunchModels(it)
                    countdownView {
                        id("launch-countdown")
                        launchResource(launch)
                    }
                }
            }
        }
    }

    private fun showLaunchDetails(flightNumber: Int) {
        NextLaunchFragmentDirections.launchDetails(
            flightNumber
        ).let { action ->
            findNavController().navigate(action)
        }
    }

    private fun EpoxyController.buildLaunchModels(launch: Launch) {
        launchCard {
            id(launch.flightNumber)
            launch(launch)
            header(getString(R.string.fragmentNextLaunchNextLaunchHeaderText))
            onLaunchClick { _ -> showLaunchDetails(launch.flightNumber) }
        }

        detailCard {
            id("launch-date")
            header(getString(R.string.fragmentNextLaunchDateHeader))
            content(formatDate(launch.launchDateUtc, launch.tentativeMaxPrecision))
            icon(appR.drawable.ic_round_date_range_24px)
        }

        detailCard {
            id("launch-site")
            header(getString(R.string.fragmentNextLaunchLaunchSiteHeader))
            content(launch.launchSite?.siteNameLong ?: getString(R.string.siteUnknownText))
            icon(appR.drawable.ic_round_place_24px)
            onDetailClick { _ ->
                launch.launchSite?.siteId?.let { id ->
                    val action =
                        NextLaunchFragmentDirections.launchPadDetails(
                            id
                        )
                    findNavController().navigate(action)
                }
            }
        }
    }

    private fun formatDate(date: Date, precision: DatePrecision): String {
        return requireContext().formatDate(date, precision.dateFormat)
    }
}
