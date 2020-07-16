package com.evan.dy.mirror.com.ss.android.ugc.aweme.following.repository

import com.ehook.HookGlobal.classLoader
import com.ehook.HookGlobal.lazy
import com.ehook.helper.ReflecterHelper.findClassIfExists
import com.evan.dy.mirror.PackageUtils

object Classes {
    private  val packageName = PackageUtils.getPath(javaClass)
    val ClassFollowRelationApi: Class<*> by lazy("${javaClass.name}.ClassFollowRelationApi") {
        findClassIfExists("${packageName}.FollowRelationApi", classLoader!!)
    }
    val ClassFollowRelationApi_a: Class<*> by lazy("${javaClass.name}.ClassFollowRelationApi_a") {
        findClassIfExists("${packageName}.FollowRelationApi\$a", classLoader!!)
    }
}

