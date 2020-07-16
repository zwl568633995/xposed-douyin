package com.xp.wx.spellbook.base;

import android.util.Log;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "T", "run", "com/xp/wx/spellbook/util/ParallelUtil$parallelForEach$1"}, k = 3, mv = {1, 1, 13})
/* compiled from: ParallelUtil.kt */
public final class EventCenter$notifyParallel$$inlined$parallelForEach$1 implements Runnable {
    final /* synthetic */ Function1 $action$inlined;
    final /* synthetic */ Object $item;

    public EventCenter$notifyParallel$$inlined$parallelForEach$1(Object obj, Function1 function1) {
        this.$item = obj;
        this.$action$inlined = function1;
    }

    public final void run() {
        try {
            this.$action$inlined.invoke(this.$item);
            Unit unit = Unit.INSTANCE;
        } catch (Throwable th) {
            Log.e("Xposed", Log.getStackTraceString(th));
            return;
        }
        Unit unit2 = Unit.INSTANCE;
    }
}
