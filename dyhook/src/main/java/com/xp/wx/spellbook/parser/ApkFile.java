package com.xp.wx.spellbook.parser;

import java.io.Closeable;
import java.io.File;
import java.util.Arrays;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u001b\u0010\b\u001a\u00020\t8FX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/xp/wx/spellbook/parser/ApkFile;", "Ljava/io/Closeable;", "path", "", "(Ljava/lang/String;)V", "apkFile", "Ljava/io/File;", "(Ljava/io/File;)V", "classTypes", "Lcom/xp/wx/spellbook/parser/ClassTrie;", "getClassTypes", "()Lcom/xp/wx/spellbook/parser/ClassTrie;", "classTypes$delegate", "Lkotlin/Lazy;", "zipFile", "Ljava/util/zip/ZipFile;", "close", "", "getDexFilePath", "idx", "", "isDexFileExist", "", "readDexFile", "", "readEntry", "entry", "Ljava/util/zip/ZipEntry;", "Companion", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: ApkFile.kt */
public final class ApkFile implements Closeable {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ApkFile.class), "classTypes", "getClassTypes()Lcom/xp/wx/spellbook/parser/ClassTrie;"))};
    @Deprecated
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String DEX_ADDITIONAL = "classes%d.dex";
    private static final String DEX_FILE = "classes.dex";
    private final Lazy classTypes$delegate;
    private final ZipFile zipFile;

    public final ClassTrie getClassTypes() {
        Lazy lazy = this.classTypes$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (ClassTrie) lazy.getValue();
    }

    public ApkFile(File file) {
        Intrinsics.checkParameterIsNotNull(file, "apkFile");
        this.zipFile = new ZipFile(file);
        this.classTypes$delegate = LazyKt.lazy(new ApkFile$classTypes$2(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/xp/wx/spellbook/parser/ApkFile$Companion;", "", "()V", "DEX_ADDITIONAL", "", "DEX_FILE", "app_release"}, k = 1, mv = {1, 1, 13})
    /* compiled from: ApkFile.kt */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ApkFile(String str) {
        this(new File(str));
        Intrinsics.checkParameterIsNotNull(str, "path");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        kotlin.io.CloseableKt.closeFinally(r4, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final byte[] readEntry(java.util.zip.ZipEntry r4) {
        /*
            r3 = this;
            java.util.zip.ZipFile r0 = r3.zipFile
            java.io.InputStream r4 = r0.getInputStream(r4)
            java.io.Closeable r4 = (java.io.Closeable) r4
            r0 = 0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1 = r4
            java.io.InputStream r1 = (java.io.InputStream) r1     // Catch:{ all -> 0x001b }
            java.lang.String r2 = "it"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)     // Catch:{ all -> 0x001b }
            byte[] r1 = kotlin.io.ByteStreamsKt.readBytes(r1)     // Catch:{ all -> 0x001b }
            kotlin.io.CloseableKt.closeFinally(r4, r0)
            return r1
        L_0x001b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x001d }
        L_0x001d:
            r1 = move-exception
            kotlin.io.CloseableKt.closeFinally(r4, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.spellbook.parser.ApkFile.readEntry(java.util.zip.ZipEntry):byte[]");
    }

    public void close() {
        this.zipFile.close();
    }

    private final String getDexFilePath(int i) {
        if (i == 1) {
            return DEX_FILE;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(DEX_ADDITIONAL, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
        return format;
    }

    /* access modifiers changed from: private */
    public final boolean isDexFileExist(int i) {
        return this.zipFile.getEntry(getDexFilePath(i)) != null;
    }

    /* access modifiers changed from: private */
    public final byte[] readDexFile(int i) {
        ZipEntry entry = this.zipFile.getEntry(getDexFilePath(i));
        Intrinsics.checkExpressionValueIsNotNull(entry, "zipFile.getEntry(path)");
        return readEntry(entry);
    }
}
