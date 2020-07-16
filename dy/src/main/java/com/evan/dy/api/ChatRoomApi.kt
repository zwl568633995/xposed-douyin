package com.evan.dy.api

import com.ehook.utils.LogUtil
import com.evan.dy.api.callback.EICommonCallback
import com.evan.dy.api.model.LiveRoomMessage
import com.evan.dy.mirror.com.bytedance.android.livesdk.chatroom.viewmodule.Methods.ClassCommentWidget_a

object ChatRoomApi {

    private var commentWidget: Any? = null


    fun setCommentWidget(commentWidget: Any?) {
        this.commentWidget = commentWidget
    }

    fun getCommentWidget(): Any? {
        return this.commentWidget
    }


    fun handleMessage(liveRoomMessage: LiveRoomMessage) {
        if (liveRoomMessage != null) {
            when (liveRoomMessage.messageType) {
                6 -> {//礼物
                    sendRoomTextMsg("666!",null)
                }
            }
        }
    }
    fun sendRoomTextMsg(content: String, callback: EICommonCallback?) {
        LogUtil.e("ChatRoomApi", "sendRoomTextMsg. msg = $content commentWidget=$commentWidget")
        if (this.commentWidget == null) {
            callback?.onResult(-1, "重新进入", null)
            return
        }
        ClassCommentWidget_a.invoke(commentWidget, content, false, false)
        callback?.onResult(0, content, content)
    }


}
