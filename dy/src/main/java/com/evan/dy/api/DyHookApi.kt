package com.evan.dy.api

import com.ehook.HookGlobal
import com.ehook.helper.TryHelper
import com.ehook.utils.LogUtil
import com.evan.dy.api.callback.EICommonCallback
import com.evan.dy.api.model.FollowerUser
import com.evan.dy.api.model.ProfileUser
import com.evan.dy.api.model.dy.DyProfileUser
import com.evan.dy.mirror.com.bytedance.android.live.f.Methods.ClassLiveFD_a
import com.evan.dy.mirror.com.bytedance.android.live.room.Classes.ClassLiveRoomM
import com.evan.dy.mirror.com.bytedance.android.livesdk.module.Methods.ClassLivesdkModuleRoomService_getCurrentRoom
import com.evan.dy.mirror.com.bytedance.im.core.c.Methods.ClassImCoreCE_a
import com.evan.dy.mirror.com.bytedance.retrofit2.Classes.getClassCall
import com.evan.dy.mirror.com.bytedance.retrofit2.Methods.getClassCall_execute
import com.evan.dy.mirror.com.bytedance.retrofit2.Methods.getClassSsResponse_body
import com.evan.dy.mirror.com.bytedance.retrofit2.Methods.getClassSsResponse_isSuccessful
import com.evan.dy.mirror.com.ss.android.ugc.aweme.Methods.ClassIAccountUserService_getCurUser
import com.evan.dy.mirror.com.ss.android.ugc.aweme.account.Methods.ClassAccountE_e
import com.evan.dy.mirror.com.ss.android.ugc.aweme.following.repository.Fields.getClassFollowRelationApi_A
import com.evan.dy.mirror.com.ss.android.ugc.aweme.following.repository.Methods.ClassFollowRelationApi_a_a
import com.evan.dy.mirror.com.ss.android.ugc.aweme.following.repository.Methods.ClassFollowRelationApi_queryFollowerList
import com.evan.dy.mirror.com.ss.android.ugc.aweme.im.sdk.chat.model.Classes.ClassImSdkChatModelBaseContent
import com.evan.dy.mirror.com.ss.android.ugc.aweme.im.sdk.chat.model.Classes.ClassImSdkChatModelTextContent
import com.evan.dy.mirror.com.ss.android.ugc.aweme.im.sdk.utils.Methods.ClassImSdkUtilsBh_b
import com.evan.dy.mirror.com.ss.android.ugc.aweme.im.sdk.utils.Methods.ClassImSdkUtilsBh_instance
import com.evan.dy.mirror.io.reactivex.Classes.ClassIoReactivexObservable
import com.evan.dy.utils.JsonUtils
import de.robv.android.xposed.XposedHelpers
import java.lang.reflect.Proxy
import java.util.*
import kotlin.jvm.internal.Intrinsics

object DyHookApi {

    fun getCurrUser(): DyProfileUser? {
        var userModel = ClassIAccountUserService_getCurUser.invoke(ClassAccountE_e.invoke(null))
            ?: return null
        return ProfileUser(userModel).user
    }

    fun sendChatText(userID: Long?, content: String, callback: EICommonCallback?) {
        Intrinsics.checkParameterIsNotNull(userID, "userId")
        Intrinsics.checkParameterIsNotNull(content, "text")
        val conversationId = getConversationId(userID)
        val textContentInstance = XposedHelpers.newInstance(ClassImSdkChatModelTextContent)
        val textContent = XposedHelpers.callMethod(textContentInstance, "obtain", content)
        val valueOf = java.lang.Long.valueOf(System.currentTimeMillis())
        XposedHelpers.callMethod(XposedHelpers.newInstance(ClassImSdkChatModelBaseContent), "setSendStartTime", valueOf)
        val instance = ClassImSdkUtilsBh_instance.invoke(null)
        ClassImSdkUtilsBh_b.invoke(instance, conversationId, textContent, null)
        LogUtil.e(DyHookApi::class.java, "sendChatText ID=$userID content=$content")
        callback?.onResult(0, "success", content)
    }



    fun getConversationId(userID: Long?): String {
        Intrinsics.checkParameterIsNotNull(userID, "userId")
        val conversationId = ClassImCoreCE_a.invoke(null as Any?, userID)
        return conversationId as String
    }

    fun getCurRoom(): Any? {
        val invoke = ClassLiveFD_a.invoke(null, ClassLiveRoomM);
        LogUtil.e(DyHookApi::class.java, "getCurRoom=$invoke")
//        return XposedHelpers.callMethod(invoke,"getCurrentRoom")
        return try {
            ClassLivesdkModuleRoomService_getCurrentRoom.invoke(invoke)
        } catch (e: Exception) {
            null
        }
    }

