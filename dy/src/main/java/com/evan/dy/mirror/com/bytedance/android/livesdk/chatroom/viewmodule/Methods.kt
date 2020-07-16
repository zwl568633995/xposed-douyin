package com.evan.dy.mirror.com.bytedance.android.livesdk.chatroom.viewmodule

import com.ehook.HookGlobal.lazy
import com.ehook.core.Clazz
import com.ehook.helper.ReflecterHelper
import java.lang.reflect.Method

object Methods {
    val ClassCommentWidget_a: Method by lazy("${javaClass.name}.ClassCommentWidget_a") {
        ReflecterHelper.findMethodsByExactParameters(
            Classes.ClassCommentWidget, null,
            Clazz.String, Clazz.Boolean, Clazz.Boolean
        ).firstOrNull()
    }
    val ClassCommentWidget_onPause: Method by lazy("${javaClass.name}.ClassCommentWidget_onPause") {
        ReflecterHelper.findMethodIfExists(Classes.ClassCommentWidget, "onPause")
    }
    val ClassCommentWidget_onResume: Method by lazy("${javaClass.name}.ClassCommentWidget_onResume") {
        ReflecterHelper.findMethodIfExists(Classes.ClassCommentWidget, "onResume")
    }
}
