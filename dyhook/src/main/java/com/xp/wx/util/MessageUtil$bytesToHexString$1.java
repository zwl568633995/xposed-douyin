package com.xp.wx.util;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0005\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 1, 13})
/* compiled from: MessageUtil.kt */
final class MessageUtil$bytesToHexString$1 extends Lambda implements Function1<Byte, String> {
    public static final MessageUtil$bytesToHexString$1 INSTANCE = new MessageUtil$bytesToHexString$1();

    MessageUtil$bytesToHexString$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).byteValue());
    }

    public final String invoke(byte b) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
        return format;
    }
}
