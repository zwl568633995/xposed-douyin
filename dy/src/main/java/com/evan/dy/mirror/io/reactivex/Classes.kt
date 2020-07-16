package com.evan.dy.mirror.io.reactivex

import com.ehook.HookGlobal.classLoader
import com.ehook.HookGlobal.lazy
import com.ehook.helper.ReflecterHelper.findClassIfExists
import com.evan.dy.mirror.PackageUtils

object Classes {
    private  val packageName = PackageUtils.getPath(javaClass)
    val ClassIoReactivexObservable: Class<*> by lazy("${javaClass.name}.ClassIoReactivexObservable") {
        findClassIfExists("${packageName}.Observable", classLoader!!)
    }
}

