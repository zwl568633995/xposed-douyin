package com.xp.wx.spellbook.util;

import android.os.Build;
import android.util.Log;
import com.xp.wx.spellbook.base.Hooker;
import kotlin.Metadata;
import kotlin.Unit;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 13})
/* compiled from: XposedUtil.kt */
final class XposedUtil$postHooker$1 implements Runnable {
    final /* synthetic */ Hooker $hooker;

    XposedUtil$postHooker$1(Hooker hooker) {
        this.$hooker = hooker;
    }

    public final void run() {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                this.$hooker.hook();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                Log.e("Xposed", Log.getStackTraceString(th));
            }
        } else if (Build.VERSION.SDK_INT >= 21) {
            XposedUtil.workerPool.execute(new XposedUtil$postHooker$1$$special$$inlined$tryHook$1(this));
        } else {
            XposedUtil.workerPool.execute(new XposedUtil$postHooker$1$$special$$inlined$tryHook$2(this));
        }
    }
}
