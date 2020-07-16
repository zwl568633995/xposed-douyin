package com.evan.dy.mirror.com.bytedance.android.livesdkapi.depend.model.live

import com.ehook.HookGlobal.classLoader
import com.ehook.HookGlobal.lazy
import com.ehook.helper.ReflecterHelper.findClassIfExists
import com.evan.dy.mirror.PackageUtils

object Classes {
    private  val packageName = PackageUtils.getPath(javaClass)
    val ClassLivesdkapiDependModelLiveRoom: Class<*> by lazy("${javaClass.name}.ClassLivesdkapiDependModelLiveRoom") {
        findClassIfExists("${packageName}.Room", classLoader!!)
    }
}

