package com.xp.wx.backend.network;

import android.content.Context;
import com.alibaba.sdk.android.httpdns.HttpDns;
import com.alibaba.sdk.android.httpdns.HttpDnsService;
import com.alibaba.sdk.android.httpdns.ILogger;
import com.xp.wx.Global;
import com.xp.wx.spellbook.douyin.DyGlobal;
import com.xp.wx.util.Log;
import java.util.ArrayList;
import java.util.Collections;

public class HttpDnsHelper {
    private static final String ACCOUNT_ID = "178759";
    private static final HttpDnsHelper mHelper = new HttpDnsHelper();
    private HttpDnsService mHttpDnsService = null;

    private HttpDnsHelper() {
        init();
    }

    public static HttpDnsHelper getInstance() {
        return mHelper;
    }

    private void init() {
        if (this.mHttpDnsService == null) {
            Context context = DyGlobal.INSTANCE.getContext();
            if (context.getApplicationContext() != null) {
                this.mHttpDnsService = HttpDns.getService(context, ACCOUNT_ID);
                this.mHttpDnsService.setPreResolveHosts(new ArrayList(Collections.singletonList(Global.BASE_URL)));
                this.mHttpDnsService.setExpiredIPEnabled(true);
                this.mHttpDnsService.setCachedIPEnabled(true);
                this.mHttpDnsService.setLogEnabled(true);
                this.mHttpDnsService.setTimeoutInterval(60000);
                this.mHttpDnsService.setLogger(new LoggerImpl());
            }
        }
    }

    public String getIpByHost(String str) {
        init();
        HttpDnsService httpDnsService = this.mHttpDnsService;
        return httpDnsService != null ? httpDnsService.getIpByHostAsync(str) : "";
    }

    private static class LoggerImpl implements ILogger {
        private LoggerImpl() {
        }

        public void log(String str) {
            Log.debug("HttpDnsHelper. " + str);
        }
    }
}
