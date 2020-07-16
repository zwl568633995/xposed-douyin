package com.wujieshuju.huidou.p031ui.activity;

import android.content.Intent;
import android.view.View;
import com.wujieshuju.huidou.C1068R;
import com.wujieshuju.huidou.p031ui.base.BaseActivity;
import com.wujieshuju.huidou.util.SharedPreferencesUtil;

/* renamed from: com.wujieshuju.huidou.ui.activity.LoadingActivity */
public class LoadingActivity extends BaseActivity {
    /* access modifiers changed from: protected */
    public int getLayoutId() {
        return C1068R.layout.activity_loading;
    }

    /* access modifiers changed from: protected */
    public void initData() {
    }

    /* access modifiers changed from: protected */
    public void initView() {
    }

    /* access modifiers changed from: protected */
    public void initListener() {
        findViewById(C1068R.C1071id.startActivityButton).setOnClickListener(this);
    }

    /* access modifiers changed from: protected */
    public void setupView() {
        findViewById(C1068R.C1071id.loadingImageView).setSystemUiVisibility(4871);
    }

    public void onClick(View view) {
        if (view.getId() == C1068R.C1071id.startActivityButton) {
            startActivity(new Intent(this, LoginActivity.class));
            SharedPreferencesUtil.saveIsFirstLaunch(false);
            finish();
        }
    }
}
