package com.evan.dy.interfaces

import android.content.Context

interface IApplicationHook {
    fun attachBaseContext(context: Context) {}
    fun onCreate() {}
}
