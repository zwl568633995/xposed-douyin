package com.xp.wx.backend.douyin.model;

import java.util.ArrayList;

public class DyConfig {
    public AssistantBindDouyin assistantBindDouyin;
    public MasterSwitchStatus masterSwitchStatus;
    public StAutoClick stAutoClick;
    public StAutoSendGift stAutoSendGift;
    public StAutoShopping stAutoShopping;
    public StAutoSubscribe stAutoSubscribe;
    public StReplyGift stReplyGift;
    public StReplyKeyword stReplyKeyword;
    public StReplySubscribe stReplySubscribe;
    public StReplyWelcome stReplyWelcome;
    public StSenFan stSenFan;
    public StSendBulletin stSendBulletin;

    public static class AssistantBindDouyin extends CommonConfig {
        public String msg;
    }

    public static class CommonConfig {
        public int id;
        public int status;
    }

    public static class GiftList extends ArrayList<String> {
    }

    public static class MasterSwitchStatus extends CommonConfig {
        public int assistant_id;
        public int type;
    }

    public static class ReplyKeyword {
        public String key;
        public String value;
    }

    public static class ReplyKeywordList extends ArrayList<ReplyKeyword> {
    }

    public static class StAutoClick extends CommonConfig {
        public int threshold;
    }

    public static class StAutoSendGift extends CommonConfig {
        public String gift_json;
        public int interval;
        public int threshold;
    }

    public static class StAutoShopping extends CommonConfig {
        public int interval;
    }

    public static class StAutoSubscribe extends CommonConfig {
        public int interval;
        public int threshold;
    }

    public static class StReplyGift extends CommonConfig {
        public String content;
        public String gift_json;
    }

    public static class StReplyKeyword extends CommonConfig {
        public String content;
    }

    public static class StReplySubscribe extends CommonConfig {
        public String content;
    }

    public static class StReplyWelcome extends CommonConfig {
        public String content;
    }

    public static class StSenFan extends CommonConfig {
        public String content;
        public int interval;
        public int max_send_num;
        public int sex_type;
        public int subscribe_type;
    }

    public static class StSendBulletin extends CommonConfig {
        public String content;
        public int interval;
    }
}
