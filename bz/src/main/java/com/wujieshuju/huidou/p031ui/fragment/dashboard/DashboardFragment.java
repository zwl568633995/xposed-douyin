package com.wujieshuju.huidou.p031ui.fragment.dashboard;

import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import com.wujieshuju.huidou.C1068R;
import com.wujieshuju.huidou.Const;
import com.wujieshuju.huidou.model.DashboardResponse;
import com.wujieshuju.huidou.network.BaseResponse;
import com.wujieshuju.huidou.network.OkHttpClientUtil;
import com.wujieshuju.huidou.p031ui.base.BaseFragment;
import com.wujieshuju.huidou.p031ui.dialog.BindDyDialog;
import com.wujieshuju.huidou.util.ConfigUtil;
import com.wujieshuju.huidou.util.DataUtil;
import com.wujieshuju.huidou.util.ToastUtil;
import java.util.HashMap;

/* renamed from: com.wujieshuju.huidou.ui.fragment.dashboard.DashboardFragment */
public class DashboardFragment extends BaseFragment implements ConfigUtil.OnConfigChangeListener, CompoundButton.OnCheckedChangeListener {
    public TextView autoBuyTextView;
    public TextView autoReplyTextView;
    public TextView clickScreenTextView;
    private DashboardResponse.data dashboardResponseData;
    public TextView focusOnReplyTextView;
    public TextView focusOnTextView;
    public TextView giftReplyTextView;
    private TextView mBindIdTextView;
    private TextView mBindStudioTextView;
    public TextView sendGiftTextView;
    public TextView sendMsgToFansTextView;
    public Switch switchAutoBuy;
    public Switch switchAutoFocusOn;
    public Switch switchAutoReply;
    public Switch switchAutoSendGift;
    public Switch switchClickScreen;
    public Switch switchFocusOnReply;
    public Switch switchGiftReply;
    public Switch switchMaster;
    public Switch switchTimingNotice;
    public Switch switchWelcomeMsg;
    public TextView timingNoticeTextView;
    public TextView welcomeMsgTextView;

    /* access modifiers changed from: protected */
    public int getLayoutId() {
        return C1068R.layout.fragment_dashboard;
    }

    /* access modifiers changed from: protected */
    public void initData() {
    }

    /* access modifiers changed from: protected */
    public void initView() {
        this.mBindStudioTextView = (TextView) findViewById(C1068R.C1071id.bindStudioTextView);
        this.mBindIdTextView = (TextView) findViewById(C1068R.C1071id.tv_bind_id);
        this.mBindStudioTextView.getPaint().setFlags(8);
        findView();
    }

    /* access modifiers changed from: protected */
    public void initListener() {
        this.timingNoticeTextView.setOnClickListener(this);
        this.giftReplyTextView.setOnClickListener(this);
        this.welcomeMsgTextView.setOnClickListener(this);
        this.focusOnReplyTextView.setOnClickListener(this);
        this.autoReplyTextView.setOnClickListener(this);
        this.clickScreenTextView.setOnClickListener(this);
        this.autoBuyTextView.setOnClickListener(this);
        this.sendGiftTextView.setOnClickListener(this);
        this.sendMsgToFansTextView.setOnClickListener(this);
        this.mBindStudioTextView.setOnClickListener(this);
        ConfigUtil.getInstance().addOnConfigChangeListener(this);
    }

    private void initSwitch() {
        DashboardResponse.data hDConfig = ConfigUtil.getInstance().getHDConfig();
        this.dashboardResponseData = hDConfig;
        if (hDConfig != null) {
            ConfigUtil.getInstance().setFuncEnable(this.dashboardResponseData.funcEnable);
            setSwitchOnChangeListener((CompoundButton.OnCheckedChangeListener) null);
            boolean z = true;
            this.switchMaster.setChecked(this.dashboardResponseData.masterSwitchStatus.status == 10);
            this.switchTimingNotice.setChecked(this.dashboardResponseData.stSendBulletin.status == 10);
            this.switchWelcomeMsg.setChecked(this.dashboardResponseData.stReplyWelcome.status == 10);
            this.switchFocusOnReply.setChecked(this.dashboardResponseData.stReplySubscribe.status == 10);
            this.switchGiftReply.setChecked(this.dashboardResponseData.stReplyGift.status == 10);
            this.switchAutoReply.setChecked(this.dashboardResponseData.stReplyKeyword.status == 10);
            this.switchClickScreen.setChecked(this.dashboardResponseData.stAutoClick.status == 10);
            this.switchAutoBuy.setChecked(this.dashboardResponseData.stAutoShopping.status == 10);
            Switch switchR = this.switchAutoSendGift;
            if (this.dashboardResponseData.stAutoSendGift.status != 10) {
                z = false;
            }
            switchR.setChecked(z);
        }
        setSwitchOnChangeListener(this);
    }

