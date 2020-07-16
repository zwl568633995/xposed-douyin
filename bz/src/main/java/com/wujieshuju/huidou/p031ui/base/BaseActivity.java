package com.wujieshuju.huidou.p031ui.base;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.wujieshuju.huidou.C1068R;
import com.wujieshuju.huidou.p031ui.activity.CommonFragmentActivity;
import com.wujieshuju.huidou.util.StatusBarUtil;

/* renamed from: com.wujieshuju.huidou.ui.base.BaseActivity */
public abstract class BaseActivity extends AppCompatActivity implements View.OnClickListener {
    /* access modifiers changed from: protected */
    public String getActionBarTitle() {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract int getLayoutId();

    /* access modifiers changed from: protected */
    public abstract void initData();

    /* access modifiers changed from: protected */
    public abstract void initListener();

    /* access modifiers changed from: protected */
    public abstract void initView();

    public void onClick(View view) {
    }

    /* access modifiers changed from: protected */
    public abstract void setupView();

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        StatusBarUtil.setStatusBar(getWindow(), getStatusBarColor(), true);
        initActionBar();
        setContentView(getLayoutId());
        initView();
        initListener();
        initData();
        setupView();
    }

    private void initActionBar() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            String actionBarTitle = getActionBarTitle();
            if (actionBarTitle != null) {
                supportActionBar.setTitle((CharSequence) actionBarTitle);
            }
            supportActionBar.setHomeButtonEnabled(true);
            supportActionBar.setDisplayHomeAsUpEnabled(true);
            supportActionBar.setDisplayShowCustomEnabled(true);
        }
    }

    /* access modifiers changed from: protected */
    public int getStatusBarColor() {
        return getColor(C1068R.C1069color.purple_700);
    }

    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }

    /* access modifiers changed from: protected */
    public void startCommonFragmentActivity(Class<? extends Fragment> cls) {
        CommonFragmentActivity.start(this, cls);
    }
}
