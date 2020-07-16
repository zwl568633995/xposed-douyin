package com.wujieshuju.huidou.p031ui.fragment.usercenter;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.wujieshuju.huidou.C1068R;
import com.wujieshuju.huidou.Const;
import com.wujieshuju.huidou.p031ui.base.BaseFragment;

/* renamed from: com.wujieshuju.huidou.ui.fragment.usercenter.ManualsFragment */
public class ManualsFragment extends BaseFragment {
    /* access modifiers changed from: protected */
    public String getActionBarTitle() {
        return "操作手册";
    }

    /* access modifiers changed from: protected */
    public int getLayoutId() {
        return C1068R.layout.activity_manuals;
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

    /* access modifiers changed from: protected */
    public void initView() {
        WebView webView = (WebView) findViewById(C1068R.C1071id.manualsWebView);
        webView.loadUrl(Const.URL_MANUALS);
        webView.getSettings().setUserAgentString("Android");
        webView.setWebViewClient(new WebViewClient() {
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                webView.loadUrl(str);
                return true;
            }
        });
    }
}
