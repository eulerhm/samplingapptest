package com.haroldadmin.moonshot.features.rockets

import com.haroldadmin.moonshot.base.MoonShotState
import com.haroldadmin.moonshot.core.Resource
import com.haroldadmin.moonshot.models.Rocket

data class RocketsState(
    val rockets: Resource<List<Rocket>> = Resource.Uninitialized
) : MoonShotState