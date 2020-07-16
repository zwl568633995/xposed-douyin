package com.xp.wx.spellbook.base;

import android.support.v4.app.NotificationCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/xp/wx/spellbook/base/HookerProvider;", "", "provideEventHooker", "Lcom/xp/wx/spellbook/base/Hooker;", "event", "", "provideStaticHookers", "", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: HookerProvider.kt */
public interface HookerProvider {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* compiled from: HookerProvider.kt */
    public static final class DefaultImpls {
        public static Hooker provideEventHooker(HookerProvider hookerProvider, String str) {
            Intrinsics.checkParameterIsNotNull(str, NotificationCompat.CATEGORY_EVENT);
            return null;
        }

        public static List<Hooker> provideStaticHookers(HookerProvider hookerProvider) {
            return null;
        }
    }

    Hooker provideEventHooker(String str);

    List<Hooker> provideStaticHookers();
}
