package com.evan.dy.mirror.com.ss.android.ugc.aweme.account.k

import com.ehook.HookGlobal.classLoader
import com.ehook.HookGlobal.lazy
import com.ehook.helper.ReflecterHelper.findClassIfExists
import com.evan.dy.mirror.PackageUtils

object Classes {
    private  val packageName = PackageUtils.getPath(javaClass)
    val ClassImSdkUtilsBh: Class<*> by lazy("${javaClass.name}.ClassImSdkUtilsBh") {
        findClassIfExists("${packageName}.bh", classLoader!!)
    }
    val ClassImSdkUtilsBh_a: Class<*> by lazy("${javaClass.name}.ClassImSdkUtilsBh_a") {
        findClassIfExists("${packageName}.bh\$a", classLoader!!)
    }
}