    private void setSwitchOnChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.switchMaster.setOnCheckedChangeListener(onCheckedChangeListener);
        this.switchTimingNotice.setOnCheckedChangeListener(onCheckedChangeListener);
        this.switchGiftReply.setOnCheckedChangeListener(onCheckedChangeListener);
        this.switchWelcomeMsg.setOnCheckedChangeListener(onCheckedChangeListener);
        this.switchFocusOnReply.setOnCheckedChangeListener(onCheckedChangeListener);
        this.switchAutoReply.setOnCheckedChangeListener(onCheckedChangeListener);
        this.switchClickScreen.setOnCheckedChangeListener(onCheckedChangeListener);
        this.switchAutoBuy.setOnCheckedChangeListener(onCheckedChangeListener);
        this.switchAutoSendGift.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    /* access modifiers changed from: protected */
    public void setupView() {
        DashboardResponse.data hDConfig = ConfigUtil.getInstance().getHDConfig();
        if (hDConfig == null || hDConfig.assistantBindDouyin == null || TextUtils.isEmpty(hDConfig.assistantBindDouyin.msg)) {
            this.mBindStudioTextView.setText("绑定直播间");
            this.mBindIdTextView.setText("");
        } else {
            this.mBindStudioTextView.setText("换绑");
            this.mBindIdTextView.setText(hDConfig.assistantBindDouyin.msg);
        }
        initSwitch();
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case C1068R.C1071id.autoBuyTextView:
                startCommonFragmentActivity(AutoBuyFragment.class);
                return;
            case C1068R.C1071id.autoReplyTextView:
                startCommonFragmentActivity(AutoReplyFragment.class);
                return;
            case C1068R.C1071id.bindStudioTextView:
                showBindDialog();
                return;
            case C1068R.C1071id.clickScreenTextView:
                startCommonFragmentActivity(ClickScreenFragment.class);
                return;
            case C1068R.C1071id.focusOnReplyTextView:
                startCommonFragmentActivity(FocusOnReplyFragment.class);
                return;
            case C1068R.C1071id.giftReplyTextView:
                startCommonFragmentActivity(ReceiveGiftMsgFragment.class);
                return;
            case C1068R.C1071id.sendGiftTextView:
                startCommonFragmentActivity(AutoSentGiftFragment.class);
                return;
            case C1068R.C1071id.sendMsgToFansTextView:
                startCommonFragmentActivity(SendMsgToFansFragment.class);
                return;
            case C1068R.C1071id.timingNoticeTextView:
                startCommonFragmentActivity(TimingNoticeFragment.class);
                return;
            case C1068R.C1071id.welcomeMsgTextView:
                startCommonFragmentActivity(WelcomeMsgSettingFragment.class);
                return;
            default:
                return;
        }
    }

    private void showBindDialog() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            BindDyDialog bindDyDialog = new BindDyDialog(activity, C1068R.style.FullScreenDialog);
            Window window = bindDyDialog.getWindow();
            if (window != null) {
                window.setGravity(48);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.width = -1;
                attributes.height = -2;
                window.setAttributes(attributes);
            }
            bindDyDialog.setCanceledOnTouchOutside(true);
            bindDyDialog.setCancelable(true);
            bindDyDialog.show();
        }
    }

    public void onChanged(String str, String str2) {
        if (ConfigUtil.KEY_HD_CONFIG.equals(str)) {
            setupView();
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        ConfigUtil.getInstance().removeOnConfigChangeListener(this);
    }

    private void saveSwitchStatus(final DashboardResponse.CommonConfig commonConfig, Switch switchR, String str) {
        if (!ConfigUtil.getInstance().getCurrentDyInfo().isBind) {
            ToastUtil.makeText("未绑定抖音号");
        } else if (this.dashboardResponseData.funcEnable != null) {
            final int i = 0;
            if (DataUtil.isInValidTime() || !switchR.isChecked() || this.dashboardResponseData.funcEnable.contains(str)) {
                if (switchR.isChecked()) {
                    i = 10;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("assistantId", ConfigUtil.getInstance().getCurrentDyInfo().uid);
                hashMap.put("type", str);
                hashMap.put(NotificationCompat.CATEGORY_STATUS, String.valueOf(i));
                OkHttpClientUtil.getInstance().post(Const.MODIFY_FUNC_STATUS, hashMap, BaseResponse.class, new OkHttpClientUtil.ResponseCallback() {
                    public <T extends BaseResponse> void onComplete(T t) {
                        if (t.status == 1) {
                            commonConfig.status = i;
                            ConfigUtil.getInstance().updateHDConfig();
                            return;
                        }
                        ToastUtil.makeText(t.msg);
                    }
                });
                return;
            }
            ToastUtil.makeText("付费功能，请购买后使用！");
            switchR.setChecked(false);
        }
    }

    private void findView() {
        this.switchMaster = (Switch) findViewById(C1068R.C1071id.switchMaster);
        this.timingNoticeTextView = (TextView) findViewById(C1068R.C1071id.timingNoticeTextView);
        this.switchTimingNotice = (Switch) findViewById(C1068R.C1071id.switchTimingNotice);
        this.giftReplyTextView = (TextView) findViewById(C1068R.C1071id.giftReplyTextView);
        this.switchGiftReply = (Switch) findViewById(C1068R.C1071id.switchGiftReply);
        this.welcomeMsgTextView = (TextView) findViewById(C1068R.C1071id.welcomeMsgTextView);
        this.switchWelcomeMsg = (Switch) findViewById(C1068R.C1071id.switchWelcomeMsg);
        this.focusOnReplyTextView = (TextView) findViewById(C1068R.C1071id.focusOnReplyTextView);
        this.switchFocusOnReply = (Switch) findViewById(C1068R.C1071id.switchFocusOnReply);
        this.autoReplyTextView = (TextView) findViewById(C1068R.C1071id.autoReplyTextView);
        this.switchAutoReply = (Switch) findViewById(C1068R.C1071id.switchAutoReply);
        this.clickScreenTextView = (TextView) findViewById(C1068R.C1071id.clickScreenTextView);
        this.switchClickScreen = (Switch) findViewById(C1068R.C1071id.switchClickScreen);
        this.autoBuyTextView = (TextView) findViewById(C1068R.C1071id.autoBuyTextView);
        this.switchAutoBuy = (Switch) findViewById(C1068R.C1071id.switchAutoBuy);
        this.sendGiftTextView = (TextView) findViewById(C1068R.C1071id.sendGiftTextView);
        this.switchAutoSendGift = (Switch) findViewById(C1068R.C1071id.switchAutoSendGift);
        this.sendMsgToFansTextView = (TextView) findViewById(C1068R.C1071id.sendMsgToFansTextView);
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (!(compoundButton instanceof Switch) || !TextUtils.isEmpty(ConfigUtil.getInstance().getCurrentDyInfo().uid)) {
            switch (compoundButton.getId()) {
                case C1068R.C1071id.switchAutoBuy:
                    saveSwitchStatus(this.dashboardResponseData.stAutoShopping, this.switchAutoBuy, "7");
                    return;
                case C1068R.C1071id.switchAutoReply:
                    saveSwitchStatus(this.dashboardResponseData.stReplyKeyword, this.switchAutoReply, "5");
                    return;
                case C1068R.C1071id.switchAutoSendGift:
                    saveSwitchStatus(this.dashboardResponseData.stAutoSendGift, this.switchAutoSendGift, "9");
                    return;
                case C1068R.C1071id.switchClickScreen:
                    saveSwitchStatus(this.dashboardResponseData.stAutoClick, this.switchClickScreen, "6");
                    return;
                case C1068R.C1071id.switchFocusOnReply:
                    saveSwitchStatus(this.dashboardResponseData.stReplySubscribe, this.switchFocusOnReply, "4");
                    return;
                case C1068R.C1071id.switchGiftReply:
                    saveSwitchStatus(this.dashboardResponseData.stReplyGift, this.switchGiftReply, "3");
                    return;
                case C1068R.C1071id.switchMaster:
                    saveSwitchStatus(this.dashboardResponseData.masterSwitchStatus, this.switchMaster, "0");
                    return;
                case C1068R.C1071id.switchTimingNotice:
                    saveSwitchStatus(this.dashboardResponseData.stSendBulletin, this.switchTimingNotice, "1");
                    return;
                case C1068R.C1071id.switchWelcomeMsg:
                    saveSwitchStatus(this.dashboardResponseData.stReplyWelcome, this.switchWelcomeMsg, "2");
                    return;
                default:
                    return;
            }
        } else {
            ToastUtil.makeText("未登入抖音号，设置无效");
            compoundButton.setChecked(false);
        }
    }
}
