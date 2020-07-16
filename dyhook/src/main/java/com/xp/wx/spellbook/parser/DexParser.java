package com.xp.wx.spellbook.parser;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.UInt;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0010\u0012\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\nH\u0002J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\nH\u0002J\"\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\"\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001bJ\b\u0010 \u001a\u00020\nH\u0002J\u0014\u0010!\u001a\u00020\"*\u00020\u00032\u0006\u0010#\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Lcom/xp/wx/spellbook/parser/DexParser;", "", "buffer", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)V", "parseClassTypes", "", "", "()[Ljava/lang/String;", "readClassIds", "", "classDefsOff", "Lkotlin/UInt;", "classDefsSize", "readClassIds-V7xB4Y4", "(II)[Ljava/lang/Integer;", "readDexHeader", "Lcom/xp/wx/spellbook/parser/DexHeader;", "readString", "len", "readStringAtOffset", "offset", "readStringOffsets", "", "stringIdsOff", "stringIdsSize", "readStringOffsets-V7xB4Y4", "(II)[I", "readTypeIds", "typeIdsOff", "typeIdsSize", "readTypeIds-V7xB4Y4", "readULEB128Int", "readBytes", "", "size", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: DexParser.kt */
public final class DexParser {
    private final ByteBuffer buffer;

    public DexParser(ByteBuffer byteBuffer) {
        Intrinsics.checkParameterIsNotNull(byteBuffer, "buffer");
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.order(ByteOrder.LITTLE_ENDIAN);
        Intrinsics.checkExpressionValueIsNotNull(duplicate, "buffer.duplicate().apply…rder.LITTLE_ENDIAN)\n    }");
        this.buffer = duplicate;
    }

    private final byte[] readBytes(ByteBuffer byteBuffer, int i) {
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return bArr;
    }

    public final String[] parseClassTypes() {
        String str = new String(readBytes(this.buffer, 8), Charsets.UTF_8);
        if (!StringsKt.startsWith$default(str, "dex\n", false, 2, (Object) null)) {
            return new String[0];
        }
        String substring = str.substring(4, 7);
        Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        int parseInt = Integer.parseInt(substring);
        if (parseInt >= 35) {
            DexHeader readDexHeader = readDexHeader();
            readDexHeader.setVersion(parseInt);
            int[] r1 = m75readStringOffsetsV7xB4Y4(readDexHeader.getStringIdsOff(), readDexHeader.getStringIdsSize());
            int[] r3 = m76readTypeIdsV7xB4Y4(readDexHeader.getTypeIdsOff(), readDexHeader.getTypeIdsSize());
            Integer[] r2 = m74readClassIdsV7xB4Y4(readDexHeader.getClassDefsOff(), readDexHeader.getClassDefsSize());
            int length = r2.length;
            String[] strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = readStringAtOffset(r1[r3[r2[i].intValue()]]);
            }
            return strArr;
        }
        throw new Exception("Dex file version: " + parseInt + " is not supported");
    }

    private final DexHeader readDexHeader() {
        DexHeader dexHeader = new DexHeader();
        dexHeader.m60setChecksumWZ4Q5Ns(UInt.m163constructorimpl(this.buffer.getInt()));
        this.buffer.get(dexHeader.getSignature());
        dexHeader.m65setFileSizeWZ4Q5Ns(UInt.m163constructorimpl(this.buffer.getInt()));
        dexHeader.m66setHeaderSizeWZ4Q5Ns(UInt.m163constructorimpl(this.buffer.getInt()));
        dexHeader.m63setEndianTagWZ4Q5Ns(UInt.m163constructorimpl(this.buffer.getInt()));
        dexHeader.m68setLinkSizeWZ4Q5Ns(UInt.m163constructorimpl(this.buffer.getInt()));
        dexHeader.m67setLinkOffWZ4Q5Ns(UInt.m163constructorimpl(this.buffer.getInt()));
        dexHeader.m69setMapOffWZ4Q5Ns(UInt.m163constructorimpl(this.buffer.getInt()));
        dexHeader.setStringIdsSize(this.buffer.getInt());
        dexHeader.m72setStringIdsOffWZ4Q5Ns(UInt.m163constructorimpl(this.buffer.getInt()));
        dexHeader.setTypeIdsSize(this.buffer.getInt());
        dexHeader.m73setTypeIdsOffWZ4Q5Ns(UInt.m163constructorimpl(this.buffer.getInt()));
        dexHeader.setProtoIdsSize(this.buffer.getInt());
        dexHeader.m71setProtoIdsOffWZ4Q5Ns(UInt.m163constructorimpl(this.buffer.getInt()));
        dexHeader.setFieldIdsSize(this.buffer.getInt());
        dexHeader.m64setFieldIdsOffWZ4Q5Ns(UInt.m163constructorimpl(this.buffer.getInt()));
        dexHeader.setMethodIdsSize(this.buffer.getInt());
        dexHeader.m70setMethodIdsOffWZ4Q5Ns(UInt.m163constructorimpl(this.buffer.getInt()));
        dexHeader.setClassDefsSize(this.buffer.getInt());
        dexHeader.m61setClassDefsOffWZ4Q5Ns(UInt.m163constructorimpl(this.buffer.getInt()));
        dexHeader.setDataSize(this.buffer.getInt());
        dexHeader.m62setDataOffWZ4Q5Ns(UInt.m163constructorimpl(this.buffer.getInt()));
        return dexHeader;
    }

    /* renamed from: readStringOffsets-V7xB4Y4  reason: not valid java name */
    private final int[] m75readStringOffsetsV7xB4Y4(int i, int i2) {
        ByteBuffer byteBuffer = this.buffer;
        if (byteBuffer != null) {
            byteBuffer.position(i);
            int[] iArr = new int[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                iArr[i3] = this.buffer.getInt();
            }
            return iArr;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.nio.Buffer");
    }

    /* renamed from: readTypeIds-V7xB4Y4  reason: not valid java name */
    private final int[] m76readTypeIdsV7xB4Y4(int i, int i2) {
        ByteBuffer byteBuffer = this.buffer;
        if (byteBuffer != null) {
            byteBuffer.position(i);
            int[] iArr = new int[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                iArr[i3] = this.buffer.getInt();
            }
            return iArr;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.nio.Buffer");
    }

    /* renamed from: readClassIds-V7xB4Y4  reason: not valid java name */
    private final Integer[] m74readClassIdsV7xB4Y4(int i, int i2) {
        ByteBuffer byteBuffer = this.buffer;
        if (byteBuffer != null) {
            byteBuffer.position(i);
            Integer[] numArr = new Integer[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = this.buffer.getInt();
                this.buffer.getInt();
                this.buffer.getInt();
                this.buffer.getInt();
                this.buffer.getInt();
                this.buffer.getInt();
                this.buffer.getInt();
                this.buffer.getInt();
                numArr[i3] = Integer.valueOf(i4);
            }
            return numArr;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.nio.Buffer");
    }

    private final String readStringAtOffset(int i) {
        ByteBuffer byteBuffer = this.buffer;
        if (byteBuffer != null) {
            byteBuffer.position(i);
            return readString(readULEB128Int());
        }
        throw new TypeCastException("null cannot be cast to non-null type java.nio.Buffer");
    }

    private final int readULEB128Int() {
        int i = 0;
        int i2 = 0;
        while (i <= 4) {
            byte b = this.buffer.get();
            i2 |= (b & ByteCompanionObject.MAX_VALUE) << (i * 7);
            i++;
            if ((b & ByteCompanionObject.MIN_VALUE) == 0) {
                return i2;
            }
        }
        throw new Exception("read varints error.");
    }

    private final String readString(int i) {
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            byte b = this.buffer.get();
            if ((b & ByteCompanionObject.MIN_VALUE) == 0) {
                cArr[i2] = (char) b;
            } else if ((b & 224) == 192) {
                cArr[i2] = (char) (((b & 31) << 6) | (this.buffer.get() & 63));
            } else if ((b & 240) == 224) {
                cArr[i2] = (char) (((b & 15) << 12) | ((this.buffer.get() & 63) << 6) | (this.buffer.get() & 63));
            }
        }
        return new String(cArr);
    }
}
