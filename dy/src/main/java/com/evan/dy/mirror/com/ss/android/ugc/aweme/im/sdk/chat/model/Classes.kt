package com.evan.dy.mirror.com.ss.android.ugc.aweme.im.sdk.chat.model

import com.ehook.HookGlobal.classLoader
import com.ehook.HookGlobal.lazy
import com.ehook.helper.ReflecterHelper.findClassIfExists
import com.evan.dy.mirror.PackageUtils

object Classes {
    private  val packageName = PackageUtils.getPath(javaClass)
    val ClassImSdkChatModelTextContent: Class<*> by lazy("${javaClass.name}.ClassImSdkChatModelTextContent") {
        findClassIfExists("${packageName}.TextContent", classLoader!!)
    }
    val ClassImSdkChatModelBaseContent: Class<*> by lazy("${javaClass.name}.ClassImSdkChatModelBaseContent") {
        findClassIfExists("${packageName}.BaseContent", classLoader!!)
    }
}

