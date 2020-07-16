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

/* renamed from: com.wujieshuju.huidou.ui.fragment.dashboard.TimingNoticeFragment */
public class TimingNoticeFragment extends BaseFragment {
    public EditText editTextNoticeMsg;
    public EditText editTextNoticeMsgInterval;
    /* access modifiers changed from: private */
    public DashboardResponse.StSendBulletin mData;
    public TextView tv_save;

    /* access modifiers changed from: protected */
    public String getActionBarTitle() {
        return "定时公告";
    }

    /* access modifiers changed from: protected */
    public int getLayoutId() {
        return C1068R.layout.fragment_dashboard_timing_notice;
    }

    /* access modifiers changed from: protected */
    public void setupView() {
    }

    /* access modifiers changed from: protected */
    public void initView() {
        setActionBar(C1068R.layout.actionbar_confirm_button);
        this.editTextNoticeMsg = (EditText) findViewById(C1068R.C1071id.editTextNoticeMsg);
        this.editTextNoticeMsgInterval = (EditText) findViewById(C1068R.C1071id.editTextNoticeMsgInterval);
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
            DashboardResponse.StSendBulletin stSendBulletin = ConfigUtil.getInstance().getHDConfig().stSendBulletin;
            this.mData = stSendBulletin;
            if (stSendBulletin != null) {
                this.editTextNoticeMsg.setText(stSendBulletin.content);
                this.editTextNoticeMsgInterval.setText(String.valueOf(this.mData.interval));
            }
        }
    }

    public void onClick(View view) {
        if (view == this.tv_save) {
            if (!ConfigUtil.getInstance().getCurrentDyInfo().isBind) {
                ToastUtil.makeText("未绑定抖音号");
                return;
            }
            final String obj = this.editTextNoticeMsg.getText().toString();
            if ("".equals(obj)) {
                ToastUtil.makeText("公告内容不能为空！");
                return;
            }
            final String trim = this.editTextNoticeMsgInterval.getText().toString().trim();
            if ("0".equals(trim)) {
                ToastUtil.makeText("间隔时间不能为0！");
            } else if ("".equals(trim)) {
                ToastUtil.makeText("间隔时间不能为空！");
            } else {
                final ProgressDialog createProgressDialog = ProgressUtil.createProgressDialog(getContext(), "保存中");
                createProgressDialog.show();
                HashMap hashMap = new HashMap();
                hashMap.put("id", String.valueOf(this.mData.f986id));
                hashMap.put("content", obj);
                hashMap.put("interval", trim);
                hashMap.put("assistant_uid", ConfigUtil.getInstance().getCurrentDyInfo().uid);
                OkHttpClientUtil.getInstance().post(Const.URL_MODIFY_ST_SEND_BULLETIN, hashMap, BaseResponse.class, new OkHttpClientUtil.ResponseCallback() {
                    public <T extends BaseResponse> void onComplete(T t) {
                        createProgressDialog.dismiss();
                        Toast.makeText(TimingNoticeFragment.this.getContext(), t.msg, 0).show();
                        if (t.status == 1) {
                            TimingNoticeFragment.this.mData.interval = Integer.parseInt(trim);
                            TimingNoticeFragment.this.mData.content = obj;
                            ConfigUtil.getInstance().updateHDConfig();
                        }
                    }
                });
            }
        }
    }
}
