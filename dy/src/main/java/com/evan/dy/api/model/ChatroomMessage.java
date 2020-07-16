package com.evan.dy.api.model;

import android.text.TextUtils;

import com.ehook.utils.LogUtil;
import com.evan.dy.mirror.com.bytedance.android.livesdk.message.model.Classes;
import com.evan.dy.mirror.com.bytedance.android.livesdk.message.model.Fields;

import de.robv.android.xposed.XposedHelpers;

public class ChatroomMessage {
    private final Object message;

    public ChatroomMessage(Object obj) {
        this.message = obj;
    }


    public final Message getMessage() {
        Class<?> cls = this.message.getClass();
        if (TextUtils.equals(cls.getName(), Classes.INSTANCE.getGetClassLivesdkMessageModelN().getName())) {
            LogUtil.INSTANCE.e("ChatroomMessage", "TextMessage...");
            return new TextMessage(this.message);
        }
        if (TextUtils.equals(cls.getName(), Classes.INSTANCE.getGetClassLivesdkMessageModelBm().getName())) {
            LogUtil.INSTANCE.e("ChatroomMessage", "MemberMessage...");
            return new MemberMessage(this.message);
        }
        if (TextUtils.equals(cls.getName(), Classes.INSTANCE.getGetClassLivesdkMessageModelBa().getName())) {
            LogUtil.INSTANCE.e("ChatroomMessage", "LikeMessage...");
            return new LikeMessage(this.message);
        }
        if (TextUtils.equals(cls.getName(), Classes.INSTANCE.getGetClassLivesdkMessageModelAq().getName())) {
            LogUtil.INSTANCE.e("ChatroomMessage", "GiftMessage...");
            return new GiftMessage(this.message);
        }
        if (TextUtils.equals(cls.getName(), Classes.INSTANCE.getGetClassLivesdkMessageModelAa().getName())) {
            LogUtil.INSTANCE.e("ChatroomMessage", "DoodleMessage...");
            return new DoodleMessage(this.message);
        }
        if (TextUtils.equals(cls.getName(), Classes.INSTANCE.getGetClassLivesdkMessageModelV().getName())) {
            LogUtil.INSTANCE.e("ChatroomMessage", "ControlMessage...");
            return new ControlMessage(this.message);
        }
        if (TextUtils.equals(cls.getName(), Classes.INSTANCE.getGetClassLivesdkMessageModelCz().getName())) {
            LogUtil.INSTANCE.e("ChatroomMessage", "SocialMessage...");
            return new SocialMessage(this.message);
        }
        LogUtil.INSTANCE.e("ChatroomMessage", "NormalMessage...");
        return new NormalMessage(this.message);
    }

    public static class Message {
        private final Object message;

        public LiveUser getUser() {
            return null;
        }

        public Message(Object obj) {
            this.message = obj;
        }

        public final Object getMessage() {
            return this.message;
        }

        public final int getMessageType() {
            Object type = XposedHelpers.callMethod(this.message, "getIntType");
            return (int) type;
        }

        @Override
        public String toString() {
            return "Message{" +
                "message=" + message +
                '}' +
                "LiveUser{" +
                   getUser().toString() +
                '}'

                ;
        }
    }

    public static final class TextMessage extends Message {
        public TextMessage(Object obj) {
            super(obj);
        }
        public final String getText() {
            String text = null;
            try {
                text = (String) Fields.INSTANCE.getClassLivesdkMessageModelN_c().get(getMessage());
            } catch (Exception e) {
                e.printStackTrace();
            }
            return text;
        }

        @Override
        public String toString() {
            return "text=" + getText();
        }

        @Override
        public LiveUser getUser() {
            Object obj = null;
            try {
                obj = Fields.INSTANCE.getClassLivesdkMessageModelN_user().get(getMessage());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            return new LiveUser(obj);
        }
    }
    public static final class MemberMessage extends Message {
        public MemberMessage(Object obj) {
            super(obj);
        }

