package com.haroldadmin.moonshot.features.nextLaunch.di

import com.squareup.inject.assisted.dagger2.AssistedModule
import dagger.Module

@AssistedModule
@Module(includes = [AssistedInject_NextLaunchModule::class])
interface NextLaunchModule