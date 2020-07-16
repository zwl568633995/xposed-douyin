package com.evan.dy.mirror.com.ss.android.ugc.aweme.following.a

import com.ehook.HookGlobal.classLoader
import com.ehook.HookGlobal.lazy
import com.ehook.helper.ReflecterHelper.findClassIfExists
import com.evan.dy.mirror.PackageUtils

object Classes {
    private  val packageName = PackageUtils.getPath(javaClass)
    val ClassFollowingC: Class<*> by lazy("${javaClass.name}.ClassFollowingC") {
        findClassIfExists("${packageName}.c", classLoader!!)
    }
}

