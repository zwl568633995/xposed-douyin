package com.evan.dy.api.model.dy;

import com.ehook.utils.LogUtil;
import com.evan.dy.api.model.LiveUser;
import com.evan.dy.utils.JsonUtils;

import org.json.JSONObject;

public interface DyLiveMessage {
    public class DyMessage<T> extends BaseSN<T> {
        public Object user;
        public int messageType;
        public Long messageId;

        @Override
        public T parseFrom(Object obj) {
            return null;
        }

        public void print(Object object) {
            JSONObject jsonObject = JsonUtils.parseBySerializedName2JsonObject(object);
            LogUtil.INSTANCE.e("DyMessage", JsonUtils.toJson(jsonObject));
        }

        public LiveUser getLiveUser() {
            return new LiveUser(user);
        }

        @Override
        public String toString() {
            return "DyMessage{" +
                ", messageType=" + messageType +
                ", messageId=" + messageId +
                '}';
        }
    }

    public class NormalMessage extends DyMessage<NormalMessage> {
        @Override
        public NormalMessage parseFrom(Object obj) {
            return JsonUtils.parseBySerializedName(obj, NormalMessage.class);
        }

        public LiveUser getLiveUser() {
            return new LiveUser(user);
        }
    }

    public class TextMessage extends DyMessage<TextMessage> {
        public String content;

        @Override
        public TextMessage parseFrom(Object obj) {
            return JsonUtils.parseBySerializedName(obj, TextMessage.class);
        }

        public LiveUser getLiveUser() {
            return new LiveUser(user);
        }

        @Override
        public String toString() {
            return "TextMessage{" +
                "nickName=" + getLiveUser().getUser().nickName +
                "messageType=" + messageType +
                ", messageId=" + messageId +
                ", content='" + content + '\'' +
                '}';
        }
    }

    public class MemberMessage extends DyMessage<MemberMessage> {

        public int action;
        public String action_description;

        @Override
        public MemberMessage parseFrom(Object obj) {
            return JsonUtils.parseBySerializedName(obj, MemberMessage.class);
        }

        @Override
        public String toString() {
            return "MemberMessage{" +
                "nickName=" + getLiveUser().getUser().nickName +
                ", action=" + action +
                ", action_description='" + action_description + '\'' +
                '}';
        }
    }

    //com.bytedance.android.livesdk.gift.model.d
    public class GiftMessage extends DyMessage<GiftMessage> {

        public long gift_id;
        public int repeat_end;
        public Object gift;
        public DyGiftPage.DyGift dyGift;

        public String getGiftName() {
            if (getGift() != null) {
                return getGift().name;
            }
            return "";
        }

        public DyGiftPage.DyGift getGift() {
            if (dyGift == null) {
                dyGift = new DyGiftPage.DyGift().parseFrom(gift);
            }
            return dyGift;
        }

        @Override
        public GiftMessage parseFrom(Object obj) {
//            LogUtil.INSTANCE.e("xxxxx","xxxxx"+JsonUtils.toJson(obj));
            return JsonUtils.parseBySerializedName(obj, GiftMessage.class);
        }

        @Override
        public String toString() {
            return "GiftMessage{" +
                "nickName=" + getLiveUser().getUser().nickName +
                "messageType=" + messageType +
                ", messageId=" + messageId +
                ", gift_id=" + gift_id +
                ", gift_name='" + getGiftName() +
                '}';
        }
    }
}
