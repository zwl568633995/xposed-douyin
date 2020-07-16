package com.evan.dy.mirror.com.bytedance.android.livesdk.gift.platform.core.manager

import com.ehook.HookGlobal.lazy
import com.ehook.core.Clazz
import com.ehook.helper.ReflecterHelper
import com.evan.dy.mirror.com.bytedance.android.livesdkapi.depend.model.live.Classes.ClassLivesdkapiDependModelLiveRoom
import java.lang.reflect.Method

object Methods {

    val ClassGiftManager_getGiftPageList: Method by lazy("${javaClass.name}.ClassGiftManager_getGiftPageList") {
        ReflecterHelper.findMethodIfExists(
            Classes.GiftManager,
            "getGiftPageList"
        )
    }
    val ClassGiftManager_inst: Method by lazy("${javaClass.name}.ClassGiftManager_inst") {
        ReflecterHelper.findMethodsByExactParameters(
            Classes.GiftManager,Classes.GiftManager
        ).firstOrNull()
    }
}
