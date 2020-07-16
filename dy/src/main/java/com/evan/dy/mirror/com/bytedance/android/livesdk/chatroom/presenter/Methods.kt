package com.evan.dy.mirror.com.bytedance.android.livesdk.chatroom.presenter

import com.ehook.HookGlobal.lazy
import com.ehook.helper.ReflecterHelper
import com.evan.dy.mirror.com.ss.ugc.live.sdk.message.data.Classes.ClassLiveSdkMessageDataIMessage
import java.lang.reflect.Method

object Methods {

    val onMessage: Method by lazy("${javaClass.name}.onMessage") {
        ReflecterHelper.findMethodIfExists(
            Classes.ClassChatroomPresenterAz,
            "onMessage",
            ClassLiveSdkMessageDataIMessage
        )
    }
}
