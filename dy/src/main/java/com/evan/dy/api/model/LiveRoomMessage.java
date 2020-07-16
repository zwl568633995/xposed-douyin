package com.evan.dy.api.model;

import com.evan.dy.api.model.dy.DyLiveMessage;

import de.robv.android.xposed.XposedHelpers;

public class LiveRoomMessage {
    private final Object obj;

    public LiveRoomMessage(Object obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }

    public int getMessageType() {
        Object intType = XposedHelpers.callMethod(obj, "getIntType");
        return (int) intType;
    }

    public long getMessageId() {
        long messageId = (long) XposedHelpers.callMethod(obj, "getMessageId");
        return messageId;
    }

    public DyLiveMessage.DyMessage getMessage() {
        DyLiveMessage.DyMessage dyMessage;
        int messageType = getMessageType();
        if (getMessageType() == MessageEnum.MEMBER.ordinal()) {
            dyMessage = new DyLiveMessage.MemberMessage().parseFrom(getObj());
        }
        else if (getMessageType() == MessageEnum.CHAT.ordinal()) {
            dyMessage = new DyLiveMessage.TextMessage().parseFrom(getObj());
        } else if (getMessageType() == MessageEnum.GIFT.ordinal()) {
            dyMessage = new DyLiveMessage.GiftMessage().parseFrom(getObj());
        } else {
//            new Message.NormalMessage().print(obj);
            dyMessage = new DyLiveMessage.NormalMessage().parseFrom(getObj());
        }
        dyMessage.messageType = messageType;
        dyMessage.messageId = getMessageId();
        return dyMessage;
    }

    @Override
    public String toString() {
        return "LiveRoomMessage{" +
//            "message=" + message +
            ", obj=" + obj +
            ", messageType=" + getMessageType() +
            ", messageId=" + getMessageId() +
            '}';
    }










































