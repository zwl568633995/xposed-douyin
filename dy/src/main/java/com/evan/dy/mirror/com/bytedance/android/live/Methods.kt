package com.evan.dy.mirror.com.bytedance.android.live

import com.ehook.HookGlobal.lazy
import com.ehook.helper.ReflecterHelper
import java.lang.reflect.Method

object Methods {
    val ClassLiveB_a: Method by lazy("${javaClass.name}.ClassLiveB_a") {
        ReflecterHelper.findMethodIfExists(
            Classes.ClassLiveB, "a"
        )
    }
}
