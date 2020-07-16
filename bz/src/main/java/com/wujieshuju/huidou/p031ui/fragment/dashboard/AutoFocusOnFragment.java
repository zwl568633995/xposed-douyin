package com.wujieshuju.huidou.p031ui.fragment.dashboard;

import android.app.ProgressDialog;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.wujieshuju.huidou.C1068R;
import com.wujieshuju.huidou.Const;
import com.wujieshuju.huidou.model.DashboardResponse;
import com.wujieshuju.huidou.network.BaseResponse;
import com.wujieshuju.huidou.network.OkHttpClientUtil;
import com.wujieshuju.huidou.p031ui.base.BaseFragment;
import com.wujieshuju.huidou.util.ConfigUtil;
import com.wujieshuju.huidou.util.ProgressUtil;
import com.wujieshuju.huidou.util.ToastUtil;
import java.util.HashMap;

/* renamed from: com.wujieshuju.huidou.ui.fragment.dashboard.AutoFocusOnFragment */
public class AutoFocusOnFragment extends BaseFragment {
    private EditText autoFocusOnIntervalEditText;
    private EditText autoFocusOnMaxPersonEditText;
    /* access modifiers changed from: private */
    public DashboardResponse.stAutoSubscribe mData;
    private TextView tv_save;

    /* access modifiers changed from: protected */
    public String getActionBarTitle() {
        return "自动关注";
    }

    /* access modifiers changed from: protected */
    public int getLayoutId() {
        return C1068R.layout.fragment_auto_focus_on;
    }

    /* access modifiers changed from: protected */
    public void setupView() {
    }

    /* access modifiers changed from: protected */
    public void initView() {
        setActionBar(C1068R.layout.actionbar_confirm_button);
        this.autoFocusOnIntervalEditText = (EditText) findViewById(C1068R.C1071id.autoFocusOnIntervalEditText);
        this.autoFocusOnMaxPersonEditText = (EditText) findViewById(C1068R.C1071id.autoFocusOnMaxPersonEditText);
        this.tv_save = (TextView) getActionBarView(C1068R.C1071id.tv_save);
    }

    /* access modifiers changed from: protected */
    public void initListener() {
        this.tv_save.setOnClickListener(this);
    }

    /* access modifiers changed from: protected */
    public void initData() {
        if (ConfigUtil.getInstance().getCurrentDyInfo().uid != null) {
            if (ConfigUtil.getInstance().getHDConfig() == null) {
                Toast.makeText(getContext(), "配置数据错误，重新进入当前页面", 0).show();
                return;
            }
            DashboardResponse.stAutoSubscribe stautosubscribe = ConfigUtil.getInstance().getHDConfig().stAutoSubscribe;
            this.mData = stautosubscribe;
            this.autoFocusOnIntervalEditText.setText(String.valueOf(stautosubscribe.interval));
            this.autoFocusOnMaxPersonEditText.setText(String.valueOf(this.mData.threshold));
        }
    }

    public void onClick(View view) {
        if (view != this.tv_save) {
            return;
        }
        if (!ConfigUtil.getInstance().getCurrentDyInfo().isBind) {
            ToastUtil.makeText("未绑定抖音号");
            return;
        }
        ProgressDialog createProgressDialog = ProgressUtil.createProgressDialog(getContext(), "保存中");
        createProgressDialog.show();
        final String obj = this.autoFocusOnIntervalEditText.getText().toString();
        final String obj2 = this.autoFocusOnMaxPersonEditText.getText().toString();
        HashMap hashMap = new HashMap();
        hashMap.put("id", String.valueOf(ConfigUtil.getInstance().getHDConfig().stAutoShopping.f986id));
        hashMap.put("assistant_uid", ConfigUtil.getInstance().getCurrentDyInfo().uid);
        hashMap.put("interval", obj);
        hashMap.put("threshold", obj2);
        OkHttpClientUtil.getInstance().post(Const.URL_MODIFY_AUTO_BUY, hashMap, BaseResponse.class, new OkHttpClientUtil.ResponseCallback() {
            public <T extends BaseResponse> void onComplete(T t) {
                Toast.makeText(AutoFocusOnFragment.this.getContext(), t.msg, 0).show();
                if (t.status == 1) {
                    AutoFocusOnFragment.this.mData.interval = Integer.parseInt(obj);
                    AutoFocusOnFragment.this.mData.threshold = Integer.parseInt(obj2);
                    ConfigUtil.getInstance().updateHDConfig();
                }
            }
        });
        createProgressDialog.dismiss();
    }
}
