package com.evan.dy.mirror.com.ss.android.ugc.aweme.account

import com.ehook.HookGlobal.lazy
import com.ehook.helper.ReflecterHelper
import com.evan.dy.mirror.com.ss.android.ugc.aweme.Classes.ClassIAccountUserService
import java.lang.reflect.Method

object Methods {
    val ClassAccountE_e: Method by lazy("${javaClass.name}.ClassAccountE_e") {
        ReflecterHelper.findMethodsByExactParameters(
            Classes.ClassAccountE, ClassIAccountUserService
        ).firstOrNull()
    }
}
