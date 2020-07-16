package com.xp.wx.spellbook.util;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "T", "R", "invoke", "com/xp/wx/spellbook/util/ParallelUtil$parallelMap$1$1"}, k = 3, mv = {1, 1, 13})
/* compiled from: ParallelUtil.kt */
public final class ParallelUtil$parallelMap$$inlined$map$lambda$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ List $main$inlined;
    final /* synthetic */ int $section;
    final /* synthetic */ int $sectionSize$inlined;
    final /* synthetic */ List $this_parallelMap$inlined;
    final /* synthetic */ Function1 $transform$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ParallelUtil$parallelMap$$inlined$map$lambda$1(int i, List list, int i2, List list2, Function1 function1) {
        super(0);
        this.$section = i;
        this.$this_parallelMap$inlined = list;
        this.$sectionSize$inlined = i2;
        this.$main$inlined = list2;
        this.$transform$inlined = function1;
    }

    public final void invoke() {
        int i = this.$sectionSize$inlined;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.$section;
            ((List) this.$main$inlined.get(i3)).add(this.$transform$inlined.invoke(this.$this_parallelMap$inlined.get((this.$sectionSize$inlined * i3) + i2)));
        }
    }
}
