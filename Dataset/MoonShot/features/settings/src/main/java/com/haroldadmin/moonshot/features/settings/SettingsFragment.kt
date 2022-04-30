package com.haroldadmin.moonshot.features.settings

import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.content.ContextCompat
import androidx.preference.ListPreference
import androidx.preference.PreferenceFragmentCompat
import androidx.preference.SeekBarPreference
import androidx.preference.SwitchPreferenceCompat
import com.google.android.material.snackbar.Snackbar
import com.haroldadmin.moonshot.KEY_CRASH_REPORTS
import com.haroldadmin.moonshot.KEY_THEME_MODE
import com.haroldadmin.moonshot.THEME_MAPPINGS
import com.haroldadmin.moonshot.di.appComponent
import com.haroldadmin.moonshot.notifications.MoonShotNotificationManager
import com.haroldadmin.moonshot.notifications.NotificationConstants.JustBeforeLaunch
import com.haroldadmin.moonshot.notifications.NotificationConstants.DayBeforeLaunch
import com.haroldadmin.moonshot.sync.SyncManager
import com.haroldadmin.moonshot.utils.log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Named
import kotlin.coroutines.CoroutineContext
import com.haroldadmin.moonshot.R as appR

class SettingsFragment : PreferenceFragmentCompat(), CoroutineScope {

    private val job = Job()
    override val coroutineContext: CoroutineContext = Dispatchers.Main + job

    @Inject
    lateinit var launchNotificationsManager: MoonShotNotificationManager

    @Inject
    lateinit var syncManager: SyncManager

    @Inject
    @Named("settings")
    lateinit var settings: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        DaggerSettingsComponent.factory()
            .create(appComponent(), requireContext())
            .inject(this)
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.setBackgroundColor(ContextCompat.getColor(requireContext(), appR.color.colorSurface))
    }

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preferences, rootKey)

        findPreference<SwitchPreferenceCompat>(JustBeforeLaunch.settingsKey)?.setOnPreferenceChangeListener { _, isEnabled ->
            if (isEnabled !is Boolean) return@setOnPreferenceChangeListener false

            if (isEnabled) {
                launchNotificationsManager.enableNotifications()
            } else {
                val dayBeforeLaunchNotificationsEnabled = settings.getBoolean(DayBeforeLaunch.settingsKey, true)
                if (!dayBeforeLaunchNotificationsEnabled) {
                    launchNotificationsManager.disableAllNotifications()
                }
            }
            true
        }

        findPreference<SeekBarPreference>(JustBeforeLaunch.paddingKey)?.setOnPreferenceChangeListener { _, newValue ->
            if (newValue !is Int) return@setOnPreferenceChangeListener false
            log("Setting launch notification padding to $newValue minutes")
            true
        }

        findPreference<SwitchPreferenceCompat>(DayBeforeLaunch.settingsKey)?.setOnPreferenceChangeListener { _, isEnabled ->
            if (isEnabled !is Boolean) return@setOnPreferenceChangeListener false

            if (isEnabled) {
                launchNotificationsManager.enableNotifications()
            } else {
                val justBeforeLaunchNotificationsEnabled = settings.getBoolean(JustBeforeLaunch.settingsKey, true)
                if (!justBeforeLaunchNotificationsEnabled) {
                    launchNotificationsManager.disableAllNotifications()
                }
            }
            true
        }

        findPreference<ListPreference>(KEY_THEME_MODE)?.setOnPreferenceChangeListener { _, newValue ->
            val newTheme = THEME_MAPPINGS[newValue]
            if (newTheme != null) {
                AppCompatDelegate.setDefaultNightMode(newTheme)
                true
            } else {
                false
            }
        }

        findPreference<SwitchPreferenceCompat>(KEY_CRASH_REPORTS)?.setOnPreferenceChangeListener { _, _ ->
            view?.let { rootView ->
                Snackbar.make(
                    rootView,
                    R.string.preferencesCrashReportRestartMessage,
                    Snackbar.LENGTH_SHORT
                )
                    .setAction("Restart") {
                        activity?.recreate()
                    }
                    .show()
            }
            true
        }

        findPreference<SwitchPreferenceCompat>(SyncManager.KEY_BACKGROUND_SYNC)?.setOnPreferenceChangeListener { _, newValue ->
            if (newValue == true) {
                launch { syncManager.enableSync() }
            } else {
                launch { syncManager.disableSync() }
            }
            true
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        job.cancel()
    }
}