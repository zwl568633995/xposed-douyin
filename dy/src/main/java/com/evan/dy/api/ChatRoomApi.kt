package com.evan.dy.api

import com.ehook.helper.TryHelper
import com.ehook.utils.LogUtil
import com.evan.dy.api.callback.EICommonCallback
import com.evan.dy.api.model.GiftPage
import com.evan.dy.api.model.LiveRoom
import com.evan.dy.api.model.dy.DyResult
import com.evan.dy.api.model.dy.PromotionResponse
import com.evan.dy.mirror.com.bytedance.android.live.network.Methods.ClassLiveNetworkC_a
import com.evan.dy.mirror.com.bytedance.android.live.network.Methods.ClassLiveNetworkC_instance
import com.evan.dy.mirror.com.bytedance.android.livesdk.chatroom.viewmodule.Methods.ClassCommentWidget_a
import com.evan.dy.mirror.com.bytedance.android.livesdk.chatroom.viewmodule.digg.Classes.ClassDiggApi
import com.evan.dy.mirror.com.bytedance.android.livesdk.chatroom.viewmodule.digg.Methods.ClassDiggApi_digg
import com.evan.dy.mirror.com.bytedance.android.livesdk.gift.platform.core.api.Classes.ClassGiftRetrofitApi
import com.evan.dy.mirror.com.bytedance.android.livesdk.gift.platform.core.api.Methods.ClassGiftRetrofitApi_send4
import com.evan.dy.mirror.com.bytedance.android.livesdk.gift.platform.core.manager.Methods.ClassGiftManager_getGiftPageList
import com.evan.dy.mirror.com.bytedance.android.livesdk.gift.platform.core.manager.Methods.ClassGiftManager_inst
import com.evan.dy.mirror.com.bytedance.android.livesdk.livecommerce.b.Methods.FunLivesdkLivecommerceB_o_c
import com.evan.dy.mirror.com.bytedance.android.livesdk.livecommerce.h.Classes
import com.evan.dy.mirror.com.bytedance.android.livesdk.livecommerce.h.Classes.ClassLivesdkLivecommerceHD
import com.evan.dy.mirror.com.bytedance.android.livesdk.livecommerce.h.Fields.ClassLivesdkLivecommerceHA_d
import com.evan.dy.mirror.com.bytedance.android.livesdk.livecommerce.h.Fields.ClassLivesdkLivecommerceHA_h
import com.evan.dy.mirror.com.bytedance.android.livesdk.livecommerce.h.Methods.ClassLivesdkLivecommerceHC_b
import com.evan.dy.mirror.com.bytedance.android.livesdk.livecommerce.h.Methods.FunLivesdkLivecommerceHB_a
import com.evan.dy.mirror.com.bytedance.android.livesdk.livecommerce.h.Methods.FunLivesdkLivecommerceHD_add
import com.evan.dy.utils.JsonUtils
import de.robv.android.xposed.XposedHelpers
import java.util.*
import kotlin.jvm.internal.Intrinsics

object ChatRoomApi {

    private var room: LiveRoom? = null
    private var commentWidget: Any? = null
    private val random = Random()

    fun setCommentWidget(commentWidget: Any?) {
        this.commentWidget = commentWidget
    }

    fun getCommentWidget(): Any? {
        return this.commentWidget
    }

    fun setRoom(room: LiveRoom?) {
        this.room = room
    }

    fun getRoom(): LiveRoom? {
        return room
    }

    fun sendRoomTextMsg(content: String, callback: EICommonCallback) {
        LogUtil.e("ChatRoomApi", "sendRoomTextMsg. msg = $content commentWidget=$commentWidget")
        if (this.commentWidget == null) {
            callback?.onResult(-1, "重新进入", null)
            return
        }
        ClassCommentWidget_a.invoke(commentWidget, content, false, false)
        callback?.onResult(0, content, content)
    }

    /**
     * 发送礼物
     */
    fun sendGift(
        giftName: String,
        count: Int,
        callback: EICommonCallback
    ) {
        LogUtil.e("ChatRoomApi", "sendGift.giftName =$giftName count=$count")
        if (giftName == null) {
            callback?.onResult(-1, "giftName == null", null)
            return
        }
        if (this.room == null) {
            callback?.onResult(-1, "先进入直播间", null)
            return
        }
        val giftIdFromName = getGiftIdFromName(giftName)
        if (giftIdFromName < 0) {
            callback?.onResult(-1, "未找到该礼品", null)
            return
        }
        sendGift(this.room?.ownerUserId, this.room?.id, giftIdFromName, count, callback)
    }

    /**
     * 发送礼物
     */
    fun sendGift(
        ownerUserId: Long?,
        roomId: Long?,
        giftId: Long?,
        count: Int?,
        callback: EICommonCallback?
    ) {
        val invoke = ClassLiveNetworkC_instance.invoke(null)
        val invoke2 = ClassLiveNetworkC_a.invoke(invoke, ClassGiftRetrofitApi)
        val invoke3 = ClassGiftRetrofitApi_send4.invoke(invoke2, giftId, roomId, ownerUserId, count)
        DyHookApi.request(invoke3, callback)
    }

    /**
     * 点赞
     */
    fun digg(roomId: Long?, i: Int?, callback: EICommonCallback?) {
        val invoke = ClassLiveNetworkC_instance.invoke(null)
        val invoke2 = ClassLiveNetworkC_a.invoke(invoke, ClassDiggApi)
        val invoke1 = ClassDiggApi_digg.invoke(invoke2, roomId, i)
        DyHookApi.request(invoke1, callback)
    }

    /**
     * 点赞
     */
    fun digg(callback: EICommonCallback) {
        if (this.room == null) {
            callback?.onResult(-1, "先进入直播间", null)
            return
        }
        digg(this.room?.id, 1, callback)
    }

