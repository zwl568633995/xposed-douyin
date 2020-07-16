package com.wujieshuju.huidou.p031ui.activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.wujieshuju.huidou.C1068R;
import com.wujieshuju.huidou.Const;
import com.wujieshuju.huidou.model.LoginInfo;
import com.wujieshuju.huidou.model.LoginResponse;
import com.wujieshuju.huidou.network.BaseResponse;
import com.wujieshuju.huidou.network.OkHttpClientUtil;
import com.wujieshuju.huidou.p031ui.base.BaseActivity;
import com.wujieshuju.huidou.util.ConfigUtil;
import com.wujieshuju.huidou.util.ProgressUtil;
import com.wujieshuju.huidou.util.ToastUtil;
import java.util.HashMap;

/* renamed from: com.wujieshuju.huidou.ui.activity.LoginActivity */
public class LoginActivity extends BaseActivity {
    private EditText passwordEditText;
    private TextView signUp;
    private EditText telEditText;

    /* access modifiers changed from: protected */
    public int getLayoutId() {
        return C1068R.layout.activity_login;
    }

    /* access modifiers changed from: protected */
    public void initData() {
    }

    /* access modifiers changed from: protected */
    public void initView() {
        this.telEditText = (EditText) findViewById(C1068R.C1071id.loginTel);
        this.passwordEditText = (EditText) findViewById(C1068R.C1071id.loginPassword);
        this.signUp = (TextView) findViewById(C1068R.C1071id.signUpTextView);
    }

    /* access modifiers changed from: protected */
    public int getStatusBarColor() {
        return getColor(C1068R.C1069color.transparent);
    }

    /* access modifiers changed from: protected */
    public void initListener() {
        this.signUp.setOnClickListener(this);
        findViewById(C1068R.C1071id.LoginButton).setOnClickListener(this);
        findViewById(C1068R.C1071id.forgetPasswordTextView).setOnClickListener(this);
    }

    /* access modifiers changed from: protected */
    public void setupView() {
        getWindow().getDecorView().setSystemUiVisibility(260);
        this.signUp.getPaint().setFlags(8);
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C1068R.C1071id.LoginButton) {
            login();
        } else if (id == C1068R.C1071id.forgetPasswordTextView) {
            startActivity(new Intent(this, ForgetPasswordActivity.class));
        } else if (id == C1068R.C1071id.signUpTextView) {
            startActivity(new Intent(this, SignUpActivity.class));
        }
    }

    private void login() {
        final String trim = this.telEditText.getText().toString().trim();
        String obj = this.passwordEditText.getText().toString();
        if (trim.length() != 11) {
            ToastUtil.makeText("手机号输入不正确！");
        } else if (obj.length() < 6 || obj.length() > 18) {
            ToastUtil.makeText("密码输入不正确");
        } else {
            final ProgressDialog createProgressDialog = ProgressUtil.createProgressDialog(this, "正在登录");
            createProgressDialog.show();
            HashMap hashMap = new HashMap();
            hashMap.put("tel", trim);
            hashMap.put("password", obj);
            hashMap.put("product_id", "4");
            OkHttpClientUtil.getInstance().post(Const.URL_LOGIN, hashMap, LoginResponse.class, new OkHttpClientUtil.ResponseCallback() {
                public <T extends BaseResponse> void onComplete(T t) {
                    createProgressDialog.dismiss();
                    if (t.status != 1) {
                        ToastUtil.makeText(t.msg);
                    } else if (t.headers == null) {
                        ToastUtil.makeText("header is null!");
                    } else {
                        String str = (String) t.headers.get("Authorization").get(0);
                        if (TextUtils.isEmpty(str)) {
                            ToastUtil.makeText("登录失败");
                            return;
                        }
                        LoginResponse.DATA data = (LoginResponse.DATA) t.data;
                        ConfigUtil.getInstance().saveLoginInfo(new LoginInfo(trim, str, data.is_expire, data.valid_time));
                        LoginActivity.this.startActivity(new Intent(LoginActivity.this, MainActivity.class));
                        LoginActivity.this.finish();
                    }
                }
            });
        }
    }
}
