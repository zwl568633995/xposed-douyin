package com.xp.wx.backend.douyin.handler;

import android.os.Handler;
import android.text.TextUtils;
import com.xp.wx.backend.douyin.api.DyHookApi;
import com.xp.wx.backend.douyin.util.ConfigUtil;
import com.xp.wx.spellbook.douyin.DyGlobal;
import com.xp.wx.spellbook.douyin.model.User;
import com.xp.wx.util.Log;
import com.xp.wx.util.SharedPreferenceUtil;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0018\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004H\u0002J\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0002J\b\u0010\u001e\u001a\u00020\u0017H\u0002J\b\u0010\u001f\u001a\u00020\u0017H\u0002J\u0010\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u0004H\u0002J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0004H\u0002J\u0010\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u0015H\u0002J\u0006\u0010&\u001a\u00020\u0017J\u0010\u0010'\u001a\u00020\u00172\b\b\u0002\u0010(\u001a\u00020\u0004J\u0010\u0010)\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\"\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/xp/wx/backend/douyin/handler/AutoSendMsgHandler;", "", "()V", "MSG_SEND_NEXT", "", "currentFollowers", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "currentIndex", "currentSendCount", "errorCount", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "isRunning", "", "()Z", "setRunning", "(Z)V", "maxTime", "", "findFollowerAndSendMsg", "", "matchFollowStatus", "senFanSubscribeType", "followStatus", "matchGender", "senFanSexType", "gender", "sendNext", "sendNextDelayed", "setCurrentIndex", "index", "setCurrentSendCount", "count", "setMaxTime", "time", "start", "stop", "status", "updateServerStatus", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: AutoSendMsgHandler.kt */
public final class AutoSendMsgHandler {
    public static final AutoSendMsgHandler INSTANCE = new AutoSendMsgHandler();
    private static final int MSG_SEND_NEXT = 200;
    /* access modifiers changed from: private */
    public static ArrayList<Object> currentFollowers;
    private static int currentIndex;
    private static int currentSendCount;
    /* access modifiers changed from: private */
    public static int errorCount;
    private static final Handler handler = new AutoSendMsgHandler$handler$1();
    private static boolean isRunning;
    /* access modifiers changed from: private */
    public static long maxTime;

    private final boolean matchFollowStatus(int i, int i2) {
        if (i != 0) {
            return i != 10 ? i == 20 && i2 == 0 : i2 == 2;
        }
        return true;
    }

    private final boolean matchGender(int i, int i2) {
        if (i != 0) {
            return i != 10 ? i == 20 && i2 == 2 : i2 == 1;
        }
        return true;
    }

    private AutoSendMsgHandler() {
    }

    public final boolean isRunning() {
        return isRunning;
    }

    public final void setRunning(boolean z) {
        isRunning = z;
    }

    public final Handler getHandler() {
        return handler;
    }

