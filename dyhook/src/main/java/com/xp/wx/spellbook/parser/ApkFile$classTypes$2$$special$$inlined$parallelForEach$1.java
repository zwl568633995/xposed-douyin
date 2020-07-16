package com.xp.wx.spellbook.parser;

import android.util.Log;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "T", "run", "com/xp/wx/spellbook/util/ParallelUtil$parallelForEach$1"}, k = 3, mv = {1, 1, 13})
/* compiled from: ParallelUtil.kt */
public final class ApkFile$classTypes$2$$special$$inlined$parallelForEach$1 implements Runnable {
    final /* synthetic */ Object $item;
    final /* synthetic */ ClassTrie $ret$inlined;
    final /* synthetic */ ApkFile$classTypes$2 this$0;

    public ApkFile$classTypes$2$$special$$inlined$parallelForEach$1(Object obj, ApkFile$classTypes$2 apkFile$classTypes$2, ClassTrie classTrie) {
        this.$item = obj;
        this.this$0 = apkFile$classTypes$2;
        this.$ret$inlined = classTrie;
    }

    public final void run() {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(this.this$0.this$0.readDexFile(((Number) this.$item).intValue()));
            Intrinsics.checkExpressionValueIsNotNull(wrap, "buffer");
            this.$ret$inlined.plusAssign(new DexParser(wrap).parseClassTypes());
            Unit unit = Unit.INSTANCE;
        } catch (Throwable th) {
            Log.e("Xposed", Log.getStackTraceString(th));
        }
    }
}
