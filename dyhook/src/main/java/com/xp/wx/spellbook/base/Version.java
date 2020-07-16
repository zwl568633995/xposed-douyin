package com.xp.wx.spellbook.base;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0000H\u0002J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\f\u001a\u00020\u0007H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xp/wx/spellbook/base/Version;", "", "versionName", "", "(Ljava/lang/String;)V", "version", "", "", "compareTo", "other", "equals", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: Version.kt */
public final class Version {
    private final List<Integer> version;
    private final String versionName;

    public Version(String str) {
        Intrinsics.checkParameterIsNotNull(str, "versionName");
        this.versionName = str;
        Collection arrayList = new ArrayList();
        for (String intOrNull : StringsKt.split$default((CharSequence) str, new char[]{'.'}, false, 0, 6, (Object) null)) {
            Integer intOrNull2 = StringsKt.toIntOrNull(intOrNull);
            if (intOrNull2 != null) {
                arrayList.add(intOrNull2);
            }
        }
        this.version = (List) arrayList;
    }

    public String toString() {
        return this.versionName;
    }

    public int hashCode() {
        return this.version.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof Version)) {
            return Intrinsics.areEqual((Object) this.version, (Object) ((Version) obj).version);
        }
        return false;
    }

    public final int compareTo(Version version2) {
        int i;
        Intrinsics.checkParameterIsNotNull(version2, "other");
        int i2 = 0;
        if (this.version.size() > version2.version.size()) {
            i = 1;
        } else {
            i = this.version.size() < version2.version.size() ? -1 : 0;
        }
        while (i2 < this.version.size() && i2 < version2.version.size()) {
            if (this.version.get(i2).intValue() > version2.version.get(i2).intValue()) {
                return 1;
            }
            if (this.version.get(i2).intValue() < version2.version.get(i2).intValue()) {
                return -1;
            }
            i2++;
        }
        return i;
    }
}
