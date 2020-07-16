package com.evan.dy.mirror.com.bytedance.im.core.c

import com.ehook.HookGlobal.lazy
import com.ehook.core.Clazz
import com.ehook.helper.ReflecterHelper
import java.lang.reflect.Method

object Methods {
    val ClassImCoreCE_a: Method by lazy("${javaClass.name}.ClassImCoreCE_a") {
        ReflecterHelper.findMethodsByExactParameters(
            Classes.ClassImCoreCE,
            Clazz.String, Clazz.Long
        ).firstOrNull()
    }
}
