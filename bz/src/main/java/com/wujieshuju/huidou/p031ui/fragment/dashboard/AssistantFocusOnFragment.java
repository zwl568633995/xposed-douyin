package com.wujieshuju.huidou.p031ui.fragment.dashboard;

import android.widget.Toast;
import com.wujieshuju.huidou.C1068R;
import com.wujieshuju.huidou.p031ui.base.BaseFragment;
import com.wujieshuju.huidou.util.ConfigUtil;

/* renamed from: com.wujieshuju.huidou.ui.fragment.dashboard.AssistantFocusOnFragment */
public class AssistantFocusOnFragment extends BaseFragment {
    /* access modifiers changed from: protected */
    public String getActionBarTitle() {
        return "关注回复";
    }

    /* access modifiers changed from: protected */
    public int getLayoutId() {
        return C1068R.layout.fragment_assistant_foces_on;
    }

    /* access modifiers changed from: protected */
    public void initListener() {
    }

    /* access modifiers changed from: protected */
    public void initView() {
    }

    /* access modifiers changed from: protected */
    public void setupView() {
    }

    /* access modifiers changed from: protected */
    public void initData() {
        if (ConfigUtil.getInstance().getHDConfig() == null) {
            Toast.makeText(getContext(), "配置数据错误，重新进入当前页面", 0).show();
        }
    }
}