    fun sendRoomTextMsg(str: String,callback: EICommonCallback?) {
        val currentRoom = getCurRoom()
        if (currentRoom == null) {
            callback?.onResult(-1, "先进入直播间", null)
            return
        }
        LogUtil.e(DyHookApi::class.java.simpleName, "send $str currentRoom${currentRoom.toString()}")
        val findClass= XposedHelpers.findClass("com.bytedance.android.livesdk.chatroom.presenter.c", HookGlobal.classLoader)
        val findClass2 = XposedHelpers.findClass("com.bytedance.android.livesdk.chatroom.presenter.c\$a", HookGlobal.classLoader)
        val findClass3 = XposedHelpers.findClass("com.bytedance.ies.sdk.widgets.DataCenter", HookGlobal.classLoader)
        val newInstance = XposedHelpers.newInstance(findClass)
        XposedHelpers.setObjectField(newInstance, "w", XposedHelpers.newInstance(findClass3))
        val newProxyInstance = Proxy.newProxyInstance(
            HookGlobal.classLoader,
            arrayOf(findClass2)
        ) { _, method, args ->

        }
        XposedHelpers.callMethod(newInstance, "a", *arrayOf(newProxyInstance::class.java), newProxyInstance)
        XposedHelpers.setObjectField(newInstance, "d", currentRoom)
        val findClass4 = XposedHelpers.findClass("com.bytedance.android.live.browser.jsbridge.b.r", HookGlobal.classLoader)
        val staticObjectField = XposedHelpers.getStaticObjectField(XposedHelpers.findClass("com.bytedance.android.live.browser.jsbridge.b.c\$a", HookGlobal.classLoader), "CommentWidget")
        val hashMap: HashMap<String?, String?> = HashMap<String?, String?>()
        hashMap["live.intent.extra.ENTER_LIVE_SOURCE"] = ""
        XposedHelpers.callMethod(newInstance, "a", XposedHelpers.newInstance(findClass4, str, staticObjectField, hashMap))
        callback?.onResult(0, "success", currentRoom)
    }
    /**
     * 群发消息
     * count -1全部
     * gender -1 全部 1 男 2女
     * followStatus -1全部 0 粉丝 2相互关注
     */
    fun sendMass(count: Int, gender: Int, followStatus: Int,content: String,callback: EICommonCallback?) {
        getFollowerAndSendText(count, gender, followStatus, 0, 0, content)
        callback?.onResult(0, "success", content)
    }

    fun getFollowerAndSendText(count: Int, gender: Int, followStatus: Int, maxTime: Long, offset: Int,content: String) {
        getFollowerList(maxTime, 1, offset, object : EICommonCallback {
            override fun onResult(code: Int?, message: String?, obj: Any?) {
                if (code == 0 && obj != null) {
                    val followerUser = FollowerUser(obj)
                    val byFollowers = followerUser.getByFollowers(gender, followStatus)
                    LogUtil.e(DyHookApi::class.java,"byFollowers=${byFollowers.size} followerUser${followerUser.followers.size}")
                    if (byFollowers != null && byFollowers.size > 0) {
                        byFollowers.forEach {
                            sendChatText(it.id, content, null)
                        }
                    }
                    LogUtil.e(DyHookApi::class.java,"hasMore=${followerUser.hasMore()} offset=${followerUser.offset} total=${followerUser.total} min_time=${followerUser.min_time}")
                    if (followerUser.hasMore() && (count > followerUser.offset || count == -1)) {
                        getFollowerAndSendText(
                            count, gender, followStatus,
                            followerUser.min_time,
                            followerUser.offset, content
                        )
                    }
                }
            }
        })
    }
    fun getFollowerList(maxTime: Long, pageCount: Int, offset: Int, callback: EICommonCallback?) {
        val currUser = getCurrUser()
        if (currUser != null) {
            getFollowerList(currUser?.uid, currUser?.secUid, maxTime, pageCount, offset, callback)
        } else {
            callback?.onResult(-1, "获取当前用户失败", "")
        }
    }

    fun getFollowerList(uid: Long, secUid: String?, maxTime: Long, pageCount: Int = 20, offset: Int = 0, callback: EICommonCallback?) {
        Intrinsics.checkParameterIsNotNull(secUid, "secUid")
        Intrinsics.checkParameterIsNotNull(callback, "callback")
        val get = getClassFollowRelationApi_A.get(null)
        val invoke = ClassFollowRelationApi_a_a.invoke(get)
        val objArr = arrayOfNulls<Any>(9)
        objArr[0] = uid.toString()
        var i = 1
        objArr[1] = secUid
        objArr[2] = java.lang.Long.valueOf(maxTime)
        objArr[3] = pageCount
        objArr[4] = offset
//        if (maxTime == 0L) {
//            i = 2
//        }
        objArr[5] = Integer.valueOf(i)
        objArr[6] = 1
        objArr[7] = 1
        objArr[8] = 0
        val invoke1 = ClassFollowRelationApi_queryFollowerList.invoke(invoke, *objArr)
        request(invoke1, callback)
    }

    fun request(obj: Any?, callback: EICommonCallback?) {
        if (obj == null) {
            callback?.onResult(-1, "obj = null", "")
            return
        }
        val obj2 = XposedHelpers.findFirstFieldByExactType(obj.javaClass, ClassIoReactivexObservable)[obj]
        val ssHttpCall = XposedHelpers.findFirstFieldByExactType(obj2.javaClass, getClassCall)[obj2]
        var it = getClassCall_execute.invoke(ssHttpCall)
        TryHelper.tryAsynchronously {
            val invoke = getClassSsResponse_isSuccessful.invoke(it)
            if (invoke != null && invoke is Boolean && invoke == true) {
                var body = getClassSsResponse_body.invoke(it)
//                LogUtil.e(DyHookApi::class.java, JsonUtils.toJson(body))
                callback?.onResult(0, "success", body)
            } else {
                callback?.onResult(-1, "fail", "")
            }
        }
    }
}
