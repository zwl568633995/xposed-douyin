package com.evan.dy.mirror.com.ss.android.ugc.aweme

import com.ehook.HookGlobal.classLoader
import com.ehook.HookGlobal.lazy
import com.ehook.helper.ReflecterHelper.findClassIfExists
import com.evan.dy.mirror.PackageUtils

object Classes {
    private  val packageName = PackageUtils.getPath(javaClass)
    val ClassIAccountService: Class<*> by lazy("${javaClass.name}.ClassIAccountService") {
        findClassIfExists("${packageName}.IAccountService", classLoader!!)
    }
    val ClassIAccountUserService: Class<*> by lazy("${javaClass.name}.ClassIAccountUserService") {
        findClassIfExists("${packageName}.IAccountUserService", classLoader!!)
    }
}

