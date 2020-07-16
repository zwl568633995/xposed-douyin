package com.xp.wx.backend;

import android.content.Context;
import android.content.IntentFilter;
import android.util.Log;
import com.xp.api.IXposedHookLoadPackage;
import com.xp.api.XposedHelpers;
import com.xp.api.callbacks.XC_LoadPackage;
import com.xp.wx.Global;
import com.xp.wx.GlobalConst;
import com.xp.wx.spellbook.douyin.DySpellBook;
import com.xp.wx.spellbook.util.AvoidSealUtil;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0003J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0017J'\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0014\b\u0004\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u000eH\b¨\u0006\u0010"}, d2 = {"Lcom/xp/wx/backend/WechatHook;", "Lcom/xp/api/IXposedHookLoadPackage;", "()V", "handleLoadDouYin", "", "lpparam", "Lcom/xp/api/callbacks/XC_LoadPackage$LoadPackageParam;", "context", "Landroid/content/Context;", "handleLoadPackage", "hookAttachBaseContext", "loader", "Ljava/lang/ClassLoader;", "callback", "Lkotlin/Function1;", "Companion", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: WechatHook.kt */
public final class WechatHook implements IXposedHookLoadPackage {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final WechatHook$Companion$dateTimeReceiver$1 dateTimeReceiver = new WechatHook$Companion$dateTimeReceiver$1();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003*\u0001\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/xp/wx/backend/WechatHook$Companion;", "", "()V", "dateTimeReceiver", "com/xp/wx/backend/WechatHook$Companion$dateTimeReceiver$1", "Lcom/xp/wx/backend/WechatHook$Companion$dateTimeReceiver$1;", "app_release"}, k = 1, mv = {1, 1, 13})
    /* compiled from: WechatHook.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void hookAttachBaseContext(ClassLoader classLoader, Function1<? super Context, Unit> function1) {
        XposedHelpers.findAndHookMethod("android.content.ContextWrapper", classLoader, "attachBaseContext", new Object[]{Context.class, new WechatHook$hookAttachBaseContext$1(function1)});
    }

    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam loadPackageParam) {
        Intrinsics.checkParameterIsNotNull(loadPackageParam, "lpparam");
        try {
            String str = loadPackageParam.packageName;
            if (str != null) {
                if (str.hashCode() == 313184810) {
                    if (str.equals(Global.DOUYIN_PACKAGE_NAME)) {
                        GlobalConst.TAG = GlobalConst.TAG_DY;
                        String str2 = GlobalConst.TAG;
                        Log.d(str2, "Xpwx: process ==== " + loadPackageParam.processName + ", version ==== ");
                        AvoidSealUtil.INSTANCE.avoidSealSystem();
                        if (Intrinsics.areEqual((Object) loadPackageParam.processName, (Object) Global.DOUYIN_PACKAGE_NAME)) {
                            ClassLoader classLoader = loadPackageParam.classLoader;
                            Intrinsics.checkExpressionValueIsNotNull(classLoader, "lpparam.classLoader");
                            XposedHelpers.findAndHookMethod("android.content.ContextWrapper", classLoader, "attachBaseContext", new Object[]{Context.class, new WechatHook$handleLoadPackage$$inlined$tryVerbosely$lambda$1(this, loadPackageParam)});
                        }
                    }
                }
            }
            Unit unit = Unit.INSTANCE;
        } catch (Throwable th) {
            Log.e("Xposed", Log.getStackTraceString(th));
        }
    }

    /* access modifiers changed from: private */
    public final void handleLoadDouYin(XC_LoadPackage.LoadPackageParam loadPackageParam, Context context) {
        if (!(!Intrinsics.areEqual((Object) context.getClass().getName(), (Object) "com.ss.android.ugc.aweme.app.host.HostApplication"))) {
            try {
                context.registerReceiver(dateTimeReceiver, new IntentFilter("android.intent.action.TIME_TICK"));
            } catch (Throwable th) {
                Log.e("Xposed", Log.getStackTraceString(th));
            }
            com.xp.wx.util.Log.init(context);
            DySpellBook.INSTANCE.startup(context, loadPackageParam, WechatPluginsKt.getDouyinPlugins());
        }
    }
}
