package com.haroldadmin.moonshot

import android.content.Context
import android.content.SharedPreferences
import androidx.work.ListenableWorker
import androidx.work.WorkerFactory
import androidx.work.WorkerParameters
import com.haroldadmin.moonshot.notifications.AlarmScheduler
import com.haroldadmin.moonshot.notifications.AlarmSchedulingWorker
import com.haroldadmin.moonshot.sync.SyncWorker
import com.haroldadmin.moonshot.utils.log
import com.haroldadmin.moonshotRepository.SyncResourcesUseCase
import com.haroldadmin.moonshotRepository.launch.GetNextLaunchUseCase
import javax.inject.Inject
import javax.inject.Named

class MoonShotWorkerFactory @Inject constructor(
    private val syncResourcesUseCase: SyncResourcesUseCase,
    private val nextLaunchUseCase: GetNextLaunchUseCase,
    @Named("settings")
    private val settings: SharedPreferences,
    private val alarmScheduler: AlarmScheduler
) : WorkerFactory() {

    override fun createWorker(
        appContext: Context,
        workerClassName: String,
        workerParameters: WorkerParameters
    ): ListenableWorker? {

        return try {
            when (Class.forName(workerClassName)) {
                SyncWorker::class.java -> SyncWorker(
                    appContext,
                    workerParameters,
                    syncResourcesUseCase
                )
                AlarmSchedulingWorker::class.java -> AlarmSchedulingWorker(
                    appContext,
                    workerParameters,
                    nextLaunchUseCase,
                    settings,
                    alarmScheduler
                )
                else -> {
                    log(
                        """
                        Unknown worker class requested.
                        Class: $workerClassName
                        Parameters: $workerParameters
                        Context: $appContext
                        """.trimIndent()
                    )
                    null
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
            return null
        }
    }
}