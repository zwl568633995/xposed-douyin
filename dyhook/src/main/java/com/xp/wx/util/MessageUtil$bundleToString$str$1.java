package com.xp.wx.util;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 13})
/* compiled from: MessageUtil.kt */
final class MessageUtil$bundleToString$str$1 extends Lambda implements Function1<String, String> {
    final /* synthetic */ Bundle $bundle;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MessageUtil$bundleToString$str$1(Bundle bundle) {
        super(1);
        this.$bundle = bundle;
    }

    public final String invoke(String str) {
        return str + " = " + this.$bundle.get(str);
    }
}
