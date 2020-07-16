package com.xp.wx.spellbook.douyin.model;

import android.text.TextUtils;
import com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.profile.model.Fields;
import com.xp.wx.util.StringUtils;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0003J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\n\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\fJ\u0006\u0010\u0010\u001a\u00020\fJ\u0006\u0010\u0011\u001a\u00020\fJ\u0006\u0010\u0012\u001a\u00020\bJ\u0006\u0010\u0013\u001a\u00020\bJ\u0006\u0010\u0014\u001a\u00020\bJ\u0006\u0010\u0015\u001a\u00020\bJ\u0006\u0010\u0016\u001a\u00020\bJ\u0006\u0010\u0017\u001a\u00020\bJ\u0012\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0002R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001a"}, d2 = {"Lcom/xp/wx/spellbook/douyin/model/User;", "", "_user", "(Ljava/lang/Object;)V", "user", "getUser", "()Ljava/lang/Object;", "getAvatarLarger", "", "getAvatarThumb", "getBindPhone", "getFansCount", "", "getFavoritingCount", "getFollowStatus", "getFollowingCount", "getFriendCount", "getGender", "getNickname", "getSecUid", "getShortId", "getSignature", "getUid", "getUniqueId", "getUrlFromUrlModel", "urlModel", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: User.kt */
public final class User {
    private final Object user;

    public User(Object obj) {
        this.user = obj;
    }

    public final Object getUser() {
        return this.user;
    }

    public final String getBindPhone() {
        if (this.user == null) {
            return "";
        }
        String emptyIfNull = StringUtils.emptyIfNull((String) Fields.INSTANCE.getClassProfileModelUser_bindPhone().get(this.user));
        Intrinsics.checkExpressionValueIsNotNull(emptyIfNull, "StringUtils.emptyIfNull(…one.get(user) as String?)");
        return emptyIfNull;
    }

    public final int getFansCount() {
        if (this.user == null) {
            return 0;
        }
        return Fields.INSTANCE.getClassProfileModelUser_fansCount().getInt(this.user);
    }

    public final int getFavoritingCount() {
        if (this.user == null) {
            return 0;
        }
        return Fields.INSTANCE.getClassProfileModelUser_favoritingCount().getInt(this.user);
    }

    public final int getFollowingCount() {
        if (this.user == null) {
            return 0;
        }
        return Fields.INSTANCE.getClassProfileModelUser_followingCount().getInt(this.user);
    }

    public final int getFriendCount() {
        if (this.user == null) {
            return 0;
        }
        return Fields.INSTANCE.getClassProfileModelUser_friendCount().getInt(this.user);
    }

    public final int getGender() {
        if (this.user == null) {
            return 0;
        }
        return Fields.INSTANCE.getClassProfileModelUser_gender().getInt(this.user);
    }

    public final String getNickname() {
        if (this.user == null) {
            return "";
        }
        String emptyIfNull = StringUtils.emptyIfNull((String) Fields.INSTANCE.getClassProfileModelUser_nickname().get(this.user));
        Intrinsics.checkExpressionValueIsNotNull(emptyIfNull, "StringUtils.emptyIfNull(…ame.get(user) as String?)");
        return emptyIfNull;
    }

    public final String getSecUid() {
        if (this.user == null) {
            return "";
        }
        String emptyIfNull = StringUtils.emptyIfNull((String) Fields.INSTANCE.getClassProfileModelUser_secUid().get(this.user));
        Intrinsics.checkExpressionValueIsNotNull(emptyIfNull, "StringUtils.emptyIfNull(…Uid.get(user) as String?)");
        return emptyIfNull;
    }

    public final String getShortId() {
        if (this.user == null) {
            return "";
        }
        String emptyIfNull = StringUtils.emptyIfNull((String) Fields.INSTANCE.getClassProfileModelUser_shortId().get(this.user));
        Intrinsics.checkExpressionValueIsNotNull(emptyIfNull, "StringUtils.emptyIfNull(…tId.get(user) as String?)");
        return emptyIfNull;
    }

    public final String getUid() {
        if (this.user == null) {
            return "";
        }
        String emptyIfNull = StringUtils.emptyIfNull((String) Fields.INSTANCE.getClassProfileModelUser_uid().get(this.user));
        Intrinsics.checkExpressionValueIsNotNull(emptyIfNull, "StringUtils.emptyIfNull(…uid.get(user) as String?)");
        return emptyIfNull;
    }

    public final String getUniqueId() {
        if (this.user == null) {
            return "";
        }
        String emptyIfNull = StringUtils.emptyIfNull((String) Fields.INSTANCE.getClassProfileModelUser_uniqueId().get(this.user));
        Intrinsics.checkExpressionValueIsNotNull(emptyIfNull, "StringUtils.emptyIfNull(…eId.get(user) as String?)");
        return emptyIfNull;
    }

    public final String getSignature() {
        if (this.user == null) {
            return "";
        }
        String emptyIfNull = StringUtils.emptyIfNull((String) Fields.INSTANCE.getClassProfileModelUser_signature().get(this.user));
        Intrinsics.checkExpressionValueIsNotNull(emptyIfNull, "StringUtils.emptyIfNull(…ure.get(user) as String?)");
        return emptyIfNull;
    }

    public final String getAvatarThumb() {
        if (this.user == null) {
            return "";
        }
        return getUrlFromUrlModel(Fields.INSTANCE.getClassProfileModelUser_avatarThumb().get(this.user));
    }

    public final String getAvatarLarger() {
        if (this.user == null) {
            return "";
        }
        return getUrlFromUrlModel(Fields.INSTANCE.getClassProfileModelUser_avatarLarger().get(this.user));
    }

    private final String getUrlFromUrlModel(Object obj) {
        ArrayList<String> arrayList;
        if (!(obj == null || (arrayList = (ArrayList) com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.base.model.Fields.INSTANCE.getClassBaseModelUrlModel_urlList().get(obj)) == null || !(!arrayList.isEmpty()))) {
            for (String str : arrayList) {
                if (!TextUtils.isEmpty(str)) {
                    String emptyIfNull = StringUtils.emptyIfNull(str);
                    Intrinsics.checkExpressionValueIsNotNull(emptyIfNull, "StringUtils.emptyIfNull(it as String?)");
                    return emptyIfNull;
                }
            }
        }
        return "";
    }

    public final int getFollowStatus() {
        if (this.user == null) {
            return 0;
        }
        return Fields.INSTANCE.getClassProfileModelUser_followStatus().getInt(this.user);
    }
}
