package com.wujieshuju.huidou.p031ui.fragment.dashboard;

import android.app.ProgressDialog;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;
import com.wujieshuju.huidou.C1068R;
import com.wujieshuju.huidou.Const;
import com.wujieshuju.huidou.model.DashboardResponse;
import com.wujieshuju.huidou.network.BaseResponse;
import com.wujieshuju.huidou.network.OkHttpClientUtil;
import com.wujieshuju.huidou.p031ui.base.BaseFragment;
import com.wujieshuju.huidou.util.ConfigUtil;
import com.wujieshuju.huidou.util.DataUtil;
import com.wujieshuju.huidou.util.ProgressUtil;
import com.wujieshuju.huidou.util.ToastUtil;
import java.util.HashMap;

/* renamed from: com.wujieshuju.huidou.ui.fragment.dashboard.SendMsgToFansFragment */
public class SendMsgToFansFragment extends BaseFragment implements ConfigUtil.OnConfigChangeListener {
    private Button cancelButton;
    /* access modifiers changed from: private */
    public DashboardResponse.stSenFan data;
    private TextView focusEachOtherTextView;
    private TextView genderFemaleTextView;
    private TextView genderMaleTextView;
    private LinearInterpolator interpolator;
    private ImageView loadingImageView;
    private TextView noFocusTextView;
    private Animation rotateAnimation;
    private EditText sendFansCountEditText;
    private EditText sendIntervalEditText;
    private EditText sentMsgEditText;
    private Button startButton;
    private TextView tipsTextView;
    private TextView tv_save;

    /* access modifiers changed from: protected */
    public String getActionBarTitle() {
        return "粉丝群发消息";
    }

    /* access modifiers changed from: protected */
    public int getLayoutId() {
        return C1068R.layout.fragment_send_msg_to_fans;
    }

    /* access modifiers changed from: protected */
    public void setupView() {
    }

    /* access modifiers changed from: protected */
    public void initView() {
        setActionBar(C1068R.layout.actionbar_confirm_button);
        this.focusEachOtherTextView = (TextView) findViewById(C1068R.C1071id.focusEachOtherTextView);
        this.noFocusTextView = (TextView) findViewById(C1068R.C1071id.noFocusTextView);
        this.genderMaleTextView = (TextView) findViewById(C1068R.C1071id.genderMaleTextView);
        this.genderFemaleTextView = (TextView) findViewById(C1068R.C1071id.genderFemaleTextView);
        this.sentMsgEditText = (EditText) findViewById(C1068R.C1071id.sentMsgEditText);
        this.sendFansCountEditText = (EditText) findViewById(C1068R.C1071id.sendFansCountEditText);
        this.sendIntervalEditText = (EditText) findViewById(C1068R.C1071id.sendIntervalEditText);
        this.startButton = (Button) findViewById(C1068R.C1071id.startButton);
        this.cancelButton = (Button) findViewById(C1068R.C1071id.cancelButton);
        this.tipsTextView = (TextView) findViewById(C1068R.C1071id.sendStatusTextView);
        this.loadingImageView = (ImageView) findViewById(C1068R.C1071id.loadingImageView);
        this.tv_save = (TextView) getActionBarView(C1068R.C1071id.tv_save);
        this.rotateAnimation = AnimationUtils.loadAnimation(getContext(), C1068R.anim.anim_circle_rotate);
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        this.interpolator = linearInterpolator;
        this.rotateAnimation.setInterpolator(linearInterpolator);
    }

