package com.qiniu.android.http;

import com.qiniu.android.common.Constants;
import com.qiniu.android.dns.DnsManager;
import com.qiniu.android.dns.Domain;
import com.qiniu.android.http.CancellationHandler;
import com.qiniu.android.storage.UpCancellationSignal;
import com.qiniu.android.utils.AsyncRun;
import com.qiniu.android.utils.StringMap;
import com.qiniu.android.utils.StringUtils;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Dns;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONObject;

public final class Client {
    public static final String ContentTypeHeader = "Content-Type";
    public static final String DefaultMime = "application/octet-stream";
    public static final String FormMime = "application/x-www-form-urlencoded";
    public static final String JsonMime = "application/json";
    private final UrlConverter converter;
    private OkHttpClient httpClient;

    public Client() {
        this((ProxyConfiguration) null, 10, 30, (UrlConverter) null, (DnsManager) null);
    }

    public Client(ProxyConfiguration proxyConfiguration, int i, int i2, UrlConverter urlConverter, final DnsManager dnsManager) {
        this.converter = urlConverter;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        if (proxyConfiguration != null) {
            builder.proxy(proxyConfiguration.proxy());
            if (!(proxyConfiguration.user == null || proxyConfiguration.password == null)) {
                builder.proxyAuthenticator(proxyConfiguration.authenticator());
            }
        }
        if (dnsManager != null) {
            builder.dns(new Dns() {
                public List<InetAddress> lookup(String str) throws UnknownHostException {
                    try {
                        InetAddress[] queryInetAdress = dnsManager.queryInetAdress(new Domain(str));
                        if (queryInetAdress != null) {
                            ArrayList arrayList = new ArrayList();
                            Collections.addAll(arrayList, queryInetAdress);
                            return arrayList;
                        }
                        throw new UnknownHostException(str + " resolve failed");
                    } catch (IOException e) {
                        e.printStackTrace();
                        throw new UnknownHostException(e.getMessage());
                    }
                }
            });
        }
        builder.networkInterceptors().add(new Interceptor() {
            public Response intercept(Interceptor.Chain chain) throws IOException {
                String str;
                Request request = chain.request();
                long currentTimeMillis = System.currentTimeMillis();
                Response proceed = chain.proceed(request);
                long currentTimeMillis2 = System.currentTimeMillis();
                ResponseTag responseTag = (ResponseTag) request.tag();
                try {
                    str = chain.connection().socket().getRemoteSocketAddress().toString();
                } catch (Exception e) {
                    e.printStackTrace();
                    str = "";
                }
                responseTag.ip = str;
                responseTag.duration = currentTimeMillis2 - currentTimeMillis;
                return proceed;
            }
        });
        builder.connectTimeout((long) i, TimeUnit.SECONDS);
        builder.readTimeout((long) i2, TimeUnit.SECONDS);
        builder.writeTimeout(0, TimeUnit.SECONDS);
        this.httpClient = builder.build();
    }

    private static String via(Response response) {
        String header = response.header("X-Via", "");
        if (!header.equals("")) {
            return header;
        }
        String header2 = response.header("X-Px", "");
        if (!header2.equals("")) {
            return header2;
        }
        String header3 = response.header("Fw-Via", "");
        if (!header3.equals("")) {
        }
        return header3;
    }

    private static String ctype(Response response) {
        MediaType contentType = response.body().contentType();
        if (contentType == null) {
            return "";
        }
        return contentType.type() + "/" + contentType.subtype();
    }

    private static JSONObject buildJsonResp(byte[] bArr) throws Exception {
        String str = new String(bArr, Constants.UTF_8);
        if (StringUtils.isNullOrEmpty(str)) {
            return new JSONObject();
        }
        return new JSONObject(str);
    }

    public void asyncSend(final Request.Builder builder, StringMap stringMap, final CompletionHandler completionHandler) {
        if (stringMap != null) {
            stringMap.forEach(new StringMap.Consumer() {
                public void accept(String str, Object obj) {
                    builder.header(str, obj.toString());
                }
            });
        }
        builder.header("User-Agent", UserAgent.instance().toString());
        this.httpClient.newCall(builder.tag(new ResponseTag()).build()).enqueue(new Callback() {
            public void onFailure(Call call, IOException iOException) {
                int i;
                IOException iOException2 = iOException;
                iOException.printStackTrace();
                String message = iOException.getMessage();
                if (iOException2 instanceof CancellationHandler.CancellationException) {
                    i = -2;
                } else if (iOException2 instanceof UnknownHostException) {
                    i = ResponseInfo.UnknownHost;
                } else if (message != null && message.indexOf("Broken pipe") == 0) {
                    i = ResponseInfo.NetworkConnectionLost;
                } else if (iOException2 instanceof SocketTimeoutException) {
                    i = ResponseInfo.TimedOut;
                } else {
                    i = iOException2 instanceof ConnectException ? ResponseInfo.CannotConnectToHost : -1;
                }
                HttpUrl url = call.request().url();
                String host = url.host();
                String encodedPath = url.encodedPath();
                int port = url.port();
                ResponseInfo responseInfo = r2;
                ResponseInfo responseInfo2 = new ResponseInfo((JSONObject) null, i, "", "", "", host, encodedPath, "", port, 0.0d, 0, iOException.getMessage());
                completionHandler.complete(responseInfo, (JSONObject) null);
            }

            public void onResponse(Call call, Response response) throws IOException {
                ResponseTag responseTag = (ResponseTag) response.request().tag();
                Client.onRet(response, responseTag.ip, responseTag.duration, completionHandler);
            }
        });
    }

    public void asyncPost(String str, byte[] bArr, StringMap stringMap, ProgressHandler progressHandler, CompletionHandler completionHandler, UpCancellationSignal upCancellationSignal) {
        asyncPost(str, bArr, 0, bArr.length, stringMap, progressHandler, completionHandler, upCancellationSignal);
    }

