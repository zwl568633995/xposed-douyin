package com.evan.dy.mirror.com.ss.android.ugc.aweme.following.repository

import com.ehook.HookGlobal
import com.ehook.helper.ReflecterHelper
import com.evan.dy.mirror.com.ss.android.ugc.aweme.following.repository.Classes.ClassFollowRelationApi_a
import java.lang.reflect.Field

object Fields {
    val getClassFollowRelationApi_A: Field by HookGlobal.lazy("${javaClass.name}.ClassFollowRelationApi_a") {
        ReflecterHelper.findFieldsWithType(
            Classes.ClassFollowRelationApi,
            ClassFollowRelationApi_a.name
        ).firstOrNull()
    }
}
