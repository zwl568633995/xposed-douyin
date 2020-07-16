package com.qiniu.android.storage;

import org.json.JSONObject;

public final class UpToken {
    private String returnUrl = null;
    public final String token;

    private UpToken(JSONObject jSONObject, String str) {
        this.returnUrl = jSONObject.optString("returnUrl");
        this.token = str;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.qiniu.android.storage.UpToken parse(java.lang.String r4) {
        /*
            r0 = 0
            java.lang.String r1 = ":"
            java.lang.String[] r1 = r4.split(r1)     // Catch:{ Exception -> 0x003a }
            int r2 = r1.length
            r3 = 3
            if (r2 == r3) goto L_0x000c
            return r0
        L_0x000c:
            r2 = 2
            r1 = r1[r2]
            byte[] r1 = com.qiniu.android.utils.UrlSafeBase64.decode(r1)
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{  }
            java.lang.String r3 = new java.lang.String     // Catch:{  }
            r3.<init>(r1)     // Catch:{  }
            r2.<init>(r3)     // Catch:{  }
            java.lang.String r1 = "scope"
            java.lang.String r1 = r2.optString(r1)
            java.lang.String r3 = ""
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x002c
            return r0
        L_0x002c:
            java.lang.String r1 = "deadline"
            int r1 = r2.optInt(r1)
            if (r1 != 0) goto L_0x0035
            return r0
        L_0x0035:
            com.qiniu.android.storage.UpToken r0 = new com.qiniu.android.storage.UpToken
            r0.<init>(r2, r4)
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiniu.android.storage.UpToken.parse(java.lang.String):com.qiniu.android.storage.UpToken");
    }

    public String toString() {
        return this.token;
    }

    public boolean hasReturnUrl() {
        return !this.returnUrl.equals("");
    }
}
