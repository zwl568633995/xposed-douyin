package com.evan.dy.mirror.com.bytedance.android.livesdk.gift.platform.core.api

import com.ehook.HookGlobal.classLoader
import com.ehook.HookGlobal.lazy
import com.ehook.helper.ReflecterHelper.findClassIfExists
import com.evan.dy.mirror.PackageUtils

object Classes {
    private val packageName = PackageUtils.getPath(javaClass)
    val ClassGiftRetrofitApi: Class<*> by lazy("${javaClass.name}.ClassGiftRetrofitApi") {
       findClassIfExists("$packageName.GiftRetrofitApi", classLoader!!)
    }
}

