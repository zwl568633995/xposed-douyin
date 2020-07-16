package com.evan.dy.mirror.com.bytedance.android.live.f

import com.ehook.HookGlobal.lazy
import com.ehook.core.Clazz
import com.ehook.helper.ReflecterHelper
import java.lang.reflect.Method

object Methods {
    val ClassLiveFD_a: Method by lazy("${javaClass.name}.ClassLiveFD_a") {
        ReflecterHelper.findMethodIfExists(
            Classes.ClassLiveFD, "a", Class::class.java
        )
    }
}
