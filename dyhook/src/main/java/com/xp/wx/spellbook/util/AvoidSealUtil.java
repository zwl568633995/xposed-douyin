package com.xp.wx.spellbook.util;

import android.app.ActivityManager;
import android.os.Environment;
import com.xp.api.XmasBridge;
import com.xp.api.XposedHelpers;
import com.xp.wx.Global;
import com.xp.wx.spellbook.C;
import com.xp.wx.spellbook.douyin.mirror.com.bytedance.common.utility.Methods;
import java.io.File;
import java.lang.Thread;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0012\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0002¨\u0006\f"}, d2 = {"Lcom/xp/wx/spellbook/util/AvoidSealUtil;", "", "()V", "avoidSealDy", "", "avoidSealSystem", "checkFilterFile", "", "path", "", "checkFilterName", "str", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: AvoidSealUtil.kt */
public final class AvoidSealUtil {
    public static final AvoidSealUtil INSTANCE = new AvoidSealUtil();

    private AvoidSealUtil() {
    }

    public final void avoidSealDy() {
        XmasBridge.hookMethod(Methods.INSTANCE.getClassDeviceUtils_isInstallXposed(), new AvoidSealUtil$avoidSealDy$1());
        XmasBridge.hookMethod(com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.update.Methods.INSTANCE.getClassUpdateUpdateHelper_C(), new AvoidSealUtil$avoidSealDy$2());
        XmasBridge.hookMethod(com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.update.Methods.INSTANCE.getClassUpdateUpdateHelper_a(), new AvoidSealUtil$avoidSealDy$3());
        XmasBridge.hookMethod(com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.update.Methods.INSTANCE.getClassUpdateO_a(), new AvoidSealUtil$avoidSealDy$4());
        XmasBridge.hookMethod(com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.update.Methods.INSTANCE.getClassUpdateUpdateHelper_a2(), new AvoidSealUtil$avoidSealDy$5());
    }

    public final void avoidSealSystem() {
        XposedHelpers.findAndHookMethod(Thread.class, "setDefaultUncaughtExceptionHandler", new Object[]{Thread.UncaughtExceptionHandler.class, new AvoidSealUtil$avoidSealSystem$1()});
        XposedHelpers.findAndHookMethod(Throwable.class, "getStackTrace", new Object[]{new AvoidSealUtil$avoidSealSystem$hookStack$1()});
        XposedHelpers.findAndHookMethod(ActivityManager.class, "getRunningAppProcesses", new Object[]{new AvoidSealUtil$avoidSealSystem$2()});
        XposedHelpers.findAndHookMethod(ActivityManager.class, "getRunningTasks", new Object[]{C.INSTANCE.getInt(), new AvoidSealUtil$avoidSealSystem$3()});
        XposedHelpers.findAndHookMethod(ActivityManager.class, "getRunningServices", new Object[]{C.INSTANCE.getInt(), new AvoidSealUtil$avoidSealSystem$4()});
    }

    public final boolean checkFilterFile(String str) {
        if (str == null) {
            return false;
        }
        if (!new Regex("/proc/[0-9]+/maps").matches(str)) {
            if (!checkFilterName(str)) {
                return false;
            }
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            Intrinsics.checkExpressionValueIsNotNull(externalStorageDirectory, "Environment.getExternalStorageDirectory()");
            String path = externalStorageDirectory.getPath();
            Intrinsics.checkExpressionValueIsNotNull(path, "Environment.getExternalStorageDirectory().path");
            if (!StringsKt.startsWith$default(str, path, false, 2, (Object) null)) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public final boolean checkFilterName(String str) {
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
        CharSequence charSequence = lowerCase;
        if (StringsKt.contains$default(charSequence, (CharSequence) Global.KW_XPOSED, false, 2, (Object) null) || StringsKt.contains$default(charSequence, (CharSequence) Global.KW_XMAS, false, 2, (Object) null) || StringsKt.contains$default(charSequence, (CharSequence) Global.MAGICIAN_PACKAGE_NAME, false, 2, (Object) null)) {
            return true;
        }
        return false;
    }
}
