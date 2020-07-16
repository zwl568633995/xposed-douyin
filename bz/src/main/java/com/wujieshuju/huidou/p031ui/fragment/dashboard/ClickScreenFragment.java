package com.wujieshuju.huidou.p031ui.fragment.dashboard;

import android.app.ProgressDialog;
import android.view.View;
import android.widget.EditText;
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

/* renamed from: com.wujieshuju.huidou.ui.fragment.dashboard.ClickScreenFragment */
public class ClickScreenFragment extends BaseFragment {
    private EditText editTextClickScreenInterval;
    /* access modifiers changed from: private */
    public DashboardResponse.stAutoClick mData;
    private View tv_save;

    /* access modifiers changed from: protected */
    public String getActionBarTitle() {
        return "直播间点赞";
    }

    /* access modifiers changed from: protected */
    public int getLayoutId() {
        return C1068R.layout.fragment_click_screen;
    }

    /* access modifiers changed from: protected */
    public void setupView() {
    }

    /* access modifiers changed from: protected */
    public void initView() {
        setActionBar(C1068R.layout.actionbar_confirm_button);
        this.editTextClickScreenInterval = (EditText) findViewById(C1068R.C1071id.editTextClickScreenInterval);
        this.tv_save = getActionBarView(C1068R.C1071id.tv_save);
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
            DashboardResponse.stAutoClick stautoclick = ConfigUtil.getInstance().getHDConfig().stAutoClick;
            this.mData = stautoclick;
            if (stautoclick != null) {
                this.editTextClickScreenInterval.setText(String.valueOf(stautoclick.threshold));
            }
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
        final String trim = this.editTextClickScreenInterval.getText().toString().trim();
        if ("0".equals(trim)) {
            ToastUtil.makeText("点击频率不能为0！");
        } else if ("".equals(trim)) {
            ToastUtil.makeText("点击频率不能为空！");
        } else {
            final ProgressDialog createProgressDialog = ProgressUtil.createProgressDialog(getContext(), "保存中");
            createProgressDialog.show();
            HashMap hashMap = new HashMap();
            hashMap.put("id", String.valueOf(ConfigUtil.getInstance().getHDConfig().stAutoClick.f986id));
            hashMap.put("threshold", trim);
            hashMap.put("assistant_uid", ConfigUtil.getInstance().getCurrentDyInfo().uid);
            OkHttpClientUtil.getInstance().post(Const.URL_MODIFY_CLICK_SCREEN, hashMap, BaseResponse.class, new OkHttpClientUtil.ResponseCallback() {
                public <T extends BaseResponse> void onComplete(T t) {
                    createProgressDialog.dismiss();
                    Toast.makeText(ClickScreenFragment.this.getContext(), t.msg, 0).show();
                    if (t.status == 1) {
                        ClickScreenFragment.this.mData.threshold = Integer.parseInt(trim);
                        ConfigUtil.getInstance().updateHDConfig();
                    }
                }
            });
        }
    }
}
