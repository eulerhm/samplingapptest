package com.haroldadmin.moonshotRepository.launches

import com.haroldadmin.moonshot.database.LaunchDao
import com.haroldadmin.moonshot.models.SampleDbData
import com.haroldadmin.moonshot.models.launch.Launch
import com.haroldadmin.moonshot.models.launch.LaunchPictures
import java.util.Date

internal class FakeLaunchesDao : LaunchDao() {

    /**
     * Signals whether [synchronizeBlocking] was called
     */
    var didSynchronize: Boolean = false

    /**
     * Signals the value of the offset parameter of the last database query
     */
    var lastCallOffset: Int = 0

    override suspend fun details(flightNumber: Int): Launch? {
        return SampleDbData.Launches.one(flightNumber)
    }

    override suspend fun all(limit: Int, offset: Int): List<Launch> {
        this.lastCallOffset = offset
        return SampleDbData.Launches
            .many()
            .take(limit)
            .drop(offset)
            .toList()
    }

    override suspend fun upcoming(limit: Int, offset: Int): List<Launch> {
        this.lastCallOffset = offset
        return SampleDbData.Launches
            .many(isUpcomingGenerator = { true })
            .take(limit)
            .drop(offset)
            .toList()
    }

    override suspend fun upcoming(until: Long, limit: Int, offset: Int): List<Launch> {
        this.lastCallOffset = offset
        return SampleDbData.Launches
            .many(
                isUpcomingGenerator = { true },
                launchDateGenerator = { Date(until) }
            )
            .take(limit)
            .drop(offset)
            .toList()
    }

    override suspend fun recent(limit: Int, offset: Int): List<Launch> {
        this.lastCallOffset = offset
        return SampleDbData.Launches
            .many(isUpcomingGenerator = { false })
            .take(limit)
            .drop(offset)
            .toList()
    }

    override suspend fun forLaunchPad(siteId: String, limit: Int, offset: Int): List<Launch> {
        this.lastCallOffset = offset
        return SampleDbData.Launches
            .many(siteIdGenerator = { siteId })
            .take(limit)
            .drop(offset)
            .toList()
    }

    override suspend fun forLaunchPad(siteId: String, isUpcoming: Boolean, limit: Int, offset: Int): List<Launch> {
        this.lastCallOffset = offset
        return SampleDbData.Launches
            .many(siteIdGenerator = { siteId }, isUpcomingGenerator = { isUpcoming })
            .take(limit)
            .drop(offset)
            .toList()
    }

    override suspend fun pictures(flightNumber: Int): LaunchPictures? {
        val images = SampleDbData.Launches.one(flightNumber).links!!.flickrImages
        return LaunchPictures(images)
    }

    override suspend fun forQuery(query: String, limit: Int, offset: Int): List<Launch> {
        this.lastCallOffset = offset
        return SampleDbData.Launches
            .many(missionNameGenerator = { query })
            .take(limit)
            .drop(offset)
            .toList()
    }

    override suspend fun next(): Launch? {
        return SampleDbData.Launches.one(isUpcoming = true)
    }

    override suspend fun clearTable() = Unit

    override suspend fun save(obj: Launch) = Unit

    override suspend fun saveAll(objs: List<Launch>) = Unit

    override suspend fun update(obj: Launch) = Unit

    override suspend fun updateAll(objs: List<Launch>) = Unit

    override suspend fun delete(obj: Launch) = Unit

    override suspend fun deleteAll(objs: List<Launch>) = Unit

    override fun synchronizeBlocking(allLaunches: List<Launch>) {
        didSynchronize = true
    }
}
