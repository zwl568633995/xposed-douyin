package com.evan.dy.mirror.com.ss.android.ugc.aweme.following.repository

import com.ehook.HookGlobal.lazy
import com.ehook.core.Clazz
import com.ehook.helper.ReflecterHelper
import com.evan.dy.mirror.com.ss.android.ugc.aweme.Classes.ClassIAccountUserService
import de.robv.android.xposed.XposedHelpers.findMethodExactIfExists
import java.lang.reflect.Method

object Methods {
    val ClassFollowRelationApi_a_a: Method by lazy("${javaClass.name}.ClassFollowRelationApi_a_a") {
        ReflecterHelper.findMethodsByExactParameters(
            Classes.ClassFollowRelationApi_a, Classes.ClassFollowRelationApi
        ).firstOrNull()
    }
    val ClassFollowRelationApi_queryFollowerList: Method by lazy("${javaClass.name}.ClassFollowRelationApi_queryFollowerList") {
        findMethodExactIfExists(
            Classes.ClassFollowRelationApi, "queryFollowerList", Clazz.String, Clazz.String, Clazz.Long, Clazz.Int,
            Clazz.Int, Clazz.Int, Clazz.Int, Clazz.Int, Clazz.Int)
    }
}
