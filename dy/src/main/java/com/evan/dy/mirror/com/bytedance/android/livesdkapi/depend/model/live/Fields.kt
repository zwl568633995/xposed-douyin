package com.evan.dy.mirror.com.bytedance.android.livesdkapi.depend.model.live

import com.ehook.HookGlobal
import com.ehook.helper.ReflecterHelper
import java.lang.reflect.Field

object Fields {
    val ClassLivesdkapiDependModelLiveRoom_id: Field by HookGlobal.lazy("${javaClass.name}.getClassLivesdkapiDependModelLiveRoom_id") {
        ReflecterHelper.findFieldIfExists(
            Classes.ClassLivesdkapiDependModelLiveRoom,
            "id"
        )
    }
    val ClassLivesdkapiDependModelLiveRoom_owner: Field by HookGlobal.lazy("${javaClass.name}.getClassLivesdkapiDependModelLiveRoom_owner") {
        ReflecterHelper.findFieldIfExists(
            Classes.ClassLivesdkapiDependModelLiveRoom,
            "owner"
        )
    }
    val ClassLivesdkapiDependModelLiveRoom_ownerUserId: Field by HookGlobal.lazy("${javaClass.name}.getClassLivesdkapiDependModelLiveRoom_ownerUserId") {
        ReflecterHelper.findFieldIfExists(
            Classes.ClassLivesdkapiDependModelLiveRoom,
            "ownerUserId"
        )
    }

}
