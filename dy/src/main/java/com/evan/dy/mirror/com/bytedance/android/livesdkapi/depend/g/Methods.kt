package com.evan.dy.mirror.com.bytedance.android.livesdkapi.depend.g

import com.ehook.HookGlobal.lazy
import com.ehook.helper.ReflecterHelper
import java.lang.reflect.Method

object Methods {
    val ClassLivesdkapiDependGA_getIntType: Method by lazy("${javaClass.name}.ClassLivesdkapiDependGA_getIntType") {
        ReflecterHelper.findMethodIfExists(
            Classes.getClassLivesdkapiDependGA,
            "getIntType"
        )
    }
}
