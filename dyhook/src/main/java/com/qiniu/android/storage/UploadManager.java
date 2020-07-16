package com.qiniu.android.storage;

import com.qiniu.android.common.Zone;
import com.qiniu.android.http.Client;
import com.qiniu.android.http.ResponseInfo;
import com.qiniu.android.storage.Configuration;
import com.qiniu.android.utils.AsyncRun;
import java.io.File;
import org.json.JSONObject;

public final class UploadManager {
    /* access modifiers changed from: private */
    public final Client client;
    /* access modifiers changed from: private */
    public final Configuration config;

    public UploadManager() {
        this(new Configuration.Builder().build());
    }

    public UploadManager(Configuration configuration) {
        this.config = configuration;
        this.client = new Client(configuration.proxy, configuration.connectTimeout, configuration.responseTimeout, configuration.urlConverter, configuration.dns);
    }

    public UploadManager(Recorder recorder, KeyGenerator keyGenerator) {
        this(new Configuration.Builder().recorder(recorder, keyGenerator).build());
    }

    public UploadManager(Recorder recorder) {
        this(recorder, (KeyGenerator) null);
    }

    private static boolean areInvalidArg(final String str, byte[] bArr, File file, String str2, final UpCompletionHandler upCompletionHandler) {
        if (upCompletionHandler != null) {
            final ResponseInfo responseInfo = null;
            String str3 = (file == null && bArr == null) ? "no input data" : (str2 == null || str2.equals("")) ? "no token" : null;
            if (str3 != null) {
                responseInfo = ResponseInfo.invalidArgument(str3);
            }
            if ((file != null && file.length() == 0) || (bArr != null && bArr.length == 0)) {
                responseInfo = ResponseInfo.zeroSize();
            }
            if (responseInfo == null) {
                return false;
            }
            AsyncRun.runInMain(new Runnable() {
                public void run() {
                    upCompletionHandler.complete(str, responseInfo, (JSONObject) null);
                }
            });
            return true;
        }
        throw new IllegalArgumentException("no UpCompletionHandler");
    }

    public void put(byte[] bArr, String str, String str2, final UpCompletionHandler upCompletionHandler, UploadOptions uploadOptions) {
        if (!areInvalidArg(str, bArr, (File) null, str2, upCompletionHandler)) {
            final AnonymousClass2 r7 = new UpCompletionHandler() {
                public void complete(final String str, final ResponseInfo responseInfo, final JSONObject jSONObject) {
                    AsyncRun.runInMain(new Runnable() {
                        public void run() {
                            upCompletionHandler.complete(str, responseInfo, jSONObject);
                        }
                    });
                }
            };
            final UpToken parse = UpToken.parse(str2);
            if (parse == null) {
                r7.complete(str, ResponseInfo.invalidToken("invalid token"), (JSONObject) null);
                return;
            }
            final byte[] bArr2 = bArr;
            final String str3 = str;
            final UploadOptions uploadOptions2 = uploadOptions;
            this.config.zone.preQuery(str2, new Zone.QueryHandler() {
                public void onSuccess() {
                    AsyncRun.runInMain(new Runnable() {
                        public void run() {
                            FormUploader.upload(UploadManager.this.client, UploadManager.this.config, bArr2, str3, parse, r7, uploadOptions2);
                        }
                    });
                }

                public void onFailure(int i) {
                    r7.complete(str3, ResponseInfo.invalidToken("invalid token"), (JSONObject) null);
                }
            });
        }
    }

    public void put(String str, String str2, String str3, UpCompletionHandler upCompletionHandler, UploadOptions uploadOptions) {
        put(new File(str), str2, str3, upCompletionHandler, uploadOptions);
    }

    public void put(File file, String str, String str2, final UpCompletionHandler upCompletionHandler, UploadOptions uploadOptions) {
        if (!areInvalidArg(str, (byte[]) null, file, str2, upCompletionHandler)) {
            final AnonymousClass4 r7 = new UpCompletionHandler() {
                public void complete(final String str, final ResponseInfo responseInfo, final JSONObject jSONObject) {
                    AsyncRun.runInMain(new Runnable() {
                        public void run() {
                            upCompletionHandler.complete(str, responseInfo, jSONObject);
                        }
                    });
                }
            };
            final UpToken parse = UpToken.parse(str2);
            if (parse == null) {
                r7.complete(str, ResponseInfo.invalidToken("invalid token"), (JSONObject) null);
                return;
            }
            final File file2 = file;
            final String str3 = str;
            final UploadOptions uploadOptions2 = uploadOptions;
            this.config.zone.preQuery(str2, new Zone.QueryHandler() {
                public void onSuccess() {
                    if (file2.length() <= ((long) UploadManager.this.config.putThreshold)) {
                        FormUploader.upload(UploadManager.this.client, UploadManager.this.config, file2, str3, parse, r7, uploadOptions2);
                        return;
                    }
                    AsyncRun.runInMain(new ResumeUploader(UploadManager.this.client, UploadManager.this.config, file2, str3, parse, r7, uploadOptions2, UploadManager.this.config.keyGen.gen(str3, file2)));
                }

                public void onFailure(int i) {
                    r7.complete(str3, ResponseInfo.invalidToken("invalid token"), (JSONObject) null);
                }
            });
        }
    }
}
