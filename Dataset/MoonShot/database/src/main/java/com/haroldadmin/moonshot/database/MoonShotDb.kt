package com.haroldadmin.moonshot.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.haroldadmin.moonshot.models.ApplicationInfo
import com.haroldadmin.moonshot.models.Capsule
import com.haroldadmin.moonshot.models.CompanyInfo
import com.haroldadmin.moonshot.models.Core
import com.haroldadmin.moonshot.models.Dragon
import com.haroldadmin.moonshot.models.HistoricalEvent
import com.haroldadmin.moonshot.models.LandingPad
import com.haroldadmin.moonshot.models.LaunchPad
import com.haroldadmin.moonshot.models.Mission
import com.haroldadmin.moonshot.models.NotificationRecord
import com.haroldadmin.moonshot.models.launch.Launch
import com.haroldadmin.moonshot.models.Rocket

@Database(
    entities = [
        Launch::class,
        Capsule::class,
        CompanyInfo::class,
        Core::class,
        Dragon::class,
        HistoricalEvent::class,
        LandingPad::class,
        LaunchPad::class,
        Rocket::class,
        ApplicationInfo::class,
        Mission::class,
        NotificationRecord::class
    ], version = 5, exportSchema = false
)
@TypeConverters(Converters::class)
abstract class MoonShotDb : RoomDatabase() {

    abstract fun launchDao(): LaunchDao
    abstract fun rocketsDao(): RocketsDao
    abstract fun launchPadDao(): LaunchPadDao
    abstract fun applicationInfoDao(): ApplicationInfoDao
    abstract fun missionDao(): MissionDao
    abstract fun notificationRecordDao(): NotificationRecordDao
}