    public final synchronized void start() {
        String str = null;
        if (ConfigUtil.INSTANCE.isSenFanOpen()) {
            if (!isRunning) {
                Log.debug("AutoSendMsg. start");
                isRunning = true;
                long autoSendMsgLoginUid = SharedPreferenceUtil.INSTANCE.getAutoSendMsgLoginUid();
                DyHookApi hookApi = DyGlobal.INSTANCE.getHookApi();
                if (hookApi == null) {
                    Intrinsics.throwNpe();
                }
                User currUser = hookApi.getCurrUser();
                if (currUser != null) {
                    str = currUser.getUid();
                }
                if (Intrinsics.areEqual((Object) str, (Object) String.valueOf(autoSendMsgLoginUid))) {
                    maxTime = SharedPreferenceUtil.INSTANCE.getAutoSendMsgFanMaxTime();
                    currentSendCount = SharedPreferenceUtil.INSTANCE.getAutoSendMsgSendCount();
                    currentIndex = SharedPreferenceUtil.INSTANCE.getAutoSendMsgIndex();
                }
                sendNextDelayed();
            }
        } else if (isRunning) {
            stop$default(this, 0, 1, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public final void sendNextDelayed() {
        int senFanInterval = ConfigUtil.INSTANCE.getSenFanInterval();
        if (senFanInterval > 0) {
            handler.removeMessages(200);
            handler.sendEmptyMessageDelayed(200, ((long) senFanInterval) * 1000);
            return;
        }
        Log.debug("AutoSendMsg. interval <= 0, not run.");
        stop$default(this, 0, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void sendNext() {
        if (ConfigUtil.INSTANCE.isSenFanOpen()) {
            int senFanMaxSendNum = ConfigUtil.INSTANCE.getSenFanMaxSendNum();
            if (senFanMaxSendNum == 0 || currentSendCount < senFanMaxSendNum) {
                ArrayList<Object> arrayList = currentFollowers;
                if (arrayList != null) {
                    if (arrayList == null) {
                        Intrinsics.throwNpe();
                    }
                    if (!arrayList.isEmpty()) {
                        findFollowerAndSendMsg();
                        return;
                    }
                }
                DyHookApi hookApi = DyGlobal.INSTANCE.getHookApi();
                if (hookApi == null) {
                    Intrinsics.throwNpe();
                }
                User currUser = hookApi.getCurrUser();
                if (currUser != null) {
                    Log.debug("AutoSendMsg. maxTime = " + maxTime);
                    DyHookApi hookApi2 = DyGlobal.INSTANCE.getHookApi();
                    if (hookApi2 == null) {
                        Intrinsics.throwNpe();
                    }
                    hookApi2.getFollowerList(Long.parseLong(currUser.getUid()), currUser.getSecUid(), maxTime, new AutoSendMsgHandler$sendNext$1(currUser));
                    return;
                }
                Log.error("AutoSendMsg. login user = null");
                stop$default(this, 0, 1, (Object) null);
                return;
            }
            Log.debug("AutoSendMsg. sendNext, currentSendCount = " + currentSendCount + ", max = senFanMaxSendNum. stop");
            stop(40);
            return;
        }
        stop$default(this, 0, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void findFollowerAndSendMsg() {
        int i;
        ArrayList<Object> arrayList = currentFollowers;
        if (arrayList != null) {
            if (arrayList == null) {
                Intrinsics.throwNpe();
            }
            if (!arrayList.isEmpty()) {
                User user = null;
                int i2 = currentIndex;
                ArrayList<Object> arrayList2 = currentFollowers;
                if (arrayList2 == null) {
                    Intrinsics.throwNpe();
                }
                if (i2 < arrayList2.size()) {
                    i = currentIndex;
                    ArrayList<Object> arrayList3 = currentFollowers;
                    if (arrayList3 == null) {
                        Intrinsics.throwNpe();
                    }
                    int size = arrayList3.size();
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        try {
                            int senFanSubscribeType = ConfigUtil.INSTANCE.getSenFanSubscribeType();
                            int senFanSexType = ConfigUtil.INSTANCE.getSenFanSexType();
                            if (senFanSubscribeType >= 0) {
                                if (senFanSexType >= 0) {
                                    ArrayList<Object> arrayList4 = currentFollowers;
                                    if (arrayList4 == null) {
                                        Intrinsics.throwNpe();
                                    }
                                    User user2 = new User(arrayList4.get(i));
                                    int followStatus = user2.getFollowStatus();
                                    int gender = user2.getGender();
                                    if (matchFollowStatus(senFanSubscribeType, followStatus) && matchGender(senFanSexType, gender)) {
                                        try {
                                            setCurrentIndex(i + 1);
                                            user = user2;
                                            break;
                                        } catch (Exception e) {
                                            e = e;
                                            user = user2;
                                        }
                                    }
                                    i++;
                                }
                            }
                            Log.debug("AutoSendMsg. findFollowerAndSendMsg, senFanSubscribeType < 0 or senFanSexType < 0");
                            stop$default(this, 0, 1, (Object) null);
                            return;
                        } catch (Exception e2) {
                            e = e2;
                        }
                    }
                }
                if (user != null) {
                    String senFanContent = ConfigUtil.INSTANCE.getSenFanContent();
                    if (!TextUtils.isEmpty(senFanContent)) {
                        Log.debug("AutoSendMsg. send to" + user.getNickname() + ", content = " + senFanContent + ", currentSendCount = " + (currentSendCount + 1));
                        DyHookApi hookApi = DyGlobal.INSTANCE.getHookApi();
                        if (hookApi == null) {
                            Intrinsics.throwNpe();
                        }
                        hookApi.sendChatText(user.getUid(), senFanContent);
                        setCurrentSendCount(currentSendCount + 1);
                    } else {
                        Log.debug("AutoSendMsg. findFollowerAndSendMsg, empty senFanContent");
                        stop$default(this, 0, 1, (Object) null);
                        return;
                    }
                } else {
                    currentFollowers = null;
                    setCurrentIndex(0);
                }
                sendNextDelayed();
                return;
            }
        }
        Log.debug("AutoSendMsg. nor more");
        stop(40);
        return;
        Log.warn("AutoSendMsg. findFollowerAndSendMsg error, " + android.util.Log.getStackTraceString(e));
        i++;
    }

    /* access modifiers changed from: private */
    public final void setCurrentIndex(int i) {
        currentIndex = i;
        SharedPreferenceUtil.INSTANCE.saveAutoSendMsgIndex(i);
    }

    /* access modifiers changed from: private */
    public final void setMaxTime(long j) {
        maxTime = j;
        SharedPreferenceUtil.INSTANCE.saveAutoSendMsgFanMaxTime(j);
    }

    private final void setCurrentSendCount(int i) {
        currentSendCount = i;
        SharedPreferenceUtil.INSTANCE.saveAutoSendMsgSendCount(i);
    }

    public static /* synthetic */ void stop$default(AutoSendMsgHandler autoSendMsgHandler, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = ConfigUtil.INSTANCE.getSenFanStatus();
        }
        autoSendMsgHandler.stop(i);
    }

    public final synchronized void stop(int i) {
        if (isRunning) {
            Log.debug("AutoSendMsg. stop");
            handler.removeMessages(200);
            if (i != 20) {
                if (i != ConfigUtil.INSTANCE.getSenFanStatus()) {
                    updateServerStatus(i);
                }
                currentFollowers = null;
                setCurrentIndex(0);
                setMaxTime(0);
                setCurrentSendCount(0);
                SharedPreferenceUtil.INSTANCE.saveAutoSendMsgLoginUid(0);
            }
            isRunning = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        r1 = r1.getCurrUser();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void updateServerStatus(int r5) {
        /*
            r4 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            com.xp.wx.spellbook.douyin.DyGlobal r1 = com.xp.wx.spellbook.douyin.DyGlobal.INSTANCE
            com.xp.wx.backend.douyin.api.DyHookApi r1 = r1.getHookApi()
            if (r1 == 0) goto L_0x001a
            com.xp.wx.spellbook.douyin.model.User r1 = r1.getCurrUser()
            if (r1 == 0) goto L_0x001a
            java.lang.String r1 = r1.getUid()
            goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            java.lang.String r1 = com.xp.wx.util.StringUtils.emptyIfNull(r1)
            java.lang.String r2 = "StringUtils.emptyIfNull(….getCurrUser()?.getUid())"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.String r2 = "assistantId"
            r0.put(r2, r1)
            java.lang.String r1 = "type"
            java.lang.String r2 = "10"
            r0.put(r1, r2)
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r1 = com.xp.wx.util.StringUtils.emptyIfNull(r1)
            java.lang.String r2 = "StringUtils.emptyIfNull(status.toString())"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.String r2 = "status"
            r0.put(r2, r1)
            com.xp.wx.util.OkHttpClientUtil r1 = com.xp.wx.util.OkHttpClientUtil.getInstance()
            java.lang.Class<com.xp.wx.backend.network.BaseResponse> r2 = com.xp.wx.backend.network.BaseResponse.class
            com.xp.wx.backend.douyin.handler.AutoSendMsgHandler$updateServerStatus$1 r3 = new com.xp.wx.backend.douyin.handler.AutoSendMsgHandler$updateServerStatus$1
            r3.<init>(r5)
            com.xp.wx.util.OkHttpClientUtil$ResponseCallback r3 = (com.xp.wx.util.OkHttpClientUtil.ResponseCallback) r3
            java.lang.String r5 = "/huidouApi/Huidou/MoidfyFuncStatus"
            r1.post((java.lang.String) r5, (java.util.Map<java.lang.String, java.lang.String>) r0, r2, (com.xp.wx.util.OkHttpClientUtil.ResponseCallback) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.backend.douyin.handler.AutoSendMsgHandler.updateServerStatus(int):void");
    }
}
