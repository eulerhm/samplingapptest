package com.haroldadmin.moonshot.features.nextLaunch

import androidx.lifecycle.viewModelScope
import com.haroldadmin.moonshot.base.MoonShotViewModel
import com.haroldadmin.moonshotRepository.launch.GetNextLaunchUseCase
import com.squareup.inject.assisted.Assisted
import com.squareup.inject.assisted.AssistedInject
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

@ExperimentalCoroutinesApi
class NextLaunchViewModel @AssistedInject constructor(
    @Assisted initState: NextLaunchState,
    private val nextLaunchUseCase: GetNextLaunchUseCase
) : MoonShotViewModel<NextLaunchState>(initState) {

    init {
        getNextLaunch()
    }

    fun getNextLaunch() = viewModelScope.launch {
        nextLaunchUseCase
            .getNextLaunch()
            .collect { nextLaunchRes ->
                setState { copy(nextLaunchResource = nextLaunchRes) }
            }
    }

    @AssistedInject.Factory
    interface Factory {
        fun create(initState: NextLaunchState): NextLaunchViewModel
    }
}
