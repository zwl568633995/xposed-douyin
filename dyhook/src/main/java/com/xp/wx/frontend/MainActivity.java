package com.xp.wx.frontend;

import android.app.ActivityManager;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import com.xp.wx.Global;
import com.xp.wx.GlobalConst;
import com.xp.wx.frontend.fragments.PrefFragment;
import com.xp.wx.frontend.fragments.StatusFragment;
import com.xp.wx.hd.R;
import com.xp.wx.util.LocaleUtil;
import com.xp.wx.util.Log;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u0016J\u0012\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0015J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016¨\u0006\u0016"}, d2 = {"Lcom/xp/wx/frontend/MainActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Landroid/support/design/widget/NavigationView$OnNavigationItemSelectedListener;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "()V", "attachBaseContext", "", "base", "Landroid/content/Context;", "isProcessAlive", "", "onBackPressed", "onCheckedChanged", "p0", "Landroid/widget/CompoundButton;", "p1", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNavigationItemSelected", "item", "Landroid/view/MenuItem;", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: MainActivity.kt */
public final class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, CompoundButton.OnCheckedChangeListener {
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
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (compoundButton != null && compoundButton.getId() == R.id.debug_s) {
            GlobalConst.isDeBug = z;
            sendBroadcast(new Intent("com.xp.wx.botservice").putExtra("debug", GlobalConst.isDeBug));
        }
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "base");
        super.attachBaseContext(LocaleUtil.onAttach$default(LocaleUtil.INSTANCE, context, (String) null, 2, (Object) null));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_main);
        Switch switchR = (Switch) _$_findCachedViewById(com.xp.wx.R.id.debug_s);
        Intrinsics.checkExpressionValueIsNotNull(switchR, "debug_s");
        switchR.setChecked(GlobalConst.isDeBug);
        ((Switch) _$_findCachedViewById(com.xp.wx.R.id.debug_s)).setOnCheckedChangeListener(this);
        if (((ConstraintLayout) _$_findCachedViewById(com.xp.wx.R.id.main_container)) != null && bundle == null) {
            getFragmentManager().beginTransaction().replace(R.id.main_container, StatusFragment.Companion.newInstance()).commit();
        }
        getWindow().setFlags(128, 128);
    }

    public void onBackPressed() {
        if (((DrawerLayout) _$_findCachedViewById(com.xp.wx.R.id.drawer_layout)).isDrawerOpen((int) GravityCompat.START)) {
            ((DrawerLayout) _$_findCachedViewById(com.xp.wx.R.id.drawer_layout)).closeDrawer((int) GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    public boolean onNavigationItemSelected(MenuItem menuItem) {
        Fragment fragment;
        Intrinsics.checkParameterIsNotNull(menuItem, "item");
        if (((ConstraintLayout) _$_findCachedViewById(com.xp.wx.R.id.main_container)) == null) {
            return false;
        }
        switch (menuItem.getItemId()) {
            case R.id.nav_developer /*2131296367*/:
                fragment = PrefFragment.Companion.newInstance(R.xml.pref_developer, Global.PREFERENCE_NAME_DEVELOPER);
                break;
            case R.id.nav_message /*2131296369*/:
                fragment = PrefFragment.Companion.newInstance(R.xml.pref_message, "message");
                break;
            case R.id.nav_settings /*2131296370*/:
                fragment = PrefFragment.Companion.newInstance(R.xml.pref_settings, Global.PREFERENCE_NAME_SETTINGS);
                break;
            case R.id.nav_status /*2131296371*/:
                fragment = StatusFragment.Companion.newInstance();
                break;
            default:
                throw new Error("Unknown navigation item: " + menuItem.getItemId());
        }
        getFragmentManager().beginTransaction().replace(R.id.main_container, fragment).commit();
        ((DrawerLayout) _$_findCachedViewById(com.xp.wx.R.id.drawer_layout)).closeDrawer((int) GravityCompat.START);
        return true;
    }

    private final boolean isProcessAlive() {
        Object systemService = getSystemService("activity");
        if (systemService != null) {
            for (ActivityManager.RunningServiceInfo next : ((ActivityManager) systemService).getRunningServices(Integer.MAX_VALUE)) {
                if (Intrinsics.areEqual((Object) next.process, (Object) "com.xp.wx:services")) {
                    String str = GlobalConst.TAG;
                    Log.info(str, "存在进程：" + next.process);
                    return true;
                }
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.ActivityManager");
    }
}
