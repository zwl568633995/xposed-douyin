package com.evan.dy.mirror.com.ss.android.ugc.aweme

import com.ehook.HookGlobal.lazy
import com.ehook.helper.ReflecterHelper
import com.evan.dy.mirror.com.ss.android.ugc.aweme.profile.model.Classes.ClassProfileModelUser
import java.lang.reflect.Method

object Methods {
    val ClassIAccountUserService_getCurUser: Method by lazy("${javaClass.name}.ClassIAccountUserService_getCurUser") {
        ReflecterHelper.findMethodsByExactParameters(
            Classes.ClassIAccountUserService, ClassProfileModelUser
        ).firstOrNull()
    }
}
