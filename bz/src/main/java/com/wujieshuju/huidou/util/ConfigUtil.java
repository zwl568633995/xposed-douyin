package com.wujieshuju.huidou.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.FileObserver;
import android.os.Handler;
import android.os.Message;
import com.wujieshuju.huidou.Const;
import com.wujieshuju.huidou.HDApp;
import com.wujieshuju.huidou.model.DashboardResponse;
import com.wujieshuju.huidou.model.DyUser;
import com.wujieshuju.huidou.model.LoginInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public class ConfigUtil {
    private static final String ACTION_BIND_ASSISTANT_CHANGED = "action_bind_assistant_changed";
    private static final String ACTION_HD_CONFIG_CHANGED = "action_hd_config_changed";
    private static final String ACTION_HD_CONFIG_CHANGED_FROM_MODULE = "action_hd_config_changed_from_module";
    private static final String ACTION_LOGIN_CHANGED = "action_login_changed";
    public static final String KEY_HD_CONFIG = "key_hd_config";
    private static final int MSG_CURRENT_DY_INFO_CHANGED = 100;
    private static final int MSG_HD_CONFIG_CHANGED = 101;
    private static ConfigUtil sInstance = new ConfigUtil();
    private ArrayList<String> funcEnable;
    private FileObserver mCurrentDyInfoFileObserver;
    /* access modifiers changed from: private */
    public DyUser mCurrentDyUser;
    /* access modifiers changed from: private */
    public DashboardResponse.data mHDConfig;
    private FileObserver mHDConfigFileObserver;
    /* access modifiers changed from: private */
    public Handler mHandler = new Handler() {
        public void handleMessage(Message message) {
            if (message.what == 100) {
                DyUser unused = ConfigUtil.this.mCurrentDyUser = (DyUser) JsonUtil.parseJson(FileUtil.readFile(Const.CURRENT_DY_INFO_PATH), DyUser.class);
                LogUtil.m817d(Const.TAG, "mCurrentDyUser updated");
            }
        }
    };
    private ArrayList<OnConfigChangeListener> mListeners = new ArrayList<>();
    private LoginInfo mLoginInfo;
    private BroadcastReceiver mReceiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            if (ConfigUtil.ACTION_HD_CONFIG_CHANGED_FROM_MODULE.equals(intent.getAction())) {
                DashboardResponse.data unused = ConfigUtil.this.mHDConfig = (DashboardResponse.data) JsonUtil.parseJson(FileUtil.readFile(Const.HD_CONFIG_PATH), DashboardResponse.data.class);
                ConfigUtil.this.notify(ConfigUtil.KEY_HD_CONFIG, "");
            }
        }
    };

    public interface OnConfigChangeListener {
        void onChanged(String str, String str2);
    }

    private ConfigUtil() {
        if (!new File(Const.CURRENT_DY_INFO_PATH).exists()) {
            FileUtil.saveFile(Const.CURRENT_DY_INFO_PATH, "");
        }
        if (!new File(Const.HD_CONFIG_PATH).exists()) {
            FileUtil.saveFile(Const.HD_CONFIG_PATH, "");
        }
        C11303 r0 = new FileObserver(Const.CURRENT_DY_INFO_PATH, 2) {
            public void onEvent(int i, String str) {
                if (i == 2) {
                    LogUtil.m817d(Const.TAG, Const.CURRENT_DY_INFO_PATH + "---MODIFY");
                    ConfigUtil.this.mHandler.removeMessages(100);
                    ConfigUtil.this.mHandler.sendEmptyMessageDelayed(100, 500);
                }
            }
        };
        this.mCurrentDyInfoFileObserver = r0;
        r0.startWatching();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ACTION_HD_CONFIG_CHANGED_FROM_MODULE);
        HDApp.getApp().registerReceiver(this.mReceiver, intentFilter);
    }

    public static ConfigUtil getInstance() {
        return sInstance;
    }

    public synchronized void addOnConfigChangeListener(OnConfigChangeListener onConfigChangeListener) {
        if (onConfigChangeListener != null) {
            if (!this.mListeners.contains(onConfigChangeListener)) {
                this.mListeners.add(onConfigChangeListener);
            }
        }
    }

    public synchronized void removeOnConfigChangeListener(OnConfigChangeListener onConfigChangeListener) {
        this.mListeners.remove(onConfigChangeListener);
    }

    /* access modifiers changed from: private */
    public synchronized void notify(String str, String str2) {
        HandlerUtil.getMainHandler().post(new Runnable(str, str2) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                ConfigUtil.this.lambda$notify$0$ConfigUtil(this.f$1, this.f$2);
            }
        });
    }

    public /* synthetic */ void lambda$notify$0$ConfigUtil(String str, String str2) {
        Iterator<OnConfigChangeListener> it = this.mListeners.iterator();
        while (it.hasNext()) {
            OnConfigChangeListener next = it.next();
            if (next != null) {
                next.onChanged(str, str2);
            }
        }
    }

    public DyUser getCurrentDyInfo() {
        if (this.mCurrentDyUser == null) {
            this.mCurrentDyUser = (DyUser) JsonUtil.parseJson(FileUtil.readFile(Const.CURRENT_DY_INFO_PATH), DyUser.class);
        }
        if (this.mCurrentDyUser == null) {
            this.mCurrentDyUser = new DyUser();
        }
        return this.mCurrentDyUser;
    }

    public void bindDy(boolean z) {
        DyUser currentDyInfo = getCurrentDyInfo();
        if (currentDyInfo != null) {
            currentDyInfo.isBind = z;
            FileUtil.saveFile(Const.CURRENT_DY_INFO_PATH, JsonUtil.serialObject(currentDyInfo));
            sendBroadcastReceiver(ACTION_BIND_ASSISTANT_CHANGED);
        }
    }

    public String getDyID() {
        if (this.mCurrentDyUser.uid == null) {
            return "";
        }
        return this.mCurrentDyUser.uid;
    }

    public void updateHDConfig(DashboardResponse.data data) {
        this.mHDConfig = data;
        FileUtil.saveFile(Const.HD_CONFIG_PATH, JsonUtil.serialObject(data));
        notify(KEY_HD_CONFIG, "");
        sendBroadcastReceiver(ACTION_HD_CONFIG_CHANGED);
    }

    public void updateHDConfig() {
        updateHDConfig(this.mHDConfig);
    }

    public DashboardResponse.data getHDConfig() {
        if (this.mHDConfig == null) {
            this.mHDConfig = (DashboardResponse.data) JsonUtil.parseJson(FileUtil.readFile(Const.HD_CONFIG_PATH), DashboardResponse.data.class);
        }
        return this.mHDConfig;
    }

    public void saveLoginInfo(LoginInfo loginInfo) {
        this.mLoginInfo = loginInfo;
        FileUtil.saveFile(Const.TOKEN_PATH, loginInfo == null ? "" : JsonUtil.serialObject(loginInfo));
        sendBroadcastReceiver(ACTION_LOGIN_CHANGED);
    }

    public void updateLoginInfo() {
        String str = Const.TOKEN_PATH;
        LoginInfo loginInfo = this.mLoginInfo;
        FileUtil.saveFile(str, loginInfo == null ? "" : JsonUtil.serialObject(loginInfo));
        sendBroadcastReceiver(ACTION_LOGIN_CHANGED);
    }

    public LoginInfo getLoginInfo() {
        if (this.mLoginInfo == null) {
            LoginInfo loginInfo = (LoginInfo) JsonUtil.parseJson(FileUtil.readFile(Const.TOKEN_PATH), LoginInfo.class);
            this.mLoginInfo = loginInfo;
            if (loginInfo == null) {
                this.mLoginInfo = new LoginInfo();
            }
        }
        return this.mLoginInfo;
    }

    private void sendBroadcastReceiver(String str) {
        HDApp.getApp().sendBroadcast(new Intent(str));
    }

    public ArrayList<String> getFuncEnable() {
        return this.funcEnable;
    }

    public void setFuncEnable(ArrayList<String> arrayList) {
        this.funcEnable = arrayList;
    }
}
