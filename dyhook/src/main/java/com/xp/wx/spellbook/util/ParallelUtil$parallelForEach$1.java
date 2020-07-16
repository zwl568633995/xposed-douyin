package com.xp.wx.spellbook.util;

import android.util.Log;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "run"}, k = 3, mv = {1, 1, 13})
/* compiled from: ParallelUtil.kt */
public final class ParallelUtil$parallelForEach$1 implements Runnable {
    final /* synthetic */ Function1 $action;
    final /* synthetic */ Object $item;

    public ParallelUtil$parallelForEach$1(Function1 function1, Object obj) {
        this.$action = function1;
        this.$item = obj;
    }

    public final void run() {
        try {
            this.$action.invoke(this.$item);
            Unit unit = Unit.INSTANCE;
        } catch (Throwable th) {
            Log.e("Xposed", Log.getStackTraceString(th));
        }
    }
}
