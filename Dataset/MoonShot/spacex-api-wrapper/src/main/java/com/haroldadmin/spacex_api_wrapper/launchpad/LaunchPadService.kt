package com.haroldadmin.spacex_api_wrapper.launchpad

import com.haroldadmin.cnradapter.NetworkResponse
import com.haroldadmin.spacex_api_wrapper.common.ErrorResponse
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface LaunchPadService {

    @GET("launchpads")
    fun getAllLaunchPads(
        @Query("limit") limit: Int? = null
    ): Deferred<NetworkResponse<List<LaunchPad>, ErrorResponse>>

    @GET("launchpads/{siteId}")
    fun getLaunchPad(@Path("siteId") siteId: String): Deferred<NetworkResponse<LaunchPad, ErrorResponse>>
}