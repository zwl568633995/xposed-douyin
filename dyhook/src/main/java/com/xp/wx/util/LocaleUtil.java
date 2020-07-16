package com.xp.wx.util;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import com.xp.wx.Global;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0004J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0003J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¨\u0006\u000f"}, d2 = {"Lcom/xp/wx/util/LocaleUtil;", "", "()V", "getLanguage", "", "context", "Landroid/content/Context;", "default", "onAttach", "persist", "", "language", "setLocale", "updateResources", "updateResourcesLegacy", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: LocaleUtil.kt */
public final class LocaleUtil {
    public static final LocaleUtil INSTANCE = new LocaleUtil();

    private LocaleUtil() {
    }

    public static /* synthetic */ String getLanguage$default(LocaleUtil localeUtil, Context context, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.getDefault()");
            str = locale.getLanguage();
            Intrinsics.checkExpressionValueIsNotNull(str, "Locale.getDefault().language");
        }
        return localeUtil.getLanguage(context, str);
    }

    public final String getLanguage(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "default");
        String string = IPCUtil.INSTANCE.getProtectedSharedPreferences(context, Global.PREFERENCE_NAME_SETTINGS, 0).getString(Global.SETTINGS_MODULE_LANGUAGE, str);
        Intrinsics.checkExpressionValueIsNotNull(string, "settings.getString(SETTI…MODULE_LANGUAGE, default)");
        return string;
    }

    public static /* synthetic */ Context onAttach$default(LocaleUtil localeUtil, Context context, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.getDefault()");
            str = locale.getLanguage();
            Intrinsics.checkExpressionValueIsNotNull(str, "Locale.getDefault().language");
        }
        return localeUtil.onAttach(context, str);
    }

    public final Context onAttach(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "default");
        return setLocale(context, getLanguage(context, str));
    }

    public final Context setLocale(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "language");
        persist(context, str);
        if (Build.VERSION.SDK_INT >= 24) {
            return updateResources(context, str);
        }
        return updateResourcesLegacy(context, str);
    }

    private final void persist(Context context, String str) {
        IPCUtil.INSTANCE.getProtectedSharedPreferences(context, Global.PREFERENCE_NAME_SETTINGS, 0).edit().putString(Global.SETTINGS_MODULE_LANGUAGE, str).apply();
    }

    private final Context updateResources(Context context, String str) {
        Locale locale = new Locale(str);
        Locale.setDefault(locale);
        Resources resources = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
        Configuration configuration = resources.getConfiguration();
        configuration.setLocale(locale);
        Context createConfigurationContext = context.createConfigurationContext(configuration);
        Intrinsics.checkExpressionValueIsNotNull(createConfigurationContext, "context.createConfigurationContext(configuration)");
        return createConfigurationContext;
    }

    private final Context updateResourcesLegacy(Context context, String str) {
        Locale locale = new Locale(str);
        Locale.setDefault(locale);
        Resources resources = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "resources");
        Configuration configuration = resources.getConfiguration();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        resources.getConfiguration().locale = locale;
        resources.updateConfiguration(configuration, displayMetrics);
        return context;
    }
}
