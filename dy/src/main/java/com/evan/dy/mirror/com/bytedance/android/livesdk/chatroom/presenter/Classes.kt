package com.evan.dy.mirror.com.bytedance.android.livesdk.chatroom.presenter

import com.ehook.HookGlobal.classLoader
import com.ehook.HookGlobal.lazy
import com.ehook.helper.ReflecterHelper.findClassIfExists
import com.evan.dy.mirror.PackageUtils

object Classes {
    private  val packageName = PackageUtils.getPath(javaClass)

    val ClassChatroomPresenterAz: Class<*> by lazy("${javaClass.name}.ClassChatroomPresenterAz") {
        findClassIfExists("$packageName.az", classLoader!!)
    }
}

