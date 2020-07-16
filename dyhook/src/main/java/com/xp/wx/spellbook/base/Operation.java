package com.xp.wx.spellbook.base;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u0000 \u0014*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001\u0014B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/xp/wx/spellbook/base/Operation;", "T", "", "value", "error", "", "priority", "", "returnEarly", "", "(Ljava/lang/Object;Ljava/lang/Throwable;IZ)V", "getError", "()Ljava/lang/Throwable;", "getPriority", "()I", "getReturnEarly", "()Z", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "Companion", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: Operation.kt */
public final class Operation<T> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final Throwable error;
    private final int priority;
    private final boolean returnEarly;
    private final T value;

    public Operation() {
        this((Object) null, (Throwable) null, 0, false, 15, (DefaultConstructorMarker) null);
    }

    @JvmStatic
    public static final <T> Operation<T> interruption(Throwable th, int i) {
        return Companion.interruption(th, i);
    }

    @JvmStatic
    public static final <T> Operation<T> nop(int i) {
        return Companion.nop(i);
    }

    @JvmStatic
    public static final <T> Operation<T> replacement(T t, int i) {
        return Companion.replacement(t, i);
    }

    public Operation(T t, Throwable th, int i, boolean z) {
        this.value = t;
        this.error = th;
        this.priority = i;
        this.returnEarly = z;
    }

    public final T getValue() {
        return this.value;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Operation(Object obj, Throwable th, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : obj, (i2 & 2) != 0 ? null : th, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? false : z);
    }

    public final Throwable getError() {
        return this.error;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final boolean getReturnEarly() {
        return this.returnEarly;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\b\u0002\u0010\b\u001a\u00020\tH\u0007J+\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\f\u001a\u0002H\u00052\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/xp/wx/spellbook/base/Operation$Companion;", "", "()V", "interruption", "Lcom/xp/wx/spellbook/base/Operation;", "T", "error", "", "priority", "", "nop", "replacement", "value", "(Ljava/lang/Object;I)Lcom/xp/wx/spellbook/base/Operation;", "app_release"}, k = 1, mv = {1, 1, 13})
    /* compiled from: Operation.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ Operation nop$default(Companion companion, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = 0;
            }
            return companion.nop(i);
        }

        @JvmStatic
        public final <T> Operation<T> nop(int i) {
            return new Operation((Object) null, (Throwable) null, i, false, 11, (DefaultConstructorMarker) null);
        }

        @JvmStatic
        public static /* synthetic */ Operation interruption$default(Companion companion, Throwable th, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return companion.interruption(th, i);
        }

        @JvmStatic
        public final <T> Operation<T> interruption(Throwable th, int i) {
            Intrinsics.checkParameterIsNotNull(th, "error");
            return new Operation((Object) null, th, i, true, 1, (DefaultConstructorMarker) null);
        }

        @JvmStatic
        public static /* synthetic */ Operation replacement$default(Companion companion, Object obj, int i, int i2, Object obj2) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return companion.replacement(obj, i);
        }

        @JvmStatic
        public final <T> Operation<T> replacement(T t, int i) {
            return new Operation(t, (Throwable) null, i, true, 2, (DefaultConstructorMarker) null);
        }
    }
}
