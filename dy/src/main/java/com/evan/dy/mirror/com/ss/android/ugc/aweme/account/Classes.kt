package com.evan.dy.mirror.com.ss.android.ugc.aweme.account

import com.ehook.HookGlobal
import com.ehook.HookGlobal.classLoader
import com.ehook.HookGlobal.lazy
import com.ehook.core.Clazz
import com.ehook.helper.ReflecterHelper
import com.ehook.helper.ReflecterHelper.findClassIfExists
import com.evan.dy.mirror.PackageUtils
import com.evan.dy.mirror.com.bytedance.android.livesdk.message.model.Classes
import com.evan.dy.mirror.com.ss.android.ugc.aweme.Classes.ClassIAccountService
import com.evan.dy.mirror.com.ss.android.ugc.aweme.Classes.ClassIAccountUserService

object Classes {
    private  val packageName = PackageUtils.getPath(javaClass)
    val ClassAccountE: Class<*> by lazy("${javaClass.name}.ClassAccountE") {
        ReflecterHelper.findClassesFromPackage(
            classLoader!!,
            HookGlobal.classes!!,
            packageName
        ).filterByMethod(ClassIAccountUserService)
            .filterByMethod(ClassIAccountService)
            .firstOrNull()
    }
}

