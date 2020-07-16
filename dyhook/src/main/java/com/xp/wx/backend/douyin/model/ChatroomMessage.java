package com.xp.wx.backend.douyin.model;

import com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.livesdk.message.model.Classes;
import com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.livesdkapi.depend.g.Methods;
import com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.livesdkapi.message.Fields;
import com.xp.wx.util.StringUtils;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\t\b\t\n\u000b\f\r\u000e\u000f\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0006\u0010\u0005\u001a\u00020\u0007R\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/xp/wx/backend/douyin/model/ChatroomMessage;", "", "_message", "(Ljava/lang/Object;)V", "message", "getMessage", "()Ljava/lang/Object;", "Lcom/xp/wx/backend/douyin/model/ChatroomMessage$Message;", "ControlMessage", "DoodleMessage", "GiftMessage", "LikeMessage", "MemberMessage", "Message", "NormalMessage", "SocialMessage", "TextMessage", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: ChatroomMessage.kt */
public final class ChatroomMessage {
    private final Object message;

    public ChatroomMessage(Object obj) {
        Intrinsics.checkParameterIsNotNull(obj, "_message");
        this.message = obj;
    }

    /* renamed from: getMessage  reason: collision with other method in class */
    public final Object m59getMessage() {
        return this.message;
    }

