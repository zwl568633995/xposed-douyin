package com.evan.dy.interfaces

interface IMessageHook {

    fun onCommentWidgetResume(widget: Any?)

    fun onCommentWidgetPause(widget: Any?)

    fun onMessage(message: Any?)

    fun onRoomChanged(room: Any?)
}
