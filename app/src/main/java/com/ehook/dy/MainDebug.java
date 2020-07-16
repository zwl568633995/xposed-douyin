package com.ehook.dy;

import android.util.Log;

import com.evan.dy.utils.JsonUtils;
import com.evan.socket.JsonUtil;

class MainDebug {

    public void debug() {
        Test test = JsonUtil.fromJson("{\"userName\":\"abc\"}", Test.class);
        TestModel testModel = JsonUtils.parseBySerializedName(test, TestModel.class);
        Log.d("xxxxxxxx", testModel.userName);
    }
}
