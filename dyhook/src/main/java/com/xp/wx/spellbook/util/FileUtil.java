package com.xp.wx.spellbook.util;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0007J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0004H\u0007J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000bH\u0007J\"\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007J\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J%\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u001cH\b¨\u0006\u001d"}, d2 = {"Lcom/xp/wx/spellbook/util/FileUtil;", "", "()V", "createTimeTag", "", "notifyNewMediaFile", "", "path", "context", "Landroid/content/Context;", "readBytesFromDisk", "", "readObjectFromDisk", "writeBitmapToDisk", "bitmap", "Landroid/graphics/Bitmap;", "writeBytesToDisk", "content", "writeInputStreamToDisk", "ins", "Ljava/io/InputStream;", "bufferSize", "", "writeObjectToDisk", "obj", "Ljava/io/Serializable;", "writeOnce", "writeCallback", "Lkotlin/Function1;", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: FileUtil.kt */
public final class FileUtil {
    public static final FileUtil INSTANCE = new FileUtil();

    private FileUtil() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0035, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        kotlin.io.CloseableKt.closeFinally(r0, r2);
     */
    @kotlin.jvm.JvmStatic
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void writeBytesToDisk(java.lang.String r2, byte[] r3) {
        /*
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r0)
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            java.io.File r2 = r0.getParentFile()
            r2.mkdirs()
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            r2.<init>(r0)
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream
            java.io.OutputStream r2 = (java.io.OutputStream) r2
            r0.<init>(r2)
            java.io.Closeable r0 = (java.io.Closeable) r0
            r2 = 0
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r1 = r0
            java.io.BufferedOutputStream r1 = (java.io.BufferedOutputStream) r1     // Catch:{ all -> 0x0033 }
            r1.write(r3)     // Catch:{ all -> 0x0033 }
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0033 }
            kotlin.io.CloseableKt.closeFinally(r0, r2)
            return
        L_0x0033:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r3 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.spellbook.util.FileUtil.writeBytesToDisk(java.lang.String, byte[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        kotlin.io.CloseableKt.closeFinally(r2, r0);
     */
    @kotlin.jvm.JvmStatic
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] readBytesFromDisk(java.lang.String r2) {
        /*
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r0)
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r2)
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream
            java.io.InputStream r0 = (java.io.InputStream) r0
            r2.<init>(r0)
            java.io.Closeable r2 = (java.io.Closeable) r2
            r0 = 0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1 = r2
            java.io.BufferedInputStream r1 = (java.io.BufferedInputStream) r1     // Catch:{ all -> 0x0023 }
            java.io.InputStream r1 = (java.io.InputStream) r1     // Catch:{ all -> 0x0023 }
            byte[] r1 = kotlin.io.ByteStreamsKt.readBytes(r1)     // Catch:{ all -> 0x0023 }
            kotlin.io.CloseableKt.closeFinally(r2, r0)
            return r1
        L_0x0023:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r1 = move-exception
            kotlin.io.CloseableKt.closeFinally(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.spellbook.util.FileUtil.readBytesFromDisk(java.lang.String):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003a, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0036, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0037, code lost:
        kotlin.io.CloseableKt.closeFinally(r1, r4);
     */
    @kotlin.jvm.JvmStatic
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void writeObjectToDisk(java.lang.String r4, java.io.Serializable r5) {
        /*
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            java.lang.String r0 = "obj"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r0)
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.ObjectOutputStream r1 = new java.io.ObjectOutputStream
            r2 = r0
            java.io.OutputStream r2 = (java.io.OutputStream) r2
            r1.<init>(r2)
            java.io.Closeable r1 = (java.io.Closeable) r1
            r2 = 0
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r3 = r1
            java.io.ObjectOutputStream r3 = (java.io.ObjectOutputStream) r3     // Catch:{ all -> 0x0034 }
            r3.writeObject(r5)     // Catch:{ all -> 0x0034 }
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0034 }
            kotlin.io.CloseableKt.closeFinally(r1, r2)
            byte[] r5 = r0.toByteArray()
            java.lang.String r0 = "out.toByteArray()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r0)
            writeBytesToDisk(r4, r5)
            return
        L_0x0034:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0036 }
        L_0x0036:
            r5 = move-exception
            kotlin.io.CloseableKt.closeFinally(r1, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.spellbook.util.FileUtil.writeObjectToDisk(java.lang.String, java.io.Serializable):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        kotlin.io.CloseableKt.closeFinally(r2, r0);
     */
    @kotlin.jvm.JvmStatic
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object readObjectFromDisk(java.lang.String r2) {
        /*
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r0)
            byte[] r2 = readBytesFromDisk(r2)
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r2)
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream
            java.io.InputStream r0 = (java.io.InputStream) r0
            r2.<init>(r0)
            java.io.Closeable r2 = (java.io.Closeable) r2
            r0 = 0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1 = r2
            java.io.ObjectInputStream r1 = (java.io.ObjectInputStream) r1     // Catch:{ all -> 0x0025 }
            java.lang.Object r1 = r1.readObject()     // Catch:{ all -> 0x0025 }
            kotlin.io.CloseableKt.closeFinally(r2, r0)
            return r1
        L_0x0025:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0027 }
        L_0x0027:
            r1 = move-exception
            kotlin.io.CloseableKt.closeFinally(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.spellbook.util.FileUtil.readObjectFromDisk(java.lang.String):java.lang.Object");
    }

    @JvmStatic
    public static /* synthetic */ void writeInputStreamToDisk$default(String str, InputStream inputStream, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 8192;
        }
        writeInputStreamToDisk(str, inputStream, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        kotlin.io.CloseableKt.closeFinally(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
        throw r5;
     */
    @kotlin.jvm.JvmStatic
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void writeInputStreamToDisk(java.lang.String r4, java.io.InputStream r5, int r6) {
        /*
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            java.lang.String r0 = "ins"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r0)
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            java.io.File r4 = r0.getParentFile()
            r4.mkdirs()
            java.io.FileOutputStream r4 = new java.io.FileOutputStream
            r4.<init>(r0)
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream
            java.io.OutputStream r4 = (java.io.OutputStream) r4
            r0.<init>(r4)
            java.io.Closeable r0 = (java.io.Closeable) r0
            r4 = 0
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            r1 = r0
            java.io.BufferedOutputStream r1 = (java.io.BufferedOutputStream) r1     // Catch:{ all -> 0x0042 }
            byte[] r6 = new byte[r6]     // Catch:{ all -> 0x0042 }
            int r2 = r5.read(r6)     // Catch:{ all -> 0x0042 }
        L_0x0030:
            r3 = -1
            if (r2 == r3) goto L_0x003c
            r3 = 0
            r1.write(r6, r3, r2)     // Catch:{ all -> 0x0042 }
            int r2 = r5.read(r6)     // Catch:{ all -> 0x0042 }
            goto L_0x0030
        L_0x003c:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0042 }
            kotlin.io.CloseableKt.closeFinally(r0, r4)
            return
        L_0x0042:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r5 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r4)
            goto L_0x004a
        L_0x0049:
            throw r5
        L_0x004a:
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.spellbook.util.FileUtil.writeInputStreamToDisk(java.lang.String, java.io.InputStream, int):void");
    }

    @JvmStatic
    public static final void writeBitmapToDisk(String str, Bitmap bitmap) {
        Intrinsics.checkParameterIsNotNull(str, "path");
        Intrinsics.checkParameterIsNotNull(bitmap, "bitmap");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkExpressionValueIsNotNull(byteArray, "out.toByteArray()");
        writeBytesToDisk(str, byteArray);
    }

    @JvmStatic
    public static final void writeOnce(String str, Function1<? super String, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(str, "path");
        Intrinsics.checkParameterIsNotNull(function1, "writeCallback");
        File file = new File(str);
        if (!file.exists()) {
            function1.invoke(str);
            return;
        }
        if (file.lastModified() < System.currentTimeMillis() - SystemClock.elapsedRealtime()) {
            function1.invoke(str);
        }
    }

    @JvmStatic
    public static final String createTimeTag() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmss", Locale.getDefault());
        Calendar instance = Calendar.getInstance();
        Intrinsics.checkExpressionValueIsNotNull(instance, "Calendar.getInstance()");
        String format = simpleDateFormat.format(instance.getTime());
        Intrinsics.checkExpressionValueIsNotNull(format, "formatter.format(Calendar.getInstance().time)");
        return format;
    }

    @JvmStatic
    public static final void notifyNewMediaFile(String str, Context context) {
        Intrinsics.checkParameterIsNotNull(str, "path");
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        if (context != null) {
            intent.setData(Uri.fromFile(new File(str)));
            context.sendBroadcast(intent);
        }
    }
}
