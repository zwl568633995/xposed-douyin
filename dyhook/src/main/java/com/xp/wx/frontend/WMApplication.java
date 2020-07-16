package com.xp.wx.frontend;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import com.xp.wx.util.LocaleUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/xp/wx/frontend/WMApplication;", "Landroid/app/Application;", "()V", "attachBaseContext", "", "base", "Landroid/content/Context;", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: WMApplication.kt */
public final class WMApplication extends Application {
    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "base");
        super.attachBaseContext(LocaleUtil.onAttach$default(LocaleUtil.INSTANCE, context, (String) null, 2, (Object) null));
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LocaleUtil.onAttach$default(LocaleUtil.INSTANCE, this, (String) null, 2, (Object) null);
    }

    public void onCreate() {
        super.onCreate();
    }
}
