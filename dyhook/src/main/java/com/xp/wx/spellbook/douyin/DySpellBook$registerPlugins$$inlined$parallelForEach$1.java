package com.xp.wx.spellbook.douyin;

import android.util.Log;
import com.xp.wx.spellbook.base.EventCenter;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "T", "run", "com/xp/wx/spellbook/util/ParallelUtil$parallelForEach$1"}, k = 3, mv = {1, 1, 13})
/* compiled from: ParallelUtil.kt */
public final class DySpellBook$registerPlugins$$inlined$parallelForEach$1 implements Runnable {
    final /* synthetic */ Object $item;
    final /* synthetic */ List $observers$inlined;

    public DySpellBook$registerPlugins$$inlined$parallelForEach$1(Object obj, List list) {
        this.$item = obj;
        this.$observers$inlined = list;
    }

    public final void run() {
        try {
            EventCenter eventCenter = (EventCenter) this.$item;
            for (Class cls : eventCenter.getInterfaces()) {
                for (Object next : this.$observers$inlined) {
                    if (cls.isAssignableFrom(next.getClass())) {
                        eventCenter.register((Class<?>) cls, next);
                    }
                }
            }
            Unit unit = Unit.INSTANCE;
        } catch (Throwable th) {
            Log.e("Xposed", Log.getStackTraceString(th));
        }
    }
}
