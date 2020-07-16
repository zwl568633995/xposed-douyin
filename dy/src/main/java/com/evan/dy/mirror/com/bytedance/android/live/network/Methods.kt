package com.evan.dy.mirror.com.bytedance.android.live.network

import com.ehook.HookGlobal.lazy
import com.ehook.core.Clazz
import com.ehook.helper.ReflecterHelper
import java.lang.reflect.Method

object Methods {
    val ClassLiveNetworkC_a: Method by lazy("${javaClass.name}.ClassLiveNetworkC_a") {
        ReflecterHelper.findMethodExact(
            Classes.ClassLiveNetworkC, "a", Clazz.Clazz
        )
    }
    val ClassLiveNetworkC_instance: Method by lazy("${javaClass.name}.ClassLiveNetworkC_instance") {
        ReflecterHelper.findMethodsByExactParameters(
            Classes.ClassLiveNetworkC, Classes.ClassLiveNetworkC
        ).firstOrNull()
    }
}
