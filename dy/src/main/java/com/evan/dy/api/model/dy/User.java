package com.evan.dy.api.model.dy;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class User extends BasePB<User> {

    /**
     * adversaryAuthorizationInfo : 0
     * adversaryUserStatus : 0
     * authorizationInfo : 3
     * avatarThumb : {"height":0,"imageType":0,"isAnimated":false,"isFeedCandidate":false,"isLoaded":false,"isMonitored":false,"mUri":"100x100/tos-cn-i-0813/81ba5db7d43942cebf1f8978af32738d","mUrls":["https://p29-dy.byteimg.com/img/tos-cn-i-0813/81ba5db7d43942cebf1f8978af32738d~c5_100x100.jpeg?from=4010531038","https://p9-dy.byteimg.com/img/tos-cn-i-0813/81ba5db7d43942cebf1f8978af32738d~c5_100x100.jpeg?from=4010531038","https://p6-dy-ipv6.byteimg.com/img/tos-cn-i-0813/81ba5db7d43942cebf1f8978af32738d~c5_100x100.jpeg?from=4010531038"],"width":0}
     * badgeImageList : [{"height":16,"imageType":1,"isAnimated":false,"isFeedCandidate":false,"isLoaded":false,"isMonitored":false,"mUri":"webcast/aweme_honor_level_icon_new_4.png","mUrls":["http://p6-webcast-dycdn.byteimg.com/img/webcast/aweme_honor_level_icon_new_4.png~tplv-obj.image","http://p9-webcast-dycdn.byteimg.com/img/webcast/aweme_honor_level_icon_new_4.png~tplv-obj.image"],"width":32}]
     * birthday : 0
     * createTime : 0
     * displayId : QQ2644297749
     * enableCarManagementPermission : false
     * enableShowCommerceSale : false
     * encryptedId :
     * experience : 0
     * fanTicketCount : 0
     * fansClub : {"data":{"anchorId":0,"badge":{"icons":{"0":{"height":0,"imageType":0,"isAnimated":false,"isFeedCandidate":false,"isLoaded":false,"isMonitored":false,"mUrls":[],"width":0}}},"level":0,"userFansClubStatus":0}}
     * followInfo : {"followStatus":0,"followerCount":16,"followingCount":41}
     * gender : 1
     * id : 108372051513
     * incomeSharePercent : 0
     * isVerified : false
     * level : 0
     * linkMicStats : 0
     * modifyTime : 0
     * nickName : 天不及我白玖
     * payScores : -1
     * roomAutoGiftThanks : false
     * secUid : MS4wLjABAAAAg32erj0a1JJt5Px3kj7vtETd3GasKpQrsxGR6tkBQNI
     * secret : 0
     * shortId : 2289214400
     * shouldUseRealName : false
     * status : 0
     * topVipNo : 0
     * userAttr : {"b":false,"c":false}
     * userHonor : {"A":0,"g":0,"h":0,"i":0,"l":{"height":16,"imageType":1,"isAnimated":false,"isFeedCandidate":false,"isLoaded":false,"isMonitored":false,"mUri":"webcast/aweme_honor_level_icon_new_4.png","mUrls":["http://p6-webcast-dycdn.byteimg.com/img/webcast/aweme_honor_level_icon_new_4.png~tplv-obj.image","http://p9-webcast-dycdn.byteimg.com/img/webcast/aweme_honor_level_icon_new_4.png~tplv-obj.image"],"width":32},"n":{"height":12,"imageType":1,"isAnimated":false,"isFeedCandidate":false,"isLoaded":false,"isMonitored":false,"mUri":"webcast/aweme_pay_grade_2x_1_4.png","mUrls":["http://p1-webcast-dycdn.byteimg.com/img/webcast/aweme_pay_grade_2x_1_4.png~tplv-obj.image","http://p6-webcast-dycdn.byteimg.com/img/webcast/aweme_pay_grade_2x_1_4.png~tplv-obj.image"],"width":12},"o":4,"r":0,"s":0,"v":0,"x":0,"z":0}
     * userRole : 0
     */

//    public int adversaryAuthorizationInfo;
//    public int adversaryUserStatus;
//    public int authorizationInfo;
//    public AvatarThumbBean avatarThumb;
//    public int birthday;
//    public int createTime;
//    public String displayId;
//    public boolean enableCarManagementPermission;
//    public boolean enableShowCommerceSale;
//    public String encryptedId;
//    public int experience;
//    public int fanTicketCount;
//    public FansClubBean fansClub;
//    public FollowInfoBean followInfo;
    public int gender;
    @SerializedName(value = "id",alternate = {"uid"})
    public long id;
//    public int incomeSharePercent;
//    public boolean isVerified;
//    public int level;
//    public int linkMicStats;
//    public int modifyTime;
    public String nickName;
    public int payScores;
//    public boolean roomAutoGiftThanks;
    public String secUid;
//    public boolean secret;
    public long shortId;
    public int followStatus;
//    public boolean shouldUseRealName;
//    public int status;
//    public UserAttrBean userAttr;
//    public UserHonorBean userHonor;
//    public int userRole;
//    public List<BadgeImageListBean> badgeImageList;

    @Override
    public User parseFrom(Object obj) {
        return super.parseFrom(obj);
    }

    public static class AvatarThumbBean extends BasePB<AvatarThumbBean>{
        /**
         * height : 0
         * imageType : 0
         * isAnimated : false
         * isFeedCandidate : false
         * isLoaded : false
         * isMonitored : false
         * mUri : 100x100/tos-cn-i-0813/81ba5db7d43942cebf1f8978af32738d
         * mUrls : ["https://p29-dy.byteimg.com/img/tos-cn-i-0813/81ba5db7d43942cebf1f8978af32738d~c5_100x100.jpeg?from=4010531038","https://p9-dy.byteimg.com/img/tos-cn-i-0813/81ba5db7d43942cebf1f8978af32738d~c5_100x100.jpeg?from=4010531038","https://p6-dy-ipv6.byteimg.com/img/tos-cn-i-0813/81ba5db7d43942cebf1f8978af32738d~c5_100x100.jpeg?from=4010531038"]
         * width : 0
         */

        public int height;
        public int imageType;
        public boolean isAnimated;
        public boolean isFeedCandidate;
        public boolean isLoaded;
        public boolean isMonitored;
        public String mUri;
        public int width;
        public List<String> mUrls;
    }

    public static class FansClubBean extends BasePB<FansClubBean>{
        /**
         * data : {"anchorId":0,"badge":{"icons":{"0":{"height":0,"imageType":0,"isAnimated":false,"isFeedCandidate":false,"isLoaded":false,"isMonitored":false,"mUrls":[],"width":0}}},"level":0,"userFansClubStatus":0}
         */

        public DataBean data;

        public static class DataBean extends BasePB<DataBean>{
            /**
             * anchorId : 0
             * badge : {"icons":{"0":{"height":0,"imageType":0,"isAnimated":false,"isFeedCandidate":false,"isLoaded":false,"isMonitored":false,"mUrls":[],"width":0}}}
             * level : 0
             * userFansClubStatus : 0
             */

            public int anchorId;
//            public BadgeBean badge;
            public int level;
            public int userFansClubStatus;

        }
    }

    public static class FollowInfoBean extends BasePB<FollowInfoBean>{
        /**
         * followStatus : 0
         * followerCount : 16
         * followingCount : 41
         */

        public int followStatus;
        public int followerCount;
        public int followingCount;
    }



    public static class BadgeImageListBean extends BasePB<BadgeImageListBean>{
        /**
         * height : 16
         * imageType : 1
         * isAnimated : false
         * isFeedCandidate : false
         * isLoaded : false
         * isMonitored : false
         * mUri : webcast/aweme_honor_level_icon_new_4.png
         * mUrls : ["http://p6-webcast-dycdn.byteimg.com/img/webcast/aweme_honor_level_icon_new_4.png~tplv-obj.image","http://p9-webcast-dycdn.byteimg.com/img/webcast/aweme_honor_level_icon_new_4.png~tplv-obj.image"]
         * width : 32
         */

        public int height;
        public int imageType;
        public boolean isAnimated;
        public boolean isFeedCandidate;
        public boolean isLoaded;
        public boolean isMonitored;
        public String mUri;
        public int width;
        public List<String> mUrls;
    }
}
