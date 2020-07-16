package com.evan.dy.mirror.com.bytedance.android.livesdk.livecommerce.h

import com.ehook.HookGlobal.classLoader
import com.ehook.HookGlobal.lazy
import com.ehook.helper.ReflecterHelper.findClassIfExists
import com.evan.dy.mirror.PackageUtils

object Classes {
    private val packageName = PackageUtils.getPath(javaClass)
    val ClassLivesdkLivecommerceHA: Class<*> by lazy("${javaClass.name}.ClassLivesdkLivecommerceHA") {
       findClassIfExists("$packageName.a", classLoader!!)
    }
    val ClassLivesdkLivecommerceHB: Class<*> by lazy("${javaClass.name}.ClassLivesdkLivecommerceHB") {
       findClassIfExists("$packageName.b", classLoader!!)
    }
    val ClassLivesdkLivecommerceHC: Class<*> by lazy("${javaClass.name}.ClassLivesdkLivecommerceHC") {
       findClassIfExists("$packageName.c", classLoader!!)
    }
    val ClassLivesdkLivecommerceHD: Class<*> by lazy("${javaClass.name}.ClassLivesdkLivecommerceHD") {
       findClassIfExists("$packageName.d", classLoader!!)
    }
}

