package com.xp.wx.util;

import android.support.v4.app.NotificationCompat;
import java.math.BigInteger;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007J\u001b\u0010\n\u001a\u0004\u0018\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f¢\u0006\u0002\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u0011\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\"\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013J\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0016J\u0010\u0010\u001b\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001eJ\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00132\b\u0010 \u001a\u0004\u0018\u00010\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0013J\u001c\u0010!\u001a\u0004\u0018\u00010\u00132\b\u0010 \u001a\u0004\u0018\u00010\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0013R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/xp/wx/util/MessageUtil;", "", "()V", "TWO_64", "Ljava/math/BigInteger;", "kotlin.jvm.PlatformType", "applyEasterEgg", "", "str", "easter_egg", "argsToString", "args", "", "([Ljava/lang/Object;)Ljava/lang/String;", "bundleToString", "bundle", "Landroid/os/Bundle;", "bytesToHexString", "arg", "", "decodeMsgSize", "Lkotlin/Pair;", "", "start", "msg", "encodeMsgSize", "msgSize", "hexStringToBytes", "longToDecimalString", "l", "", "notifyCommentDelete", "head", "notifyInfoDelete", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: MessageUtil.kt */
public final class MessageUtil {
    public static final MessageUtil INSTANCE = new MessageUtil();
    private static final BigInteger TWO_64 = BigInteger.ONE.shiftLeft(64);

    public final byte[] encodeMsgSize(int i) {
        int i2 = i >> 7;
        if (i2 > 0) {
            return new byte[]{(byte) ((i & 127) | 128), (byte) i2};
        }
        return new byte[]{(byte) i};
    }

    private MessageUtil() {
    }

    public final String applyEasterEgg(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "str");
        Intrinsics.checkParameterIsNotNull(str2, "easter_egg");
        return StringsKt.take(str, StringsKt.indexOf$default((CharSequence) str, "\"", 1, false, 4, (Object) null) + 1) + ' ' + str2;
    }

    public final byte[] notifyInfoDelete(String str, byte[] bArr) {
        if (str == null || bArr == null) {
            return null;
        }
        int indexOf = ArraysKt.indexOf(bArr, (byte) 42) + 1;
        Pair<Integer, Integer> decodeMsgSize = decodeMsgSize(indexOf, bArr);
        int intValue = decodeMsgSize.component1().intValue();
        int intValue2 = decodeMsgSize.component2().intValue();
        int i = intValue + indexOf;
        if (StringsKt.startsWith$default(new String(ArraysKt.sliceArray(bArr, new IntRange(i, bArr.length)), Charsets.UTF_8), str, false, 2, (Object) null)) {
            return bArr;
        }
        String str2 = str + ' ';
        Charset charset = Charsets.UTF_8;
        if (str2 != null) {
            byte[] bytes = str2.getBytes(charset);
            Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
            byte[] plus = ArraysKt.plus(ArraysKt.copyOfRange(bArr, 0, indexOf), encodeMsgSize(bytes.length + intValue2));
            String str3 = str + ' ';
            Charset charset2 = Charsets.UTF_8;
            if (str3 != null) {
                byte[] bytes2 = str3.getBytes(charset2);
                Intrinsics.checkExpressionValueIsNotNull(bytes2, "(this as java.lang.String).getBytes(charset)");
                return ArraysKt.plus(ArraysKt.plus(plus, bytes2), ArraysKt.copyOfRange(bArr, i, bArr.length));
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public final byte[] notifyCommentDelete(String str, byte[] bArr) {
        if (str == null || bArr == null) {
            return null;
        }
        int indexOf = ArraysKt.indexOf(bArr, (byte) 34);
        int i = indexOf + bArr[indexOf + 1] + 13;
        Pair<Integer, Integer> decodeMsgSize = decodeMsgSize(i, bArr);
        int intValue = decodeMsgSize.component1().intValue();
        int intValue2 = decodeMsgSize.component2().intValue();
        int i2 = intValue + i;
        if (StringsKt.startsWith$default(new String(ArraysKt.sliceArray(bArr, new IntRange(i2, bArr.length)), Charsets.UTF_8), str, false, 2, (Object) null)) {
            return bArr;
        }
        String str2 = str + ' ';
        Charset charset = Charsets.UTF_8;
        if (str2 != null) {
            byte[] bytes = str2.getBytes(charset);
            Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
            byte[] plus = ArraysKt.plus(ArraysKt.copyOfRange(bArr, 0, i), encodeMsgSize(bytes.length + intValue2));
            String str3 = str + ' ';
            Charset charset2 = Charsets.UTF_8;
            if (str3 != null) {
                byte[] bytes2 = str3.getBytes(charset2);
                Intrinsics.checkExpressionValueIsNotNull(bytes2, "(this as java.lang.String).getBytes(charset)");
                return ArraysKt.plus(ArraysKt.plus(plus, bytes2), ArraysKt.copyOfRange(bArr, i2, bArr.length));
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public final String argsToString(Object[] objArr) {
        String str;
        if (objArr != null) {
            str = ArraysKt.joinToString$default(objArr, (CharSequence) ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
        } else {
            str = null;
        }
        return '{' + str + '}';
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = r11.keySet();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String bundleToString(android.os.Bundle r11) {
        /*
            r10 = this;
            if (r11 == 0) goto L_0x0024
            java.util.Set r0 = r11.keySet()
            if (r0 == 0) goto L_0x0024
            r1 = r0
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.String r0 = ", "
            r2 = r0
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            com.xp.wx.util.MessageUtil$bundleToString$str$1 r0 = new com.xp.wx.util.MessageUtil$bundleToString$str$1
            r0.<init>(r11)
            r7 = r0
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            r8 = 30
            r9 = 0
            java.lang.String r11 = kotlin.collections.CollectionsKt.joinToString$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0025
        L_0x0024:
            r11 = 0
        L_0x0025:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            r0.append(r11)
            r11 = 125(0x7d, float:1.75E-43)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.util.MessageUtil.bundleToString(android.os.Bundle):java.lang.String");
    }

    public final String longToDecimalString(long j) {
        BigInteger valueOf = BigInteger.valueOf(j);
        if (valueOf.signum() < 0) {
            valueOf = valueOf.add(TWO_64);
        }
        String bigInteger = valueOf.toString();
        Intrinsics.checkExpressionValueIsNotNull(bigInteger, "b.toString()");
        return bigInteger;
    }

    public final String bytesToHexString(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        return ArraysKt.joinToString$default(bArr, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) MessageUtil$bytesToHexString$1.INSTANCE, 30, (Object) null);
    }

    public final byte[] hexStringToBytes(String str) {
        if (str != null) {
            if (!(str.length() == 0)) {
                return ArraysKt.plus(new byte[]{(byte) Integer.parseInt(StringsKt.slice(str, new IntRange(0, 1)), 16)}, hexStringToBytes(StringsKt.drop(str, 2)));
            }
        }
        return new byte[0];
    }

    public final Pair<Integer, Integer> decodeMsgSize(int i, byte[] bArr) {
        Intrinsics.checkParameterIsNotNull(bArr, NotificationCompat.CATEGORY_MESSAGE);
        byte b = bArr[i];
        int i2 = 1;
        int i3 = b;
        if (b < 0) {
            i3 = (b & ByteCompanionObject.MAX_VALUE) + (bArr[i + 1] << 7);
            i2 = 2;
        }
        return new Pair<>(Integer.valueOf(i2), Integer.valueOf(i3));
    }
}
