package com.qiniu.android.http;

import org.json.JSONObject;

public interface CompletionHandler {
    void complete(ResponseInfo responseInfo, JSONObject jSONObject);
}
