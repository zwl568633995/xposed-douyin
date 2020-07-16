package com.evan.dy.plugins

import android.app.Activity
import android.os.Bundle
import com.ehook.plugins.interfaces.IActivityHook
import com.ehook.utils.LogUtil
import com.evan.dy.api.ChatRoomApi
import kotlin.jvm.internal.Intrinsics


object ActivityPlugin : IActivityHook {

    /*  ------------------  IActivityHook  ----------------- */
    override fun onCreate(activity: Activity, savedInstanceState: Bundle?) {
        LogUtil.e(
            ActivityPlugin.javaClass.simpleName,
            "onCreate  ${activity.javaClass.simpleName}"
        )
        if (activity.javaClass.simpleName.contains("ExternalWechatUserMessageListActivity")) {
//            Debug.hook()
        }
    }

    override fun onResume(activity: Activity) {
//        LogUtil.e(
//            ActivityPlugin.javaClass.simpleName,
//            "onResume  ${activity.javaClass.simpleName}"
//        )
//        ChatRoomApi.setCommentWidget(activity)

    }

    override fun onPause(activity: Activity) {
//        LogUtil.e(
//            ActivityPlugin.javaClass.simpleName,
//            "onPause  ${activity.javaClass.simpleName}"
//        )
//        if (Intrinsics.areEqual(ChatRoomApi.getCommentWidget(), activity)) {
//            ChatRoomApi.setCommentWidget(null)
//        }
    }
}
