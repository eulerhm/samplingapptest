package com.haroldadmin.moonshotRepository.mappers

import com.haroldadmin.spacex_api_wrapper.rocket.Rocket
import com.haroldadmin.spacex_api_wrapper.rocket.FirstStage
import com.haroldadmin.spacex_api_wrapper.rocket.CompositeFairing
import com.haroldadmin.spacex_api_wrapper.rocket.Engines
import com.haroldadmin.spacex_api_wrapper.rocket.Payloads
import com.haroldadmin.spacex_api_wrapper.rocket.LandingLegs
import com.haroldadmin.spacex_api_wrapper.rocket.SecondStage
import com.haroldadmin.moonshot.models.Engine as DbEngine
import com.haroldadmin.moonshot.models.LandingLegs as DbLandingLegs
import com.haroldadmin.moonshot.models.Rocket as DbRocket
import com.haroldadmin.moonshot.models.FirstStage as DbFirstStage
import com.haroldadmin.moonshot.models.CompositeFairing as DbCompositeFairing
import com.haroldadmin.moonshot.models.Payloads as DbPayloads
import com.haroldadmin.moonshot.models.SecondStage as DbSecondStage

internal fun Rocket.toDbRocket(): DbRocket {
    return DbRocket(
        rocketId = this.rocketId,
        rocketName = this.rocketName,
        rocketType = this.rocketType,
        id = this.id.toLong(),
        active = this.active,
        stages = this.stages,
        boosters = this.boosters,
        costPerLaunch = this.costPerLaunch,
        successRatePercentage = this.successRate,
        firstFlight = this.firstFlight,
        country = this.country,
        company = this.company,
        height = this.height.toDbLength(),
        diameter = this.diameter.toDbLength(),
        mass = this.mass.toDbMass(),
        firstStage = this.firstStage.toDbFirstStage(),
        secondStage = this.secondStage.toDbSecondStage(),
        engines = this.engines.toDbEngine(),
        landingLegs = this.landingLegs.toDbLandingLegs(),
        wikipedia = this.wikipedia,
        description = this.description
    )
}

internal fun FirstStage.toDbFirstStage(): DbFirstStage {
    return DbFirstStage(
        reusable = this.reusable,
        engines = this.engines,
        fuelAmountTons = this.fuelAmountTons,
        burnTimeSec = this.burnTimeSecs,
        thrustSeaLevel = this.thrustSeaLevel.toDbThrust(),
        thrustVacuum = this.thrustVacuum.toDbThrust()
    )
}

internal fun CompositeFairing.toDbCompositeFairing(): DbCompositeFairing {
    return DbCompositeFairing(
        height = this.height.toDbLength(),
        diameter = this.diameter.toDbLength()
    )
}

internal fun Payloads.toDbPayloads(): DbPayloads {
    return DbPayloads(
        option1 = this.option1,
        option2 = this.option2,
        compositeFairing = this.compositeFairing.toDbCompositeFairing()
    )
}

internal fun SecondStage.toDbSecondStage(): DbSecondStage {
    return DbSecondStage(
        engines = this.engines,
        fuelAmountTons = this.fuelAmountTons,
        burnTimeSec = this.burnTimeSecs,
        thrust = this.thrust.toDbThrust(),
        payloads = this.payloads.toDbPayloads()
    )
}

internal fun Engines.toDbEngine(): DbEngine {
    return DbEngine(
        number = this.number,
        type = this.type,
        version = this.version,
        layout = this.layout,
        engineLossMax = this.engineLossMax,
        propellant1 = this.propellant1,
        propellant2 = this.propellant2,
        thrustSeaLevel = this.thrustSeaLevel.toDbThrust(),
        thrustVacuum = this.thrustVacuum.toDbThrust(),
        thrustToWeight = this.thrustToWeightRatio
    )
}

internal fun LandingLegs.toDbLandingLegs(): DbLandingLegs {
    return DbLandingLegs(
        number = this.number,
        material = this.material
    )
}
