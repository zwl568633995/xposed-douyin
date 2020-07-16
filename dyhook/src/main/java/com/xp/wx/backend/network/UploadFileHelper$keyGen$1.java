package com.xp.wx.backend.network;

import com.qiniu.android.storage.KeyGenerator;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "key", "kotlin.jvm.PlatformType", "file", "Ljava/io/File;", "gen"}, k = 3, mv = {1, 1, 13})
/* compiled from: UploadFileHelper.kt */
final class UploadFileHelper$keyGen$1 implements KeyGenerator {
    public static final UploadFileHelper$keyGen$1 INSTANCE = new UploadFileHelper$keyGen$1();

    UploadFileHelper$keyGen$1() {
    }

    public final String gen(String str, File file) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_._");
        Intrinsics.checkExpressionValueIsNotNull(file, "file");
        sb.append(new StringBuffer(file.getAbsolutePath()).reverse());
        return sb.toString();
    }
}
