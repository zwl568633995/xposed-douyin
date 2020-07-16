package com.xp.wx.backend.douyin.handler;

import android.os.Handler;
import android.text.TextUtils;
import com.xp.wx.backend.douyin.api.DyHookApi;
import com.xp.wx.backend.douyin.helper.DyRecordDBHelper;
import com.xp.wx.backend.douyin.model.ChatroomMessage;
import com.xp.wx.backend.douyin.model.DyConfig;
import com.xp.wx.backend.douyin.model.LiveRoom;
import com.xp.wx.backend.douyin.model.LiveUser;
import com.xp.wx.backend.douyin.model.PromotionResponse;
import com.xp.wx.backend.douyin.util.ChatroomUtil;
import com.xp.wx.backend.douyin.util.ConfigUtil;
import com.xp.wx.spellbook.douyin.DyGlobal;
import com.xp.wx.spellbook.douyin.model.User;
import com.xp.wx.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u001fH\u0002J\b\u0010!\u001a\u00020\u001fH\u0002J\b\u0010\"\u001a\u00020\u001fH\u0002J\b\u0010#\u001a\u00020\u001fH\u0002J\b\u0010$\u001a\u00020\u001fH\u0002J\u0010\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020'H\u0002J\u0010\u0010(\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020)H\u0002J\u000e\u0010*\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020,J\u0010\u0010-\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020.H\u0002J\u0010\u0010/\u001a\u00020\u001f2\u0006\u0010&\u001a\u000200H\u0002J\b\u00101\u001a\u00020\u001fH\u0002J\u0006\u00102\u001a\u00020\u001fJ\b\u00103\u001a\u00020\u001fH\u0002J\u0018\u00104\u001a\u00020\u001f2\u0006\u00105\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u001bH\u0002J\u0018\u00106\u001a\u00020\u001f2\u0006\u00107\u001a\u00020\u00042\u0006\u00108\u001a\u000209H\u0002J\b\u0010:\u001a\u00020\u001fH\u0002J\b\u0010;\u001a\u00020\u001fH\u0002J\b\u0010<\u001a\u00020\u001fH\u0002J\b\u0010=\u001a\u00020\u001fH\u0002J$\u0010=\u001a\u00020\u001f2\u001a\u0010>\u001a\u0016\u0012\u0004\u0012\u00020?\u0018\u00010\u001aj\n\u0012\u0004\u0012\u00020?\u0018\u0001`\u001cH\u0002J\u000e\u0010@\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010A\u001a\u00020\u001fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017RJ\u0010\u0018\u001a>\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001b0\u001aj\b\u0012\u0004\u0012\u00020\u001b`\u001c0\u0019j\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001b0\u001aj\b\u0012\u0004\u0012\u00020\u001b`\u001c`\u001dX\u0004¢\u0006\u0002\n\u0000¨\u0006B"}, d2 = {"Lcom/xp/wx/backend/douyin/handler/DyTaskHandler;", "", "()V", "MSG_AUTO_CLICK", "", "MSG_AUTO_SEND_BULLETIN", "MSG_AUTO_SEND_GIFT", "MSG_AUTO_SHOPPING", "MSG_SEND_SUBSCRIBE_MSG", "MSG_SEND_WELCOME_MSG", "TYPE_SUBSCRIBE", "TYPE_WELCOME", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "random", "Ljava/util/Random;", "room", "Lcom/xp/wx/backend/douyin/model/LiveRoom;", "getRoom", "()Lcom/xp/wx/backend/douyin/model/LiveRoom;", "setRoom", "(Lcom/xp/wx/backend/douyin/model/LiveRoom;)V", "sendMsgCache", "Ljava/util/HashMap;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "Lkotlin/collections/HashMap;", "autoClickNext", "", "autoSendBulletinNext", "autoSendGiftNext", "autoSendSubscribeMsgNext", "autoSendWelcomeMsgNext", "autoShoppingNext", "handleGiftMessage", "msg", "Lcom/xp/wx/backend/douyin/model/ChatroomMessage$GiftMessage;", "handleMemberMessage", "Lcom/xp/wx/backend/douyin/model/ChatroomMessage$MemberMessage;", "handleMessage", "message", "Lcom/xp/wx/backend/douyin/model/ChatroomMessage;", "handleSocialMessage", "Lcom/xp/wx/backend/douyin/model/ChatroomMessage$SocialMessage;", "handleTextMessage", "Lcom/xp/wx/backend/douyin/model/ChatroomMessage$TextMessage;", "like", "refreshTask", "sendBulletin", "sendCacheMsg", "type", "sendEmptyMessageDelayed", "what", "delay", "", "sendGift", "sendSubscribeMsg", "sendWelcomeMsg", "shopping", "promotions", "Lcom/xp/wx/backend/douyin/model/PromotionResponse$Promotion;", "startTask", "stopTask", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: DyTaskHandler.kt */
public final class DyTaskHandler {
    public static final DyTaskHandler INSTANCE = new DyTaskHandler();
    public static final int MSG_AUTO_CLICK = 100;
    public static final int MSG_AUTO_SEND_BULLETIN = 103;
    public static final int MSG_AUTO_SEND_GIFT = 101;
    public static final int MSG_AUTO_SHOPPING = 102;
    public static final int MSG_SEND_SUBSCRIBE_MSG = 105;
    public static final int MSG_SEND_WELCOME_MSG = 104;
    public static final int TYPE_SUBSCRIBE = 2;
    public static final int TYPE_WELCOME = 1;
    private static final Handler handler = new DyTaskHandler$handler$1();
    private static final Random random = new Random();
    private static LiveRoom room;
    private static final HashMap<Integer, ArrayList<String>> sendMsgCache = new HashMap<>();

    private DyTaskHandler() {
    }

    public final LiveRoom getRoom() {
        return room;
    }

    public final void setRoom(LiveRoom liveRoom) {
        room = liveRoom;
    }

    public final Handler getHandler() {
        return handler;
    }

    public final void refreshTask() {
        LiveRoom liveRoom = room;
        if (liveRoom != null) {
            if (liveRoom == null) {
                Intrinsics.throwNpe();
            }
            startTask(liveRoom);
        }
    }

    public final synchronized void startTask(LiveRoom liveRoom) {
        Intrinsics.checkParameterIsNotNull(liveRoom, "room");
        stopTask();
        room = liveRoom;
        String bindChatroomDyId = ConfigUtil.INSTANCE.getBindChatroomDyId();
        String displayId = liveRoom.getOwner().getDisplayId();
        if (!Intrinsics.areEqual((Object) bindChatroomDyId, (Object) displayId)) {
            Log.debug("not bind douyin, bind = " + bindChatroomDyId + ", current = " + displayId);
            return;
        }
        Log.debug("start task, room = " + liveRoom.getId());
        autoClickNext();
        autoSendGiftNext();
        autoShoppingNext();
        autoSendBulletinNext();
        autoSendSubscribeMsgNext();
        autoSendWelcomeMsgNext();
    }

    private final void sendEmptyMessageDelayed(int i, long j) {
        handler.removeMessages(i);
        handler.sendEmptyMessageDelayed(i, j);
    }

    public final synchronized void stopTask() {
        if (room != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("stop task, room = ");
            LiveRoom liveRoom = room;
            sb.append(liveRoom != null ? Long.valueOf(liveRoom.getId()) : null);
            Log.debug(sb.toString());
            handler.removeCallbacksAndMessages((Object) null);
            room = null;
        }
    }

    private final void autoSendSubscribeMsgNext() {
        if (ConfigUtil.INSTANCE.isReplySubscribeOpen()) {
            sendEmptyMessageDelayed(105, (((long) random.nextInt(5)) + 5) * ((long) 1000));
        }
    }

    private final void autoSendWelcomeMsgNext() {
        if (ConfigUtil.INSTANCE.isReplyWelcomeOpen()) {
            sendEmptyMessageDelayed(104, (((long) random.nextInt(5)) + 5) * ((long) 1000));
        }
    }

    private final void autoSendBulletinNext() {
        if (ConfigUtil.INSTANCE.isSendBulletinOpen()) {
            int bulletinInterval = ConfigUtil.INSTANCE.getBulletinInterval();
            if (bulletinInterval > 0) {
                sendEmptyMessageDelayed(103, ((long) bulletinInterval) * ((long) 1000));
            } else {
                Log.debug("autoSendBulletinNext. interval <= 0, not run.");
            }
        }
    }

    private final void autoClickNext() {
        if (ConfigUtil.INSTANCE.isAutoClickOpen()) {
            int autoClickInterval = ConfigUtil.INSTANCE.getAutoClickInterval();
            if (autoClickInterval > 0) {
                sendEmptyMessageDelayed(100, ((long) autoClickInterval) * ((long) 1000));
            } else {
                Log.debug("autoClickThreshold. interval <= 0, not run.");
            }
        }
    }

    private final void autoSendGiftNext() {
        if (ConfigUtil.INSTANCE.isAutoSendGiftOpen()) {
            int autoSendGiftInterval = ConfigUtil.INSTANCE.getAutoSendGiftInterval();
            if (autoSendGiftInterval > 0) {
                sendEmptyMessageDelayed(101, ((long) autoSendGiftInterval) * ((long) 1000));
            } else {
                Log.debug("autoSendGiftThreshold. interval <= 0, not run.");
            }
        }
    }

    private final void autoShoppingNext() {
        if (ConfigUtil.INSTANCE.isAutoShoppingOpen()) {
            int autoShoppingInterval = ConfigUtil.INSTANCE.getAutoShoppingInterval();
            if (autoShoppingInterval > 0) {
                sendEmptyMessageDelayed(102, ((long) autoShoppingInterval) * ((long) 1000));
            } else {
                Log.debug("autoShoppingThreshold. interval <= 0, not run.");
            }
        }
    }

    /* access modifiers changed from: private */
    public final void like() {
        if (room == null) {
            Log.debug("like. room = null");
        } else if (ConfigUtil.INSTANCE.isAutoClickOpen()) {
            Log.debug("like. send");
            DyHookApi hookApi = DyGlobal.INSTANCE.getHookApi();
            if (hookApi == null) {
                Intrinsics.throwNpe();
            }
            LiveRoom liveRoom = room;
            if (liveRoom == null) {
                Intrinsics.throwNpe();
            }
            hookApi.digg(liveRoom.getId(), 1, new DyTaskHandler$like$1());
            autoClickNext();
        }
    }

    /* access modifiers changed from: private */
    public final void sendGift() {
        if (room == null) {
            Log.debug("sendGift. room = null");
        } else if (ConfigUtil.INSTANCE.isAutoSendGiftOpen()) {
            int autoSendGiftThreshold = ConfigUtil.INSTANCE.getAutoSendGiftThreshold();
            int giftTotalPrice = DyRecordDBHelper.INSTANCE.getGiftTotalPrice();
            Log.debug("sendGift. todaySendGiftCount = " + giftTotalPrice);
            if (giftTotalPrice < autoSendGiftThreshold) {
                List<String> autoSendGift = ConfigUtil.INSTANCE.getAutoSendGift();
                if (!autoSendGift.isEmpty()) {
                    String str = autoSendGift.get(random.nextInt(autoSendGift.size()));
                    DyHookApi hookApi = DyGlobal.INSTANCE.getHookApi();
                    if (hookApi == null) {
                        Intrinsics.throwNpe();
                    }
                    long giftIdFromName = hookApi.getGiftIdFromName(str);
                    Log.debug("sendGift. match gift name = " + str + ", id = " + giftIdFromName);
                    if (giftIdFromName != -1) {
                        DyHookApi hookApi2 = DyGlobal.INSTANCE.getHookApi();
                        if (hookApi2 == null) {
                            Intrinsics.throwNpe();
                        }
                        LiveRoom liveRoom = room;
                        if (liveRoom == null) {
                            Intrinsics.throwNpe();
                        }
                        long ownerUserId = liveRoom.getOwnerUserId();
                        LiveRoom liveRoom2 = room;
                        if (liveRoom2 == null) {
                            Intrinsics.throwNpe();
                        }
                        hookApi2.sendGift(ownerUserId, liveRoom2.getId(), giftIdFromName, 1, new DyTaskHandler$sendGift$1());
                    } else {
                        return;
                    }
                } else {
                    Log.debug("sendGift. empty gift list");
                }
            } else {
                Log.debug("sendGift. Today has exceeded the limit, today = " + giftTotalPrice + ", threshold = " + autoSendGiftThreshold);
            }
            autoSendGiftNext();
        }
    }

    /* access modifiers changed from: private */
    public final void shopping() {
        if (room == null) {
            Log.debug("shopping. room = null");
        } else if (ConfigUtil.INSTANCE.isAutoShoppingOpen()) {
            DyHookApi hookApi = DyGlobal.INSTANCE.getHookApi();
            if (hookApi == null) {
                Intrinsics.throwNpe();
            }
            LiveRoom liveRoom = room;
            if (liveRoom == null) {
                Intrinsics.throwNpe();
            }
            String valueOf = String.valueOf(liveRoom.getOwnerUserId());
            LiveRoom liveRoom2 = room;
            if (liveRoom2 == null) {
                Intrinsics.throwNpe();
            }
            String secUid = liveRoom2.getOwner().getSecUid();
            LiveRoom liveRoom3 = room;
            if (liveRoom3 == null) {
                Intrinsics.throwNpe();
            }
            hookApi.getLivePromotions(valueOf, secUid, String.valueOf(liveRoom3.getId()), new DyTaskHandler$shopping$1());
            autoShoppingNext();
        }
    }

    /* access modifiers changed from: private */
    public final void shopping(ArrayList<PromotionResponse.Promotion> arrayList) {
        if (room == null) {
            Log.debug("shopping. room == null");
        } else if (arrayList == null || arrayList.isEmpty()) {
            Log.debug("shopping. empty promotions");
        } else {
            PromotionResponse.Promotion promotion = arrayList.get(random.nextInt(arrayList.size()));
            Intrinsics.checkExpressionValueIsNotNull(promotion, "promotions.get(random.nextInt(promotions.size))");
            PromotionResponse.Promotion promotion2 = promotion;
            Log.debug("shopping. promotion = " + promotion2.promotion_id);
            DyHookApi hookApi = DyGlobal.INSTANCE.getHookApi();
            if (hookApi == null) {
                Intrinsics.throwNpe();
            }
            LiveRoom liveRoom = room;
            if (liveRoom == null) {
                Intrinsics.throwNpe();
            }
            long ownerUserId = liveRoom.getOwnerUserId();
            LiveRoom liveRoom2 = room;
            if (liveRoom2 == null) {
                Intrinsics.throwNpe();
            }
            String secUid = liveRoom2.getOwner().getSecUid();
            LiveRoom liveRoom3 = room;
            if (liveRoom3 == null) {
                Intrinsics.throwNpe();
            }
            long id = liveRoom3.getId();
            String str = promotion2.promotion_id;
            Intrinsics.checkExpressionValueIsNotNull(str, "promotion.promotion_id");
            hookApi.sendLiveEvent(ownerUserId, secUid, id, str, new DyTaskHandler$shopping$2());
        }
    }

    /* access modifiers changed from: private */
    public final void sendBulletin() {
        if (room == null) {
            Log.debug("sendBulletin. room == null");
        } else if (ConfigUtil.INSTANCE.isSendBulletinOpen()) {
            String bulletinContent = ConfigUtil.INSTANCE.getBulletinContent();
            if (!TextUtils.isEmpty(bulletinContent)) {
                ChatroomUtil chatroomUtil = ChatroomUtil.INSTANCE;
                LiveRoom liveRoom = room;
                if (liveRoom == null) {
                    Intrinsics.throwNpe();
                }
                chatroomUtil.sendRoomTextMsg(StringsKt.replace$default(bulletinContent, "[主播]", liveRoom.getOwner().getNickName(), false, 4, (Object) null));
            } else {
                Log.debug("sendBulletin. empty bulletinContent");
            }
            autoSendBulletinNext();
        }
    }

    public final void handleMessage(ChatroomMessage chatroomMessage) {
        Intrinsics.checkParameterIsNotNull(chatroomMessage, "message");
        if (room == null) {
            Log.debug("handleMessage. room == null");
            return;
        }
        ChatroomMessage.Message message = chatroomMessage.getMessage();
        LiveUser user = message.getUser();
        if (user != null) {
            long uid = user.getUid();
            String valueOf = String.valueOf(uid);
            DyHookApi hookApi = DyGlobal.INSTANCE.getHookApi();
            if (hookApi == null) {
                Intrinsics.throwNpe();
            }
            User currUser = hookApi.getCurrUser();
            if (!Intrinsics.areEqual((Object) valueOf, (Object) currUser != null ? currUser.getUid() : null)) {
                LiveRoom liveRoom = room;
                if (liveRoom == null) {
                    Intrinsics.throwNpe();
                }
                if (uid != liveRoom.getOwnerUserId()) {
                    if (message instanceof ChatroomMessage.TextMessage) {
                        handleTextMessage((ChatroomMessage.TextMessage) message);
                    } else if (message instanceof ChatroomMessage.MemberMessage) {
                        handleMemberMessage((ChatroomMessage.MemberMessage) message);
                    } else if (message instanceof ChatroomMessage.GiftMessage) {
                        handleGiftMessage((ChatroomMessage.GiftMessage) message);
                    } else if (message instanceof ChatroomMessage.SocialMessage) {
                        handleSocialMessage((ChatroomMessage.SocialMessage) message);
                    }
                }
            }
        }
    }

    private final void handleSocialMessage(ChatroomMessage.SocialMessage socialMessage) {
        if (socialMessage.getAction() != 1) {
            Log.debug("handleSocialMessage. action = " + socialMessage.getAction());
        } else if (TextUtils.isEmpty(ConfigUtil.INSTANCE.getReplySubscribeContent())) {
            Log.debug("empty replySubscribeContent");
        } else {
            String nickName = socialMessage.getUser().getNickName();
            ArrayList arrayList = sendMsgCache.get(2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                sendMsgCache.put(2, arrayList);
            }
            if (!arrayList.contains(nickName)) {
                arrayList.add(nickName);
            }
        }
    }

    private final void handleMemberMessage(ChatroomMessage.MemberMessage memberMessage) {
        if (TextUtils.isEmpty(ConfigUtil.INSTANCE.getReplyWelcomeContent())) {
            Log.debug("handleMemberMessage. empty replyWelcomeContent");
            return;
        }
        String nickName = memberMessage.getUser().getNickName();
        ArrayList arrayList = sendMsgCache.get(1);
        if (arrayList == null) {
            arrayList = new ArrayList();
            sendMsgCache.put(1, arrayList);
        }
        if (!arrayList.contains(nickName)) {
            arrayList.add(nickName);
        }
    }

    private final void handleTextMessage(ChatroomMessage.TextMessage textMessage) {
        DyConfig.ReplyKeywordList<DyConfig.ReplyKeyword> replyKeywordContent = ConfigUtil.INSTANCE.getReplyKeywordContent();
        if (!replyKeywordContent.isEmpty()) {
            String text = textMessage.getText();
            for (DyConfig.ReplyKeyword replyKeyword : replyKeywordContent) {
                if (Intrinsics.areEqual((Object) replyKeyword.key, (Object) text) && !TextUtils.isEmpty(replyKeyword.value)) {
                    String nickName = textMessage.getUser().getNickName();
                    ChatroomUtil chatroomUtil = ChatroomUtil.INSTANCE;
                    chatroomUtil.sendRoomTextMsg('@' + nickName + ' ' + replyKeyword.value);
                    return;
                }
            }
        }
    }

    private final void handleGiftMessage(ChatroomMessage.GiftMessage giftMessage) {
        Object obj;
        if (giftMessage.getGiftObj() != null) {
            int repeatEnd = giftMessage.getRepeatEnd();
            if (!giftMessage.combo() || repeatEnd != 0) {
                String replyGiftContent = ConfigUtil.INSTANCE.getReplyGiftContent();
                if (TextUtils.isEmpty(replyGiftContent)) {
                    Log.debug("handleGiftMessage. empty replyGiftContent");
                    return;
                }
                String giftName = giftMessage.getGiftName();
                List<String> replyGift = ConfigUtil.INSTANCE.getReplyGift();
                if (!replyGift.isEmpty()) {
                    Iterator it = replyGift.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (Intrinsics.areEqual((Object) (String) obj, (Object) giftName)) {
                            break;
                        }
                    }
                    if (((String) obj) != null) {
                        Log.debug("handleGiftMessage. find gift in config, filter, name = " + giftName);
                        return;
                    }
                }
                String nickName = giftMessage.getUser().getNickName();
                ChatroomUtil chatroomUtil = ChatroomUtil.INSTANCE;
                chatroomUtil.sendRoomTextMsg('@' + nickName + ' ' + StringsKt.replace$default(replyGiftContent, "[礼物名称]", giftName, false, 4, (Object) null));
                return;
            }
            Log.debug("handleGiftMessage. wait repeatEnd = " + repeatEnd);
        }
    }

    /* access modifiers changed from: private */
    public final void sendWelcomeMsg() {
        String replyWelcomeContent = ConfigUtil.INSTANCE.getReplyWelcomeContent();
        if (TextUtils.isEmpty(replyWelcomeContent)) {
            Log.debug("handleMemberMessage. empty replyWelcomeContent");
            return;
        }
        sendCacheMsg(1, replyWelcomeContent);
        autoSendWelcomeMsgNext();
    }

    /* access modifiers changed from: private */
    public final void sendSubscribeMsg() {
        String replySubscribeContent = ConfigUtil.INSTANCE.getReplySubscribeContent();
        if (TextUtils.isEmpty(replySubscribeContent)) {
            Log.debug("empty replySubscribeContent");
            return;
        }
        sendCacheMsg(2, replySubscribeContent);
        autoSendSubscribeMsgNext();
    }

    private final void sendCacheMsg(int i, String str) {
        ArrayList arrayList = sendMsgCache.get(Integer.valueOf(i));
        if (arrayList != null) {
            Intrinsics.checkExpressionValueIsNotNull(arrayList, "sendMsgCache[type] ?: return");
            if (!arrayList.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                ArrayList arrayList2 = new ArrayList();
                int length = str.length() + 1;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (str2.length() + 1 + length > 40) {
                        break;
                    }
                    arrayList2.add(str2);
                    length += str2.length() + 1;
                    sb.append("@");
                    sb.append(str2);
                }
                if (!arrayList2.isEmpty()) {
                    arrayList.removeAll(arrayList2);
                    ChatroomUtil chatroomUtil = ChatroomUtil.INSTANCE;
                    sb.append(" ");
                    sb.append(str);
                    String sb2 = sb.toString();
                    Intrinsics.checkExpressionValueIsNotNull(sb2, "sb.append(\" \").append(msg).toString()");
                    chatroomUtil.sendRoomTextMsg(sb2);
                }
            }
        }
    }
}
