package com.xp.wx.util;

import android.os.Build;
import android.text.TextUtils;
import com.xp.wx.Global;
import com.xp.wx.util.OkHttpClientUtil;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class UploadLogUtil {
    public static void uploadFileLog() {
        String readLog = FileUtil.readLog();
        if (!TextUtils.isEmpty(readLog)) {
            if (readLog.length() >= 5000) {
                readLog = readLog.substring(0, 5000);
            }
            upload(readLog);
        }
    }

    public static void upload(String str) {
        int aPNType = HttpUtil.getAPNType(Global.INSTANCE.getGlobal().getContext());
        if (aPNType == 3 || aPNType == 0) {
            FileUtil.writeLog(str + "\r\n");
            return;
        }
        String readFile = FileUtil.readFile(Global.ACCOUNT_INFO_PATH);
        if (!TextUtils.isEmpty(readFile)) {
            String decrypt = AESUtil.decrypt(readFile, Global.a);
            if (!TextUtils.isEmpty(decrypt)) {
                String str2 = null;
                try {
                    str2 = new JSONObject(decrypt).getString("go_server");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                    String versionName = MonitorUtils.getInstance().getVersionName();
                    HashMap hashMap = new HashMap();
                    hashMap.put("source", "xpwx");
                    hashMap.put("assistant", StringUtils.emptyIfNull(Global.INSTANCE.getGlobal().getLoginUserId()));
                    hashMap.put("mobileName", MonitorUtils.getBluetoothName());
                    hashMap.put("mobileMac", MonitorUtils.getBluetoothMac());
                    hashMap.put("mobileModel", Build.BRAND + "  " + Build.MODEL);
                    hashMap.put("apkVersion", versionName);
                    hashMap.put("androidVersion", "Android " + Build.VERSION.RELEASE);
                    hashMap.put("errMsg", str);
                    OkHttpClientUtil.getInstance().post("http://" + str2 + "/", Global.URL_UPLOAD_LOG, (Map<String, String>) hashMap, (OkHttpClientUtil.Callback) new OkHttpClientUtil.Callback() {
                        public void onFail(String str) {
                        }

                        public void onComplete(String str) {
                            FileUtil.deleteLog();
                        }
                    });
                }
            }
        }
    }
}
