package com.evan.dy.mirror.com.bytedance.android.livesdk.gift.model

import com.ehook.HookGlobal
import com.ehook.helper.ReflecterHelper
import java.lang.reflect.Field
import java.lang.reflect.Method

object Fields {
    val ClassLivesdkGiftModelD_combo: Field by HookGlobal.lazy("${javaClass.name}.getClassLivesdkGiftModelD_combo") {
        ReflecterHelper.findFieldIfExists(
            Classes.getClassLivesdkGiftModelD,
            "g"
        )
    }
    val ClassLivesdkGiftModelD_describe: Field by HookGlobal.lazy("${javaClass.name}.getClassLivesdkGiftModelD_describe") {
        ReflecterHelper.findFieldIfExists(
            Classes.getClassLivesdkGiftModelD,
            "c"
        )
    }
    val ClassLivesdkGiftModelD_id: Field by HookGlobal.lazy("${javaClass.name}.getClassLivesdkGiftModelD_id") {
        ReflecterHelper.findFieldIfExists(
            Classes.getClassLivesdkGiftModelD,
            "d"
        )
    }
    val ClassLivesdkGiftModelD_image: Field by HookGlobal.lazy("${javaClass.name}.getClassLivesdkGiftModelD_image") {
        ReflecterHelper.findFieldIfExists(
            Classes.getClassLivesdkGiftModelD,
            "b"
        )
    }

    val ClassLivesdkGiftModelD_name: Field by HookGlobal.lazy("${javaClass.name}.getClassLivesdkGiftModelD_name") {
        ReflecterHelper.findFieldIfExists(
            Classes.getClassLivesdkGiftModelD,
            "a"
        )
    }
    val ClassLivesdkGiftModelD_type: Field by HookGlobal.lazy("${javaClass.name}.getClassLivesdkGiftModelD_type") {
        ReflecterHelper.findFieldIfExists(
            Classes.getClassLivesdkGiftModelD,
            "e"
        )
    }
    val ClassLivesdkGiftModelGiftPage_gifts: Field by HookGlobal.lazy("${javaClass.name}.getClassLivesdkGiftModelGiftPage_gifts") {
        ReflecterHelper.findFieldIfExists(
            Classes.getClassLivesdkGiftModelGiftPage,
            "gifts"
        )
    }

}
