package com.haroldadmin.moonshot.features.launchPad.di

import com.haroldadmin.moonshot.base.di.FeatureScope
import com.haroldadmin.moonshot.base.di.MoonShotFragmentComponent
import com.haroldadmin.moonshot.di.AppComponent
import com.haroldadmin.moonshot.features.launchPad.LaunchPadFragment
import dagger.Component
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
@FeatureScope
@Component(modules = [LaunchPadModule::class], dependencies = [AppComponent::class])
interface LaunchPadComponent : MoonShotFragmentComponent<LaunchPadFragment>