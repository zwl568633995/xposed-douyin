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

/* renamed from: com.wujieshuju.huidou.ui.fragment.dashboard.FocusOnReplyFragment */
public class FocusOnReplyFragment extends BaseFragment implements ConfigUtil.OnConfigChangeListener {
    private EditText editTextFocusOnReply;
    /* access modifiers changed from: private */
    public DashboardResponse.stReplySubscribe mData;
    private TextView tv_save;

    /* access modifiers changed from: protected */
    public String getActionBarTitle() {
        return "关注回复";
    }

    /* access modifiers changed from: protected */
    public int getLayoutId() {
        return C1068R.layout.fragment_focus_on_reply;
    }

    /* access modifiers changed from: protected */
    public void setupView() {
    }

    /* access modifiers changed from: protected */
    public void initView() {
        setActionBar(C1068R.layout.actionbar_confirm_button);
        this.tv_save = (TextView) getActionBarView(C1068R.C1071id.tv_save);
        this.editTextFocusOnReply = (EditText) findViewById(C1068R.C1071id.sentMsgEditText);
    }

    /* access modifiers changed from: protected */
    public void initListener() {
        this.tv_save.setOnClickListener(this);
        ConfigUtil.getInstance().addOnConfigChangeListener(this);
    }

    /* access modifiers changed from: protected */
    public void initData() {
        if (ConfigUtil.getInstance().getCurrentDyInfo().uid != null) {
            if (ConfigUtil.getInstance().getHDConfig() == null) {
                Toast.makeText(getContext(), "配置数据错误，重新进入当前页面", 0).show();
                return;
            }
            DashboardResponse.stReplySubscribe streplysubscribe = ConfigUtil.getInstance().getHDConfig().stReplySubscribe;
            this.mData = streplysubscribe;
            this.editTextFocusOnReply.setText(streplysubscribe.content);
        }
    }

    public void onClick(View view) {
        if (view == this.tv_save) {
            if (!ConfigUtil.getInstance().getCurrentDyInfo().isBind) {
                ToastUtil.makeText("未绑定抖音号");
                return;
            }
            final String trim = this.editTextFocusOnReply.getText().toString().trim();
            if ("".equals(trim)) {
                ToastUtil.makeText("关注回复内容不能为空！");
                return;
            }
            final ProgressDialog createProgressDialog = ProgressUtil.createProgressDialog(getContext(), "保存中");
            createProgressDialog.show();
            HashMap hashMap = new HashMap();
            hashMap.put("id", String.valueOf(this.mData.f986id));
            hashMap.put("content", trim);
            hashMap.put("assistant_uid", ConfigUtil.getInstance().getCurrentDyInfo().uid);
            OkHttpClientUtil.getInstance().post(Const.URL_FOCUS_ON_REPLY, hashMap, BaseResponse.class, new OkHttpClientUtil.ResponseCallback() {
                public <T extends BaseResponse> void onComplete(T t) {
                    createProgressDialog.dismiss();
                    Toast.makeText(FocusOnReplyFragment.this.getContext(), t.msg, 0).show();
                    if (t.status == 1) {
                        FocusOnReplyFragment.this.mData.content = trim;
                        ConfigUtil.getInstance().updateHDConfig();
                    }
                }
            });
        }
    }

    public void onChanged(String str, String str2) {
        if (ConfigUtil.KEY_HD_CONFIG.equals(str)) {
            initData();
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        ConfigUtil.getInstance().removeOnConfigChangeListener(this);
    }
}
