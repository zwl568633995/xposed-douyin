package com.qiniu.android.dns.http;

import com.qiniu.android.dns.Domain;
import com.qiniu.android.dns.IResolver;
import com.qiniu.android.dns.NetworkInfo;
import com.qiniu.android.dns.Record;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public final class DnspodFree implements IResolver {
    private final String ip;

    public DnspodFree(String str) {
        this.ip = str;
    }

    public DnspodFree() {
        this("119.29.29.29");
    }

    public Record[] resolve(Domain domain, NetworkInfo networkInfo) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("http://119.29.29.29/d?ttl=1&dn=" + domain.domain).openConnection();
        httpURLConnection.setConnectTimeout(5000);
        httpURLConnection.setReadTimeout(10000);
        Record[] recordArr = null;
        if (httpURLConnection.getResponseCode() != 200) {
            return null;
        }
        int contentLength = httpURLConnection.getContentLength();
        if (contentLength > 0 && contentLength <= 1024) {
            InputStream inputStream = httpURLConnection.getInputStream();
            byte[] bArr = new byte[contentLength];
            int read = inputStream.read(bArr);
            inputStream.close();
            if (read <= 0) {
                return null;
            }
            String[] split = new String(bArr, 0, read).split(",");
            if (split.length != 2) {
                return null;
            }
            try {
                int parseInt = Integer.parseInt(split[1]);
                String[] split2 = split[0].split(";");
                if (split2.length == 0) {
                    return null;
                }
                recordArr = new Record[split2.length];
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                for (int i = 0; i < split2.length; i++) {
                    recordArr[i] = new Record(split2[i], 1, parseInt, currentTimeMillis);
                }
            } catch (Exception unused) {
            }
        }
        return recordArr;
    }
}
