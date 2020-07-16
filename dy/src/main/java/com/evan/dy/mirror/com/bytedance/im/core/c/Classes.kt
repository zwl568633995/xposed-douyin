package com.evan.dy.mirror.com.bytedance.im.core.c

import com.ehook.HookGlobal
import com.ehook.HookGlobal.classLoader
import com.ehook.HookGlobal.lazy
import com.ehook.core.Clazz
import com.ehook.helper.ReflecterHelper.findClassesFromPackage
import com.evan.dy.mirror.PackageUtils

object Classes {
    private  val packageName = PackageUtils.getPath(javaClass)
    val ClassImCoreCE: Class<*> by lazy("${javaClass.name}.ClassImCoreCE") {
        findClassesFromPackage(
            classLoader!!,
            HookGlobal.classes!!,
            packageName
        )
            .filterByMethod(null as Class<*>?, Clazz.Map,Clazz.Runnable)
            .filterByMethod(Clazz.String, Clazz.Int,Clazz.Long)
            .filterByMethod(Clazz.String,Clazz.Long)
            .filterByMethod(Clazz.Long,Clazz.String)
            .firstOrNull()
    }
}

