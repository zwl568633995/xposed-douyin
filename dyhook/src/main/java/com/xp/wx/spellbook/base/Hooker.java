package com.xp.wx.spellbook.base;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\r\u001a\u00020\u0004R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xp/wx/spellbook/base/Hooker;", "", "hooker", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "<set-?>", "", "hasHooked", "getHasHooked", "()Z", "setHasHooked", "(Z)V", "hook", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: Hooker.kt */
public final class Hooker {
    private boolean hasHooked;
    private final Function0<Unit> hooker;

    public Hooker(Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "hooker");
        this.hooker = function0;
    }

    private final void setHasHooked(boolean z) {
        this.hasHooked = z;
    }

    public final boolean getHasHooked() {
        return this.hasHooked;
    }

    public final synchronized void hook() {
        if (!this.hasHooked) {
            this.hooker.invoke();
            this.hasHooked = true;
        }
    }
}
