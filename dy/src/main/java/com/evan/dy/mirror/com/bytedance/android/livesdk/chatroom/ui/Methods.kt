package com.evan.dy.mirror.com.bytedance.android.livesdk.chatroom.ui

import com.ehook.HookGlobal.lazy
import com.ehook.helper.ReflecterHelper
import com.evan.dy.mirror.com.bytedance.android.livesdkapi.depend.model.live.Classes.ClassLivesdkapiDependModelLiveRoom
import java.lang.reflect.Method

object Methods {

    val getClassLivesdkChatroomUiCh_p: Method by lazy("${javaClass.name}.getClassLivesdkChatroomUiCh_p") {
        ReflecterHelper.findMethodIfExists(
            Classes.getClassLivesdkChatroomUiCh,
            "p"
        )
    }
    val getClassLivesdkChatroomUiCh_a: Method by lazy("${javaClass.name}.getClassLivesdkChatroomUiCh_a") {
        ReflecterHelper.findMethodIfExists(
            Classes.getClassLivesdkChatroomUiCh,
            "a",
            ClassLivesdkapiDependModelLiveRoom
        )
    }
}
