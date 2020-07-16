package com.wujieshuju.huidou;

import android.os.Environment;
import java.io.File;

public class Const {
    public static final String BASE_URL = "http://task.wujieshuju.com:8089";
    public static final String CONFIG_PATH = (ROOT_PATH + File.separator + "huidou" + File.separator + "config");
    public static final String CURRENT_DY_INFO_PATH = (CONFIG_PATH + File.separator + "current_dy_info.conf");
    public static final long GET_VERIFY_CODE_TIME = 60000;
    public static final String HD_CONFIG_PATH;
    public static final String MODIFY_FUNC_STATUS = "/huidouApi/Huidou/MoidfyFuncStatus";
    public static final String ROOT_PATH = (SDCARD_PATH + File.separator + "BaoZ");
    public static final String SDCARD_PATH = Environment.getExternalStorageDirectory().getPath();
    public static final String TAG = "BaoZhi-HD";
    public static final String TOKEN_PATH = (CONFIG_PATH + File.separator + "token.conf");
    public static final String URL_BIND_ASSISTANT = "/huidouApi/Huidou/BindAssistant";
    public static final String URL_BIND_ASSISTANT_DOUYING = "/huidouApi/Huidou/BindAssistantDouyin";
    public static final String URL_CONTACT_US = "http://m.youdd.wang";
    public static final String URL_CREATE_CODE = "/userCenterApi/UserCenter/CreateCode";
    public static final String URL_CREATE_ORDER = "/userCenterApi/UserCenter/CodePay";
    public static final String URL_FOCUS_ON_REPLY = "/huidouApi/Huidou/ModifyStReplySubscribe";
    public static final String URL_GET_ALL_FUNCTION_SETTING = "/huidouApi/Huidou/GetAllFuncSettings";
    public static final String URL_GET_PRODUCT_MSG = "/userCenterApi/UserCenter/GetProductMsg";
    public static final String URL_GET_ST_AUTO_SEND_GIFT = "/huidouApi/Huidou/GetStAutoSendGift";
    public static final String URL_GET_ST_SEND_BULLETIN = "/huidouApi/Huidou/GetStSendBulletin";
    public static final String URL_GET_USER_INFO = "/userCenterApi/UserCenter/GetUserMsgByUserId";
    public static final String URL_GET_USER_ORDER = "/userCenterApi/UserCenter/GetUserWalletPayment";
    public static final String URL_LOGIN = "/userCenterApi/UserCenter/Login";
    public static final String URL_LOGOUT = "/userCenterApi/UserCenter/LoginOut";
    public static final String URL_MANUALS = "https://shimo.im/docs/1lq7Mgo9oWsezBAe/";
    public static final String URL_MODIFY_AUTO_BUY = "/huidouApi/Huidou/ModifyStAutoShopping";
    public static final String URL_MODIFY_CLICK_SCREEN = "/huidouApi/Huidou/ModifyStAutoClick";
    public static final String URL_MODIFY_KEY_WORD_REPLY = "/huidouApi/Huidou/ModifyStReplyKeyword";
    public static final String URL_MODIFY_SENT_MSG_TO_FANS = "/huidouApi/Huidou/ModifyStSenFan";
    public static final String URL_MODIFY_ST_AUTO_SEND_GIFT = "/huidouApi/Huidou/ModifyStAutoSendGift";
    public static final String URL_MODIFY_ST_SEND_BULLETIN = "/huidouApi/Huidou/ModifyStSendBulletin";
    public static final String URL_MODIFY_WELCOME_MSG = "/huidouApi/Huidou/ModifyStReplyWelcome";
    public static final String URL_ONLINE = "http://task.wujieshuju.com:8089";
    public static final String URL_QUERY_PAY_STATUS = "/userCenterApi/UserCenter/CodeQuery";
    public static final String URL_RECEIVE_GIFT_MSG = "/huidouApi/Huidou/ModifyStReplyGift";
    public static final String URL_REGISTER = "/userCenterApi/UserCenter/Register";
    public static final String URL_RESET_PASSWORD = "/userCenterApi/UserCenter/ResetPassword";
    public static final String URL_TEST_196 = "http://120.55.98.196:8089";

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(CONFIG_PATH);
        sb.append(File.separator);
        sb.append("hd.conf");
        HD_CONFIG_PATH = sb.toString();
    }
}
