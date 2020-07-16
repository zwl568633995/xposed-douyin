package com.xp.wx.spellbook.parser;

import com.xp.wx.spellbook.util.ParallelUtil;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.ranges.RangesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/xp/wx/spellbook/parser/ClassTrie;", "invoke"}, k = 3, mv = {1, 1, 13})
/* compiled from: ApkFile.kt */
final class ApkFile$classTypes$2 extends Lambda implements Function0<ClassTrie> {
    final /* synthetic */ ApkFile this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ApkFile$classTypes$2(ApkFile apkFile) {
        super(0);
        this.this$0 = apkFile;
    }

    public final ClassTrie invoke() {
        int i = 2;
        while (this.this$0.isDexFileExist(i)) {
            i++;
        }
        ClassTrie classTrie = new ClassTrie();
        ExecutorService createThreadPool$default = ParallelUtil.createThreadPool$default(0, 1, (Object) null);
        for (Object apkFile$classTypes$2$$special$$inlined$parallelForEach$1 : RangesKt.until(1, i)) {
            createThreadPool$default.execute(new ApkFile$classTypes$2$$special$$inlined$parallelForEach$1(apkFile$classTypes$2$$special$$inlined$parallelForEach$1, this, classTrie));
        }
        createThreadPool$default.shutdown();
        createThreadPool$default.awaitTermination(LongCompanionObject.MAX_VALUE, TimeUnit.NANOSECONDS);
        classTrie.setMutable(false);
        return classTrie;
    }
}
