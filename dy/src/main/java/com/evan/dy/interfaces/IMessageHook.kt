package com.evan.dy.interfaces

interface IMessageHook {

    fun onWidgetResume(widget: Any?)

    fun onWidgetPause(widget: Any?)

    fun onMessage(message: Any?)

}
