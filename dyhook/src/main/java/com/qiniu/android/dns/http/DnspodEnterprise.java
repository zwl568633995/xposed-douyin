package com.qiniu.android.dns.http;

import android.support.graphics.drawable.PathInterpolatorCompat;
import com.qiniu.android.common.Constants;
import com.qiniu.android.dns.Domain;
import com.qiniu.android.dns.IResolver;
import com.qiniu.android.dns.NetworkInfo;
import com.qiniu.android.dns.Record;
import com.qiniu.android.dns.util.Hex;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class DnspodEnterprise implements IResolver {
    private final String id;
    private final String ip;
    private final SecretKeySpec key;

    public DnspodEnterprise(String str, String str2, String str3) {
        this.id = str;
        this.ip = str3;
        try {
            this.key = new SecretKeySpec(str2.getBytes(Constants.UTF_8), "DES");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public DnspodEnterprise(String str, String str2) {
        this(str, str2, "119.29.29.29");
    }

    public Record[] resolve(Domain domain, NetworkInfo networkInfo) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("http://" + this.ip + "/d?ttl=1&dn=" + encrypt(domain.domain) + "&id=" + this.id).openConnection();
        httpURLConnection.setConnectTimeout(PathInterpolatorCompat.MAX_NUM_POINTS);
        httpURLConnection.setReadTimeout(6000);
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
            String[] split = decrypt(new String(bArr, 0, read)).split(",");
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

    private String encrypt(String str) {
        try {
            Cipher instance = Cipher.getInstance("DES/ECB/PKCS5Padding");
            instance.init(1, this.key);
            byte[] doFinal = instance.doFinal(str.getBytes(Constants.UTF_8));
            return Hex.encodeHexString(doFinal) + "&id=" + this.id;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private String decrypt(String str) {
        try {
            Cipher instance = Cipher.getInstance("DES/ECB/PKCS5Padding");
            instance.init(2, this.key);
            return new String(instance.doFinal(Hex.decodeHex(str.toCharArray())));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
