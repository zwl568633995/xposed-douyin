package com.evan.dy.mirror.com.bytedance.android.livesdk.message.model

import com.ehook.HookGlobal
import com.ehook.HookGlobal.classLoader
import com.ehook.HookGlobal.lazy
import com.ehook.core.Clazz
import com.ehook.helper.ReflecterHelper.findClassIfExists
import com.ehook.helper.ReflecterHelper.findClassesFromPackage
import com.evan.dy.mirror.PackageUtils

object Classes {
    private val packageName = PackageUtils.getPath(javaClass)
    val getClassLivesdkMessageModel: Class<*> by lazy("${javaClass.name}.getClassLivesdkMessageModel") {
        findClassesFromPackage(
            classLoader!!,
            HookGlobal.classes!!,
            packageName
        ).filterByMethod(Clazz.Int, "getPriority")
            .filterByMethod(Clazz.Boolean, "supportDisplayText")
            .filterByMethod(Clazz.Boolean, "needMonitor")
            .filterByMethod(Clazz.Long, "getMessageId")
            .filterByMethod(Clazz.Int, "getIntType")
            .firstOrNull()
    }

    val getClassLivesdkMessageModelAa: Class<*> by lazy("${javaClass.name}.getClassLivesdkMessageModelAa") {
        findClassIfExists("$packageName.aa", classLoader!!)
    }
    val getClassLivesdkMessageModelAq: Class<*> by lazy("${javaClass.name}.getClassLivesdkMessageModelAq") {
        findClassIfExists("$packageName.aq", classLoader!!)
    }
    val getClassLivesdkMessageModelBa: Class<*> by lazy("${javaClass.name}.getClassLivesdkMessageModelBa") {
        findClassIfExists("$packageName.ba", classLoader!!)
    }
    val getClassLivesdkMessageModelBm: Class<*> by lazy("${javaClass.name}.getClassLivesdkMessageModelBm") {
        findClassIfExists("$packageName.bm", classLoader!!)
    }
    val getClassLivesdkMessageModelCz: Class<*> by lazy("${javaClass.name}.getClassLivesdkMessageModelCz") {
        findClassIfExists("$packageName.cz", classLoader!!)
    }
    val getClassLivesdkMessageModelN: Class<*> by lazy("${javaClass.name}.getClassLivesdkMessageModelN") {
        findClassIfExists("$packageName.n", classLoader!!)
    }
    val getClassLivesdkMessageModelV: Class<*> by lazy("${javaClass.name}.getClassLivesdkMessageModelV") {
        findClassIfExists("$packageName.v", classLoader!!)
    }
    val getClassLivesdkMessageModelZ: Class<*> by lazy("${javaClass.name}.getClassLivesdkMessageModelZ") {
        findClassIfExists("$packageName.z", classLoader!!)
    }
}

