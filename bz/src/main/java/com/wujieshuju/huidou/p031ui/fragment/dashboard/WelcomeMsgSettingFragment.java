package com.wujieshuju.huidou.p031ui.fragment.dashboard;

import android.app.ProgressDialog;
import android.text.Editable;
import android.text.TextWatcher;
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

/* renamed from: com.wujieshuju.huidou.ui.fragment.dashboard.WelcomeMsgSettingFragment */
public class WelcomeMsgSettingFragment extends BaseFragment {
    public EditText editTextWelcomeMsg;
    public DashboardResponse.stReplyWelcome mData;
    public TextView sentMsgEditTextTips;
    public TextView tv_save;

    /* access modifiers changed from: protected */
    public String getActionBarTitle() {
        return "欢迎语";
    }

    /* access modifiers changed from: protected */
    public int getLayoutId() {
        return C1068R.layout.fragment_welcome_msg_setting;
    }

    /* access modifiers changed from: protected */
    public void setupView() {
    }

    /* access modifiers changed from: protected */
    public void initView() {
        setActionBar(C1068R.layout.actionbar_confirm_button);
        this.editTextWelcomeMsg = (EditText) findViewById(C1068R.C1071id.sentMsgEditText);
        this.sentMsgEditTextTips = (TextView) findViewById(C1068R.C1071id.sentMsgEditTextTip);
        this.tv_save = (TextView) getActionBarView(C1068R.C1071id.tv_save);
    }

    /* access modifiers changed from: protected */
    public void initListener() {
        this.tv_save.setOnClickListener(this);
        this.editTextWelcomeMsg.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (charSequence.length() >= 10) {
                    charSequence = charSequence.subSequence(0, 10) + "...";
                }
                WelcomeMsgSettingFragment.this.sentMsgEditTextTips.setText("展示效果：\n @粉丝昵称 " + charSequence);
            }
        });
    }

    /* access modifiers changed from: protected */
    public void initData() {
        if (ConfigUtil.getInstance().getCurrentDyInfo().uid != null) {
            if (ConfigUtil.getInstance().getHDConfig() == null) {
                Toast.makeText(getContext(), "配置数据错误，重新进入当前页面", 0).show();
                return;
            }
            DashboardResponse.stReplyWelcome streplywelcome = ConfigUtil.getInstance().getHDConfig().stReplyWelcome;
            this.mData = streplywelcome;
            if (streplywelcome != null) {
                this.editTextWelcomeMsg.setText(streplywelcome.content);
            }
        }
    }

    public void onClick(View view) {
        if (view == this.tv_save) {
            if (!ConfigUtil.getInstance().getCurrentDyInfo().isBind) {
                ToastUtil.makeText("未绑定抖音号");
                return;
            }
            final String trim = this.editTextWelcomeMsg.getText().toString().trim();
            if ("".equals(trim)) {
                ToastUtil.makeText("欢迎语内容不能为空！");
                return;
            }
            final ProgressDialog createProgressDialog = ProgressUtil.createProgressDialog(getContext(), "保存中");
            createProgressDialog.show();
            HashMap hashMap = new HashMap();
            hashMap.put("id", String.valueOf(this.mData.f986id));
            hashMap.put("content", trim);
            hashMap.put("assistant_uid", ConfigUtil.getInstance().getCurrentDyInfo().uid);
            OkHttpClientUtil.getInstance().post(Const.URL_MODIFY_WELCOME_MSG, hashMap, BaseResponse.class, new OkHttpClientUtil.ResponseCallback() {
                public <T extends BaseResponse> void onComplete(T t) {
                    createProgressDialog.dismiss();
                    Toast.makeText(WelcomeMsgSettingFragment.this.getContext(), t.msg, 0).show();
                    if (t.status == 1) {
                        WelcomeMsgSettingFragment.this.mData.content = trim;
                        ConfigUtil.getInstance().updateHDConfig();
                    }
                }
            });
        }
    }
}
