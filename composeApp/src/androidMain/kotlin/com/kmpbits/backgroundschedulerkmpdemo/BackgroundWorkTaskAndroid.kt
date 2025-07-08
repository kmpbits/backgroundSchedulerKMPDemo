package com.kmpbits.backgroundschedulerkmpdemo

import android.content.Context
import androidx.work.Constraints
import androidx.work.ExistingPeriodicWorkPolicy
import androidx.work.ExistingWorkPolicy
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.kmpbits.backgroundschedulerkmpdemo.utils.Constants
import java.util.concurrent.TimeUnit

class PrintLogWorker(
    context: Context,
    workerParameters: WorkerParameters
) : Worker(context, workerParameters) {

    override fun doWork(): Result {
        printLog("Android App Refresh Task")

        return Result.success()
    }
}

fun initWorker(context: Context) {
    val workManagerBuilder = PeriodicWorkRequestBuilder<PrintLogWorker>(
        repeatInterval = Constants.TASK_TIMER_SECONDS.toLong(),
        repeatIntervalTimeUnit = TimeUnit.MINUTES
    )
        // Optional: Set constraints for the worker
        .setConstraints(
            Constraints.Builder()
                .setRequiresBatteryNotLow(true)
                .build()
        )

    WorkManager.getInstance(context).enqueueUniquePeriodicWork(
        uniqueWorkName = Constants.TASK_IDENTIFIER,
        existingPeriodicWorkPolicy = ExistingPeriodicWorkPolicy.KEEP,
        request = workManagerBuilder.build()
    )
}