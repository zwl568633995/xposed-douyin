package com.xp.wx.frontend.fragments;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.xp.wx.Global;
import com.xp.wx.hd.R;
import com.xp.wx.util.IPCUtil;
import com.xp.wx.util.LocaleUtil;
import com.xp.wx.util.Log;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J&\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0016¨\u0006\u0016"}, d2 = {"Lcom/xp/wx/frontend/fragments/PrefFragment;", "Landroid/preference/PreferenceFragment;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onSharedPreferenceChanged", "preferences", "Landroid/content/SharedPreferences;", "key", "", "onStart", "onStop", "Companion", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: PrefFragment.kt */
public final class PrefFragment extends PreferenceFragment implements SharedPreferences.OnSharedPreferenceChangeListener {
    private static final String ARG_PREF_NAME = "preferencesFileName";
    private static final String ARG_PREF_RES = "preferencesResId";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String TAG = "PrefFragment";
    private HashMap _$_findViewCache;

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        r0 = r0.getApplicationInfo();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            super.onCreate(r5)
            int r5 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r5 < r0) goto L_0x005c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            android.app.Activity r0 = r4.getActivity()
            r1 = 0
            if (r0 == 0) goto L_0x001e
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = r0.dataDir
            goto L_0x001f
        L_0x001e:
            r0 = r1
        L_0x001f:
            r5.append(r0)
            java.lang.String r0 = "/shared_prefs"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.app.Activity r3 = r4.getActivity()
            if (r3 == 0) goto L_0x003e
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()
            if (r3 == 0) goto L_0x003e
            java.lang.String r1 = r3.deviceProtectedDataDir
        L_0x003e:
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0055 }
            r1.<init>(r5)     // Catch:{ all -> 0x0055 }
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x0055 }
            r5.<init>(r0)     // Catch:{ all -> 0x0055 }
            r1.renameTo(r5)     // Catch:{ all -> 0x0055 }
        L_0x0055:
            android.preference.PreferenceManager r5 = r4.getPreferenceManager()
            r5.setStorageDeviceProtected()
        L_0x005c:
            android.os.Bundle r5 = r4.getArguments()
            if (r5 == 0) goto L_0x008f
            android.os.Bundle r5 = r4.getArguments()
            if (r5 != 0) goto L_0x006b
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x006b:
            java.lang.String r0 = "preferencesResId"
            int r5 = r5.getInt(r0)
            android.os.Bundle r0 = r4.getArguments()
            if (r0 != 0) goto L_0x007a
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x007a:
            java.lang.String r1 = "preferencesFileName"
            java.lang.String r0 = r0.getString(r1)
            android.preference.PreferenceManager r1 = r4.getPreferenceManager()
            java.lang.String r2 = "preferenceManager"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r1.setSharedPreferencesName(r0)
            r4.addPreferencesFromResource(r5)
        L_0x008f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.frontend.fragments.PrefFragment.onCreate(android.os.Bundle):void");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (onCreateView == null) {
            return null;
        }
        Activity activity = getActivity();
        if (activity == null) {
            Intrinsics.throwNpe();
        }
        onCreateView.setBackgroundColor(ContextCompat.getColor(activity, R.color.card_background));
        return onCreateView;
    }

    public void onStart() {
        super.onStart();
        PreferenceManager preferenceManager = getPreferenceManager();
        Intrinsics.checkExpressionValueIsNotNull(preferenceManager, "preferenceManager");
        preferenceManager.getSharedPreferences().registerOnSharedPreferenceChangeListener(this);
    }

    public void onStop() {
        PreferenceManager preferenceManager = getPreferenceManager();
        Intrinsics.checkExpressionValueIsNotNull(preferenceManager, "preferenceManager");
        preferenceManager.getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);
        super.onStop();
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        Activity activity;
        Intrinsics.checkParameterIsNotNull(sharedPreferences, "preferences");
        Intrinsics.checkParameterIsNotNull(str, "key");
        int hashCode = str.hashCode();
        int i = 2;
        if (hashCode != -744497228) {
            if (hashCode == 1149764527 && str.equals(Global.SETTINGS_MODULE_LANGUAGE)) {
                try {
                    LocaleUtil localeUtil = LocaleUtil.INSTANCE;
                    Activity activity2 = getActivity();
                    if (activity2 == null) {
                        Intrinsics.throwNpe();
                    }
                    String language$default = LocaleUtil.getLanguage$default(localeUtil, activity2, (String) null, 2, (Object) null);
                    LocaleUtil localeUtil2 = LocaleUtil.INSTANCE;
                    Activity activity3 = getActivity();
                    if (activity3 == null) {
                        Intrinsics.throwNpe();
                    }
                    localeUtil2.setLocale(activity3, language$default);
                    Activity activity4 = getActivity();
                    if (activity4 == null) {
                        Intrinsics.throwNpe();
                    }
                    activity4.recreate();
                    return;
                } catch (Throwable th) {
                    Log.error(TAG, "Cannot change language: " + th);
                    Toast.makeText(getActivity(), th.getLocalizedMessage(), 0).show();
                    return;
                }
            }
        } else if (str.equals(Global.SETTINGS_INTERFACE_HIDE_ICON)) {
            try {
                if (!sharedPreferences.getBoolean(Global.SETTINGS_INTERFACE_HIDE_ICON, false)) {
                    i = 1;
                }
                ComponentName componentName = new ComponentName("com.xp.wx.hd", "com.xp.wx.frontend.MainActivityAlias");
                Activity activity5 = getActivity();
                if (activity5 == null) {
                    Intrinsics.throwNpe();
                }
                activity5.getPackageManager().setComponentEnabledSetting(componentName, i, 1);
                return;
            } catch (Throwable th2) {
                Log.error(TAG, "Cannot hide icon: " + th2);
                Toast.makeText(getActivity(), th2.getLocalizedMessage(), 0).show();
                return;
            }
        }
        Object obj = sharedPreferences.getAll().get(str);
        if (obj != null && (activity = getActivity()) != null) {
            Intent intent = new Intent(Global.ACTION_UPDATE_PREF);
            intent.putExtra("key", str);
            IPCUtil.INSTANCE.putExtra(intent, "value", obj);
            activity.sendBroadcast(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xp/wx/frontend/fragments/PrefFragment$Companion;", "", "()V", "ARG_PREF_NAME", "", "ARG_PREF_RES", "TAG", "newInstance", "Lcom/xp/wx/frontend/fragments/PrefFragment;", "preferencesResId", "", "preferencesName", "app_release"}, k = 1, mv = {1, 1, 13})
    /* compiled from: PrefFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PrefFragment newInstance(int i, String str) {
            Intrinsics.checkParameterIsNotNull(str, "preferencesName");
            PrefFragment prefFragment = new PrefFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(PrefFragment.ARG_PREF_RES, i);
            bundle.putString(PrefFragment.ARG_PREF_NAME, str);
            prefFragment.setArguments(bundle);
            return prefFragment;
        }
    }
}
