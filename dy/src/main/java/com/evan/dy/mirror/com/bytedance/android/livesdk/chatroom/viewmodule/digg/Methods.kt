package com.evan.dy.mirror.com.bytedance.android.livesdk.chatroom.viewmodule.digg

import com.ehook.HookGlobal.lazy
import com.ehook.core.Clazz
import com.ehook.helper.ReflecterHelper
import java.lang.reflect.Method

object Methods {
    val ClassDiggApi_digg: Method by lazy("${javaClass.name}.ClassDiggApi_digg") {
        ReflecterHelper.findMethodIfExists(
            Classes.ClassDiggApi, "digg",
            Clazz.Long, Clazz.Int
        )
    }

}
