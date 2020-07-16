package com.evan.dy.mirror.com.bytedance.android.livesdk.livecommerce.h

import com.ehook.HookGlobal.lazy
import com.ehook.core.Clazz
import com.ehook.helper.ReflecterHelper
import java.lang.reflect.Method

object Methods {
    val FunLivesdkLivecommerceHB_a: Method by lazy("${javaClass.name}.FunLivesdkLivecommerceHB_a") {
        ReflecterHelper.findMethodIfExists(
            Classes.ClassLivesdkLivecommerceHB, "a", Clazz.String, Clazz.String
        )
    }
    val ClassLivesdkLivecommerceHC_b: Method by lazy("${javaClass.name}.ClassLivesdkLivecommerceHC_b") {
        ReflecterHelper.findMethodIfExists(
            Classes.ClassLivesdkLivecommerceHC, "b", Clazz.String, List::class.java
        )
    }
    val FunLivesdkLivecommerceHD_add: Method by lazy("${javaClass.name}.FunLivesdkLivecommerceHD_add") {
        ReflecterHelper.findMethodIfExists(
            Classes.ClassLivesdkLivecommerceHD, "add", Clazz.Object
        )
    }
}
