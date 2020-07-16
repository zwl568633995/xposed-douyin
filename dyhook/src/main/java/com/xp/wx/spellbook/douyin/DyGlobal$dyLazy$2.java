package com.xp.wx.spellbook.douyin;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 1, 13})
/* compiled from: DyGlobal.kt */
public final class DyGlobal$dyLazy$2 extends Lambda implements Function0<T> {
    final /* synthetic */ Function0 $initializer;
    final /* synthetic */ String $name;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DyGlobal$dyLazy$2(Function0 function0, String str) {
        super(0);
        this.$initializer = function0;
        this.$name = str;
    }

    public final T invoke() {
        if (DyGlobal.INSTANCE.getDyVersion() == null) {
            throw new Error("Invalid wxVersion");
        } else if (DyGlobal.INSTANCE.getDyPackageName() == null) {
            throw new Error("Invalid wxPackageName");
        } else if (DyGlobal.INSTANCE.getDyLoader() == null) {
            throw new Error("Invalid wxLoader");
        } else if (DyGlobal.INSTANCE.getDyClasses() != null) {
            T invoke = this.$initializer.invoke();
            if (invoke != null) {
                return invoke;
            }
            throw new Error("Failed to evaluate " + this.$name);
        } else {
            throw new Error("Invalid wxClasses");
        }
    }
}