    public final Message getMessage() {
        Class<?> cls = this.message.getClass();
        if (Intrinsics.areEqual((Object) cls, (Object) Classes.INSTANCE.getClassLivesdkMessageModelN())) {
            return new TextMessage(this.message);
        }
        if (Intrinsics.areEqual((Object) cls, (Object) Classes.INSTANCE.getClassLivesdkMessageModelBm())) {
            return new MemberMessage(this.message);
        }
        if (Intrinsics.areEqual((Object) cls, (Object) Classes.INSTANCE.getClassLivesdkMessageModelBa())) {
            return new LikeMessage(this.message);
        }
        if (Intrinsics.areEqual((Object) cls, (Object) Classes.INSTANCE.getClassLivesdkMessageModelAq())) {
            return new GiftMessage(this.message);
        }
        if (Intrinsics.areEqual((Object) cls, (Object) Classes.INSTANCE.getClassLivesdkMessageModelAa())) {
            return new DoodleMessage(this.message);
        }
        if (Intrinsics.areEqual((Object) cls, (Object) Classes.INSTANCE.getClassLivesdkMessageModelV())) {
            return new ControlMessage(this.message);
        }
        if (Intrinsics.areEqual((Object) cls, (Object) Classes.INSTANCE.getClassLivesdkMessageModelCz())) {
            return new SocialMessage(this.message);
        }
        return new NormalMessage(this.message);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0006\u0010\u0007\u001a\u00020\bJ\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/xp/wx/backend/douyin/model/ChatroomMessage$Message;", "", "_message", "(Ljava/lang/Object;)V", "message", "getMessage", "()Ljava/lang/Object;", "getMessageType", "", "getUser", "Lcom/xp/wx/backend/douyin/model/LiveUser;", "app_release"}, k = 1, mv = {1, 1, 13})
    /* compiled from: ChatroomMessage.kt */
    public static class Message {
        private final Object message;

        public LiveUser getUser() {
            return null;
        }

        public Message(Object obj) {
            Intrinsics.checkParameterIsNotNull(obj, "_message");
            this.message = obj;
        }

        public final Object getMessage() {
            return this.message;
        }

        public final int getMessageType() {
            Object invoke = Methods.INSTANCE.getClassLivesdkapiDependGA_getIntType().invoke(Fields.INSTANCE.getClassLivesdkapiMessageA_type().get(this.message), new Object[0]);
            if (invoke != null) {
                return ((Integer) invoke).intValue();
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/xp/wx/backend/douyin/model/ChatroomMessage$TextMessage;", "Lcom/xp/wx/backend/douyin/model/ChatroomMessage$Message;", "_message", "", "(Ljava/lang/Object;)V", "getText", "", "getUser", "Lcom/xp/wx/backend/douyin/model/LiveUser;", "app_release"}, k = 1, mv = {1, 1, 13})
    /* compiled from: ChatroomMessage.kt */
    public static final class TextMessage extends Message {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public TextMessage(Object obj) {
            super(obj);
            Intrinsics.checkParameterIsNotNull(obj, "_message");
        }

        public final String getText() {
            String emptyIfNull = StringUtils.emptyIfNull((String) com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.livesdk.message.model.Fields.INSTANCE.getClassLivesdkMessageModelN_c().get(getMessage()));
            Intrinsics.checkExpressionValueIsNotNull(emptyIfNull, "StringUtils.emptyIfNull(….get(message) as String?)");
            return emptyIfNull;
        }

        public LiveUser getUser() {
            Object obj = com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.livesdk.message.model.Fields.INSTANCE.getClassLivesdkMessageModelN_user().get(getMessage());
            Intrinsics.checkExpressionValueIsNotNull(obj, "ClassLivesdkMessageModelN_user.get(message)");
            return new LiveUser(obj);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/xp/wx/backend/douyin/model/ChatroomMessage$MemberMessage;", "Lcom/xp/wx/backend/douyin/model/ChatroomMessage$Message;", "_message", "", "(Ljava/lang/Object;)V", "getText", "", "getUser", "Lcom/xp/wx/backend/douyin/model/LiveUser;", "app_release"}, k = 1, mv = {1, 1, 13})
    /* compiled from: ChatroomMessage.kt */
    public static final class MemberMessage extends Message {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MemberMessage(Object obj) {
            super(obj);
            Intrinsics.checkParameterIsNotNull(obj, "_message");
        }

        public final String getText() {
            String emptyIfNull = StringUtils.emptyIfNull((String) com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.livesdk.message.model.Fields.INSTANCE.getClassLivesdkMessageModelBm_k().get(getMessage()));
            Intrinsics.checkExpressionValueIsNotNull(emptyIfNull, "StringUtils.emptyIfNull(….get(message) as String?)");
            return emptyIfNull;
        }

        public LiveUser getUser() {
            Object obj = com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.livesdk.message.model.Fields.INSTANCE.getClassLivesdkMessageModelBm_user().get(getMessage());
            Intrinsics.checkExpressionValueIsNotNull(obj, "ClassLivesdkMessageModelBm_user.get(message)");
            return new LiveUser(obj);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/xp/wx/backend/douyin/model/ChatroomMessage$LikeMessage;", "Lcom/xp/wx/backend/douyin/model/ChatroomMessage$Message;", "_message", "", "(Ljava/lang/Object;)V", "getUser", "Lcom/xp/wx/backend/douyin/model/LiveUser;", "app_release"}, k = 1, mv = {1, 1, 13})
    /* compiled from: ChatroomMessage.kt */
    public static final class LikeMessage extends Message {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public LikeMessage(Object obj) {
            super(obj);
            Intrinsics.checkParameterIsNotNull(obj, "_message");
        }

        public LiveUser getUser() {
            Object obj = com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.livesdk.message.model.Fields.INSTANCE.getClassLivesdkMessageModelZ_user().get(getMessage());
            Intrinsics.checkExpressionValueIsNotNull(obj, "ClassLivesdkMessageModelZ_user.get(message)");
            return new LiveUser(obj);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\fJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0019\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/xp/wx/backend/douyin/model/ChatroomMessage$GiftMessage;", "Lcom/xp/wx/backend/douyin/model/ChatroomMessage$Message;", "_message", "", "(Ljava/lang/Object;)V", "giftObj", "kotlin.jvm.PlatformType", "getGiftObj", "()Ljava/lang/Object;", "combo", "", "getGiftDescribe", "", "getGiftId", "", "getGiftName", "getGiftType", "", "getRepeatEnd", "getUser", "Lcom/xp/wx/backend/douyin/model/LiveUser;", "app_release"}, k = 1, mv = {1, 1, 13})
    /* compiled from: ChatroomMessage.kt */
    public static final class GiftMessage extends Message {
        private final Object giftObj = com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.livesdk.message.model.Fields.INSTANCE.getClassLivesdkMessageModelAq_gift().get(getMessage());

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public GiftMessage(Object obj) {
            super(obj);
            Intrinsics.checkParameterIsNotNull(obj, "_message");
        }

        public final Object getGiftObj() {
            return this.giftObj;
        }

        public LiveUser getUser() {
            Object obj = com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.livesdk.message.model.Fields.INSTANCE.getClassLivesdkMessageModelAq_user().get(getMessage());
            Intrinsics.checkExpressionValueIsNotNull(obj, "ClassLivesdkMessageModelAq_user.get(message)");
            return new LiveUser(obj);
        }

        public final int getRepeatEnd() {
            return com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.livesdk.message.model.Fields.INSTANCE.getClassLivesdkMessageModelAq_repeatEnd().getInt(getMessage());
        }

        public final String getGiftName() {
            if (this.giftObj == null) {
                return "";
            }
            String emptyIfNull = StringUtils.emptyIfNull((String) com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.livesdk.gift.model.Fields.INSTANCE.getClassLivesdkGiftModelD_name().get(this.giftObj));
            Intrinsics.checkExpressionValueIsNotNull(emptyIfNull, "StringUtils.emptyIfNull(….get(giftObj) as String?)");
            return emptyIfNull;
        }

        public final String getGiftDescribe() {
            if (this.giftObj == null) {
                return "";
            }
            String emptyIfNull = StringUtils.emptyIfNull((String) com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.livesdk.gift.model.Fields.INSTANCE.getClassLivesdkGiftModelD_describe().get(this.giftObj));
            Intrinsics.checkExpressionValueIsNotNull(emptyIfNull, "StringUtils.emptyIfNull(….get(giftObj) as String?)");
            return emptyIfNull;
        }

        public final long getGiftId() {
            if (this.giftObj == null) {
                return -1;
            }
            return com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.livesdk.gift.model.Fields.INSTANCE.getClassLivesdkGiftModelD_id().getLong(this.giftObj);
        }

        public final int getGiftType() {
            if (this.giftObj == null) {
                return -1;
            }
            return com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.livesdk.gift.model.Fields.INSTANCE.getClassLivesdkGiftModelD_type().getInt(this.giftObj);
        }

        public final boolean combo() {
            if (this.giftObj == null) {
                return false;
            }
            return com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.livesdk.gift.model.Fields.INSTANCE.getClassLivesdkGiftModelD_combo().getBoolean(this.giftObj);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/xp/wx/backend/douyin/model/ChatroomMessage$DoodleMessage;", "Lcom/xp/wx/backend/douyin/model/ChatroomMessage$Message;", "_message", "", "(Ljava/lang/Object;)V", "getDoodleId", "", "getUser", "Lcom/xp/wx/backend/douyin/model/LiveUser;", "app_release"}, k = 1, mv = {1, 1, 13})
    /* compiled from: ChatroomMessage.kt */
    public static final class DoodleMessage extends Message {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DoodleMessage(Object obj) {
            super(obj);
            Intrinsics.checkParameterIsNotNull(obj, "_message");
        }

        public LiveUser getUser() {
            Object obj = com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.livesdk.message.model.Fields.INSTANCE.getClassLivesdkMessageModelAa_user().get(getMessage());
            Intrinsics.checkExpressionValueIsNotNull(obj, "ClassLivesdkMessageModelAa_user.get(message)");
            return new LiveUser(obj);
        }

        public final long getDoodleId() {
            return com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.livesdk.message.model.Fields.INSTANCE.getClassLivesdkMessageModelAa_id().getLong(getMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/xp/wx/backend/douyin/model/ChatroomMessage$ControlMessage;", "Lcom/xp/wx/backend/douyin/model/ChatroomMessage$Message;", "_message", "", "(Ljava/lang/Object;)V", "getAction", "", "app_release"}, k = 1, mv = {1, 1, 13})
    /* compiled from: ChatroomMessage.kt */
    public static final class ControlMessage extends Message {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ControlMessage(Object obj) {
            super(obj);
            Intrinsics.checkParameterIsNotNull(obj, "_message");
        }

        public final int getAction() {
            return com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.livesdk.message.model.Fields.INSTANCE.getClassLivesdkMessageModelV_b().getInt(getMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/xp/wx/backend/douyin/model/ChatroomMessage$SocialMessage;", "Lcom/xp/wx/backend/douyin/model/ChatroomMessage$Message;", "_message", "", "(Ljava/lang/Object;)V", "getAction", "", "getUser", "Lcom/xp/wx/backend/douyin/model/LiveUser;", "app_release"}, k = 1, mv = {1, 1, 13})
    /* compiled from: ChatroomMessage.kt */
    public static final class SocialMessage extends Message {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SocialMessage(Object obj) {
            super(obj);
            Intrinsics.checkParameterIsNotNull(obj, "_message");
        }

        public final long getAction() {
            return com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.livesdk.message.model.Fields.INSTANCE.getClassLivesdkMessageModelCz_action().getLong(getMessage());
        }

        public LiveUser getUser() {
            Object obj = com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.livesdk.message.model.Fields.INSTANCE.getClassLivesdkMessageModelCz_user().get(getMessage());
            Intrinsics.checkExpressionValueIsNotNull(obj, "ClassLivesdkMessageModelCz_user.get(message)");
            return new LiveUser(obj);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/xp/wx/backend/douyin/model/ChatroomMessage$NormalMessage;", "Lcom/xp/wx/backend/douyin/model/ChatroomMessage$Message;", "_message", "", "(Ljava/lang/Object;)V", "app_release"}, k = 1, mv = {1, 1, 13})
    /* compiled from: ChatroomMessage.kt */
    public static final class NormalMessage extends Message {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public NormalMessage(Object obj) {
            super(obj);
            Intrinsics.checkParameterIsNotNull(obj, "_message");
        }
    }
}
