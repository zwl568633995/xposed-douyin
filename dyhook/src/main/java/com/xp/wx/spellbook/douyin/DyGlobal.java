package com.xp.wx.spellbook.douyin;

import android.content.Context;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import android.util.LruCache;
import com.xp.api.XmasBridge;
import com.xp.api.callbacks.XC_LoadPackage;
import com.xp.wx.backend.douyin.api.DyHookApi;
import com.xp.wx.spellbook.base.BaseGlobal;
import com.xp.wx.spellbook.base.Version;
import com.xp.wx.spellbook.base.WaitChannel;
import com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.account.k.Methods;
import com.xp.wx.spellbook.douyin.model.User;
import com.xp.wx.spellbook.parser.ClassTrie;
import com.xp.wx.spellbook.util.BasicUtil$tryAsynchronously$2$1;
import com.xp.wx.util.HandlerUtil;
import com.xp.wx.util.Log;
import com.xp.wx.util.WebSocketUtil;
import java.io.Serializable;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001ZB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u0019H\u0016J/\u0010C\u001a\b\u0012\u0004\u0012\u0002HE0D\"\u0004\b\u0000\u0010E2\u0006\u0010F\u001a\u00020\u00192\u0010\b\u0004\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001HE0HH\bJ\b\u0010I\u001a\u00020JH\u0016J\b\u0010K\u001a\u00020\u0019H\u0016J\b\u0010L\u001a\u00020\u0019H\u0016J\n\u0010M\u001a\u0004\u0018\u00010NH\u0016J(\u0010O\u001a\u00020A2\u0006\u0010P\u001a\u00020J2\u0006\u0010Q\u001a\u00020R2\u000e\u0010S\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010TH\u0007J\b\u0010U\u001a\u00020AH\u0002J\b\u0010V\u001a\u00020\"H\u0016J\b\u0010W\u001a\u00020\"H\u0016J\b\u0010X\u001a\u00020AH\u0002J\u0006\u0010Y\u001a\u00020AR\u0014\u0010\u0003\u001a\u00020\u0004XT¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u0004\u0018\u00010\r8FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u00020\u00198FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u001a\u0010!\u001a\u00020\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010'\u001a\u0004\u0018\u00010(8FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010-\u001a\u0004\u0018\u00010.X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0011\u00103\u001a\u000204¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u001c\u00107\u001a\u0004\u0018\u000108X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001a\u0010=\u001a\u00020\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010$\"\u0004\b?\u0010&¨\u0006["}, d2 = {"Lcom/xp/wx/spellbook/douyin/DyGlobal;", "Lcom/xp/wx/spellbook/base/BaseGlobal;", "()V", "INIT_TIMEOUT", "", "INIT_TIMEOUT$annotations", "dyClasses", "Lcom/xp/wx/spellbook/parser/ClassTrie;", "getDyClasses", "()Lcom/xp/wx/spellbook/parser/ClassTrie;", "setDyClasses", "(Lcom/xp/wx/spellbook/parser/ClassTrie;)V", "dyLoader", "Ljava/lang/ClassLoader;", "getDyLoader", "()Ljava/lang/ClassLoader;", "setDyLoader", "(Ljava/lang/ClassLoader;)V", "dyLruCache", "Landroid/util/LruCache;", "", "", "getDyLruCache", "()Landroid/util/LruCache;", "dyPackageName", "", "getDyPackageName", "()Ljava/lang/String;", "setDyPackageName", "(Ljava/lang/String;)V", "dyUid", "getDyUid", "setDyUid", "dyUnitTestMode", "", "getDyUnitTestMode", "()Z", "setDyUnitTestMode", "(Z)V", "dyVersion", "Lcom/xp/wx/spellbook/base/Version;", "getDyVersion", "()Lcom/xp/wx/spellbook/base/Version;", "setDyVersion", "(Lcom/xp/wx/spellbook/base/Version;)V", "hookApi", "Lcom/xp/wx/backend/douyin/api/DyHookApi;", "getHookApi", "()Lcom/xp/wx/backend/douyin/api/DyHookApi;", "setHookApi", "(Lcom/xp/wx/backend/douyin/api/DyHookApi;)V", "initializeChannel", "Lcom/xp/wx/spellbook/base/WaitChannel;", "getInitializeChannel", "()Lcom/xp/wx/spellbook/base/WaitChannel;", "user", "Lcom/xp/wx/spellbook/douyin/model/User;", "getUser", "()Lcom/xp/wx/spellbook/douyin/model/User;", "setUser", "(Lcom/xp/wx/spellbook/douyin/model/User;)V", "wxUnitTestMode", "getWxUnitTestMode", "setWxUnitTestMode", "cleanBindInfo", "", "status", "dyLazy", "Lkotlin/Lazy;", "T", "name", "initializer", "Lkotlin/Function0;", "getContext", "Landroid/content/Context;", "getLoginUserId", "getLoginUserNickname", "getSocket", "Lcom/xp/wx/util/WebSocketUtil;", "init", "context", "lpparam", "Lcom/xp/api/callbacks/XC_LoadPackage$LoadPackageParam;", "plugins", "", "initUserInfo", "isInitializeChannelDone", "isSocketOpen", "listenLogout", "refreshInfo", "UnitTestLazyImpl", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: DyGlobal.kt */
public final class DyGlobal implements BaseGlobal {
    public static final long INIT_TIMEOUT = 30000;
    public static final DyGlobal INSTANCE = new DyGlobal();
    private static volatile ClassTrie dyClasses;
    private static volatile ClassLoader dyLoader;
    private static final LruCache<Integer, Object> dyLruCache = new LruCache<>(50);
    private static volatile String dyPackageName = "";
    private static String dyUid = "";
    private static volatile boolean dyUnitTestMode;
    private static volatile Version dyVersion;
    private static volatile DyHookApi hookApi;
    private static final WaitChannel initializeChannel = new WaitChannel();
    private static User user;
    private static volatile boolean wxUnitTestMode;

    public static /* synthetic */ void INIT_TIMEOUT$annotations() {
    }

    public void cleanBindInfo(String str) {
        Intrinsics.checkParameterIsNotNull(str, NotificationCompat.CATEGORY_STATUS);
    }

    public WebSocketUtil getSocket() {
        return null;
    }

    public boolean isSocketOpen() {
        return false;
    }

    private DyGlobal() {
    }

    public void initSocket() {
        BaseGlobal.DefaultImpls.initSocket(this);
    }

    public void sendBindStateChanged() {
        BaseGlobal.DefaultImpls.sendBindStateChanged(this);
    }

    public final WaitChannel getInitializeChannel() {
        return initializeChannel;
    }

    public final boolean getWxUnitTestMode() {
        return wxUnitTestMode;
    }

    public final void setWxUnitTestMode(boolean z) {
        wxUnitTestMode = z;
    }

    public final User getUser() {
        return user;
    }

    public final void setUser(User user2) {
        user = user2;
    }

    public final String getDyUid() {
        return dyUid;
    }

    public final void setDyUid(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        dyUid = str;
    }

    public final LruCache<Integer, Object> getDyLruCache() {
        return dyLruCache;
    }

    public final <T> Lazy<T> dyLazy(String str, Function0<? extends T> function0) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(function0, "initializer");
        if (getWxUnitTestMode()) {
            return new UnitTestLazyImpl<>(new DyGlobal$dyLazy$1(function0, str));
        }
        return LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new DyGlobal$dyLazy$2(function0, str));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00028\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/xp/wx/spellbook/douyin/DyGlobal$UnitTestLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "initializer", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "lazyValue", "value", "getValue", "()Ljava/lang/Object;", "isInitialized", "", "refresh", "", "toString", "", "app_release"}, k = 1, mv = {1, 1, 13})
    /* compiled from: DyGlobal.kt */
    public static final class UnitTestLazyImpl<T> implements Lazy<T>, Serializable {
        private final Function0<T> initializer;
        private volatile Lazy<? extends T> lazyValue;

        public UnitTestLazyImpl(Function0<? extends T> function0) {
            Intrinsics.checkParameterIsNotNull(function0, "initializer");
            this.initializer = function0;
            this.lazyValue = LazyKt.lazy(function0);
        }

        public final void refresh() {
            this.lazyValue = LazyKt.lazy(this.initializer);
        }

        public T getValue() {
            return this.lazyValue.getValue();
        }

        public String toString() {
            return this.lazyValue.toString();
        }

        public boolean isInitialized() {
            return this.lazyValue.isInitialized();
        }
    }

    public final void setDyVersion(Version version) {
        dyVersion = version;
    }

    public final Version getDyVersion() {
        if (!dyUnitTestMode) {
            initializeChannel.wait(INIT_TIMEOUT);
            initializeChannel.done();
        }
        return dyVersion;
    }

    public final void setDyPackageName(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        dyPackageName = str;
    }

    public final String getDyPackageName() {
        if (!dyUnitTestMode) {
            initializeChannel.wait(INIT_TIMEOUT);
            initializeChannel.done();
        }
        return dyPackageName;
    }

    public final void setDyLoader(ClassLoader classLoader) {
        dyLoader = classLoader;
    }

    public final ClassLoader getDyLoader() {
        if (!dyUnitTestMode) {
            initializeChannel.wait(INIT_TIMEOUT);
            initializeChannel.done();
        }
        return dyLoader;
    }

    public final void setDyClasses(ClassTrie classTrie) {
        dyClasses = classTrie;
    }

    public final ClassTrie getDyClasses() {
        if (!dyUnitTestMode) {
            initializeChannel.wait(INIT_TIMEOUT);
            initializeChannel.done();
        }
        return dyClasses;
    }

    public final boolean getDyUnitTestMode() {
        return dyUnitTestMode;
    }

    public final void setDyUnitTestMode(boolean z) {
        dyUnitTestMode = z;
    }

    public final DyHookApi getHookApi() {
        return hookApi;
    }

    public final void setHookApi(DyHookApi dyHookApi) {
        hookApi = dyHookApi;
    }

    /* access modifiers changed from: private */
    public final void listenLogout() {
        XmasBridge.hookMethod(Methods.INSTANCE.getClassAccountKB_1_onSuccess(), new DyGlobal$listenLogout$1());
    }

    /* access modifiers changed from: private */
    public final void initUserInfo() {
        DyHookApi dyHookApi;
        while (true) {
            try {
                dyHookApi = hookApi;
                break;
            } catch (Throwable unused) {
                Log.warn("DyGlobal:: init user error. retry after 1500ms");
                Thread.sleep(1500);
            }
        }
        User currUser = dyHookApi != null ? dyHookApi.getCurrUser() : null;
        if (currUser == null) {
            Intrinsics.throwNpe();
        }
        user = currUser;
        if (currUser == null) {
            Intrinsics.throwNpe();
        }
        String uid = currUser.getUid();
        dyUid = uid;
        if (TextUtils.isEmpty(uid)) {
            Log.warn("DyGlobal:: empty dy id");
            return;
        }
        Log.debug("DyGlobal:: init dy user succ. id = " + dyUid);
        refreshInfo();
    }

    public final void refreshInfo() {
        HandlerUtil.getMainHandler().post(DyGlobal$refreshInfo$1.INSTANCE);
    }

    public String getLoginUserNickname() {
        User user2 = user;
        if (user2 == null) {
            Intrinsics.throwNpe();
        }
        return user2.getNickname();
    }

    public String getLoginUserId() {
        User user2 = user;
        if (user2 == null) {
            Intrinsics.throwNpe();
        }
        return user2.getUid();
    }

    public boolean isInitializeChannelDone() {
        return initializeChannel.isDone();
    }

    public Context getContext() {
        DyHookApi dyHookApi = hookApi;
        if (dyHookApi == null) {
            Intrinsics.throwNpe();
        }
        return dyHookApi.getContext();
    }

    @JvmStatic
    public static final void init(Context context, XC_LoadPackage.LoadPackageParam loadPackageParam, List<? extends Object> list) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(loadPackageParam, "lpparam");
        ThreadsKt.thread$default(true, false, (ClassLoader) null, (String) null, 0, new DyGlobal$init$$inlined$tryAsynchronously$1(context, loadPackageParam, list), 30, (Object) null).setUncaughtExceptionHandler(BasicUtil$tryAsynchronously$2$1.INSTANCE);
    }
}
