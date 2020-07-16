package com.p022ta.utdid2.p023a;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.core.view.PointerIconCompat;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.p022ta.utdid2.p024b.p025a.DebugUtils;
import com.p022ta.utdid2.p024b.p025a.NetworkUtils;
import com.p028ut.device.AidCallback;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ta.utdid2.a.b */
public class AidRequester {
    /* access modifiers changed from: private */
    public static final String TAG = AidRequester.class.getName();

    /* renamed from: a */
    private static AidRequester f794a = null;

    /* renamed from: a */
    private Object f795a = new Object();
    private Context mContext;

    /* renamed from: com.ta.utdid2.a.b$a */
    /* compiled from: AidRequester */
    class C1048a extends Thread {

        /* renamed from: a */
        AidCallback f796a;

        /* renamed from: a */
        String f797a = "";

        /* renamed from: a */
        HttpPost f798a;

        /* renamed from: b */
        String f800b;

        /* renamed from: c */
        String f801c;

        /* renamed from: d */
        String f802d = "";

        public C1048a(HttpPost httpPost) {
            this.f798a = httpPost;
        }

        public C1048a(HttpPost httpPost, AidCallback aVar, String str, String str2, String str3) {
            this.f798a = httpPost;
            this.f796a = aVar;
            this.f800b = str;
            this.f801c = str2;
            this.f802d = str3;
        }

        public void run() {
            HttpResponse httpResponse;
            AidCallback aVar = this.f796a;
            if (aVar != null) {
                aVar.mo12991a(1000, this.f800b);
            }
            BufferedReader bufferedReader = null;
            try {
                httpResponse = new DefaultHttpClient().execute(this.f798a);
            } catch (Exception e) {
                AidCallback aVar2 = this.f796a;
                if (aVar2 != null) {
                    aVar2.mo12991a(PointerIconCompat.TYPE_HAND, this.f800b);
                }
                Log.e(AidRequester.TAG, e.toString());
                httpResponse = null;
            }
            if (httpResponse != null) {
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent(), Charset.forName("UTF-8")));
                } catch (Exception e2) {
                    AidCallback aVar3 = this.f796a;
                    if (aVar3 != null) {
                        aVar3.mo12991a(PointerIconCompat.TYPE_HAND, this.f800b);
                    }
                    Log.e(AidRequester.TAG, e2.toString());
                }
            } else {
                Log.e(AidRequester.TAG, "response is null!");
            }
            if (bufferedReader != null) {
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        if (DebugUtils.f824e) {
                            Log.d(AidRequester.TAG, readLine);
                        }
                        this.f797a = readLine;
                    } catch (Exception e3) {
                        AidCallback aVar4 = this.f796a;
                        if (aVar4 != null) {
                            aVar4.mo12991a(PointerIconCompat.TYPE_HAND, this.f800b);
                        }
                        Log.e(AidRequester.TAG, e3.toString());
                    }
                }
            } else {
                Log.e(AidRequester.TAG, "BufferredReader is null!");
            }
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                    if (DebugUtils.f824e) {
                        Log.d(AidRequester.TAG, "close the bufferreader");
                    }
                } catch (IOException e4) {
                    Log.e(AidRequester.TAG, e4.toString());
                }
            }
            if (this.f796a == null) {
                synchronized (AidRequester.m644a(AidRequester.this)) {
                    AidRequester.m644a(AidRequester.this).notifyAll();
                }
                return;
            }
            String b = AidRequester.m648a(this.f797a, this.f800b);
            this.f796a.mo12991a(PointerIconCompat.TYPE_CONTEXT_MENU, b);
            AidStorageController.m656a(AidRequester.m644a(AidRequester.this), this.f801c, b, this.f802d);
        }

        /* renamed from: b */
        public String mo12923b() {
            return this.f797a;
        }
    }

    /* renamed from: a */
    public static synchronized AidRequester m645a(Context context) {
        AidRequester bVar;
        synchronized (AidRequester.class) {
            if (f794a == null) {
                f794a = new AidRequester(context);
            }
            bVar = f794a;
        }
        return bVar;
    }

    public AidRequester(Context context) {
        this.mContext = context;
    }

    /* renamed from: a */
    public void mo12922a(String str, String str2, String str3, String str4, AidCallback aVar) {
        String b = m650b(str, str2, str3, str4);
        if (DebugUtils.f824e) {
            String str5 = TAG;
            Log.d(str5, "url:" + b + "; len:" + b.length());
        }
        new C1048a(new HttpPost(b), aVar, str4, str, str2).start();
    }

    /* renamed from: a */
    public String mo12921a(String str, String str2, String str3, String str4) {
        String b = m650b(str, str2, str3, str4);
        int i = NetworkUtils.m671b(this.mContext) ? PathInterpolatorCompat.MAX_NUM_POINTS : 1000;
        if (DebugUtils.f824e) {
            String str5 = TAG;
            Log.d(str5, "url:" + b + "; timeout:" + i);
        }
        C1048a aVar = new C1048a(new HttpPost(b));
        aVar.start();
        try {
            synchronized (this.f795a) {
                this.f795a.wait((long) i);
            }
        } catch (Exception e) {
            Log.e(TAG, e.toString());
        }
        String b2 = aVar.mo12923b();
        if (DebugUtils.f824e) {
            String str6 = TAG;
            Log.d(str6, "mLine:" + b2);
        }
        return m648a(b2, str4);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static String m648a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("data")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                if (!jSONObject2.has("action") || !jSONObject2.has("aid")) {
                    return str2;
                }
                String string = jSONObject2.getString("action");
                if (string.equalsIgnoreCase("new") || string.equalsIgnoreCase("changed")) {
                    return jSONObject2.getString("aid");
                }
                return str2;
            } else if (!jSONObject.has("isError") || !jSONObject.has(NotificationCompat.CATEGORY_STATUS)) {
                return str2;
            } else {
                String string2 = jSONObject.getString("isError");
                String string3 = jSONObject.getString(NotificationCompat.CATEGORY_STATUS);
                if (!string2.equalsIgnoreCase("true")) {
                    return str2;
                }
                if (!string3.equalsIgnoreCase("404") && !string3.equalsIgnoreCase("401")) {
                    return str2;
                }
                if (DebugUtils.f824e) {
                    String str3 = TAG;
                    Log.d(str3, "remove the AID, status:" + string3);
                }
                return "";
            }
        } catch (JSONException e) {
            Log.e(TAG, e.toString());
            return str2;
        } catch (Exception e2) {
            Log.e(TAG, e2.toString());
            return str2;
        }
    }

    /* renamed from: b */
    private static String m650b(String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        try {
            str3 = URLEncoder.encode(str3, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        sb.append("http://hydra.alibaba.com/");
        sb.append(str);
        sb.append("/get_aid/");
        sb.append("?");
        sb.append("auth[token]=");
        sb.append(str2);
        sb.append("&type=");
        sb.append("utdid");
        sb.append("&id=");
        sb.append(str3);
        sb.append("&aid=");
        sb.append(str4);
        return sb.toString();
    }
}
