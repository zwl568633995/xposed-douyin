package com.wujieshuju.huidou.network;

import android.content.Intent;
import android.text.TextUtils;
import android.widget.Toast;
import com.wujieshuju.huidou.Const;
import com.wujieshuju.huidou.HDApp;
import com.wujieshuju.huidou.model.LoginInfo;
import com.wujieshuju.huidou.network.OkHttpClientUtil;
import com.wujieshuju.huidou.p031ui.activity.LoginActivity;
import com.wujieshuju.huidou.util.ConfigUtil;
import com.wujieshuju.huidou.util.HandlerUtil;
import com.wujieshuju.huidou.util.LogUtil;
import com.wujieshuju.huidou.util.StringUtils;
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

    public interface ResponseCallback {
        <T extends BaseResponse> void onComplete(T t);
    }

    public void saveOption() {
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
        }).connectTimeout(60, TimeUnit.SECONDS).readTimeout(60, TimeUnit.SECONDS);
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

    public void post(String str, String str2, Map<String, String> map, Class<? extends BaseResponse> cls, ResponseCallback responseCallback) {
        post(str, str2, map, (Map<String, String>) null, cls, responseCallback);
    }

    public void post(String str, String str2, Map<String, String> map, Map<String, String> map2, final Class<? extends BaseResponse> cls, final ResponseCallback responseCallback) {
        Request request;
        if (map2 == null) {
            map2 = new HashMap<>();
            map2.put("Authorization", StringUtils.emptyIfNull(ConfigUtil.getInstance().getLoginInfo().token));
        }
        if (map == null) {
            Request.Builder builder = new Request.Builder();
            request = builder.url(str + str2).tag(str2).headers(Headers.m850of(map2)).build();
        } else {
            RequestBody requestBody = getRequestBody(map);
            Request.Builder builder2 = new Request.Builder();
            request = builder2.url(str + str2).tag(str2).headers(Headers.m850of(map2)).post(requestBody).build();
        }
        this.okHttpClient.newCall(request).enqueue(new okhttp3.Callback() {
            public void onFailure(Call call, IOException iOException) {
                OkHttpClientUtil.this.onFail(iOException.getMessage(), cls, responseCallback);
            }

            public void onResponse(Call call, Response response) {
                if (responseCallback != null) {
                    ResponseBody body = response.body();
                    if (body != null) {
                        try {
                            String string = body.string();
                            if (!TextUtils.isEmpty(string)) {
                                OkHttpClientUtil.this.onSuccess(response.headers().toMultimap(), string, cls, responseCallback);
                            } else {
                                OkHttpClientUtil.this.onFail("返回结果为空", cls, responseCallback);
                            }
                        } catch (Exception e) {
                            OkHttpClientUtil.this.onFail(e.getMessage(), cls, responseCallback);
                        }
                    } else {
                        OkHttpClientUtil.this.onFail("ResponseBody为空", cls, responseCallback);
                    }
                }
            }
        });
    }

    public void post(String str, Map<String, String> map, Class<? extends BaseResponse> cls, ResponseCallback responseCallback) {
        post("http://task.wujieshuju.com:8089", str, map, cls, responseCallback);
    }

    public void post(String str, Map<String, String> map, Map<String, String> map2, Class<? extends BaseResponse> cls, ResponseCallback responseCallback) {
        post("http://task.wujieshuju.com:8089", str, map, map2, cls, responseCallback);
    }

    /* access modifiers changed from: private */
    public void onFail(String str, Class<? extends BaseResponse> cls, ResponseCallback responseCallback) {
        BaseResponse baseResponse;
        if (responseCallback != null) {
            BaseResponse baseResponse2 = null;
            try {
                baseResponse = (BaseResponse) cls.newInstance();
                try {
                    baseResponse.status = -1;
                    baseResponse.msg = str;
                } catch (Exception e) {
                    e = e;
                    baseResponse2 = baseResponse;
                }
            } catch (Exception e2) {
                e = e2;
                LogUtil.m820e(Const.TAG, (Throwable) e);
                baseResponse = baseResponse2;
                HandlerUtil.getMainHandler().post(new Runnable(baseResponse) {
                    private final /* synthetic */ BaseResponse f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        OkHttpClientUtil.ResponseCallback.this.onComplete(this.f$1);
                    }
                });
            }
            HandlerUtil.getMainHandler().post(new Runnable(baseResponse) {
                private final /* synthetic */ BaseResponse f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    OkHttpClientUtil.ResponseCallback.this.onComplete(this.f$1);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSuccess(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r3, java.lang.String r4, java.lang.Class<? extends com.wujieshuju.huidou.network.BaseResponse> r5, com.wujieshuju.huidou.network.OkHttpClientUtil.ResponseCallback r6) {
        /*
            r2 = this;
            if (r6 == 0) goto L_0x0044
            java.lang.Object r4 = com.wujieshuju.huidou.util.JsonUtil.parseJson((java.lang.String) r4, r5)
            com.wujieshuju.huidou.network.BaseResponse r4 = (com.wujieshuju.huidou.network.BaseResponse) r4
            if (r4 != 0) goto L_0x0024
            java.lang.Object r5 = r5.newInstance()     // Catch:{ Exception -> 0x001a }
            com.wujieshuju.huidou.network.BaseResponse r5 = (com.wujieshuju.huidou.network.BaseResponse) r5     // Catch:{ Exception -> 0x001a }
            r4 = -1
            r5.status = r4     // Catch:{ Exception -> 0x0018 }
            java.lang.String r4 = "服务器异常"
            r5.msg = r4     // Catch:{ Exception -> 0x0018 }
            goto L_0x0023
        L_0x0018:
            r4 = move-exception
            goto L_0x001e
        L_0x001a:
            r5 = move-exception
            r1 = r5
            r5 = r4
            r4 = r1
        L_0x001e:
            java.lang.String r0 = "BaoZhi-HD"
            com.wujieshuju.huidou.util.LogUtil.m820e((java.lang.String) r0, (java.lang.Throwable) r4)
        L_0x0023:
            r4 = r5
        L_0x0024:
            if (r4 == 0) goto L_0x0028
            r4.headers = r3
        L_0x0028:
            int r3 = r4.status
            r5 = 4004(0xfa4, float:5.611E-42)
            if (r3 != r5) goto L_0x0038
            android.os.Handler r3 = com.wujieshuju.huidou.util.HandlerUtil.getMainHandler()
            com.wujieshuju.huidou.network.-$$Lambda$OkHttpClientUtil$5_UZy6XjJH8JLH2dWhWKYtV8jB8 r4 = com.wujieshuju.huidou.network.$$Lambda$OkHttpClientUtil$5_UZy6XjJH8JLH2dWhWKYtV8jB8.INSTANCE
            r3.post(r4)
            return
        L_0x0038:
            android.os.Handler r3 = com.wujieshuju.huidou.util.HandlerUtil.getMainHandler()
            com.wujieshuju.huidou.network.-$$Lambda$OkHttpClientUtil$QuPorgKJdDfUfytNp9tSkOkmpWk r5 = new com.wujieshuju.huidou.network.-$$Lambda$OkHttpClientUtil$QuPorgKJdDfUfytNp9tSkOkmpWk
            r5.<init>(r4)
            r3.post(r5)
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wujieshuju.huidou.network.OkHttpClientUtil.onSuccess(java.util.Map, java.lang.String, java.lang.Class, com.wujieshuju.huidou.network.OkHttpClientUtil$ResponseCallback):void");
    }

    static /* synthetic */ void lambda$onSuccess$1() {
        Toast.makeText(HDApp.getApp().getApplicationContext(), "登录失效，请重新登录", 0).show();
        ConfigUtil.getInstance().saveLoginInfo((LoginInfo) null);
        Intent intent = new Intent(HDApp.getApp().getApplicationContext(), LoginActivity.class);
        intent.addFlags(268435456);
        intent.addFlags(32768);
        HDApp.getApp().getApplicationContext().startActivity(intent);
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
            builder.add((String) next.getKey(), StringUtils.emptyIfNull((String) next.getValue()));
        }
        return builder.build();
    }

    public static class HttpDns implements Dns {
        Map<String, String> ipCache = new HashMap();

        public List<InetAddress> lookup(String str) throws UnknownHostException {
            String str2 = this.ipCache.get(str);
            if (TextUtils.isEmpty(str2)) {
                str2 = HttpDnsHelper.getInstance().getIpByHost(str);
                this.ipCache.put(str, str2);
            }
            LogUtil.m817d(Const.TAG, "OkHttpClientUtil. ip = " + str2);
            if (!TextUtils.isEmpty(str2)) {
                return Arrays.asList(InetAddress.getAllByName(str2));
            }
            return Dns.SYSTEM.lookup(str);
        }
    }

    public void postWithRemote(String str, String str2, Map<String, String> map, Map<String, String> map2, final Callback callback) {
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        RequestBody requestBody = getRequestBody(map);
        Request.Builder builder = new Request.Builder();
        this.okHttpClient.newCall(builder.url(str + str2).tag(str2).headers(Headers.m850of(map2)).post(requestBody).build()).enqueue(new okhttp3.Callback() {
            public void onFailure(Call call, IOException iOException) {
                OkHttpClientUtil.this.onFailWithRemote(iOException.getMessage(), callback);
            }

            public void onResponse(Call call, Response response) {
                if (callback != null) {
                    ResponseBody body = response.body();
                    if (body != null) {
                        try {
                            OkHttpClientUtil.this.onCompleteWithRemote(body.string(), callback);
                        } catch (Exception e) {
                            OkHttpClientUtil.this.onFailWithRemote(e.getMessage(), callback);
                        }
                    } else {
                        OkHttpClientUtil.this.onFailWithRemote("返回结果为空", callback);
                    }
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void onFailWithRemote(final String str, final Callback callback) {
        if (callback != null) {
            HandlerUtil.getMainHandler().post(new Runnable() {
                public void run() {
                    callback.onFail(str);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void onCompleteWithRemote(final String str, final Callback callback) {
        if (callback != null) {
            HandlerUtil.getMainHandler().post(new Runnable() {
                public void run() {
                    callback.onComplete(str);
                }
            });
        }
    }
}
