package com.qiniu.android.storage;

import com.qiniu.android.http.Client;
import com.qiniu.android.http.CompletionHandler;
import com.qiniu.android.http.ProgressHandler;
import com.qiniu.android.http.ResponseInfo;
import com.qiniu.android.utils.AndroidNetwork;
import com.qiniu.android.utils.Crc32;
import com.qiniu.android.utils.StringMap;
import com.qiniu.android.utils.StringUtils;
import com.qiniu.android.utils.UrlSafeBase64;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class ResumeUploader implements Runnable {
    private final byte[] chunkBuffer;
    private final Client client;
    /* access modifiers changed from: private */
    public final UpCompletionHandler completionHandler;
    /* access modifiers changed from: private */
    public final Configuration config;
    /* access modifiers changed from: private */
    public final String[] contexts;
    /* access modifiers changed from: private */
    public long crc32;
    private File f;
    /* access modifiers changed from: private */
    public RandomAccessFile file = null;
    private final StringMap headers;
    /* access modifiers changed from: private */
    public final String key;
    private final long modifyTime;
    /* access modifiers changed from: private */
    public final UploadOptions options;
    private final String recorderKey;
    /* access modifiers changed from: private */
    public final long size;
    /* access modifiers changed from: private */
    public UpToken token;

    ResumeUploader(Client client2, Configuration configuration, File file2, String str, UpToken upToken, final UpCompletionHandler upCompletionHandler, UploadOptions uploadOptions, String str2) {
        this.client = client2;
        this.config = configuration;
        this.f = file2;
        this.recorderKey = str2;
        this.size = file2.length();
        this.key = str;
        StringMap stringMap = new StringMap();
        this.headers = stringMap.put("Authorization", "UpToken " + upToken.token);
        this.completionHandler = new UpCompletionHandler() {
            public void complete(String str, ResponseInfo responseInfo, JSONObject jSONObject) {
                if (ResumeUploader.this.file != null) {
                    try {
                        ResumeUploader.this.file.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                upCompletionHandler.complete(str, responseInfo, jSONObject);
            }
        };
        this.options = uploadOptions == null ? UploadOptions.defaultOptions() : uploadOptions;
        this.chunkBuffer = new byte[configuration.chunkSize];
        this.contexts = new String[((int) (((this.size + 4194304) - 1) / 4194304))];
        this.modifyTime = file2.lastModified();
        this.token = upToken;
    }

    /* access modifiers changed from: private */
    public static boolean isChunkOK(ResponseInfo responseInfo, JSONObject jSONObject) {
        return responseInfo.statusCode == 200 && responseInfo.error == null && (responseInfo.hasReqId() || isChunkResOK(jSONObject));
    }

    private static boolean isChunkResOK(JSONObject jSONObject) {
        try {
            jSONObject.getString("ctx");
            jSONObject.getLong("crc32");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    public static boolean isNotChunkToQiniu(ResponseInfo responseInfo, JSONObject jSONObject) {
        return responseInfo.statusCode < 500 && responseInfo.statusCode >= 200 && !responseInfo.hasReqId() && !isChunkResOK(jSONObject);
    }

    public void run() {
        long recoveryFromRecord = recoveryFromRecord();
        try {
            this.file = new RandomAccessFile(this.f, "r");
            nextTask(recoveryFromRecord, 0, this.config.zone.upHost(this.token.token).address);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            this.completionHandler.complete(this.key, ResponseInfo.fileError(e), (JSONObject) null);
        }
    }

    private void makeBlock(URI uri, long j, int i, int i2, ProgressHandler progressHandler, CompletionHandler completionHandler2, UpCancellationSignal upCancellationSignal) {
        int i3 = i2;
        String format = String.format(Locale.ENGLISH, "/mkblk/%d", new Object[]{Integer.valueOf(i)});
        try {
            long j2 = j;
            this.file.seek(j);
            this.file.read(this.chunkBuffer, 0, i2);
            this.crc32 = Crc32.bytes(this.chunkBuffer, 0, i2);
            URI uri2 = uri;
            post(newURI(uri, format), this.chunkBuffer, 0, i2, progressHandler, completionHandler2, upCancellationSignal);
        } catch (IOException e) {
            this.completionHandler.complete(this.key, ResponseInfo.fileError(e), (JSONObject) null);
        }
    }

    private void putChunk(URI uri, long j, int i, String str, ProgressHandler progressHandler, CompletionHandler completionHandler2, UpCancellationSignal upCancellationSignal) {
        int i2 = i;
        String format = String.format(Locale.ENGLISH, "/bput/%s/%d", new Object[]{str, Integer.valueOf((int) (j % 4194304))});
        try {
            this.file.seek(j);
            this.file.read(this.chunkBuffer, 0, i);
            this.crc32 = Crc32.bytes(this.chunkBuffer, 0, i);
            URI uri2 = uri;
            post(newURI(uri, format), this.chunkBuffer, 0, i, progressHandler, completionHandler2, upCancellationSignal);
        } catch (IOException e) {
            this.completionHandler.complete(this.key, ResponseInfo.fileError(e), (JSONObject) null);
        }
    }

    private void makeFile(URI uri, CompletionHandler completionHandler2, UpCancellationSignal upCancellationSignal) {
        String str;
        URI uri2;
        String format = String.format(Locale.ENGLISH, "/mimeType/%s/fname/%s", new Object[]{UrlSafeBase64.encodeToString(this.options.mimeType), UrlSafeBase64.encodeToString(this.f.getName())});
        String str2 = this.key;
        String str3 = "";
        if (str2 != null) {
            str = String.format("/key/%s", new Object[]{UrlSafeBase64.encodeToString(str2)});
        } else {
            str = str3;
        }
        if (this.options.params.size() != 0) {
            String[] strArr = new String[this.options.params.size()];
            int i = 0;
            for (Map.Entry next : this.options.params.entrySet()) {
                strArr[i] = String.format(Locale.ENGLISH, "%s/%s", new Object[]{next.getKey(), UrlSafeBase64.encodeToString((String) next.getValue())});
                i++;
            }
            str3 = "/" + StringUtils.join(strArr, "/");
        }
        try {
            uri2 = new URI(uri.getScheme(), uri.getHost(), String.format(Locale.ENGLISH, "/mkfile/%d%s%s%s", new Object[]{Long.valueOf(this.size), format, str, str3}), (String) null);
        } catch (URISyntaxException e) {
            e.printStackTrace();
            uri2 = uri;
        }
        byte[] bytes = StringUtils.join(this.contexts, ",").getBytes();
        post(uri2, bytes, 0, bytes.length, (ProgressHandler) null, completionHandler2, upCancellationSignal);
    }

    private void post(URI uri, byte[] bArr, int i, int i2, ProgressHandler progressHandler, CompletionHandler completionHandler2, UpCancellationSignal upCancellationSignal) {
        this.client.asyncPost(uri.toString(), bArr, i, i2, this.headers, progressHandler, completionHandler2, upCancellationSignal);
    }

    private long calcPutSize(long j) {
        long j2 = this.size - j;
        return j2 < ((long) this.config.chunkSize) ? j2 : (long) this.config.chunkSize;
    }

    private long calcBlockSize(long j) {
        long j2 = this.size - j;
        if (j2 < 4194304) {
            return j2;
        }
        return 4194304;
    }

    private boolean isCancelled() {
        return this.options.cancellationSignal.isCancelled();
    }

    /* access modifiers changed from: private */
    public void nextTask(final long j, final int i, URI uri) {
        if (isCancelled()) {
            this.completionHandler.complete(this.key, ResponseInfo.cancelled(), (JSONObject) null);
        } else if (j == this.size) {
            makeFile(uri, new CompletionHandler() {
                public void complete(ResponseInfo responseInfo, JSONObject jSONObject) {
                    if (responseInfo.isNetworkBroken() && !AndroidNetwork.isNetWorkReady()) {
                        ResumeUploader.this.options.netReadyHandler.waitReady();
                        if (!AndroidNetwork.isNetWorkReady()) {
                            ResumeUploader.this.completionHandler.complete(ResumeUploader.this.key, responseInfo, jSONObject);
                            return;
                        }
                    }
                    if (responseInfo.isOK()) {
                        ResumeUploader.this.removeRecord();
                        ResumeUploader.this.options.progressHandler.progress(ResumeUploader.this.key, 1.0d);
                        ResumeUploader.this.completionHandler.complete(ResumeUploader.this.key, responseInfo, jSONObject);
                    } else if (ResumeUploader.this.config.zone.upHostBackup(ResumeUploader.this.token.token) == null || (((!responseInfo.isNotQiniu() || ResumeUploader.this.token.hasReturnUrl()) && !responseInfo.needRetry()) || i >= ResumeUploader.this.config.retryMax)) {
                        ResumeUploader.this.completionHandler.complete(ResumeUploader.this.key, responseInfo, jSONObject);
                    } else {
                        ResumeUploader resumeUploader = ResumeUploader.this;
                        resumeUploader.nextTask(j, i + 1, resumeUploader.config.zone.upHostBackup(ResumeUploader.this.token.token).address);
                    }
                }
            }, this.options.cancellationSignal);
        } else {
            int calcPutSize = (int) calcPutSize(j);
            AnonymousClass3 r0 = new ProgressHandler() {
                public void onProgress(int i, int i2) {
                    double d = (double) (j + ((long) i));
                    double access$800 = (double) ResumeUploader.this.size;
                    Double.isNaN(d);
                    Double.isNaN(access$800);
                    double d2 = d / access$800;
                    if (d2 > 0.95d) {
                        d2 = 0.95d;
                    }
                    ResumeUploader.this.options.progressHandler.progress(ResumeUploader.this.key, d2);
                }
            };
            final int i2 = i;
            final long j2 = j;
            final URI uri2 = uri;
            final int i3 = calcPutSize;
            AnonymousClass4 r2 = new CompletionHandler() {
                public void complete(ResponseInfo responseInfo, JSONObject jSONObject) {
                    if (responseInfo.isNetworkBroken() && !AndroidNetwork.isNetWorkReady()) {
                        ResumeUploader.this.options.netReadyHandler.waitReady();
                        if (!AndroidNetwork.isNetWorkReady()) {
                            ResumeUploader.this.completionHandler.complete(ResumeUploader.this.key, responseInfo, jSONObject);
                            return;
                        }
                    }
                    if (ResumeUploader.isChunkOK(responseInfo, jSONObject)) {
                        String str = null;
                        if (jSONObject != null || i2 >= ResumeUploader.this.config.retryMax) {
                            long j = 0;
                            try {
                                str = jSONObject.getString("ctx");
                                j = jSONObject.getLong("crc32");
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            if ((str == null || j != ResumeUploader.this.crc32) && i2 < ResumeUploader.this.config.retryMax) {
                                ResumeUploader resumeUploader = ResumeUploader.this;
                                resumeUploader.nextTask(j2, i2 + 1, resumeUploader.config.zone.upHostBackup(ResumeUploader.this.token.token).address);
                                return;
                            }
                            String[] access$1200 = ResumeUploader.this.contexts;
                            long j2 = j2;
                            access$1200[(int) (j2 / 4194304)] = str;
                            ResumeUploader.this.record(j2 + ((long) i3));
                            ResumeUploader.this.nextTask(j2 + ((long) i3), i2, uri2);
                            return;
                        }
                        ResumeUploader resumeUploader2 = ResumeUploader.this;
                        resumeUploader2.nextTask(j2, i2 + 1, resumeUploader2.config.zone.upHostBackup(ResumeUploader.this.token.token).address);
                    } else if (responseInfo.statusCode == 701 && i2 < ResumeUploader.this.config.retryMax) {
                        ResumeUploader.this.nextTask((j2 / 4194304) * 4194304, i2 + 1, uri2);
                    } else if (ResumeUploader.this.config.zone.upHostBackup(ResumeUploader.this.token.token) == null || ((!ResumeUploader.isNotChunkToQiniu(responseInfo, jSONObject) && !responseInfo.needRetry()) || i2 >= ResumeUploader.this.config.retryMax)) {
                        ResumeUploader.this.completionHandler.complete(ResumeUploader.this.key, responseInfo, jSONObject);
                    } else {
                        ResumeUploader resumeUploader3 = ResumeUploader.this;
                        resumeUploader3.nextTask(j2, i2 + 1, resumeUploader3.config.zone.upHostBackup(ResumeUploader.this.token.token).address);
                    }
                }
            };
            if (j % 4194304 == 0) {
                makeBlock(uri, j, (int) calcBlockSize(j), calcPutSize, r0, r2, this.options.cancellationSignal);
                return;
            }
            putChunk(uri, j, calcPutSize, this.contexts[(int) (j / 4194304)], r0, r2, this.options.cancellationSignal);
        }
    }

    private long recoveryFromRecord() {
        byte[] bArr;
        if (this.config.recorder == null || (bArr = this.config.recorder.get(this.recorderKey)) == null) {
            return 0;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            long optLong = jSONObject.optLong("offset", 0);
            long optLong2 = jSONObject.optLong("modify_time", 0);
            long optLong3 = jSONObject.optLong("size", 0);
            JSONArray optJSONArray = jSONObject.optJSONArray("contexts");
            if (optLong == 0 || optLong2 != this.modifyTime || optLong3 != this.size || optJSONArray == null || optJSONArray.length() == 0) {
                return 0;
            }
            for (int i = 0; i < optJSONArray.length(); i++) {
                this.contexts[i] = optJSONArray.optString(i);
            }
            return optLong;
        } catch (JSONException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* access modifiers changed from: private */
    public void removeRecord() {
        if (this.config.recorder != null) {
            this.config.recorder.del(this.recorderKey);
        }
    }

    /* access modifiers changed from: private */
    public void record(long j) {
        if (this.config.recorder != null && j != 0) {
            this.config.recorder.set(this.recorderKey, String.format(Locale.ENGLISH, "{\"size\":%d,\"offset\":%d, \"modify_time\":%d, \"contexts\":[%s]}", new Object[]{Long.valueOf(this.size), Long.valueOf(j), Long.valueOf(this.modifyTime), StringUtils.jsonJoin(this.contexts)}).getBytes());
        }
    }

    private URI newURI(URI uri, String str) {
        try {
            return new URI(uri.getScheme(), (String) null, uri.getHost(), uri.getPort(), str, (String) null, (String) null);
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return uri;
        }
    }
}
