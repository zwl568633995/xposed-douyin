package com.xp.wx.backend.douyin.api;

import android.content.Context;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import com.xp.api.XposedHelpers;
import com.xp.wx.backend.threadpool.ThreadPool;
import com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.livesdk.chatroom.viewmodule.digg.Classex;
import com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.livesdk.gift.platform.core.api.Classes;
import com.xp.wx.spellbook.douyin.mirror.com.bytedance.ies.ugc.appcontext.Fields;
import com.xp.wx.spellbook.douyin.mirror.com.bytedance.ies.ugc.appcontext.Methods;
import com.xp.wx.spellbook.douyin.model.User;
import com.xp.wx.util.HandlerUtil;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001=B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J&\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003J\b\u0010!\u001a\u0004\u0018\u00010\"J\b\u0010#\u001a\u0004\u0018\u00010\u0001J&\u0010$\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010&\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u0003J\n\u0010(\u001a\u0006\u0012\u0002\b\u00030)J&\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018J\u0018\u0010.\u001a\u00020\u00122\b\u0010/\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0017\u001a\u00020\u0018J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018J\u0016\u00103\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00032\u0006\u00104\u001a\u00020\u0003J.\u00105\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u00106\u001a\u00020\u00142\u0006\u00107\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J.\u00108\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u00142\u0006\u00109\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010:\u001a\u00020\u00122\u0006\u0010;\u001a\u00020\u0003J\u0006\u0010<\u001a\u00020\u0012R\u001a\u0010\u0007\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006>"}, d2 = {"Lcom/xp/wx/backend/douyin/api/DyHookApi;", "", "dyPackageName", "", "dyLoader", "Ljava/lang/ClassLoader;", "(Ljava/lang/String;Ljava/lang/ClassLoader;)V", "loader", "getLoader", "()Ljava/lang/ClassLoader;", "setLoader", "(Ljava/lang/ClassLoader;)V", "packageName", "getPackageName", "()Ljava/lang/String;", "setPackageName", "(Ljava/lang/String;)V", "digg", "", "roomId", "", "count", "", "callback", "Lcom/xp/wx/backend/douyin/api/DyHookApi$CommonResponseCallback;", "followUser", "uid", "secUid", "status", "getContext", "Landroid/content/Context;", "getConversationId", "userId", "getCurrUser", "Lcom/xp/wx/spellbook/douyin/model/User;", "getCurrentRoom", "getFollowerList", "maxTime", "getGiftIdFromName", "name", "getGiftPageList", "", "getLivePromotions", "author_id", "sec_author_id", "room_id", "request", "observable", "searchUser", "", "dyId", "sendChatText", "text", "sendGift", "giftId", "giftCount", "sendLiveEvent", "promotion_ids", "sendRoomTextMsg", "msg", "testRetrofit", "CommonResponseCallback", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: DyHookApi.kt */
public final class DyHookApi {
    private ClassLoader loader;
    private String packageName;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H&¨\u0006\b"}, d2 = {"Lcom/xp/wx/backend/douyin/api/DyHookApi$CommonResponseCallback;", "", "onFailed", "", "e", "", "onSuccess", "data", "app_release"}, k = 1, mv = {1, 1, 13})
    /* compiled from: DyHookApi.kt */
    public interface CommonResponseCallback {
        void onFailed(Throwable th);

        void onSuccess(Object obj);
    }

    public final void testRetrofit() {
    }

    public DyHookApi(String str, ClassLoader classLoader) {
        Intrinsics.checkParameterIsNotNull(str, "dyPackageName");
        Intrinsics.checkParameterIsNotNull(classLoader, "dyLoader");
        this.loader = classLoader;
        this.packageName = str;
    }

    public final ClassLoader getLoader() {
        return this.loader;
    }

    public final void setLoader(ClassLoader classLoader) {
        Intrinsics.checkParameterIsNotNull(classLoader, "<set-?>");
        this.loader = classLoader;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final void setPackageName(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.packageName = str;
    }

    public final Context getContext() {
        Object invoke = Methods.INSTANCE.getClassAppContextManager_getApplicationContext().invoke(Fields.INSTANCE.getClassAppContextManager_INSTANCE().get((Object) null), new Object[0]);
        if (invoke != null) {
            return (Context) invoke;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.content.Context");
    }

    public final User getCurrUser() {
        Object invoke = com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.Methods.INSTANCE.getClassIAccountUserService_getCurUser().invoke(com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.account.Methods.INSTANCE.getClassAccountE_e().invoke((Object) null, new Object[0]), new Object[0]);
        if (invoke == null) {
            return null;
        }
        User user = new User(invoke);
        if (TextUtils.isEmpty(user.getUid())) {
            return null;
        }
        return user;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean searchUser(java.lang.String r11, com.xp.wx.backend.douyin.api.DyHookApi.CommonResponseCallback r12) {
        /*
            r10 = this;
            java.lang.String r0 = "dyId"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r11, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r12, r0)
            com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.search.model.Classes r0 = com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.search.model.Classes.INSTANCE
            java.lang.Class r0 = r0.getClassSearchModelJ()
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Object r0 = com.xp.api.XposedHelpers.newInstance(r0, r2)
            com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.search.model.Fields r2 = com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.search.model.Fields.INSTANCE
            java.lang.reflect.Field r2 = r2.getClassSearchModelJ_enterFrom()
            java.lang.String r3 = "normal_search"
            r2.set(r0, r3)
            com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.search.model.Fields r2 = com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.search.model.Fields.INSTANCE
            java.lang.reflect.Field r2 = r2.getClassSearchModelJ_currentSearchKeyword()
            r2.set(r0, r11)
            com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.search.model.Fields r2 = com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.search.model.Fields.INSTANCE
            java.lang.reflect.Field r2 = r2.getClassSearchModelJ_keyword()
            r2.set(r0, r11)
            com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.discover.mixfeed.Classes r2 = com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.discover.mixfeed.Classes.INSTANCE
            java.lang.Class r2 = r2.getClassDiscoverMixfeedS()
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.Object r2 = com.xp.api.XposedHelpers.newInstance(r2, r3)
            int r3 = r2.hashCode()
            com.xp.wx.spellbook.douyin.DyGlobal r4 = com.xp.wx.spellbook.douyin.DyGlobal.INSTANCE
            android.util.LruCache r4 = r4.getDyLruCache()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r4.put(r5, r2)
            com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.discover.mixfeed.Fields r4 = com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.discover.mixfeed.Fields.INSTANCE
            java.lang.reflect.Field r4 = r4.getClassDiscoverMixfeedS_d()
            r4.set(r2, r0)
            com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.common.Methods r0 = com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.common.Methods.INSTANCE
            java.lang.reflect.Method r0 = r0.getClassCommonA_addNotifyListener()
            r4 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r6 = new java.lang.Object[r4]
            com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.common.Classes r7 = com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.common.Classes.INSTANCE
            java.lang.Class r7 = r7.getClassCommonU()
            java.lang.ClassLoader r7 = r7.getClassLoader()
            java.lang.Class[] r8 = new java.lang.Class[r4]
            com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.common.Classes r9 = com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.common.Classes.INSTANCE
            java.lang.Class r9 = r9.getClassCommonU()
            r8[r1] = r9
            com.xp.wx.backend.douyin.api.DyHookApi$searchUser$1 r9 = new com.xp.wx.backend.douyin.api.DyHookApi$searchUser$1
            r9.<init>(r3, r12, r2)
            java.lang.reflect.InvocationHandler r9 = (java.lang.reflect.InvocationHandler) r9
            java.lang.Object r12 = java.lang.reflect.Proxy.newProxyInstance(r7, r8, r9)
            r6[r1] = r12
            r0.invoke(r2, r6)
            com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.common.Methods r12 = com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.common.Methods.INSTANCE
            java.lang.reflect.Method r12 = r12.getClassCommonA_sendRequest()
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r3 = 7
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r1] = r5
            r3[r4] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            r4 = 2
            r3[r4] = r11
            r6 = 0
            java.lang.Double r11 = java.lang.Double.valueOf(r6)
            r4 = 3
            r3[r4] = r11
            r4 = 4
            r3[r4] = r11
            r11 = 5
            r3[r11] = r5
            r11 = 6
            r4 = 0
            r3[r11] = r4
            r0[r1] = r3
            java.lang.Object r11 = r12.invoke(r2, r0)
            if (r11 == 0) goto L_0x00c3
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            return r11
        L_0x00c3:
            kotlin.TypeCastException r11 = new kotlin.TypeCastException
            java.lang.String r12 = "null cannot be cast to non-null type kotlin.Boolean"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.backend.douyin.api.DyHookApi.searchUser(java.lang.String, com.xp.wx.backend.douyin.api.DyHookApi$CommonResponseCallback):boolean");
    }

    public final void followUser(String str, String str2, int i, CommonResponseCallback commonResponseCallback) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(str2, "secUid");
        Intrinsics.checkParameterIsNotNull(commonResponseCallback, "callback");
        ThreadPool threadPool = ThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(threadPool, "ThreadPool.getDefault()");
        threadPool.getExecutor().execute(new DyHookApi$followUser$1(str, str2, i, commonResponseCallback));
    }

    public final void getFollowerList(long j, String str, long j2, CommonResponseCallback commonResponseCallback) {
        Intrinsics.checkParameterIsNotNull(str, "secUid");
        Intrinsics.checkParameterIsNotNull(commonResponseCallback, "callback");
        Object invoke = com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.following.repository.Methods.INSTANCE.getClassFollowRelationApi_a_a().invoke(com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.following.repository.Fields.INSTANCE.getClassFollowRelationApi_A().get((Object) null), new Object[0]);
        Method classFollowRelationApi_queryFollowerList = com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.following.repository.Methods.INSTANCE.getClassFollowRelationApi_queryFollowerList();
        Object[] objArr = new Object[9];
        objArr[0] = String.valueOf(j);
        int i = 1;
        objArr[1] = str;
        objArr[2] = Long.valueOf(j2);
        objArr[3] = 20;
        objArr[4] = 0;
        if (j2 == 0) {
            i = 2;
        }
        objArr[5] = Integer.valueOf(i);
        objArr[6] = 1;
        objArr[7] = 1;
        objArr[8] = 0;
        request(classFollowRelationApi_queryFollowerList.invoke(invoke, objArr), commonResponseCallback);
    }

    public final void sendGift(long j, long j2, long j3, int i, CommonResponseCallback commonResponseCallback) {
        Intrinsics.checkParameterIsNotNull(commonResponseCallback, "callback");
        Object invoke = com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.live.network.Methods.INSTANCE.getClassLiveNetworkC_instance().invoke((Object) null, new Object[0]);
        Object invoke2 = com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.live.network.Methods.INSTANCE.getClassLiveNetworkC_a().invoke(invoke, new Object[]{Classes.INSTANCE.getClassGiftRetrofitApi()});
        request(com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.livesdk.gift.platform.core.api.Methods.INSTANCE.getClassGiftRetrofitApi_send4().invoke(invoke2, new Object[]{Long.valueOf(j3), Long.valueOf(j2), Long.valueOf(j), Integer.valueOf(i)}), commonResponseCallback);
    }

    public final void request(Object obj, CommonResponseCallback commonResponseCallback) {
        Intrinsics.checkParameterIsNotNull(commonResponseCallback, "callback");
        if (obj == null) {
            HandlerUtil.getMainHandler().post(new DyHookApi$request$1(commonResponseCallback));
            return;
        }
        Object obj2 = XposedHelpers.findFirstFieldByExactType(obj.getClass(), com.xp.wx.spellbook.douyin.mirror.io.reactivex.Classes.INSTANCE.getClassIoReactivexObservable()).get(obj);
        Object obj3 = XposedHelpers.findFirstFieldByExactType(obj2.getClass(), com.xp.wx.spellbook.douyin.mirror.com.bytedance.retrofit2.Classes.INSTANCE.getClassCall()).get(obj2);
        ThreadPool threadPool = ThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(threadPool, "ThreadPool.getDefault()");
        threadPool.getExecutor().execute(new DyHookApi$request$2(obj3, commonResponseCallback));
    }

    public final String getConversationId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        Object invoke = com.xp.wx.spellbook.douyin.mirror.com.bytedance.im.core.c.Methods.INSTANCE.getClassImCoreCE_a().invoke((Object) null, new Object[]{Long.valueOf(Long.parseLong(str))});
        if (invoke != null) {
            return (String) invoke;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
    }

    public final void sendChatText(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        Intrinsics.checkParameterIsNotNull(str2, "text");
        String conversationId = getConversationId(str);
        Object invoke = com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.im.sdk.chat.model.Methods.INSTANCE.getClassImSdkChatModelTextContent_obtain().invoke((Object) null, new Object[]{str2});
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.im.sdk.chat.model.Methods.INSTANCE.getClassImSdkChatModelBaseContent_setSendStartTime().invoke(invoke, new Object[]{valueOf});
        Object invoke2 = com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.im.sdk.utils.Methods.INSTANCE.getClassImSdkUtilsBh_instance().invoke((Object) null, new Object[0]);
        com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.im.sdk.utils.Methods.INSTANCE.getClassImSdkUtilsBh_b().invoke(invoke2, new Object[]{conversationId, invoke, null});
    }

    public final Object getCurrentRoom() {
        return com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.livesdk.module.Methods.INSTANCE.getClassLivesdkModuleRoomService_getCurrentRoom().invoke(com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.live.f.Methods.INSTANCE.getClassLiveFD_a().invoke((Object) null, new Object[]{com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.live.room.Classes.INSTANCE.getClassLiveRoomM()}), new Object[0]);
    }

    public final void sendRoomTextMsg(String str) {
        Intrinsics.checkParameterIsNotNull(str, NotificationCompat.CATEGORY_MESSAGE);
        Class findClass = XposedHelpers.findClass("com.bytedance.android.livesdk.chatroom.presenter.c", this.loader);
        Class findClass2 = XposedHelpers.findClass("com.bytedance.android.livesdk.chatroom.presenter.c$a", this.loader);
        Class findClass3 = XposedHelpers.findClass("com.bytedance.ies.sdk.widgets.DataCenter", this.loader);
        Object newInstance = XposedHelpers.newInstance(findClass, new Object[0]);
        XposedHelpers.setObjectField(newInstance, "w", XposedHelpers.newInstance(findClass3, new Object[0]));
        XposedHelpers.callMethod(newInstance, "a", new Class[]{findClass2}, new Object[]{null});
        XposedHelpers.setObjectField(newInstance, "d", getCurrentRoom());
        Class findClass4 = XposedHelpers.findClass("com.bytedance.android.live.browser.jsbridge.b.r", this.loader);
        Object staticObjectField = XposedHelpers.getStaticObjectField(XposedHelpers.findClass("com.bytedance.android.live.browser.jsbridge.b.c$a", this.loader), "CommentWidget");
        HashMap hashMap = new HashMap();
        hashMap.put("live.intent.extra.ENTER_LIVE_SOURCE", "");
        XposedHelpers.callMethod(newInstance, "a", new Object[]{XposedHelpers.newInstance(findClass4, new Object[]{str, staticObjectField, hashMap})});
    }

    public final void digg(long j, int i, CommonResponseCallback commonResponseCallback) {
        Intrinsics.checkParameterIsNotNull(commonResponseCallback, "callback");
        Object invoke = com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.live.network.Methods.INSTANCE.getClassLiveNetworkC_instance().invoke((Object) null, new Object[0]);
        Object invoke2 = com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.live.network.Methods.INSTANCE.getClassLiveNetworkC_a().invoke(invoke, new Object[]{Classex.INSTANCE.getClassDiggApi()});
        request(com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.livesdk.chatroom.viewmodule.digg.Methods.INSTANCE.getClassDiggApi_digg().invoke(invoke2, new Object[]{Long.valueOf(j), Integer.valueOf(i)}), commonResponseCallback);
    }

    public final void getLivePromotions(String str, String str2, String str3, CommonResponseCallback commonResponseCallback) {
        Intrinsics.checkParameterIsNotNull(str, "author_id");
        Intrinsics.checkParameterIsNotNull(str2, "sec_author_id");
        Intrinsics.checkParameterIsNotNull(str3, "room_id");
        Intrinsics.checkParameterIsNotNull(commonResponseCallback, "callback");
        ThreadPool threadPool = ThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(threadPool, "ThreadPool.getDefault()");
        threadPool.getExecutor().execute(new DyHookApi$getLivePromotions$1(str, str2, str3, commonResponseCallback));
    }

    public final void sendLiveEvent(long j, String str, long j2, String str2, CommonResponseCallback commonResponseCallback) {
        Intrinsics.checkParameterIsNotNull(str, "sec_author_id");
        String str3 = str2;
        Intrinsics.checkParameterIsNotNull(str3, "promotion_ids");
        CommonResponseCallback commonResponseCallback2 = commonResponseCallback;
        Intrinsics.checkParameterIsNotNull(commonResponseCallback2, "callback");
        ThreadPool threadPool = ThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(threadPool, "ThreadPool.getDefault()");
        threadPool.getExecutor().execute(new DyHookApi$sendLiveEvent$1(j2, j, str, str3, commonResponseCallback2));
    }

    public final List<?> getGiftPageList() {
        Object invoke = com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.livesdk.gift.platform.core.manager.Methods.INSTANCE.getClassGiftManager_getGiftPageList().invoke(com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.livesdk.gift.platform.core.manager.Methods.INSTANCE.getClassGiftManager_inst().invoke((Object) null, new Object[0]), new Object[0]);
        if (invoke != null) {
            return (List) invoke;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<*>");
    }

    public final long getGiftIdFromName(String str) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        List<?> giftPageList = getGiftPageList();
        if (!(!giftPageList.isEmpty())) {
            return -1;
        }
        for (Object obj : giftPageList) {
            List list = (List) com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.livesdk.gift.model.Fields.INSTANCE.getClassLivesdkGiftModelGiftPage_gifts().get(obj);
            if (list != null && (!list.isEmpty())) {
                for (Object next : list) {
                    if (Intrinsics.areEqual((Object) (String) com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.livesdk.gift.model.Fields.INSTANCE.getClassLivesdkGiftModelD_name().get(next), (Object) str)) {
                        return com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.livesdk.gift.model.Fields.INSTANCE.getClassLivesdkGiftModelD_id().getLong(next);
                    }
                }
                continue;
            }
        }
        return -1;
    }
}
