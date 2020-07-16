package com.evan.dy.mirror.com.ss.android.ugc.aweme.im.sdk.chat.model

import com.ehook.HookGlobal.lazy
import com.ehook.core.Clazz
import com.ehook.helper.ReflecterHelper
import java.lang.reflect.Method

object Methods {
    val ClassImSdkChatModelTextContent_obtain: Method by lazy("${javaClass.name}.ClassImSdkChatModelTextContent_obtain") {
        ReflecterHelper.findMethodExact(
            Classes.ClassImSdkChatModelTextContent,
            "obtain", Clazz.String
        )
    }
    val ClassImSdkChatModelTextContent_setSendStartTime: Method by lazy("${javaClass.name}.ClassImSdkChatModelTextContent_obtain") {
        ReflecterHelper.findMethodExact(
            Classes.ClassImSdkChatModelTextContent,
            "setSendStartTime", Clazz.Long
        )
    }
}
