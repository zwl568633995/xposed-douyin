package com.evan.dy.plugins

import com.ehook.utils.LogUtil
import com.evan.dy.api.ChatRoomApi
import com.evan.dy.api.model.LiveRoomMessage
import com.evan.dy.interfaces.IMessageHook
import kotlin.jvm.internal.Intrinsics


object MessageHookPlugin : IMessageHook {
    override fun onWidgetResume(widget: Any?) {
        LogUtil.e(MessageHookPlugin::class.java.simpleName, "onWidgetResume")
        ChatRoomApi.setCommentWidget(widget)
    }

    override fun onWidgetPause(widget: Any?) {
        LogUtil.e(MessageHookPlugin::class.java.simpleName, "onWidgetPause")
        if (Intrinsics.areEqual(ChatRoomApi.getCommentWidget(), widget)) {
            ChatRoomApi.setCommentWidget(null)
        }
    }

    override fun onMessage(message: Any?) {
        if (message != null) {
            val liveRoomMessage = LiveRoomMessage(message)
            ChatRoomApi.handleMessage(liveRoomMessage)
        } else {
            LogUtil.e(MessageHookPlugin::class.java.simpleName, "message null")
        }
    }
}
