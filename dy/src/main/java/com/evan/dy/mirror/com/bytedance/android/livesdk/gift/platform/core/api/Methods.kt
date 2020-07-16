package com.evan.dy.mirror.com.bytedance.android.livesdk.gift.platform.core.api

import com.ehook.HookGlobal.lazy
import com.ehook.core.Clazz
import com.ehook.helper.ReflecterHelper
import java.lang.reflect.Method

object Methods {
    val ClassGiftRetrofitApi_send4: Method by lazy("${javaClass.name}.ClassLiveB_a") {
        ReflecterHelper.findMethodIfExists(
            Classes.ClassGiftRetrofitApi, "send", Clazz.Long, Clazz.Long, Clazz.Long, Clazz.Int
        )
    }
}
