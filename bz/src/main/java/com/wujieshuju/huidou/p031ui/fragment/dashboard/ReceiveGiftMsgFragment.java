package com.wujieshuju.huidou.p031ui.fragment.dashboard;

import android.app.ProgressDialog;
import android.view.View;
import android.view.ViewGroup;
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
import com.wujieshuju.huidou.util.JsonUtil;
import com.wujieshuju.huidou.util.ProgressUtil;
import com.wujieshuju.huidou.util.ToastUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.wujieshuju.huidou.ui.fragment.dashboard.ReceiveGiftMsgFragment */
public class ReceiveGiftMsgFragment extends BaseFragment {
    private EditText editTextGiftReplyMsg;
    private List<TextView> giftViewList;
    /* access modifiers changed from: private */
    public DashboardResponse.stReplyGift mData;

    /* access modifiers changed from: protected */
    public String getActionBarTitle() {
        return "礼物回复";
    }

    /* access modifiers changed from: protected */
    public int getLayoutId() {
        return C1068R.layout.fragment_dashboard_receive_gift_msg;
    }

    /* access modifiers changed from: protected */
    public void setupView() {
    }

    /* access modifiers changed from: protected */
    public void initView() {
        setActionBar(C1068R.layout.actionbar_confirm_button);
        this.editTextGiftReplyMsg = (EditText) findViewById(C1068R.C1071id.sentMsgEditText);
    }

    /* access modifiers changed from: protected */
    public void initListener() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        this.giftViewList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof TextView) && childAt.getTag() != null && "gift".equals(childAt.getTag())) {
                this.giftViewList.add((TextView) childAt);
                childAt.setOnClickListener(this);
            }
        }
        getActionBarView(C1068R.C1071id.tv_save).setOnClickListener(this);
    }

    /* access modifiers changed from: protected */
    public void initData() {
        if (ConfigUtil.getInstance().getCurrentDyInfo().uid != null) {
            if (ConfigUtil.getInstance().getHDConfig() == null) {
                Toast.makeText(getContext(), "配置数据错误，重新进入当前页面", 0).show();
                return;
            }
            DashboardResponse.stReplyGift streplygift = ConfigUtil.getInstance().getHDConfig().stReplyGift;
            this.mData = streplygift;
            String str = streplygift.gift_json;
            if (!"".equals(str)) {
                if (!"".equals(this.mData.content)) {
                    this.editTextGiftReplyMsg.setText(this.mData.content);
                }
                ArrayList arrayList = (ArrayList) JsonUtil.parseJson(str, ArrayList.class);
                for (TextView next : this.giftViewList) {
                    next.setSelected(arrayList.contains(next.getText()));
                }
            }
        }
    }

    public void onClick(View view) {
        if ((view instanceof TextView) && view.getTag() != null && "gift".equals(view.getTag())) {
            view.setSelected(!view.isSelected());
        } else if (view.getId() == C1068R.C1071id.tv_save) {
            save();
        }
    }

    private void save() {
        if (!ConfigUtil.getInstance().getCurrentDyInfo().isBind) {
            ToastUtil.makeText("未绑定抖音号");
            return;
        }
        final String trim = this.editTextGiftReplyMsg.getText().toString().trim();
        if ("".equals(trim)) {
            ToastUtil.makeText("礼物回复内容不能为空！");
            return;
        }
        final ProgressDialog createProgressDialog = ProgressUtil.createProgressDialog(getContext(), "保存中");
        createProgressDialog.show();
        HashMap hashMap = new HashMap();
        hashMap.put("id", String.valueOf(this.mData.f986id));
        hashMap.put("content", trim);
        hashMap.put("assistant_uid", ConfigUtil.getInstance().getCurrentDyInfo().uid);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.giftViewList.size(); i++) {
            if (this.giftViewList.get(i).isSelected()) {
                arrayList.add(this.giftViewList.get(i).getText().toString());
            }
        }
        hashMap.put("gift_json", JsonUtil.serialObject(arrayList));
        OkHttpClientUtil.getInstance().post(Const.URL_RECEIVE_GIFT_MSG, hashMap, BaseResponse.class, new OkHttpClientUtil.ResponseCallback() {
            public <T extends BaseResponse> void onComplete(T t) {
                createProgressDialog.dismiss();
                Toast.makeText(ReceiveGiftMsgFragment.this.getContext(), t.msg, 0).show();
                if (t.status == 1) {
                    ReceiveGiftMsgFragment.this.mData.content = trim;
                    ConfigUtil.getInstance().updateHDConfig();
                }
            }
        });
    }
}
