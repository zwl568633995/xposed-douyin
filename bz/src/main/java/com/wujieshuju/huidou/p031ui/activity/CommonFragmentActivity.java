package com.wujieshuju.huidou.p031ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.wujieshuju.huidou.C1068R;
import com.wujieshuju.huidou.Const;
import com.wujieshuju.huidou.HDApp;
import com.wujieshuju.huidou.p031ui.base.BaseActivity;
import com.wujieshuju.huidou.util.LogUtil;

/* renamed from: com.wujieshuju.huidou.ui.activity.CommonFragmentActivity */
public class CommonFragmentActivity extends BaseActivity {
    /* access modifiers changed from: protected */
    public int getLayoutId() {
        return C1068R.layout.activity_common_fragment;
    }

    /* access modifiers changed from: protected */
    public void initData() {
    }

    /* access modifiers changed from: protected */
    public void initListener() {
    }

    /* access modifiers changed from: protected */
    public void initView() {
    }

    public static void start(Context context, Class<? extends Fragment> cls) {
        start(context, cls, (Bundle) null);
    }

    public static void start(Context context, Class<? extends Fragment> cls, Bundle bundle) {
        Intent intent = new Intent(HDApp.getApp(), CommonFragmentActivity.class);
        intent.putExtra("fragment", cls.getName());
        intent.putExtra("params", bundle);
        context.startActivity(intent);
    }

    /* access modifiers changed from: protected */
    public void setupView() {
        String stringExtra = getIntent().getStringExtra("fragment");
        if (!TextUtils.isEmpty(stringExtra)) {
            try {
                Fragment fragment = (Fragment) Class.forName(stringExtra).newInstance();
                fragment.setArguments(getIntent().getBundleExtra("params"));
                getSupportFragmentManager().beginTransaction().replace(C1068R.C1071id.container, fragment).commit();
            } catch (Exception e) {
                LogUtil.m820e(Const.TAG, (Throwable) e);
                finish();
            }
        }
    }
}
