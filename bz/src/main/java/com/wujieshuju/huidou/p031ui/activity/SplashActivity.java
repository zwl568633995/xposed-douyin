package com.wujieshuju.huidou.p031ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatActivity;
import com.wujieshuju.huidou.util.ConfigUtil;

/* renamed from: com.wujieshuju.huidou.ui.activity.SplashActivity */
public class SplashActivity extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (TextUtils.isEmpty(ConfigUtil.getInstance().getLoginInfo().token)) {
            startActivity(new Intent(this, LoginActivity.class));
        } else {
            startActivity(new Intent(this, MainActivity.class));
        }
        finish();
    }
}