    /* access modifiers changed from: protected */
    public void initListener() {
        this.tv_save.setOnClickListener(this);
        this.focusEachOtherTextView.setOnClickListener(this);
        this.noFocusTextView.setOnClickListener(this);
        this.genderMaleTextView.setOnClickListener(this);
        this.genderFemaleTextView.setOnClickListener(this);
        this.startButton.setOnClickListener(this);
        ConfigUtil.getInstance().addOnConfigChangeListener(this);
        this.cancelButton.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                SendMsgToFansFragment.this.lambda$initListener$0$SendMsgToFansFragment(view);
            }
        });
    }

    public /* synthetic */ void lambda$initListener$0$SendMsgToFansFragment(View view) {
        if (this.data.status == 0) {
            ToastUtil.makeText("任务未开始");
        } else if (this.data.status != 30) {
            this.startButton.setText("开始群发");
            this.tipsTextView.setText("群发已取消");
            this.tipsTextView.setVisibility(0);
            this.loadingImageView.setImageResource(C1068R.C1070drawable.ic_cancel_yellow);
            this.loadingImageView.setVisibility(0);
            this.loadingImageView.clearAnimation();
            this.data.status = 30;
            changeStatus(String.valueOf(this.data.status));
        }
    }

    /* access modifiers changed from: protected */
    public void initData() {
        if (ConfigUtil.getInstance().getHDConfig() == null) {
            Toast.makeText(getContext(), "配置数据错误，重新进入当前页面", 0).show();
            return;
        }
        DashboardResponse.stSenFan stsenfan = ConfigUtil.getInstance().getHDConfig().stSenFan;
        this.data = stsenfan;
        int i = stsenfan.status;
        if (i == 10) {
            this.startButton.setText("暂停群发");
            this.tipsTextView.setVisibility(0);
            this.tipsTextView.setText("正在群发消息......");
            this.loadingImageView.setImageResource(C1068R.C1070drawable.ic_loading);
            this.loadingImageView.setVisibility(0);
            this.loadingImageView.startAnimation(this.rotateAnimation);
        } else if (i == 20) {
            this.startButton.setText("继续群发");
            this.tipsTextView.setText("群发已暂停");
            this.tipsTextView.setVisibility(0);
            this.loadingImageView.setVisibility(0);
            this.loadingImageView.clearAnimation();
            this.loadingImageView.setImageResource(C1068R.C1070drawable.ic_pause);
        } else if (i == 30) {
            this.startButton.setText("开始群发");
            this.tipsTextView.setText("群发已取消");
            this.tipsTextView.setVisibility(0);
            this.loadingImageView.setImageResource(C1068R.C1070drawable.ic_cancel_yellow);
            this.loadingImageView.setVisibility(0);
            this.loadingImageView.clearAnimation();
        } else if (i == 40) {
            this.startButton.setText("开始群发");
            this.tipsTextView.setVisibility(0);
            this.loadingImageView.setVisibility(0);
            this.loadingImageView.setImageResource(C1068R.C1070drawable.ic_check_green);
            this.tipsTextView.setText("群发已完成！");
            this.loadingImageView.clearAnimation();
        }
        int i2 = this.data.subscribe_type;
        if (i2 == 0) {
            this.focusEachOtherTextView.setSelected(true);
            this.noFocusTextView.setSelected(true);
        } else if (i2 == 10) {
            this.focusEachOtherTextView.setSelected(true);
        } else if (i2 != 20) {
            Toast.makeText(getContext(), "关注类型错误", 0).show();
        } else {
            this.noFocusTextView.setSelected(true);
        }
        int i3 = this.data.sex_type;
        if (i3 == 0) {
            this.genderMaleTextView.setSelected(true);
            this.genderFemaleTextView.setSelected(true);
        } else if (i3 == 10) {
            this.genderMaleTextView.setSelected(true);
        } else if (i3 != 20) {
            Toast.makeText(getContext(), "关注性别错误", 0).show();
        } else {
            this.genderFemaleTextView.setSelected(true);
        }
        this.sentMsgEditText.setText(this.data.content);
        this.sendFansCountEditText.setText(String.valueOf(this.data.max_send_num));
        this.sendIntervalEditText.setText(String.valueOf(this.data.interval));
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case C1068R.C1071id.focusEachOtherTextView:
                TextView textView = this.focusEachOtherTextView;
                textView.setSelected(!textView.isSelected());
                return;
            case C1068R.C1071id.genderFemaleTextView:
                TextView textView2 = this.genderFemaleTextView;
                textView2.setSelected(!textView2.isSelected());
                return;
            case C1068R.C1071id.genderMaleTextView:
                TextView textView3 = this.genderMaleTextView;
                textView3.setSelected(!textView3.isSelected());
                return;
            case C1068R.C1071id.noFocusTextView:
                TextView textView4 = this.noFocusTextView;
                textView4.setSelected(!textView4.isSelected());
                return;
            case C1068R.C1071id.startButton:
                if (!DataUtil.isInValidTime()) {
                    ToastUtil.makeText("付费功能，请购买后使用！");
                    return;
                } else {
                    changeTips();
                    return;
                }
            case C1068R.C1071id.tv_save:
                save();
                return;
            default:
                return;
        }
    }

    public void changeTips() {
        if ("开始群发".contentEquals(this.startButton.getText()) || "继续群发".contentEquals(this.startButton.getText())) {
            this.startButton.setText("暂停群发");
            this.tipsTextView.setVisibility(0);
            this.tipsTextView.setText("正在群发消息......");
            this.loadingImageView.setImageResource(C1068R.C1070drawable.ic_loading);
            this.loadingImageView.setVisibility(0);
            this.loadingImageView.startAnimation(this.rotateAnimation);
            this.data.status = 10;
        } else if ("暂停群发".contentEquals(this.startButton.getText())) {
            this.startButton.setText("继续群发");
            this.tipsTextView.setText("群发已暂停");
            this.loadingImageView.clearAnimation();
            this.loadingImageView.setImageResource(C1068R.C1070drawable.ic_pause);
            this.data.status = 20;
        }
        changeStatus(String.valueOf(this.data.status));
    }

    private void save() {
        String str;
        if (!ConfigUtil.getInstance().getCurrentDyInfo().isBind) {
            ToastUtil.makeText("未绑定抖音号");
            return;
        }
        final String trim = String.valueOf(this.sentMsgEditText.getText()).trim();
        if ("".equals(trim)) {
            ToastUtil.makeText("关注回复内容不能为空！");
            return;
        }
        final String trim2 = String.valueOf(this.sendFansCountEditText.getText()).trim();
        if ("".equals(trim2)) {
            ToastUtil.makeText("发送人数不能为空！");
            return;
        }
        final String trim3 = String.valueOf(this.sendIntervalEditText.getText()).trim();
        if ("0".equals(trim3)) {
            ToastUtil.makeText("发送间隔不能为0！");
        } else if ("".equals(trim3)) {
            ToastUtil.makeText("发送间隔不能为空！");
        } else {
            final ProgressDialog createProgressDialog = ProgressUtil.createProgressDialog(getContext(), "保存中");
            createProgressDialog.show();
            final String str2 = "10";
            if (this.focusEachOtherTextView.isSelected() && this.noFocusTextView.isSelected()) {
                str = "0";
            } else if (this.focusEachOtherTextView.isSelected()) {
                str = str2;
            } else if (this.noFocusTextView.isSelected()) {
                str = "20";
            } else {
                Toast.makeText(getContext(), "未选择关注类型", 0).show();
                return;
            }
            if (this.genderMaleTextView.isSelected() && this.genderFemaleTextView.isSelected()) {
                str2 = "0";
            } else if (!this.genderMaleTextView.isSelected()) {
                str2 = this.genderFemaleTextView.isSelected() ? "20" : "";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("id", String.valueOf(this.data.f986id));
            hashMap.put("assistant_uid", ConfigUtil.getInstance().getCurrentDyInfo().uid);
            hashMap.put("subscribe_type", str);
            hashMap.put("sex_type", str2);
            hashMap.put("content", trim);
            hashMap.put("max_send_num", trim2);
            hashMap.put("interval", trim3);
            hashMap.put(NotificationCompat.CATEGORY_STATUS, String.valueOf(this.data.status));
            final String str3 = str;
            OkHttpClientUtil.getInstance().post(Const.URL_MODIFY_SENT_MSG_TO_FANS, hashMap, BaseResponse.class, new OkHttpClientUtil.ResponseCallback() {
                public <T extends BaseResponse> void onComplete(T t) {
                    createProgressDialog.dismiss();
                    Toast.makeText(SendMsgToFansFragment.this.getContext(), t.msg, 0).show();
                    if (t.status == 1) {
                        SendMsgToFansFragment.this.data.subscribe_type = Integer.parseInt(str3);
                        SendMsgToFansFragment.this.data.sex_type = Integer.parseInt(str2);
                        SendMsgToFansFragment.this.data.content = trim;
                        SendMsgToFansFragment.this.data.max_send_num = Integer.parseInt(trim2);
                        SendMsgToFansFragment.this.data.interval = Integer.parseInt(trim3);
                        ConfigUtil.getInstance().updateHDConfig();
                    }
                }
            });
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        ConfigUtil.getInstance().removeOnConfigChangeListener(this);
    }

    public void onChanged(String str, String str2) {
        if (ConfigUtil.KEY_HD_CONFIG.equals(str)) {
            initData();
        }
    }

    private void changeStatus(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("assistantId", ConfigUtil.getInstance().getCurrentDyInfo().uid);
        hashMap.put("type", "10");
        hashMap.put(NotificationCompat.CATEGORY_STATUS, str);
        OkHttpClientUtil.getInstance().post(Const.MODIFY_FUNC_STATUS, hashMap, BaseResponse.class, new OkHttpClientUtil.ResponseCallback() {
            public <T extends BaseResponse> void onComplete(T t) {
                if (t.status == 1) {
                    ConfigUtil.getInstance().updateHDConfig();
                } else {
                    ToastUtil.makeText(t.msg);
                }
            }
        });
    }
}
