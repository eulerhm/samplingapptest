package com.haroldadmin.moonshot.features.about

import com.haroldadmin.moonshot.BuildConfig

data class AboutState(
    val versionCode: Int = BuildConfig.VERSION_CODE,
    val versionName: String = BuildConfig.VERSION_NAME
)