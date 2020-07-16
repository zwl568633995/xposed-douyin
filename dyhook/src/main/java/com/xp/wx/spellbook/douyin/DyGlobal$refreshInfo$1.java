package com.xp.wx.spellbook.douyin;

import com.xp.wx.backend.douyin.model.DyUser;
import com.xp.wx.backend.douyin.util.ConfigUtil;
import com.xp.wx.spellbook.douyin.model.User;
import com.xp.wx.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 13})
/* compiled from: DyGlobal.kt */
final class DyGlobal$refreshInfo$1 implements Runnable {
    public static final DyGlobal$refreshInfo$1 INSTANCE = new DyGlobal$refreshInfo$1();

    DyGlobal$refreshInfo$1() {
    }

    public final void run() {
        DyUser lastLoginDyInfo = ConfigUtil.INSTANCE.getLastLoginDyInfo();
        String str = lastLoginDyInfo.uid;
        User user = DyGlobal.INSTANCE.getUser();
        if (user == null) {
            Intrinsics.throwNpe();
        }
        if (!Intrinsics.areEqual((Object) str, (Object) user.getUid())) {
            User user2 = DyGlobal.INSTANCE.getUser();
            if (user2 == null) {
                Intrinsics.throwNpe();
            }
            String uid = user2.getUid();
            User user3 = DyGlobal.INSTANCE.getUser();
            if (user3 == null) {
                Intrinsics.throwNpe();
            }
            String uniqueId = user3.getUniqueId();
            User user4 = DyGlobal.INSTANCE.getUser();
            if (user4 == null) {
                Intrinsics.throwNpe();
            }
            String secUid = user4.getSecUid();
            User user5 = DyGlobal.INSTANCE.getUser();
            if (user5 == null) {
                Intrinsics.throwNpe();
            }
            String nickname = user5.getNickname();
            User user6 = DyGlobal.INSTANCE.getUser();
            if (user6 == null) {
                Intrinsics.throwNpe();
            }
            lastLoginDyInfo = new DyUser(uid, uniqueId, secUid, nickname, user6.getAvatarLarger());
            ConfigUtil.INSTANCE.saveCurrentDyInfo(lastLoginDyInfo);
        }
        if (lastLoginDyInfo.isBind) {
            ConfigUtil.INSTANCE.initConfig();
            return;
        }
        Log.debug('\'' + lastLoginDyInfo.uid + "' not bind");
        ConfigUtil.INSTANCE.destroyTask();
    }
}
