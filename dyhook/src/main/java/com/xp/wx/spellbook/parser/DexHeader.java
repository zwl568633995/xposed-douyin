package com.xp.wx.spellbook.parser;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b-\n\u0002\u0010\u0012\n\u0002\b\u0015\b\u0007\u0018\u0000 P2\u00020\u0001:\u0001PB\u0005¢\u0006\u0002\u0010\u0002R\u001f\u0010\u0003\u001a\u00020\u0004X\u000eø\u0001\u0000¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001f\u0010\n\u001a\u00020\u0004X\u000eø\u0001\u0000¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR\u001f\u0010\u0011\u001a\u00020\u0004X\u000eø\u0001\u0000¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\bR\u001a\u0010\u0014\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\bR\u001f\u0010\u0017\u001a\u00020\u0004X\u000eø\u0001\u0000¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bR\u001f\u0010\u001a\u001a\u00020\u0004X\u000eø\u0001\u0000¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\bR\u001a\u0010\u001d\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\bR\u001f\u0010 \u001a\u00020\u0004X\u000eø\u0001\u0000¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\bR\u001f\u0010#\u001a\u00020\u0004X\u000eø\u0001\u0000¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010\bR\u001f\u0010&\u001a\u00020\u0004X\u000eø\u0001\u0000¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b'\u0010\u0006\"\u0004\b(\u0010\bR\u001f\u0010)\u001a\u00020\u0004X\u000eø\u0001\u0000¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b*\u0010\u0006\"\u0004\b+\u0010\bR\u001f\u0010,\u001a\u00020\u0004X\u000eø\u0001\u0000¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b-\u0010\u0006\"\u0004\b.\u0010\bR\u001f\u0010/\u001a\u00020\u0004X\u000eø\u0001\u0000¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b0\u0010\u0006\"\u0004\b1\u0010\bR\u001a\u00102\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0006\"\u0004\b4\u0010\bR\u001f\u00105\u001a\u00020\u0004X\u000eø\u0001\u0000¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b6\u0010\u0006\"\u0004\b7\u0010\bR\u001a\u00108\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0006\"\u0004\b:\u0010\bR\u001a\u0010;\u001a\u00020<X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001f\u0010A\u001a\u00020\u0004X\u000eø\u0001\u0000¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\bB\u0010\u0006\"\u0004\bC\u0010\bR\u001a\u0010D\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u0006\"\u0004\bF\u0010\bR\u001f\u0010G\u001a\u00020\u0004X\u000eø\u0001\u0000¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\bH\u0010\u0006\"\u0004\bI\u0010\bR\u001a\u0010J\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u0006\"\u0004\bL\u0010\bR\u001a\u0010M\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u0006\"\u0004\bO\u0010\b\u0002\u0004\n\u0002\b\u0019¨\u0006Q"}, d2 = {"Lcom/xp/wx/spellbook/parser/DexHeader;", "", "()V", "checksum", "Lkotlin/UInt;", "getChecksum", "()I", "setChecksum-WZ4Q5Ns", "(I)V", "I", "classDefsOff", "getClassDefsOff", "setClassDefsOff-WZ4Q5Ns", "classDefsSize", "", "getClassDefsSize", "setClassDefsSize", "dataOff", "getDataOff", "setDataOff-WZ4Q5Ns", "dataSize", "getDataSize", "setDataSize", "endianTag", "getEndianTag", "setEndianTag-WZ4Q5Ns", "fieldIdsOff", "getFieldIdsOff", "setFieldIdsOff-WZ4Q5Ns", "fieldIdsSize", "getFieldIdsSize", "setFieldIdsSize", "fileSize", "getFileSize", "setFileSize-WZ4Q5Ns", "headerSize", "getHeaderSize", "setHeaderSize-WZ4Q5Ns", "linkOff", "getLinkOff", "setLinkOff-WZ4Q5Ns", "linkSize", "getLinkSize", "setLinkSize-WZ4Q5Ns", "mapOff", "getMapOff", "setMapOff-WZ4Q5Ns", "methodIdsOff", "getMethodIdsOff", "setMethodIdsOff-WZ4Q5Ns", "methodIdsSize", "getMethodIdsSize", "setMethodIdsSize", "protoIdsOff", "getProtoIdsOff", "setProtoIdsOff-WZ4Q5Ns", "protoIdsSize", "getProtoIdsSize", "setProtoIdsSize", "signature", "", "getSignature", "()[B", "setSignature", "([B)V", "stringIdsOff", "getStringIdsOff", "setStringIdsOff-WZ4Q5Ns", "stringIdsSize", "getStringIdsSize", "setStringIdsSize", "typeIdsOff", "getTypeIdsOff", "setTypeIdsOff-WZ4Q5Ns", "typeIdsSize", "getTypeIdsSize", "setTypeIdsSize", "version", "getVersion", "setVersion", "Companion", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: DexHeader.kt */
public final class DexHeader {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int kSHA1DigestLen = 20;
    public static final int kSHA1DigestOutputLen = 41;
    private int checksum;
    private int classDefsOff;
    private int classDefsSize;
    private int dataOff;
    private int dataSize;
    private int endianTag;
    private int fieldIdsOff;
    private int fieldIdsSize;
    private int fileSize;
    private int headerSize;
    private int linkOff;
    private int linkSize;
    private int mapOff;
    private int methodIdsOff;
    private int methodIdsSize;
    private int protoIdsOff;
    private int protoIdsSize;
    private byte[] signature = new byte[20];
    private int stringIdsOff;
    private int stringIdsSize;
    private int typeIdsOff;
    private int typeIdsSize;
    private int version;

