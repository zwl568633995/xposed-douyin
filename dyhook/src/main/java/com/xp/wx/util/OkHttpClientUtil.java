package com.xp.wx.util;

import com.xp.wx.Global;
import com.xp.wx.backend.douyin.util.ConfigUtil;
import com.xp.wx.backend.helper.RemoteHelper;
import com.xp.wx.backend.network.BaseResponse;
import java.util.HashMap;
import java.util.Map;

public class OkHttpClientUtil {
    private static final byte[] LOCK = new byte[0];
    private static OkHttpClientUtil mInstance;

    public interface Callback {
        void onComplete(String str);

        void onFail(String str);
    }

    public interface ResponseCallback<T extends BaseResponse> {
        void onComplete(T t);
    }

    private OkHttpClientUtil() {
    }

    public static OkHttpClientUtil getInstance() {
        if (mInstance == null) {
            synchronized (LOCK) {
                if (mInstance == null) {
                    mInstance = new OkHttpClientUtil();
                }
            }
        }
        return mInstance;
    }

    public void post(String str, String str2, Map<String, String> map, Callback callback) {
        RemoteHelper.INSTANCE.httpPost(str, str2, map, getHeaders(), callback);
    }

    public void post(String str, Map<String, String> map, Callback callback) {
        post(Global.BASE_URL, str, map, callback);
    }

    public <T extends BaseResponse> void post(String str, Map<String, String> map, Class<T> cls, ResponseCallback responseCallback) {
        post(Global.BASE_URL, str, map, cls, responseCallback);
    }

    public <T extends BaseResponse> void post(String str, final String str2, Map<String, String> map, final Class<T> cls, final ResponseCallback responseCallback) {
        RemoteHelper.INSTANCE.httpPost(str, str2, map, getHeaders(), new Callback() {
            public void onFail(String str) {
                BaseResponse baseResponse;
                Log.warn(str2 + ", errMsg = " + str);
                if (responseCallback != null) {
                    BaseResponse baseResponse2 = null;
                    try {
                        baseResponse = (BaseResponse) cls.newInstance();
                        try {
                            baseResponse.status = -1;
                            baseResponse.msg = str;
                        } catch (IllegalAccessException | InstantiationException e) {
                            e = e;
                            baseResponse2 = baseResponse;
                        }
                    } catch (IllegalAccessException | InstantiationException e2) {
                        e = e2;
                        e.printStackTrace();
                        baseResponse = baseResponse2;
                        responseCallback.onComplete(baseResponse);
                    }
                    responseCallback.onComplete(baseResponse);
                }
            }

            public void onComplete(String str) {
                BaseResponse baseResponse;
                ReflectiveOperationException e;
                Log.debug(str2 + ", result = " + str);
                if (responseCallback != null) {
                    BaseResponse baseResponse2 = (BaseResponse) JsonUtil.parseJson(str, cls);
                    if (baseResponse2 == null) {
                        try {
                            baseResponse = (BaseResponse) cls.newInstance();
                            try {
                                baseResponse.status = -1;
                                baseResponse.msg = "服务器异常";
                            } catch (IllegalAccessException | InstantiationException e2) {
                                e = e2;
                            }
                        } catch (IllegalAccessException | InstantiationException e3) {
                            ReflectiveOperationException reflectiveOperationException = e3;
                            baseResponse = baseResponse2;
                            e = reflectiveOperationException;
                            e.printStackTrace();
                            baseResponse2 = baseResponse;
                            responseCallback.onComplete(baseResponse2);
                        }
                        baseResponse2 = baseResponse;
                    }
                    responseCallback.onComplete(baseResponse2);
                }
            }
        });
    }

    public String postSync(String str, Map<String, String> map) {
        return RemoteHelper.INSTANCE.httpPostSync(Global.BASE_URL, str, map, getHeaders());
    }

    public <T extends BaseResponse> T postSync(String str, Map<String, String> map, Class<T> cls) {
        T t;
        ReflectiveOperationException e;
        String postSync = postSync(str, map);
        Log.debug(str + ", result = " + postSync);
        T t2 = (BaseResponse) JsonUtil.parseJson(postSync, cls);
        if (t2 != null) {
            return t2;
        }
        try {
            t = (BaseResponse) cls.newInstance();
            try {
                t.status = -1;
                t.msg = "服务器异常";
            } catch (IllegalAccessException | InstantiationException e2) {
                e = e2;
            }
        } catch (IllegalAccessException | InstantiationException e3) {
            ReflectiveOperationException reflectiveOperationException = e3;
            t = t2;
            e = reflectiveOperationException;
            e.printStackTrace();
            return t;
        }
        return t;
    }

    private Map<String, String> getHeaders() {
        HashMap hashMap = new HashMap();
        hashMap.put("Authorization", StringUtils.emptyIfNull(ConfigUtil.INSTANCE.getLoginInfo().token));
        return hashMap;
    }
}
