package com.haroldadmin.moonshot.features.launchPad.di

import com.squareup.inject.assisted.dagger2.AssistedModule
import dagger.Module

@AssistedModule
@Module(includes = [AssistedInject_LaunchPadModule::class])
interface LaunchPadModule
