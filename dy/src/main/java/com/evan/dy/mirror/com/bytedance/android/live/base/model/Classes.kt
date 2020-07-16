package com.evan.dy.mirror.com.bytedance.android.live.base.model

import com.ehook.HookGlobal.classLoader
import com.ehook.HookGlobal.lazy
import com.ehook.helper.ReflecterHelper.findClassIfExists
import com.evan.dy.mirror.PackageUtils

object Classes {
    private  val packageName = PackageUtils.getPath(javaClass)

    val ClassLiveBaseModelImageModel: Class<*> by lazy("${javaClass.name}.ClassLiveBaseModelImageModel") {
        findClassIfExists("$packageName.ImageModel", classLoader!!)
    }
}

