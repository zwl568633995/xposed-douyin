package com.wujieshuju.huidou.p031ui.fragment.usercenter;

import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.wujieshuju.huidou.C1068R;
import com.wujieshuju.huidou.Const;
import com.wujieshuju.huidou.model.LoginInfo;
import com.wujieshuju.huidou.model.UserInfoResponse;
import com.wujieshuju.huidou.network.BaseResponse;
import com.wujieshuju.huidou.network.OkHttpClientUtil;
import com.wujieshuju.huidou.p031ui.activity.LoginActivity;
import com.wujieshuju.huidou.p031ui.base.BaseFragment;
import com.wujieshuju.huidou.util.ConfigUtil;
import com.wujieshuju.huidou.util.DataUtil;
import java.util.HashMap;

/* renamed from: com.wujieshuju.huidou.ui.fragment.usercenter.UserCenterFragment */
public class UserCenterFragment extends BaseFragment {
    private TextView buyTextView;
    private TextView contactUsTextView;
    private TextView logoutButton;
    private TextView manualsTextView;
    private TextView myOrderTextView;
    private TextView tel;
    private TextView validDataTextView;

    /* access modifiers changed from: protected */
    public int getLayoutId() {
        return C1068R.layout.fragment_user_center;
    }

    /* access modifiers changed from: protected */
    public void initData() {
    }

    /* access modifiers changed from: protected */
    public void setupView() {
    }

    /* access modifiers changed from: protected */
    public void initView() {
        this.buyTextView = (TextView) findViewById(C1068R.C1071id.buyTextView);
        this.myOrderTextView = (TextView) findViewById(C1068R.C1071id.myOrderTextView);
        this.logoutButton = (TextView) findViewById(C1068R.C1071id.logoutButton);
        this.contactUsTextView = (TextView) findViewById(C1068R.C1071id.contactUsTextView);
        this.tel = (TextView) findViewById(C1068R.C1071id.userTelTextView);
        this.validDataTextView = (TextView) findViewById(C1068R.C1071id.validDataTextView);
        this.manualsTextView = (TextView) findViewById(C1068R.C1071id.manualsTextView);
    }

    /* access modifiers changed from: protected */
    public void initListener() {
        this.buyTextView.setOnClickListener(this);
        this.myOrderTextView.setOnClickListener(this);
        this.logoutButton.setOnClickListener(this);
        this.contactUsTextView.setOnClickListener(this);
        this.manualsTextView.setOnClickListener(this);
    }

    private void refreshData() {
        HashMap hashMap = new HashMap();
        hashMap.put("product_id", "4");
        OkHttpClientUtil.getInstance().post(Const.URL_GET_USER_INFO, hashMap, UserInfoResponse.class, new OkHttpClientUtil.ResponseCallback() {
            public <T extends BaseResponse> void onComplete(T t) {
                if (t.data != null) {
                    UserInfoResponse.Data data = (UserInfoResponse.Data) t.data;
                    if (ConfigUtil.getInstance().getLoginInfo().validTime != data.valid_time) {
                        ConfigUtil.getInstance().getLoginInfo().validTime = data.valid_time;
                        ConfigUtil.getInstance().updateLoginInfo();
                    }
                }
            }
        });
        LoginInfo loginInfo = ConfigUtil.getInstance().getLoginInfo();
        if (loginInfo == null) {
            Toast.makeText(getContext(), "登陆失效，请重新登陆", 0).show();
            logout();
            return;
        }
        this.tel.setText(loginInfo.username);
        long j = loginInfo.validTime;
        if (j == 0) {
            this.validDataTextView.setText("试用授权");
        } else if (j < System.currentTimeMillis() / 1000) {
            String stampToDate = DataUtil.stampToDate(j);
            TextView textView = this.validDataTextView;
            textView.setText("已过期：" + stampToDate);
            this.validDataTextView.setTextColor(Color.rgb(255, 0, 0));
        } else {
            String stampToDate2 = DataUtil.stampToDate(j);
            TextView textView2 = this.validDataTextView;
            textView2.setText("有效期：" + stampToDate2);
        }
    }

    public void onStart() {
        super.onStart();
        refreshData();
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case C1068R.C1071id.buyTextView:
                startCommonFragmentActivity(ProductPurchaseFragment.class);
                return;
            case C1068R.C1071id.contactUsTextView:
                startCommonFragmentActivity(ContactUsFragment.class);
                return;
            case C1068R.C1071id.logoutButton:
                logout();
                return;
            case C1068R.C1071id.manualsTextView:
                startCommonFragmentActivity(ManualsFragment.class);
                return;
            case C1068R.C1071id.myOrderTextView:
                startCommonFragmentActivity(OrderDetailFragment.class);
                return;
            default:
                return;
        }
    }

    private void logout() {
        HashMap hashMap = new HashMap();
        hashMap.put("product_id", "4");
        hashMap.put("assistant_id", ConfigUtil.getInstance().getDyID());
        OkHttpClientUtil.getInstance().post(Const.URL_LOGOUT, hashMap, BaseResponse.class, new OkHttpClientUtil.ResponseCallback() {
            public <T extends BaseResponse> void onComplete(T t) {
                if (t.status == 1) {
                    ConfigUtil.getInstance().saveLoginInfo((LoginInfo) null);
                    Intent intent = new Intent(UserCenterFragment.this.getContext(), LoginActivity.class);
                    intent.addFlags(32768);
                    intent.addFlags(268435456);
                    UserCenterFragment.this.getContext().startActivity(intent);
                    UserCenterFragment.this.getActivity().finish();
                }
            }
        });
    }
}
