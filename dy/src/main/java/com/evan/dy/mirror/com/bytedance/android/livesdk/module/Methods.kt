package com.evan.dy.mirror.com.bytedance.android.livesdk.module

import com.ehook.HookGlobal.lazy
import com.ehook.helper.ReflecterHelper
import com.evan.dy.mirror.com.bytedance.android.livesdkapi.depend.model.live.Classes.ClassLivesdkapiDependModelLiveRoom
import java.lang.reflect.Method

object Methods {
    val ClassLivesdkModuleRoomService_getCurrentRoom: Method by lazy("${javaClass.name}.ClassLivesdkModuleRoomService_setCurrentRoom") {
        ReflecterHelper.findMethodIfExists(
            Classes.ClassLivesdkModuleRoomService, "getCurrentRoom"
        )
    }
    val ClassLivesdkModuleRoomService_setCurrentRoom: Method by lazy("${javaClass.name}.ClassLivesdkModuleRoomService_getCurrentRoom") {
        ReflecterHelper.findMethodIfExists(
            Classes.ClassLivesdkModuleRoomService, "setCurrentRoom"
            ,ClassLivesdkapiDependModelLiveRoom
        )
    }
}
