package com.wujieshuju.huidou.p031ui.fragment.dashboard;

import android.app.ProgressDialog;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.wujieshuju.huidou.C1068R;
import com.wujieshuju.huidou.Const;
import com.wujieshuju.huidou.model.AutoSentGiftResponse;
import com.wujieshuju.huidou.model.DashboardResponse;
import com.wujieshuju.huidou.network.BaseResponse;
import com.wujieshuju.huidou.network.OkHttpClientUtil;
import com.wujieshuju.huidou.p031ui.base.BaseFragment;
import com.wujieshuju.huidou.util.ConfigUtil;
import com.wujieshuju.huidou.util.JsonUtil;
import com.wujieshuju.huidou.util.ProgressUtil;
import com.wujieshuju.huidou.util.ToastUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.wujieshuju.huidou.ui.fragment.dashboard.AutoSentGiftFragment */
public class AutoSentGiftFragment extends BaseFragment {
    private ArrayList<TextView> giftViewArrayList = new ArrayList<>();
    private EditText intervalEditText;
    /* access modifiers changed from: private */
    public DashboardResponse.stAutoSendGift mData;
    private EditText thresholdEditText;
    private TextView tv_save;

    /* access modifiers changed from: protected */
    public String getActionBarTitle() {
        return "自动刷礼物";
    }

    /* access modifiers changed from: protected */
    public int getLayoutId() {
        return C1068R.layout.fragment_auto_sent_gift;
    }

    /* access modifiers changed from: protected */
    public void setupView() {
    }

    /* access modifiers changed from: protected */
    public void initView() {
        setActionBar(C1068R.layout.actionbar_confirm_button);
        this.intervalEditText = (EditText) findViewById(C1068R.C1071id.intervalEditText);
        this.thresholdEditText = (EditText) findViewById(C1068R.C1071id.thresholdEditText);
        this.tv_save = (TextView) getActionBarView(C1068R.C1071id.tv_save);
    }

    /* access modifiers changed from: protected */
    public void initListener() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        this.giftViewArrayList.clear();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof TextView) && childAt.getTag() != null && "gift".equals(childAt.getTag())) {
                childAt.setOnClickListener(this);
                this.giftViewArrayList.add((TextView) childAt);
            }
        }
        this.tv_save.setOnClickListener(this);
    }

    /* access modifiers changed from: protected */
    public void initData() {
        if (ConfigUtil.getInstance().getCurrentDyInfo().uid != null) {
            if (ConfigUtil.getInstance().getHDConfig() == null) {
                Toast.makeText(getContext(), "配置数据错误，重新进入当前页面", 0).show();
                return;
            }
            DashboardResponse.stAutoSendGift stautosendgift = ConfigUtil.getInstance().getHDConfig().stAutoSendGift;
            this.mData = stautosendgift;
            ArrayList arrayList = (ArrayList) JsonUtil.parseJson(stautosendgift.gift_json, ArrayList.class);
            if (!(arrayList == null || arrayList.size() == 0)) {
                Iterator<TextView> it = this.giftViewArrayList.iterator();
                while (it.hasNext()) {
                    TextView next = it.next();
                    next.setSelected(arrayList.contains(next.getText()));
                }
            }
            this.intervalEditText.setText(String.valueOf(this.mData.interval));
            this.thresholdEditText.setText(String.valueOf(this.mData.threshold));
        }
    }

    public void onClick(View view) {
        if ((view instanceof TextView) && view.getTag() != null && "gift".equals(view.getTag())) {
            view.setSelected(!view.isSelected());
        } else if (view.getId() == this.tv_save.getId()) {
            save();
        }
    }

    public void save() {
        if (!ConfigUtil.getInstance().getCurrentDyInfo().isBind) {
            ToastUtil.makeText("未绑定抖音号");
            return;
        }
        final String trim = this.intervalEditText.getText().toString().trim();
        if ("0".equals(trim)) {
            ToastUtil.makeText("触发间隔不能为0！");
        } else if ("".equals(trim)) {
            ToastUtil.makeText("触发间隔不能为空！");
        } else {
            final String trim2 = this.thresholdEditText.getText().toString().trim();
            if ("0".equals(trim2)) {
                ToastUtil.makeText("每日最大抖币数不能为0！");
            } else if ("".equals(trim2)) {
                ToastUtil.makeText("每日最大抖币数不能为空！");
            } else {
                final ProgressDialog createProgressDialog = ProgressUtil.createProgressDialog(getContext(), "保存中");
                createProgressDialog.show();
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                Iterator<TextView> it = this.giftViewArrayList.iterator();
                while (it.hasNext()) {
                    TextView next = it.next();
                    if (next.isSelected()) {
                        arrayList.add(next.getText().toString());
                    }
                }
                final String serialObject = JsonUtil.serialObject(arrayList);
                hashMap.put("id", String.valueOf(this.mData.f986id));
                hashMap.put("assistant_uid", ConfigUtil.getInstance().getCurrentDyInfo().uid);
                hashMap.put("gift_json", serialObject);
                hashMap.put("interval", trim);
                hashMap.put("threshold", trim2);
                OkHttpClientUtil.getInstance().post(Const.URL_MODIFY_ST_AUTO_SEND_GIFT, hashMap, AutoSentGiftResponse.class, new OkHttpClientUtil.ResponseCallback() {
                    public <T extends BaseResponse> void onComplete(T t) {
                        createProgressDialog.dismiss();
                        Toast.makeText(AutoSentGiftFragment.this.getContext(), t.msg, 0).show();
                        if (t.status == 1) {
                            AutoSentGiftFragment.this.mData.gift_json = serialObject;
                            AutoSentGiftFragment.this.mData.interval = Integer.parseInt(trim);
                            AutoSentGiftFragment.this.mData.threshold = Integer.parseInt(trim2);
                            ConfigUtil.getInstance().updateHDConfig();
                        }
                    }
                });
            }
        }
    }
}