    /**
     * 获取商品
     */
    fun getLivePromotions(
        callback: EICommonCallback?
    ) {
        var roomId = this.room?.id
        var authorId = this.room?.ownerUserId
        var secAuthorId = this.room?.owner?.secUid
        TryHelper.tryAsynchronously {
            val newInstance = XposedHelpers.newInstance(ClassLivesdkLivecommerceHD)
            val invoke = FunLivesdkLivecommerceHB_a.invoke(null, "author_id", authorId.toString())
            FunLivesdkLivecommerceHD_add.invoke(newInstance, invoke)
            val invoke2 = FunLivesdkLivecommerceHB_a.invoke(null, "sec_author_id", secAuthorId)
            FunLivesdkLivecommerceHD_add.invoke(newInstance, invoke2)
            val invoke3 = FunLivesdkLivecommerceHB_a.invoke(null, "room_id", roomId.toString())
            FunLivesdkLivecommerceHD_add.invoke(newInstance, invoke3)
            val invoke4 = FunLivesdkLivecommerceB_o_c.invoke(null)
            val invoke5 = FunLivesdkLivecommerceHB_a.invoke(null, "entrance_info", invoke4)
            FunLivesdkLivecommerceHD_add.invoke(newInstance, invoke5)
            val invoke6 = FunLivesdkLivecommerceHB_a.invoke(null, "first_enter", "false")
            FunLivesdkLivecommerceHD_add.invoke(newInstance, invoke6)
            val obj = ClassLivesdkLivecommerceHA_d.get(null)
//            val response = ClassLivesdkLivecommerceHC_b.invoke(null, obj, newInstance)
            val response = XposedHelpers.callStaticMethod(Classes.ClassLivesdkLivecommerceHC, "b", obj, newInstance)
            if (response != null) {
                var responseStr = response as String;
                LogUtil.e(ChatRoomApi::class.java, "getLivePromotions responseStr=$responseStr")
                val promotionResponse = JsonUtils.fromJson(responseStr, PromotionResponse::class.java)
                if (promotionResponse.status_code == 0) {
                    callback?.onResult(0, "success", promotionResponse)
                }else{
                    callback?.onResult(-1, "fail", promotionResponse)
                }
            } else {
                callback?.onResult(-1, "fail", response)
            }
        }
    }

    /**
     * 刷单
     */
    fun sendLiveEvent(callback: EICommonCallback?){
        if (this.room == null) {
            callback?.onResult(-1, "先进入直播间", null)
            return
        }
        getLivePromotions(object :EICommonCallback{
            override fun onResult(code: Int?, message: String?, obj: Any?) {
                if (code == 0 && obj is PromotionResponse) {
                    val p =obj as PromotionResponse;
                    var arrayList = p.promotions
                    val promotion = arrayList[random.nextInt(  arrayList.size )]
                    LogUtil.e(ChatRoomApi::class.java, "promotion =${promotion.promotion_id}")
                    sendLiveEvent(room?.id, room?.ownerUserId, room?.owner?.secUid, promotion.promotion_id, callback)
                } else {
                    callback?.onResult(code, message, obj)
                }
            }
        })
    }

    fun sendLiveEvent(
        roomId: Long?,
        ownerUserId: Long?,
        secUid: String?,
        promotion_ids: String,
        callback: EICommonCallback?
    ) {
        val newInstance = XposedHelpers.newInstance(ClassLivesdkLivecommerceHD)
        val invoke = FunLivesdkLivecommerceHB_a.invoke(null, "room_id", roomId.toString())
        FunLivesdkLivecommerceHD_add.invoke(newInstance, invoke)
        val invoke2 = FunLivesdkLivecommerceHB_a.invoke(null, "event_type", "1")
        FunLivesdkLivecommerceHD_add.invoke(newInstance, invoke2)
        val invoke3 = FunLivesdkLivecommerceHB_a.invoke(null, "author_id", ownerUserId.toString())
        FunLivesdkLivecommerceHD_add.invoke(newInstance, invoke3)
        val invoke4 = FunLivesdkLivecommerceHB_a.invoke(null, "sec_author_id", secUid)
        FunLivesdkLivecommerceHD_add.invoke(newInstance, invoke4)
        val invoke5 = FunLivesdkLivecommerceHB_a.invoke(null, "promotion_ids", promotion_ids)
        FunLivesdkLivecommerceHD_add.invoke(newInstance, invoke5)
        val invoke6 = FunLivesdkLivecommerceHB_a.invoke(null, "promotion_ids", null)
        FunLivesdkLivecommerceHD_add.invoke(newInstance, invoke6)
        val obj: Any = ClassLivesdkLivecommerceHA_h.get(null)
        val dyResponse = JsonUtils.fromJson(
            ClassLivesdkLivecommerceHC_b.invoke(
                null,
                obj,
                newInstance
            ) as String, DyResult::class.java
        )
        if (dyResponse != null) {
            callback?.onResult(0, "success", dyResponse)
        } else {
            callback?.onResult(-1, "fail", dyResponse)
        }
    }

    private fun getGiftPageList(): GiftPage {
        val giftList = ClassGiftManager_getGiftPageList.invoke(ClassGiftManager_inst.invoke(null))
        return GiftPage(giftList as MutableList<Any>?)
//        LogUtil.e(ChatRoomApi::class.java, JsonUtils.toJson(giftList))
    }

    fun getGiftIdFromName(str: String?): Long {
        val giftPage = getGiftPageList() ?: return -1
        val gifts = giftPage.gifts
        if (gifts != null && gifts.size > 0) {
            for (obj in gifts) {
                if (Intrinsics.areEqual(obj.name, str)) {
                    return obj.id
                }
            }
        }
        return -1
    }


}
