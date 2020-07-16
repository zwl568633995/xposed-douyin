package com.evan.dy.mirror.com.bytedance.retrofit2

import com.ehook.HookGlobal.lazy
import com.ehook.helper.ReflecterHelper
import com.evan.dy.mirror.com.ss.android.ugc.aweme.Classes.ClassIAccountUserService
import de.robv.android.xposed.XposedHelpers.findMethodExactIfExists
import java.lang.reflect.Method

object Methods {
    val getClassCall_execute: Method by lazy("${javaClass.name}.getClassCall_execute") {
        findMethodExactIfExists(
            Classes.getClassCall, "execute"
        )
    }
    val getClassSsResponse_body: Method by lazy("${javaClass.name}.getClassSsResponse_body") {
        findMethodExactIfExists(
            Classes.getClassSsResponse, "body"
        )
    }
    val getClassSsResponse_isSuccessful: Method by lazy("${javaClass.name}.getClassSsResponse_isSuccessful") {
        findMethodExactIfExists(
            Classes.getClassSsResponse, "isSuccessful"
        )
    }
}
