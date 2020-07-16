package com.evan.dy.mirror.com.bytedance.android.livesdk.livecommerce.h

import com.ehook.HookGlobal
import com.ehook.helper.ReflecterHelper
import java.lang.reflect.Field

object Fields {
    val ClassLivesdkLivecommerceHA_d: Field by HookGlobal.lazy("${javaClass.name}.ClassLivesdkLivecommerceHA_d") {
        ReflecterHelper.findFieldIfExists(
            Classes.ClassLivesdkLivecommerceHA,
            "d"
        )
    }
    val ClassLivesdkLivecommerceHA_h: Field by HookGlobal.lazy("${javaClass.name}.ClassLivesdkLivecommerceHA_h") {
        ReflecterHelper.findFieldIfExists(
            Classes.ClassLivesdkLivecommerceHA,
            "h"
        )
    }

}
