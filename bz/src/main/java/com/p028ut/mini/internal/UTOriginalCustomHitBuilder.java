package com.p028ut.mini.internal;

import android.text.TextUtils;
import com.p028ut.mini.UTHitBuilders;
import java.util.Map;

/* renamed from: com.ut.mini.internal.UTOriginalCustomHitBuilder */
public class UTOriginalCustomHitBuilder extends UTHitBuilders.UTHitBuilder {
    public UTOriginalCustomHitBuilder(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            super.setProperty(UTHitBuilders.UTHitBuilder.FIELD_PAGE, str);
        }
        super.setProperty(UTHitBuilders.UTHitBuilder.FIELD_EVENT_ID, "" + i);
        if (!TextUtils.isEmpty(str2)) {
            super.setProperty(UTHitBuilders.UTHitBuilder.FIELD_ARG1, str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            super.setProperty(UTHitBuilders.UTHitBuilder.FIELD_ARG2, str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            super.setProperty(UTHitBuilders.UTHitBuilder.FIELD_ARG3, str4);
        }
        super.setProperties(map);
    }
}