        public final String getText() {
            String text = "";
            try {
                text = (String) Fields.INSTANCE.getClassLivesdkMessageModelBm_k().get(getMessage());
            } catch (Exception e) {
                e.printStackTrace();
            }
            return text;
        }
        @Override
        public String toString() {
            return "text=" + getText();
        }
        @Override
        public LiveUser getUser() {
            Object obj = null;
            try {
                obj = Fields.INSTANCE.getClassLivesdkMessageModelBm_user().get(getMessage());
            } catch (Exception e) {
                e.printStackTrace();
            }
            return new LiveUser(obj);
        }
    }
    public static final class LikeMessage extends Message {
        public LikeMessage(Object obj) {
            super(obj);
        }
        public LiveUser getUser() {
            Object obj = null;
            try {
                obj = Fields.INSTANCE.getClassLivesdkMessageModelZ_user().get(getMessage());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            return new LiveUser(obj);
        }
    }

    public static final class GiftMessage extends Message {
        private  Object giftObj;

        public GiftMessage(Object obj) {
            super(obj);
            try {
                Fields.INSTANCE.getClassLivesdkMessageModelAq_gift().get(getMessage());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        public final Object getGiftObj() {
            return this.giftObj;
        }

        @Override
        public LiveUser getUser() {
            Object obj = null;
            try {
                obj = Fields.INSTANCE.getClassLivesdkMessageModelAq_user().get(getMessage());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            return new LiveUser(obj);
        }

        public final int getRepeatEnd() {
            try {
                return  Fields.INSTANCE.getClassLivesdkMessageModelAq_repeatEnd().getInt(getMessage());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            return 0;
        }

        public final String getGiftName() {
            if (this.giftObj == null) {
                return "";
            }
            try {
                return (String) com.evan.dy.mirror.com.bytedance.android.livesdk.gift.model.Fields.INSTANCE.getClassLivesdkGiftModelD_name().get(this.giftObj);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            return "";
        }
        @Override
        public String toString() {
            return "giftName=" + getGiftName();
        }
        public final String getGiftDescribe() {
            if (this.giftObj == null) {
                return "";
            }
            try {
                return (String) com.evan.dy.mirror.com.bytedance.android.livesdk.gift.model.Fields.INSTANCE.getClassLivesdkGiftModelD_describe().get(this.giftObj);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            return "";
        }
        public final long getGiftId() {
            if (this.giftObj == null) {
                return -1;
            }
            try {
                return com.evan.dy.mirror.com.bytedance.android.livesdk.gift.model.Fields.INSTANCE.getClassLivesdkGiftModelD_id().getLong(this.giftObj);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            return -1;
        }

        public final int getGiftType() {
            if (this.giftObj == null) {
                return -1;
            }
            try {
                return com.evan.dy.mirror.com.bytedance.android.livesdk.gift.model.Fields.INSTANCE.getClassLivesdkGiftModelD_type().getInt(this.giftObj);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            return -1;
        }

        public final boolean combo() {
            if (this.giftObj == null) {
                return false;
            }
            try {
                return com.evan.dy.mirror.com.bytedance.android.livesdk.gift.model.Fields.INSTANCE.getClassLivesdkGiftModelD_combo().getBoolean(this.giftObj);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            return false;
        }
    }

    public static final class DoodleMessage extends Message {
        public DoodleMessage(Object obj) {
            super(obj);
        }

        @Override
        public LiveUser getUser() {
            Object obj = null;
            try {
                obj = Fields.INSTANCE.getClassLivesdkMessageModelAa_user().get(getMessage());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            return new LiveUser(obj);
        }

        public final long getDoodleId() {
            try {
                return  Fields.INSTANCE.getClassLivesdkMessageModelAa_id().getLong(getMessage());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            return -1;
        }
    }

    public static final class ControlMessage extends Message {
        public ControlMessage(Object obj) {
            super(obj);
        }

        public final int getAction() {
            try {
                return  Fields.INSTANCE.getClassLivesdkMessageModelV_b().getInt(getMessage());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            return -1;
        }
    }

    public static final class SocialMessage extends Message {
        public SocialMessage(Object obj) {
            super(obj);
        }

        public final long getAction() {
            try {
                return  Fields.INSTANCE.getClassLivesdkMessageModelCz_action().getLong(getMessage());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            return -1;
        }

        @Override
        public LiveUser getUser() {
            Object obj = null;
            try {
                obj = Fields.INSTANCE.getClassLivesdkMessageModelCz_user().get(getMessage());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            return new LiveUser(obj);
        }
    }

    public static final class NormalMessage extends Message {
        public NormalMessage(Object obj) {
            super(obj);
        }
    }
}

