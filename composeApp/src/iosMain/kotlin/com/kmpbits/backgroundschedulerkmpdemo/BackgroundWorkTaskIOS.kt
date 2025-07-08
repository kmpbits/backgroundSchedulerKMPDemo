package com.kmpbits.backgroundschedulerkmpdemo

import com.kmpbits.backgroundschedulerkmpdemo.utils.Constants
import kotlinx.cinterop.ExperimentalForeignApi
import platform.BackgroundTasks.BGAppRefreshTask
import platform.BackgroundTasks.BGAppRefreshTaskRequest
import platform.BackgroundTasks.BGTaskScheduler
import platform.Foundation.NSDate
import platform.Foundation.dateByAddingTimeInterval

fun registerTask() {
    BGTaskScheduler.sharedScheduler.registerForTaskWithIdentifier(
        identifier = Constants.TASK_IDENTIFIER,
        usingQueue = null
    ) { task ->
        // Call the function to do the work on background
        printLog("iOS App Refresh Task")

        // Then call the function to schedule the task again
        scheduleAppRefreshTask()
        (task as? BGAppRefreshTask)?.setTaskCompletedWithSuccess(true)
    }
}

@OptIn(ExperimentalForeignApi::class)
private fun scheduleAppRefreshTask() {
    val request = BGAppRefreshTaskRequest(identifier = Constants.TASK_IDENTIFIER)
    request.earliestBeginDate = NSDate().dateByAddingTimeInterval(Constants.TASK_TIMER_SECONDS.toDouble())
    BGTaskScheduler.sharedScheduler.submitTaskRequest(request, null)
}