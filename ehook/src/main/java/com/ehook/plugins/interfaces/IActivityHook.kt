package com.ehook.plugins.interfaces

import android.app.Activity
import android.content.Intent
import android.os.Bundle

interface IActivityHook {

    fun onCreate(activity: Activity, savedInstanceState: Bundle?) {}
    fun onStart(activity: Activity) {}
    fun onResume(activity: Activity) {}
    fun onPause(activity: Activity) {}
    fun onStop(activity: Activity) {}
    fun onDestroy(activity: Activity) {}

}
