package com.qiniu.android.storage;

import android.os.Looper;
import android.util.Log;
import com.qiniu.android.http.Client;
import com.qiniu.android.utils.AndroidNetwork;
import java.util.HashMap;
import java.util.Map;

public final class UploadOptions {
    final UpCancellationSignal cancellationSignal;
    final boolean checkCrc;
    final String mimeType;
    final NetReadyHandler netReadyHandler;
    final Map<String, String> params;
    final UpProgressHandler progressHandler;

    public UploadOptions(Map<String, String> map, String str, boolean z, UpProgressHandler upProgressHandler, UpCancellationSignal upCancellationSignal) {
        this(map, str, z, upProgressHandler, upCancellationSignal, (NetReadyHandler) null);
    }

    public UploadOptions(Map<String, String> map, String str, boolean z, UpProgressHandler upProgressHandler, UpCancellationSignal upCancellationSignal, NetReadyHandler netReadyHandler2) {
        this.params = filterParam(map);
        this.mimeType = mime(str);
        this.checkCrc = z;
        this.progressHandler = upProgressHandler == null ? new UpProgressHandler() {
            public void progress(String str, double d) {
                Log.d("qiniu up progress", "" + d);
            }
        } : upProgressHandler;
        this.cancellationSignal = upCancellationSignal == null ? new UpCancellationSignal() {
            public boolean isCancelled() {
                return false;
            }
        } : upCancellationSignal;
        this.netReadyHandler = netReadyHandler2 == null ? new NetReadyHandler() {
            public void waitReady() {
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    int i = 0;
                    while (i < 6) {
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        if (!AndroidNetwork.isNetWorkReady()) {
                            i++;
                        } else {
                            return;
                        }
                    }
                }
            }
        } : netReadyHandler2;
    }

    private static Map<String, String> filterParam(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        if (map == null) {
            return hashMap;
        }
        for (Map.Entry next : map.entrySet()) {
            if (((String) next.getKey()).startsWith("x:") && next.getValue() != null && !((String) next.getValue()).equals("")) {
                hashMap.put(next.getKey(), next.getValue());
            }
        }
        return hashMap;
    }

    static UploadOptions defaultOptions() {
        return new UploadOptions((Map<String, String>) null, (String) null, false, (UpProgressHandler) null, (UpCancellationSignal) null);
    }

    private static String mime(String str) {
        return (str == null || str.equals("")) ? Client.DefaultMime : str;
    }
}
