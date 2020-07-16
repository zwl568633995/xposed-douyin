package com.xp.wx.spellbook.douyin;

import com.xp.wx.spellbook.base.Version;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/xp/wx/spellbook/douyin/V;", "", "()V", "support", "", "Lcom/xp/wx/spellbook/base/Version;", "getSupport", "()[Lcom/xp/wx/spellbook/base/Version;", "[Lcom/xp/wx/spellbook/base/Version;", "v11_2_0", "getV11_2_0", "()Lcom/xp/wx/spellbook/base/Version;", "isSupport", "", "version", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: V.kt */
public final class V {
    public static final V INSTANCE = new V();
    private static final Version[] support;
    private static final Version v11_2_0;

    static {
        Version version = new Version("11.2.0");
        v11_2_0 = version;
        support = new Version[]{version};
    }

    private V() {
    }

    public final Version getV11_2_0() {
        return v11_2_0;
    }

    public final Version[] getSupport() {
        return support;
    }

    public final boolean isSupport(Version version) {
        Intrinsics.checkParameterIsNotNull(version, "version");
        return ArraysKt.contains((T[]) support, version);
    }
}
