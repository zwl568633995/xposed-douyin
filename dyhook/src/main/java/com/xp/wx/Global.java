package com.xp.wx;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.xp.wx.spellbook.base.BaseGlobal;
import com.xp.wx.spellbook.douyin.DyGlobal;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u00108\u001a\u0004\u0018\u000109J\b\u0010:\u001a\u0004\u0018\u00010;J\u000e\u0010<\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u0004J\u0006\u0010>\u001a\u00020\u001cR\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cXT¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R\u0010\u0010+\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lcom/xp/wx/Global;", "", "()V", "ACCOUNT_INFO_PATH", "", "ACTION_RECEIVE_HOOK_STATUS", "ACTION_REQUIRE_HOOK_STATUS", "ACTION_UPDATE_PREF", "BASE_URL", "COMMENT_PATH", "CONFIG_PATH", "CURRENT_DY_INFO_PATH", "DOUYIN_PACKAGE_NAME", "EMOJI_PATH", "FILE_PATH", "FOLDER_SHARED_PREFS", "HD_CONFIG_PATH", "HUIDOU_PACKAGE_NAME", "IMAGE_PATH", "KW_XMAS", "KW_XPOSED", "LOG_PATH", "MAGICIAN_APPLICATION_ID", "MAGICIAN_PACKAGE_NAME", "MODIFY_FUNC_STATUS", "PREFERENCE_NAME_DEVELOPER", "PREFERENCE_NAME_SETTINGS", "PRODUCT_TYPE", "", "QRCODE_PATH", "ROOT_PATH", "SALT", "SBOX_PACKAGE_NAME", "SETTINGS_INTERFACE_HIDE_ICON", "SETTINGS_MODULE_LANGUAGE", "SOCKETSERVER", "getSOCKETSERVER", "()Ljava/lang/String;", "setSOCKETSERVER", "(Ljava/lang/String;)V", "SOCKET_TOKEN", "getSOCKET_TOKEN", "setSOCKET_TOKEN", "STATUS_PATH", "TOKEN_PATH", "UPLOAD_PATH", "URL_CHECK_MODULES_VERSION", "URL_GET_ALL_FUNCTION_SETTING", "URL_ONLINE", "URL_QINIU_TOKEN", "URL_TEST_196", "URL_UPLOAD_LOG", "WECHAT_PACKAGE_NAME", "XPOSED_PACKAGE_NAME", "XPOSET_INSTALLER_PACKAGE_NAME", "a", "getContext", "Landroid/content/Context;", "getGlobal", "Lcom/xp/wx/spellbook/base/BaseGlobal;", "getSocketUrl", "url", "getSource", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: Global.kt */
public final class Global {
    public static final String ACCOUNT_INFO_PATH = (CONFIG_PATH + "/account.conf");
    public static final String ACTION_RECEIVE_HOOK_STATUS = "com.xp.wx.ACTION_RECEIVE_HOOK_STATUS";
    public static final String ACTION_REQUIRE_HOOK_STATUS = "com.xp.wx.ACTION_REQUIRE_HOOK_STATUS";
    public static final String ACTION_UPDATE_PREF = "com.xp.wx.ACTION_UPDATE_PREF";
    public static String BASE_URL = URL_ONLINE;
    public static final String COMMENT_PATH = (ROOT_PATH + "/config/comment_2.conf");
    public static final String CONFIG_PATH = (ROOT_PATH + "/config");
    public static final String CURRENT_DY_INFO_PATH = (ROOT_PATH + "/huidou/config/current_dy_info.conf");
    public static final String DOUYIN_PACKAGE_NAME = "com.ss.android.ugc.aweme";
    public static final String EMOJI_PATH = (IMAGE_PATH + "/emoji");
    public static final String FILE_PATH = (ROOT_PATH + "/files");
    public static final String FOLDER_SHARED_PREFS = "shared_prefs";
    public static final String HD_CONFIG_PATH = (ROOT_PATH + "/huidou/config/hd.conf");
    public static final String HUIDOU_PACKAGE_NAME = "com.wujieshuju.huidou";
    public static final String IMAGE_PATH = (ROOT_PATH + "/images");
    public static final Global INSTANCE = new Global();
    public static final String KW_XMAS = "xmas";
    public static final String KW_XPOSED = "xposed";
    public static final String LOG_PATH = (ROOT_PATH + "/log/xpwx.log");
    public static final String MAGICIAN_APPLICATION_ID = "com.xp.wx.hd";
    public static final String MAGICIAN_PACKAGE_NAME = "com.xp.wx";
    public static final String MODIFY_FUNC_STATUS = "/huidouApi/Huidou/MoidfyFuncStatus";
    public static final String PREFERENCE_NAME_DEVELOPER = "developer";
    public static final String PREFERENCE_NAME_SETTINGS = "settings";
    private static final int PRODUCT_TYPE = 2;
    public static final String QRCODE_PATH = (IMAGE_PATH + "/qrcode");
    public static final String ROOT_PATH;
    public static final String SALT = "W3ch4tM4g1c14n";
    public static final String SBOX_PACKAGE_NAME = "env.android.bzlb.com";
    public static final String SETTINGS_INTERFACE_HIDE_ICON = "settings_interface_hide_icon";
    public static final String SETTINGS_MODULE_LANGUAGE = "settings_module_language";
    private static String SOCKETSERVER = "ws://192.168.0.66:6789/robot";
    private static String SOCKET_TOKEN = "";
    public static final String STATUS_PATH = (ROOT_PATH + "/config/status_2.conf");
    public static final String TOKEN_PATH = (ROOT_PATH + "/huidou/config/token.conf");
    public static final String UPLOAD_PATH = (ROOT_PATH + "/upload");
    public static final String URL_CHECK_MODULES_VERSION = "/index.php?r=/uc/user/check-version";
    public static final String URL_GET_ALL_FUNCTION_SETTING = "/huidouApi/Huidou/GetAllFuncSettings";
    public static final String URL_ONLINE = "http://task.wujieshuju.com:8089";
    public static final String URL_QINIU_TOKEN = "/index.php?r=uc/user/qiniu-token";
    public static final String URL_TEST_196 = "http://120.55.98.196:8089";
    public static final String URL_UPLOAD_LOG = "uplog/apklog";
    public static final String WECHAT_PACKAGE_NAME = "com.tencent.mm";
    public static final String XPOSED_PACKAGE_NAME = "com.xp.api.installer";
    public static final String XPOSET_INSTALLER_PACKAGE_NAME = "de.robv.android.xposed.installer";
    public static final String a = "iWk!#Ait=bc+K&Pl";

