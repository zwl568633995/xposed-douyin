package com.qiniu.android.http;

import com.qiniu.android.common.Constants;
import java.util.Locale;
import org.json.JSONObject;

public final class ResponseInfo {
    public static final int Cancelled = -2;
    public static final int CannotConnectToHost = -1004;
    public static final int InvalidArgument = -4;
    public static final int InvalidFile = -3;
    public static final int InvalidToken = -5;
    public static final int NetworkConnectionLost = -1005;
    public static final int NetworkError = -1;
    public static final int TimedOut = -1001;
    public static final int UnknownHost = -1003;
    public static final int ZeroSizeFile = -6;
    public final double duration;
    public final String error;
    public final String host;
    public final String id = UserAgent.instance().id;
    public final String ip;
    public final String path;
    public final int port;
    public final String reqId;
    public final JSONObject response;
    public final long sent;
    public final int statusCode;
    public final long timeStamp = (System.currentTimeMillis() / 1000);
    public final String xlog;
    public final String xvia;

    public ResponseInfo(JSONObject jSONObject, int i, String str, String str2, String str3, String str4, String str5, String str6, int i2, double d, long j, String str7) {
        this.response = jSONObject;
        this.statusCode = i;
        this.reqId = str;
        this.xlog = str2;
        this.xvia = str3;
        this.host = str4;
        this.path = str5;
        this.duration = d;
        this.error = str7;
        this.ip = str6;
        this.port = i2;
        this.sent = j;
    }

    public static ResponseInfo zeroSize() {
        return new ResponseInfo((JSONObject) null, -6, "", "", "", "", "", "", -1, 0.0d, 0, "file or data size is zero");
    }

    public static ResponseInfo cancelled() {
        return new ResponseInfo((JSONObject) null, -2, "", "", "", "", "", "", -1, 0.0d, 0, "cancelled by user");
    }

    public static ResponseInfo invalidArgument(String str) {
        return new ResponseInfo((JSONObject) null, -4, "", "", "", "", "", "", -1, 0.0d, 0, str);
    }

    public static ResponseInfo invalidToken(String str) {
        return new ResponseInfo((JSONObject) null, -5, "", "", "", "", "", "", -1, 0.0d, 0, str);
    }

    public static ResponseInfo fileError(Exception exc) {
        return new ResponseInfo((JSONObject) null, -3, "", "", "", "", "", "", -1, 0.0d, 0, exc.getMessage());
    }

    public boolean isCancelled() {
        return this.statusCode == -2;
    }

    public boolean isOK() {
        return this.statusCode == 200 && this.error == null && (hasReqId() || this.response != null);
    }

    public boolean isNetworkBroken() {
        int i = this.statusCode;
        return i == -1 || i == -1003 || i == -1004 || i == -1001 || i == -1005;
    }

    public boolean isServerError() {
        int i = this.statusCode;
        return (i >= 500 && i < 600 && i != 579) || this.statusCode == 996;
    }

    public boolean needSwitchServer() {
        return isNetworkBroken() || isServerError();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r2.statusCode;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean needRetry() {
        /*
            r2 = this;
            boolean r0 = r2.isCancelled()
            if (r0 != 0) goto L_0x001c
            boolean r0 = r2.needSwitchServer()
            if (r0 != 0) goto L_0x001a
            int r0 = r2.statusCode
            r1 = 406(0x196, float:5.69E-43)
            if (r0 == r1) goto L_0x001a
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 != r1) goto L_0x001c
            java.lang.String r0 = r2.error
            if (r0 == 0) goto L_0x001c
        L_0x001a:
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiniu.android.http.ResponseInfo.needRetry():boolean");
    }

    public boolean isNotQiniu() {
        int i = this.statusCode;
        return i < 500 && i >= 200 && !hasReqId() && this.response == null;
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "{ver:%s,ResponseInfo:%s,status:%d, reqId:%s, xlog:%s, xvia:%s, host:%s, path:%s, ip:%s, port:%d, duration:%f s, time:%d, sent:%d,error:%s}", new Object[]{Constants.VERSION, this.id, Integer.valueOf(this.statusCode), this.reqId, this.xlog, this.xvia, this.host, this.path, this.ip, Integer.valueOf(this.port), Double.valueOf(this.duration), Long.valueOf(this.timeStamp), Long.valueOf(this.sent), this.error});
    }

    public boolean hasReqId() {
        return this.reqId != null;
    }
}
