package com.evan.dy.mirror.com.bytedance.android.livesdk.message.model

import com.ehook.HookGlobal
import com.ehook.helper.ReflecterHelper
import java.lang.reflect.Field

object Fields {
    val ClassLivesdkMessageModelAa_id: Field by HookGlobal.lazy("${javaClass.name}.ClassLivesdkMessageModelAa_id") {
        ReflecterHelper.findFieldIfExists(
            Classes.getClassLivesdkMessageModelAa,
            "d"
        )
    }
    val ClassLivesdkMessageModelAa_user: Field by HookGlobal.lazy("${javaClass.name}.ClassLivesdkMessageModelAa_user") {
        var typeName = com.evan.dy.mirror.com.bytedance.android.live.base.model.user.Classes.ClassLiveBaseModelUserUser.name
        ReflecterHelper.findFieldsWithType(Classes.getClassLivesdkMessageModelAa, typeName).firstOrNull()
    }
    val ClassLivesdkMessageModelAq_gift: Field by HookGlobal.lazy("${javaClass.name}.ClassLivesdkMessageModelAq_gift") {
        ReflecterHelper.findFieldIfExists(
            Classes.getClassLivesdkMessageModelAq,
            "p"
        )
    }
    val ClassLivesdkMessageModelAq_repeatEnd: Field by HookGlobal.lazy("${javaClass.name}.ClassLivesdkMessageModelAq_repeatEnd") {
        ReflecterHelper.findFieldIfExists(
            Classes.getClassLivesdkMessageModelAq,
            "h"
        )
    }

    val ClassLivesdkMessageModelAq_user: Field by HookGlobal.lazy("${javaClass.name}.ClassLivesdkMessageModelAq_user") {
        var typeName = com.evan.dy.mirror.com.bytedance.android.live.base.model.user.Classes.ClassLiveBaseModelUserUser.name
        ReflecterHelper.findFieldsWithType(Classes.getClassLivesdkMessageModelAq, typeName).firstOrNull()
    }
    val ClassLivesdkMessageModelBm_k: Field by HookGlobal.lazy("${javaClass.name}.ClassLivesdkMessageModelBm_k") {
        ReflecterHelper.findFieldIfExists(
            Classes.getClassLivesdkMessageModelBm,
            "k"
        )
    }
    val ClassLivesdkMessageModelBm_user: Field by HookGlobal.lazy("${javaClass.name}.ClassLivesdkMessageModelBm_user") {
        var typeName = com.evan.dy.mirror.com.bytedance.android.live.base.model.user.Classes.ClassLiveBaseModelUserUser.name
        ReflecterHelper.findFieldsWithType(Classes.getClassLivesdkMessageModelBm, typeName).firstOrNull()
    }
    val ClassLivesdkMessageModelCz_action: Field by HookGlobal.lazy("${javaClass.name}.ClassLivesdkMessageModelCz_action") {
        ReflecterHelper.findFieldIfExists(
            Classes.getClassLivesdkMessageModelCz,
            "b"
        )
    }
    val ClassLivesdkMessageModelCz_user: Field by HookGlobal.lazy("${javaClass.name}.ClassLivesdkMessageModelCz_user") {
        var typeName = com.evan.dy.mirror.com.bytedance.android.live.base.model.user.Classes.ClassLiveBaseModelUserUser.name
        ReflecterHelper.findFieldsWithType(Classes.getClassLivesdkMessageModelCz, typeName).firstOrNull()
    }
    val ClassLivesdkMessageModelN_c: Field by HookGlobal.lazy("${javaClass.name}.ClassLivesdkMessageModelN_c") {
        ReflecterHelper.findFieldIfExists(
            Classes.getClassLivesdkMessageModelN,
            "c"
        )
    }
    val ClassLivesdkMessageModelN_user: Field by HookGlobal.lazy("${javaClass.name}.ClassLivesdkMessageModelN_user") {
        var typeName = com.evan.dy.mirror.com.bytedance.android.live.base.model.user.Classes.ClassLiveBaseModelUserUser.name
        ReflecterHelper.findFieldsWithType(Classes.getClassLivesdkMessageModelN, typeName).firstOrNull()
    }
    val ClassLivesdkMessageModelV_b: Field by HookGlobal.lazy("${javaClass.name}.ClassLivesdkMessageModelV_b") {
        ReflecterHelper.findFieldIfExists(
            Classes.getClassLivesdkMessageModelV,
            "b"
        )
    }
    val ClassLivesdkMessageModelZ_user: Field by HookGlobal.lazy("${javaClass.name}.ClassLivesdkMessageModelZ_user") {
        var typeName = com.evan.dy.mirror.com.bytedance.android.live.base.model.user.Classes.ClassLiveBaseModelUserUser.name
        ReflecterHelper.findFieldsWithType(Classes.getClassLivesdkMessageModelZ, typeName).firstOrNull()
    }
}
