package com.xp.wx.backend.network;

import android.text.TextUtils;
import android.util.Log;
import com.xp.wx.Global;
import com.xp.wx.backend.helper.RemoteHelper;
import com.xp.wx.util.HandlerUtil;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import okhttp3.Call;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Dns;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class OkHttpClientUtil {
    private static final byte[] LOCK = new byte[0];
    private static OkHttpClientUtil mInstance;
    private OkHttpClient okHttpClient = getOkHttpClientBuilder().build();

    public interface Callback {
        void onComplete(String str);

        void onFail(String str);
    }

    private OkHttpClientUtil() {
    }

    public static OkHttpClientUtil getInstance() {
        if (mInstance == null) {
            synchronized (LOCK) {
                if (mInstance == null) {
                    mInstance = new OkHttpClientUtil();
                }
            }
        }
        return mInstance;
    }

    public OkHttpClient getOkHttpClient() {
        return this.okHttpClient;
    }

    private OkHttpClient.Builder getOkHttpClientBuilder() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.cookieJar(new CookieJar() {
            HashMap<String, List<Cookie>> cookieStore = new HashMap<>();

            public void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
                this.cookieStore.put(httpUrl.host(), list);
            }

            public List<Cookie> loadForRequest(HttpUrl httpUrl) {
                List<Cookie> list = this.cookieStore.get(httpUrl.host());
                return list != null ? list : new ArrayList();
            }
        }).connectTimeout(10, TimeUnit.SECONDS).readTimeout(10, TimeUnit.SECONDS);
        builder.dns(new HttpDns());
        return builder;
    }

    private void setCertificates(OkHttpClient.Builder builder) {
        SSLSocketFactory sslSocketFactory = getSslSocketFactory();
        if (sslSocketFactory == null) {
            sslSocketFactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
        }
        if (sslSocketFactory != null) {
            builder.sslSocketFactory(sslSocketFactory);
        }
    }

    private SSLSocketFactory getSslSocketFactory() {
        TrustManager[] trustManagerArr = {new X509TrustManager() {
            public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            }

            public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            }

            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }
        }};
        try {
            SSLContext instance = SSLContext.getInstance("TLS");
            instance.init((KeyManager[]) null, trustManagerArr, new SecureRandom());
            return instance.getSocketFactory();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String postSync(String str, String str2, Map<String, String> map) {
        return postSync(str, str2, map);
    }

    public String postSync(String str, String str2, Map<String, String> map, Map<String, String> map2) {
        ResponseBody body;
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        RequestBody requestBody = getRequestBody(map);
        Request.Builder builder = new Request.Builder();
        try {
            Response execute = this.okHttpClient.newCall(builder.url(str + str2).tag(str2).headers(Headers.of(map2)).post(requestBody).build()).execute();
            if (!execute.isSuccessful() || (body = execute.body()) == null) {
                return "";
            }
            String string = body.string();
            body.close();
            return string;
        } catch (IOException e) {
            return Log.getStackTraceString(e);
        }
    }

    public void post(String str, String str2, Map<String, String> map, Callback callback) {
        post(str, str2, map, (Map<String, String>) null, callback);
    }

    public void post(String str, String str2, Map<String, String> map, Map<String, String> map2, final Callback callback) {
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        RequestBody requestBody = getRequestBody(map);
        Request.Builder builder = new Request.Builder();
        this.okHttpClient.newCall(builder.url(str + str2).tag(str2).headers(Headers.of(map2)).post(requestBody).build()).enqueue(new okhttp3.Callback() {
            public void onFailure(Call call, IOException iOException) {
                OkHttpClientUtil.this.onFail(iOException.getMessage(), callback);
            }

            public void onResponse(Call call, Response response) {
                if (callback != null) {
                    ResponseBody body = response.body();
                    if (body != null) {
                        try {
                            OkHttpClientUtil.this.onComplete(body.string(), callback);
                        } catch (Exception e) {
                            OkHttpClientUtil.this.onFail(e.getMessage(), callback);
                        }
                    } else {
                        OkHttpClientUtil.this.onFail("返回结果为空", callback);
                    }
                }
            }
        });
    }

    public void post(String str, Map<String, String> map, Callback callback) {
        post(Global.BASE_URL, str, map, callback);
    }

    /* access modifiers changed from: private */
    public void onFail(final String str, final Callback callback) {
        if (callback != null) {
            HandlerUtil.getMainHandler().post(new Runnable() {
                public void run() {
                    callback.onFail(str);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void onComplete(final String str, final Callback callback) {
        if (callback != null) {
            HandlerUtil.getMainHandler().post(new Runnable() {
                public void run() {
                    callback.onComplete(str);
                }
            });
        }
    }

    public void cancelPost(String str) {
        OkHttpClient okHttpClient2;
        if (str != null && (okHttpClient2 = this.okHttpClient) != null) {
            for (Call next : okHttpClient2.dispatcher().queuedCalls()) {
                if (str.equals(next.request().tag())) {
                    next.cancel();
                }
            }
        }
    }

    private RequestBody getRequestBody(Map<String, String> map) {
        FormBody.Builder builder = new FormBody.Builder();
        for (Map.Entry next : map.entrySet()) {
            builder.add((String) next.getKey(), (String) next.getValue());
        }
        return builder.build();
    }

    public static class HttpDns implements Dns {
        Map<String, String> ipCache = new HashMap();

        public List<InetAddress> lookup(String str) throws UnknownHostException {
            if (RemoteHelper.INSTANCE.getCanUseOkhttp()) {
                try {
                    String str2 = this.ipCache.get(str);
                    if (TextUtils.isEmpty(str2)) {
                        str2 = HttpDnsHelper.getInstance().getIpByHost(str);
                        this.ipCache.put(str, str2);
                    }
                    com.xp.wx.util.Log.debug("OkHttpClientUtil. ip = " + str2);
                    if (!TextUtils.isEmpty(str2)) {
                        return Arrays.asList(InetAddress.getAllByName(str2));
                    }
                } catch (Throwable th) {
                    com.xp.wx.util.Log.error(th);
                }
            }
            return Dns.SYSTEM.lookup(str);
        }
    }
}
