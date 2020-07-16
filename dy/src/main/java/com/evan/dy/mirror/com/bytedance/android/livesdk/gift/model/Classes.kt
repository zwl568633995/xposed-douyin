package com.evan.dy.mirror.com.bytedance.android.livesdk.gift.model

import com.ehook.HookGlobal.classLoader
import com.ehook.HookGlobal.lazy
import com.ehook.helper.ReflecterHelper.findClassIfExists
import com.evan.dy.mirror.PackageUtils

object Classes {
    private  val packageName = PackageUtils.getPath(javaClass)
    val getClassLivesdkGiftModelD: Class<*> by lazy("${javaClass.name}.getClassLivesdkGiftModelD") {
        findClassIfExists("$packageName.d", classLoader!!)
    }
    val getClassLivesdkGiftModelGiftPage: Class<*> by lazy("${javaClass.name}.getClassLivesdkGiftModelGiftPage") {
        findClassIfExists("$packageName.GiftPage", classLoader!!)
    }

}

