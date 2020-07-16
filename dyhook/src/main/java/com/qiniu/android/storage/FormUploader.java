package com.qiniu.android.storage;

import com.qiniu.android.http.Client;
import com.qiniu.android.http.CompletionHandler;
import com.qiniu.android.http.PostArgs;
import com.qiniu.android.http.ProgressHandler;
import com.qiniu.android.http.ResponseInfo;
import com.qiniu.android.utils.AndroidNetwork;
import com.qiniu.android.utils.Crc32;
import com.qiniu.android.utils.StringMap;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import org.json.JSONObject;

final class FormUploader {
    FormUploader() {
    }

    static void upload(Client client, Configuration configuration, byte[] bArr, String str, UpToken upToken, UpCompletionHandler upCompletionHandler, UploadOptions uploadOptions) {
        post(bArr, (File) null, str, upToken, upCompletionHandler, uploadOptions, client, configuration);
    }

    static void upload(Client client, Configuration configuration, File file, String str, UpToken upToken, UpCompletionHandler upCompletionHandler, UploadOptions uploadOptions) {
        post((byte[]) null, file, str, upToken, upCompletionHandler, uploadOptions, client, configuration);
    }

    private static void post(byte[] bArr, File file, String str, UpToken upToken, UpCompletionHandler upCompletionHandler, UploadOptions uploadOptions, Client client, Configuration configuration) {
        final UploadOptions uploadOptions2;
        File file2 = file;
        final String str2 = str;
        UpToken upToken2 = upToken;
        StringMap stringMap = new StringMap();
        PostArgs postArgs = new PostArgs();
        if (str2 != null) {
            stringMap.put("key", str2);
            postArgs.fileName = str2;
        } else {
            postArgs.fileName = "?";
        }
        if (file2 != null) {
            postArgs.fileName = file.getName();
        }
        stringMap.put("token", upToken2.token);
        if (uploadOptions != null) {
            uploadOptions2 = uploadOptions;
        } else {
            uploadOptions2 = UploadOptions.defaultOptions();
        }
        stringMap.putFileds(uploadOptions2.params);
        if (uploadOptions2.checkCrc) {
            long j = 0;
            if (file2 != null) {
                try {
                    j = Crc32.file(file);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                j = Crc32.bytes(bArr);
            }
            stringMap.put("crc32", "" + j);
        }
        AnonymousClass1 r0 = new ProgressHandler() {
            public void onProgress(int i, int i2) {
                double d = (double) i;
                double d2 = (double) i2;
                Double.isNaN(d);
                Double.isNaN(d2);
                double d3 = d / d2;
                if (d3 > 0.95d) {
                    d3 = 0.95d;
                }
                uploadOptions2.progressHandler.progress(str2, d3);
            }
        };
        postArgs.data = bArr;
        postArgs.file = file2;
        postArgs.mimeType = uploadOptions2.mimeType;
        postArgs.params = stringMap;
        final UploadOptions uploadOptions3 = uploadOptions2;
        final UpCompletionHandler upCompletionHandler2 = upCompletionHandler;
        final String str3 = str;
        final UpToken upToken3 = upToken;
        final Configuration configuration2 = configuration;
        final Client client2 = client;
        final PostArgs postArgs2 = postArgs;
        final AnonymousClass1 r9 = r0;
        AnonymousClass2 r1 = new CompletionHandler() {
            public void complete(ResponseInfo responseInfo, JSONObject jSONObject) {
                if (responseInfo.isNetworkBroken() && !AndroidNetwork.isNetWorkReady()) {
                    uploadOptions3.netReadyHandler.waitReady();
                    if (!AndroidNetwork.isNetWorkReady()) {
                        upCompletionHandler2.complete(str3, responseInfo, jSONObject);
                        return;
                    }
                }
                if (responseInfo.isOK()) {
                    uploadOptions3.progressHandler.progress(str3, 1.0d);
                    upCompletionHandler2.complete(str3, responseInfo, jSONObject);
                } else if (uploadOptions3.cancellationSignal.isCancelled()) {
                    upCompletionHandler2.complete(str3, ResponseInfo.cancelled(), (JSONObject) null);
                } else if (responseInfo.needRetry() || (responseInfo.isNotQiniu() && !upToken3.hasReturnUrl())) {
                    AnonymousClass1 r6 = new CompletionHandler() {
                        public void complete(ResponseInfo responseInfo, JSONObject jSONObject) {
                            if (responseInfo.isOK()) {
                                uploadOptions3.progressHandler.progress(str3, 1.0d);
                            }
                            upCompletionHandler2.complete(str3, responseInfo, jSONObject);
                        }
                    };
                    URI uri = configuration2.zone.upHost(upToken3.token).address;
                    if (configuration2.zone.upHostBackup(upToken3.token) != null && (responseInfo.needSwitchServer() || responseInfo.isNotQiniu())) {
                        uri = configuration2.zone.upHostBackup(upToken3.token).address;
                    }
                    client2.asyncMultipartPost(uri.toString(), postArgs2, r9, r6, uploadOptions3.cancellationSignal);
                } else {
                    upCompletionHandler2.complete(str3, responseInfo, jSONObject);
                }
            }
        };
        client.asyncMultipartPost(configuration.zone.upHost(upToken2.token).address.toString(), postArgs, r0, r1, uploadOptions2.cancellationSignal);
    }
}
