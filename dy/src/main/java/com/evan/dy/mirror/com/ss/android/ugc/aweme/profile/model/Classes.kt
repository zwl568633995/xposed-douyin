package com.evan.dy.mirror.com.ss.android.ugc.aweme.profile.model

import com.ehook.HookGlobal.classLoader
import com.ehook.HookGlobal.lazy
import com.ehook.helper.ReflecterHelper.findClassIfExists
import com.evan.dy.mirror.PackageUtils

object Classes {
    private  val packageName = PackageUtils.getPath(javaClass)
    val ClassFollowStatus: Class<*> by lazy("${javaClass.name}.ClassFollowStatus") {
        findClassIfExists("${packageName}.FollowStatus", classLoader!!)
    }
    val ClassProfileModelUser: Class<*> by lazy("${javaClass.name}.ClassProfileModelUser") {
        findClassIfExists("${packageName}.User", classLoader!!)
    }
}

