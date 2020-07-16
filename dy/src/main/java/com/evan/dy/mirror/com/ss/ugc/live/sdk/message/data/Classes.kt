package com.evan.dy.mirror.com.ss.ugc.live.sdk.message.data

import com.ehook.HookGlobal.classLoader
import com.ehook.HookGlobal.lazy
import com.ehook.helper.ReflecterHelper.findClassIfExists
import com.evan.dy.mirror.PackageUtils

object Classes {
    private  val packageName = PackageUtils.getPath(javaClass)
    val ClassLiveSdkMessageDataIMessage: Class<*> by lazy("${javaClass.name}.ClassLiveSdkMessageDataIMessage") {
        findClassIfExists("$packageName.IMessage", classLoader!!)
    }
}

