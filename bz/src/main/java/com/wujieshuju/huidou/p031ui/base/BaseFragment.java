package com.wujieshuju.huidou.p031ui.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.wujieshuju.huidou.p031ui.activity.CommonFragmentActivity;

/* renamed from: com.wujieshuju.huidou.ui.base.BaseFragment */
public abstract class BaseFragment extends Fragment implements View.OnClickListener {
    private View mRootView;

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

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(getLayoutId(), viewGroup, false);
        this.mRootView = inflate;
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        initActionBar();
        initView();
        initListener();
        initData();
        setupView();
    }

    private void initActionBar() {
        ActionBar supportActionBar;
        AppCompatActivity appCompatActivity = (AppCompatActivity) getActivity();
        if (appCompatActivity != null && (supportActionBar = appCompatActivity.getSupportActionBar()) != null) {
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
    public View getRootView() {
        return this.mRootView;
    }

    /* access modifiers changed from: protected */
    public <T extends View> T findViewById(int i) {
        return this.mRootView.findViewById(i);
    }

    /* access modifiers changed from: protected */
    public void setActionBar(int i) {
        ActionBar supportActionBar;
        AppCompatActivity appCompatActivity = (AppCompatActivity) getActivity();
        if (appCompatActivity != null && (supportActionBar = appCompatActivity.getSupportActionBar()) != null) {
            View inflate = View.inflate(getContext(), i, (ViewGroup) null);
            ActionBar.LayoutParams layoutParams = new ActionBar.LayoutParams(-2, -1);
            layoutParams.gravity = 8388629;
            supportActionBar.setCustomView(inflate, layoutParams);
        }
    }

    /* access modifiers changed from: protected */
    public View getActionBarView(int i) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity.findViewById(i);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void startCommonFragmentActivity(Class<? extends Fragment> cls) {
        CommonFragmentActivity.start(getContext(), cls);
    }
}
