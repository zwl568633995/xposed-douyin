package com.xp.wx.spellbook.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.xp.api.XposedHelpers;
import com.xp.wx.spellbook.base.Version;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\t¨\u0006\u000b"}, d2 = {"Lcom/xp/wx/spellbook/util/AppUtil;", "", "()V", "getApplicationApkPath", "", "packageName", "getApplicationVersion", "Lcom/xp/wx/spellbook/base/Version;", "context", "Landroid/content/Context;", "getSystemContext", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: AppUtil.kt */
public final class AppUtil {
    public static final AppUtil INSTANCE = new AppUtil();

    private AppUtil() {
    }

    public final Context getSystemContext() {
        Context context = (Context) XposedHelpers.callMethod(XposedHelpers.callStaticMethod(XposedHelpers.findClass("android.app.ActivityThread", (ClassLoader) null), "currentActivityThread", new Object[0]), "getSystemContext", new Object[0]);
        if (context != null) {
            return context;
        }
        throw new Error("Failed to get system context.");
    }

    public final String getApplicationApkPath(String str) {
        Intrinsics.checkParameterIsNotNull(str, "packageName");
        ApplicationInfo applicationInfo = getSystemContext().getPackageManager().getApplicationInfo(str, 0);
        String str2 = applicationInfo != null ? applicationInfo.publicSourceDir : null;
        if (str2 != null) {
            return str2;
        }
        throw new Error("Failed to get the APK path of " + str);
    }

    public final Version getApplicationVersion(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "packageName");
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        String str2 = packageInfo != null ? packageInfo.versionName : null;
        if (str2 != null) {
            return new Version(str2);
        }
        throw new Error("Failed to get the version of " + str);
    }
}
