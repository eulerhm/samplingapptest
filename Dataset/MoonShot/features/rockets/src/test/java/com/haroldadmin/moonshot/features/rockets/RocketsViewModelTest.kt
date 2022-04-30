package com.haroldadmin.moonshot.features.rockets

import com.haroldadmin.moonshot.core.Resource
import com.haroldadmin.moonshot.models.Rocket
import com.haroldadmin.moonshot.features.rockets.RocketsState
import com.haroldadmin.moonshot.features.rockets.RocketsViewModel
import com.haroldadmin.moonshotRepository.rocket.GetAllRocketsUseCase
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Before
import org.junit.Test

@ExperimentalCoroutinesApi
internal class RocketsViewModelTest {

    private val mainThreadSurrogate = newSingleThreadContext("Main Thread")
    private val rockets = flowOf(Resource.Success(listOf<Rocket>()))
    private val initialState =
        RocketsState()
    private val rocketsUseCase = mockk<GetAllRocketsUseCase> {
        coEvery { getAllRockets() } returns rockets
    }

    @Before
    fun setup() {
        Dispatchers.setMain(mainThreadSurrogate)
    }

    @After
    fun after() {
        Dispatchers.resetMain()
    }

    @Test
    fun givenRocketsViewModel_onInit_thenShouldFetchRockets() {
        RocketsViewModel(
            initState = initialState,
            allRocketsUseCase = rocketsUseCase
        )
        coVerify {
            rocketsUseCase.getAllRockets()
        }
    }
}