package com.xp.wx.spellbook.douyin;

import android.util.Log;
import com.xp.wx.spellbook.base.Hooker;
import com.xp.wx.spellbook.base.HookerProvider;
import com.xp.wx.spellbook.util.XposedUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "T", "run", "com/xp/wx/spellbook/util/ParallelUtil$parallelForEach$1"}, k = 3, mv = {1, 1, 13})
/* compiled from: ParallelUtil.kt */
public final class DySpellBook$registerHookers$$inlined$parallelForEach$1 implements Runnable {
    final /* synthetic */ Object $item;

    public DySpellBook$registerHookers$$inlined$parallelForEach$1(Object obj) {
        this.$item = obj;
    }

    public final void run() {
        try {
            List<Hooker> provideStaticHookers = ((HookerProvider) this.$item).provideStaticHookers();
            if (provideStaticHookers != null) {
                for (Hooker hooker : provideStaticHookers) {
                    if (!hooker.getHasHooked()) {
                        XposedUtil.postHooker(hooker);
                    }
                }
            }
            Unit unit = Unit.INSTANCE;
        } catch (Throwable th) {
            Log.e("Xposed", Log.getStackTraceString(th));
        }
    }
}
