package com.wujieshuju.huidou.p031ui.fragment.usercenter;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.wujieshuju.huidou.C1068R;
import com.wujieshuju.huidou.Const;
import com.wujieshuju.huidou.p031ui.base.BaseFragment;

/* renamed from: com.wujieshuju.huidou.ui.fragment.usercenter.ContactUsFragment */
public class ContactUsFragment extends BaseFragment {
    private String userAgent = "Android";

    /* access modifiers changed from: protected */
    public String getActionBarTitle() {
        return "联系我们";
    }

    /* access modifiers changed from: protected */
    public int getLayoutId() {
        return C1068R.layout.fragment_contact_us;
    }

    /* access modifiers changed from: protected */
    public void initData() {
    }

    /* access modifiers changed from: protected */
    public void initListener() {
    }

    /* access modifiers changed from: protected */
    public void setupView() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public void initView() {
        WebView webView = (WebView) findViewById(C1068R.C1071id.contactUsWebView);
        WebSettings settings = webView.getSettings();
        settings.setUserAgentString(this.userAgent);
        settings.setJavaScriptEnabled(true);
        webView.loadUrl(Const.URL_CONTACT_US);
        webView.setWebViewClient(new WebViewClient() {
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (str.startsWith("tel:")) {
                    ContactUsFragment.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    return true;
                }
                webView.loadUrl(str);
                return true;
            }
        });
    }
}
