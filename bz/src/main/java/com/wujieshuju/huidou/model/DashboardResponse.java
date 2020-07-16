package com.wujieshuju.huidou.model;

import com.wujieshuju.huidou.network.BaseResponse;
import java.util.ArrayList;

public class DashboardResponse extends BaseResponse<data> {

    public static class CommonConfig {

        /* renamed from: id */
        public int f986id;
        public int status;
    }

    public static class ReplyKeyword {
        public String key;
        public String value;
    }

    public static class ReplyKeywordList extends ArrayList<ReplyKeyword> {
    }

    public static class StSendBulletin extends CommonConfig {
        public String content;
        public int interval;
    }

    public static class assistantBindDouyin extends CommonConfig {
        public String msg;
    }

    public static class data {
        public assistantBindDouyin assistantBindDouyin;
        public ArrayList<String> funcEnable;
        public masterSwitchStatus masterSwitchStatus;
        public stAutoClick stAutoClick;
        public stAutoSendGift stAutoSendGift;
        public stAutoShopping stAutoShopping;
        public stAutoSubscribe stAutoSubscribe;
        public stReplyGift stReplyGift;
        public stReplyKeyword stReplyKeyword;
        public stReplySubscribe stReplySubscribe;
        public stReplyWelcome stReplyWelcome;
        public stSenFan stSenFan;
        public StSendBulletin stSendBulletin;
    }

    public static class masterSwitchStatus extends CommonConfig {
        public int assistant_id;
        public int type;
    }

    public static class stAutoClick extends CommonConfig {
        public int threshold;
    }

    public static class stAutoSendGift extends CommonConfig {
        public String gift_json;
        public int interval;
        public int threshold;
    }

    public static class stAutoShopping extends CommonConfig {
        public int interval;
    }

    public static class stAutoSubscribe extends CommonConfig {
        public int interval;
        public int threshold;
    }

    public static class stReplyGift extends CommonConfig {
        public String content;
        public String gift_json;
    }

    public static class stReplyKeyword extends CommonConfig {
        public String content;
    }

    public static class stReplySubscribe extends CommonConfig {
        public String content;
    }

    public static class stReplyWelcome extends CommonConfig {
        public String content;
    }

    public static class stSenFan extends CommonConfig {
        public String content;
        public int interval;
        public int max_send_num;
        public int sex_type;
        public int subscribe_type;
    }
}
