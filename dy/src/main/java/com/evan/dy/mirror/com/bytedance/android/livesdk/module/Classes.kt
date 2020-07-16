package com.evan.dy.mirror.com.bytedance.android.livesdk.module

import com.ehook.HookGlobal
import com.ehook.HookGlobal.classLoader
import com.ehook.HookGlobal.lazy
import com.ehook.core.Clazz
import com.ehook.helper.ReflecterHelper.findClassIfExists
import com.ehook.helper.ReflecterHelper.findClassesFromPackage
import com.evan.dy.mirror.PackageUtils

object Classes {
    private val packageName = PackageUtils.getPath(javaClass)
    val ClassLivesdkModuleRoomService: Class<*> by lazy("${javaClass.name}.ClassLivesdkModuleRoomService") {
        findClassesFromPackage(
            classLoader!!,
            HookGlobal.classes!!,
            packageName
        ).filterByMethod("getAnimatedButtonController")
            .filterByMethod("getRoomDataContextClass")
            .filterByMethod("getCrossRoomGift")
            .filterByMethod("getCurrentRoom")
            .firstOrNull()
    }

}

