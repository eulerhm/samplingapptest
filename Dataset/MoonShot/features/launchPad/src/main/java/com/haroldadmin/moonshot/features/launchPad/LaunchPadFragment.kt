package com.haroldadmin.moonshot.features.launchPad

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.airbnb.epoxy.EpoxyController
import com.haroldadmin.moonshot.navigation.LaunchTypes
import com.haroldadmin.moonshot.MainViewModel
import com.haroldadmin.moonshot.base.ComplexMoonShotFragment
import com.haroldadmin.moonshot.base.asyncController
import com.haroldadmin.moonshot.base.layoutAnimation
import com.haroldadmin.moonshot.core.Resource
import com.haroldadmin.moonshot.core.invoke
import com.haroldadmin.moonshot.di.appComponent
import com.haroldadmin.moonshot.features.launchPad.databinding.FragmentLaunchpadBinding
import com.haroldadmin.moonshot.features.launchPad.di.DaggerLaunchPadComponent
import com.haroldadmin.moonshot.features.launchPad.views.mapCard
import com.haroldadmin.moonshot.models.LaunchPad
import com.haroldadmin.moonshot.models.successPercentage
import com.haroldadmin.moonshot.views.detailCard
import com.haroldadmin.moonshot.views.errorView
import com.haroldadmin.moonshot.views.expandableTextView
import com.haroldadmin.moonshot.views.loadingView
import com.haroldadmin.moonshot.views.sectionHeaderView
import com.haroldadmin.moonshot.views.textCard
import com.haroldadmin.vector.activityViewModel
import com.haroldadmin.vector.fragmentViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Inject
import com.haroldadmin.moonshot.R as appR

@ExperimentalCoroutinesApi
class LaunchPadFragment : ComplexMoonShotFragment<LaunchPadViewModel, LaunchPadState>() {

    private var _binding: FragmentLaunchpadBinding? = null
    private val binding: FragmentLaunchpadBinding
        get() = _binding!!

    @Inject
    lateinit var viewModelFactory: LaunchPadViewModel.Factory
    @Inject
    lateinit var mainViewModelFactory: MainViewModel.Factory

    override val viewModel: LaunchPadViewModel by fragmentViewModel { initState, _ ->
        viewModelFactory.create(initState)
    }

    private val mainViewModel: MainViewModel by activityViewModel { initState, savedStateHandle ->
        mainViewModelFactory.create(initState, savedStateHandle)
    }

    override fun initDI() {
        DaggerLaunchPadComponent.builder()
            .appComponent(appComponent())
            .build()
            .inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLaunchpadBinding.inflate(inflater, container, false)

        mainViewModel.setTitle(getString(appR.string.title_launchpad))

        binding.rvLaunchPad.apply {
            setController(epoxyController)
            layoutAnimation = layoutAnimation(appR.anim.layout_animation_fade_in)
            layoutManager = GridLayoutManager(requireContext(), 2)
        }

        return binding.root
    }

    override fun renderer(state: LaunchPadState) {
        epoxyController.setData(state)
        if (state.launchPad is Resource.Success) {
            mainViewModel.setTitle(state.launchPad.data.siteNameLong)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun epoxyController() = asyncController(viewModel) { state ->
        when (val launchpad = state.launchPad) {
            is Resource.Success -> buildLaunchPadModels(launchpad())
            is Resource.Error<LaunchPad, *> -> {

                errorView {
                    id("launchpad-error")
                    errorText(getString(R.string.fragmentLaunchPadLaunchPadErrorMessage))
                }

                launchpad()?.let { buildLaunchPadModels(it) }
            }
            is Resource.Loading -> loadingView {
                id("launchpad-loading")
                loadingText(getString(R.string.fragmentLaunchPadLaunchPadLoadingMessage))
            }
            else -> Unit
        }
    }

    private fun EpoxyController.buildLaunchPadModels(launchpad: LaunchPad) {
        detailCard {
            id("launch-pad")
            header(getString(R.string.fragmentLaunchPadLaunchPadHeader))
            content(launchpad.siteNameLong)
        }
        expandableTextView {
            id("launch-pad-detail")
            header(getString(R.string.fragmentLaunchPadDetailsHeader))
            content(launchpad.details)
        }
        textCard {
            id("status")
            header(getString(R.string.fragmentLaunchPadStatusHeader))
            content(launchpad.status.capitalize())
        }
        textCard {
            id("success-percentage")
            header("Success Rate")
            content(getString(R.string.successRateText, launchpad.successPercentage()))
            onTextClick { _ ->
                val action =
                    LaunchPadFragmentDirections.launchPadLaunches(
                        LaunchTypes.LAUNCHPAD,
                        launchpad.siteId
                    )
                findNavController().navigate(action)
            }
        }
        sectionHeaderView {
            id("map")
            header(getString(R.string.itemMapCardMapHeader))
        }
        mapCard {
            id("map")
            mapImageUrl(launchpad.location.getStaticMapUrl())
            onMapClick { _ ->
                val uri = Uri.parse("geo:${launchpad.location.latitude},${launchpad.location.longitude}")
                val mapIntent = Intent(Intent.ACTION_VIEW).apply { data = uri }
                startActivity(mapIntent)
            }
        }
    }
}