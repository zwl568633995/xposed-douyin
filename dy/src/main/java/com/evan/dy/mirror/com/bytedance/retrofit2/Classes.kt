package com.evan.dy.mirror.com.bytedance.retrofit2

import com.ehook.HookGlobal.classLoader
import com.ehook.HookGlobal.lazy
import com.ehook.helper.ReflecterHelper.findClassIfExists
import com.evan.dy.mirror.PackageUtils

object Classes {
    private  val packageName = PackageUtils.getPath(javaClass)
    val getClassCall: Class<*> by lazy("${javaClass.name}.getClassCall") {
        findClassIfExists("$packageName.Call", classLoader!!)
    }
    val getClassSsHttpCall: Class<*> by lazy("${javaClass.name}.getClassSsHttpCall") {
        findClassIfExists("$packageName.SsHttpCall", classLoader!!)
    }

    val getClassSsResponse: Class<*> by lazy("${javaClass.name}.getClassSsResponse") {
        findClassIfExists("$packageName.SsResponse", classLoader!!)
    }

}

