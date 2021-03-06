package com.chesire.nekome

import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.chesire.nekome.database.dao.SeriesDao
import com.chesire.nekome.database.dao.UserDao
import com.chesire.nekome.datasource.auth.local.AuthProvider
import com.chesire.nekome.helpers.createTestUser
import com.chesire.nekome.helpers.login
import com.chesire.nekome.helpers.logout
import com.schibsted.spain.barista.rule.cleardata.ClearDatabaseRule
import com.schibsted.spain.barista.rule.cleardata.ClearPreferencesRule
import dagger.hilt.android.testing.HiltAndroidRule
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import javax.inject.Inject

/**
 * Provides a base class to use for all UI tests.
 */
@RunWith(AndroidJUnit4::class)
abstract class UITest : SensorConditionsTest() {

    @Suppress("LeakingThis")
    @get:Rule
    val hilt = HiltAndroidRule(this)

    @get:Rule
    val clearDatabase = ClearDatabaseRule()

    @get:Rule
    val clearPreferences = ClearPreferencesRule()

    @Inject
    lateinit var authProvider: AuthProvider

    @Inject
    lateinit var series: SeriesDao

    @Inject
    lateinit var user: UserDao

    /**
     * Flag for if the test should start with a logged in user.
     * Defaults to `true`, override to force the user to be logged out.
     */
    open val startLoggedIn: Boolean = true

    /**
     * Initial setup method.
     */
    @Before
    open fun setUp() {
        hilt.inject()

        if (startLoggedIn) {
            authProvider.login()
            user.createTestUser()
        } else {
            authProvider.logout()
        }
    }

    /**
     * Launches the [Activity] using the [ActivityScenario].
     */
    protected fun launchActivity() {
        ActivityScenario.launch(Activity::class.java)
    }
}
