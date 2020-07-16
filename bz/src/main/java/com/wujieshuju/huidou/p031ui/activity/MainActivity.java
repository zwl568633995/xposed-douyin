package com.wujieshuju.huidou.p031ui.activity;

import android.content.res.ColorStateList;
import androidx.navigation.Navigation;
import androidx.navigation.p005ui.NavigationUI;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.wujieshuju.huidou.C1068R;
import com.wujieshuju.huidou.Const;
import com.wujieshuju.huidou.model.DashboardResponse;
import com.wujieshuju.huidou.network.BaseResponse;
import com.wujieshuju.huidou.network.OkHttpClientUtil;
import com.wujieshuju.huidou.p031ui.base.BaseActivity;
import com.wujieshuju.huidou.util.ConfigUtil;
import com.wujieshuju.huidou.util.ToastUtil;
import java.util.HashMap;

/* renamed from: com.wujieshuju.huidou.ui.activity.MainActivity */
public class MainActivity extends BaseActivity {
    private BottomNavigationView navView;

    /* access modifiers changed from: protected */
    public int getLayoutId() {
        return C1068R.layout.activity_main;
    }

    /* access modifiers changed from: protected */
    public void initData() {
    }

    /* access modifiers changed from: protected */
    public void initListener() {
    }

    /* access modifiers changed from: protected */
    public void initView() {
        this.navView = (BottomNavigationView) findViewById(C1068R.C1071id.nav_view);
    }

    /* access modifiers changed from: protected */
    public int getStatusBarColor() {
        return getColor(C1068R.C1069color.white);
    }

    /* access modifiers changed from: protected */
    public void setupView() {
        this.navView.setItemIconTintList((ColorStateList) null);
        this.navView.setItemTextAppearanceInactive(C1068R.C1071id.navigation_dashboard);
        this.navView.setLabelVisibilityMode(-1);
        NavigationUI.setupWithNavController(this.navView, Navigation.findNavController(this, C1068R.C1071id.nav_host_fragment));
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        refreshConfig();
    }

    private void refreshConfig() {
        String str = ConfigUtil.getInstance().getCurrentDyInfo().uid;
        if (str != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("assistantId", str);
            OkHttpClientUtil.getInstance().post(Const.URL_GET_ALL_FUNCTION_SETTING, hashMap, DashboardResponse.class, new OkHttpClientUtil.ResponseCallback() {
                public <T extends BaseResponse> void onComplete(T t) {
                    if (t.status != 1) {
                        return;
                    }
                    if (t.data instanceof DashboardResponse.data) {
                        ConfigUtil.getInstance().updateHDConfig((DashboardResponse.data) t.data);
                    } else {
                        ToastUtil.makeText("数据类型异常");
                    }
                }
            });
        }
    }

    public boolean onSupportNavigateUp() {
        return Navigation.findNavController(this, C1068R.C1071id.nav_host_fragment).navigateUp();
    }
}
