package com.evan.dy.mirror.com.bytedance.android.livesdk.livecommerce.b

import com.ehook.HookGlobal.lazy
import com.ehook.core.Clazz
import com.ehook.helper.ReflecterHelper
import java.lang.reflect.Method

object Methods {
    val FunLivesdkLivecommerceB_o_c: Method by lazy("${javaClass.name}.FunLivesdkLivecommerceB_o_c") {
        ReflecterHelper.findMethodIfExists(
            Classes.ClassGiftRetrofitApi, "c"
        )
    }
}