    public void asyncPost(String str, byte[] bArr, int i, int i2, StringMap stringMap, ProgressHandler progressHandler, CompletionHandler completionHandler, CancellationHandler cancellationHandler) {
        CountingRequestBody countingRequestBody;
        UrlConverter urlConverter = this.converter;
        if (urlConverter != null) {
            str = urlConverter.convert(str);
        }
        if (bArr == null || bArr.length <= 0) {
            countingRequestBody = RequestBody.create((MediaType) null, new byte[0]);
        } else {
            countingRequestBody = RequestBody.create(MediaType.parse(DefaultMime), bArr, i, i2);
        }
        if (progressHandler != null) {
            countingRequestBody = new CountingRequestBody(countingRequestBody, progressHandler, cancellationHandler);
        }
        asyncSend(new Request.Builder().url(str).post(countingRequestBody), stringMap, completionHandler);
    }

    public void asyncMultipartPost(String str, PostArgs postArgs, ProgressHandler progressHandler, CompletionHandler completionHandler, CancellationHandler cancellationHandler) {
        RequestBody requestBody;
        if (postArgs.file != null) {
            requestBody = RequestBody.create(MediaType.parse(postArgs.mimeType), postArgs.file);
        } else {
            requestBody = RequestBody.create(MediaType.parse(postArgs.mimeType), postArgs.data);
        }
        String str2 = str;
        ProgressHandler progressHandler2 = progressHandler;
        asyncMultipartPost(str2, postArgs.params, progressHandler2, postArgs.fileName, requestBody, completionHandler, cancellationHandler);
    }

    private void asyncMultipartPost(String str, StringMap stringMap, ProgressHandler progressHandler, String str2, RequestBody requestBody, CompletionHandler completionHandler, CancellationHandler cancellationHandler) {
        UrlConverter urlConverter = this.converter;
        if (urlConverter != null) {
            str = urlConverter.convert(str);
        }
        final MultipartBody.Builder builder = new MultipartBody.Builder();
        builder.addFormDataPart("file", str2, requestBody);
        stringMap.forEach(new StringMap.Consumer() {
            public void accept(String str, Object obj) {
                builder.addFormDataPart(str, obj.toString());
            }
        });
        builder.setType(MediaType.parse("multipart/form-data"));
        RequestBody build = builder.build();
        if (progressHandler != null) {
            build = new CountingRequestBody(build, progressHandler, cancellationHandler);
        }
        asyncSend(new Request.Builder().url(str).post(build), (StringMap) null, completionHandler);
    }

    private static ResponseInfo buildResponseInfo(Response response, String str, long j) {
        String str2;
        String str3;
        byte[] bArr;
        String str4;
        String str5;
        Response response2 = response;
        int code = response.code();
        String header = response2.header("X-Reqid");
        JSONObject jSONObject = null;
        if (header == null) {
            str2 = null;
        } else {
            str2 = header.trim();
        }
        try {
            bArr = response.body().bytes();
            str3 = null;
        } catch (IOException e) {
            str3 = e.getMessage();
            bArr = null;
        }
        if (!ctype(response).equals(JsonMime) || bArr == null) {
            if (bArr == null) {
                str5 = "null body";
            } else {
                str5 = new String(bArr);
            }
            str4 = str5;
        } else {
            try {
                jSONObject = buildJsonResp(bArr);
                if (response.code() != 200) {
                    str3 = jSONObject.optString("error", new String(bArr, Constants.UTF_8));
                }
            } catch (Exception e2) {
                if (response.code() < 300) {
                    str3 = e2.getMessage();
                }
            }
            str4 = str3;
        }
        HttpUrl url = response.request().url();
        return new ResponseInfo(jSONObject, code, str2, response2.header("X-Log"), via(response), url.host(), url.encodedPath(), str, url.port(), (double) j, 0, str4);
    }

    /* access modifiers changed from: private */
    public static void onRet(Response response, String str, long j, final CompletionHandler completionHandler) {
        final ResponseInfo buildResponseInfo = buildResponseInfo(response, str, j);
        AsyncRun.runInMain(new Runnable() {
            public void run() {
                CompletionHandler completionHandler = completionHandler;
                ResponseInfo responseInfo = buildResponseInfo;
                completionHandler.complete(responseInfo, responseInfo.response);
            }
        });
    }

    public void asyncGet(String str, StringMap stringMap, CompletionHandler completionHandler) {
        asyncSend(new Request.Builder().get().url(str), stringMap, completionHandler);
    }

    public ResponseInfo send(Request.Builder builder, StringMap stringMap) {
        final Request.Builder builder2 = builder;
        StringMap stringMap2 = stringMap;
        if (stringMap2 != null) {
            stringMap2.forEach(new StringMap.Consumer() {
                public void accept(String str, Object obj) {
                    builder2.header(str, obj.toString());
                }
            });
        }
        builder2.header("User-Agent", UserAgent.instance().toString());
        System.currentTimeMillis();
        ResponseTag responseTag = new ResponseTag();
        Request build = builder2.tag(responseTag).build();
        try {
            return buildResponseInfo(this.httpClient.newCall(build).execute(), responseTag.ip, responseTag.duration);
        } catch (IOException e) {
            e.printStackTrace();
            return new ResponseInfo((JSONObject) null, -1, "", "", "", build.url().host(), build.url().encodedPath(), responseTag.ip, build.url().port(), (double) responseTag.duration, 0, e.getMessage());
        }
    }

    private static class ResponseTag {
        public long duration;
        public String ip;

        private ResponseTag() {
            this.ip = "";
            this.duration = 0;
        }
    }
}
