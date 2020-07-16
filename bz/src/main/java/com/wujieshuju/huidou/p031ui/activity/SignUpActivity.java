package com.wujieshuju.huidou.p031ui.activity;

import android.app.ProgressDialog;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.wujieshuju.huidou.C1068R;
import com.wujieshuju.huidou.Const;
import com.wujieshuju.huidou.model.SimpleResponse;
import com.wujieshuju.huidou.network.BaseResponse;
import com.wujieshuju.huidou.network.OkHttpClientUtil;
import com.wujieshuju.huidou.p031ui.base.BaseActivity;
import com.wujieshuju.huidou.util.ProgressUtil;
import com.wujieshuju.huidou.util.ToastUtil;
import java.util.HashMap;

/* renamed from: com.wujieshuju.huidou.ui.activity.SignUpActivity */
public class SignUpActivity extends BaseActivity {
    /* access modifiers changed from: private */
    public TextView getVerifyCodeTextView;
    private CountDownTimer mCountDownTimer;
    private Handler mHandler = new Handler();
    private EditText passwordEditText;
    private EditText telEditText;
    private EditText verifyCodeEditText;

    /* access modifiers changed from: protected */
    public String getActionBarTitle() {
        return "注册账号";
    }

    /* access modifiers changed from: protected */
    public int getLayoutId() {
        return C1068R.layout.activity_sign_up;
    }

    /* access modifiers changed from: protected */
    public void initData() {
    }

    /* access modifiers changed from: protected */
    public void setupView() {
    }

    /* access modifiers changed from: protected */
    public void initView() {
        this.telEditText = (EditText) findViewById(C1068R.C1071id.signUpTelEditText);
        this.passwordEditText = (EditText) findViewById(C1068R.C1071id.signUpPasswordEditText);
        this.verifyCodeEditText = (EditText) findViewById(C1068R.C1071id.signUpVerifyCodeEditText);
        this.getVerifyCodeTextView = (TextView) findViewById(C1068R.C1071id.getVerifyCodeTextView);
    }

    /* access modifiers changed from: protected */
    public void initListener() {
        findViewById(C1068R.C1071id.signUpButton).setOnClickListener(this);
        this.getVerifyCodeTextView.setOnClickListener(this);
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C1068R.C1071id.getVerifyCodeTextView) {
            getCode();
        } else if (id == C1068R.C1071id.signUpButton) {
            register();
        }
    }

    private void getCode() {
        String trim = this.telEditText.getText().toString().trim();
        if (trim.length() != 11) {
            ShowMsg("手机号输入错误！");
            return;
        }
        this.getVerifyCodeTextView.setEnabled(false);
        HashMap hashMap = new HashMap();
        hashMap.put("tel", trim);
        hashMap.put("code_type", "10");
        Log.i(Const.TAG, "code_type-> " + ((String) hashMap.get("code_type")));
        OkHttpClientUtil.getInstance().post(Const.URL_CREATE_CODE, hashMap, SimpleResponse.class, new OkHttpClientUtil.ResponseCallback() {
            public <T extends BaseResponse> void onComplete(T t) {
                SignUpActivity.this.getVerifyCodeTextView.setEnabled(true);
                if (t.status == 1) {
                    SignUpActivity.this.createCodeSuccess();
                    return;
                }
                ToastUtil.makeText("验证码发送失败:" + t.msg);
            }
        });
    }

    /* access modifiers changed from: private */
    public void createCodeSuccess() {
        this.mCountDownTimer = new CountDownTimer(Const.GET_VERIFY_CODE_TIME, 1000) {
            public void onTick(long j) {
                SignUpActivity.this.getVerifyCodeTextView.setEnabled(false);
                SignUpActivity.this.getVerifyCodeTextView.setTextColor(Color.parseColor("#DCDCDC"));
                TextView access$000 = SignUpActivity.this.getVerifyCodeTextView;
                access$000.setText("已发送(" + ((j / 1000) + 1) + ")");
            }

            public void onFinish() {
                SignUpActivity.this.getVerifyCodeTextView.setEnabled(true);
                SignUpActivity.this.getVerifyCodeTextView.setTextColor(Color.parseColor("#FFC107"));
                SignUpActivity.this.getVerifyCodeTextView.setText("重新获取验证码");
            }
        }.start();
    }

    private void register() {
        String obj = this.telEditText.getText().toString();
        String obj2 = this.passwordEditText.getText().toString();
        String trim = this.verifyCodeEditText.getText().toString().trim();
        if (!obj.startsWith("1") || obj.length() != 11) {
            ShowMsg("手机号格式不正确");
        } else if (obj2.length() < 6 || obj2.length() > 18) {
            ShowMsg("密码长度必须是6-18位");
        } else if (trim.length() != 6) {
            ShowMsg("验证码入错误");
        } else {
            final ProgressDialog createProgressDialog = ProgressUtil.createProgressDialog(this, "正在注册");
            createProgressDialog.show();
            HashMap hashMap = new HashMap();
            hashMap.put("tel", obj);
            hashMap.put("code", trim);
            hashMap.put("password", obj2);
            hashMap.put("repassword", obj2);
            hashMap.put("user_name", obj);
            hashMap.put("product_id", "4");
            OkHttpClientUtil.getInstance().post(Const.URL_REGISTER, hashMap, SimpleResponse.class, new OkHttpClientUtil.ResponseCallback() {
                public <T extends BaseResponse> void onComplete(T t) {
                    createProgressDialog.dismiss();
                    if (t.status == 1) {
                        ToastUtil.makeText("注册成功");
                        SignUpActivity.this.finish();
                        return;
                    }
                    ToastUtil.makeText(t.msg);
                }
            });
        }
    }

    private void ShowMsg(String str) {
        TextView textView = (TextView) findViewById(C1068R.C1071id.tipsTextView);
        textView.setVisibility(0);
        textView.setText(str);
        this.mHandler.postDelayed(new Runnable(textView) {
            private final /* synthetic */ TextView f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                this.f$0.setVisibility(4);
            }
        }, 3000);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        CountDownTimer countDownTimer = this.mCountDownTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
    }
}
