package com.xp.wx.backend.douyin.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.xp.wx.Global;
import com.xp.wx.backend.douyin.api.DyHookApi;
import com.xp.wx.backend.douyin.handler.AutoSendMsgHandler;
import com.xp.wx.backend.douyin.handler.DyTaskHandler;
import com.xp.wx.backend.douyin.model.DyConfig;
import com.xp.wx.backend.douyin.model.DyUser;
import com.xp.wx.backend.douyin.model.LoginInfo;
import com.xp.wx.backend.network.HDConfigResponse;
import com.xp.wx.spellbook.douyin.DyGlobal;
import com.xp.wx.spellbook.douyin.model.User;
import com.xp.wx.spellbook.util.AppUtil;
import com.xp.wx.util.FileUtil;
import com.xp.wx.util.JsonUtil;
import com.xp.wx.util.Log;
import com.xp.wx.util.OkHttpClientUtil;
import com.xp.wx.util.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0019J\u0006\u0010\u001a\u001a\u00020\u0017J\u0006\u0010\u001b\u001a\u00020\u0017J\u0006\u0010\u001c\u001a\u00020\u0017J\u0006\u0010\u001d\u001a\u00020\u0004J\u0006\u0010\u001e\u001a\u00020\u0004J\u0006\u0010\u001f\u001a\u00020\u0017J\u0006\u0010 \u001a\u00020\u000fJ\u0006\u0010!\u001a\u00020\u0013J\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u0019J\u0006\u0010#\u001a\u00020\u0004J\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020\u0004J\u0006\u0010'\u001a\u00020\u0004J\u0006\u0010(\u001a\u00020\u0004J\u0006\u0010)\u001a\u00020\u0017J\u0006\u0010*\u001a\u00020\u0017J\u0006\u0010+\u001a\u00020\u0017J\u0006\u0010,\u001a\u00020\u0017J\u0006\u0010-\u001a\u00020\u0017J\u0006\u0010.\u001a\u00020\u0015J\u0006\u0010/\u001a\u000200J\u0006\u00101\u001a\u000200J\u0006\u00102\u001a\u000200J\u0006\u00103\u001a\u000200J\u0006\u00104\u001a\u000200J\u0012\u00105\u001a\u0002002\b\u00106\u001a\u0004\u0018\u000107H\u0002J\u0006\u00108\u001a\u000200J\u0006\u00109\u001a\u000200J\u0006\u0010:\u001a\u000200J\u0006\u0010;\u001a\u000200J\u0006\u0010<\u001a\u000200J\u0006\u0010=\u001a\u000200J\b\u0010>\u001a\u000200H\u0002J\u000e\u0010?\u001a\u00020\u00152\u0006\u0010@\u001a\u00020\u000fJ\u0010\u0010A\u001a\u00020\u00152\u0006\u0010B\u001a\u00020\u0004H\u0002J\u0012\u0010C\u001a\u00020\u00152\b\u0010D\u001a\u0004\u0018\u00010\tH\u0002J\u0006\u0010E\u001a\u00020\u0015R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000¨\u0006F"}, d2 = {"Lcom/xp/wx/backend/douyin/util/ConfigUtil;", "", "()V", "ACTION_BIND_ASSISTANT_CHANGED", "", "ACTION_HD_CONFIG_CHANGED", "ACTION_HD_CONFIG_CHANGED_FROM_MODULE", "ACTION_LOGIN_CHANGED", "dyConfig", "Lcom/xp/wx/backend/douyin/model/DyConfig;", "getDyConfig", "()Lcom/xp/wx/backend/douyin/model/DyConfig;", "setDyConfig", "(Lcom/xp/wx/backend/douyin/model/DyConfig;)V", "loginUser", "Lcom/xp/wx/backend/douyin/model/DyUser;", "mConfigChangedReceiver", "Landroid/content/BroadcastReceiver;", "mLoginInfo", "Lcom/xp/wx/backend/douyin/model/LoginInfo;", "destroyTask", "", "getAutoClickInterval", "", "getAutoSendGift", "", "getAutoSendGiftInterval", "getAutoSendGiftThreshold", "getAutoShoppingInterval", "getBindChatroomDyId", "getBulletinContent", "getBulletinInterval", "getLastLoginDyInfo", "getLoginInfo", "getReplyGift", "getReplyGiftContent", "getReplyKeywordContent", "Lcom/xp/wx/backend/douyin/model/DyConfig$ReplyKeywordList;", "getReplySubscribeContent", "getReplyWelcomeContent", "getSenFanContent", "getSenFanInterval", "getSenFanMaxSendNum", "getSenFanSexType", "getSenFanStatus", "getSenFanSubscribeType", "initConfig", "isAssistantBindDouyinOpen", "", "isAutoClickOpen", "isAutoSendGiftOpen", "isAutoShoppingOpen", "isAutoSubscribeOpen", "isChildOpen", "child", "Lcom/xp/wx/backend/douyin/model/DyConfig$CommonConfig;", "isReplyGiftOpen", "isReplyKeywordOpen", "isReplySubscribeOpen", "isReplyWelcomeOpen", "isSenFanOpen", "isSendBulletinOpen", "isSwitchOpen", "saveCurrentDyInfo", "dyInfo", "sendBroadcastReceiver", "action", "updateDyConfig", "config", "updateDyConfigLocalFile", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: ConfigUtil.kt */
public final class ConfigUtil {
    private static final String ACTION_BIND_ASSISTANT_CHANGED = "action_bind_assistant_changed";
    private static final String ACTION_HD_CONFIG_CHANGED = "action_hd_config_changed";
    private static final String ACTION_HD_CONFIG_CHANGED_FROM_MODULE = "action_hd_config_changed_from_module";
    private static final String ACTION_LOGIN_CHANGED = "action_login_changed";
    public static final ConfigUtil INSTANCE = new ConfigUtil();
    private static DyConfig dyConfig;
    /* access modifiers changed from: private */
    public static DyUser loginUser;
    private static BroadcastReceiver mConfigChangedReceiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            StringBuilder sb = new StringBuilder();
            sb.append("configChangedReceiver. onReceive action = ");
            sb.append(intent != null ? intent.getAction() : null);
            Log.debug(sb.toString());
            String action = intent != null ? intent.getAction() : null;
            if (action != null) {
                int hashCode = action.hashCode();
                if (hashCode != -255665414) {
                    if (hashCode != 776255893) {
                        if (hashCode == 1062533777 && action.equals(ConfigUtil.ACTION_HD_CONFIG_CHANGED)) {
                            ConfigUtil.INSTANCE.updateDyConfig((DyConfig) JsonUtil.parseJson(FileUtil.readFile(Global.HD_CONFIG_PATH), DyConfig.class));
                            Log.debug("dyConfig updated");
                        }
                    } else if (action.equals(ConfigUtil.ACTION_LOGIN_CHANGED)) {
                        ConfigUtil.mLoginInfo = null;
                        Log.debug("mLoginInfo updated");
                        DyGlobal.INSTANCE.refreshInfo();
                    }
                } else if (action.equals(ConfigUtil.ACTION_BIND_ASSISTANT_CHANGED)) {
                    ConfigUtil.loginUser = null;
                    Log.debug("bind assistant changed");
                    DyGlobal.INSTANCE.refreshInfo();
                }
            }
        }
    };
    /* access modifiers changed from: private */
    public static LoginInfo mLoginInfo;

    static {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ACTION_HD_CONFIG_CHANGED);
        intentFilter.addAction(ACTION_LOGIN_CHANGED);
        intentFilter.addAction(ACTION_BIND_ASSISTANT_CHANGED);
        DyHookApi hookApi = DyGlobal.INSTANCE.getHookApi();
        if (hookApi == null) {
            Intrinsics.throwNpe();
        }
        hookApi.getContext().registerReceiver(mConfigChangedReceiver, intentFilter);
    }

    private ConfigUtil() {
    }

    public final DyConfig getDyConfig() {
        return dyConfig;
    }

    public final void setDyConfig(DyConfig dyConfig2) {
        dyConfig = dyConfig2;
    }

    private final void sendBroadcastReceiver(String str) {
        AppUtil.INSTANCE.getSystemContext().sendBroadcast(new Intent(str));
    }

    public final void saveCurrentDyInfo(DyUser dyUser) {
        Intrinsics.checkParameterIsNotNull(dyUser, "dyInfo");
        loginUser = dyUser;
        FileUtil.saveFile(Global.CURRENT_DY_INFO_PATH, JsonUtil.serialObject(dyUser));
    }

    public final DyUser getLastLoginDyInfo() {
        if (loginUser == null) {
            loginUser = (DyUser) JsonUtil.parseJson(FileUtil.readFile(Global.CURRENT_DY_INFO_PATH), DyUser.class);
        }
        if (loginUser == null) {
            loginUser = new DyUser();
        }
        DyUser dyUser = loginUser;
        if (dyUser == null) {
            Intrinsics.throwNpe();
        }
        return dyUser;
    }

    public final LoginInfo getLoginInfo() {
        if (mLoginInfo == null) {
            LoginInfo loginInfo = (LoginInfo) JsonUtil.parseJson(FileUtil.readFile(Global.TOKEN_PATH), LoginInfo.class);
            mLoginInfo = loginInfo;
            if (loginInfo == null) {
                mLoginInfo = new LoginInfo();
            }
        }
        LoginInfo loginInfo2 = mLoginInfo;
        if (loginInfo2 == null) {
            Intrinsics.throwNpe();
        }
        return loginInfo2;
    }

    public final String getBindChatroomDyId() {
        if (!isAssistantBindDouyinOpen()) {
            return "";
        }
        DyConfig dyConfig2 = dyConfig;
        if (dyConfig2 == null) {
            Intrinsics.throwNpe();
        }
        String str = dyConfig2.assistantBindDouyin.msg;
        Intrinsics.checkExpressionValueIsNotNull(str, "dyConfig!!.assistantBindDouyin.msg");
        return str;
    }

    public final void initConfig() {
        if (TextUtils.isEmpty(getLoginInfo().token)) {
            Log.debug("empty token, need login");
            return;
        }
        String readFile = FileUtil.readFile(Global.HD_CONFIG_PATH);
        if (TextUtils.isEmpty(readFile)) {
            Map hashMap = new HashMap();
            User user = DyGlobal.INSTANCE.getUser();
            if (user == null) {
                Intrinsics.throwNpe();
            }
            hashMap.put("assistantId", user.getUid());
            OkHttpClientUtil.getInstance().post(Global.URL_GET_ALL_FUNCTION_SETTING, (Map<String, String>) hashMap, HDConfigResponse.class, (OkHttpClientUtil.ResponseCallback) new ConfigUtil$initConfig$1());
            return;
        }
        updateDyConfig((DyConfig) JsonUtil.parseJson(readFile, DyConfig.class));
        Log.debug("initConfig from local");
    }

    public final void destroyTask() {
        DyTaskHandler.INSTANCE.stopTask();
        AutoSendMsgHandler.stop$default(AutoSendMsgHandler.INSTANCE, 0, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void updateDyConfig(DyConfig dyConfig2) {
        if (getLastLoginDyInfo().isBind) {
            dyConfig = dyConfig2;
            DyTaskHandler.INSTANCE.refreshTask();
            if (isSenFanOpen()) {
                AutoSendMsgHandler.INSTANCE.start();
            } else {
                AutoSendMsgHandler.stop$default(AutoSendMsgHandler.INSTANCE, 0, 1, (Object) null);
            }
        } else {
            Log.debug("updateDyConfig. not bind");
            DyTaskHandler.INSTANCE.stopTask();
            AutoSendMsgHandler.stop$default(AutoSendMsgHandler.INSTANCE, 0, 1, (Object) null);
        }
    }

    public final void updateDyConfigLocalFile() {
        FileUtil.saveFile(Global.HD_CONFIG_PATH, JsonUtil.serialObject(dyConfig));
        sendBroadcastReceiver(ACTION_HD_CONFIG_CHANGED_FROM_MODULE);
    }

    private final boolean isSwitchOpen() {
        DyConfig dyConfig2 = dyConfig;
        if (dyConfig2 == null) {
            return false;
        }
        if (dyConfig2 == null) {
            Intrinsics.throwNpe();
        }
        if (dyConfig2.masterSwitchStatus == null) {
            return false;
        }
        DyConfig dyConfig3 = dyConfig;
        if (dyConfig3 == null) {
            Intrinsics.throwNpe();
        }
        return dyConfig3.masterSwitchStatus.status == 10;
    }

    public final boolean isAssistantBindDouyinOpen() {
        return isSwitchOpen();
    }

    public final boolean isAutoClickOpen() {
        if (isSwitchOpen()) {
            DyConfig dyConfig2 = dyConfig;
            if (dyConfig2 == null) {
                Intrinsics.throwNpe();
            }
            if (isChildOpen(dyConfig2.stAutoClick)) {
                return true;
            }
        }
        return false;
    }

    public final boolean isAutoSendGiftOpen() {
        if (isSwitchOpen()) {
            DyConfig dyConfig2 = dyConfig;
            if (dyConfig2 == null) {
                Intrinsics.throwNpe();
            }
            if (isChildOpen(dyConfig2.stAutoSendGift)) {
                return true;
            }
        }
        return false;
    }

    public final boolean isAutoShoppingOpen() {
        if (isSwitchOpen()) {
            DyConfig dyConfig2 = dyConfig;
            if (dyConfig2 == null) {
                Intrinsics.throwNpe();
            }
            if (isChildOpen(dyConfig2.stAutoShopping)) {
                return true;
            }
        }
        return false;
    }

    public final boolean isAutoSubscribeOpen() {
        if (isSwitchOpen()) {
            DyConfig dyConfig2 = dyConfig;
            if (dyConfig2 == null) {
                Intrinsics.throwNpe();
            }
            if (isChildOpen(dyConfig2.stAutoSubscribe)) {
                return true;
            }
        }
        return false;
    }

    public final boolean isReplyGiftOpen() {
        if (isSwitchOpen()) {
            DyConfig dyConfig2 = dyConfig;
            if (dyConfig2 == null) {
                Intrinsics.throwNpe();
            }
            if (isChildOpen(dyConfig2.stReplyGift)) {
                return true;
            }
        }
        return false;
    }

    public final boolean isReplyKeywordOpen() {
        if (isSwitchOpen()) {
            DyConfig dyConfig2 = dyConfig;
            if (dyConfig2 == null) {
                Intrinsics.throwNpe();
            }
            if (isChildOpen(dyConfig2.stReplyKeyword)) {
                return true;
            }
        }
        return false;
    }

    public final boolean isReplySubscribeOpen() {
        if (isSwitchOpen()) {
            DyConfig dyConfig2 = dyConfig;
            if (dyConfig2 == null) {
                Intrinsics.throwNpe();
            }
            if (isChildOpen(dyConfig2.stReplySubscribe)) {
                return true;
            }
        }
        return false;
    }

    public final boolean isReplyWelcomeOpen() {
        if (isSwitchOpen()) {
            DyConfig dyConfig2 = dyConfig;
            if (dyConfig2 == null) {
                Intrinsics.throwNpe();
            }
            if (isChildOpen(dyConfig2.stReplyWelcome)) {
                return true;
            }
        }
        return false;
    }

    public final boolean isSenFanOpen() {
        DyConfig dyConfig2 = dyConfig;
        if (dyConfig2 == null) {
            Intrinsics.throwNpe();
        }
        return isChildOpen(dyConfig2.stSenFan);
    }

    public final boolean isSendBulletinOpen() {
        if (isSwitchOpen()) {
            DyConfig dyConfig2 = dyConfig;
            if (dyConfig2 == null) {
                Intrinsics.throwNpe();
            }
            if (isChildOpen(dyConfig2.stSendBulletin)) {
                return true;
            }
        }
        return false;
    }

    private final boolean isChildOpen(DyConfig.CommonConfig commonConfig) {
        return commonConfig != null && commonConfig.status == 10;
    }

    public final int getAutoClickInterval() {
        if (!isAutoClickOpen()) {
            return -1;
        }
        DyConfig dyConfig2 = dyConfig;
        if (dyConfig2 == null) {
            Intrinsics.throwNpe();
        }
        return dyConfig2.stAutoClick.threshold;
    }

    public final int getAutoSendGiftThreshold() {
        if (!isAutoSendGiftOpen()) {
            return -1;
        }
        DyConfig dyConfig2 = dyConfig;
        if (dyConfig2 == null) {
            Intrinsics.throwNpe();
        }
        return dyConfig2.stAutoSendGift.threshold;
    }

    public final int getAutoSendGiftInterval() {
        if (!isAutoSendGiftOpen()) {
            return -1;
        }
        DyConfig dyConfig2 = dyConfig;
        if (dyConfig2 == null) {
            Intrinsics.throwNpe();
        }
        return dyConfig2.stAutoSendGift.interval;
    }

    public final List<String> getAutoSendGift() {
        if (isAutoSendGiftOpen()) {
            DyConfig dyConfig2 = dyConfig;
            if (dyConfig2 == null) {
                Intrinsics.throwNpe();
            }
            if (!TextUtils.isEmpty(dyConfig2.stAutoSendGift.gift_json)) {
                DyConfig dyConfig3 = dyConfig;
                if (dyConfig3 == null) {
                    Intrinsics.throwNpe();
                }
                Object parseJson = JsonUtil.parseJson(dyConfig3.stAutoSendGift.gift_json, ArrayList.class);
                if (parseJson != null) {
                    return (ArrayList) parseJson;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.ArrayList<kotlin.String> /* = java.util.ArrayList<kotlin.String> */");
            }
        }
        return new ArrayList<>();
    }

    public final int getAutoShoppingInterval() {
        if (!isAutoShoppingOpen()) {
            return -1;
        }
        DyConfig dyConfig2 = dyConfig;
        if (dyConfig2 == null) {
            Intrinsics.throwNpe();
        }
        return dyConfig2.stAutoShopping.interval;
    }

    public final String getReplyWelcomeContent() {
        if (!isReplyWelcomeOpen()) {
            return "";
        }
        DyConfig dyConfig2 = dyConfig;
        if (dyConfig2 == null) {
            Intrinsics.throwNpe();
        }
        String emptyIfNull = StringUtils.emptyIfNull(dyConfig2.stReplyWelcome.content);
        Intrinsics.checkExpressionValueIsNotNull(emptyIfNull, "StringUtils.emptyIfNull(…!.stReplyWelcome.content)");
        return emptyIfNull;
    }

    public final DyConfig.ReplyKeywordList getReplyKeywordContent() {
        if (!isReplyKeywordOpen()) {
            return new DyConfig.ReplyKeywordList();
        }
        DyConfig dyConfig2 = dyConfig;
        if (dyConfig2 == null) {
            Intrinsics.throwNpe();
        }
        Object parseJson = JsonUtil.parseJson(dyConfig2.stReplyKeyword.content, DyConfig.ReplyKeywordList.class);
        Intrinsics.checkExpressionValueIsNotNull(parseJson, "JsonUtil.parseJson(dyCon…yKeywordList::class.java)");
        return (DyConfig.ReplyKeywordList) parseJson;
    }

    public final String getReplySubscribeContent() {
        if (!isReplySubscribeOpen()) {
            return "";
        }
        DyConfig dyConfig2 = dyConfig;
        if (dyConfig2 == null) {
            Intrinsics.throwNpe();
        }
        String emptyIfNull = StringUtils.emptyIfNull(dyConfig2.stReplySubscribe.content);
        Intrinsics.checkExpressionValueIsNotNull(emptyIfNull, "StringUtils.emptyIfNull(…stReplySubscribe.content)");
        return emptyIfNull;
    }

    public final String getReplyGiftContent() {
        if (!isReplyGiftOpen()) {
            return "";
        }
        DyConfig dyConfig2 = dyConfig;
        if (dyConfig2 == null) {
            Intrinsics.throwNpe();
        }
        String emptyIfNull = StringUtils.emptyIfNull(dyConfig2.stReplyGift.content);
        Intrinsics.checkExpressionValueIsNotNull(emptyIfNull, "StringUtils.emptyIfNull(…ig!!.stReplyGift.content)");
        return emptyIfNull;
    }

    public final List<String> getReplyGift() {
        if (isReplyGiftOpen()) {
            DyConfig dyConfig2 = dyConfig;
            if (dyConfig2 == null) {
                Intrinsics.throwNpe();
            }
            if (!TextUtils.isEmpty(dyConfig2.stReplyGift.gift_json)) {
                DyConfig dyConfig3 = dyConfig;
                if (dyConfig3 == null) {
                    Intrinsics.throwNpe();
                }
                Object parseJson = JsonUtil.parseJson(dyConfig3.stReplyGift.gift_json, ArrayList.class);
                if (parseJson != null) {
                    return (ArrayList) parseJson;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.ArrayList<kotlin.String> /* = java.util.ArrayList<kotlin.String> */");
            }
        }
        return new ArrayList<>();
    }

    public final int getBulletinInterval() {
        if (!isSendBulletinOpen()) {
            return -1;
        }
        DyConfig dyConfig2 = dyConfig;
        if (dyConfig2 == null) {
            Intrinsics.throwNpe();
        }
        return dyConfig2.stSendBulletin.interval;
    }

    public final String getBulletinContent() {
        if (!isSendBulletinOpen()) {
            return "";
        }
        DyConfig dyConfig2 = dyConfig;
        if (dyConfig2 == null) {
            Intrinsics.throwNpe();
        }
        String emptyIfNull = StringUtils.emptyIfNull(dyConfig2.stSendBulletin.content);
        Intrinsics.checkExpressionValueIsNotNull(emptyIfNull, "StringUtils.emptyIfNull(…!.stSendBulletin.content)");
        return emptyIfNull;
    }

    public final int getSenFanInterval() {
        if (!isSenFanOpen()) {
            return -1;
        }
        DyConfig dyConfig2 = dyConfig;
        if (dyConfig2 == null) {
            Intrinsics.throwNpe();
        }
        return dyConfig2.stSenFan.interval;
    }

    public final int getSenFanStatus() {
        DyConfig dyConfig2 = dyConfig;
        if (dyConfig2 == null) {
            return 30;
        }
        if (dyConfig2 == null) {
            Intrinsics.throwNpe();
        }
        if (dyConfig2.stSenFan == null) {
            return 30;
        }
        DyConfig dyConfig3 = dyConfig;
        if (dyConfig3 == null) {
            Intrinsics.throwNpe();
        }
        return dyConfig3.stSenFan.status;
    }

    public final int getSenFanMaxSendNum() {
        if (!isSenFanOpen()) {
            return -1;
        }
        DyConfig dyConfig2 = dyConfig;
        if (dyConfig2 == null) {
            Intrinsics.throwNpe();
        }
        return dyConfig2.stSenFan.max_send_num;
    }

    public final int getSenFanSubscribeType() {
        if (!isSenFanOpen()) {
            return -1;
        }
        DyConfig dyConfig2 = dyConfig;
        if (dyConfig2 == null) {
            Intrinsics.throwNpe();
        }
        return dyConfig2.stSenFan.subscribe_type;
    }

    public final int getSenFanSexType() {
        if (!isSenFanOpen()) {
            return -1;
        }
        DyConfig dyConfig2 = dyConfig;
        if (dyConfig2 == null) {
            Intrinsics.throwNpe();
        }
        return dyConfig2.stSenFan.sex_type;
    }

    public final String getSenFanContent() {
        if (!isSenFanOpen()) {
            return "";
        }
        DyConfig dyConfig2 = dyConfig;
        if (dyConfig2 == null) {
            Intrinsics.throwNpe();
        }
        String emptyIfNull = StringUtils.emptyIfNull(dyConfig2.stSenFan.content);
        Intrinsics.checkExpressionValueIsNotNull(emptyIfNull, "StringUtils.emptyIfNull(…onfig!!.stSenFan.content)");
        return emptyIfNull;
    }
}
