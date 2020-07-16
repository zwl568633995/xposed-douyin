package com.evan.dy.mirror.com.bytedance.android.live.base.model.user

import com.ehook.HookGlobal.classLoader
import com.ehook.HookGlobal.lazy
import com.ehook.helper.ReflecterHelper.findClassIfExists
import com.evan.dy.mirror.PackageUtils

object Classes {
    private  val packageName = PackageUtils.getPath(javaClass)

    val ClassLiveBaseModelUserUser: Class<*> by lazy("${javaClass.name}.ClassLiveBaseModelUserUser") {
        findClassIfExists("$packageName.User", classLoader!!)
    }
}

