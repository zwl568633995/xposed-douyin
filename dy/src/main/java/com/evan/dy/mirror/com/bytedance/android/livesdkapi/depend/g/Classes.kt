package com.evan.dy.mirror.com.bytedance.android.livesdkapi.depend.g

import com.ehook.HookGlobal
import com.ehook.HookGlobal.classLoader
import com.ehook.HookGlobal.lazy
import com.ehook.core.Clazz
import com.ehook.helper.ReflecterHelper.findClassesFromPackage
import com.evan.dy.mirror.PackageUtils

object Classes {
    private  val packageName = PackageUtils.getPath(javaClass)

    val getClassLivesdkapiDependGA: Class<*> by lazy("${javaClass.name}.getClassLivesdkapiDependGA") {
        findClassesFromPackage(
            classLoader!!,
            HookGlobal.classes!!,
            packageName
        ).filterByMethod(Clazz.Int,"getIntType")
            .filterByMethod(Clazz.Int,"getService")
            .filterByMethod(Clazz.String,"getWsMethod")
            .firstOrNull()
    }
}

