package com.evan.dy.plugins

import com.ehook.utils.LogUtil
import com.evan.dy.api.ChatRoomApi
import com.evan.dy.api.model.LiveRoom
import com.evan.dy.api.model.LiveRoomMessage
import com.evan.dy.interfaces.IMessageHook
import kotlin.jvm.internal.Intrinsics


object MessageHookPlugin : IMessageHook {
    override fun onCommentWidgetResume(widget: Any?) {
        LogUtil.e(MessageHookPlugin::class.java.simpleName, "onCommentWidgetResume")
        ChatRoomApi.setCommentWidget(widget)
    }

    override fun onCommentWidgetPause(widget: Any?) {
        LogUtil.e(MessageHookPlugin::class.java.simpleName, "onCommentWidgetPause")
        if (Intrinsics.areEqual(ChatRoomApi.getCommentWidget(), widget)) {
            ChatRoomApi.setCommentWidget(null)
            ChatRoomApi.setRoom(null)
        }
    }
    override fun onRoomChanged(room: Any?) {
        if (room != null) {
            LogUtil.e(MessageHookPlugin::class.java.simpleName, "onRoomChanged")
        }
        ChatRoomApi.setRoom(LiveRoom(room))
    }

    override fun onMessage(message: Any?) {
        if (message != null) {
            LogUtil.e(MessageHookPlugin::class.java.simpleName, "onMessage=${LiveRoomMessage(message).message}")
        }else{
            LogUtil.e(MessageHookPlugin::class.java.simpleName, "message null")
        }
    }
}
