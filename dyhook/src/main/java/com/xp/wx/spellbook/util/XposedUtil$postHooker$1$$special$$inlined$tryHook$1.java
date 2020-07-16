package com.xp.wx.spellbook.util;

import android.util.Log;
import kotlin.Metadata;
import kotlin.Unit;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/xp/wx/spellbook/util/XposedUtil$tryHook$1"}, k = 3, mv = {1, 1, 13})
/* compiled from: XposedUtil.kt */
public final class XposedUtil$postHooker$1$$special$$inlined$tryHook$1 implements Runnable {
    final /* synthetic */ XposedUtil$postHooker$1 this$0;

    public XposedUtil$postHooker$1$$special$$inlined$tryHook$1(XposedUtil$postHooker$1 xposedUtil$postHooker$1) {
        this.this$0 = xposedUtil$postHooker$1;
    }

    public final void run() {
        try {
            this.this$0.$hooker.hook();
            Unit unit = Unit.INSTANCE;
        } catch (Throwable th) {
            Log.e("Xposed", Log.getStackTraceString(th));
        }
    }
}
