package com.xp.wx.util;

import com.xp.wx.backend.helper.RemoteHelper;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0002\u0014\u0015BA\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\n\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\"\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/xp/wx/util/DownloadClient;", "", "url", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "filePath", "callback", "Lcom/xp/wx/util/DownloadClient$DownloadCallback;", "(Ljava/util/ArrayList;Ljava/util/ArrayList;Lcom/xp/wx/util/DownloadClient$DownloadCallback;)V", "mCallback", "mDownloadType", "", "mFilePaths", "mUrls", "checkValidity", "", "downloadWithFile", "filterExistsFile", "", "Companion", "DownloadCallback", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: DownloadClient.kt */
public final class DownloadClient {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int TYPE_BYTE_CODE = 1;
    public static final int TYPE_FILE = 0;
    private DownloadCallback mCallback;
    private int mDownloadType;
    private ArrayList<String> mFilePaths;
    private ArrayList<String> mUrls;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032&\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005j\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u0007H&¨\u0006\b"}, d2 = {"Lcom/xp/wx/util/DownloadClient$DownloadCallback;", "", "onDownloadFinished", "", "result", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "app_release"}, k = 1, mv = {1, 1, 13})
    /* compiled from: DownloadClient.kt */
    public interface DownloadCallback {
        void onDownloadFinished(HashMap<String, Object> hashMap);
    }

    public DownloadClient(ArrayList<String> arrayList, ArrayList<String> arrayList2, DownloadCallback downloadCallback) {
        Intrinsics.checkParameterIsNotNull(arrayList, "url");
        Intrinsics.checkParameterIsNotNull(downloadCallback, "callback");
        this.mUrls = arrayList;
        this.mFilePaths = arrayList2;
        this.mCallback = downloadCallback;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/xp/wx/util/DownloadClient$Companion;", "", "()V", "TYPE_BYTE_CODE", "", "TYPE_FILE", "app_release"}, k = 1, mv = {1, 1, 13})
    /* compiled from: DownloadClient.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ void downloadWithFile$default(DownloadClient downloadClient, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        downloadClient.downloadWithFile(z);
    }

    public final void downloadWithFile(boolean z) {
        checkValidity();
        RemoteHelper remoteHelper = RemoteHelper.INSTANCE;
        ArrayList<String> arrayList = this.mUrls;
        ArrayList<String> arrayList2 = this.mFilePaths;
        if (arrayList2 == null) {
            Intrinsics.throwNpe();
        }
        remoteHelper.downloadFiles(arrayList, arrayList2, z, this.mCallback);
    }

    private final void checkValidity() {
        if (this.mUrls.size() == 0) {
            throw new IllegalArgumentException("Empty url list!");
        } else if (this.mDownloadType == 0) {
            if (this.mFilePaths != null) {
                int size = this.mUrls.size();
                ArrayList<String> arrayList = this.mFilePaths;
                if (arrayList == null) {
                    Intrinsics.throwNpe();
                }
                if (size != arrayList.size()) {
                    throw new IllegalArgumentException("url and filePath must be the same length!");
                }
                return;
            }
            throw new IllegalArgumentException("file path can't be null!");
        }
    }
}
