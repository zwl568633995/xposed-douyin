package com.evan.dy.mirror.com.ss.android.ugc.aweme.account.k

import com.ehook.HookGlobal.lazy
import com.ehook.core.Clazz
import com.ehook.helper.ReflecterHelper
import com.evan.dy.mirror.com.ss.android.ugc.aweme.im.sdk.chat.model.Classes.ClassImSdkChatModelBaseContent
import java.lang.reflect.Method

object Methods {
    val ClassImSdkUtilsBh_instance: Method by lazy("${javaClass.name}.ClassImSdkUtilsBh_instance") {
        ReflecterHelper.findMethodsByExactParameters(
            Classes.ClassImSdkUtilsBh, Classes.ClassImSdkUtilsBh
        ).firstOrNull()
    }
    val ClassImSdkUtilsBh_b: Method by lazy("${javaClass.name}.ClassImSdkUtilsBh_b") {
        ReflecterHelper.findMethodIfExists(
            Classes.ClassImSdkUtilsBh,
            "b", Clazz.String, ClassImSdkChatModelBaseContent, Classes.ClassImSdkUtilsBh_a
        )
    }
}
