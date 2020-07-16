package com.xp.wx.backend.douyin.model;

import android.text.TextUtils;
import com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.live.base.model.user.Fields;
import com.xp.wx.util.StringUtils;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\n\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\bJ\u0006\u0010\u000e\u001a\u00020\bJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\bJ\u0006\u0010\u0012\u001a\u00020\u0010J\u0012\u0010\u0013\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0002R\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0015"}, d2 = {"Lcom/xp/wx/backend/douyin/model/LiveUser;", "", "user", "(Ljava/lang/Object;)V", "userObj", "getUserObj", "()Ljava/lang/Object;", "getAvatarLarger", "", "getAvatarThumb", "getDisplayId", "getGender", "", "getNickName", "getSecUid", "getShortId", "", "getSignature", "getUid", "getUrlFromImageModel", "imageModel", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: LiveUser.kt */
public final class LiveUser {
    private final Object userObj;

    public LiveUser(Object obj) {
        Intrinsics.checkParameterIsNotNull(obj, "user");
        this.userObj = obj;
    }

    public final Object getUserObj() {
        return this.userObj;
    }

    public final String getNickName() {
        String emptyIfNull = StringUtils.emptyIfNull((String) Fields.INSTANCE.getClassLiveBaseModelUserUser_nickName().get(this.userObj));
        Intrinsics.checkExpressionValueIsNotNull(emptyIfNull, "StringUtils.emptyIfNull(….get(userObj) as String?)");
        return emptyIfNull;
    }

    public final String getDisplayId() {
        String emptyIfNull = StringUtils.emptyIfNull((String) Fields.INSTANCE.getClassLiveBaseModelUserUser_displayId().get(this.userObj));
        Intrinsics.checkExpressionValueIsNotNull(emptyIfNull, "StringUtils.emptyIfNull(….get(userObj) as String?)");
        return emptyIfNull;
    }

    public final long getUid() {
        return Fields.INSTANCE.getClassLiveBaseModelUserUser_id().getLong(this.userObj);
    }

    public final long getShortId() {
        return Fields.INSTANCE.getClassLiveBaseModelUserUser_shortId().getLong(this.userObj);
    }

    public final String getSecUid() {
        String emptyIfNull = StringUtils.emptyIfNull((String) Fields.INSTANCE.getClassLiveBaseModelUserUser_secUid().get(this.userObj));
        Intrinsics.checkExpressionValueIsNotNull(emptyIfNull, "StringUtils.emptyIfNull(….get(userObj) as String?)");
        return emptyIfNull;
    }

    public final int getGender() {
        return Fields.INSTANCE.getClassLiveBaseModelUserUser_gender().getInt(this.userObj);
    }

    public final String getSignature() {
        Object obj = Fields.INSTANCE.getClassLiveBaseModelUserUser_signature().get(this.userObj);
        if (obj != null) {
            String emptyIfNull = StringUtils.emptyIfNull((String) obj);
            Intrinsics.checkExpressionValueIsNotNull(emptyIfNull, "StringUtils.emptyIfNull(…e.get(userObj) as String)");
            return emptyIfNull;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
    }

    public final String getAvatarThumb() {
        return getUrlFromImageModel(Fields.INSTANCE.getClassLiveBaseModelUserUser_avatarThumb().get(this.userObj));
    }

    public final String getAvatarLarger() {
        return getUrlFromImageModel(Fields.INSTANCE.getClassLiveBaseModelUserUser_avatarLarge().get(this.userObj));
    }

    private final String getUrlFromImageModel(Object obj) {
        ArrayList arrayList;
        if (!(obj == null || (arrayList = (ArrayList) com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.live.base.model.Fields.INSTANCE.getClassLiveBaseModelImageModel_mUrls().get(obj)) == null || !(!arrayList.isEmpty()))) {
            for (Object next : arrayList) {
                String str = (String) next;
                if (!TextUtils.isEmpty(str)) {
                    if (next != null) {
                        String emptyIfNull = StringUtils.emptyIfNull(str);
                        Intrinsics.checkExpressionValueIsNotNull(emptyIfNull, "StringUtils.emptyIfNull(it as String)");
                        return emptyIfNull;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                }
            }
        }
        return "";
    }
}