    static {
        StringBuilder sb = new StringBuilder();
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        Intrinsics.checkExpressionValueIsNotNull(externalStorageDirectory, "Environment.getExternalStorageDirectory()");
        sb.append(externalStorageDirectory.getPath());
        sb.append("/BaoZ");
        ROOT_PATH = sb.toString();
    }

    private Global() {
    }

    public final String getSOCKETSERVER() {
        return SOCKETSERVER;
    }

    public final void setSOCKETSERVER(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        SOCKETSERVER = str;
    }

    public final String getSOCKET_TOKEN() {
        return SOCKET_TOKEN;
    }

    public final void setSOCKET_TOKEN(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        SOCKET_TOKEN = str;
    }

    public final String getSocketUrl(String str) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (!StringsKt.startsWith$default(str, "ws://", false, 2, (Object) null)) {
            str = "ws://" + str;
        }
        if (StringsKt.endsWith$default(str, "/robot", false, 2, (Object) null)) {
            return str;
        }
        return str + "/robot";
    }

    public final Context getContext() {
        BaseGlobal global = getGlobal();
        if (global != null) {
            return global.getContext();
        }
        return null;
    }

    public final BaseGlobal getGlobal() {
        String str = GlobalConst.TAG;
        if (str != null && str.hashCode() == 625552489 && str.equals(GlobalConst.TAG_DY)) {
            return DyGlobal.INSTANCE;
        }
        return null;
    }

    public final int getSource() {
        String str = GlobalConst.TAG;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 625552489) {
                if (hashCode == 625553077 && str.equals(GlobalConst.TAG_WECHAT)) {
                    return 1;
                }
            } else if (str.equals(GlobalConst.TAG_DY)) {
                return 2;
            }
        }
        return 0;
    }
}
