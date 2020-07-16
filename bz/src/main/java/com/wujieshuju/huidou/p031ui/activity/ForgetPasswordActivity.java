package com.wujieshuju.huidou.p031ui.activity;

import android.app.ProgressDialog;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.wujieshuju.huidou.C1068R;
import com.wujieshuju.huidou.Const;
import com.wujieshuju.huidou.model.SimpleResponse;
import com.wujieshuju.huidou.network.BaseResponse;
import com.wujieshuju.huidou.network.OkHttpClientUtil;
import com.wujieshuju.huidou.p031ui.base.BaseActivity;
import com.wujieshuju.huidou.util.ProgressUtil;
import com.wujieshuju.huidou.util.ToastUtil;
import java.util.HashMap;

/* renamed from: com.wujieshuju.huidou.ui.activity.ForgetPasswordActivity */
public class ForgetPasswordActivity extends BaseActivity {
    private Button confirmButton;
    /* access modifiers changed from: private */
    public TextView getVerifyCodeTextView;
    private CountDownTimer mCountDownTimer;
    private Handler mHandler = new Handler();
    private EditText passwordEditText;
    private EditText telEditText;
    private EditText verifyCodeEditText;

    /* access modifiers changed from: protected */
    public String getActionBarTitle() {
        return "忘记密码";
    }

    /* access modifiers changed from: protected */
    public int getLayoutId() {
        return C1068R.layout.activity_forget_password;
    }

    /* access modifiers changed from: protected */
    public void initData() {
    }

    /* access modifiers changed from: protected */
    public void setupView() {
    }

    private void ShowMsg(String str) {
        TextView textView = (TextView) findViewById(C1068R.C1071id.changePasswordTipsTextView);
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
    public void initView() {
        this.passwordEditText = (EditText) findViewById(C1068R.C1071id.newPasswordEditText);
        this.verifyCodeEditText = (EditText) findViewById(C1068R.C1071id.newPasswordVerifyCodeEditText);
        this.getVerifyCodeTextView = (TextView) findViewById(C1068R.C1071id.getChangePasswordVerifyCode);
        this.confirmButton = (Button) findViewById(C1068R.C1071id.changePasswordConfirmButton);
        this.telEditText = (EditText) findViewById(C1068R.C1071id.telEditText);
    }

    /* access modifiers changed from: protected */
    public void initListener() {
        this.getVerifyCodeTextView.setOnClickListener(this);
        this.confirmButton.setOnClickListener(this);
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C1068R.C1071id.changePasswordConfirmButton) {
            changePassword();
        } else if (id == C1068R.C1071id.getChangePasswordVerifyCode) {
            getCode();
        }
    }

    private void getCode() {
        String trim = this.telEditText.getText().toString().trim();
        if (trim.length() != 11) {
            ShowMsg("手机号输入错误！");
            Toast.makeText(getApplicationContext(), "手机号输入错误！", 1).show();
            return;
        }
        this.getVerifyCodeTextView.setEnabled(false);
        HashMap hashMap = new HashMap();
        hashMap.put("tel", trim);
        hashMap.put("code_type", "20");
        OkHttpClientUtil.getInstance().post(Const.URL_CREATE_CODE, hashMap, SimpleResponse.class, new OkHttpClientUtil.ResponseCallback() {
            public <T extends BaseResponse> void onComplete(T t) {
                ForgetPasswordActivity.this.getVerifyCodeTextView.setEnabled(true);
                if (t.status == 1) {
                    ForgetPasswordActivity.this.createCodeSuccess();
                } else {
                    ToastUtil.makeText(t.msg);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void createCodeSuccess() {
        this.mCountDownTimer = new CountDownTimer(Const.GET_VERIFY_CODE_TIME, 1000) {
            public void onTick(long j) {
                ForgetPasswordActivity.this.getVerifyCodeTextView.setEnabled(false);
                ForgetPasswordActivity.this.getVerifyCodeTextView.setTextColor(Color.parseColor("#DCDCDC"));
                TextView access$000 = ForgetPasswordActivity.this.getVerifyCodeTextView;
                access$000.setText("已发送(" + ((j / 1000) + 1) + ")");
            }

            public void onFinish() {
                ForgetPasswordActivity.this.getVerifyCodeTextView.setEnabled(true);
                ForgetPasswordActivity.this.getVerifyCodeTextView.setTextColor(Color.parseColor("#FFC107"));
                ForgetPasswordActivity.this.getVerifyCodeTextView.setText("重新获取验证码");
            }
        }.start();
    }

    private void changePassword() {
        String trim = this.telEditText.getText().toString().trim();
        String obj = this.passwordEditText.getText().toString();
        String obj2 = this.verifyCodeEditText.getText().toString();
        if (trim.length() != 11) {
            ShowMsg("手机号输入错误！");
            Toast.makeText(getApplicationContext(), "手机号输入错误！", 1).show();
        } else if (obj.length() < 6 || obj.length() > 18) {
            ShowMsg("密码长度必须是6-18位");
        } else if (obj2.length() != 6) {
            ShowMsg("验证码入错误");
        } else {
            final ProgressDialog createProgressDialog = ProgressUtil.createProgressDialog(this, "正在修改密码");
            createProgressDialog.show();
            HashMap hashMap = new HashMap();
            hashMap.put("tel", trim);
            hashMap.put("code", obj2);
            hashMap.put("password", obj);
            hashMap.put("repassword", obj);
            OkHttpClientUtil.getInstance().post(Const.URL_RESET_PASSWORD, hashMap, SimpleResponse.class, new OkHttpClientUtil.ResponseCallback() {
                public <T extends BaseResponse> void onComplete(T t) {
                    createProgressDialog.dismiss();
                    if (t.status == 1) {
                        ToastUtil.makeText("修改成功");
                        ForgetPasswordActivity.this.finish();
                        return;
                    }
                    ToastUtil.makeText(t.msg);
                }
            });
        }
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
