package com.xp.wx.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.xp.wx.Global;
import com.xp.wx.backend.douyin.api.DyHookApi;
import com.xp.wx.spellbook.base.BaseGlobal;
import com.xp.wx.spellbook.douyin.DyGlobal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006J\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\bJ\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0006J\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/xp/wx/util/SharedPreferenceUtil;", "", "()V", "autoSendMsgSharedPreferences", "Landroid/content/SharedPreferences;", "getAutoSendMsgFanMaxTime", "", "getAutoSendMsgIndex", "", "getAutoSendMsgLoginUid", "getAutoSendMsgSendCount", "getAutoSendMsgSharedPreference", "getSharedPreference", "context", "Landroid/content/Context;", "saveAutoSendMsgFanMaxTime", "", "maxTime", "saveAutoSendMsgIndex", "index", "saveAutoSendMsgLoginUid", "uid", "saveAutoSendMsgSendCount", "count", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: SharedPreferenceUtil.kt */
public final class SharedPreferenceUtil {
    public static final SharedPreferenceUtil INSTANCE = new SharedPreferenceUtil();
    private static SharedPreferences autoSendMsgSharedPreferences;

    private SharedPreferenceUtil() {
    }

    public final SharedPreferences getSharedPreference(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        BaseGlobal global = Global.INSTANCE.getGlobal();
        if (global == null) {
            Intrinsics.throwNpe();
        }
        String loginUserId = global.getLoginUserId();
        if (Intrinsics.areEqual((Object) loginUserId, (Object) "")) {
            loginUserId = "xpwx";
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(loginUserId, 0);
        Intrinsics.checkExpressionValueIsNotNull(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }

    public final SharedPreferences getAutoSendMsgSharedPreference() {
        if (autoSendMsgSharedPreferences == null) {
            DyHookApi hookApi = DyGlobal.INSTANCE.getHookApi();
            if (hookApi == null) {
                Intrinsics.throwNpe();
            }
            autoSendMsgSharedPreferences = hookApi.getContext().getSharedPreferences("auto_send_msg", 0);
        }
        SharedPreferences sharedPreferences = autoSendMsgSharedPreferences;
        if (sharedPreferences == null) {
            Intrinsics.throwNpe();
        }
        return sharedPreferences;
    }

    public final void saveAutoSendMsgLoginUid(long j) {
        getAutoSendMsgSharedPreference().edit().putLong("login_uid", j).apply();
    }

    public final long getAutoSendMsgLoginUid() {
        return getAutoSendMsgSharedPreference().getLong("login_uid", 0);
    }

    public final void saveAutoSendMsgFanMaxTime(long j) {
        getAutoSendMsgSharedPreference().edit().putLong("fan_max_time", j).apply();
    }

    public final long getAutoSendMsgFanMaxTime() {
        return getAutoSendMsgSharedPreference().getLong("fan_max_time", 0);
    }

    public final void saveAutoSendMsgIndex(int i) {
        getAutoSendMsgSharedPreference().edit().putInt("index", i).apply();
    }

    public final int getAutoSendMsgIndex() {
        return getAutoSendMsgSharedPreference().getInt("index", 0);
    }

    public final void saveAutoSendMsgSendCount(int i) {
        getAutoSendMsgSharedPreference().edit().putInt("count", i).apply();
    }

    public final int getAutoSendMsgSendCount() {
        return getAutoSendMsgSharedPreference().getInt("count", 0);
    }
}
