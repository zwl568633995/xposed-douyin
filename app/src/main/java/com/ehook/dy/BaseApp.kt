package com.ehook.dy

import android.app.Application

class BaseApp : Application() {
    override fun onCreate() {
        super.onCreate()
//        if (BuildConfig.DEBUG) {
//            CmdUtil.killProcesses(this, "com.tencent.mm")
//            CmdUtil.killProcesses(this, "com.tencent.mm")
//        }
    }
}