    public enum MessageEnum {
        HELLO(0, "Hello"),
        SETTING(0, "Setting"),
        GET_SETTING(0, "GetSettting"),
        REQUEST_RECONNECT(0, "RequestReconnect"),
        DEFAULT(0, "--default--"),
        DIGG(0, "WebcastDiggMessage"),
        GIFT(0, "WebcastGiftMessage"),
        GIFT_GROUP(0, "GiftGroupMessage"),
        SYSTEM(0, "SystemMessage"),
        CHAT(0, "WebcastChatMessage"),
        CONTROL(0, "WebcastControlMessage"),
        MEMBER(0, "WebcastMemberMessage"),
        ROOM(0, "WebcastRoomMessage"),
        SOCIAL(0, "WebcastSocialMessage"),
        SCREEN(0, "WebcastScreenChatMessage"),
        NOTICE(0, "NoticeListUnreadCountMessage"),
        ROOM_START(0, "RoomStartMessage"),
        ROOM_NOTIFY(0, "WebcastRoomNotifyMessage"),
        REMIND(0, "WebcastNoticeMessage"),
        DAILY_RANK(0, "WebcastSunDailyRankMessage"),
        ROOM_PUSH(0, "WebcastRoomBottomMessage"),
        DOODLE_GIFT(0, "WebcastDoodleGiftMessage"),
        MODIFY_DECORATION(0, "WebcastDecorationModifyMethod"),
        USER_STATS(0, "WebcastUserStatsMessage"),
        IN_ROOM_BANNER_MESSAGE(0, "WebcastInRoomBannerMessage"),
        ROOM_RICH_CHAT_MESSAGE(0, "WebcastSpecialPushMessage"),
        IM_MESSAGE(0, "IESChatMessage"),
        PROMOTION_CARD_MESSAGE(0, "WebcastPushRoomAdCard"),
        BANNER_RED_POINT(0, "WebcastInRoomBannerRedPoint"),
        LINK_MIC(0, "WebcastLinkMicMethod"),
        LINK_MIC_SIGNAL(0, "WebcastLinkMicSignalingMethod"),
        NOTICE_COUNT(0, "NoticeCountMessage"),
        CLOUD_CONTROL(0, "CloudControl"),
        ROOM_IMG_MESSAGE(0, "WebcastRoomImgMessage"),
        BATTLE_MODE(0, "WebcastBattleModeMessage"),
        GAME_QUIZ(0, "WebcastGamblingStatusChangedMessage"),
        LINK_MIC_ARMIES(0, "WebcastLinkMicArmiesMethod"),
        LINK_MIC_BATTLE(0, "WebcastLinkMicBattleMethod"),
        LINK_MIC_BATTLE_FINISH(0, "WebcastLinkMicBattleFinishMethod"),
        LINK_MIC_BATTLE_TASK(0, "WebcastLinkMicBattleTaskMessage"),
        LINK_MIC_BATTLE_PUNISH(0, "WebcastLinkMicBattlePunishMethod"),
        LOTTERY_EVENT(0, "WebcastLotteryEventMessage"),
        TURN_TABLE_BURST_V2(0, "WebcastLotteryBurstMessage"),
        COMMON_TOAST(0, "WebcastCommonToastMessage"),
        COMMON_GUIDE(0, "WebcastCommonGuideMessage"),
        GIFT_UPDATE(0, "WebcastGiftUpdateMessage"),
        LUCKY_BOX(0, "WebcastLuckyBoxMessage"),
        COMMENT_IMAGE(0, "WebcastCommentsMessage"),
        FANS_CLUB_STATISTICS(0, "WebcastFansclubStatisticsMessage"),
        USER_SEQ(0, "WebcastRoomUserSeqMessage"),
        LIVE_SHOPPING(0, "WebcastLiveShoppingMessage"),
        FANS_CLUB(0, "WebcastFansclubMessage"),
        CREATE_RED_PACKET(0, "WebcastCreateRedPacketMessage"),
        RECOMMEND_GOODS(0, "WebcastVideoLiveGoodsRcmdMessage"),
        RECOMMEND_COUPON(0, "WebcastVideoLiveCouponRcmdMessage"),
        GOODS_ORDER(0, "WebcastVideoLiveGoodsOrderMessage"),
        FANS_CLUB_REVIEW(0, "WebcastFansclubReviewMessage"),
        ROOM_VERIFY(0, "WebcastRoomVerifyMessage"),
        MEDIA_REPLAY(0, "WebcastMediaLiveReplayVidMessage"),
        COMMERCE_SALE_MESSAGE(0, "CommerceSaleMessage"),
        FOLLOW_GUIDE(0, "WebcastFollowGuideMessage"),
        HONOR_LEVEL_UP(0, "WebcastLevelUpMessage"),
        GUIDE_MESSAGE(0, "WebcastGuideMessage"),
        FREE_CELL_GIFT_MESSAGE(0, "WebcastFreeCellGiftMessage"),
        DUTY_GIFT_MESSAGE(0, "WebcastDutyGiftMessage"),
        ASSET_MESSAGE(0, "WebcastAssetMessage"),
        DAILY_REGION_RANK(0, "WebcastSunDailyRegionRankMessage"),
        IM_DELETE(0, "WebcastImDeleteMessage"),
        DOU_PLUS_MESSAGE(0, "WebcastDouplusMessage"),
        LIVE_ECOM_MESSAGE(0, "WebcastLiveEcomMessage"),
        FRATERNITY_MESSAGE(0, "WebcastBrotherhoodMessage"),
        DOUYIN_OFFICIAL_TASK_INFO(0, "WebcastProjectDTaskInfo"),
        CEREMONY_MESSAGE(0, "WebcastCeremonyMessage"),
        D_H5_MESSAGE(0, "WebcastProjectDModifyH5"),
        GAME_GIFT_MESSAGE(0, "WebcastGameGiftMessage"),
        DRIVE_GIFT_MESSAGE(0, "WebcastDriveGiftMessage"),
        PORTAL_MESSAGE(0, "WebcastPortalMessage"),
        NOBLE_UPGRADE_MESSAGE(0, "WebcastNobleUpgradeMessage"),
        NOBLE_TOAST_MESSAGE(0, "WebcastNobleToastMessage"),
        NOBLE_ENTER_LEAVE_MESSAGE(0, "WebcastNobleEnterLeaveMessage"),
        BINDING_GIFT_MESSAGE(0, "WebcastBindingGiftMessage"),
        BANNER_UPDATE(0, "WebcastInRoomBannerEvent"),
        QUIZ_START_MESSAGE(0, "WebcastQuizStartMessage"),
        QUIZ_CHANGE_MESSAGE(0, "WebcastQuizChangeMessage"),
        QUIZ_RESULT_MESSAGE(0, "WebcastQuizResultMessage"),
        BEGINNER_GUIDE_MESSAGE(0, "WebcastBeginnerGuideMessage"),
        GIFT_VOTE_MESSAGE(0, "WebcastGiftVoteMessage"),
        CHIJI_NOTICE_MESSAGE(0, "WebcastChijiNoticeMessage"),
        POPULAR_CARD_MESSAGE(0, "WebcastPopularCardMessage"),
        OFFICIAL_ROOM_MESSAGE(0, "WebcastOfficialRoomMessage"),
        IN_ROOM_BANNER_REFRESH_MESSAGE(0, "WebcastInRoomBannerRefreshMessage"),
        ROOM_AUTH_MESSAGE(0, "WebcastRoomAuthMessage"),
        COMMON_POPUP_MESSAGE(0, "WebcastCommonPopupMessage"),
        UPDATE_KOI_ROOM_STATUS_MESSAGE(0, "WebcastUpdateKoiRoomStatusMessage"),
        CAR_SHOW_MESSAGE(0, "WebcastCarBallShowMessage"),
        CAR_SERIES_INFO_MESSAGE(0, "WebcastCarSeriesInfoMessage"),
        CNY_A_TASK_MESSAGE(0, "WebcastCNYATaskMessage"),
        CNY_REWARD_MESSAGE(0, "WebcastCNYReward"),
        AUTH_NOTIFY_MESSAGE(0, "WebcastAuthorizationNotifyMessage"),
        ROOM_CHALLENGE_MESSAGE(0, "WebcastRoomChallengeMessage"),
        VIP_SEAT_MESSAGE(0, "WebcastVIPSeatMessage"),
        VIP_INFO_MESSAGE(0, "WebcastVIPInfoMessage"),
        DOU_PLUS_INDICATOR_MESSAGE(0, "WebcastDouplusIndicatorMessage"),
        VERIFY_CODE_MESSAGE(0, "WebcastVerificationCodeMessage"),
        ROOM_HOTSPOT_MESSAGE(0, "WebcastRoomHotSentenceMessage"),
        NABOB_IM_MESSAGE(0, "WebcastNabobImNoticeMessage"),
        TOOLBAR_ITEM_MESSAGE(0, "WebcastToolbarItemMessage"),
        STAMP_MESSAGE(0, "WebcastStampMessage"),
        COVER_MESSAGE(0, "WebcastUploadCoverMessage"),
        LIKE_MESSAGE(0, "WebcastLikeMessage"),
        COMMERCE_MESSAGE(0, "WebcastCommerceMessage"),
        OFFICIAL_CHANNEL_FOR_USER_MESSAGE(0, "WebcastOChannelUserMessage"),
        OFFICIAL_CHANNEL_FOR_ANCHOR_MESSAGE(0, "WebcastOChannelAnchorMessage");

        private final String messageType;
        private final int i;

        MessageEnum(int i, String messageType) {
            this.i = i;
            this.messageType = messageType;
        }

        public String getIntType() {
            return messageType;
        }
    }
}
