package io.github.omisie11.spacexfollower.data

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.room.Room
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import io.github.omisie11.spacexfollower.SensorConditionsTest
import io.github.omisie11.spacexfollower.data.local.SpaceDatabase
import io.github.omisie11.spacexfollower.data.local.dao.CompanyDao
import io.github.omisie11.spacexfollower.testCompanyInfo
import io.github.omisie11.spacexfollower.utilities.getValue
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class CompanyDaoTest: SensorConditionsTest() {

    private lateinit var database: SpaceDatabase
    private lateinit var companyDao: CompanyDao

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Before
    fun createDb() {
        val context = InstrumentationRegistry.getInstrumentation().targetContext
        database = Room.inMemoryDatabaseBuilder(context, SpaceDatabase::class.java).build()
        companyDao = database.companyDao()

        companyDao.insertCompanyInfo(testCompanyInfo)
    }

    @After
    fun closeDb() {
        database.close()
    }

    @Test
    fun testGetCompanyInfo() {
        val companyData = getValue(companyDao.getCompanyInfo())
        assert(companyData == testCompanyInfo)
    }
}