    public final int getVersion() {
        return this.version;
    }

    public final void setVersion(int i) {
        this.version = i;
    }

    public final int getChecksum() {
        return this.checksum;
    }

    /* renamed from: setChecksum-WZ4Q5Ns  reason: not valid java name */
    public final void m60setChecksumWZ4Q5Ns(int i) {
        this.checksum = i;
    }

    public final byte[] getSignature() {
        return this.signature;
    }

    public final void setSignature(byte[] bArr) {
        Intrinsics.checkParameterIsNotNull(bArr, "<set-?>");
        this.signature = bArr;
    }

    public final int getFileSize() {
        return this.fileSize;
    }

    /* renamed from: setFileSize-WZ4Q5Ns  reason: not valid java name */
    public final void m65setFileSizeWZ4Q5Ns(int i) {
        this.fileSize = i;
    }

    public final int getHeaderSize() {
        return this.headerSize;
    }

    /* renamed from: setHeaderSize-WZ4Q5Ns  reason: not valid java name */
    public final void m66setHeaderSizeWZ4Q5Ns(int i) {
        this.headerSize = i;
    }

    public final int getEndianTag() {
        return this.endianTag;
    }

    /* renamed from: setEndianTag-WZ4Q5Ns  reason: not valid java name */
    public final void m63setEndianTagWZ4Q5Ns(int i) {
        this.endianTag = i;
    }

    public final int getLinkSize() {
        return this.linkSize;
    }

    /* renamed from: setLinkSize-WZ4Q5Ns  reason: not valid java name */
    public final void m68setLinkSizeWZ4Q5Ns(int i) {
        this.linkSize = i;
    }

    public final int getLinkOff() {
        return this.linkOff;
    }

    /* renamed from: setLinkOff-WZ4Q5Ns  reason: not valid java name */
    public final void m67setLinkOffWZ4Q5Ns(int i) {
        this.linkOff = i;
    }

    public final int getMapOff() {
        return this.mapOff;
    }

    /* renamed from: setMapOff-WZ4Q5Ns  reason: not valid java name */
    public final void m69setMapOffWZ4Q5Ns(int i) {
        this.mapOff = i;
    }

    public final int getStringIdsSize() {
        return this.stringIdsSize;
    }

    public final void setStringIdsSize(int i) {
        this.stringIdsSize = i;
    }

    public final int getStringIdsOff() {
        return this.stringIdsOff;
    }

    /* renamed from: setStringIdsOff-WZ4Q5Ns  reason: not valid java name */
    public final void m72setStringIdsOffWZ4Q5Ns(int i) {
        this.stringIdsOff = i;
    }

    public final int getTypeIdsSize() {
        return this.typeIdsSize;
    }

    public final void setTypeIdsSize(int i) {
        this.typeIdsSize = i;
    }

    public final int getTypeIdsOff() {
        return this.typeIdsOff;
    }

    /* renamed from: setTypeIdsOff-WZ4Q5Ns  reason: not valid java name */
    public final void m73setTypeIdsOffWZ4Q5Ns(int i) {
        this.typeIdsOff = i;
    }

    public final int getProtoIdsSize() {
        return this.protoIdsSize;
    }

    public final void setProtoIdsSize(int i) {
        this.protoIdsSize = i;
    }

    public final int getProtoIdsOff() {
        return this.protoIdsOff;
    }

    /* renamed from: setProtoIdsOff-WZ4Q5Ns  reason: not valid java name */
    public final void m71setProtoIdsOffWZ4Q5Ns(int i) {
        this.protoIdsOff = i;
    }

    public final int getFieldIdsSize() {
        return this.fieldIdsSize;
    }

    public final void setFieldIdsSize(int i) {
        this.fieldIdsSize = i;
    }

    public final int getFieldIdsOff() {
        return this.fieldIdsOff;
    }

    /* renamed from: setFieldIdsOff-WZ4Q5Ns  reason: not valid java name */
    public final void m64setFieldIdsOffWZ4Q5Ns(int i) {
        this.fieldIdsOff = i;
    }

    public final int getMethodIdsSize() {
        return this.methodIdsSize;
    }

    public final void setMethodIdsSize(int i) {
        this.methodIdsSize = i;
    }

    public final int getMethodIdsOff() {
        return this.methodIdsOff;
    }

    /* renamed from: setMethodIdsOff-WZ4Q5Ns  reason: not valid java name */
    public final void m70setMethodIdsOffWZ4Q5Ns(int i) {
        this.methodIdsOff = i;
    }

    public final int getClassDefsSize() {
        return this.classDefsSize;
    }

    public final void setClassDefsSize(int i) {
        this.classDefsSize = i;
    }

    public final int getClassDefsOff() {
        return this.classDefsOff;
    }

    /* renamed from: setClassDefsOff-WZ4Q5Ns  reason: not valid java name */
    public final void m61setClassDefsOffWZ4Q5Ns(int i) {
        this.classDefsOff = i;
    }

    public final int getDataSize() {
        return this.dataSize;
    }

    public final void setDataSize(int i) {
        this.dataSize = i;
    }

    public final int getDataOff() {
        return this.dataOff;
    }

    /* renamed from: setDataOff-WZ4Q5Ns  reason: not valid java name */
    public final void m62setDataOffWZ4Q5Ns(int i) {
        this.dataOff = i;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/xp/wx/spellbook/parser/DexHeader$Companion;", "", "()V", "kSHA1DigestLen", "", "kSHA1DigestOutputLen", "app_release"}, k = 1, mv = {1, 1, 13})
    /* compiled from: DexHeader.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
