package com.xp.wx.backend;

import android.app.Application;
import com.xp.api.XC_MethodHook;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/xp/wx/backend/WechatHook$hookAttachBaseContext$1", "Lcom/xp/api/XC_MethodHook;", "afterHookedMethod", "", "param", "Lcom/xp/api/XC_MethodHook$MethodHookParam;", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: WechatHook.kt */
public final class WechatHook$hookAttachBaseContext$1 extends XC_MethodHook {
    final /* synthetic */ Function1 $callback;

    public WechatHook$hookAttachBaseContext$1(Function1 function1) {
        this.$callback = function1;
    }

    /* access modifiers changed from: protected */
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Intrinsics.checkParameterIsNotNull(methodHookParam, "param");
        Function1 function1 = this.$callback;
        Object obj = methodHookParam.thisObject;
        if (!(obj instanceof Application)) {
            obj = null;
        }
        Application application = (Application) obj;
        if (application != null) {
            function1.invoke(application);
        }
    }
}
