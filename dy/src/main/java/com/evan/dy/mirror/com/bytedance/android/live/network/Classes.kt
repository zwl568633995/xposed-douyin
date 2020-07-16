package com.evan.dy.mirror.com.bytedance.android.live.network

import com.ehook.HookGlobal.classLoader
import com.ehook.HookGlobal.lazy
import com.ehook.helper.ReflecterHelper.findClassIfExists
import com.evan.dy.mirror.PackageUtils

object Classes {
    private val packageName = PackageUtils.getPath(javaClass)
    val ClassLiveNetworkC: Class<*> by lazy("${javaClass.name}.ClassLiveNetworkC") {
       findClassIfExists("$packageName.c", classLoader!!)
    }
}

