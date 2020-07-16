package com.xp.wx.backend;

import android.app.Application;
import com.xp.api.XC_MethodHook;
import com.xp.api.callbacks.XC_LoadPackage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0014¨\u0006\u0006¸\u0006\u0007"}, d2 = {"com/xp/wx/backend/WechatHook$hookAttachBaseContext$1", "Lcom/xp/api/XC_MethodHook;", "afterHookedMethod", "", "param", "Lcom/xp/api/XC_MethodHook$MethodHookParam;", "app_release", "com/xp/wx/backend/WechatHook$$special$$inlined$hookAttachBaseContext$1"}, k = 1, mv = {1, 1, 13})
/* compiled from: WechatHook.kt */
public final class WechatHook$handleLoadPackage$$inlined$tryVerbosely$lambda$1 extends XC_MethodHook {
    final /* synthetic */ XC_LoadPackage.LoadPackageParam $lpparam$inlined;
    final /* synthetic */ WechatHook this$0;

    public WechatHook$handleLoadPackage$$inlined$tryVerbosely$lambda$1(WechatHook wechatHook, XC_LoadPackage.LoadPackageParam loadPackageParam) {
        this.this$0 = wechatHook;
        this.$lpparam$inlined = loadPackageParam;
    }

    /* access modifiers changed from: protected */
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Intrinsics.checkParameterIsNotNull(methodHookParam, "param");
        Object obj = methodHookParam.thisObject;
        if (!(obj instanceof Application)) {
            obj = null;
        }
        Application application = (Application) obj;
        if (application != null) {
            this.this$0.handleLoadDouYin(this.$lpparam$inlined, application);
        }
    }
}
