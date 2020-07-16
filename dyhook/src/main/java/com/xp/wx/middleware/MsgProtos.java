package com.xp.wx.middleware;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class MsgProtos {
    /* access modifiers changed from: private */
    public static Descriptors.FileDescriptor descriptor;
    /* access modifiers changed from: private */
    public static final Descriptors.Descriptor internal_static_com_xp_wx_middleware_CmdData1002_descriptor;
    /* access modifiers changed from: private */
    public static final GeneratedMessageV3.FieldAccessorTable internal_static_com_xp_wx_middleware_CmdData1002_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final Descriptors.Descriptor internal_static_com_xp_wx_middleware_CmdData1003_descriptor;
    /* access modifiers changed from: private */
    public static final GeneratedMessageV3.FieldAccessorTable internal_static_com_xp_wx_middleware_CmdData1003_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final Descriptors.Descriptor internal_static_com_xp_wx_middleware_CmdData1004_descriptor;
    /* access modifiers changed from: private */
    public static final GeneratedMessageV3.FieldAccessorTable internal_static_com_xp_wx_middleware_CmdData1004_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final Descriptors.Descriptor internal_static_com_xp_wx_middleware_CmdData1_descriptor;
    /* access modifiers changed from: private */
    public static final GeneratedMessageV3.FieldAccessorTable internal_static_com_xp_wx_middleware_CmdData1_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final Descriptors.Descriptor internal_static_com_xp_wx_middleware_CmdData2002_descriptor;
    /* access modifiers changed from: private */
    public static final GeneratedMessageV3.FieldAccessorTable internal_static_com_xp_wx_middleware_CmdData2002_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final Descriptors.Descriptor internal_static_com_xp_wx_middleware_CmdData2003_descriptor;
    /* access modifiers changed from: private */
    public static final GeneratedMessageV3.FieldAccessorTable internal_static_com_xp_wx_middleware_CmdData2003_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final Descriptors.Descriptor internal_static_com_xp_wx_middleware_CmdData2004_descriptor;
    /* access modifiers changed from: private */
    public static final GeneratedMessageV3.FieldAccessorTable internal_static_com_xp_wx_middleware_CmdData2004_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final Descriptors.Descriptor internal_static_com_xp_wx_middleware_CmdData2009_descriptor;
    /* access modifiers changed from: private */
    public static final GeneratedMessageV3.FieldAccessorTable internal_static_com_xp_wx_middleware_CmdData2009_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final Descriptors.Descriptor internal_static_com_xp_wx_middleware_CmdData2011_descriptor;
    /* access modifiers changed from: private */
    public static final GeneratedMessageV3.FieldAccessorTable internal_static_com_xp_wx_middleware_CmdData2011_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final Descriptors.Descriptor internal_static_com_xp_wx_middleware_CmdData2012_descriptor;
    /* access modifiers changed from: private */
    public static final GeneratedMessageV3.FieldAccessorTable internal_static_com_xp_wx_middleware_CmdData2012_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final Descriptors.Descriptor internal_static_com_xp_wx_middleware_CmdData2014_descriptor;
    /* access modifiers changed from: private */
    public static final GeneratedMessageV3.FieldAccessorTable internal_static_com_xp_wx_middleware_CmdData2014_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final Descriptors.Descriptor internal_static_com_xp_wx_middleware_CmdData2015_descriptor;
    /* access modifiers changed from: private */
    public static final GeneratedMessageV3.FieldAccessorTable internal_static_com_xp_wx_middleware_CmdData2015_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final Descriptors.Descriptor internal_static_com_xp_wx_middleware_CmdData2016_descriptor;
    /* access modifiers changed from: private */
    public static final GeneratedMessageV3.FieldAccessorTable internal_static_com_xp_wx_middleware_CmdData2016_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final Descriptors.Descriptor internal_static_com_xp_wx_middleware_CmdData2018_descriptor;
    /* access modifiers changed from: private */
    public static final GeneratedMessageV3.FieldAccessorTable internal_static_com_xp_wx_middleware_CmdData2018_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final Descriptors.Descriptor internal_static_com_xp_wx_middleware_CmdData2020_descriptor;
    /* access modifiers changed from: private */
    public static final GeneratedMessageV3.FieldAccessorTable internal_static_com_xp_wx_middleware_CmdData2020_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final Descriptors.Descriptor internal_static_com_xp_wx_middleware_CmdData2021_descriptor;
    /* access modifiers changed from: private */
    public static final GeneratedMessageV3.FieldAccessorTable internal_static_com_xp_wx_middleware_CmdData2021_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final Descriptors.Descriptor internal_static_com_xp_wx_middleware_CmdData2026_descriptor;
    /* access modifiers changed from: private */
    public static final GeneratedMessageV3.FieldAccessorTable internal_static_com_xp_wx_middleware_CmdData2026_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final Descriptors.Descriptor internal_static_com_xp_wx_middleware_CmdData2032_descriptor;
    /* access modifiers changed from: private */
    public static final GeneratedMessageV3.FieldAccessorTable internal_static_com_xp_wx_middleware_CmdData2032_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final Descriptors.Descriptor internal_static_com_xp_wx_middleware_CmdData2036_descriptor;
    /* access modifiers changed from: private */
    public static final GeneratedMessageV3.FieldAccessorTable internal_static_com_xp_wx_middleware_CmdData2036_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final Descriptors.Descriptor internal_static_com_xp_wx_middleware_CmdData2067_descriptor;
    /* access modifiers changed from: private */
    public static final GeneratedMessageV3.FieldAccessorTable internal_static_com_xp_wx_middleware_CmdData2067_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final Descriptors.Descriptor internal_static_com_xp_wx_middleware_CmdData2068_descriptor;
    /* access modifiers changed from: private */
    public static final GeneratedMessageV3.FieldAccessorTable internal_static_com_xp_wx_middleware_CmdData2068_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final Descriptors.Descriptor internal_static_com_xp_wx_middleware_CmdData4001_descriptor;
    /* access modifiers changed from: private */
    public static final GeneratedMessageV3.FieldAccessorTable internal_static_com_xp_wx_middleware_CmdData4001_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final Descriptors.Descriptor internal_static_com_xp_wx_middleware_CmdData4003_descriptor;
    /* access modifiers changed from: private */
    public static final GeneratedMessageV3.FieldAccessorTable internal_static_com_xp_wx_middleware_CmdData4003_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final Descriptors.Descriptor internal_static_com_xp_wx_middleware_CmdData4005_descriptor;
    /* access modifiers changed from: private */
    public static final GeneratedMessageV3.FieldAccessorTable internal_static_com_xp_wx_middleware_CmdData4005_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final Descriptors.Descriptor internal_static_com_xp_wx_middleware_Cmd_descriptor;
    /* access modifiers changed from: private */
    public static final GeneratedMessageV3.FieldAccessorTable internal_static_com_xp_wx_middleware_Cmd_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final Descriptors.Descriptor internal_static_com_xp_wx_middleware_Friend_descriptor;
    /* access modifiers changed from: private */
    public static final GeneratedMessageV3.FieldAccessorTable internal_static_com_xp_wx_middleware_Friend_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final Descriptors.Descriptor internal_static_com_xp_wx_middleware_MemberInfo_descriptor;
    /* access modifiers changed from: private */
    public static final GeneratedMessageV3.FieldAccessorTable internal_static_com_xp_wx_middleware_MemberInfo_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final Descriptors.Descriptor internal_static_com_xp_wx_middleware_RoomInfo_descriptor;
    /* access modifiers changed from: private */
    public static final GeneratedMessageV3.FieldAccessorTable internal_static_com_xp_wx_middleware_RoomInfo_fieldAccessorTable;

    public interface CmdData1002OrBuilder extends MessageOrBuilder {
        String getAlias();

        ByteString getAliasBytes();

        String getCity();

        ByteString getCityBytes();

        String getCountry();

        ByteString getCountryBytes();

        String getFromUsername();

        ByteString getFromUsernameBytes();

        String getHeadImg();

        ByteString getHeadImgBytes();

        String getNickname();

        ByteString getNicknameBytes();

        String getProvince();

        ByteString getProvinceBytes();

        String getScene();

        ByteString getSceneBytes();

        String getSex();

        ByteString getSexBytes();

        String getSign();

        ByteString getSignBytes();

        String getTicket();

        ByteString getTicketBytes();

        String getVerifyContent();

        ByteString getVerifyContentBytes();
    }

    public interface CmdData1003OrBuilder extends MessageOrBuilder {
        String getFromUsername();

        ByteString getFromUsernameBytes();

        String getMsg();

        ByteString getMsgBytes();

        String getToUsername();

        ByteString getToUsernameBytes();

        String getType();

        ByteString getTypeBytes();

        Friend getUser();

        Friend getUserList(int i);

        int getUserListCount();

        List<Friend> getUserListList();

        FriendOrBuilder getUserListOrBuilder(int i);

        List<? extends FriendOrBuilder> getUserListOrBuilderList();

        FriendOrBuilder getUserOrBuilder();

        boolean hasUser();
    }

    public interface CmdData1004OrBuilder extends MessageOrBuilder {
        String getBigHeadImage();

        ByteString getBigHeadImageBytes();

        String getCity();

        ByteString getCityBytes();

        String getLabelIds();

        ByteString getLabelIdsBytes();

        String getLabelNames();

        ByteString getLabelNamesBytes();

        String getNickname();

        ByteString getNicknameBytes();

        String getProvince();

        ByteString getProvinceBytes();

        String getRemark();

        ByteString getRemarkBytes();

        String getSex();

        ByteString getSexBytes();

        String getSignature();

        ByteString getSignatureBytes();

        String getSmallHeadImage();

        ByteString getSmallHeadImageBytes();

        String getUsername();

        ByteString getUsernameBytes();
    }

    public interface CmdData1OrBuilder extends MessageOrBuilder {
        String getAndroidVersion();

        ByteString getAndroidVersionBytes();

        String getApkUrl();

        ByteString getApkUrlBytes();

        int getChannel();

        String getMobileModel();

        ByteString getMobileModelBytes();

        String getMobileSerial();

        ByteString getMobileSerialBytes();

        String getNickname();

        ByteString getNicknameBytes();

        String getSboxVersion();

        ByteString getSboxVersionBytes();

        String getTel();

        ByteString getTelBytes();

        String getUsername();

        ByteString getUsernameBytes();

        String getVision();

        ByteString getVisionBytes();
    }

    public interface CmdData2002OrBuilder extends MessageOrBuilder {
        String getCityCode();

        ByteString getCityCodeBytes();

        String getCityStr();

        ByteString getCityStrBytes();

        String getCountryCode();

        ByteString getCountryCodeBytes();

        String getHeadImg();

        ByteString getHeadImgBytes();

        String getNickname();

        ByteString getNicknameBytes();

        String getProvinceCode();

        ByteString getProvinceCodeBytes();

        String getProvinceStr();

        ByteString getProvinceStrBytes();

        String getSex();

        ByteString getSexBytes();

        String getSignature();

        ByteString getSignatureBytes();

        String getUsername();

        ByteString getUsernameBytes();
    }

    public interface CmdData2003OrBuilder extends MessageOrBuilder {
        String getAtuser(int i);

        ByteString getAtuserBytes(int i);

        int getAtuserCount();

        List<String> getAtuserList();

        String getContent();

        ByteString getContentBytes();

        String getToUser();

        ByteString getToUserBytes();
    }

    public interface CmdData2004OrBuilder extends MessageOrBuilder {
        String getImgpath(int i);

        ByteString getImgpathBytes(int i);

        int getImgpathCount();

        List<String> getImgpathList();

        String getToUser();

        ByteString getToUserBytes();
    }

    public interface CmdData2009OrBuilder extends MessageOrBuilder {
        Friend getFriendList(int i);

        int getFriendListCount();

        List<Friend> getFriendListList();

        FriendOrBuilder getFriendListOrBuilder(int i);

        List<? extends FriendOrBuilder> getFriendListOrBuilderList();
    }

    public interface CmdData2011OrBuilder extends MessageOrBuilder {
        RoomInfo getRoomList(int i);

        int getRoomListCount();

        List<RoomInfo> getRoomListList();

        RoomInfoOrBuilder getRoomListOrBuilder(int i);

        List<? extends RoomInfoOrBuilder> getRoomListOrBuilderList();
    }

    public interface CmdData2012OrBuilder extends MessageOrBuilder {
        MemberInfo getMemberList(int i);

        int getMemberListCount();

        List<MemberInfo> getMemberListList();

        MemberInfoOrBuilder getMemberListOrBuilder(int i);

        List<? extends MemberInfoOrBuilder> getMemberListOrBuilderList();

        String getNoticeEditor();

        ByteString getNoticeEditorBytes();

        String getRoomName();

        ByteString getRoomNameBytes();

        String getRoomNotice();

        ByteString getRoomNoticeBytes();

        String getRoomOwner();

        ByteString getRoomOwnerBytes();

        String getUsername();

        ByteString getUsernameBytes();
    }

    public interface CmdData2014OrBuilder extends MessageOrBuilder {
        String getFriendUsernameList(int i);

        ByteString getFriendUsernameListBytes(int i);

        int getFriendUsernameListCount();

        List<String> getFriendUsernameListList();

        String getUsername();

        ByteString getUsernameBytes();
    }

    public interface CmdData2015OrBuilder extends MessageOrBuilder {
        String getMemberIds(int i);

        ByteString getMemberIdsBytes(int i);

        int getMemberIdsCount();

        List<String> getMemberIdsList();

        String getUsername();

        ByteString getUsernameBytes();
    }

    public interface CmdData2016OrBuilder extends MessageOrBuilder {
        String getMemberIds(int i);

        ByteString getMemberIdsBytes(int i);

        int getMemberIdsCount();

        List<String> getMemberIdsList();

        String getUsername();

        ByteString getUsernameBytes();
    }

    public interface CmdData2018OrBuilder extends MessageOrBuilder {
        String getNickname();

        ByteString getNicknameBytes();

        String getUsername();

        ByteString getUsernameBytes();
    }

    public interface CmdData2020OrBuilder extends MessageOrBuilder {
        String getQrcode();

        ByteString getQrcodeBytes();

        String getUsername();

        ByteString getUsernameBytes();
    }

    public interface CmdData2021OrBuilder extends MessageOrBuilder {
        String getNoticeContent();

        ByteString getNoticeContentBytes();

        String getUsername();

        ByteString getUsernameBytes();
    }

    public interface CmdData2026OrBuilder extends MessageOrBuilder {
        String getTicket();

        ByteString getTicketBytes();

        String getUsername();

        ByteString getUsernameBytes();
    }

    public interface CmdData2032OrBuilder extends MessageOrBuilder {
        String getQrcode();

        ByteString getQrcodeBytes();
    }

    public interface CmdData2036OrBuilder extends MessageOrBuilder {
        String getAttachPic();

        ByteString getAttachPicBytes();

        String getBigHeadImage();

        ByteString getBigHeadImageBytes();

        String getCity();

        ByteString getCityBytes();

        String getDesc();

        ByteString getDescBytes();

        String getLabelIds();

        ByteString getLabelIdsBytes();

        String getLabelNames();

        ByteString getLabelNamesBytes();

        String getNickname();

        ByteString getNicknameBytes();

        String getProvince();

        ByteString getProvinceBytes();

        String getRemark();

        ByteString getRemarkBytes();

        String getSex();

        ByteString getSexBytes();

        String getSignature();

        ByteString getSignatureBytes();

        String getSmallHeadImage();

        ByteString getSmallHeadImageBytes();

        String getTel();

        ByteString getTelBytes();

        String getUsername();

        ByteString getUsernameBytes();
    }

    public interface CmdData2067OrBuilder extends MessageOrBuilder {
        String getDate();

        ByteString getDateBytes();

        long getId();

        String getResult();

        ByteString getResultBytes();
    }

    public interface CmdData2068OrBuilder extends MessageOrBuilder {
        String getQrcode();

        ByteString getQrcodeBytes();

        String getRoomId();

        ByteString getRoomIdBytes();
    }

    public interface CmdData4001OrBuilder extends MessageOrBuilder {
        String getId();

        ByteString getIdBytes();

        int getStatus();
    }

    public interface CmdData4003OrBuilder extends MessageOrBuilder {
        String getRoomId(int i);

        ByteString getRoomIdBytes(int i);

        int getRoomIdCount();

        List<String> getRoomIdList();
    }

    public interface CmdData4005OrBuilder extends MessageOrBuilder {
        String getActivityId();

        ByteString getActivityIdBytes();

        int getIsInviteRoom();

        String getSuperiorNickname();

        ByteString getSuperiorNicknameBytes();

        String getSuperiorUsername();

        ByteString getSuperiorUsernameBytes();

        int getSupportCount();

        String getSupportNickname();

        ByteString getSupportNicknameBytes();
    }

    public interface CmdOrBuilder extends MessageOrBuilder {
        String getChannel(int i);

        ByteString getChannelBytes(int i);

        int getChannelCount();

        List<String> getChannelList();

        int getCmd();

        ByteString getCmdData();

        String getDesc();

        ByteString getDescBytes();

        String getFromClientId();

        ByteString getFromClientIdBytes();

        int getLocalDBId();

        String getLocalId();

        ByteString getLocalIdBytes();

        String getMsg();

        ByteString getMsgBytes();

        int getPriority();

        int getRetryCount();

        String getServerId();

        ByteString getServerIdBytes();

        int getStatus();

        long getTimestamp();

        String getToClientId();

        ByteString getToClientIdBytes();
    }

    public interface FriendOrBuilder extends MessageOrBuilder {
        String getAlias();

        ByteString getAliasBytes();

        String getAttachPicUrl();

        ByteString getAttachPicUrlBytes();

        int getCertFlag();

        String getCity();

        ByteString getCityBytes();

        String getConRemark();

        ByteString getConRemarkBytes();

        String getDesc();

        ByteString getDescBytes();

        String getHeadImageUrl();

        ByteString getHeadImageUrlBytes();

        String getLabelIds();

        ByteString getLabelIdsBytes();

        String getLabelNames();

        ByteString getLabelNamesBytes();

        String getNickname();

        ByteString getNicknameBytes();

        String getProvince();

        ByteString getProvinceBytes();

        String getSex();

        ByteString getSexBytes();

        String getSignature();

        ByteString getSignatureBytes();

        String getTel();

        ByteString getTelBytes();

        String getUsername();

        ByteString getUsernameBytes();

        String getV2Ticket();

        ByteString getV2TicketBytes();
    }

    public interface MemberInfoOrBuilder extends MessageOrBuilder {
        String getAlias();

        ByteString getAliasBytes();

        String getBigHeadImage();

        ByteString getBigHeadImageBytes();

        String getNickname();

        ByteString getNicknameBytes();

        String getRemark();

        ByteString getRemarkBytes();

        String getRoomNickname();

        ByteString getRoomNicknameBytes();

        String getSmallHeadImage();

        ByteString getSmallHeadImageBytes();

        String getUsername();

        ByteString getUsernameBytes();
    }

    public interface RoomInfoOrBuilder extends MessageOrBuilder {
        String getNickname();

        ByteString getNicknameBytes();

        String getRoomOwner();

        ByteString getRoomOwnerBytes();

        String getType();

        ByteString getTypeBytes();

        String getUsername();

        ByteString getUsernameBytes();
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private MsgProtos() {
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class Cmd extends GeneratedMessageV3 implements CmdOrBuilder {
        public static final int CHANNEL_FIELD_NUMBER = 10;
        public static final int CMDDATA_FIELD_NUMBER = 5;
        public static final int CMD_FIELD_NUMBER = 1;
        private static final Cmd DEFAULT_INSTANCE = new Cmd();
        public static final int DESC_FIELD_NUMBER = 12;
        public static final int FROMCLIENTID_FIELD_NUMBER = 3;
        public static final int LOCALDBID_FIELD_NUMBER = 13;
        public static final int LOCALID_FIELD_NUMBER = 8;
        public static final int MSG_FIELD_NUMBER = 11;
        /* access modifiers changed from: private */
        public static final Parser<Cmd> PARSER = new AbstractParser<Cmd>() {
            public Cmd parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Cmd(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int PRIORITY_FIELD_NUMBER = 7;
        public static final int RETRYCOUNT_FIELD_NUMBER = 14;
        public static final int SERVERID_FIELD_NUMBER = 9;
        public static final int STATUS_FIELD_NUMBER = 6;
        public static final int TIMESTAMP_FIELD_NUMBER = 2;
        public static final int TOCLIENTID_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public LazyStringList channel_;
        /* access modifiers changed from: private */
        public ByteString cmdData_;
        /* access modifiers changed from: private */
        public int cmd_;
        /* access modifiers changed from: private */
        public volatile Object desc_;
        /* access modifiers changed from: private */
        public volatile Object fromClientId_;
        /* access modifiers changed from: private */
        public int localDBId_;
        /* access modifiers changed from: private */
        public volatile Object localId_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public volatile Object msg_;
        /* access modifiers changed from: private */
        public int priority_;
        /* access modifiers changed from: private */
        public int retryCount_;
        /* access modifiers changed from: private */
        public volatile Object serverId_;
        /* access modifiers changed from: private */
        public int status_;
        /* access modifiers changed from: private */
        public long timestamp_;
        /* access modifiers changed from: private */
        public volatile Object toClientId_;

        private Cmd(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private Cmd() {
            this.memoizedIsInitialized = -1;
            this.cmd_ = 0;
            this.timestamp_ = 0;
            this.fromClientId_ = "";
            this.toClientId_ = "";
            this.cmdData_ = ByteString.EMPTY;
            this.status_ = 0;
            this.priority_ = 0;
            this.localId_ = "";
            this.serverId_ = "";
            this.channel_ = LazyStringArrayList.EMPTY;
            this.msg_ = "";
            this.desc_ = "";
            this.localDBId_ = 0;
            this.retryCount_ = 0;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Cmd(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                boolean z2 = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        switch (readTag) {
                            case 0:
                                z = true;
                                break;
                            case 8:
                                this.cmd_ = codedInputStream.readInt32();
                                break;
                            case 16:
                                this.timestamp_ = codedInputStream.readInt64();
                                break;
                            case 26:
                                this.fromClientId_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 34:
                                this.toClientId_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 42:
                                this.cmdData_ = codedInputStream.readBytes();
                                break;
                            case 48:
                                this.status_ = codedInputStream.readInt32();
                                break;
                            case 56:
                                this.priority_ = codedInputStream.readInt32();
                                break;
                            case 66:
                                this.localId_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 74:
                                this.serverId_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 82:
                                String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                if (!(z2 & true)) {
                                    this.channel_ = new LazyStringArrayList();
                                    z2 |= true;
                                }
                                this.channel_.add(readStringRequireUtf8);
                                break;
                            case 90:
                                this.msg_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 98:
                                this.desc_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 104:
                                this.localDBId_ = codedInputStream.readInt32();
                                break;
                            case 112:
                                this.retryCount_ = codedInputStream.readInt32();
                                break;
                            default:
                                if (parseUnknownFieldProto3(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                    break;
                                }
                                z = true;
                                break;
                        }
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        if (z2 & true) {
                            this.channel_ = this.channel_.getUnmodifiableView();
                        }
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if (z2 & true) {
                    this.channel_ = this.channel_.getUnmodifiableView();
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw null;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MsgProtos.internal_static_com_xp_wx_middleware_Cmd_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MsgProtos.internal_static_com_xp_wx_middleware_Cmd_fieldAccessorTable.ensureFieldAccessorsInitialized(Cmd.class, Builder.class);
        }

        public int getCmd() {
            return this.cmd_;
        }

        public long getTimestamp() {
            return this.timestamp_;
        }

        public String getFromClientId() {
            Object obj = this.fromClientId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.fromClientId_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getFromClientIdBytes() {
            Object obj = this.fromClientId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.fromClientId_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getToClientId() {
            Object obj = this.toClientId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.toClientId_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getToClientIdBytes() {
            Object obj = this.toClientId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.toClientId_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public ByteString getCmdData() {
            return this.cmdData_;
        }

        public int getStatus() {
            return this.status_;
        }

        public int getPriority() {
            return this.priority_;
        }

        public String getLocalId() {
            Object obj = this.localId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.localId_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getLocalIdBytes() {
            Object obj = this.localId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.localId_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getServerId() {
            Object obj = this.serverId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.serverId_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getServerIdBytes() {
            Object obj = this.serverId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.serverId_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public ProtocolStringList getChannelList() {
            return this.channel_;
        }

        public int getChannelCount() {
            return this.channel_.size();
        }

        public String getChannel(int i) {
            return (String) this.channel_.get(i);
        }

        public ByteString getChannelBytes(int i) {
            return this.channel_.getByteString(i);
        }

        public String getMsg() {
            Object obj = this.msg_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.msg_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getMsgBytes() {
            Object obj = this.msg_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.msg_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getDesc() {
            Object obj = this.desc_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.desc_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getDescBytes() {
            Object obj = this.desc_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.desc_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public int getLocalDBId() {
            return this.localDBId_;
        }

        public int getRetryCount() {
            return this.retryCount_;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.cmd_;
            if (i != 0) {
                codedOutputStream.writeInt32(1, i);
            }
            long j = this.timestamp_;
            if (j != 0) {
                codedOutputStream.writeInt64(2, j);
            }
            if (!getFromClientIdBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.fromClientId_);
            }
            if (!getToClientIdBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.toClientId_);
            }
            if (!this.cmdData_.isEmpty()) {
                codedOutputStream.writeBytes(5, this.cmdData_);
            }
            int i2 = this.status_;
            if (i2 != 0) {
                codedOutputStream.writeInt32(6, i2);
            }
            int i3 = this.priority_;
            if (i3 != 0) {
                codedOutputStream.writeInt32(7, i3);
            }
            if (!getLocalIdBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 8, this.localId_);
            }
            if (!getServerIdBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 9, this.serverId_);
            }
            for (int i4 = 0; i4 < this.channel_.size(); i4++) {
                GeneratedMessageV3.writeString(codedOutputStream, 10, this.channel_.getRaw(i4));
            }
            if (!getMsgBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 11, this.msg_);
            }
            if (!getDescBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 12, this.desc_);
            }
            int i5 = this.localDBId_;
            if (i5 != 0) {
                codedOutputStream.writeInt32(13, i5);
            }
            int i6 = this.retryCount_;
            if (i6 != 0) {
                codedOutputStream.writeInt32(14, i6);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.cmd_;
            int computeInt32Size = i2 != 0 ? CodedOutputStream.computeInt32Size(1, i2) + 0 : 0;
            long j = this.timestamp_;
            if (j != 0) {
                computeInt32Size += CodedOutputStream.computeInt64Size(2, j);
            }
            if (!getFromClientIdBytes().isEmpty()) {
                computeInt32Size += GeneratedMessageV3.computeStringSize(3, this.fromClientId_);
            }
            if (!getToClientIdBytes().isEmpty()) {
                computeInt32Size += GeneratedMessageV3.computeStringSize(4, this.toClientId_);
            }
            if (!this.cmdData_.isEmpty()) {
                computeInt32Size += CodedOutputStream.computeBytesSize(5, this.cmdData_);
            }
            int i3 = this.status_;
            if (i3 != 0) {
                computeInt32Size += CodedOutputStream.computeInt32Size(6, i3);
            }
            int i4 = this.priority_;
            if (i4 != 0) {
                computeInt32Size += CodedOutputStream.computeInt32Size(7, i4);
            }
            if (!getLocalIdBytes().isEmpty()) {
                computeInt32Size += GeneratedMessageV3.computeStringSize(8, this.localId_);
            }
            if (!getServerIdBytes().isEmpty()) {
                computeInt32Size += GeneratedMessageV3.computeStringSize(9, this.serverId_);
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.channel_.size(); i6++) {
                i5 += computeStringSizeNoTag(this.channel_.getRaw(i6));
            }
            int size = computeInt32Size + i5 + (getChannelList().size() * 1);
            if (!getMsgBytes().isEmpty()) {
                size += GeneratedMessageV3.computeStringSize(11, this.msg_);
            }
            if (!getDescBytes().isEmpty()) {
                size += GeneratedMessageV3.computeStringSize(12, this.desc_);
            }
            int i7 = this.localDBId_;
            if (i7 != 0) {
                size += CodedOutputStream.computeInt32Size(13, i7);
            }
            int i8 = this.retryCount_;
            if (i8 != 0) {
                size += CodedOutputStream.computeInt32Size(14, i8);
            }
            int serializedSize = size + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Cmd)) {
                return super.equals(obj);
            }
            Cmd cmd = (Cmd) obj;
            if (!((((((((((((((getCmd() == cmd.getCmd()) && (getTimestamp() > cmd.getTimestamp() ? 1 : (getTimestamp() == cmd.getTimestamp() ? 0 : -1)) == 0) && getFromClientId().equals(cmd.getFromClientId())) && getToClientId().equals(cmd.getToClientId())) && getCmdData().equals(cmd.getCmdData())) && getStatus() == cmd.getStatus()) && getPriority() == cmd.getPriority()) && getLocalId().equals(cmd.getLocalId())) && getServerId().equals(cmd.getServerId())) && getChannelList().equals(cmd.getChannelList())) && getMsg().equals(cmd.getMsg())) && getDesc().equals(cmd.getDesc())) && getLocalDBId() == cmd.getLocalDBId()) && getRetryCount() == cmd.getRetryCount()) || !this.unknownFields.equals(cmd.unknownFields)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getCmd()) * 37) + 2) * 53) + Internal.hashLong(getTimestamp())) * 37) + 3) * 53) + getFromClientId().hashCode()) * 37) + 4) * 53) + getToClientId().hashCode()) * 37) + 5) * 53) + getCmdData().hashCode()) * 37) + 6) * 53) + getStatus()) * 37) + 7) * 53) + getPriority()) * 37) + 8) * 53) + getLocalId().hashCode()) * 37) + 9) * 53) + getServerId().hashCode();
            if (getChannelCount() > 0) {
                hashCode = (((hashCode * 37) + 10) * 53) + getChannelList().hashCode();
            }
            int hashCode2 = (((((((((((((((((hashCode * 37) + 11) * 53) + getMsg().hashCode()) * 37) + 12) * 53) + getDesc().hashCode()) * 37) + 13) * 53) + getLocalDBId()) * 37) + 14) * 53) + getRetryCount()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public static Cmd parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Cmd parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Cmd parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Cmd parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Cmd parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static Cmd parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Cmd parseFrom(InputStream inputStream) throws IOException {
            return (Cmd) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Cmd parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Cmd) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Cmd parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Cmd) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Cmd parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Cmd) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Cmd parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Cmd) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Cmd parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Cmd) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Cmd cmd) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cmd);
        }

        public Builder toBuilder() {
            if (this == DEFAULT_INSTANCE) {
                return new Builder();
            }
            return new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CmdOrBuilder {
            private int bitField0_;
            private LazyStringList channel_;
            private ByteString cmdData_;
            private int cmd_;
            private Object desc_;
            private Object fromClientId_;
            private int localDBId_;
            private Object localId_;
            private Object msg_;
            private int priority_;
            private int retryCount_;
            private Object serverId_;
            private int status_;
            private long timestamp_;
            private Object toClientId_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MsgProtos.internal_static_com_xp_wx_middleware_Cmd_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return MsgProtos.internal_static_com_xp_wx_middleware_Cmd_fieldAccessorTable.ensureFieldAccessorsInitialized(Cmd.class, Builder.class);
            }

            private Builder() {
                this.fromClientId_ = "";
                this.toClientId_ = "";
                this.cmdData_ = ByteString.EMPTY;
                this.localId_ = "";
                this.serverId_ = "";
                this.channel_ = LazyStringArrayList.EMPTY;
                this.msg_ = "";
                this.desc_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.fromClientId_ = "";
                this.toClientId_ = "";
                this.cmdData_ = ByteString.EMPTY;
                this.localId_ = "";
                this.serverId_ = "";
                this.channel_ = LazyStringArrayList.EMPTY;
                this.msg_ = "";
                this.desc_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = Cmd.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                this.cmd_ = 0;
                this.timestamp_ = 0;
                this.fromClientId_ = "";
                this.toClientId_ = "";
                this.cmdData_ = ByteString.EMPTY;
                this.status_ = 0;
                this.priority_ = 0;
                this.localId_ = "";
                this.serverId_ = "";
                this.channel_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -513;
                this.msg_ = "";
                this.desc_ = "";
                this.localDBId_ = 0;
                this.retryCount_ = 0;
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return MsgProtos.internal_static_com_xp_wx_middleware_Cmd_descriptor;
            }

            public Cmd getDefaultInstanceForType() {
                return Cmd.getDefaultInstance();
            }

            public Cmd build() {
                Cmd buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public Cmd buildPartial() {
                Cmd cmd = new Cmd((GeneratedMessageV3.Builder) this);
                int unused = cmd.cmd_ = this.cmd_;
                long unused2 = cmd.timestamp_ = this.timestamp_;
                Object unused3 = cmd.fromClientId_ = this.fromClientId_;
                Object unused4 = cmd.toClientId_ = this.toClientId_;
                ByteString unused5 = cmd.cmdData_ = this.cmdData_;
                int unused6 = cmd.status_ = this.status_;
                int unused7 = cmd.priority_ = this.priority_;
                Object unused8 = cmd.localId_ = this.localId_;
                Object unused9 = cmd.serverId_ = this.serverId_;
                if ((this.bitField0_ & 512) == 512) {
                    this.channel_ = this.channel_.getUnmodifiableView();
                    this.bitField0_ &= -513;
                }
                LazyStringList unused10 = cmd.channel_ = this.channel_;
                Object unused11 = cmd.msg_ = this.msg_;
                Object unused12 = cmd.desc_ = this.desc_;
                int unused13 = cmd.localDBId_ = this.localDBId_;
                int unused14 = cmd.retryCount_ = this.retryCount_;
                int unused15 = cmd.bitField0_ = 0;
                onBuilt();
                return cmd;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder mergeFrom(Message message) {
                if (message instanceof Cmd) {
                    return mergeFrom((Cmd) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Cmd cmd) {
                if (cmd == Cmd.getDefaultInstance()) {
                    return this;
                }
                if (cmd.getCmd() != 0) {
                    setCmd(cmd.getCmd());
                }
                if (cmd.getTimestamp() != 0) {
                    setTimestamp(cmd.getTimestamp());
                }
                if (!cmd.getFromClientId().isEmpty()) {
                    this.fromClientId_ = cmd.fromClientId_;
                    onChanged();
                }
                if (!cmd.getToClientId().isEmpty()) {
                    this.toClientId_ = cmd.toClientId_;
                    onChanged();
                }
                if (cmd.getCmdData() != ByteString.EMPTY) {
                    setCmdData(cmd.getCmdData());
                }
                if (cmd.getStatus() != 0) {
                    setStatus(cmd.getStatus());
                }
                if (cmd.getPriority() != 0) {
                    setPriority(cmd.getPriority());
                }
                if (!cmd.getLocalId().isEmpty()) {
                    this.localId_ = cmd.localId_;
                    onChanged();
                }
                if (!cmd.getServerId().isEmpty()) {
                    this.serverId_ = cmd.serverId_;
                    onChanged();
                }
                if (!cmd.channel_.isEmpty()) {
                    if (this.channel_.isEmpty()) {
                        this.channel_ = cmd.channel_;
                        this.bitField0_ &= -513;
                    } else {
                        ensureChannelIsMutable();
                        this.channel_.addAll(cmd.channel_);
                    }
                    onChanged();
                }
                if (!cmd.getMsg().isEmpty()) {
                    this.msg_ = cmd.msg_;
                    onChanged();
                }
                if (!cmd.getDesc().isEmpty()) {
                    this.desc_ = cmd.desc_;
                    onChanged();
                }
                if (cmd.getLocalDBId() != 0) {
                    setLocalDBId(cmd.getLocalDBId());
                }
                if (cmd.getRetryCount() != 0) {
                    setRetryCount(cmd.getRetryCount());
                }
                mergeUnknownFields(cmd.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.xp.wx.middleware.MsgProtos.Cmd.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.xp.wx.middleware.MsgProtos.Cmd.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.xp.wx.middleware.MsgProtos$Cmd r3 = (com.xp.wx.middleware.MsgProtos.Cmd) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.Cmd) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.xp.wx.middleware.MsgProtos$Cmd r4 = (com.xp.wx.middleware.MsgProtos.Cmd) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.Cmd) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.middleware.MsgProtos.Cmd.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.xp.wx.middleware.MsgProtos$Cmd$Builder");
            }

            public int getCmd() {
                return this.cmd_;
            }

            public Builder setCmd(int i) {
                this.cmd_ = i;
                onChanged();
                return this;
            }

            public Builder clearCmd() {
                this.cmd_ = 0;
                onChanged();
                return this;
            }

            public long getTimestamp() {
                return this.timestamp_;
            }

            public Builder setTimestamp(long j) {
                this.timestamp_ = j;
                onChanged();
                return this;
            }

            public Builder clearTimestamp() {
                this.timestamp_ = 0;
                onChanged();
                return this;
            }

            public String getFromClientId() {
                Object obj = this.fromClientId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.fromClientId_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getFromClientIdBytes() {
                Object obj = this.fromClientId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.fromClientId_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setFromClientId(String str) {
                if (str != null) {
                    this.fromClientId_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearFromClientId() {
                this.fromClientId_ = Cmd.getDefaultInstance().getFromClientId();
                onChanged();
                return this;
            }

            public Builder setFromClientIdBytes(ByteString byteString) {
                if (byteString != null) {
                    Cmd.checkByteStringIsUtf8(byteString);
                    this.fromClientId_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getToClientId() {
                Object obj = this.toClientId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.toClientId_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getToClientIdBytes() {
                Object obj = this.toClientId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.toClientId_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setToClientId(String str) {
                if (str != null) {
                    this.toClientId_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearToClientId() {
                this.toClientId_ = Cmd.getDefaultInstance().getToClientId();
                onChanged();
                return this;
            }

            public Builder setToClientIdBytes(ByteString byteString) {
                if (byteString != null) {
                    Cmd.checkByteStringIsUtf8(byteString);
                    this.toClientId_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public ByteString getCmdData() {
                return this.cmdData_;
            }

            public Builder setCmdData(ByteString byteString) {
                if (byteString != null) {
                    this.cmdData_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearCmdData() {
                this.cmdData_ = Cmd.getDefaultInstance().getCmdData();
                onChanged();
                return this;
            }

            public int getStatus() {
                return this.status_;
            }

            public Builder setStatus(int i) {
                this.status_ = i;
                onChanged();
                return this;
            }

            public Builder clearStatus() {
                this.status_ = 0;
                onChanged();
                return this;
            }

            public int getPriority() {
                return this.priority_;
            }

            public Builder setPriority(int i) {
                this.priority_ = i;
                onChanged();
                return this;
            }

            public Builder clearPriority() {
                this.priority_ = 0;
                onChanged();
                return this;
            }

            public String getLocalId() {
                Object obj = this.localId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.localId_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getLocalIdBytes() {
                Object obj = this.localId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.localId_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setLocalId(String str) {
                if (str != null) {
                    this.localId_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearLocalId() {
                this.localId_ = Cmd.getDefaultInstance().getLocalId();
                onChanged();
                return this;
            }

            public Builder setLocalIdBytes(ByteString byteString) {
                if (byteString != null) {
                    Cmd.checkByteStringIsUtf8(byteString);
                    this.localId_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getServerId() {
                Object obj = this.serverId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.serverId_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getServerIdBytes() {
                Object obj = this.serverId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.serverId_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setServerId(String str) {
                if (str != null) {
                    this.serverId_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearServerId() {
                this.serverId_ = Cmd.getDefaultInstance().getServerId();
                onChanged();
                return this;
            }

            public Builder setServerIdBytes(ByteString byteString) {
                if (byteString != null) {
                    Cmd.checkByteStringIsUtf8(byteString);
                    this.serverId_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            private void ensureChannelIsMutable() {
                if ((this.bitField0_ & 512) != 512) {
                    this.channel_ = new LazyStringArrayList(this.channel_);
                    this.bitField0_ |= 512;
                }
            }

            public ProtocolStringList getChannelList() {
                return this.channel_.getUnmodifiableView();
            }

            public int getChannelCount() {
                return this.channel_.size();
            }

            public String getChannel(int i) {
                return (String) this.channel_.get(i);
            }

            public ByteString getChannelBytes(int i) {
                return this.channel_.getByteString(i);
            }

            public Builder setChannel(int i, String str) {
                if (str != null) {
                    ensureChannelIsMutable();
                    this.channel_.set(i, str);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addChannel(String str) {
                if (str != null) {
                    ensureChannelIsMutable();
                    this.channel_.add(str);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addAllChannel(Iterable<String> iterable) {
                ensureChannelIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.channel_);
                onChanged();
                return this;
            }

            public Builder clearChannel() {
                this.channel_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -513;
                onChanged();
                return this;
            }

            public Builder addChannelBytes(ByteString byteString) {
                if (byteString != null) {
                    Cmd.checkByteStringIsUtf8(byteString);
                    ensureChannelIsMutable();
                    this.channel_.add(byteString);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getMsg() {
                Object obj = this.msg_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.msg_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getMsgBytes() {
                Object obj = this.msg_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.msg_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setMsg(String str) {
                if (str != null) {
                    this.msg_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearMsg() {
                this.msg_ = Cmd.getDefaultInstance().getMsg();
                onChanged();
                return this;
            }

            public Builder setMsgBytes(ByteString byteString) {
                if (byteString != null) {
                    Cmd.checkByteStringIsUtf8(byteString);
                    this.msg_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getDesc() {
                Object obj = this.desc_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.desc_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getDescBytes() {
                Object obj = this.desc_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.desc_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setDesc(String str) {
                if (str != null) {
                    this.desc_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearDesc() {
                this.desc_ = Cmd.getDefaultInstance().getDesc();
                onChanged();
                return this;
            }

            public Builder setDescBytes(ByteString byteString) {
                if (byteString != null) {
                    Cmd.checkByteStringIsUtf8(byteString);
                    this.desc_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public int getLocalDBId() {
                return this.localDBId_;
            }

            public Builder setLocalDBId(int i) {
                this.localDBId_ = i;
                onChanged();
                return this;
            }

            public Builder clearLocalDBId() {
                this.localDBId_ = 0;
                onChanged();
                return this;
            }

            public int getRetryCount() {
                return this.retryCount_;
            }

            public Builder setRetryCount(int i) {
                this.retryCount_ = i;
                onChanged();
                return this;
            }

            public Builder clearRetryCount() {
                this.retryCount_ = 0;
                onChanged();
                return this;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static Cmd getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Cmd> parser() {
            return PARSER;
        }

        public Parser<Cmd> getParserForType() {
            return PARSER;
        }

        public Cmd getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class CmdData1 extends GeneratedMessageV3 implements CmdData1OrBuilder {
        public static final int ANDROIDVERSION_FIELD_NUMBER = 9;
        public static final int APKURL_FIELD_NUMBER = 7;
        public static final int CHANNEL_FIELD_NUMBER = 6;
        private static final CmdData1 DEFAULT_INSTANCE = new CmdData1();
        public static final int MOBILEMODEL_FIELD_NUMBER = 8;
        public static final int MOBILESERIAL_FIELD_NUMBER = 2;
        public static final int NICKNAME_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final Parser<CmdData1> PARSER = new AbstractParser<CmdData1>() {
            public CmdData1 parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new CmdData1(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int SBOXVERSION_FIELD_NUMBER = 10;
        public static final int TEL_FIELD_NUMBER = 1;
        public static final int USERNAME_FIELD_NUMBER = 4;
        public static final int VISION_FIELD_NUMBER = 5;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public volatile Object androidVersion_;
        /* access modifiers changed from: private */
        public volatile Object apkUrl_;
        /* access modifiers changed from: private */
        public int channel_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public volatile Object mobileModel_;
        /* access modifiers changed from: private */
        public volatile Object mobileSerial_;
        /* access modifiers changed from: private */
        public volatile Object nickname_;
        /* access modifiers changed from: private */
        public volatile Object sboxVersion_;
        /* access modifiers changed from: private */
        public volatile Object tel_;
        /* access modifiers changed from: private */
        public volatile Object username_;
        /* access modifiers changed from: private */
        public volatile Object vision_;

        private CmdData1(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private CmdData1() {
            this.memoizedIsInitialized = -1;
            this.tel_ = "";
            this.mobileSerial_ = "";
            this.nickname_ = "";
            this.username_ = "";
            this.vision_ = "";
            this.channel_ = 0;
            this.apkUrl_ = "";
            this.mobileModel_ = "";
            this.androidVersion_ = "";
            this.sboxVersion_ = "";
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private CmdData1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        switch (readTag) {
                            case 0:
                                z = true;
                                break;
                            case 10:
                                this.tel_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 18:
                                this.mobileSerial_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 26:
                                this.nickname_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 34:
                                this.username_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 42:
                                this.vision_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 48:
                                this.channel_ = codedInputStream.readInt32();
                                break;
                            case 58:
                                this.apkUrl_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 66:
                                this.mobileModel_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 74:
                                this.androidVersion_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 82:
                                this.sboxVersion_ = codedInputStream.readStringRequireUtf8();
                                break;
                            default:
                                if (parseUnknownFieldProto3(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                    break;
                                }
                                z = true;
                                break;
                        }
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw null;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData1_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData1_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData1.class, Builder.class);
        }

        public String getTel() {
            Object obj = this.tel_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.tel_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getTelBytes() {
            Object obj = this.tel_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.tel_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getMobileSerial() {
            Object obj = this.mobileSerial_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.mobileSerial_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getMobileSerialBytes() {
            Object obj = this.mobileSerial_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.mobileSerial_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getNickname() {
            Object obj = this.nickname_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.nickname_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getNicknameBytes() {
            Object obj = this.nickname_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.nickname_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getUsername() {
            Object obj = this.username_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.username_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getUsernameBytes() {
            Object obj = this.username_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.username_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getVision() {
            Object obj = this.vision_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.vision_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getVisionBytes() {
            Object obj = this.vision_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.vision_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public int getChannel() {
            return this.channel_;
        }

        public String getApkUrl() {
            Object obj = this.apkUrl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.apkUrl_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getApkUrlBytes() {
            Object obj = this.apkUrl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.apkUrl_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getMobileModel() {
            Object obj = this.mobileModel_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.mobileModel_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getMobileModelBytes() {
            Object obj = this.mobileModel_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.mobileModel_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getAndroidVersion() {
            Object obj = this.androidVersion_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.androidVersion_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getAndroidVersionBytes() {
            Object obj = this.androidVersion_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.androidVersion_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getSboxVersion() {
            Object obj = this.sboxVersion_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sboxVersion_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getSboxVersionBytes() {
            Object obj = this.sboxVersion_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sboxVersion_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getTelBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.tel_);
            }
            if (!getMobileSerialBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.mobileSerial_);
            }
            if (!getNicknameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.nickname_);
            }
            if (!getUsernameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.username_);
            }
            if (!getVisionBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 5, this.vision_);
            }
            int i = this.channel_;
            if (i != 0) {
                codedOutputStream.writeInt32(6, i);
            }
            if (!getApkUrlBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 7, this.apkUrl_);
            }
            if (!getMobileModelBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 8, this.mobileModel_);
            }
            if (!getAndroidVersionBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 9, this.androidVersion_);
            }
            if (!getSboxVersionBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 10, this.sboxVersion_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!getTelBytes().isEmpty()) {
                i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.tel_);
            }
            if (!getMobileSerialBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(2, this.mobileSerial_);
            }
            if (!getNicknameBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(3, this.nickname_);
            }
            if (!getUsernameBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(4, this.username_);
            }
            if (!getVisionBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(5, this.vision_);
            }
            int i3 = this.channel_;
            if (i3 != 0) {
                i2 += CodedOutputStream.computeInt32Size(6, i3);
            }
            if (!getApkUrlBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(7, this.apkUrl_);
            }
            if (!getMobileModelBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(8, this.mobileModel_);
            }
            if (!getAndroidVersionBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(9, this.androidVersion_);
            }
            if (!getSboxVersionBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(10, this.sboxVersion_);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CmdData1)) {
                return super.equals(obj);
            }
            CmdData1 cmdData1 = (CmdData1) obj;
            if (!((((((((((getTel().equals(cmdData1.getTel())) && getMobileSerial().equals(cmdData1.getMobileSerial())) && getNickname().equals(cmdData1.getNickname())) && getUsername().equals(cmdData1.getUsername())) && getVision().equals(cmdData1.getVision())) && getChannel() == cmdData1.getChannel()) && getApkUrl().equals(cmdData1.getApkUrl())) && getMobileModel().equals(cmdData1.getMobileModel())) && getAndroidVersion().equals(cmdData1.getAndroidVersion())) && getSboxVersion().equals(cmdData1.getSboxVersion())) || !this.unknownFields.equals(cmdData1.unknownFields)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getTel().hashCode()) * 37) + 2) * 53) + getMobileSerial().hashCode()) * 37) + 3) * 53) + getNickname().hashCode()) * 37) + 4) * 53) + getUsername().hashCode()) * 37) + 5) * 53) + getVision().hashCode()) * 37) + 6) * 53) + getChannel()) * 37) + 7) * 53) + getApkUrl().hashCode()) * 37) + 8) * 53) + getMobileModel().hashCode()) * 37) + 9) * 53) + getAndroidVersion().hashCode()) * 37) + 10) * 53) + getSboxVersion().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public static CmdData1 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static CmdData1 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static CmdData1 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static CmdData1 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CmdData1 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static CmdData1 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CmdData1 parseFrom(InputStream inputStream) throws IOException {
            return (CmdData1) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CmdData1 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData1) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData1 parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CmdData1) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CmdData1 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData1) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData1 parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CmdData1) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CmdData1 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData1) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(CmdData1 cmdData1) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cmdData1);
        }

        public Builder toBuilder() {
            if (this == DEFAULT_INSTANCE) {
                return new Builder();
            }
            return new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CmdData1OrBuilder {
            private Object androidVersion_;
            private Object apkUrl_;
            private int channel_;
            private Object mobileModel_;
            private Object mobileSerial_;
            private Object nickname_;
            private Object sboxVersion_;
            private Object tel_;
            private Object username_;
            private Object vision_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData1_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData1_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData1.class, Builder.class);
            }

            private Builder() {
                this.tel_ = "";
                this.mobileSerial_ = "";
                this.nickname_ = "";
                this.username_ = "";
                this.vision_ = "";
                this.apkUrl_ = "";
                this.mobileModel_ = "";
                this.androidVersion_ = "";
                this.sboxVersion_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.tel_ = "";
                this.mobileSerial_ = "";
                this.nickname_ = "";
                this.username_ = "";
                this.vision_ = "";
                this.apkUrl_ = "";
                this.mobileModel_ = "";
                this.androidVersion_ = "";
                this.sboxVersion_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = CmdData1.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                this.tel_ = "";
                this.mobileSerial_ = "";
                this.nickname_ = "";
                this.username_ = "";
                this.vision_ = "";
                this.channel_ = 0;
                this.apkUrl_ = "";
                this.mobileModel_ = "";
                this.androidVersion_ = "";
                this.sboxVersion_ = "";
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData1_descriptor;
            }

            public CmdData1 getDefaultInstanceForType() {
                return CmdData1.getDefaultInstance();
            }

            public CmdData1 build() {
                CmdData1 buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public CmdData1 buildPartial() {
                CmdData1 cmdData1 = new CmdData1((GeneratedMessageV3.Builder) this);
                Object unused = cmdData1.tel_ = this.tel_;
                Object unused2 = cmdData1.mobileSerial_ = this.mobileSerial_;
                Object unused3 = cmdData1.nickname_ = this.nickname_;
                Object unused4 = cmdData1.username_ = this.username_;
                Object unused5 = cmdData1.vision_ = this.vision_;
                int unused6 = cmdData1.channel_ = this.channel_;
                Object unused7 = cmdData1.apkUrl_ = this.apkUrl_;
                Object unused8 = cmdData1.mobileModel_ = this.mobileModel_;
                Object unused9 = cmdData1.androidVersion_ = this.androidVersion_;
                Object unused10 = cmdData1.sboxVersion_ = this.sboxVersion_;
                onBuilt();
                return cmdData1;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder mergeFrom(Message message) {
                if (message instanceof CmdData1) {
                    return mergeFrom((CmdData1) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CmdData1 cmdData1) {
                if (cmdData1 == CmdData1.getDefaultInstance()) {
                    return this;
                }
                if (!cmdData1.getTel().isEmpty()) {
                    this.tel_ = cmdData1.tel_;
                    onChanged();
                }
                if (!cmdData1.getMobileSerial().isEmpty()) {
                    this.mobileSerial_ = cmdData1.mobileSerial_;
                    onChanged();
                }
                if (!cmdData1.getNickname().isEmpty()) {
                    this.nickname_ = cmdData1.nickname_;
                    onChanged();
                }
                if (!cmdData1.getUsername().isEmpty()) {
                    this.username_ = cmdData1.username_;
                    onChanged();
                }
                if (!cmdData1.getVision().isEmpty()) {
                    this.vision_ = cmdData1.vision_;
                    onChanged();
                }
                if (cmdData1.getChannel() != 0) {
                    setChannel(cmdData1.getChannel());
                }
                if (!cmdData1.getApkUrl().isEmpty()) {
                    this.apkUrl_ = cmdData1.apkUrl_;
                    onChanged();
                }
                if (!cmdData1.getMobileModel().isEmpty()) {
                    this.mobileModel_ = cmdData1.mobileModel_;
                    onChanged();
                }
                if (!cmdData1.getAndroidVersion().isEmpty()) {
                    this.androidVersion_ = cmdData1.androidVersion_;
                    onChanged();
                }
                if (!cmdData1.getSboxVersion().isEmpty()) {
                    this.sboxVersion_ = cmdData1.sboxVersion_;
                    onChanged();
                }
                mergeUnknownFields(cmdData1.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.xp.wx.middleware.MsgProtos.CmdData1.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.xp.wx.middleware.MsgProtos.CmdData1.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.xp.wx.middleware.MsgProtos$CmdData1 r3 = (com.xp.wx.middleware.MsgProtos.CmdData1) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData1) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.xp.wx.middleware.MsgProtos$CmdData1 r4 = (com.xp.wx.middleware.MsgProtos.CmdData1) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData1) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.middleware.MsgProtos.CmdData1.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.xp.wx.middleware.MsgProtos$CmdData1$Builder");
            }

            public String getTel() {
                Object obj = this.tel_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.tel_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getTelBytes() {
                Object obj = this.tel_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.tel_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setTel(String str) {
                if (str != null) {
                    this.tel_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearTel() {
                this.tel_ = CmdData1.getDefaultInstance().getTel();
                onChanged();
                return this;
            }

            public Builder setTelBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData1.checkByteStringIsUtf8(byteString);
                    this.tel_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getMobileSerial() {
                Object obj = this.mobileSerial_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.mobileSerial_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getMobileSerialBytes() {
                Object obj = this.mobileSerial_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.mobileSerial_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setMobileSerial(String str) {
                if (str != null) {
                    this.mobileSerial_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearMobileSerial() {
                this.mobileSerial_ = CmdData1.getDefaultInstance().getMobileSerial();
                onChanged();
                return this;
            }

            public Builder setMobileSerialBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData1.checkByteStringIsUtf8(byteString);
                    this.mobileSerial_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getNickname() {
                Object obj = this.nickname_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.nickname_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getNicknameBytes() {
                Object obj = this.nickname_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.nickname_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setNickname(String str) {
                if (str != null) {
                    this.nickname_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearNickname() {
                this.nickname_ = CmdData1.getDefaultInstance().getNickname();
                onChanged();
                return this;
            }

            public Builder setNicknameBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData1.checkByteStringIsUtf8(byteString);
                    this.nickname_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getUsername() {
                Object obj = this.username_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.username_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getUsernameBytes() {
                Object obj = this.username_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.username_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setUsername(String str) {
                if (str != null) {
                    this.username_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearUsername() {
                this.username_ = CmdData1.getDefaultInstance().getUsername();
                onChanged();
                return this;
            }

            public Builder setUsernameBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData1.checkByteStringIsUtf8(byteString);
                    this.username_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getVision() {
                Object obj = this.vision_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.vision_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getVisionBytes() {
                Object obj = this.vision_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.vision_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setVision(String str) {
                if (str != null) {
                    this.vision_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearVision() {
                this.vision_ = CmdData1.getDefaultInstance().getVision();
                onChanged();
                return this;
            }

            public Builder setVisionBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData1.checkByteStringIsUtf8(byteString);
                    this.vision_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public int getChannel() {
                return this.channel_;
            }

            public Builder setChannel(int i) {
                this.channel_ = i;
                onChanged();
                return this;
            }

            public Builder clearChannel() {
                this.channel_ = 0;
                onChanged();
                return this;
            }

            public String getApkUrl() {
                Object obj = this.apkUrl_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.apkUrl_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getApkUrlBytes() {
                Object obj = this.apkUrl_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.apkUrl_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setApkUrl(String str) {
                if (str != null) {
                    this.apkUrl_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearApkUrl() {
                this.apkUrl_ = CmdData1.getDefaultInstance().getApkUrl();
                onChanged();
                return this;
            }

            public Builder setApkUrlBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData1.checkByteStringIsUtf8(byteString);
                    this.apkUrl_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getMobileModel() {
                Object obj = this.mobileModel_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.mobileModel_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getMobileModelBytes() {
                Object obj = this.mobileModel_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.mobileModel_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setMobileModel(String str) {
                if (str != null) {
                    this.mobileModel_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearMobileModel() {
                this.mobileModel_ = CmdData1.getDefaultInstance().getMobileModel();
                onChanged();
                return this;
            }

            public Builder setMobileModelBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData1.checkByteStringIsUtf8(byteString);
                    this.mobileModel_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getAndroidVersion() {
                Object obj = this.androidVersion_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.androidVersion_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getAndroidVersionBytes() {
                Object obj = this.androidVersion_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.androidVersion_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setAndroidVersion(String str) {
                if (str != null) {
                    this.androidVersion_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearAndroidVersion() {
                this.androidVersion_ = CmdData1.getDefaultInstance().getAndroidVersion();
                onChanged();
                return this;
            }

            public Builder setAndroidVersionBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData1.checkByteStringIsUtf8(byteString);
                    this.androidVersion_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getSboxVersion() {
                Object obj = this.sboxVersion_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.sboxVersion_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getSboxVersionBytes() {
                Object obj = this.sboxVersion_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sboxVersion_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setSboxVersion(String str) {
                if (str != null) {
                    this.sboxVersion_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearSboxVersion() {
                this.sboxVersion_ = CmdData1.getDefaultInstance().getSboxVersion();
                onChanged();
                return this;
            }

            public Builder setSboxVersionBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData1.checkByteStringIsUtf8(byteString);
                    this.sboxVersion_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static CmdData1 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<CmdData1> parser() {
            return PARSER;
        }

        public Parser<CmdData1> getParserForType() {
            return PARSER;
        }

        public CmdData1 getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class CmdData2002 extends GeneratedMessageV3 implements CmdData2002OrBuilder {
        public static final int CITYCODE_FIELD_NUMBER = 9;
        public static final int CITYSTR_FIELD_NUMBER = 10;
        public static final int COUNTRYCODE_FIELD_NUMBER = 6;
        private static final CmdData2002 DEFAULT_INSTANCE = new CmdData2002();
        public static final int HEADIMG_FIELD_NUMBER = 11;
        public static final int NICKNAME_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final Parser<CmdData2002> PARSER = new AbstractParser<CmdData2002>() {
            public CmdData2002 parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new CmdData2002(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int PROVINCECODE_FIELD_NUMBER = 7;
        public static final int PROVINCESTR_FIELD_NUMBER = 8;
        public static final int SEX_FIELD_NUMBER = 4;
        public static final int SIGNATURE_FIELD_NUMBER = 5;
        public static final int USERNAME_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public volatile Object cityCode_;
        /* access modifiers changed from: private */
        public volatile Object cityStr_;
        /* access modifiers changed from: private */
        public volatile Object countryCode_;
        /* access modifiers changed from: private */
        public volatile Object headImg_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public volatile Object nickname_;
        /* access modifiers changed from: private */
        public volatile Object provinceCode_;
        /* access modifiers changed from: private */
        public volatile Object provinceStr_;
        /* access modifiers changed from: private */
        public volatile Object sex_;
        /* access modifiers changed from: private */
        public volatile Object signature_;
        /* access modifiers changed from: private */
        public volatile Object username_;

        private CmdData2002(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private CmdData2002() {
            this.memoizedIsInitialized = -1;
            this.username_ = "";
            this.nickname_ = "";
            this.sex_ = "";
            this.signature_ = "";
            this.countryCode_ = "";
            this.provinceCode_ = "";
            this.provinceStr_ = "";
            this.cityCode_ = "";
            this.cityStr_ = "";
            this.headImg_ = "";
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private CmdData2002(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        switch (readTag) {
                            case 0:
                                z = true;
                                break;
                            case 10:
                                this.username_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 18:
                                this.nickname_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 34:
                                this.sex_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 42:
                                this.signature_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 50:
                                this.countryCode_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 58:
                                this.provinceCode_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 66:
                                this.provinceStr_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 74:
                                this.cityCode_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 82:
                                this.cityStr_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 90:
                                this.headImg_ = codedInputStream.readStringRequireUtf8();
                                break;
                            default:
                                if (parseUnknownFieldProto3(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                    break;
                                }
                                z = true;
                                break;
                        }
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw null;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2002_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2002_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData2002.class, Builder.class);
        }

        public String getUsername() {
            Object obj = this.username_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.username_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getUsernameBytes() {
            Object obj = this.username_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.username_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getNickname() {
            Object obj = this.nickname_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.nickname_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getNicknameBytes() {
            Object obj = this.nickname_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.nickname_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getSex() {
            Object obj = this.sex_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sex_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getSexBytes() {
            Object obj = this.sex_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sex_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getSignature() {
            Object obj = this.signature_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.signature_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getSignatureBytes() {
            Object obj = this.signature_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.signature_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getCountryCode() {
            Object obj = this.countryCode_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.countryCode_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getCountryCodeBytes() {
            Object obj = this.countryCode_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.countryCode_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getProvinceCode() {
            Object obj = this.provinceCode_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.provinceCode_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getProvinceCodeBytes() {
            Object obj = this.provinceCode_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.provinceCode_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getProvinceStr() {
            Object obj = this.provinceStr_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.provinceStr_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getProvinceStrBytes() {
            Object obj = this.provinceStr_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.provinceStr_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getCityCode() {
            Object obj = this.cityCode_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.cityCode_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getCityCodeBytes() {
            Object obj = this.cityCode_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.cityCode_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getCityStr() {
            Object obj = this.cityStr_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.cityStr_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getCityStrBytes() {
            Object obj = this.cityStr_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.cityStr_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getHeadImg() {
            Object obj = this.headImg_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.headImg_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getHeadImgBytes() {
            Object obj = this.headImg_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.headImg_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getUsernameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.username_);
            }
            if (!getNicknameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.nickname_);
            }
            if (!getSexBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.sex_);
            }
            if (!getSignatureBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 5, this.signature_);
            }
            if (!getCountryCodeBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 6, this.countryCode_);
            }
            if (!getProvinceCodeBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 7, this.provinceCode_);
            }
            if (!getProvinceStrBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 8, this.provinceStr_);
            }
            if (!getCityCodeBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 9, this.cityCode_);
            }
            if (!getCityStrBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 10, this.cityStr_);
            }
            if (!getHeadImgBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 11, this.headImg_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!getUsernameBytes().isEmpty()) {
                i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.username_);
            }
            if (!getNicknameBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(2, this.nickname_);
            }
            if (!getSexBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(4, this.sex_);
            }
            if (!getSignatureBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(5, this.signature_);
            }
            if (!getCountryCodeBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(6, this.countryCode_);
            }
            if (!getProvinceCodeBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(7, this.provinceCode_);
            }
            if (!getProvinceStrBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(8, this.provinceStr_);
            }
            if (!getCityCodeBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(9, this.cityCode_);
            }
            if (!getCityStrBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(10, this.cityStr_);
            }
            if (!getHeadImgBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(11, this.headImg_);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CmdData2002)) {
                return super.equals(obj);
            }
            CmdData2002 cmdData2002 = (CmdData2002) obj;
            if (!((((((((((getUsername().equals(cmdData2002.getUsername())) && getNickname().equals(cmdData2002.getNickname())) && getSex().equals(cmdData2002.getSex())) && getSignature().equals(cmdData2002.getSignature())) && getCountryCode().equals(cmdData2002.getCountryCode())) && getProvinceCode().equals(cmdData2002.getProvinceCode())) && getProvinceStr().equals(cmdData2002.getProvinceStr())) && getCityCode().equals(cmdData2002.getCityCode())) && getCityStr().equals(cmdData2002.getCityStr())) && getHeadImg().equals(cmdData2002.getHeadImg())) || !this.unknownFields.equals(cmdData2002.unknownFields)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getUsername().hashCode()) * 37) + 2) * 53) + getNickname().hashCode()) * 37) + 4) * 53) + getSex().hashCode()) * 37) + 5) * 53) + getSignature().hashCode()) * 37) + 6) * 53) + getCountryCode().hashCode()) * 37) + 7) * 53) + getProvinceCode().hashCode()) * 37) + 8) * 53) + getProvinceStr().hashCode()) * 37) + 9) * 53) + getCityCode().hashCode()) * 37) + 10) * 53) + getCityStr().hashCode()) * 37) + 11) * 53) + getHeadImg().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public static CmdData2002 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static CmdData2002 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static CmdData2002 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static CmdData2002 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CmdData2002 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static CmdData2002 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CmdData2002 parseFrom(InputStream inputStream) throws IOException {
            return (CmdData2002) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CmdData2002 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2002) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData2002 parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CmdData2002) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CmdData2002 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2002) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData2002 parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CmdData2002) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CmdData2002 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2002) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(CmdData2002 cmdData2002) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cmdData2002);
        }

        public Builder toBuilder() {
            if (this == DEFAULT_INSTANCE) {
                return new Builder();
            }
            return new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CmdData2002OrBuilder {
            private Object cityCode_;
            private Object cityStr_;
            private Object countryCode_;
            private Object headImg_;
            private Object nickname_;
            private Object provinceCode_;
            private Object provinceStr_;
            private Object sex_;
            private Object signature_;
            private Object username_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2002_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2002_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData2002.class, Builder.class);
            }

            private Builder() {
                this.username_ = "";
                this.nickname_ = "";
                this.sex_ = "";
                this.signature_ = "";
                this.countryCode_ = "";
                this.provinceCode_ = "";
                this.provinceStr_ = "";
                this.cityCode_ = "";
                this.cityStr_ = "";
                this.headImg_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.username_ = "";
                this.nickname_ = "";
                this.sex_ = "";
                this.signature_ = "";
                this.countryCode_ = "";
                this.provinceCode_ = "";
                this.provinceStr_ = "";
                this.cityCode_ = "";
                this.cityStr_ = "";
                this.headImg_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = CmdData2002.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                this.username_ = "";
                this.nickname_ = "";
                this.sex_ = "";
                this.signature_ = "";
                this.countryCode_ = "";
                this.provinceCode_ = "";
                this.provinceStr_ = "";
                this.cityCode_ = "";
                this.cityStr_ = "";
                this.headImg_ = "";
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2002_descriptor;
            }

            public CmdData2002 getDefaultInstanceForType() {
                return CmdData2002.getDefaultInstance();
            }

            public CmdData2002 build() {
                CmdData2002 buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public CmdData2002 buildPartial() {
                CmdData2002 cmdData2002 = new CmdData2002((GeneratedMessageV3.Builder) this);
                Object unused = cmdData2002.username_ = this.username_;
                Object unused2 = cmdData2002.nickname_ = this.nickname_;
                Object unused3 = cmdData2002.sex_ = this.sex_;
                Object unused4 = cmdData2002.signature_ = this.signature_;
                Object unused5 = cmdData2002.countryCode_ = this.countryCode_;
                Object unused6 = cmdData2002.provinceCode_ = this.provinceCode_;
                Object unused7 = cmdData2002.provinceStr_ = this.provinceStr_;
                Object unused8 = cmdData2002.cityCode_ = this.cityCode_;
                Object unused9 = cmdData2002.cityStr_ = this.cityStr_;
                Object unused10 = cmdData2002.headImg_ = this.headImg_;
                onBuilt();
                return cmdData2002;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder mergeFrom(Message message) {
                if (message instanceof CmdData2002) {
                    return mergeFrom((CmdData2002) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CmdData2002 cmdData2002) {
                if (cmdData2002 == CmdData2002.getDefaultInstance()) {
                    return this;
                }
                if (!cmdData2002.getUsername().isEmpty()) {
                    this.username_ = cmdData2002.username_;
                    onChanged();
                }
                if (!cmdData2002.getNickname().isEmpty()) {
                    this.nickname_ = cmdData2002.nickname_;
                    onChanged();
                }
                if (!cmdData2002.getSex().isEmpty()) {
                    this.sex_ = cmdData2002.sex_;
                    onChanged();
                }
                if (!cmdData2002.getSignature().isEmpty()) {
                    this.signature_ = cmdData2002.signature_;
                    onChanged();
                }
                if (!cmdData2002.getCountryCode().isEmpty()) {
                    this.countryCode_ = cmdData2002.countryCode_;
                    onChanged();
                }
                if (!cmdData2002.getProvinceCode().isEmpty()) {
                    this.provinceCode_ = cmdData2002.provinceCode_;
                    onChanged();
                }
                if (!cmdData2002.getProvinceStr().isEmpty()) {
                    this.provinceStr_ = cmdData2002.provinceStr_;
                    onChanged();
                }
                if (!cmdData2002.getCityCode().isEmpty()) {
                    this.cityCode_ = cmdData2002.cityCode_;
                    onChanged();
                }
                if (!cmdData2002.getCityStr().isEmpty()) {
                    this.cityStr_ = cmdData2002.cityStr_;
                    onChanged();
                }
                if (!cmdData2002.getHeadImg().isEmpty()) {
                    this.headImg_ = cmdData2002.headImg_;
                    onChanged();
                }
                mergeUnknownFields(cmdData2002.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.xp.wx.middleware.MsgProtos.CmdData2002.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.xp.wx.middleware.MsgProtos.CmdData2002.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.xp.wx.middleware.MsgProtos$CmdData2002 r3 = (com.xp.wx.middleware.MsgProtos.CmdData2002) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData2002) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.xp.wx.middleware.MsgProtos$CmdData2002 r4 = (com.xp.wx.middleware.MsgProtos.CmdData2002) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData2002) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.middleware.MsgProtos.CmdData2002.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.xp.wx.middleware.MsgProtos$CmdData2002$Builder");
            }

            public String getUsername() {
                Object obj = this.username_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.username_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getUsernameBytes() {
                Object obj = this.username_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.username_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setUsername(String str) {
                if (str != null) {
                    this.username_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearUsername() {
                this.username_ = CmdData2002.getDefaultInstance().getUsername();
                onChanged();
                return this;
            }

            public Builder setUsernameBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2002.checkByteStringIsUtf8(byteString);
                    this.username_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getNickname() {
                Object obj = this.nickname_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.nickname_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getNicknameBytes() {
                Object obj = this.nickname_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.nickname_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setNickname(String str) {
                if (str != null) {
                    this.nickname_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearNickname() {
                this.nickname_ = CmdData2002.getDefaultInstance().getNickname();
                onChanged();
                return this;
            }

            public Builder setNicknameBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2002.checkByteStringIsUtf8(byteString);
                    this.nickname_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getSex() {
                Object obj = this.sex_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.sex_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getSexBytes() {
                Object obj = this.sex_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sex_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setSex(String str) {
                if (str != null) {
                    this.sex_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearSex() {
                this.sex_ = CmdData2002.getDefaultInstance().getSex();
                onChanged();
                return this;
            }

            public Builder setSexBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2002.checkByteStringIsUtf8(byteString);
                    this.sex_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getSignature() {
                Object obj = this.signature_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.signature_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getSignatureBytes() {
                Object obj = this.signature_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.signature_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setSignature(String str) {
                if (str != null) {
                    this.signature_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearSignature() {
                this.signature_ = CmdData2002.getDefaultInstance().getSignature();
                onChanged();
                return this;
            }

            public Builder setSignatureBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2002.checkByteStringIsUtf8(byteString);
                    this.signature_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getCountryCode() {
                Object obj = this.countryCode_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.countryCode_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getCountryCodeBytes() {
                Object obj = this.countryCode_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.countryCode_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setCountryCode(String str) {
                if (str != null) {
                    this.countryCode_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearCountryCode() {
                this.countryCode_ = CmdData2002.getDefaultInstance().getCountryCode();
                onChanged();
                return this;
            }

            public Builder setCountryCodeBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2002.checkByteStringIsUtf8(byteString);
                    this.countryCode_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getProvinceCode() {
                Object obj = this.provinceCode_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.provinceCode_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getProvinceCodeBytes() {
                Object obj = this.provinceCode_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.provinceCode_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setProvinceCode(String str) {
                if (str != null) {
                    this.provinceCode_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearProvinceCode() {
                this.provinceCode_ = CmdData2002.getDefaultInstance().getProvinceCode();
                onChanged();
                return this;
            }

            public Builder setProvinceCodeBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2002.checkByteStringIsUtf8(byteString);
                    this.provinceCode_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getProvinceStr() {
                Object obj = this.provinceStr_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.provinceStr_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getProvinceStrBytes() {
                Object obj = this.provinceStr_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.provinceStr_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setProvinceStr(String str) {
                if (str != null) {
                    this.provinceStr_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearProvinceStr() {
                this.provinceStr_ = CmdData2002.getDefaultInstance().getProvinceStr();
                onChanged();
                return this;
            }

            public Builder setProvinceStrBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2002.checkByteStringIsUtf8(byteString);
                    this.provinceStr_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getCityCode() {
                Object obj = this.cityCode_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.cityCode_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getCityCodeBytes() {
                Object obj = this.cityCode_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.cityCode_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setCityCode(String str) {
                if (str != null) {
                    this.cityCode_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearCityCode() {
                this.cityCode_ = CmdData2002.getDefaultInstance().getCityCode();
                onChanged();
                return this;
            }

            public Builder setCityCodeBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2002.checkByteStringIsUtf8(byteString);
                    this.cityCode_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getCityStr() {
                Object obj = this.cityStr_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.cityStr_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getCityStrBytes() {
                Object obj = this.cityStr_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.cityStr_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setCityStr(String str) {
                if (str != null) {
                    this.cityStr_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearCityStr() {
                this.cityStr_ = CmdData2002.getDefaultInstance().getCityStr();
                onChanged();
                return this;
            }

            public Builder setCityStrBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2002.checkByteStringIsUtf8(byteString);
                    this.cityStr_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getHeadImg() {
                Object obj = this.headImg_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.headImg_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getHeadImgBytes() {
                Object obj = this.headImg_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.headImg_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setHeadImg(String str) {
                if (str != null) {
                    this.headImg_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearHeadImg() {
                this.headImg_ = CmdData2002.getDefaultInstance().getHeadImg();
                onChanged();
                return this;
            }

            public Builder setHeadImgBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2002.checkByteStringIsUtf8(byteString);
                    this.headImg_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static CmdData2002 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<CmdData2002> parser() {
            return PARSER;
        }

        public Parser<CmdData2002> getParserForType() {
            return PARSER;
        }

        public CmdData2002 getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class CmdData2003 extends GeneratedMessageV3 implements CmdData2003OrBuilder {
        public static final int ATUSER_FIELD_NUMBER = 3;
        public static final int CONTENT_FIELD_NUMBER = 2;
        private static final CmdData2003 DEFAULT_INSTANCE = new CmdData2003();
        /* access modifiers changed from: private */
        public static final Parser<CmdData2003> PARSER = new AbstractParser<CmdData2003>() {
            public CmdData2003 parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new CmdData2003(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int TOUSER_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public LazyStringList atuser_;
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public volatile Object content_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public volatile Object toUser_;

        private CmdData2003(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private CmdData2003() {
            this.memoizedIsInitialized = -1;
            this.toUser_ = "";
            this.content_ = "";
            this.atuser_ = LazyStringArrayList.EMPTY;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private CmdData2003(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                boolean z2 = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.toUser_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.content_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                if (!(z2 & true)) {
                                    this.atuser_ = new LazyStringArrayList();
                                    z2 |= true;
                                }
                                this.atuser_.add(readStringRequireUtf8);
                            } else if (!parseUnknownFieldProto3(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        if (z2 & true) {
                            this.atuser_ = this.atuser_.getUnmodifiableView();
                        }
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if (z2 & true) {
                    this.atuser_ = this.atuser_.getUnmodifiableView();
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw null;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2003_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2003_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData2003.class, Builder.class);
        }

        public String getToUser() {
            Object obj = this.toUser_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.toUser_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getToUserBytes() {
            Object obj = this.toUser_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.toUser_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getContent() {
            Object obj = this.content_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.content_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getContentBytes() {
            Object obj = this.content_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.content_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public ProtocolStringList getAtuserList() {
            return this.atuser_;
        }

        public int getAtuserCount() {
            return this.atuser_.size();
        }

        public String getAtuser(int i) {
            return (String) this.atuser_.get(i);
        }

        public ByteString getAtuserBytes(int i) {
            return this.atuser_.getByteString(i);
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getToUserBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.toUser_);
            }
            if (!getContentBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.content_);
            }
            for (int i = 0; i < this.atuser_.size(); i++) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.atuser_.getRaw(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !getToUserBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.toUser_) + 0 : 0;
            if (!getContentBytes().isEmpty()) {
                computeStringSize += GeneratedMessageV3.computeStringSize(2, this.content_);
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.atuser_.size(); i3++) {
                i2 += computeStringSizeNoTag(this.atuser_.getRaw(i3));
            }
            int size = computeStringSize + i2 + (getAtuserList().size() * 1) + this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CmdData2003)) {
                return super.equals(obj);
            }
            CmdData2003 cmdData2003 = (CmdData2003) obj;
            if (!(((getToUser().equals(cmdData2003.getToUser())) && getContent().equals(cmdData2003.getContent())) && getAtuserList().equals(cmdData2003.getAtuserList())) || !this.unknownFields.equals(cmdData2003.unknownFields)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getToUser().hashCode()) * 37) + 2) * 53) + getContent().hashCode();
            if (getAtuserCount() > 0) {
                hashCode = (((hashCode * 37) + 3) * 53) + getAtuserList().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public static CmdData2003 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static CmdData2003 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static CmdData2003 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static CmdData2003 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CmdData2003 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static CmdData2003 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CmdData2003 parseFrom(InputStream inputStream) throws IOException {
            return (CmdData2003) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CmdData2003 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2003) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData2003 parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CmdData2003) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CmdData2003 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2003) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData2003 parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CmdData2003) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CmdData2003 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2003) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(CmdData2003 cmdData2003) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cmdData2003);
        }

        public Builder toBuilder() {
            if (this == DEFAULT_INSTANCE) {
                return new Builder();
            }
            return new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CmdData2003OrBuilder {
            private LazyStringList atuser_;
            private int bitField0_;
            private Object content_;
            private Object toUser_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2003_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2003_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData2003.class, Builder.class);
            }

            private Builder() {
                this.toUser_ = "";
                this.content_ = "";
                this.atuser_ = LazyStringArrayList.EMPTY;
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.toUser_ = "";
                this.content_ = "";
                this.atuser_ = LazyStringArrayList.EMPTY;
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = CmdData2003.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                this.toUser_ = "";
                this.content_ = "";
                this.atuser_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -5;
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2003_descriptor;
            }

            public CmdData2003 getDefaultInstanceForType() {
                return CmdData2003.getDefaultInstance();
            }

            public CmdData2003 build() {
                CmdData2003 buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public CmdData2003 buildPartial() {
                CmdData2003 cmdData2003 = new CmdData2003((GeneratedMessageV3.Builder) this);
                Object unused = cmdData2003.toUser_ = this.toUser_;
                Object unused2 = cmdData2003.content_ = this.content_;
                if ((this.bitField0_ & 4) == 4) {
                    this.atuser_ = this.atuser_.getUnmodifiableView();
                    this.bitField0_ &= -5;
                }
                LazyStringList unused3 = cmdData2003.atuser_ = this.atuser_;
                int unused4 = cmdData2003.bitField0_ = 0;
                onBuilt();
                return cmdData2003;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder mergeFrom(Message message) {
                if (message instanceof CmdData2003) {
                    return mergeFrom((CmdData2003) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CmdData2003 cmdData2003) {
                if (cmdData2003 == CmdData2003.getDefaultInstance()) {
                    return this;
                }
                if (!cmdData2003.getToUser().isEmpty()) {
                    this.toUser_ = cmdData2003.toUser_;
                    onChanged();
                }
                if (!cmdData2003.getContent().isEmpty()) {
                    this.content_ = cmdData2003.content_;
                    onChanged();
                }
                if (!cmdData2003.atuser_.isEmpty()) {
                    if (this.atuser_.isEmpty()) {
                        this.atuser_ = cmdData2003.atuser_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureAtuserIsMutable();
                        this.atuser_.addAll(cmdData2003.atuser_);
                    }
                    onChanged();
                }
                mergeUnknownFields(cmdData2003.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.xp.wx.middleware.MsgProtos.CmdData2003.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.xp.wx.middleware.MsgProtos.CmdData2003.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.xp.wx.middleware.MsgProtos$CmdData2003 r3 = (com.xp.wx.middleware.MsgProtos.CmdData2003) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData2003) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.xp.wx.middleware.MsgProtos$CmdData2003 r4 = (com.xp.wx.middleware.MsgProtos.CmdData2003) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData2003) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.middleware.MsgProtos.CmdData2003.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.xp.wx.middleware.MsgProtos$CmdData2003$Builder");
            }

            public String getToUser() {
                Object obj = this.toUser_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.toUser_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getToUserBytes() {
                Object obj = this.toUser_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.toUser_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setToUser(String str) {
                if (str != null) {
                    this.toUser_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearToUser() {
                this.toUser_ = CmdData2003.getDefaultInstance().getToUser();
                onChanged();
                return this;
            }

            public Builder setToUserBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2003.checkByteStringIsUtf8(byteString);
                    this.toUser_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getContent() {
                Object obj = this.content_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.content_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getContentBytes() {
                Object obj = this.content_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.content_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setContent(String str) {
                if (str != null) {
                    this.content_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearContent() {
                this.content_ = CmdData2003.getDefaultInstance().getContent();
                onChanged();
                return this;
            }

            public Builder setContentBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2003.checkByteStringIsUtf8(byteString);
                    this.content_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            private void ensureAtuserIsMutable() {
                if ((this.bitField0_ & 4) != 4) {
                    this.atuser_ = new LazyStringArrayList(this.atuser_);
                    this.bitField0_ |= 4;
                }
            }

            public ProtocolStringList getAtuserList() {
                return this.atuser_.getUnmodifiableView();
            }

            public int getAtuserCount() {
                return this.atuser_.size();
            }

            public String getAtuser(int i) {
                return (String) this.atuser_.get(i);
            }

            public ByteString getAtuserBytes(int i) {
                return this.atuser_.getByteString(i);
            }

            public Builder setAtuser(int i, String str) {
                if (str != null) {
                    ensureAtuserIsMutable();
                    this.atuser_.set(i, str);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addAtuser(String str) {
                if (str != null) {
                    ensureAtuserIsMutable();
                    this.atuser_.add(str);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addAllAtuser(Iterable<String> iterable) {
                ensureAtuserIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.atuser_);
                onChanged();
                return this;
            }

            public Builder clearAtuser() {
                this.atuser_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder addAtuserBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2003.checkByteStringIsUtf8(byteString);
                    ensureAtuserIsMutable();
                    this.atuser_.add(byteString);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static CmdData2003 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<CmdData2003> parser() {
            return PARSER;
        }

        public Parser<CmdData2003> getParserForType() {
            return PARSER;
        }

        public CmdData2003 getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class CmdData2004 extends GeneratedMessageV3 implements CmdData2004OrBuilder {
        private static final CmdData2004 DEFAULT_INSTANCE = new CmdData2004();
        public static final int IMGPATH_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final Parser<CmdData2004> PARSER = new AbstractParser<CmdData2004>() {
            public CmdData2004 parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new CmdData2004(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int TOUSER_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public LazyStringList imgpath_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public volatile Object toUser_;

        private CmdData2004(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private CmdData2004() {
            this.memoizedIsInitialized = -1;
            this.toUser_ = "";
            this.imgpath_ = LazyStringArrayList.EMPTY;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private CmdData2004(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                boolean z2 = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.toUser_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                if (!(z2 & true)) {
                                    this.imgpath_ = new LazyStringArrayList();
                                    z2 |= true;
                                }
                                this.imgpath_.add(readStringRequireUtf8);
                            } else if (!parseUnknownFieldProto3(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        if (z2 & true) {
                            this.imgpath_ = this.imgpath_.getUnmodifiableView();
                        }
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if (z2 & true) {
                    this.imgpath_ = this.imgpath_.getUnmodifiableView();
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw null;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2004_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2004_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData2004.class, Builder.class);
        }

        public String getToUser() {
            Object obj = this.toUser_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.toUser_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getToUserBytes() {
            Object obj = this.toUser_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.toUser_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public ProtocolStringList getImgpathList() {
            return this.imgpath_;
        }

        public int getImgpathCount() {
            return this.imgpath_.size();
        }

        public String getImgpath(int i) {
            return (String) this.imgpath_.get(i);
        }

        public ByteString getImgpathBytes(int i) {
            return this.imgpath_.getByteString(i);
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getToUserBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.toUser_);
            }
            for (int i = 0; i < this.imgpath_.size(); i++) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.imgpath_.getRaw(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !getToUserBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.toUser_) + 0 : 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.imgpath_.size(); i3++) {
                i2 += computeStringSizeNoTag(this.imgpath_.getRaw(i3));
            }
            int size = computeStringSize + i2 + (getImgpathList().size() * 1) + this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CmdData2004)) {
                return super.equals(obj);
            }
            CmdData2004 cmdData2004 = (CmdData2004) obj;
            if (!((getToUser().equals(cmdData2004.getToUser())) && getImgpathList().equals(cmdData2004.getImgpathList())) || !this.unknownFields.equals(cmdData2004.unknownFields)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getToUser().hashCode();
            if (getImgpathCount() > 0) {
                hashCode = (((hashCode * 37) + 2) * 53) + getImgpathList().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public static CmdData2004 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static CmdData2004 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static CmdData2004 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static CmdData2004 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CmdData2004 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static CmdData2004 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CmdData2004 parseFrom(InputStream inputStream) throws IOException {
            return (CmdData2004) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CmdData2004 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2004) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData2004 parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CmdData2004) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CmdData2004 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2004) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData2004 parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CmdData2004) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CmdData2004 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2004) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(CmdData2004 cmdData2004) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cmdData2004);
        }

        public Builder toBuilder() {
            if (this == DEFAULT_INSTANCE) {
                return new Builder();
            }
            return new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CmdData2004OrBuilder {
            private int bitField0_;
            private LazyStringList imgpath_;
            private Object toUser_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2004_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2004_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData2004.class, Builder.class);
            }

            private Builder() {
                this.toUser_ = "";
                this.imgpath_ = LazyStringArrayList.EMPTY;
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.toUser_ = "";
                this.imgpath_ = LazyStringArrayList.EMPTY;
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = CmdData2004.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                this.toUser_ = "";
                this.imgpath_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -3;
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2004_descriptor;
            }

            public CmdData2004 getDefaultInstanceForType() {
                return CmdData2004.getDefaultInstance();
            }

            public CmdData2004 build() {
                CmdData2004 buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public CmdData2004 buildPartial() {
                CmdData2004 cmdData2004 = new CmdData2004((GeneratedMessageV3.Builder) this);
                Object unused = cmdData2004.toUser_ = this.toUser_;
                if ((this.bitField0_ & 2) == 2) {
                    this.imgpath_ = this.imgpath_.getUnmodifiableView();
                    this.bitField0_ &= -3;
                }
                LazyStringList unused2 = cmdData2004.imgpath_ = this.imgpath_;
                int unused3 = cmdData2004.bitField0_ = 0;
                onBuilt();
                return cmdData2004;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder mergeFrom(Message message) {
                if (message instanceof CmdData2004) {
                    return mergeFrom((CmdData2004) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CmdData2004 cmdData2004) {
                if (cmdData2004 == CmdData2004.getDefaultInstance()) {
                    return this;
                }
                if (!cmdData2004.getToUser().isEmpty()) {
                    this.toUser_ = cmdData2004.toUser_;
                    onChanged();
                }
                if (!cmdData2004.imgpath_.isEmpty()) {
                    if (this.imgpath_.isEmpty()) {
                        this.imgpath_ = cmdData2004.imgpath_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureImgpathIsMutable();
                        this.imgpath_.addAll(cmdData2004.imgpath_);
                    }
                    onChanged();
                }
                mergeUnknownFields(cmdData2004.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.xp.wx.middleware.MsgProtos.CmdData2004.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.xp.wx.middleware.MsgProtos.CmdData2004.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.xp.wx.middleware.MsgProtos$CmdData2004 r3 = (com.xp.wx.middleware.MsgProtos.CmdData2004) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData2004) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.xp.wx.middleware.MsgProtos$CmdData2004 r4 = (com.xp.wx.middleware.MsgProtos.CmdData2004) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData2004) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.middleware.MsgProtos.CmdData2004.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.xp.wx.middleware.MsgProtos$CmdData2004$Builder");
            }

            public String getToUser() {
                Object obj = this.toUser_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.toUser_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getToUserBytes() {
                Object obj = this.toUser_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.toUser_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setToUser(String str) {
                if (str != null) {
                    this.toUser_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearToUser() {
                this.toUser_ = CmdData2004.getDefaultInstance().getToUser();
                onChanged();
                return this;
            }

            public Builder setToUserBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2004.checkByteStringIsUtf8(byteString);
                    this.toUser_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            private void ensureImgpathIsMutable() {
                if ((this.bitField0_ & 2) != 2) {
                    this.imgpath_ = new LazyStringArrayList(this.imgpath_);
                    this.bitField0_ |= 2;
                }
            }

            public ProtocolStringList getImgpathList() {
                return this.imgpath_.getUnmodifiableView();
            }

            public int getImgpathCount() {
                return this.imgpath_.size();
            }

            public String getImgpath(int i) {
                return (String) this.imgpath_.get(i);
            }

            public ByteString getImgpathBytes(int i) {
                return this.imgpath_.getByteString(i);
            }

            public Builder setImgpath(int i, String str) {
                if (str != null) {
                    ensureImgpathIsMutable();
                    this.imgpath_.set(i, str);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addImgpath(String str) {
                if (str != null) {
                    ensureImgpathIsMutable();
                    this.imgpath_.add(str);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addAllImgpath(Iterable<String> iterable) {
                ensureImgpathIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.imgpath_);
                onChanged();
                return this;
            }

            public Builder clearImgpath() {
                this.imgpath_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder addImgpathBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2004.checkByteStringIsUtf8(byteString);
                    ensureImgpathIsMutable();
                    this.imgpath_.add(byteString);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static CmdData2004 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<CmdData2004> parser() {
            return PARSER;
        }

        public Parser<CmdData2004> getParserForType() {
            return PARSER;
        }

        public CmdData2004 getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class CmdData2009 extends GeneratedMessageV3 implements CmdData2009OrBuilder {
        private static final CmdData2009 DEFAULT_INSTANCE = new CmdData2009();
        public static final int FRIENDLIST_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final Parser<CmdData2009> PARSER = new AbstractParser<CmdData2009>() {
            public CmdData2009 parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new CmdData2009(codedInputStream, extensionRegistryLite);
            }
        };
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public List<Friend> friendList_;
        private byte memoizedIsInitialized;

        private CmdData2009(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private CmdData2009() {
            this.memoizedIsInitialized = -1;
            this.friendList_ = Collections.emptyList();
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private CmdData2009(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                boolean z2 = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                if (!z2 || !true) {
                                    this.friendList_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.friendList_.add(codedInputStream.readMessage(Friend.parser(), extensionRegistryLite));
                            } else if (!parseUnknownFieldProto3(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        if (z2 && true) {
                            this.friendList_ = Collections.unmodifiableList(this.friendList_);
                        }
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if (z2 && true) {
                    this.friendList_ = Collections.unmodifiableList(this.friendList_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw null;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2009_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2009_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData2009.class, Builder.class);
        }

        public List<Friend> getFriendListList() {
            return this.friendList_;
        }

        public List<? extends FriendOrBuilder> getFriendListOrBuilderList() {
            return this.friendList_;
        }

        public int getFriendListCount() {
            return this.friendList_.size();
        }

        public Friend getFriendList(int i) {
            return this.friendList_.get(i);
        }

        public FriendOrBuilder getFriendListOrBuilder(int i) {
            return this.friendList_.get(i);
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.friendList_.size(); i++) {
                codedOutputStream.writeMessage(1, this.friendList_.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.friendList_.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, this.friendList_.get(i3));
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CmdData2009)) {
                return super.equals(obj);
            }
            CmdData2009 cmdData2009 = (CmdData2009) obj;
            if (!(getFriendListList().equals(cmdData2009.getFriendListList())) || !this.unknownFields.equals(cmdData2009.unknownFields)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = 779 + getDescriptor().hashCode();
            if (getFriendListCount() > 0) {
                hashCode = (((hashCode * 37) + 1) * 53) + getFriendListList().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public static CmdData2009 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static CmdData2009 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static CmdData2009 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static CmdData2009 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CmdData2009 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static CmdData2009 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CmdData2009 parseFrom(InputStream inputStream) throws IOException {
            return (CmdData2009) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CmdData2009 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2009) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData2009 parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CmdData2009) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CmdData2009 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2009) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData2009 parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CmdData2009) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CmdData2009 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2009) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(CmdData2009 cmdData2009) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cmdData2009);
        }

        public Builder toBuilder() {
            if (this == DEFAULT_INSTANCE) {
                return new Builder();
            }
            return new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CmdData2009OrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<Friend, Friend.Builder, FriendOrBuilder> friendListBuilder_;
            private List<Friend> friendList_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2009_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2009_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData2009.class, Builder.class);
            }

            private Builder() {
                this.friendList_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.friendList_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (CmdData2009.alwaysUseFieldBuilders) {
                    getFriendListFieldBuilder();
                }
            }

            public Builder clear() {
                super.clear();
                RepeatedFieldBuilderV3<Friend, Friend.Builder, FriendOrBuilder> repeatedFieldBuilderV3 = this.friendListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.friendList_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2009_descriptor;
            }

            public CmdData2009 getDefaultInstanceForType() {
                return CmdData2009.getDefaultInstance();
            }

            public CmdData2009 build() {
                CmdData2009 buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public CmdData2009 buildPartial() {
                CmdData2009 cmdData2009 = new CmdData2009((GeneratedMessageV3.Builder) this);
                int i = this.bitField0_;
                RepeatedFieldBuilderV3<Friend, Friend.Builder, FriendOrBuilder> repeatedFieldBuilderV3 = this.friendListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((i & 1) == 1) {
                        this.friendList_ = Collections.unmodifiableList(this.friendList_);
                        this.bitField0_ &= -2;
                    }
                    List unused = cmdData2009.friendList_ = this.friendList_;
                } else {
                    List unused2 = cmdData2009.friendList_ = repeatedFieldBuilderV3.build();
                }
                onBuilt();
                return cmdData2009;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder mergeFrom(Message message) {
                if (message instanceof CmdData2009) {
                    return mergeFrom((CmdData2009) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CmdData2009 cmdData2009) {
                if (cmdData2009 == CmdData2009.getDefaultInstance()) {
                    return this;
                }
                if (this.friendListBuilder_ == null) {
                    if (!cmdData2009.friendList_.isEmpty()) {
                        if (this.friendList_.isEmpty()) {
                            this.friendList_ = cmdData2009.friendList_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureFriendListIsMutable();
                            this.friendList_.addAll(cmdData2009.friendList_);
                        }
                        onChanged();
                    }
                } else if (!cmdData2009.friendList_.isEmpty()) {
                    if (this.friendListBuilder_.isEmpty()) {
                        this.friendListBuilder_.dispose();
                        RepeatedFieldBuilderV3<Friend, Friend.Builder, FriendOrBuilder> repeatedFieldBuilderV3 = null;
                        this.friendListBuilder_ = null;
                        this.friendList_ = cmdData2009.friendList_;
                        this.bitField0_ &= -2;
                        if (CmdData2009.alwaysUseFieldBuilders) {
                            repeatedFieldBuilderV3 = getFriendListFieldBuilder();
                        }
                        this.friendListBuilder_ = repeatedFieldBuilderV3;
                    } else {
                        this.friendListBuilder_.addAllMessages(cmdData2009.friendList_);
                    }
                }
                mergeUnknownFields(cmdData2009.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.xp.wx.middleware.MsgProtos.CmdData2009.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.xp.wx.middleware.MsgProtos.CmdData2009.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.xp.wx.middleware.MsgProtos$CmdData2009 r3 = (com.xp.wx.middleware.MsgProtos.CmdData2009) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData2009) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.xp.wx.middleware.MsgProtos$CmdData2009 r4 = (com.xp.wx.middleware.MsgProtos.CmdData2009) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData2009) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.middleware.MsgProtos.CmdData2009.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.xp.wx.middleware.MsgProtos$CmdData2009$Builder");
            }

            private void ensureFriendListIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.friendList_ = new ArrayList(this.friendList_);
                    this.bitField0_ |= 1;
                }
            }

            public List<Friend> getFriendListList() {
                RepeatedFieldBuilderV3<Friend, Friend.Builder, FriendOrBuilder> repeatedFieldBuilderV3 = this.friendListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.friendList_);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            public int getFriendListCount() {
                RepeatedFieldBuilderV3<Friend, Friend.Builder, FriendOrBuilder> repeatedFieldBuilderV3 = this.friendListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.friendList_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public Friend getFriendList(int i) {
                RepeatedFieldBuilderV3<Friend, Friend.Builder, FriendOrBuilder> repeatedFieldBuilderV3 = this.friendListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.friendList_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            public Builder setFriendList(int i, Friend friend) {
                RepeatedFieldBuilderV3<Friend, Friend.Builder, FriendOrBuilder> repeatedFieldBuilderV3 = this.friendListBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i, friend);
                } else if (friend != null) {
                    ensureFriendListIsMutable();
                    this.friendList_.set(i, friend);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder setFriendList(int i, Friend.Builder builder) {
                RepeatedFieldBuilderV3<Friend, Friend.Builder, FriendOrBuilder> repeatedFieldBuilderV3 = this.friendListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureFriendListIsMutable();
                    this.friendList_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder addFriendList(Friend friend) {
                RepeatedFieldBuilderV3<Friend, Friend.Builder, FriendOrBuilder> repeatedFieldBuilderV3 = this.friendListBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(friend);
                } else if (friend != null) {
                    ensureFriendListIsMutable();
                    this.friendList_.add(friend);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addFriendList(int i, Friend friend) {
                RepeatedFieldBuilderV3<Friend, Friend.Builder, FriendOrBuilder> repeatedFieldBuilderV3 = this.friendListBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(i, friend);
                } else if (friend != null) {
                    ensureFriendListIsMutable();
                    this.friendList_.add(i, friend);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addFriendList(Friend.Builder builder) {
                RepeatedFieldBuilderV3<Friend, Friend.Builder, FriendOrBuilder> repeatedFieldBuilderV3 = this.friendListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureFriendListIsMutable();
                    this.friendList_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addFriendList(int i, Friend.Builder builder) {
                RepeatedFieldBuilderV3<Friend, Friend.Builder, FriendOrBuilder> repeatedFieldBuilderV3 = this.friendListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureFriendListIsMutable();
                    this.friendList_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addAllFriendList(Iterable<? extends Friend> iterable) {
                RepeatedFieldBuilderV3<Friend, Friend.Builder, FriendOrBuilder> repeatedFieldBuilderV3 = this.friendListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureFriendListIsMutable();
                    AbstractMessageLite.Builder.addAll(iterable, this.friendList_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder clearFriendList() {
                RepeatedFieldBuilderV3<Friend, Friend.Builder, FriendOrBuilder> repeatedFieldBuilderV3 = this.friendListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.friendList_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder removeFriendList(int i) {
                RepeatedFieldBuilderV3<Friend, Friend.Builder, FriendOrBuilder> repeatedFieldBuilderV3 = this.friendListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureFriendListIsMutable();
                    this.friendList_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public Friend.Builder getFriendListBuilder(int i) {
                return getFriendListFieldBuilder().getBuilder(i);
            }

            public FriendOrBuilder getFriendListOrBuilder(int i) {
                RepeatedFieldBuilderV3<Friend, Friend.Builder, FriendOrBuilder> repeatedFieldBuilderV3 = this.friendListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.friendList_.get(i);
                }
                return repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            public List<? extends FriendOrBuilder> getFriendListOrBuilderList() {
                RepeatedFieldBuilderV3<Friend, Friend.Builder, FriendOrBuilder> repeatedFieldBuilderV3 = this.friendListBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.friendList_);
            }

            public Friend.Builder addFriendListBuilder() {
                return getFriendListFieldBuilder().addBuilder(Friend.getDefaultInstance());
            }

            public Friend.Builder addFriendListBuilder(int i) {
                return getFriendListFieldBuilder().addBuilder(i, Friend.getDefaultInstance());
            }

            public List<Friend.Builder> getFriendListBuilderList() {
                return getFriendListFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<Friend, Friend.Builder, FriendOrBuilder> getFriendListFieldBuilder() {
                if (this.friendListBuilder_ == null) {
                    List<Friend> list = this.friendList_;
                    boolean z = true;
                    if ((this.bitField0_ & 1) != 1) {
                        z = false;
                    }
                    this.friendListBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                    this.friendList_ = null;
                }
                return this.friendListBuilder_;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static CmdData2009 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<CmdData2009> parser() {
            return PARSER;
        }

        public Parser<CmdData2009> getParserForType() {
            return PARSER;
        }

        public CmdData2009 getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class CmdData2011 extends GeneratedMessageV3 implements CmdData2011OrBuilder {
        private static final CmdData2011 DEFAULT_INSTANCE = new CmdData2011();
        /* access modifiers changed from: private */
        public static final Parser<CmdData2011> PARSER = new AbstractParser<CmdData2011>() {
            public CmdData2011 parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new CmdData2011(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int ROOMLIST_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public List<RoomInfo> roomList_;

        private CmdData2011(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private CmdData2011() {
            this.memoizedIsInitialized = -1;
            this.roomList_ = Collections.emptyList();
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private CmdData2011(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                boolean z2 = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                if (!z2 || !true) {
                                    this.roomList_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.roomList_.add(codedInputStream.readMessage(RoomInfo.parser(), extensionRegistryLite));
                            } else if (!parseUnknownFieldProto3(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        if (z2 && true) {
                            this.roomList_ = Collections.unmodifiableList(this.roomList_);
                        }
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if (z2 && true) {
                    this.roomList_ = Collections.unmodifiableList(this.roomList_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw null;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2011_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2011_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData2011.class, Builder.class);
        }

        public List<RoomInfo> getRoomListList() {
            return this.roomList_;
        }

        public List<? extends RoomInfoOrBuilder> getRoomListOrBuilderList() {
            return this.roomList_;
        }

        public int getRoomListCount() {
            return this.roomList_.size();
        }

        public RoomInfo getRoomList(int i) {
            return this.roomList_.get(i);
        }

        public RoomInfoOrBuilder getRoomListOrBuilder(int i) {
            return this.roomList_.get(i);
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.roomList_.size(); i++) {
                codedOutputStream.writeMessage(1, this.roomList_.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.roomList_.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, this.roomList_.get(i3));
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CmdData2011)) {
                return super.equals(obj);
            }
            CmdData2011 cmdData2011 = (CmdData2011) obj;
            if (!(getRoomListList().equals(cmdData2011.getRoomListList())) || !this.unknownFields.equals(cmdData2011.unknownFields)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = 779 + getDescriptor().hashCode();
            if (getRoomListCount() > 0) {
                hashCode = (((hashCode * 37) + 1) * 53) + getRoomListList().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public static CmdData2011 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static CmdData2011 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static CmdData2011 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static CmdData2011 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CmdData2011 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static CmdData2011 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CmdData2011 parseFrom(InputStream inputStream) throws IOException {
            return (CmdData2011) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CmdData2011 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2011) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData2011 parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CmdData2011) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CmdData2011 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2011) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData2011 parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CmdData2011) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CmdData2011 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2011) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(CmdData2011 cmdData2011) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cmdData2011);
        }

        public Builder toBuilder() {
            if (this == DEFAULT_INSTANCE) {
                return new Builder();
            }
            return new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CmdData2011OrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<RoomInfo, RoomInfo.Builder, RoomInfoOrBuilder> roomListBuilder_;
            private List<RoomInfo> roomList_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2011_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2011_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData2011.class, Builder.class);
            }

            private Builder() {
                this.roomList_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.roomList_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (CmdData2011.alwaysUseFieldBuilders) {
                    getRoomListFieldBuilder();
                }
            }

            public Builder clear() {
                super.clear();
                RepeatedFieldBuilderV3<RoomInfo, RoomInfo.Builder, RoomInfoOrBuilder> repeatedFieldBuilderV3 = this.roomListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.roomList_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2011_descriptor;
            }

            public CmdData2011 getDefaultInstanceForType() {
                return CmdData2011.getDefaultInstance();
            }

            public CmdData2011 build() {
                CmdData2011 buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public CmdData2011 buildPartial() {
                CmdData2011 cmdData2011 = new CmdData2011((GeneratedMessageV3.Builder) this);
                int i = this.bitField0_;
                RepeatedFieldBuilderV3<RoomInfo, RoomInfo.Builder, RoomInfoOrBuilder> repeatedFieldBuilderV3 = this.roomListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((i & 1) == 1) {
                        this.roomList_ = Collections.unmodifiableList(this.roomList_);
                        this.bitField0_ &= -2;
                    }
                    List unused = cmdData2011.roomList_ = this.roomList_;
                } else {
                    List unused2 = cmdData2011.roomList_ = repeatedFieldBuilderV3.build();
                }
                onBuilt();
                return cmdData2011;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder mergeFrom(Message message) {
                if (message instanceof CmdData2011) {
                    return mergeFrom((CmdData2011) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CmdData2011 cmdData2011) {
                if (cmdData2011 == CmdData2011.getDefaultInstance()) {
                    return this;
                }
                if (this.roomListBuilder_ == null) {
                    if (!cmdData2011.roomList_.isEmpty()) {
                        if (this.roomList_.isEmpty()) {
                            this.roomList_ = cmdData2011.roomList_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureRoomListIsMutable();
                            this.roomList_.addAll(cmdData2011.roomList_);
                        }
                        onChanged();
                    }
                } else if (!cmdData2011.roomList_.isEmpty()) {
                    if (this.roomListBuilder_.isEmpty()) {
                        this.roomListBuilder_.dispose();
                        RepeatedFieldBuilderV3<RoomInfo, RoomInfo.Builder, RoomInfoOrBuilder> repeatedFieldBuilderV3 = null;
                        this.roomListBuilder_ = null;
                        this.roomList_ = cmdData2011.roomList_;
                        this.bitField0_ &= -2;
                        if (CmdData2011.alwaysUseFieldBuilders) {
                            repeatedFieldBuilderV3 = getRoomListFieldBuilder();
                        }
                        this.roomListBuilder_ = repeatedFieldBuilderV3;
                    } else {
                        this.roomListBuilder_.addAllMessages(cmdData2011.roomList_);
                    }
                }
                mergeUnknownFields(cmdData2011.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.xp.wx.middleware.MsgProtos.CmdData2011.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.xp.wx.middleware.MsgProtos.CmdData2011.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.xp.wx.middleware.MsgProtos$CmdData2011 r3 = (com.xp.wx.middleware.MsgProtos.CmdData2011) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData2011) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.xp.wx.middleware.MsgProtos$CmdData2011 r4 = (com.xp.wx.middleware.MsgProtos.CmdData2011) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData2011) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.middleware.MsgProtos.CmdData2011.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.xp.wx.middleware.MsgProtos$CmdData2011$Builder");
            }

            private void ensureRoomListIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.roomList_ = new ArrayList(this.roomList_);
                    this.bitField0_ |= 1;
                }
            }

            public List<RoomInfo> getRoomListList() {
                RepeatedFieldBuilderV3<RoomInfo, RoomInfo.Builder, RoomInfoOrBuilder> repeatedFieldBuilderV3 = this.roomListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.roomList_);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            public int getRoomListCount() {
                RepeatedFieldBuilderV3<RoomInfo, RoomInfo.Builder, RoomInfoOrBuilder> repeatedFieldBuilderV3 = this.roomListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.roomList_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public RoomInfo getRoomList(int i) {
                RepeatedFieldBuilderV3<RoomInfo, RoomInfo.Builder, RoomInfoOrBuilder> repeatedFieldBuilderV3 = this.roomListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.roomList_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            public Builder setRoomList(int i, RoomInfo roomInfo) {
                RepeatedFieldBuilderV3<RoomInfo, RoomInfo.Builder, RoomInfoOrBuilder> repeatedFieldBuilderV3 = this.roomListBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i, roomInfo);
                } else if (roomInfo != null) {
                    ensureRoomListIsMutable();
                    this.roomList_.set(i, roomInfo);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder setRoomList(int i, RoomInfo.Builder builder) {
                RepeatedFieldBuilderV3<RoomInfo, RoomInfo.Builder, RoomInfoOrBuilder> repeatedFieldBuilderV3 = this.roomListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureRoomListIsMutable();
                    this.roomList_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder addRoomList(RoomInfo roomInfo) {
                RepeatedFieldBuilderV3<RoomInfo, RoomInfo.Builder, RoomInfoOrBuilder> repeatedFieldBuilderV3 = this.roomListBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(roomInfo);
                } else if (roomInfo != null) {
                    ensureRoomListIsMutable();
                    this.roomList_.add(roomInfo);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addRoomList(int i, RoomInfo roomInfo) {
                RepeatedFieldBuilderV3<RoomInfo, RoomInfo.Builder, RoomInfoOrBuilder> repeatedFieldBuilderV3 = this.roomListBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(i, roomInfo);
                } else if (roomInfo != null) {
                    ensureRoomListIsMutable();
                    this.roomList_.add(i, roomInfo);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addRoomList(RoomInfo.Builder builder) {
                RepeatedFieldBuilderV3<RoomInfo, RoomInfo.Builder, RoomInfoOrBuilder> repeatedFieldBuilderV3 = this.roomListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureRoomListIsMutable();
                    this.roomList_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addRoomList(int i, RoomInfo.Builder builder) {
                RepeatedFieldBuilderV3<RoomInfo, RoomInfo.Builder, RoomInfoOrBuilder> repeatedFieldBuilderV3 = this.roomListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureRoomListIsMutable();
                    this.roomList_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addAllRoomList(Iterable<? extends RoomInfo> iterable) {
                RepeatedFieldBuilderV3<RoomInfo, RoomInfo.Builder, RoomInfoOrBuilder> repeatedFieldBuilderV3 = this.roomListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureRoomListIsMutable();
                    AbstractMessageLite.Builder.addAll(iterable, this.roomList_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder clearRoomList() {
                RepeatedFieldBuilderV3<RoomInfo, RoomInfo.Builder, RoomInfoOrBuilder> repeatedFieldBuilderV3 = this.roomListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.roomList_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder removeRoomList(int i) {
                RepeatedFieldBuilderV3<RoomInfo, RoomInfo.Builder, RoomInfoOrBuilder> repeatedFieldBuilderV3 = this.roomListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureRoomListIsMutable();
                    this.roomList_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public RoomInfo.Builder getRoomListBuilder(int i) {
                return getRoomListFieldBuilder().getBuilder(i);
            }

            public RoomInfoOrBuilder getRoomListOrBuilder(int i) {
                RepeatedFieldBuilderV3<RoomInfo, RoomInfo.Builder, RoomInfoOrBuilder> repeatedFieldBuilderV3 = this.roomListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.roomList_.get(i);
                }
                return repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            public List<? extends RoomInfoOrBuilder> getRoomListOrBuilderList() {
                RepeatedFieldBuilderV3<RoomInfo, RoomInfo.Builder, RoomInfoOrBuilder> repeatedFieldBuilderV3 = this.roomListBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.roomList_);
            }

            public RoomInfo.Builder addRoomListBuilder() {
                return getRoomListFieldBuilder().addBuilder(RoomInfo.getDefaultInstance());
            }

            public RoomInfo.Builder addRoomListBuilder(int i) {
                return getRoomListFieldBuilder().addBuilder(i, RoomInfo.getDefaultInstance());
            }

            public List<RoomInfo.Builder> getRoomListBuilderList() {
                return getRoomListFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<RoomInfo, RoomInfo.Builder, RoomInfoOrBuilder> getRoomListFieldBuilder() {
                if (this.roomListBuilder_ == null) {
                    List<RoomInfo> list = this.roomList_;
                    boolean z = true;
                    if ((this.bitField0_ & 1) != 1) {
                        z = false;
                    }
                    this.roomListBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                    this.roomList_ = null;
                }
                return this.roomListBuilder_;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static CmdData2011 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<CmdData2011> parser() {
            return PARSER;
        }

        public Parser<CmdData2011> getParserForType() {
            return PARSER;
        }

        public CmdData2011 getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class CmdData2012 extends GeneratedMessageV3 implements CmdData2012OrBuilder {
        private static final CmdData2012 DEFAULT_INSTANCE = new CmdData2012();
        public static final int MEMBERLIST_FIELD_NUMBER = 5;
        public static final int NOTICEEDITOR_FIELD_NUMBER = 4;
        /* access modifiers changed from: private */
        public static final Parser<CmdData2012> PARSER = new AbstractParser<CmdData2012>() {
            public CmdData2012 parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new CmdData2012(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int ROOMNAME_FIELD_NUMBER = 6;
        public static final int ROOMNOTICE_FIELD_NUMBER = 3;
        public static final int ROOMOWNER_FIELD_NUMBER = 2;
        public static final int USERNAME_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public List<MemberInfo> memberList_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public volatile Object noticeEditor_;
        /* access modifiers changed from: private */
        public volatile Object roomName_;
        /* access modifiers changed from: private */
        public volatile Object roomNotice_;
        /* access modifiers changed from: private */
        public volatile Object roomOwner_;
        /* access modifiers changed from: private */
        public volatile Object username_;

        private CmdData2012(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private CmdData2012() {
            this.memoizedIsInitialized = -1;
            this.username_ = "";
            this.roomOwner_ = "";
            this.roomNotice_ = "";
            this.noticeEditor_ = "";
            this.memberList_ = Collections.emptyList();
            this.roomName_ = "";
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private CmdData2012(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                boolean z2 = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.username_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.roomOwner_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                this.roomNotice_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 34) {
                                this.noticeEditor_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 42) {
                                if (!(z2 & true)) {
                                    this.memberList_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.memberList_.add(codedInputStream.readMessage(MemberInfo.parser(), extensionRegistryLite));
                            } else if (readTag == 50) {
                                this.roomName_ = codedInputStream.readStringRequireUtf8();
                            } else if (!parseUnknownFieldProto3(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        if (z2 & true) {
                            this.memberList_ = Collections.unmodifiableList(this.memberList_);
                        }
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if (z2 & true) {
                    this.memberList_ = Collections.unmodifiableList(this.memberList_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw null;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2012_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2012_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData2012.class, Builder.class);
        }

        public String getUsername() {
            Object obj = this.username_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.username_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getUsernameBytes() {
            Object obj = this.username_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.username_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getRoomOwner() {
            Object obj = this.roomOwner_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.roomOwner_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getRoomOwnerBytes() {
            Object obj = this.roomOwner_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.roomOwner_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getRoomNotice() {
            Object obj = this.roomNotice_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.roomNotice_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getRoomNoticeBytes() {
            Object obj = this.roomNotice_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.roomNotice_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getNoticeEditor() {
            Object obj = this.noticeEditor_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.noticeEditor_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getNoticeEditorBytes() {
            Object obj = this.noticeEditor_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.noticeEditor_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public List<MemberInfo> getMemberListList() {
            return this.memberList_;
        }

        public List<? extends MemberInfoOrBuilder> getMemberListOrBuilderList() {
            return this.memberList_;
        }

        public int getMemberListCount() {
            return this.memberList_.size();
        }

        public MemberInfo getMemberList(int i) {
            return this.memberList_.get(i);
        }

        public MemberInfoOrBuilder getMemberListOrBuilder(int i) {
            return this.memberList_.get(i);
        }

        public String getRoomName() {
            Object obj = this.roomName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.roomName_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getRoomNameBytes() {
            Object obj = this.roomName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.roomName_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getUsernameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.username_);
            }
            if (!getRoomOwnerBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.roomOwner_);
            }
            if (!getRoomNoticeBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.roomNotice_);
            }
            if (!getNoticeEditorBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.noticeEditor_);
            }
            for (int i = 0; i < this.memberList_.size(); i++) {
                codedOutputStream.writeMessage(5, this.memberList_.get(i));
            }
            if (!getRoomNameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 6, this.roomName_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !getUsernameBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.username_) + 0 : 0;
            if (!getRoomOwnerBytes().isEmpty()) {
                computeStringSize += GeneratedMessageV3.computeStringSize(2, this.roomOwner_);
            }
            if (!getRoomNoticeBytes().isEmpty()) {
                computeStringSize += GeneratedMessageV3.computeStringSize(3, this.roomNotice_);
            }
            if (!getNoticeEditorBytes().isEmpty()) {
                computeStringSize += GeneratedMessageV3.computeStringSize(4, this.noticeEditor_);
            }
            for (int i2 = 0; i2 < this.memberList_.size(); i2++) {
                computeStringSize += CodedOutputStream.computeMessageSize(5, this.memberList_.get(i2));
            }
            if (!getRoomNameBytes().isEmpty()) {
                computeStringSize += GeneratedMessageV3.computeStringSize(6, this.roomName_);
            }
            int serializedSize = computeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CmdData2012)) {
                return super.equals(obj);
            }
            CmdData2012 cmdData2012 = (CmdData2012) obj;
            if (!((((((getUsername().equals(cmdData2012.getUsername())) && getRoomOwner().equals(cmdData2012.getRoomOwner())) && getRoomNotice().equals(cmdData2012.getRoomNotice())) && getNoticeEditor().equals(cmdData2012.getNoticeEditor())) && getMemberListList().equals(cmdData2012.getMemberListList())) && getRoomName().equals(cmdData2012.getRoomName())) || !this.unknownFields.equals(cmdData2012.unknownFields)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getUsername().hashCode()) * 37) + 2) * 53) + getRoomOwner().hashCode()) * 37) + 3) * 53) + getRoomNotice().hashCode()) * 37) + 4) * 53) + getNoticeEditor().hashCode();
            if (getMemberListCount() > 0) {
                hashCode = (((hashCode * 37) + 5) * 53) + getMemberListList().hashCode();
            }
            int hashCode2 = (((((hashCode * 37) + 6) * 53) + getRoomName().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public static CmdData2012 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static CmdData2012 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static CmdData2012 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static CmdData2012 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CmdData2012 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static CmdData2012 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CmdData2012 parseFrom(InputStream inputStream) throws IOException {
            return (CmdData2012) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CmdData2012 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2012) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData2012 parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CmdData2012) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CmdData2012 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2012) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData2012 parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CmdData2012) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CmdData2012 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2012) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(CmdData2012 cmdData2012) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cmdData2012);
        }

        public Builder toBuilder() {
            if (this == DEFAULT_INSTANCE) {
                return new Builder();
            }
            return new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CmdData2012OrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<MemberInfo, MemberInfo.Builder, MemberInfoOrBuilder> memberListBuilder_;
            private List<MemberInfo> memberList_;
            private Object noticeEditor_;
            private Object roomName_;
            private Object roomNotice_;
            private Object roomOwner_;
            private Object username_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2012_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2012_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData2012.class, Builder.class);
            }

            private Builder() {
                this.username_ = "";
                this.roomOwner_ = "";
                this.roomNotice_ = "";
                this.noticeEditor_ = "";
                this.memberList_ = Collections.emptyList();
                this.roomName_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.username_ = "";
                this.roomOwner_ = "";
                this.roomNotice_ = "";
                this.noticeEditor_ = "";
                this.memberList_ = Collections.emptyList();
                this.roomName_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (CmdData2012.alwaysUseFieldBuilders) {
                    getMemberListFieldBuilder();
                }
            }

            public Builder clear() {
                super.clear();
                this.username_ = "";
                this.roomOwner_ = "";
                this.roomNotice_ = "";
                this.noticeEditor_ = "";
                RepeatedFieldBuilderV3<MemberInfo, MemberInfo.Builder, MemberInfoOrBuilder> repeatedFieldBuilderV3 = this.memberListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.memberList_ = Collections.emptyList();
                    this.bitField0_ &= -17;
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                this.roomName_ = "";
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2012_descriptor;
            }

            public CmdData2012 getDefaultInstanceForType() {
                return CmdData2012.getDefaultInstance();
            }

            public CmdData2012 build() {
                CmdData2012 buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public CmdData2012 buildPartial() {
                CmdData2012 cmdData2012 = new CmdData2012((GeneratedMessageV3.Builder) this);
                Object unused = cmdData2012.username_ = this.username_;
                Object unused2 = cmdData2012.roomOwner_ = this.roomOwner_;
                Object unused3 = cmdData2012.roomNotice_ = this.roomNotice_;
                Object unused4 = cmdData2012.noticeEditor_ = this.noticeEditor_;
                RepeatedFieldBuilderV3<MemberInfo, MemberInfo.Builder, MemberInfoOrBuilder> repeatedFieldBuilderV3 = this.memberListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 16) == 16) {
                        this.memberList_ = Collections.unmodifiableList(this.memberList_);
                        this.bitField0_ &= -17;
                    }
                    List unused5 = cmdData2012.memberList_ = this.memberList_;
                } else {
                    List unused6 = cmdData2012.memberList_ = repeatedFieldBuilderV3.build();
                }
                Object unused7 = cmdData2012.roomName_ = this.roomName_;
                int unused8 = cmdData2012.bitField0_ = 0;
                onBuilt();
                return cmdData2012;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder mergeFrom(Message message) {
                if (message instanceof CmdData2012) {
                    return mergeFrom((CmdData2012) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CmdData2012 cmdData2012) {
                if (cmdData2012 == CmdData2012.getDefaultInstance()) {
                    return this;
                }
                if (!cmdData2012.getUsername().isEmpty()) {
                    this.username_ = cmdData2012.username_;
                    onChanged();
                }
                if (!cmdData2012.getRoomOwner().isEmpty()) {
                    this.roomOwner_ = cmdData2012.roomOwner_;
                    onChanged();
                }
                if (!cmdData2012.getRoomNotice().isEmpty()) {
                    this.roomNotice_ = cmdData2012.roomNotice_;
                    onChanged();
                }
                if (!cmdData2012.getNoticeEditor().isEmpty()) {
                    this.noticeEditor_ = cmdData2012.noticeEditor_;
                    onChanged();
                }
                if (this.memberListBuilder_ == null) {
                    if (!cmdData2012.memberList_.isEmpty()) {
                        if (this.memberList_.isEmpty()) {
                            this.memberList_ = cmdData2012.memberList_;
                            this.bitField0_ &= -17;
                        } else {
                            ensureMemberListIsMutable();
                            this.memberList_.addAll(cmdData2012.memberList_);
                        }
                        onChanged();
                    }
                } else if (!cmdData2012.memberList_.isEmpty()) {
                    if (this.memberListBuilder_.isEmpty()) {
                        this.memberListBuilder_.dispose();
                        RepeatedFieldBuilderV3<MemberInfo, MemberInfo.Builder, MemberInfoOrBuilder> repeatedFieldBuilderV3 = null;
                        this.memberListBuilder_ = null;
                        this.memberList_ = cmdData2012.memberList_;
                        this.bitField0_ &= -17;
                        if (CmdData2012.alwaysUseFieldBuilders) {
                            repeatedFieldBuilderV3 = getMemberListFieldBuilder();
                        }
                        this.memberListBuilder_ = repeatedFieldBuilderV3;
                    } else {
                        this.memberListBuilder_.addAllMessages(cmdData2012.memberList_);
                    }
                }
                if (!cmdData2012.getRoomName().isEmpty()) {
                    this.roomName_ = cmdData2012.roomName_;
                    onChanged();
                }
                mergeUnknownFields(cmdData2012.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.xp.wx.middleware.MsgProtos.CmdData2012.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.xp.wx.middleware.MsgProtos.CmdData2012.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.xp.wx.middleware.MsgProtos$CmdData2012 r3 = (com.xp.wx.middleware.MsgProtos.CmdData2012) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData2012) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.xp.wx.middleware.MsgProtos$CmdData2012 r4 = (com.xp.wx.middleware.MsgProtos.CmdData2012) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData2012) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.middleware.MsgProtos.CmdData2012.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.xp.wx.middleware.MsgProtos$CmdData2012$Builder");
            }

            public String getUsername() {
                Object obj = this.username_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.username_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getUsernameBytes() {
                Object obj = this.username_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.username_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setUsername(String str) {
                if (str != null) {
                    this.username_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearUsername() {
                this.username_ = CmdData2012.getDefaultInstance().getUsername();
                onChanged();
                return this;
            }

            public Builder setUsernameBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2012.checkByteStringIsUtf8(byteString);
                    this.username_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getRoomOwner() {
                Object obj = this.roomOwner_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.roomOwner_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getRoomOwnerBytes() {
                Object obj = this.roomOwner_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.roomOwner_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setRoomOwner(String str) {
                if (str != null) {
                    this.roomOwner_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearRoomOwner() {
                this.roomOwner_ = CmdData2012.getDefaultInstance().getRoomOwner();
                onChanged();
                return this;
            }

            public Builder setRoomOwnerBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2012.checkByteStringIsUtf8(byteString);
                    this.roomOwner_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getRoomNotice() {
                Object obj = this.roomNotice_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.roomNotice_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getRoomNoticeBytes() {
                Object obj = this.roomNotice_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.roomNotice_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setRoomNotice(String str) {
                if (str != null) {
                    this.roomNotice_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearRoomNotice() {
                this.roomNotice_ = CmdData2012.getDefaultInstance().getRoomNotice();
                onChanged();
                return this;
            }

            public Builder setRoomNoticeBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2012.checkByteStringIsUtf8(byteString);
                    this.roomNotice_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getNoticeEditor() {
                Object obj = this.noticeEditor_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.noticeEditor_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getNoticeEditorBytes() {
                Object obj = this.noticeEditor_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.noticeEditor_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setNoticeEditor(String str) {
                if (str != null) {
                    this.noticeEditor_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearNoticeEditor() {
                this.noticeEditor_ = CmdData2012.getDefaultInstance().getNoticeEditor();
                onChanged();
                return this;
            }

            public Builder setNoticeEditorBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2012.checkByteStringIsUtf8(byteString);
                    this.noticeEditor_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            private void ensureMemberListIsMutable() {
                if ((this.bitField0_ & 16) != 16) {
                    this.memberList_ = new ArrayList(this.memberList_);
                    this.bitField0_ |= 16;
                }
            }

            public List<MemberInfo> getMemberListList() {
                RepeatedFieldBuilderV3<MemberInfo, MemberInfo.Builder, MemberInfoOrBuilder> repeatedFieldBuilderV3 = this.memberListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.memberList_);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            public int getMemberListCount() {
                RepeatedFieldBuilderV3<MemberInfo, MemberInfo.Builder, MemberInfoOrBuilder> repeatedFieldBuilderV3 = this.memberListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.memberList_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public MemberInfo getMemberList(int i) {
                RepeatedFieldBuilderV3<MemberInfo, MemberInfo.Builder, MemberInfoOrBuilder> repeatedFieldBuilderV3 = this.memberListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.memberList_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            public Builder setMemberList(int i, MemberInfo memberInfo) {
                RepeatedFieldBuilderV3<MemberInfo, MemberInfo.Builder, MemberInfoOrBuilder> repeatedFieldBuilderV3 = this.memberListBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i, memberInfo);
                } else if (memberInfo != null) {
                    ensureMemberListIsMutable();
                    this.memberList_.set(i, memberInfo);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder setMemberList(int i, MemberInfo.Builder builder) {
                RepeatedFieldBuilderV3<MemberInfo, MemberInfo.Builder, MemberInfoOrBuilder> repeatedFieldBuilderV3 = this.memberListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureMemberListIsMutable();
                    this.memberList_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder addMemberList(MemberInfo memberInfo) {
                RepeatedFieldBuilderV3<MemberInfo, MemberInfo.Builder, MemberInfoOrBuilder> repeatedFieldBuilderV3 = this.memberListBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(memberInfo);
                } else if (memberInfo != null) {
                    ensureMemberListIsMutable();
                    this.memberList_.add(memberInfo);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addMemberList(int i, MemberInfo memberInfo) {
                RepeatedFieldBuilderV3<MemberInfo, MemberInfo.Builder, MemberInfoOrBuilder> repeatedFieldBuilderV3 = this.memberListBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(i, memberInfo);
                } else if (memberInfo != null) {
                    ensureMemberListIsMutable();
                    this.memberList_.add(i, memberInfo);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addMemberList(MemberInfo.Builder builder) {
                RepeatedFieldBuilderV3<MemberInfo, MemberInfo.Builder, MemberInfoOrBuilder> repeatedFieldBuilderV3 = this.memberListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureMemberListIsMutable();
                    this.memberList_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addMemberList(int i, MemberInfo.Builder builder) {
                RepeatedFieldBuilderV3<MemberInfo, MemberInfo.Builder, MemberInfoOrBuilder> repeatedFieldBuilderV3 = this.memberListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureMemberListIsMutable();
                    this.memberList_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addAllMemberList(Iterable<? extends MemberInfo> iterable) {
                RepeatedFieldBuilderV3<MemberInfo, MemberInfo.Builder, MemberInfoOrBuilder> repeatedFieldBuilderV3 = this.memberListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureMemberListIsMutable();
                    AbstractMessageLite.Builder.addAll(iterable, this.memberList_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder clearMemberList() {
                RepeatedFieldBuilderV3<MemberInfo, MemberInfo.Builder, MemberInfoOrBuilder> repeatedFieldBuilderV3 = this.memberListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.memberList_ = Collections.emptyList();
                    this.bitField0_ &= -17;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder removeMemberList(int i) {
                RepeatedFieldBuilderV3<MemberInfo, MemberInfo.Builder, MemberInfoOrBuilder> repeatedFieldBuilderV3 = this.memberListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureMemberListIsMutable();
                    this.memberList_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public MemberInfo.Builder getMemberListBuilder(int i) {
                return getMemberListFieldBuilder().getBuilder(i);
            }

            public MemberInfoOrBuilder getMemberListOrBuilder(int i) {
                RepeatedFieldBuilderV3<MemberInfo, MemberInfo.Builder, MemberInfoOrBuilder> repeatedFieldBuilderV3 = this.memberListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.memberList_.get(i);
                }
                return repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            public List<? extends MemberInfoOrBuilder> getMemberListOrBuilderList() {
                RepeatedFieldBuilderV3<MemberInfo, MemberInfo.Builder, MemberInfoOrBuilder> repeatedFieldBuilderV3 = this.memberListBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.memberList_);
            }

            public MemberInfo.Builder addMemberListBuilder() {
                return getMemberListFieldBuilder().addBuilder(MemberInfo.getDefaultInstance());
            }

            public MemberInfo.Builder addMemberListBuilder(int i) {
                return getMemberListFieldBuilder().addBuilder(i, MemberInfo.getDefaultInstance());
            }

            public List<MemberInfo.Builder> getMemberListBuilderList() {
                return getMemberListFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<MemberInfo, MemberInfo.Builder, MemberInfoOrBuilder> getMemberListFieldBuilder() {
                if (this.memberListBuilder_ == null) {
                    this.memberListBuilder_ = new RepeatedFieldBuilderV3<>(this.memberList_, (this.bitField0_ & 16) == 16, getParentForChildren(), isClean());
                    this.memberList_ = null;
                }
                return this.memberListBuilder_;
            }

            public String getRoomName() {
                Object obj = this.roomName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.roomName_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getRoomNameBytes() {
                Object obj = this.roomName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.roomName_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setRoomName(String str) {
                if (str != null) {
                    this.roomName_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearRoomName() {
                this.roomName_ = CmdData2012.getDefaultInstance().getRoomName();
                onChanged();
                return this;
            }

            public Builder setRoomNameBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2012.checkByteStringIsUtf8(byteString);
                    this.roomName_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static CmdData2012 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<CmdData2012> parser() {
            return PARSER;
        }

        public Parser<CmdData2012> getParserForType() {
            return PARSER;
        }

        public CmdData2012 getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class CmdData2014 extends GeneratedMessageV3 implements CmdData2014OrBuilder {
        private static final CmdData2014 DEFAULT_INSTANCE = new CmdData2014();
        public static final int FRIENDUSERNAMELIST_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final Parser<CmdData2014> PARSER = new AbstractParser<CmdData2014>() {
            public CmdData2014 parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new CmdData2014(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int USERNAME_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public LazyStringList friendUsernameList_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public volatile Object username_;

        private CmdData2014(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private CmdData2014() {
            this.memoizedIsInitialized = -1;
            this.username_ = "";
            this.friendUsernameList_ = LazyStringArrayList.EMPTY;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private CmdData2014(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                boolean z2 = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.username_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                if (!(z2 & true)) {
                                    this.friendUsernameList_ = new LazyStringArrayList();
                                    z2 |= true;
                                }
                                this.friendUsernameList_.add(readStringRequireUtf8);
                            } else if (!parseUnknownFieldProto3(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        if (z2 & true) {
                            this.friendUsernameList_ = this.friendUsernameList_.getUnmodifiableView();
                        }
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if (z2 & true) {
                    this.friendUsernameList_ = this.friendUsernameList_.getUnmodifiableView();
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw null;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2014_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2014_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData2014.class, Builder.class);
        }

        public String getUsername() {
            Object obj = this.username_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.username_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getUsernameBytes() {
            Object obj = this.username_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.username_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public ProtocolStringList getFriendUsernameListList() {
            return this.friendUsernameList_;
        }

        public int getFriendUsernameListCount() {
            return this.friendUsernameList_.size();
        }

        public String getFriendUsernameList(int i) {
            return (String) this.friendUsernameList_.get(i);
        }

        public ByteString getFriendUsernameListBytes(int i) {
            return this.friendUsernameList_.getByteString(i);
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getUsernameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.username_);
            }
            for (int i = 0; i < this.friendUsernameList_.size(); i++) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.friendUsernameList_.getRaw(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !getUsernameBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.username_) + 0 : 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.friendUsernameList_.size(); i3++) {
                i2 += computeStringSizeNoTag(this.friendUsernameList_.getRaw(i3));
            }
            int size = computeStringSize + i2 + (getFriendUsernameListList().size() * 1) + this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CmdData2014)) {
                return super.equals(obj);
            }
            CmdData2014 cmdData2014 = (CmdData2014) obj;
            if (!((getUsername().equals(cmdData2014.getUsername())) && getFriendUsernameListList().equals(cmdData2014.getFriendUsernameListList())) || !this.unknownFields.equals(cmdData2014.unknownFields)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getUsername().hashCode();
            if (getFriendUsernameListCount() > 0) {
                hashCode = (((hashCode * 37) + 2) * 53) + getFriendUsernameListList().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public static CmdData2014 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static CmdData2014 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static CmdData2014 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static CmdData2014 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CmdData2014 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static CmdData2014 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CmdData2014 parseFrom(InputStream inputStream) throws IOException {
            return (CmdData2014) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CmdData2014 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2014) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData2014 parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CmdData2014) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CmdData2014 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2014) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData2014 parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CmdData2014) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CmdData2014 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2014) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(CmdData2014 cmdData2014) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cmdData2014);
        }

        public Builder toBuilder() {
            if (this == DEFAULT_INSTANCE) {
                return new Builder();
            }
            return new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CmdData2014OrBuilder {
            private int bitField0_;
            private LazyStringList friendUsernameList_;
            private Object username_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2014_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2014_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData2014.class, Builder.class);
            }

            private Builder() {
                this.username_ = "";
                this.friendUsernameList_ = LazyStringArrayList.EMPTY;
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.username_ = "";
                this.friendUsernameList_ = LazyStringArrayList.EMPTY;
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = CmdData2014.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                this.username_ = "";
                this.friendUsernameList_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -3;
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2014_descriptor;
            }

            public CmdData2014 getDefaultInstanceForType() {
                return CmdData2014.getDefaultInstance();
            }

            public CmdData2014 build() {
                CmdData2014 buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public CmdData2014 buildPartial() {
                CmdData2014 cmdData2014 = new CmdData2014((GeneratedMessageV3.Builder) this);
                Object unused = cmdData2014.username_ = this.username_;
                if ((this.bitField0_ & 2) == 2) {
                    this.friendUsernameList_ = this.friendUsernameList_.getUnmodifiableView();
                    this.bitField0_ &= -3;
                }
                LazyStringList unused2 = cmdData2014.friendUsernameList_ = this.friendUsernameList_;
                int unused3 = cmdData2014.bitField0_ = 0;
                onBuilt();
                return cmdData2014;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder mergeFrom(Message message) {
                if (message instanceof CmdData2014) {
                    return mergeFrom((CmdData2014) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CmdData2014 cmdData2014) {
                if (cmdData2014 == CmdData2014.getDefaultInstance()) {
                    return this;
                }
                if (!cmdData2014.getUsername().isEmpty()) {
                    this.username_ = cmdData2014.username_;
                    onChanged();
                }
                if (!cmdData2014.friendUsernameList_.isEmpty()) {
                    if (this.friendUsernameList_.isEmpty()) {
                        this.friendUsernameList_ = cmdData2014.friendUsernameList_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureFriendUsernameListIsMutable();
                        this.friendUsernameList_.addAll(cmdData2014.friendUsernameList_);
                    }
                    onChanged();
                }
                mergeUnknownFields(cmdData2014.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.xp.wx.middleware.MsgProtos.CmdData2014.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.xp.wx.middleware.MsgProtos.CmdData2014.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.xp.wx.middleware.MsgProtos$CmdData2014 r3 = (com.xp.wx.middleware.MsgProtos.CmdData2014) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData2014) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.xp.wx.middleware.MsgProtos$CmdData2014 r4 = (com.xp.wx.middleware.MsgProtos.CmdData2014) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData2014) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.middleware.MsgProtos.CmdData2014.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.xp.wx.middleware.MsgProtos$CmdData2014$Builder");
            }

            public String getUsername() {
                Object obj = this.username_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.username_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getUsernameBytes() {
                Object obj = this.username_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.username_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setUsername(String str) {
                if (str != null) {
                    this.username_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearUsername() {
                this.username_ = CmdData2014.getDefaultInstance().getUsername();
                onChanged();
                return this;
            }

            public Builder setUsernameBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2014.checkByteStringIsUtf8(byteString);
                    this.username_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            private void ensureFriendUsernameListIsMutable() {
                if ((this.bitField0_ & 2) != 2) {
                    this.friendUsernameList_ = new LazyStringArrayList(this.friendUsernameList_);
                    this.bitField0_ |= 2;
                }
            }

            public ProtocolStringList getFriendUsernameListList() {
                return this.friendUsernameList_.getUnmodifiableView();
            }

            public int getFriendUsernameListCount() {
                return this.friendUsernameList_.size();
            }

            public String getFriendUsernameList(int i) {
                return (String) this.friendUsernameList_.get(i);
            }

            public ByteString getFriendUsernameListBytes(int i) {
                return this.friendUsernameList_.getByteString(i);
            }

            public Builder setFriendUsernameList(int i, String str) {
                if (str != null) {
                    ensureFriendUsernameListIsMutable();
                    this.friendUsernameList_.set(i, str);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addFriendUsernameList(String str) {
                if (str != null) {
                    ensureFriendUsernameListIsMutable();
                    this.friendUsernameList_.add(str);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addAllFriendUsernameList(Iterable<String> iterable) {
                ensureFriendUsernameListIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.friendUsernameList_);
                onChanged();
                return this;
            }

            public Builder clearFriendUsernameList() {
                this.friendUsernameList_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder addFriendUsernameListBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2014.checkByteStringIsUtf8(byteString);
                    ensureFriendUsernameListIsMutable();
                    this.friendUsernameList_.add(byteString);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static CmdData2014 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<CmdData2014> parser() {
            return PARSER;
        }

        public Parser<CmdData2014> getParserForType() {
            return PARSER;
        }

        public CmdData2014 getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class CmdData2015 extends GeneratedMessageV3 implements CmdData2015OrBuilder {
        private static final CmdData2015 DEFAULT_INSTANCE = new CmdData2015();
        public static final int MEMBERIDS_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final Parser<CmdData2015> PARSER = new AbstractParser<CmdData2015>() {
            public CmdData2015 parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new CmdData2015(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int USERNAME_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public LazyStringList memberIds_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public volatile Object username_;

        private CmdData2015(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private CmdData2015() {
            this.memoizedIsInitialized = -1;
            this.username_ = "";
            this.memberIds_ = LazyStringArrayList.EMPTY;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private CmdData2015(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                boolean z2 = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.username_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                if (!(z2 & true)) {
                                    this.memberIds_ = new LazyStringArrayList();
                                    z2 |= true;
                                }
                                this.memberIds_.add(readStringRequireUtf8);
                            } else if (!parseUnknownFieldProto3(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        if (z2 & true) {
                            this.memberIds_ = this.memberIds_.getUnmodifiableView();
                        }
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if (z2 & true) {
                    this.memberIds_ = this.memberIds_.getUnmodifiableView();
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw null;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2015_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2015_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData2015.class, Builder.class);
        }

        public String getUsername() {
            Object obj = this.username_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.username_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getUsernameBytes() {
            Object obj = this.username_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.username_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public ProtocolStringList getMemberIdsList() {
            return this.memberIds_;
        }

        public int getMemberIdsCount() {
            return this.memberIds_.size();
        }

        public String getMemberIds(int i) {
            return (String) this.memberIds_.get(i);
        }

        public ByteString getMemberIdsBytes(int i) {
            return this.memberIds_.getByteString(i);
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getUsernameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.username_);
            }
            for (int i = 0; i < this.memberIds_.size(); i++) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.memberIds_.getRaw(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !getUsernameBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.username_) + 0 : 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.memberIds_.size(); i3++) {
                i2 += computeStringSizeNoTag(this.memberIds_.getRaw(i3));
            }
            int size = computeStringSize + i2 + (getMemberIdsList().size() * 1) + this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CmdData2015)) {
                return super.equals(obj);
            }
            CmdData2015 cmdData2015 = (CmdData2015) obj;
            if (!((getUsername().equals(cmdData2015.getUsername())) && getMemberIdsList().equals(cmdData2015.getMemberIdsList())) || !this.unknownFields.equals(cmdData2015.unknownFields)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getUsername().hashCode();
            if (getMemberIdsCount() > 0) {
                hashCode = (((hashCode * 37) + 2) * 53) + getMemberIdsList().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public static CmdData2015 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static CmdData2015 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static CmdData2015 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static CmdData2015 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CmdData2015 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static CmdData2015 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CmdData2015 parseFrom(InputStream inputStream) throws IOException {
            return (CmdData2015) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CmdData2015 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2015) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData2015 parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CmdData2015) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CmdData2015 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2015) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData2015 parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CmdData2015) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CmdData2015 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2015) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(CmdData2015 cmdData2015) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cmdData2015);
        }

        public Builder toBuilder() {
            if (this == DEFAULT_INSTANCE) {
                return new Builder();
            }
            return new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CmdData2015OrBuilder {
            private int bitField0_;
            private LazyStringList memberIds_;
            private Object username_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2015_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2015_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData2015.class, Builder.class);
            }

            private Builder() {
                this.username_ = "";
                this.memberIds_ = LazyStringArrayList.EMPTY;
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.username_ = "";
                this.memberIds_ = LazyStringArrayList.EMPTY;
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = CmdData2015.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                this.username_ = "";
                this.memberIds_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -3;
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2015_descriptor;
            }

            public CmdData2015 getDefaultInstanceForType() {
                return CmdData2015.getDefaultInstance();
            }

            public CmdData2015 build() {
                CmdData2015 buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public CmdData2015 buildPartial() {
                CmdData2015 cmdData2015 = new CmdData2015((GeneratedMessageV3.Builder) this);
                Object unused = cmdData2015.username_ = this.username_;
                if ((this.bitField0_ & 2) == 2) {
                    this.memberIds_ = this.memberIds_.getUnmodifiableView();
                    this.bitField0_ &= -3;
                }
                LazyStringList unused2 = cmdData2015.memberIds_ = this.memberIds_;
                int unused3 = cmdData2015.bitField0_ = 0;
                onBuilt();
                return cmdData2015;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder mergeFrom(Message message) {
                if (message instanceof CmdData2015) {
                    return mergeFrom((CmdData2015) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CmdData2015 cmdData2015) {
                if (cmdData2015 == CmdData2015.getDefaultInstance()) {
                    return this;
                }
                if (!cmdData2015.getUsername().isEmpty()) {
                    this.username_ = cmdData2015.username_;
                    onChanged();
                }
                if (!cmdData2015.memberIds_.isEmpty()) {
                    if (this.memberIds_.isEmpty()) {
                        this.memberIds_ = cmdData2015.memberIds_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureMemberIdsIsMutable();
                        this.memberIds_.addAll(cmdData2015.memberIds_);
                    }
                    onChanged();
                }
                mergeUnknownFields(cmdData2015.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.xp.wx.middleware.MsgProtos.CmdData2015.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.xp.wx.middleware.MsgProtos.CmdData2015.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.xp.wx.middleware.MsgProtos$CmdData2015 r3 = (com.xp.wx.middleware.MsgProtos.CmdData2015) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData2015) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.xp.wx.middleware.MsgProtos$CmdData2015 r4 = (com.xp.wx.middleware.MsgProtos.CmdData2015) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData2015) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.middleware.MsgProtos.CmdData2015.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.xp.wx.middleware.MsgProtos$CmdData2015$Builder");
            }

            public String getUsername() {
                Object obj = this.username_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.username_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getUsernameBytes() {
                Object obj = this.username_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.username_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setUsername(String str) {
                if (str != null) {
                    this.username_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearUsername() {
                this.username_ = CmdData2015.getDefaultInstance().getUsername();
                onChanged();
                return this;
            }

            public Builder setUsernameBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2015.checkByteStringIsUtf8(byteString);
                    this.username_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            private void ensureMemberIdsIsMutable() {
                if ((this.bitField0_ & 2) != 2) {
                    this.memberIds_ = new LazyStringArrayList(this.memberIds_);
                    this.bitField0_ |= 2;
                }
            }

            public ProtocolStringList getMemberIdsList() {
                return this.memberIds_.getUnmodifiableView();
            }

            public int getMemberIdsCount() {
                return this.memberIds_.size();
            }

            public String getMemberIds(int i) {
                return (String) this.memberIds_.get(i);
            }

            public ByteString getMemberIdsBytes(int i) {
                return this.memberIds_.getByteString(i);
            }

            public Builder setMemberIds(int i, String str) {
                if (str != null) {
                    ensureMemberIdsIsMutable();
                    this.memberIds_.set(i, str);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addMemberIds(String str) {
                if (str != null) {
                    ensureMemberIdsIsMutable();
                    this.memberIds_.add(str);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addAllMemberIds(Iterable<String> iterable) {
                ensureMemberIdsIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.memberIds_);
                onChanged();
                return this;
            }

            public Builder clearMemberIds() {
                this.memberIds_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder addMemberIdsBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2015.checkByteStringIsUtf8(byteString);
                    ensureMemberIdsIsMutable();
                    this.memberIds_.add(byteString);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static CmdData2015 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<CmdData2015> parser() {
            return PARSER;
        }

        public Parser<CmdData2015> getParserForType() {
            return PARSER;
        }

        public CmdData2015 getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class CmdData2016 extends GeneratedMessageV3 implements CmdData2016OrBuilder {
        private static final CmdData2016 DEFAULT_INSTANCE = new CmdData2016();
        public static final int MEMBERIDS_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final Parser<CmdData2016> PARSER = new AbstractParser<CmdData2016>() {
            public CmdData2016 parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new CmdData2016(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int USERNAME_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public LazyStringList memberIds_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public volatile Object username_;

        private CmdData2016(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private CmdData2016() {
            this.memoizedIsInitialized = -1;
            this.username_ = "";
            this.memberIds_ = LazyStringArrayList.EMPTY;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private CmdData2016(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                boolean z2 = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.username_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                if (!(z2 & true)) {
                                    this.memberIds_ = new LazyStringArrayList();
                                    z2 |= true;
                                }
                                this.memberIds_.add(readStringRequireUtf8);
                            } else if (!parseUnknownFieldProto3(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        if (z2 & true) {
                            this.memberIds_ = this.memberIds_.getUnmodifiableView();
                        }
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if (z2 & true) {
                    this.memberIds_ = this.memberIds_.getUnmodifiableView();
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw null;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2016_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2016_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData2016.class, Builder.class);
        }

        public String getUsername() {
            Object obj = this.username_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.username_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getUsernameBytes() {
            Object obj = this.username_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.username_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public ProtocolStringList getMemberIdsList() {
            return this.memberIds_;
        }

        public int getMemberIdsCount() {
            return this.memberIds_.size();
        }

        public String getMemberIds(int i) {
            return (String) this.memberIds_.get(i);
        }

        public ByteString getMemberIdsBytes(int i) {
            return this.memberIds_.getByteString(i);
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getUsernameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.username_);
            }
            for (int i = 0; i < this.memberIds_.size(); i++) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.memberIds_.getRaw(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !getUsernameBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.username_) + 0 : 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.memberIds_.size(); i3++) {
                i2 += computeStringSizeNoTag(this.memberIds_.getRaw(i3));
            }
            int size = computeStringSize + i2 + (getMemberIdsList().size() * 1) + this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CmdData2016)) {
                return super.equals(obj);
            }
            CmdData2016 cmdData2016 = (CmdData2016) obj;
            if (!((getUsername().equals(cmdData2016.getUsername())) && getMemberIdsList().equals(cmdData2016.getMemberIdsList())) || !this.unknownFields.equals(cmdData2016.unknownFields)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getUsername().hashCode();
            if (getMemberIdsCount() > 0) {
                hashCode = (((hashCode * 37) + 2) * 53) + getMemberIdsList().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public static CmdData2016 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static CmdData2016 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static CmdData2016 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static CmdData2016 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CmdData2016 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static CmdData2016 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CmdData2016 parseFrom(InputStream inputStream) throws IOException {
            return (CmdData2016) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CmdData2016 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2016) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData2016 parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CmdData2016) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CmdData2016 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2016) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData2016 parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CmdData2016) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CmdData2016 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2016) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(CmdData2016 cmdData2016) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cmdData2016);
        }

        public Builder toBuilder() {
            if (this == DEFAULT_INSTANCE) {
                return new Builder();
            }
            return new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CmdData2016OrBuilder {
            private int bitField0_;
            private LazyStringList memberIds_;
            private Object username_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2016_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2016_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData2016.class, Builder.class);
            }

            private Builder() {
                this.username_ = "";
                this.memberIds_ = LazyStringArrayList.EMPTY;
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.username_ = "";
                this.memberIds_ = LazyStringArrayList.EMPTY;
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = CmdData2016.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                this.username_ = "";
                this.memberIds_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -3;
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2016_descriptor;
            }

            public CmdData2016 getDefaultInstanceForType() {
                return CmdData2016.getDefaultInstance();
            }

            public CmdData2016 build() {
                CmdData2016 buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public CmdData2016 buildPartial() {
                CmdData2016 cmdData2016 = new CmdData2016((GeneratedMessageV3.Builder) this);
                Object unused = cmdData2016.username_ = this.username_;
                if ((this.bitField0_ & 2) == 2) {
                    this.memberIds_ = this.memberIds_.getUnmodifiableView();
                    this.bitField0_ &= -3;
                }
                LazyStringList unused2 = cmdData2016.memberIds_ = this.memberIds_;
                int unused3 = cmdData2016.bitField0_ = 0;
                onBuilt();
                return cmdData2016;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder mergeFrom(Message message) {
                if (message instanceof CmdData2016) {
                    return mergeFrom((CmdData2016) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CmdData2016 cmdData2016) {
                if (cmdData2016 == CmdData2016.getDefaultInstance()) {
                    return this;
                }
                if (!cmdData2016.getUsername().isEmpty()) {
                    this.username_ = cmdData2016.username_;
                    onChanged();
                }
                if (!cmdData2016.memberIds_.isEmpty()) {
                    if (this.memberIds_.isEmpty()) {
                        this.memberIds_ = cmdData2016.memberIds_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureMemberIdsIsMutable();
                        this.memberIds_.addAll(cmdData2016.memberIds_);
                    }
                    onChanged();
                }
                mergeUnknownFields(cmdData2016.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.xp.wx.middleware.MsgProtos.CmdData2016.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.xp.wx.middleware.MsgProtos.CmdData2016.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.xp.wx.middleware.MsgProtos$CmdData2016 r3 = (com.xp.wx.middleware.MsgProtos.CmdData2016) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData2016) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.xp.wx.middleware.MsgProtos$CmdData2016 r4 = (com.xp.wx.middleware.MsgProtos.CmdData2016) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData2016) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.middleware.MsgProtos.CmdData2016.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.xp.wx.middleware.MsgProtos$CmdData2016$Builder");
            }

            public String getUsername() {
                Object obj = this.username_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.username_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getUsernameBytes() {
                Object obj = this.username_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.username_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setUsername(String str) {
                if (str != null) {
                    this.username_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearUsername() {
                this.username_ = CmdData2016.getDefaultInstance().getUsername();
                onChanged();
                return this;
            }

            public Builder setUsernameBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2016.checkByteStringIsUtf8(byteString);
                    this.username_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            private void ensureMemberIdsIsMutable() {
                if ((this.bitField0_ & 2) != 2) {
                    this.memberIds_ = new LazyStringArrayList(this.memberIds_);
                    this.bitField0_ |= 2;
                }
            }

            public ProtocolStringList getMemberIdsList() {
                return this.memberIds_.getUnmodifiableView();
            }

            public int getMemberIdsCount() {
                return this.memberIds_.size();
            }

            public String getMemberIds(int i) {
                return (String) this.memberIds_.get(i);
            }

            public ByteString getMemberIdsBytes(int i) {
                return this.memberIds_.getByteString(i);
            }

            public Builder setMemberIds(int i, String str) {
                if (str != null) {
                    ensureMemberIdsIsMutable();
                    this.memberIds_.set(i, str);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addMemberIds(String str) {
                if (str != null) {
                    ensureMemberIdsIsMutable();
                    this.memberIds_.add(str);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addAllMemberIds(Iterable<String> iterable) {
                ensureMemberIdsIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.memberIds_);
                onChanged();
                return this;
            }

            public Builder clearMemberIds() {
                this.memberIds_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder addMemberIdsBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2016.checkByteStringIsUtf8(byteString);
                    ensureMemberIdsIsMutable();
                    this.memberIds_.add(byteString);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static CmdData2016 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<CmdData2016> parser() {
            return PARSER;
        }

        public Parser<CmdData2016> getParserForType() {
            return PARSER;
        }

        public CmdData2016 getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class CmdData2018 extends GeneratedMessageV3 implements CmdData2018OrBuilder {
        private static final CmdData2018 DEFAULT_INSTANCE = new CmdData2018();
        public static final int NICKNAME_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final Parser<CmdData2018> PARSER = new AbstractParser<CmdData2018>() {
            public CmdData2018 parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new CmdData2018(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int USERNAME_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public volatile Object nickname_;
        /* access modifiers changed from: private */
        public volatile Object username_;

        private CmdData2018(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private CmdData2018() {
            this.memoizedIsInitialized = -1;
            this.username_ = "";
            this.nickname_ = "";
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private CmdData2018(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.username_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.nickname_ = codedInputStream.readStringRequireUtf8();
                            } else if (!parseUnknownFieldProto3(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw null;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2018_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2018_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData2018.class, Builder.class);
        }

        public String getUsername() {
            Object obj = this.username_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.username_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getUsernameBytes() {
            Object obj = this.username_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.username_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getNickname() {
            Object obj = this.nickname_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.nickname_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getNicknameBytes() {
            Object obj = this.nickname_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.nickname_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getUsernameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.username_);
            }
            if (!getNicknameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.nickname_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!getUsernameBytes().isEmpty()) {
                i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.username_);
            }
            if (!getNicknameBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(2, this.nickname_);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CmdData2018)) {
                return super.equals(obj);
            }
            CmdData2018 cmdData2018 = (CmdData2018) obj;
            if (!((getUsername().equals(cmdData2018.getUsername())) && getNickname().equals(cmdData2018.getNickname())) || !this.unknownFields.equals(cmdData2018.unknownFields)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getUsername().hashCode()) * 37) + 2) * 53) + getNickname().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public static CmdData2018 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static CmdData2018 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static CmdData2018 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static CmdData2018 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CmdData2018 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static CmdData2018 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CmdData2018 parseFrom(InputStream inputStream) throws IOException {
            return (CmdData2018) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CmdData2018 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2018) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData2018 parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CmdData2018) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CmdData2018 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2018) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData2018 parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CmdData2018) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CmdData2018 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2018) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(CmdData2018 cmdData2018) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cmdData2018);
        }

        public Builder toBuilder() {
            if (this == DEFAULT_INSTANCE) {
                return new Builder();
            }
            return new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CmdData2018OrBuilder {
            private Object nickname_;
            private Object username_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2018_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2018_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData2018.class, Builder.class);
            }

            private Builder() {
                this.username_ = "";
                this.nickname_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.username_ = "";
                this.nickname_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = CmdData2018.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                this.username_ = "";
                this.nickname_ = "";
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2018_descriptor;
            }

            public CmdData2018 getDefaultInstanceForType() {
                return CmdData2018.getDefaultInstance();
            }

            public CmdData2018 build() {
                CmdData2018 buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public CmdData2018 buildPartial() {
                CmdData2018 cmdData2018 = new CmdData2018((GeneratedMessageV3.Builder) this);
                Object unused = cmdData2018.username_ = this.username_;
                Object unused2 = cmdData2018.nickname_ = this.nickname_;
                onBuilt();
                return cmdData2018;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder mergeFrom(Message message) {
                if (message instanceof CmdData2018) {
                    return mergeFrom((CmdData2018) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CmdData2018 cmdData2018) {
                if (cmdData2018 == CmdData2018.getDefaultInstance()) {
                    return this;
                }
                if (!cmdData2018.getUsername().isEmpty()) {
                    this.username_ = cmdData2018.username_;
                    onChanged();
                }
                if (!cmdData2018.getNickname().isEmpty()) {
                    this.nickname_ = cmdData2018.nickname_;
                    onChanged();
                }
                mergeUnknownFields(cmdData2018.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.xp.wx.middleware.MsgProtos.CmdData2018.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.xp.wx.middleware.MsgProtos.CmdData2018.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.xp.wx.middleware.MsgProtos$CmdData2018 r3 = (com.xp.wx.middleware.MsgProtos.CmdData2018) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData2018) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.xp.wx.middleware.MsgProtos$CmdData2018 r4 = (com.xp.wx.middleware.MsgProtos.CmdData2018) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData2018) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.middleware.MsgProtos.CmdData2018.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.xp.wx.middleware.MsgProtos$CmdData2018$Builder");
            }

            public String getUsername() {
                Object obj = this.username_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.username_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getUsernameBytes() {
                Object obj = this.username_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.username_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setUsername(String str) {
                if (str != null) {
                    this.username_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearUsername() {
                this.username_ = CmdData2018.getDefaultInstance().getUsername();
                onChanged();
                return this;
            }

            public Builder setUsernameBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2018.checkByteStringIsUtf8(byteString);
                    this.username_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getNickname() {
                Object obj = this.nickname_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.nickname_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getNicknameBytes() {
                Object obj = this.nickname_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.nickname_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setNickname(String str) {
                if (str != null) {
                    this.nickname_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearNickname() {
                this.nickname_ = CmdData2018.getDefaultInstance().getNickname();
                onChanged();
                return this;
            }

            public Builder setNicknameBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2018.checkByteStringIsUtf8(byteString);
                    this.nickname_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static CmdData2018 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<CmdData2018> parser() {
            return PARSER;
        }

        public Parser<CmdData2018> getParserForType() {
            return PARSER;
        }

        public CmdData2018 getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class CmdData2020 extends GeneratedMessageV3 implements CmdData2020OrBuilder {
        private static final CmdData2020 DEFAULT_INSTANCE = new CmdData2020();
        /* access modifiers changed from: private */
        public static final Parser<CmdData2020> PARSER = new AbstractParser<CmdData2020>() {
            public CmdData2020 parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new CmdData2020(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int QRCODE_FIELD_NUMBER = 2;
        public static final int USERNAME_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public volatile Object qrcode_;
        /* access modifiers changed from: private */
        public volatile Object username_;

        private CmdData2020(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private CmdData2020() {
            this.memoizedIsInitialized = -1;
            this.username_ = "";
            this.qrcode_ = "";
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private CmdData2020(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.username_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.qrcode_ = codedInputStream.readStringRequireUtf8();
                            } else if (!parseUnknownFieldProto3(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw null;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2020_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2020_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData2020.class, Builder.class);
        }

        public String getUsername() {
            Object obj = this.username_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.username_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getUsernameBytes() {
            Object obj = this.username_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.username_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getQrcode() {
            Object obj = this.qrcode_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.qrcode_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getQrcodeBytes() {
            Object obj = this.qrcode_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.qrcode_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getUsernameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.username_);
            }
            if (!getQrcodeBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.qrcode_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!getUsernameBytes().isEmpty()) {
                i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.username_);
            }
            if (!getQrcodeBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(2, this.qrcode_);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CmdData2020)) {
                return super.equals(obj);
            }
            CmdData2020 cmdData2020 = (CmdData2020) obj;
            if (!((getUsername().equals(cmdData2020.getUsername())) && getQrcode().equals(cmdData2020.getQrcode())) || !this.unknownFields.equals(cmdData2020.unknownFields)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getUsername().hashCode()) * 37) + 2) * 53) + getQrcode().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public static CmdData2020 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static CmdData2020 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static CmdData2020 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static CmdData2020 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CmdData2020 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static CmdData2020 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CmdData2020 parseFrom(InputStream inputStream) throws IOException {
            return (CmdData2020) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CmdData2020 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2020) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData2020 parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CmdData2020) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CmdData2020 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2020) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData2020 parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CmdData2020) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CmdData2020 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2020) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(CmdData2020 cmdData2020) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cmdData2020);
        }

        public Builder toBuilder() {
            if (this == DEFAULT_INSTANCE) {
                return new Builder();
            }
            return new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CmdData2020OrBuilder {
            private Object qrcode_;
            private Object username_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2020_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2020_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData2020.class, Builder.class);
            }

            private Builder() {
                this.username_ = "";
                this.qrcode_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.username_ = "";
                this.qrcode_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = CmdData2020.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                this.username_ = "";
                this.qrcode_ = "";
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2020_descriptor;
            }

            public CmdData2020 getDefaultInstanceForType() {
                return CmdData2020.getDefaultInstance();
            }

            public CmdData2020 build() {
                CmdData2020 buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public CmdData2020 buildPartial() {
                CmdData2020 cmdData2020 = new CmdData2020((GeneratedMessageV3.Builder) this);
                Object unused = cmdData2020.username_ = this.username_;
                Object unused2 = cmdData2020.qrcode_ = this.qrcode_;
                onBuilt();
                return cmdData2020;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder mergeFrom(Message message) {
                if (message instanceof CmdData2020) {
                    return mergeFrom((CmdData2020) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CmdData2020 cmdData2020) {
                if (cmdData2020 == CmdData2020.getDefaultInstance()) {
                    return this;
                }
                if (!cmdData2020.getUsername().isEmpty()) {
                    this.username_ = cmdData2020.username_;
                    onChanged();
                }
                if (!cmdData2020.getQrcode().isEmpty()) {
                    this.qrcode_ = cmdData2020.qrcode_;
                    onChanged();
                }
                mergeUnknownFields(cmdData2020.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.xp.wx.middleware.MsgProtos.CmdData2020.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.xp.wx.middleware.MsgProtos.CmdData2020.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.xp.wx.middleware.MsgProtos$CmdData2020 r3 = (com.xp.wx.middleware.MsgProtos.CmdData2020) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData2020) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.xp.wx.middleware.MsgProtos$CmdData2020 r4 = (com.xp.wx.middleware.MsgProtos.CmdData2020) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData2020) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.middleware.MsgProtos.CmdData2020.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.xp.wx.middleware.MsgProtos$CmdData2020$Builder");
            }

            public String getUsername() {
                Object obj = this.username_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.username_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getUsernameBytes() {
                Object obj = this.username_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.username_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setUsername(String str) {
                if (str != null) {
                    this.username_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearUsername() {
                this.username_ = CmdData2020.getDefaultInstance().getUsername();
                onChanged();
                return this;
            }

            public Builder setUsernameBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2020.checkByteStringIsUtf8(byteString);
                    this.username_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getQrcode() {
                Object obj = this.qrcode_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.qrcode_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getQrcodeBytes() {
                Object obj = this.qrcode_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.qrcode_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setQrcode(String str) {
                if (str != null) {
                    this.qrcode_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearQrcode() {
                this.qrcode_ = CmdData2020.getDefaultInstance().getQrcode();
                onChanged();
                return this;
            }

            public Builder setQrcodeBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2020.checkByteStringIsUtf8(byteString);
                    this.qrcode_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static CmdData2020 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<CmdData2020> parser() {
            return PARSER;
        }

        public Parser<CmdData2020> getParserForType() {
            return PARSER;
        }

        public CmdData2020 getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class CmdData2021 extends GeneratedMessageV3 implements CmdData2021OrBuilder {
        private static final CmdData2021 DEFAULT_INSTANCE = new CmdData2021();
        public static final int NOTICECONTENT_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final Parser<CmdData2021> PARSER = new AbstractParser<CmdData2021>() {
            public CmdData2021 parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new CmdData2021(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int USERNAME_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public volatile Object noticeContent_;
        /* access modifiers changed from: private */
        public volatile Object username_;

        private CmdData2021(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private CmdData2021() {
            this.memoizedIsInitialized = -1;
            this.username_ = "";
            this.noticeContent_ = "";
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private CmdData2021(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.username_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.noticeContent_ = codedInputStream.readStringRequireUtf8();
                            } else if (!parseUnknownFieldProto3(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw null;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2021_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2021_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData2021.class, Builder.class);
        }

        public String getUsername() {
            Object obj = this.username_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.username_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getUsernameBytes() {
            Object obj = this.username_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.username_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getNoticeContent() {
            Object obj = this.noticeContent_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.noticeContent_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getNoticeContentBytes() {
            Object obj = this.noticeContent_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.noticeContent_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getUsernameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.username_);
            }
            if (!getNoticeContentBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.noticeContent_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!getUsernameBytes().isEmpty()) {
                i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.username_);
            }
            if (!getNoticeContentBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(2, this.noticeContent_);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CmdData2021)) {
                return super.equals(obj);
            }
            CmdData2021 cmdData2021 = (CmdData2021) obj;
            if (!((getUsername().equals(cmdData2021.getUsername())) && getNoticeContent().equals(cmdData2021.getNoticeContent())) || !this.unknownFields.equals(cmdData2021.unknownFields)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getUsername().hashCode()) * 37) + 2) * 53) + getNoticeContent().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public static CmdData2021 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static CmdData2021 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static CmdData2021 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static CmdData2021 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CmdData2021 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static CmdData2021 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CmdData2021 parseFrom(InputStream inputStream) throws IOException {
            return (CmdData2021) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CmdData2021 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2021) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData2021 parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CmdData2021) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CmdData2021 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2021) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData2021 parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CmdData2021) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CmdData2021 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2021) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(CmdData2021 cmdData2021) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cmdData2021);
        }

        public Builder toBuilder() {
            if (this == DEFAULT_INSTANCE) {
                return new Builder();
            }
            return new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CmdData2021OrBuilder {
            private Object noticeContent_;
            private Object username_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2021_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2021_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData2021.class, Builder.class);
            }

            private Builder() {
                this.username_ = "";
                this.noticeContent_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.username_ = "";
                this.noticeContent_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = CmdData2021.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                this.username_ = "";
                this.noticeContent_ = "";
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2021_descriptor;
            }

            public CmdData2021 getDefaultInstanceForType() {
                return CmdData2021.getDefaultInstance();
            }

            public CmdData2021 build() {
                CmdData2021 buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public CmdData2021 buildPartial() {
                CmdData2021 cmdData2021 = new CmdData2021((GeneratedMessageV3.Builder) this);
                Object unused = cmdData2021.username_ = this.username_;
                Object unused2 = cmdData2021.noticeContent_ = this.noticeContent_;
                onBuilt();
                return cmdData2021;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder mergeFrom(Message message) {
                if (message instanceof CmdData2021) {
                    return mergeFrom((CmdData2021) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CmdData2021 cmdData2021) {
                if (cmdData2021 == CmdData2021.getDefaultInstance()) {
                    return this;
                }
                if (!cmdData2021.getUsername().isEmpty()) {
                    this.username_ = cmdData2021.username_;
                    onChanged();
                }
                if (!cmdData2021.getNoticeContent().isEmpty()) {
                    this.noticeContent_ = cmdData2021.noticeContent_;
                    onChanged();
                }
                mergeUnknownFields(cmdData2021.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.xp.wx.middleware.MsgProtos.CmdData2021.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.xp.wx.middleware.MsgProtos.CmdData2021.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.xp.wx.middleware.MsgProtos$CmdData2021 r3 = (com.xp.wx.middleware.MsgProtos.CmdData2021) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData2021) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.xp.wx.middleware.MsgProtos$CmdData2021 r4 = (com.xp.wx.middleware.MsgProtos.CmdData2021) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData2021) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.middleware.MsgProtos.CmdData2021.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.xp.wx.middleware.MsgProtos$CmdData2021$Builder");
            }

            public String getUsername() {
                Object obj = this.username_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.username_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getUsernameBytes() {
                Object obj = this.username_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.username_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setUsername(String str) {
                if (str != null) {
                    this.username_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearUsername() {
                this.username_ = CmdData2021.getDefaultInstance().getUsername();
                onChanged();
                return this;
            }

            public Builder setUsernameBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2021.checkByteStringIsUtf8(byteString);
                    this.username_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getNoticeContent() {
                Object obj = this.noticeContent_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.noticeContent_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getNoticeContentBytes() {
                Object obj = this.noticeContent_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.noticeContent_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setNoticeContent(String str) {
                if (str != null) {
                    this.noticeContent_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearNoticeContent() {
                this.noticeContent_ = CmdData2021.getDefaultInstance().getNoticeContent();
                onChanged();
                return this;
            }

            public Builder setNoticeContentBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2021.checkByteStringIsUtf8(byteString);
                    this.noticeContent_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static CmdData2021 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<CmdData2021> parser() {
            return PARSER;
        }

        public Parser<CmdData2021> getParserForType() {
            return PARSER;
        }

        public CmdData2021 getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class CmdData2026 extends GeneratedMessageV3 implements CmdData2026OrBuilder {
        private static final CmdData2026 DEFAULT_INSTANCE = new CmdData2026();
        /* access modifiers changed from: private */
        public static final Parser<CmdData2026> PARSER = new AbstractParser<CmdData2026>() {
            public CmdData2026 parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new CmdData2026(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int TICKET_FIELD_NUMBER = 2;
        public static final int USERNAME_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public volatile Object ticket_;
        /* access modifiers changed from: private */
        public volatile Object username_;

        private CmdData2026(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private CmdData2026() {
            this.memoizedIsInitialized = -1;
            this.username_ = "";
            this.ticket_ = "";
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private CmdData2026(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.username_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.ticket_ = codedInputStream.readStringRequireUtf8();
                            } else if (!parseUnknownFieldProto3(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw null;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2026_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2026_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData2026.class, Builder.class);
        }

        public String getUsername() {
            Object obj = this.username_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.username_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getUsernameBytes() {
            Object obj = this.username_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.username_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getTicket() {
            Object obj = this.ticket_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ticket_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getTicketBytes() {
            Object obj = this.ticket_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ticket_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getUsernameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.username_);
            }
            if (!getTicketBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.ticket_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!getUsernameBytes().isEmpty()) {
                i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.username_);
            }
            if (!getTicketBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(2, this.ticket_);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CmdData2026)) {
                return super.equals(obj);
            }
            CmdData2026 cmdData2026 = (CmdData2026) obj;
            if (!((getUsername().equals(cmdData2026.getUsername())) && getTicket().equals(cmdData2026.getTicket())) || !this.unknownFields.equals(cmdData2026.unknownFields)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getUsername().hashCode()) * 37) + 2) * 53) + getTicket().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public static CmdData2026 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static CmdData2026 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static CmdData2026 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static CmdData2026 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CmdData2026 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static CmdData2026 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CmdData2026 parseFrom(InputStream inputStream) throws IOException {
            return (CmdData2026) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CmdData2026 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2026) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData2026 parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CmdData2026) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CmdData2026 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2026) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData2026 parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CmdData2026) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CmdData2026 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2026) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(CmdData2026 cmdData2026) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cmdData2026);
        }

        public Builder toBuilder() {
            if (this == DEFAULT_INSTANCE) {
                return new Builder();
            }
            return new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CmdData2026OrBuilder {
            private Object ticket_;
            private Object username_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2026_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2026_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData2026.class, Builder.class);
            }

            private Builder() {
                this.username_ = "";
                this.ticket_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.username_ = "";
                this.ticket_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = CmdData2026.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                this.username_ = "";
                this.ticket_ = "";
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2026_descriptor;
            }

            public CmdData2026 getDefaultInstanceForType() {
                return CmdData2026.getDefaultInstance();
            }

            public CmdData2026 build() {
                CmdData2026 buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public CmdData2026 buildPartial() {
                CmdData2026 cmdData2026 = new CmdData2026((GeneratedMessageV3.Builder) this);
                Object unused = cmdData2026.username_ = this.username_;
                Object unused2 = cmdData2026.ticket_ = this.ticket_;
                onBuilt();
                return cmdData2026;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder mergeFrom(Message message) {
                if (message instanceof CmdData2026) {
                    return mergeFrom((CmdData2026) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CmdData2026 cmdData2026) {
                if (cmdData2026 == CmdData2026.getDefaultInstance()) {
                    return this;
                }
                if (!cmdData2026.getUsername().isEmpty()) {
                    this.username_ = cmdData2026.username_;
                    onChanged();
                }
                if (!cmdData2026.getTicket().isEmpty()) {
                    this.ticket_ = cmdData2026.ticket_;
                    onChanged();
                }
                mergeUnknownFields(cmdData2026.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.xp.wx.middleware.MsgProtos.CmdData2026.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.xp.wx.middleware.MsgProtos.CmdData2026.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.xp.wx.middleware.MsgProtos$CmdData2026 r3 = (com.xp.wx.middleware.MsgProtos.CmdData2026) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData2026) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.xp.wx.middleware.MsgProtos$CmdData2026 r4 = (com.xp.wx.middleware.MsgProtos.CmdData2026) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData2026) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.middleware.MsgProtos.CmdData2026.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.xp.wx.middleware.MsgProtos$CmdData2026$Builder");
            }

            public String getUsername() {
                Object obj = this.username_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.username_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getUsernameBytes() {
                Object obj = this.username_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.username_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setUsername(String str) {
                if (str != null) {
                    this.username_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearUsername() {
                this.username_ = CmdData2026.getDefaultInstance().getUsername();
                onChanged();
                return this;
            }

            public Builder setUsernameBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2026.checkByteStringIsUtf8(byteString);
                    this.username_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getTicket() {
                Object obj = this.ticket_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.ticket_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getTicketBytes() {
                Object obj = this.ticket_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.ticket_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setTicket(String str) {
                if (str != null) {
                    this.ticket_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearTicket() {
                this.ticket_ = CmdData2026.getDefaultInstance().getTicket();
                onChanged();
                return this;
            }

            public Builder setTicketBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2026.checkByteStringIsUtf8(byteString);
                    this.ticket_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static CmdData2026 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<CmdData2026> parser() {
            return PARSER;
        }

        public Parser<CmdData2026> getParserForType() {
            return PARSER;
        }

        public CmdData2026 getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class CmdData2032 extends GeneratedMessageV3 implements CmdData2032OrBuilder {
        private static final CmdData2032 DEFAULT_INSTANCE = new CmdData2032();
        /* access modifiers changed from: private */
        public static final Parser<CmdData2032> PARSER = new AbstractParser<CmdData2032>() {
            public CmdData2032 parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new CmdData2032(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int QRCODE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public volatile Object qrcode_;

        private CmdData2032(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private CmdData2032() {
            this.memoizedIsInitialized = -1;
            this.qrcode_ = "";
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private CmdData2032(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.qrcode_ = codedInputStream.readStringRequireUtf8();
                            } else if (!parseUnknownFieldProto3(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw null;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2032_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2032_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData2032.class, Builder.class);
        }

        public String getQrcode() {
            Object obj = this.qrcode_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.qrcode_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getQrcodeBytes() {
            Object obj = this.qrcode_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.qrcode_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getQrcodeBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.qrcode_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!getQrcodeBytes().isEmpty()) {
                i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.qrcode_);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CmdData2032)) {
                return super.equals(obj);
            }
            CmdData2032 cmdData2032 = (CmdData2032) obj;
            if (!(getQrcode().equals(cmdData2032.getQrcode())) || !this.unknownFields.equals(cmdData2032.unknownFields)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getQrcode().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public static CmdData2032 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static CmdData2032 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static CmdData2032 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static CmdData2032 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CmdData2032 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static CmdData2032 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CmdData2032 parseFrom(InputStream inputStream) throws IOException {
            return (CmdData2032) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CmdData2032 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2032) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData2032 parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CmdData2032) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CmdData2032 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2032) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData2032 parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CmdData2032) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CmdData2032 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2032) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(CmdData2032 cmdData2032) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cmdData2032);
        }

        public Builder toBuilder() {
            if (this == DEFAULT_INSTANCE) {
                return new Builder();
            }
            return new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CmdData2032OrBuilder {
            private Object qrcode_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2032_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2032_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData2032.class, Builder.class);
            }

            private Builder() {
                this.qrcode_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.qrcode_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = CmdData2032.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                this.qrcode_ = "";
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2032_descriptor;
            }

            public CmdData2032 getDefaultInstanceForType() {
                return CmdData2032.getDefaultInstance();
            }

            public CmdData2032 build() {
                CmdData2032 buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public CmdData2032 buildPartial() {
                CmdData2032 cmdData2032 = new CmdData2032((GeneratedMessageV3.Builder) this);
                Object unused = cmdData2032.qrcode_ = this.qrcode_;
                onBuilt();
                return cmdData2032;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder mergeFrom(Message message) {
                if (message instanceof CmdData2032) {
                    return mergeFrom((CmdData2032) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CmdData2032 cmdData2032) {
                if (cmdData2032 == CmdData2032.getDefaultInstance()) {
                    return this;
                }
                if (!cmdData2032.getQrcode().isEmpty()) {
                    this.qrcode_ = cmdData2032.qrcode_;
                    onChanged();
                }
                mergeUnknownFields(cmdData2032.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.xp.wx.middleware.MsgProtos.CmdData2032.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.xp.wx.middleware.MsgProtos.CmdData2032.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.xp.wx.middleware.MsgProtos$CmdData2032 r3 = (com.xp.wx.middleware.MsgProtos.CmdData2032) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData2032) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.xp.wx.middleware.MsgProtos$CmdData2032 r4 = (com.xp.wx.middleware.MsgProtos.CmdData2032) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData2032) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.middleware.MsgProtos.CmdData2032.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.xp.wx.middleware.MsgProtos$CmdData2032$Builder");
            }

            public String getQrcode() {
                Object obj = this.qrcode_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.qrcode_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getQrcodeBytes() {
                Object obj = this.qrcode_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.qrcode_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setQrcode(String str) {
                if (str != null) {
                    this.qrcode_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearQrcode() {
                this.qrcode_ = CmdData2032.getDefaultInstance().getQrcode();
                onChanged();
                return this;
            }

            public Builder setQrcodeBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2032.checkByteStringIsUtf8(byteString);
                    this.qrcode_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static CmdData2032 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<CmdData2032> parser() {
            return PARSER;
        }

        public Parser<CmdData2032> getParserForType() {
            return PARSER;
        }

        public CmdData2032 getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class CmdData2036 extends GeneratedMessageV3 implements CmdData2036OrBuilder {
        public static final int ATTACHPIC_FIELD_NUMBER = 14;
        public static final int BIGHEADIMAGE_FIELD_NUMBER = 11;
        public static final int CITY_FIELD_NUMBER = 4;
        private static final CmdData2036 DEFAULT_INSTANCE = new CmdData2036();
        public static final int DESC_FIELD_NUMBER = 12;
        public static final int LABELIDS_FIELD_NUMBER = 6;
        public static final int LABELNAMES_FIELD_NUMBER = 7;
        public static final int NICKNAME_FIELD_NUMBER = 8;
        /* access modifiers changed from: private */
        public static final Parser<CmdData2036> PARSER = new AbstractParser<CmdData2036>() {
            public CmdData2036 parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new CmdData2036(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int PROVINCE_FIELD_NUMBER = 3;
        public static final int REMARK_FIELD_NUMBER = 5;
        public static final int SEX_FIELD_NUMBER = 2;
        public static final int SIGNATURE_FIELD_NUMBER = 9;
        public static final int SMALLHEADIMAGE_FIELD_NUMBER = 10;
        public static final int TEL_FIELD_NUMBER = 13;
        public static final int USERNAME_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public volatile Object attachPic_;
        /* access modifiers changed from: private */
        public volatile Object bigHeadImage_;
        /* access modifiers changed from: private */
        public volatile Object city_;
        /* access modifiers changed from: private */
        public volatile Object desc_;
        /* access modifiers changed from: private */
        public volatile Object labelIds_;
        /* access modifiers changed from: private */
        public volatile Object labelNames_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public volatile Object nickname_;
        /* access modifiers changed from: private */
        public volatile Object province_;
        /* access modifiers changed from: private */
        public volatile Object remark_;
        /* access modifiers changed from: private */
        public volatile Object sex_;
        /* access modifiers changed from: private */
        public volatile Object signature_;
        /* access modifiers changed from: private */
        public volatile Object smallHeadImage_;
        /* access modifiers changed from: private */
        public volatile Object tel_;
        /* access modifiers changed from: private */
        public volatile Object username_;

        private CmdData2036(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private CmdData2036() {
            this.memoizedIsInitialized = -1;
            this.username_ = "";
            this.sex_ = "";
            this.province_ = "";
            this.city_ = "";
            this.remark_ = "";
            this.labelIds_ = "";
            this.labelNames_ = "";
            this.nickname_ = "";
            this.signature_ = "";
            this.smallHeadImage_ = "";
            this.bigHeadImage_ = "";
            this.desc_ = "";
            this.tel_ = "";
            this.attachPic_ = "";
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private CmdData2036(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        switch (readTag) {
                            case 0:
                                z = true;
                                break;
                            case 10:
                                this.username_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 18:
                                this.sex_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 26:
                                this.province_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 34:
                                this.city_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 42:
                                this.remark_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 50:
                                this.labelIds_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 58:
                                this.labelNames_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 66:
                                this.nickname_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 74:
                                this.signature_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 82:
                                this.smallHeadImage_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 90:
                                this.bigHeadImage_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 98:
                                this.desc_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 106:
                                this.tel_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 114:
                                this.attachPic_ = codedInputStream.readStringRequireUtf8();
                                break;
                            default:
                                if (parseUnknownFieldProto3(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                    break;
                                }
                                z = true;
                                break;
                        }
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw null;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2036_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2036_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData2036.class, Builder.class);
        }

        public String getUsername() {
            Object obj = this.username_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.username_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getUsernameBytes() {
            Object obj = this.username_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.username_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getSex() {
            Object obj = this.sex_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sex_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getSexBytes() {
            Object obj = this.sex_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sex_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getProvince() {
            Object obj = this.province_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.province_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getProvinceBytes() {
            Object obj = this.province_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.province_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getCity() {
            Object obj = this.city_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.city_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getCityBytes() {
            Object obj = this.city_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.city_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getRemark() {
            Object obj = this.remark_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.remark_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getRemarkBytes() {
            Object obj = this.remark_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.remark_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getLabelIds() {
            Object obj = this.labelIds_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.labelIds_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getLabelIdsBytes() {
            Object obj = this.labelIds_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.labelIds_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getLabelNames() {
            Object obj = this.labelNames_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.labelNames_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getLabelNamesBytes() {
            Object obj = this.labelNames_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.labelNames_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getNickname() {
            Object obj = this.nickname_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.nickname_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getNicknameBytes() {
            Object obj = this.nickname_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.nickname_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getSignature() {
            Object obj = this.signature_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.signature_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getSignatureBytes() {
            Object obj = this.signature_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.signature_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getSmallHeadImage() {
            Object obj = this.smallHeadImage_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.smallHeadImage_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getSmallHeadImageBytes() {
            Object obj = this.smallHeadImage_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.smallHeadImage_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getBigHeadImage() {
            Object obj = this.bigHeadImage_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.bigHeadImage_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getBigHeadImageBytes() {
            Object obj = this.bigHeadImage_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bigHeadImage_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getDesc() {
            Object obj = this.desc_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.desc_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getDescBytes() {
            Object obj = this.desc_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.desc_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getTel() {
            Object obj = this.tel_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.tel_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getTelBytes() {
            Object obj = this.tel_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.tel_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getAttachPic() {
            Object obj = this.attachPic_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.attachPic_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getAttachPicBytes() {
            Object obj = this.attachPic_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.attachPic_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getUsernameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.username_);
            }
            if (!getSexBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.sex_);
            }
            if (!getProvinceBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.province_);
            }
            if (!getCityBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.city_);
            }
            if (!getRemarkBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 5, this.remark_);
            }
            if (!getLabelIdsBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 6, this.labelIds_);
            }
            if (!getLabelNamesBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 7, this.labelNames_);
            }
            if (!getNicknameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 8, this.nickname_);
            }
            if (!getSignatureBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 9, this.signature_);
            }
            if (!getSmallHeadImageBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 10, this.smallHeadImage_);
            }
            if (!getBigHeadImageBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 11, this.bigHeadImage_);
            }
            if (!getDescBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 12, this.desc_);
            }
            if (!getTelBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 13, this.tel_);
            }
            if (!getAttachPicBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 14, this.attachPic_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!getUsernameBytes().isEmpty()) {
                i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.username_);
            }
            if (!getSexBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(2, this.sex_);
            }
            if (!getProvinceBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(3, this.province_);
            }
            if (!getCityBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(4, this.city_);
            }
            if (!getRemarkBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(5, this.remark_);
            }
            if (!getLabelIdsBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(6, this.labelIds_);
            }
            if (!getLabelNamesBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(7, this.labelNames_);
            }
            if (!getNicknameBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(8, this.nickname_);
            }
            if (!getSignatureBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(9, this.signature_);
            }
            if (!getSmallHeadImageBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(10, this.smallHeadImage_);
            }
            if (!getBigHeadImageBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(11, this.bigHeadImage_);
            }
            if (!getDescBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(12, this.desc_);
            }
            if (!getTelBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(13, this.tel_);
            }
            if (!getAttachPicBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(14, this.attachPic_);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CmdData2036)) {
                return super.equals(obj);
            }
            CmdData2036 cmdData2036 = (CmdData2036) obj;
            if (!((((((((((((((getUsername().equals(cmdData2036.getUsername())) && getSex().equals(cmdData2036.getSex())) && getProvince().equals(cmdData2036.getProvince())) && getCity().equals(cmdData2036.getCity())) && getRemark().equals(cmdData2036.getRemark())) && getLabelIds().equals(cmdData2036.getLabelIds())) && getLabelNames().equals(cmdData2036.getLabelNames())) && getNickname().equals(cmdData2036.getNickname())) && getSignature().equals(cmdData2036.getSignature())) && getSmallHeadImage().equals(cmdData2036.getSmallHeadImage())) && getBigHeadImage().equals(cmdData2036.getBigHeadImage())) && getDesc().equals(cmdData2036.getDesc())) && getTel().equals(cmdData2036.getTel())) && getAttachPic().equals(cmdData2036.getAttachPic())) || !this.unknownFields.equals(cmdData2036.unknownFields)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getUsername().hashCode()) * 37) + 2) * 53) + getSex().hashCode()) * 37) + 3) * 53) + getProvince().hashCode()) * 37) + 4) * 53) + getCity().hashCode()) * 37) + 5) * 53) + getRemark().hashCode()) * 37) + 6) * 53) + getLabelIds().hashCode()) * 37) + 7) * 53) + getLabelNames().hashCode()) * 37) + 8) * 53) + getNickname().hashCode()) * 37) + 9) * 53) + getSignature().hashCode()) * 37) + 10) * 53) + getSmallHeadImage().hashCode()) * 37) + 11) * 53) + getBigHeadImage().hashCode()) * 37) + 12) * 53) + getDesc().hashCode()) * 37) + 13) * 53) + getTel().hashCode()) * 37) + 14) * 53) + getAttachPic().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public static CmdData2036 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static CmdData2036 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static CmdData2036 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static CmdData2036 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CmdData2036 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static CmdData2036 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CmdData2036 parseFrom(InputStream inputStream) throws IOException {
            return (CmdData2036) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CmdData2036 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2036) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData2036 parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CmdData2036) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CmdData2036 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2036) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData2036 parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CmdData2036) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CmdData2036 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2036) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(CmdData2036 cmdData2036) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cmdData2036);
        }

        public Builder toBuilder() {
            if (this == DEFAULT_INSTANCE) {
                return new Builder();
            }
            return new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CmdData2036OrBuilder {
            private Object attachPic_;
            private Object bigHeadImage_;
            private Object city_;
            private Object desc_;
            private Object labelIds_;
            private Object labelNames_;
            private Object nickname_;
            private Object province_;
            private Object remark_;
            private Object sex_;
            private Object signature_;
            private Object smallHeadImage_;
            private Object tel_;
            private Object username_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2036_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2036_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData2036.class, Builder.class);
            }

            private Builder() {
                this.username_ = "";
                this.sex_ = "";
                this.province_ = "";
                this.city_ = "";
                this.remark_ = "";
                this.labelIds_ = "";
                this.labelNames_ = "";
                this.nickname_ = "";
                this.signature_ = "";
                this.smallHeadImage_ = "";
                this.bigHeadImage_ = "";
                this.desc_ = "";
                this.tel_ = "";
                this.attachPic_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.username_ = "";
                this.sex_ = "";
                this.province_ = "";
                this.city_ = "";
                this.remark_ = "";
                this.labelIds_ = "";
                this.labelNames_ = "";
                this.nickname_ = "";
                this.signature_ = "";
                this.smallHeadImage_ = "";
                this.bigHeadImage_ = "";
                this.desc_ = "";
                this.tel_ = "";
                this.attachPic_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = CmdData2036.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                this.username_ = "";
                this.sex_ = "";
                this.province_ = "";
                this.city_ = "";
                this.remark_ = "";
                this.labelIds_ = "";
                this.labelNames_ = "";
                this.nickname_ = "";
                this.signature_ = "";
                this.smallHeadImage_ = "";
                this.bigHeadImage_ = "";
                this.desc_ = "";
                this.tel_ = "";
                this.attachPic_ = "";
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2036_descriptor;
            }

            public CmdData2036 getDefaultInstanceForType() {
                return CmdData2036.getDefaultInstance();
            }

            public CmdData2036 build() {
                CmdData2036 buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public CmdData2036 buildPartial() {
                CmdData2036 cmdData2036 = new CmdData2036((GeneratedMessageV3.Builder) this);
                Object unused = cmdData2036.username_ = this.username_;
                Object unused2 = cmdData2036.sex_ = this.sex_;
                Object unused3 = cmdData2036.province_ = this.province_;
                Object unused4 = cmdData2036.city_ = this.city_;
                Object unused5 = cmdData2036.remark_ = this.remark_;
                Object unused6 = cmdData2036.labelIds_ = this.labelIds_;
                Object unused7 = cmdData2036.labelNames_ = this.labelNames_;
                Object unused8 = cmdData2036.nickname_ = this.nickname_;
                Object unused9 = cmdData2036.signature_ = this.signature_;
                Object unused10 = cmdData2036.smallHeadImage_ = this.smallHeadImage_;
                Object unused11 = cmdData2036.bigHeadImage_ = this.bigHeadImage_;
                Object unused12 = cmdData2036.desc_ = this.desc_;
                Object unused13 = cmdData2036.tel_ = this.tel_;
                Object unused14 = cmdData2036.attachPic_ = this.attachPic_;
                onBuilt();
                return cmdData2036;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder mergeFrom(Message message) {
                if (message instanceof CmdData2036) {
                    return mergeFrom((CmdData2036) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CmdData2036 cmdData2036) {
                if (cmdData2036 == CmdData2036.getDefaultInstance()) {
                    return this;
                }
                if (!cmdData2036.getUsername().isEmpty()) {
                    this.username_ = cmdData2036.username_;
                    onChanged();
                }
                if (!cmdData2036.getSex().isEmpty()) {
                    this.sex_ = cmdData2036.sex_;
                    onChanged();
                }
                if (!cmdData2036.getProvince().isEmpty()) {
                    this.province_ = cmdData2036.province_;
                    onChanged();
                }
                if (!cmdData2036.getCity().isEmpty()) {
                    this.city_ = cmdData2036.city_;
                    onChanged();
                }
                if (!cmdData2036.getRemark().isEmpty()) {
                    this.remark_ = cmdData2036.remark_;
                    onChanged();
                }
                if (!cmdData2036.getLabelIds().isEmpty()) {
                    this.labelIds_ = cmdData2036.labelIds_;
                    onChanged();
                }
                if (!cmdData2036.getLabelNames().isEmpty()) {
                    this.labelNames_ = cmdData2036.labelNames_;
                    onChanged();
                }
                if (!cmdData2036.getNickname().isEmpty()) {
                    this.nickname_ = cmdData2036.nickname_;
                    onChanged();
                }
                if (!cmdData2036.getSignature().isEmpty()) {
                    this.signature_ = cmdData2036.signature_;
                    onChanged();
                }
                if (!cmdData2036.getSmallHeadImage().isEmpty()) {
                    this.smallHeadImage_ = cmdData2036.smallHeadImage_;
                    onChanged();
                }
                if (!cmdData2036.getBigHeadImage().isEmpty()) {
                    this.bigHeadImage_ = cmdData2036.bigHeadImage_;
                    onChanged();
                }
                if (!cmdData2036.getDesc().isEmpty()) {
                    this.desc_ = cmdData2036.desc_;
                    onChanged();
                }
                if (!cmdData2036.getTel().isEmpty()) {
                    this.tel_ = cmdData2036.tel_;
                    onChanged();
                }
                if (!cmdData2036.getAttachPic().isEmpty()) {
                    this.attachPic_ = cmdData2036.attachPic_;
                    onChanged();
                }
                mergeUnknownFields(cmdData2036.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.xp.wx.middleware.MsgProtos.CmdData2036.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.xp.wx.middleware.MsgProtos.CmdData2036.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.xp.wx.middleware.MsgProtos$CmdData2036 r3 = (com.xp.wx.middleware.MsgProtos.CmdData2036) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData2036) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.xp.wx.middleware.MsgProtos$CmdData2036 r4 = (com.xp.wx.middleware.MsgProtos.CmdData2036) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData2036) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.middleware.MsgProtos.CmdData2036.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.xp.wx.middleware.MsgProtos$CmdData2036$Builder");
            }

            public String getUsername() {
                Object obj = this.username_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.username_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getUsernameBytes() {
                Object obj = this.username_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.username_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setUsername(String str) {
                if (str != null) {
                    this.username_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearUsername() {
                this.username_ = CmdData2036.getDefaultInstance().getUsername();
                onChanged();
                return this;
            }

            public Builder setUsernameBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2036.checkByteStringIsUtf8(byteString);
                    this.username_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getSex() {
                Object obj = this.sex_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.sex_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getSexBytes() {
                Object obj = this.sex_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sex_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setSex(String str) {
                if (str != null) {
                    this.sex_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearSex() {
                this.sex_ = CmdData2036.getDefaultInstance().getSex();
                onChanged();
                return this;
            }

            public Builder setSexBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2036.checkByteStringIsUtf8(byteString);
                    this.sex_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getProvince() {
                Object obj = this.province_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.province_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getProvinceBytes() {
                Object obj = this.province_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.province_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setProvince(String str) {
                if (str != null) {
                    this.province_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearProvince() {
                this.province_ = CmdData2036.getDefaultInstance().getProvince();
                onChanged();
                return this;
            }

            public Builder setProvinceBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2036.checkByteStringIsUtf8(byteString);
                    this.province_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getCity() {
                Object obj = this.city_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.city_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getCityBytes() {
                Object obj = this.city_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.city_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setCity(String str) {
                if (str != null) {
                    this.city_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearCity() {
                this.city_ = CmdData2036.getDefaultInstance().getCity();
                onChanged();
                return this;
            }

            public Builder setCityBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2036.checkByteStringIsUtf8(byteString);
                    this.city_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getRemark() {
                Object obj = this.remark_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.remark_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getRemarkBytes() {
                Object obj = this.remark_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.remark_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setRemark(String str) {
                if (str != null) {
                    this.remark_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearRemark() {
                this.remark_ = CmdData2036.getDefaultInstance().getRemark();
                onChanged();
                return this;
            }

            public Builder setRemarkBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2036.checkByteStringIsUtf8(byteString);
                    this.remark_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getLabelIds() {
                Object obj = this.labelIds_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.labelIds_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getLabelIdsBytes() {
                Object obj = this.labelIds_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.labelIds_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setLabelIds(String str) {
                if (str != null) {
                    this.labelIds_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearLabelIds() {
                this.labelIds_ = CmdData2036.getDefaultInstance().getLabelIds();
                onChanged();
                return this;
            }

            public Builder setLabelIdsBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2036.checkByteStringIsUtf8(byteString);
                    this.labelIds_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getLabelNames() {
                Object obj = this.labelNames_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.labelNames_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getLabelNamesBytes() {
                Object obj = this.labelNames_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.labelNames_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setLabelNames(String str) {
                if (str != null) {
                    this.labelNames_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearLabelNames() {
                this.labelNames_ = CmdData2036.getDefaultInstance().getLabelNames();
                onChanged();
                return this;
            }

            public Builder setLabelNamesBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2036.checkByteStringIsUtf8(byteString);
                    this.labelNames_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getNickname() {
                Object obj = this.nickname_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.nickname_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getNicknameBytes() {
                Object obj = this.nickname_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.nickname_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setNickname(String str) {
                if (str != null) {
                    this.nickname_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearNickname() {
                this.nickname_ = CmdData2036.getDefaultInstance().getNickname();
                onChanged();
                return this;
            }

            public Builder setNicknameBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2036.checkByteStringIsUtf8(byteString);
                    this.nickname_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getSignature() {
                Object obj = this.signature_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.signature_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getSignatureBytes() {
                Object obj = this.signature_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.signature_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setSignature(String str) {
                if (str != null) {
                    this.signature_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearSignature() {
                this.signature_ = CmdData2036.getDefaultInstance().getSignature();
                onChanged();
                return this;
            }

            public Builder setSignatureBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2036.checkByteStringIsUtf8(byteString);
                    this.signature_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getSmallHeadImage() {
                Object obj = this.smallHeadImage_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.smallHeadImage_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getSmallHeadImageBytes() {
                Object obj = this.smallHeadImage_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.smallHeadImage_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setSmallHeadImage(String str) {
                if (str != null) {
                    this.smallHeadImage_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearSmallHeadImage() {
                this.smallHeadImage_ = CmdData2036.getDefaultInstance().getSmallHeadImage();
                onChanged();
                return this;
            }

            public Builder setSmallHeadImageBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2036.checkByteStringIsUtf8(byteString);
                    this.smallHeadImage_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getBigHeadImage() {
                Object obj = this.bigHeadImage_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.bigHeadImage_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getBigHeadImageBytes() {
                Object obj = this.bigHeadImage_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.bigHeadImage_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setBigHeadImage(String str) {
                if (str != null) {
                    this.bigHeadImage_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearBigHeadImage() {
                this.bigHeadImage_ = CmdData2036.getDefaultInstance().getBigHeadImage();
                onChanged();
                return this;
            }

            public Builder setBigHeadImageBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2036.checkByteStringIsUtf8(byteString);
                    this.bigHeadImage_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getDesc() {
                Object obj = this.desc_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.desc_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getDescBytes() {
                Object obj = this.desc_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.desc_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setDesc(String str) {
                if (str != null) {
                    this.desc_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearDesc() {
                this.desc_ = CmdData2036.getDefaultInstance().getDesc();
                onChanged();
                return this;
            }

            public Builder setDescBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2036.checkByteStringIsUtf8(byteString);
                    this.desc_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getTel() {
                Object obj = this.tel_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.tel_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getTelBytes() {
                Object obj = this.tel_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.tel_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setTel(String str) {
                if (str != null) {
                    this.tel_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearTel() {
                this.tel_ = CmdData2036.getDefaultInstance().getTel();
                onChanged();
                return this;
            }

            public Builder setTelBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2036.checkByteStringIsUtf8(byteString);
                    this.tel_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getAttachPic() {
                Object obj = this.attachPic_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.attachPic_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getAttachPicBytes() {
                Object obj = this.attachPic_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.attachPic_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setAttachPic(String str) {
                if (str != null) {
                    this.attachPic_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearAttachPic() {
                this.attachPic_ = CmdData2036.getDefaultInstance().getAttachPic();
                onChanged();
                return this;
            }

            public Builder setAttachPicBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2036.checkByteStringIsUtf8(byteString);
                    this.attachPic_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static CmdData2036 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<CmdData2036> parser() {
            return PARSER;
        }

        public Parser<CmdData2036> getParserForType() {
            return PARSER;
        }

        public CmdData2036 getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class CmdData2067 extends GeneratedMessageV3 implements CmdData2067OrBuilder {
        public static final int DATE_FIELD_NUMBER = 1;
        private static final CmdData2067 DEFAULT_INSTANCE = new CmdData2067();
        public static final int ID_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final Parser<CmdData2067> PARSER = new AbstractParser<CmdData2067>() {
            public CmdData2067 parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new CmdData2067(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int RESULT_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public volatile Object date_;
        /* access modifiers changed from: private */
        public long id_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public volatile Object result_;

        private CmdData2067(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private CmdData2067() {
            this.memoizedIsInitialized = -1;
            this.date_ = "";
            this.id_ = 0;
            this.result_ = "";
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private CmdData2067(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.date_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 16) {
                                this.id_ = codedInputStream.readInt64();
                            } else if (readTag == 26) {
                                this.result_ = codedInputStream.readStringRequireUtf8();
                            } else if (!parseUnknownFieldProto3(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw null;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2067_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2067_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData2067.class, Builder.class);
        }

        public String getDate() {
            Object obj = this.date_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.date_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getDateBytes() {
            Object obj = this.date_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.date_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public long getId() {
            return this.id_;
        }

        public String getResult() {
            Object obj = this.result_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.result_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getResultBytes() {
            Object obj = this.result_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.result_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getDateBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.date_);
            }
            long j = this.id_;
            if (j != 0) {
                codedOutputStream.writeInt64(2, j);
            }
            if (!getResultBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.result_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!getDateBytes().isEmpty()) {
                i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.date_);
            }
            long j = this.id_;
            if (j != 0) {
                i2 += CodedOutputStream.computeInt64Size(2, j);
            }
            if (!getResultBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(3, this.result_);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CmdData2067)) {
                return super.equals(obj);
            }
            CmdData2067 cmdData2067 = (CmdData2067) obj;
            if (!(((getDate().equals(cmdData2067.getDate())) && (getId() > cmdData2067.getId() ? 1 : (getId() == cmdData2067.getId() ? 0 : -1)) == 0) && getResult().equals(cmdData2067.getResult())) || !this.unknownFields.equals(cmdData2067.unknownFields)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getDate().hashCode()) * 37) + 2) * 53) + Internal.hashLong(getId())) * 37) + 3) * 53) + getResult().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public static CmdData2067 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static CmdData2067 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static CmdData2067 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static CmdData2067 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CmdData2067 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static CmdData2067 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CmdData2067 parseFrom(InputStream inputStream) throws IOException {
            return (CmdData2067) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CmdData2067 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2067) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData2067 parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CmdData2067) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CmdData2067 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2067) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData2067 parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CmdData2067) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CmdData2067 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2067) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(CmdData2067 cmdData2067) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cmdData2067);
        }

        public Builder toBuilder() {
            if (this == DEFAULT_INSTANCE) {
                return new Builder();
            }
            return new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CmdData2067OrBuilder {
            private Object date_;
            private long id_;
            private Object result_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2067_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2067_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData2067.class, Builder.class);
            }

            private Builder() {
                this.date_ = "";
                this.result_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.date_ = "";
                this.result_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = CmdData2067.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                this.date_ = "";
                this.id_ = 0;
                this.result_ = "";
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2067_descriptor;
            }

            public CmdData2067 getDefaultInstanceForType() {
                return CmdData2067.getDefaultInstance();
            }

            public CmdData2067 build() {
                CmdData2067 buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public CmdData2067 buildPartial() {
                CmdData2067 cmdData2067 = new CmdData2067((GeneratedMessageV3.Builder) this);
                Object unused = cmdData2067.date_ = this.date_;
                long unused2 = cmdData2067.id_ = this.id_;
                Object unused3 = cmdData2067.result_ = this.result_;
                onBuilt();
                return cmdData2067;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder mergeFrom(Message message) {
                if (message instanceof CmdData2067) {
                    return mergeFrom((CmdData2067) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CmdData2067 cmdData2067) {
                if (cmdData2067 == CmdData2067.getDefaultInstance()) {
                    return this;
                }
                if (!cmdData2067.getDate().isEmpty()) {
                    this.date_ = cmdData2067.date_;
                    onChanged();
                }
                if (cmdData2067.getId() != 0) {
                    setId(cmdData2067.getId());
                }
                if (!cmdData2067.getResult().isEmpty()) {
                    this.result_ = cmdData2067.result_;
                    onChanged();
                }
                mergeUnknownFields(cmdData2067.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.xp.wx.middleware.MsgProtos.CmdData2067.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.xp.wx.middleware.MsgProtos.CmdData2067.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.xp.wx.middleware.MsgProtos$CmdData2067 r3 = (com.xp.wx.middleware.MsgProtos.CmdData2067) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData2067) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.xp.wx.middleware.MsgProtos$CmdData2067 r4 = (com.xp.wx.middleware.MsgProtos.CmdData2067) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData2067) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.middleware.MsgProtos.CmdData2067.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.xp.wx.middleware.MsgProtos$CmdData2067$Builder");
            }

            public String getDate() {
                Object obj = this.date_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.date_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getDateBytes() {
                Object obj = this.date_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.date_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setDate(String str) {
                if (str != null) {
                    this.date_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearDate() {
                this.date_ = CmdData2067.getDefaultInstance().getDate();
                onChanged();
                return this;
            }

            public Builder setDateBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2067.checkByteStringIsUtf8(byteString);
                    this.date_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public long getId() {
                return this.id_;
            }

            public Builder setId(long j) {
                this.id_ = j;
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.id_ = 0;
                onChanged();
                return this;
            }

            public String getResult() {
                Object obj = this.result_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.result_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getResultBytes() {
                Object obj = this.result_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.result_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setResult(String str) {
                if (str != null) {
                    this.result_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearResult() {
                this.result_ = CmdData2067.getDefaultInstance().getResult();
                onChanged();
                return this;
            }

            public Builder setResultBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2067.checkByteStringIsUtf8(byteString);
                    this.result_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static CmdData2067 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<CmdData2067> parser() {
            return PARSER;
        }

        public Parser<CmdData2067> getParserForType() {
            return PARSER;
        }

        public CmdData2067 getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class CmdData2068 extends GeneratedMessageV3 implements CmdData2068OrBuilder {
        private static final CmdData2068 DEFAULT_INSTANCE = new CmdData2068();
        /* access modifiers changed from: private */
        public static final Parser<CmdData2068> PARSER = new AbstractParser<CmdData2068>() {
            public CmdData2068 parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new CmdData2068(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int QRCODE_FIELD_NUMBER = 2;
        public static final int ROOMID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public volatile Object qrcode_;
        /* access modifiers changed from: private */
        public volatile Object roomId_;

        private CmdData2068(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private CmdData2068() {
            this.memoizedIsInitialized = -1;
            this.roomId_ = "";
            this.qrcode_ = "";
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private CmdData2068(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.roomId_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.qrcode_ = codedInputStream.readStringRequireUtf8();
                            } else if (!parseUnknownFieldProto3(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw null;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2068_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2068_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData2068.class, Builder.class);
        }

        public String getRoomId() {
            Object obj = this.roomId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.roomId_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getRoomIdBytes() {
            Object obj = this.roomId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.roomId_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getQrcode() {
            Object obj = this.qrcode_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.qrcode_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getQrcodeBytes() {
            Object obj = this.qrcode_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.qrcode_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getRoomIdBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.roomId_);
            }
            if (!getQrcodeBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.qrcode_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!getRoomIdBytes().isEmpty()) {
                i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.roomId_);
            }
            if (!getQrcodeBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(2, this.qrcode_);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CmdData2068)) {
                return super.equals(obj);
            }
            CmdData2068 cmdData2068 = (CmdData2068) obj;
            if (!((getRoomId().equals(cmdData2068.getRoomId())) && getQrcode().equals(cmdData2068.getQrcode())) || !this.unknownFields.equals(cmdData2068.unknownFields)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getRoomId().hashCode()) * 37) + 2) * 53) + getQrcode().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public static CmdData2068 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static CmdData2068 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static CmdData2068 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static CmdData2068 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CmdData2068 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static CmdData2068 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CmdData2068 parseFrom(InputStream inputStream) throws IOException {
            return (CmdData2068) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CmdData2068 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2068) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData2068 parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CmdData2068) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CmdData2068 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2068) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData2068 parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CmdData2068) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CmdData2068 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData2068) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(CmdData2068 cmdData2068) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cmdData2068);
        }

        public Builder toBuilder() {
            if (this == DEFAULT_INSTANCE) {
                return new Builder();
            }
            return new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CmdData2068OrBuilder {
            private Object qrcode_;
            private Object roomId_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2068_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2068_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData2068.class, Builder.class);
            }

            private Builder() {
                this.roomId_ = "";
                this.qrcode_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.roomId_ = "";
                this.qrcode_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = CmdData2068.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                this.roomId_ = "";
                this.qrcode_ = "";
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData2068_descriptor;
            }

            public CmdData2068 getDefaultInstanceForType() {
                return CmdData2068.getDefaultInstance();
            }

            public CmdData2068 build() {
                CmdData2068 buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public CmdData2068 buildPartial() {
                CmdData2068 cmdData2068 = new CmdData2068((GeneratedMessageV3.Builder) this);
                Object unused = cmdData2068.roomId_ = this.roomId_;
                Object unused2 = cmdData2068.qrcode_ = this.qrcode_;
                onBuilt();
                return cmdData2068;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder mergeFrom(Message message) {
                if (message instanceof CmdData2068) {
                    return mergeFrom((CmdData2068) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CmdData2068 cmdData2068) {
                if (cmdData2068 == CmdData2068.getDefaultInstance()) {
                    return this;
                }
                if (!cmdData2068.getRoomId().isEmpty()) {
                    this.roomId_ = cmdData2068.roomId_;
                    onChanged();
                }
                if (!cmdData2068.getQrcode().isEmpty()) {
                    this.qrcode_ = cmdData2068.qrcode_;
                    onChanged();
                }
                mergeUnknownFields(cmdData2068.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.xp.wx.middleware.MsgProtos.CmdData2068.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.xp.wx.middleware.MsgProtos.CmdData2068.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.xp.wx.middleware.MsgProtos$CmdData2068 r3 = (com.xp.wx.middleware.MsgProtos.CmdData2068) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData2068) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.xp.wx.middleware.MsgProtos$CmdData2068 r4 = (com.xp.wx.middleware.MsgProtos.CmdData2068) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData2068) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.middleware.MsgProtos.CmdData2068.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.xp.wx.middleware.MsgProtos$CmdData2068$Builder");
            }

            public String getRoomId() {
                Object obj = this.roomId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.roomId_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getRoomIdBytes() {
                Object obj = this.roomId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.roomId_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setRoomId(String str) {
                if (str != null) {
                    this.roomId_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearRoomId() {
                this.roomId_ = CmdData2068.getDefaultInstance().getRoomId();
                onChanged();
                return this;
            }

            public Builder setRoomIdBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2068.checkByteStringIsUtf8(byteString);
                    this.roomId_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getQrcode() {
                Object obj = this.qrcode_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.qrcode_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getQrcodeBytes() {
                Object obj = this.qrcode_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.qrcode_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setQrcode(String str) {
                if (str != null) {
                    this.qrcode_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearQrcode() {
                this.qrcode_ = CmdData2068.getDefaultInstance().getQrcode();
                onChanged();
                return this;
            }

            public Builder setQrcodeBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData2068.checkByteStringIsUtf8(byteString);
                    this.qrcode_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static CmdData2068 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<CmdData2068> parser() {
            return PARSER;
        }

        public Parser<CmdData2068> getParserForType() {
            return PARSER;
        }

        public CmdData2068 getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class CmdData4001 extends GeneratedMessageV3 implements CmdData4001OrBuilder {
        private static final CmdData4001 DEFAULT_INSTANCE = new CmdData4001();
        public static final int ID_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final Parser<CmdData4001> PARSER = new AbstractParser<CmdData4001>() {
            public CmdData4001 parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new CmdData4001(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public volatile Object id_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public int status_;

        private CmdData4001(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private CmdData4001() {
            this.memoizedIsInitialized = -1;
            this.status_ = 0;
            this.id_ = "";
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private CmdData4001(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.status_ = codedInputStream.readInt32();
                            } else if (readTag == 18) {
                                this.id_ = codedInputStream.readStringRequireUtf8();
                            } else if (!parseUnknownFieldProto3(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw null;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData4001_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData4001_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData4001.class, Builder.class);
        }

        public int getStatus() {
            return this.status_;
        }

        public String getId() {
            Object obj = this.id_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.id_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.status_;
            if (i != 0) {
                codedOutputStream.writeInt32(1, i);
            }
            if (!getIdBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.id_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            int i3 = this.status_;
            if (i3 != 0) {
                i2 = 0 + CodedOutputStream.computeInt32Size(1, i3);
            }
            if (!getIdBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(2, this.id_);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CmdData4001)) {
                return super.equals(obj);
            }
            CmdData4001 cmdData4001 = (CmdData4001) obj;
            if (!((getStatus() == cmdData4001.getStatus()) && getId().equals(cmdData4001.getId())) || !this.unknownFields.equals(cmdData4001.unknownFields)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getStatus()) * 37) + 2) * 53) + getId().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public static CmdData4001 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static CmdData4001 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static CmdData4001 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static CmdData4001 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CmdData4001 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static CmdData4001 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CmdData4001 parseFrom(InputStream inputStream) throws IOException {
            return (CmdData4001) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CmdData4001 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData4001) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData4001 parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CmdData4001) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CmdData4001 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData4001) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData4001 parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CmdData4001) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CmdData4001 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData4001) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(CmdData4001 cmdData4001) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cmdData4001);
        }

        public Builder toBuilder() {
            if (this == DEFAULT_INSTANCE) {
                return new Builder();
            }
            return new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CmdData4001OrBuilder {
            private Object id_;
            private int status_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData4001_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData4001_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData4001.class, Builder.class);
            }

            private Builder() {
                this.id_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.id_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = CmdData4001.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                this.status_ = 0;
                this.id_ = "";
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData4001_descriptor;
            }

            public CmdData4001 getDefaultInstanceForType() {
                return CmdData4001.getDefaultInstance();
            }

            public CmdData4001 build() {
                CmdData4001 buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public CmdData4001 buildPartial() {
                CmdData4001 cmdData4001 = new CmdData4001((GeneratedMessageV3.Builder) this);
                int unused = cmdData4001.status_ = this.status_;
                Object unused2 = cmdData4001.id_ = this.id_;
                onBuilt();
                return cmdData4001;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder mergeFrom(Message message) {
                if (message instanceof CmdData4001) {
                    return mergeFrom((CmdData4001) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CmdData4001 cmdData4001) {
                if (cmdData4001 == CmdData4001.getDefaultInstance()) {
                    return this;
                }
                if (cmdData4001.getStatus() != 0) {
                    setStatus(cmdData4001.getStatus());
                }
                if (!cmdData4001.getId().isEmpty()) {
                    this.id_ = cmdData4001.id_;
                    onChanged();
                }
                mergeUnknownFields(cmdData4001.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.xp.wx.middleware.MsgProtos.CmdData4001.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.xp.wx.middleware.MsgProtos.CmdData4001.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.xp.wx.middleware.MsgProtos$CmdData4001 r3 = (com.xp.wx.middleware.MsgProtos.CmdData4001) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData4001) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.xp.wx.middleware.MsgProtos$CmdData4001 r4 = (com.xp.wx.middleware.MsgProtos.CmdData4001) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData4001) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.middleware.MsgProtos.CmdData4001.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.xp.wx.middleware.MsgProtos$CmdData4001$Builder");
            }

            public int getStatus() {
                return this.status_;
            }

            public Builder setStatus(int i) {
                this.status_ = i;
                onChanged();
                return this;
            }

            public Builder clearStatus() {
                this.status_ = 0;
                onChanged();
                return this;
            }

            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setId(String str) {
                if (str != null) {
                    this.id_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearId() {
                this.id_ = CmdData4001.getDefaultInstance().getId();
                onChanged();
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData4001.checkByteStringIsUtf8(byteString);
                    this.id_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static CmdData4001 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<CmdData4001> parser() {
            return PARSER;
        }

        public Parser<CmdData4001> getParserForType() {
            return PARSER;
        }

        public CmdData4001 getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class CmdData4003 extends GeneratedMessageV3 implements CmdData4003OrBuilder {
        private static final CmdData4003 DEFAULT_INSTANCE = new CmdData4003();
        /* access modifiers changed from: private */
        public static final Parser<CmdData4003> PARSER = new AbstractParser<CmdData4003>() {
            public CmdData4003 parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new CmdData4003(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int ROOMID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public LazyStringList roomId_;

        private CmdData4003(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private CmdData4003() {
            this.memoizedIsInitialized = -1;
            this.roomId_ = LazyStringArrayList.EMPTY;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private CmdData4003(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                boolean z2 = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                if (!z2 || !true) {
                                    this.roomId_ = new LazyStringArrayList();
                                    z2 |= true;
                                }
                                this.roomId_.add(readStringRequireUtf8);
                            } else if (!parseUnknownFieldProto3(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        if (z2 && true) {
                            this.roomId_ = this.roomId_.getUnmodifiableView();
                        }
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if (z2 && true) {
                    this.roomId_ = this.roomId_.getUnmodifiableView();
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw null;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData4003_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData4003_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData4003.class, Builder.class);
        }

        public ProtocolStringList getRoomIdList() {
            return this.roomId_;
        }

        public int getRoomIdCount() {
            return this.roomId_.size();
        }

        public String getRoomId(int i) {
            return (String) this.roomId_.get(i);
        }

        public ByteString getRoomIdBytes(int i) {
            return this.roomId_.getByteString(i);
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.roomId_.size(); i++) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.roomId_.getRaw(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.roomId_.size(); i3++) {
                i2 += computeStringSizeNoTag(this.roomId_.getRaw(i3));
            }
            int size = 0 + i2 + (getRoomIdList().size() * 1) + this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CmdData4003)) {
                return super.equals(obj);
            }
            CmdData4003 cmdData4003 = (CmdData4003) obj;
            if (!(getRoomIdList().equals(cmdData4003.getRoomIdList())) || !this.unknownFields.equals(cmdData4003.unknownFields)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = 779 + getDescriptor().hashCode();
            if (getRoomIdCount() > 0) {
                hashCode = (((hashCode * 37) + 1) * 53) + getRoomIdList().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public static CmdData4003 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static CmdData4003 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static CmdData4003 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static CmdData4003 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CmdData4003 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static CmdData4003 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CmdData4003 parseFrom(InputStream inputStream) throws IOException {
            return (CmdData4003) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CmdData4003 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData4003) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData4003 parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CmdData4003) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CmdData4003 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData4003) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData4003 parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CmdData4003) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CmdData4003 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData4003) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(CmdData4003 cmdData4003) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cmdData4003);
        }

        public Builder toBuilder() {
            if (this == DEFAULT_INSTANCE) {
                return new Builder();
            }
            return new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CmdData4003OrBuilder {
            private int bitField0_;
            private LazyStringList roomId_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData4003_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData4003_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData4003.class, Builder.class);
            }

            private Builder() {
                this.roomId_ = LazyStringArrayList.EMPTY;
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.roomId_ = LazyStringArrayList.EMPTY;
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = CmdData4003.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                this.roomId_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -2;
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData4003_descriptor;
            }

            public CmdData4003 getDefaultInstanceForType() {
                return CmdData4003.getDefaultInstance();
            }

            public CmdData4003 build() {
                CmdData4003 buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public CmdData4003 buildPartial() {
                CmdData4003 cmdData4003 = new CmdData4003((GeneratedMessageV3.Builder) this);
                if ((this.bitField0_ & 1) == 1) {
                    this.roomId_ = this.roomId_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                LazyStringList unused = cmdData4003.roomId_ = this.roomId_;
                onBuilt();
                return cmdData4003;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder mergeFrom(Message message) {
                if (message instanceof CmdData4003) {
                    return mergeFrom((CmdData4003) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CmdData4003 cmdData4003) {
                if (cmdData4003 == CmdData4003.getDefaultInstance()) {
                    return this;
                }
                if (!cmdData4003.roomId_.isEmpty()) {
                    if (this.roomId_.isEmpty()) {
                        this.roomId_ = cmdData4003.roomId_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureRoomIdIsMutable();
                        this.roomId_.addAll(cmdData4003.roomId_);
                    }
                    onChanged();
                }
                mergeUnknownFields(cmdData4003.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.xp.wx.middleware.MsgProtos.CmdData4003.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.xp.wx.middleware.MsgProtos.CmdData4003.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.xp.wx.middleware.MsgProtos$CmdData4003 r3 = (com.xp.wx.middleware.MsgProtos.CmdData4003) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData4003) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.xp.wx.middleware.MsgProtos$CmdData4003 r4 = (com.xp.wx.middleware.MsgProtos.CmdData4003) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData4003) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.middleware.MsgProtos.CmdData4003.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.xp.wx.middleware.MsgProtos$CmdData4003$Builder");
            }

            private void ensureRoomIdIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.roomId_ = new LazyStringArrayList(this.roomId_);
                    this.bitField0_ |= 1;
                }
            }

            public ProtocolStringList getRoomIdList() {
                return this.roomId_.getUnmodifiableView();
            }

            public int getRoomIdCount() {
                return this.roomId_.size();
            }

            public String getRoomId(int i) {
                return (String) this.roomId_.get(i);
            }

            public ByteString getRoomIdBytes(int i) {
                return this.roomId_.getByteString(i);
            }

            public Builder setRoomId(int i, String str) {
                if (str != null) {
                    ensureRoomIdIsMutable();
                    this.roomId_.set(i, str);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addRoomId(String str) {
                if (str != null) {
                    ensureRoomIdIsMutable();
                    this.roomId_.add(str);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addAllRoomId(Iterable<String> iterable) {
                ensureRoomIdIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.roomId_);
                onChanged();
                return this;
            }

            public Builder clearRoomId() {
                this.roomId_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder addRoomIdBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData4003.checkByteStringIsUtf8(byteString);
                    ensureRoomIdIsMutable();
                    this.roomId_.add(byteString);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static CmdData4003 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<CmdData4003> parser() {
            return PARSER;
        }

        public Parser<CmdData4003> getParserForType() {
            return PARSER;
        }

        public CmdData4003 getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class CmdData4005 extends GeneratedMessageV3 implements CmdData4005OrBuilder {
        public static final int ACTIVITYID_FIELD_NUMBER = 1;
        private static final CmdData4005 DEFAULT_INSTANCE = new CmdData4005();
        public static final int ISINVITEROOM_FIELD_NUMBER = 6;
        /* access modifiers changed from: private */
        public static final Parser<CmdData4005> PARSER = new AbstractParser<CmdData4005>() {
            public CmdData4005 parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new CmdData4005(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int SUPERIORNICKNAME_FIELD_NUMBER = 3;
        public static final int SUPERIORUSERNAME_FIELD_NUMBER = 2;
        public static final int SUPPORTCOUNT_FIELD_NUMBER = 4;
        public static final int SUPPORTNICKNAME_FIELD_NUMBER = 5;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public volatile Object activityId_;
        /* access modifiers changed from: private */
        public int isInviteRoom_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public volatile Object superiorNickname_;
        /* access modifiers changed from: private */
        public volatile Object superiorUsername_;
        /* access modifiers changed from: private */
        public int supportCount_;
        /* access modifiers changed from: private */
        public volatile Object supportNickname_;

        private CmdData4005(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private CmdData4005() {
            this.memoizedIsInitialized = -1;
            this.activityId_ = "";
            this.superiorUsername_ = "";
            this.superiorNickname_ = "";
            this.supportCount_ = 0;
            this.supportNickname_ = "";
            this.isInviteRoom_ = 0;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private CmdData4005(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.activityId_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.superiorUsername_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                this.superiorNickname_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 32) {
                                this.supportCount_ = codedInputStream.readInt32();
                            } else if (readTag == 42) {
                                this.supportNickname_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 48) {
                                this.isInviteRoom_ = codedInputStream.readInt32();
                            } else if (!parseUnknownFieldProto3(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw null;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData4005_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData4005_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData4005.class, Builder.class);
        }

        public String getActivityId() {
            Object obj = this.activityId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.activityId_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getActivityIdBytes() {
            Object obj = this.activityId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.activityId_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getSuperiorUsername() {
            Object obj = this.superiorUsername_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.superiorUsername_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getSuperiorUsernameBytes() {
            Object obj = this.superiorUsername_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.superiorUsername_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getSuperiorNickname() {
            Object obj = this.superiorNickname_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.superiorNickname_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getSuperiorNicknameBytes() {
            Object obj = this.superiorNickname_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.superiorNickname_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public int getSupportCount() {
            return this.supportCount_;
        }

        public String getSupportNickname() {
            Object obj = this.supportNickname_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.supportNickname_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getSupportNicknameBytes() {
            Object obj = this.supportNickname_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.supportNickname_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public int getIsInviteRoom() {
            return this.isInviteRoom_;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getActivityIdBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.activityId_);
            }
            if (!getSuperiorUsernameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.superiorUsername_);
            }
            if (!getSuperiorNicknameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.superiorNickname_);
            }
            int i = this.supportCount_;
            if (i != 0) {
                codedOutputStream.writeInt32(4, i);
            }
            if (!getSupportNicknameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 5, this.supportNickname_);
            }
            int i2 = this.isInviteRoom_;
            if (i2 != 0) {
                codedOutputStream.writeInt32(6, i2);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!getActivityIdBytes().isEmpty()) {
                i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.activityId_);
            }
            if (!getSuperiorUsernameBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(2, this.superiorUsername_);
            }
            if (!getSuperiorNicknameBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(3, this.superiorNickname_);
            }
            int i3 = this.supportCount_;
            if (i3 != 0) {
                i2 += CodedOutputStream.computeInt32Size(4, i3);
            }
            if (!getSupportNicknameBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(5, this.supportNickname_);
            }
            int i4 = this.isInviteRoom_;
            if (i4 != 0) {
                i2 += CodedOutputStream.computeInt32Size(6, i4);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CmdData4005)) {
                return super.equals(obj);
            }
            CmdData4005 cmdData4005 = (CmdData4005) obj;
            if (!((((((getActivityId().equals(cmdData4005.getActivityId())) && getSuperiorUsername().equals(cmdData4005.getSuperiorUsername())) && getSuperiorNickname().equals(cmdData4005.getSuperiorNickname())) && getSupportCount() == cmdData4005.getSupportCount()) && getSupportNickname().equals(cmdData4005.getSupportNickname())) && getIsInviteRoom() == cmdData4005.getIsInviteRoom()) || !this.unknownFields.equals(cmdData4005.unknownFields)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getActivityId().hashCode()) * 37) + 2) * 53) + getSuperiorUsername().hashCode()) * 37) + 3) * 53) + getSuperiorNickname().hashCode()) * 37) + 4) * 53) + getSupportCount()) * 37) + 5) * 53) + getSupportNickname().hashCode()) * 37) + 6) * 53) + getIsInviteRoom()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public static CmdData4005 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static CmdData4005 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static CmdData4005 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static CmdData4005 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CmdData4005 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static CmdData4005 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CmdData4005 parseFrom(InputStream inputStream) throws IOException {
            return (CmdData4005) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CmdData4005 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData4005) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData4005 parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CmdData4005) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CmdData4005 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData4005) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData4005 parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CmdData4005) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CmdData4005 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData4005) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(CmdData4005 cmdData4005) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cmdData4005);
        }

        public Builder toBuilder() {
            if (this == DEFAULT_INSTANCE) {
                return new Builder();
            }
            return new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CmdData4005OrBuilder {
            private Object activityId_;
            private int isInviteRoom_;
            private Object superiorNickname_;
            private Object superiorUsername_;
            private int supportCount_;
            private Object supportNickname_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData4005_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData4005_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData4005.class, Builder.class);
            }

            private Builder() {
                this.activityId_ = "";
                this.superiorUsername_ = "";
                this.superiorNickname_ = "";
                this.supportNickname_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.activityId_ = "";
                this.superiorUsername_ = "";
                this.superiorNickname_ = "";
                this.supportNickname_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = CmdData4005.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                this.activityId_ = "";
                this.superiorUsername_ = "";
                this.superiorNickname_ = "";
                this.supportCount_ = 0;
                this.supportNickname_ = "";
                this.isInviteRoom_ = 0;
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData4005_descriptor;
            }

            public CmdData4005 getDefaultInstanceForType() {
                return CmdData4005.getDefaultInstance();
            }

            public CmdData4005 build() {
                CmdData4005 buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public CmdData4005 buildPartial() {
                CmdData4005 cmdData4005 = new CmdData4005((GeneratedMessageV3.Builder) this);
                Object unused = cmdData4005.activityId_ = this.activityId_;
                Object unused2 = cmdData4005.superiorUsername_ = this.superiorUsername_;
                Object unused3 = cmdData4005.superiorNickname_ = this.superiorNickname_;
                int unused4 = cmdData4005.supportCount_ = this.supportCount_;
                Object unused5 = cmdData4005.supportNickname_ = this.supportNickname_;
                int unused6 = cmdData4005.isInviteRoom_ = this.isInviteRoom_;
                onBuilt();
                return cmdData4005;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder mergeFrom(Message message) {
                if (message instanceof CmdData4005) {
                    return mergeFrom((CmdData4005) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CmdData4005 cmdData4005) {
                if (cmdData4005 == CmdData4005.getDefaultInstance()) {
                    return this;
                }
                if (!cmdData4005.getActivityId().isEmpty()) {
                    this.activityId_ = cmdData4005.activityId_;
                    onChanged();
                }
                if (!cmdData4005.getSuperiorUsername().isEmpty()) {
                    this.superiorUsername_ = cmdData4005.superiorUsername_;
                    onChanged();
                }
                if (!cmdData4005.getSuperiorNickname().isEmpty()) {
                    this.superiorNickname_ = cmdData4005.superiorNickname_;
                    onChanged();
                }
                if (cmdData4005.getSupportCount() != 0) {
                    setSupportCount(cmdData4005.getSupportCount());
                }
                if (!cmdData4005.getSupportNickname().isEmpty()) {
                    this.supportNickname_ = cmdData4005.supportNickname_;
                    onChanged();
                }
                if (cmdData4005.getIsInviteRoom() != 0) {
                    setIsInviteRoom(cmdData4005.getIsInviteRoom());
                }
                mergeUnknownFields(cmdData4005.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.xp.wx.middleware.MsgProtos.CmdData4005.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.xp.wx.middleware.MsgProtos.CmdData4005.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.xp.wx.middleware.MsgProtos$CmdData4005 r3 = (com.xp.wx.middleware.MsgProtos.CmdData4005) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData4005) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.xp.wx.middleware.MsgProtos$CmdData4005 r4 = (com.xp.wx.middleware.MsgProtos.CmdData4005) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData4005) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.middleware.MsgProtos.CmdData4005.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.xp.wx.middleware.MsgProtos$CmdData4005$Builder");
            }

            public String getActivityId() {
                Object obj = this.activityId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.activityId_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getActivityIdBytes() {
                Object obj = this.activityId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.activityId_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setActivityId(String str) {
                if (str != null) {
                    this.activityId_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearActivityId() {
                this.activityId_ = CmdData4005.getDefaultInstance().getActivityId();
                onChanged();
                return this;
            }

            public Builder setActivityIdBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData4005.checkByteStringIsUtf8(byteString);
                    this.activityId_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getSuperiorUsername() {
                Object obj = this.superiorUsername_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.superiorUsername_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getSuperiorUsernameBytes() {
                Object obj = this.superiorUsername_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.superiorUsername_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setSuperiorUsername(String str) {
                if (str != null) {
                    this.superiorUsername_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearSuperiorUsername() {
                this.superiorUsername_ = CmdData4005.getDefaultInstance().getSuperiorUsername();
                onChanged();
                return this;
            }

            public Builder setSuperiorUsernameBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData4005.checkByteStringIsUtf8(byteString);
                    this.superiorUsername_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getSuperiorNickname() {
                Object obj = this.superiorNickname_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.superiorNickname_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getSuperiorNicknameBytes() {
                Object obj = this.superiorNickname_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.superiorNickname_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setSuperiorNickname(String str) {
                if (str != null) {
                    this.superiorNickname_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearSuperiorNickname() {
                this.superiorNickname_ = CmdData4005.getDefaultInstance().getSuperiorNickname();
                onChanged();
                return this;
            }

            public Builder setSuperiorNicknameBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData4005.checkByteStringIsUtf8(byteString);
                    this.superiorNickname_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public int getSupportCount() {
                return this.supportCount_;
            }

            public Builder setSupportCount(int i) {
                this.supportCount_ = i;
                onChanged();
                return this;
            }

            public Builder clearSupportCount() {
                this.supportCount_ = 0;
                onChanged();
                return this;
            }

            public String getSupportNickname() {
                Object obj = this.supportNickname_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.supportNickname_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getSupportNicknameBytes() {
                Object obj = this.supportNickname_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.supportNickname_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setSupportNickname(String str) {
                if (str != null) {
                    this.supportNickname_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearSupportNickname() {
                this.supportNickname_ = CmdData4005.getDefaultInstance().getSupportNickname();
                onChanged();
                return this;
            }

            public Builder setSupportNicknameBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData4005.checkByteStringIsUtf8(byteString);
                    this.supportNickname_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public int getIsInviteRoom() {
                return this.isInviteRoom_;
            }

            public Builder setIsInviteRoom(int i) {
                this.isInviteRoom_ = i;
                onChanged();
                return this;
            }

            public Builder clearIsInviteRoom() {
                this.isInviteRoom_ = 0;
                onChanged();
                return this;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static CmdData4005 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<CmdData4005> parser() {
            return PARSER;
        }

        public Parser<CmdData4005> getParserForType() {
            return PARSER;
        }

        public CmdData4005 getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class CmdData1002 extends GeneratedMessageV3 implements CmdData1002OrBuilder {
        public static final int ALIAS_FIELD_NUMBER = 10;
        public static final int CITY_FIELD_NUMBER = 7;
        public static final int COUNTRY_FIELD_NUMBER = 5;
        private static final CmdData1002 DEFAULT_INSTANCE = new CmdData1002();
        public static final int FROMUSERNAME_FIELD_NUMBER = 1;
        public static final int HEADIMG_FIELD_NUMBER = 12;
        public static final int NICKNAME_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final Parser<CmdData1002> PARSER = new AbstractParser<CmdData1002>() {
            public CmdData1002 parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new CmdData1002(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int PROVINCE_FIELD_NUMBER = 6;
        public static final int SCENE_FIELD_NUMBER = 4;
        public static final int SEX_FIELD_NUMBER = 9;
        public static final int SIGN_FIELD_NUMBER = 8;
        public static final int TICKET_FIELD_NUMBER = 11;
        public static final int VERIFYCONTENT_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public volatile Object alias_;
        /* access modifiers changed from: private */
        public volatile Object city_;
        /* access modifiers changed from: private */
        public volatile Object country_;
        /* access modifiers changed from: private */
        public volatile Object fromUsername_;
        /* access modifiers changed from: private */
        public volatile Object headImg_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public volatile Object nickname_;
        /* access modifiers changed from: private */
        public volatile Object province_;
        /* access modifiers changed from: private */
        public volatile Object scene_;
        /* access modifiers changed from: private */
        public volatile Object sex_;
        /* access modifiers changed from: private */
        public volatile Object sign_;
        /* access modifiers changed from: private */
        public volatile Object ticket_;
        /* access modifiers changed from: private */
        public volatile Object verifyContent_;

        private CmdData1002(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private CmdData1002() {
            this.memoizedIsInitialized = -1;
            this.fromUsername_ = "";
            this.nickname_ = "";
            this.verifyContent_ = "";
            this.scene_ = "";
            this.country_ = "";
            this.province_ = "";
            this.city_ = "";
            this.sign_ = "";
            this.sex_ = "";
            this.alias_ = "";
            this.ticket_ = "";
            this.headImg_ = "";
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private CmdData1002(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        switch (readTag) {
                            case 0:
                                z = true;
                                break;
                            case 10:
                                this.fromUsername_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 18:
                                this.nickname_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 26:
                                this.verifyContent_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 34:
                                this.scene_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 42:
                                this.country_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 50:
                                this.province_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 58:
                                this.city_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 66:
                                this.sign_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 74:
                                this.sex_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 82:
                                this.alias_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 90:
                                this.ticket_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 98:
                                this.headImg_ = codedInputStream.readStringRequireUtf8();
                                break;
                            default:
                                if (parseUnknownFieldProto3(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                    break;
                                }
                                z = true;
                                break;
                        }
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw null;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData1002_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData1002_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData1002.class, Builder.class);
        }

        public String getFromUsername() {
            Object obj = this.fromUsername_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.fromUsername_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getFromUsernameBytes() {
            Object obj = this.fromUsername_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.fromUsername_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getNickname() {
            Object obj = this.nickname_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.nickname_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getNicknameBytes() {
            Object obj = this.nickname_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.nickname_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getVerifyContent() {
            Object obj = this.verifyContent_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.verifyContent_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getVerifyContentBytes() {
            Object obj = this.verifyContent_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.verifyContent_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getScene() {
            Object obj = this.scene_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.scene_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getSceneBytes() {
            Object obj = this.scene_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.scene_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getCountry() {
            Object obj = this.country_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.country_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getCountryBytes() {
            Object obj = this.country_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.country_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getProvince() {
            Object obj = this.province_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.province_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getProvinceBytes() {
            Object obj = this.province_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.province_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getCity() {
            Object obj = this.city_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.city_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getCityBytes() {
            Object obj = this.city_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.city_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getSign() {
            Object obj = this.sign_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sign_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getSignBytes() {
            Object obj = this.sign_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sign_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getSex() {
            Object obj = this.sex_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sex_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getSexBytes() {
            Object obj = this.sex_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sex_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getAlias() {
            Object obj = this.alias_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.alias_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getAliasBytes() {
            Object obj = this.alias_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.alias_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getTicket() {
            Object obj = this.ticket_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ticket_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getTicketBytes() {
            Object obj = this.ticket_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ticket_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getHeadImg() {
            Object obj = this.headImg_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.headImg_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getHeadImgBytes() {
            Object obj = this.headImg_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.headImg_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getFromUsernameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.fromUsername_);
            }
            if (!getNicknameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.nickname_);
            }
            if (!getVerifyContentBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.verifyContent_);
            }
            if (!getSceneBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.scene_);
            }
            if (!getCountryBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 5, this.country_);
            }
            if (!getProvinceBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 6, this.province_);
            }
            if (!getCityBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 7, this.city_);
            }
            if (!getSignBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 8, this.sign_);
            }
            if (!getSexBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 9, this.sex_);
            }
            if (!getAliasBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 10, this.alias_);
            }
            if (!getTicketBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 11, this.ticket_);
            }
            if (!getHeadImgBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 12, this.headImg_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!getFromUsernameBytes().isEmpty()) {
                i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.fromUsername_);
            }
            if (!getNicknameBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(2, this.nickname_);
            }
            if (!getVerifyContentBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(3, this.verifyContent_);
            }
            if (!getSceneBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(4, this.scene_);
            }
            if (!getCountryBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(5, this.country_);
            }
            if (!getProvinceBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(6, this.province_);
            }
            if (!getCityBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(7, this.city_);
            }
            if (!getSignBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(8, this.sign_);
            }
            if (!getSexBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(9, this.sex_);
            }
            if (!getAliasBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(10, this.alias_);
            }
            if (!getTicketBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(11, this.ticket_);
            }
            if (!getHeadImgBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(12, this.headImg_);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CmdData1002)) {
                return super.equals(obj);
            }
            CmdData1002 cmdData1002 = (CmdData1002) obj;
            if (!((((((((((((getFromUsername().equals(cmdData1002.getFromUsername())) && getNickname().equals(cmdData1002.getNickname())) && getVerifyContent().equals(cmdData1002.getVerifyContent())) && getScene().equals(cmdData1002.getScene())) && getCountry().equals(cmdData1002.getCountry())) && getProvince().equals(cmdData1002.getProvince())) && getCity().equals(cmdData1002.getCity())) && getSign().equals(cmdData1002.getSign())) && getSex().equals(cmdData1002.getSex())) && getAlias().equals(cmdData1002.getAlias())) && getTicket().equals(cmdData1002.getTicket())) && getHeadImg().equals(cmdData1002.getHeadImg())) || !this.unknownFields.equals(cmdData1002.unknownFields)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getFromUsername().hashCode()) * 37) + 2) * 53) + getNickname().hashCode()) * 37) + 3) * 53) + getVerifyContent().hashCode()) * 37) + 4) * 53) + getScene().hashCode()) * 37) + 5) * 53) + getCountry().hashCode()) * 37) + 6) * 53) + getProvince().hashCode()) * 37) + 7) * 53) + getCity().hashCode()) * 37) + 8) * 53) + getSign().hashCode()) * 37) + 9) * 53) + getSex().hashCode()) * 37) + 10) * 53) + getAlias().hashCode()) * 37) + 11) * 53) + getTicket().hashCode()) * 37) + 12) * 53) + getHeadImg().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public static CmdData1002 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static CmdData1002 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static CmdData1002 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static CmdData1002 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CmdData1002 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static CmdData1002 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CmdData1002 parseFrom(InputStream inputStream) throws IOException {
            return (CmdData1002) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CmdData1002 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData1002) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData1002 parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CmdData1002) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CmdData1002 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData1002) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData1002 parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CmdData1002) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CmdData1002 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData1002) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(CmdData1002 cmdData1002) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cmdData1002);
        }

        public Builder toBuilder() {
            if (this == DEFAULT_INSTANCE) {
                return new Builder();
            }
            return new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CmdData1002OrBuilder {
            private Object alias_;
            private Object city_;
            private Object country_;
            private Object fromUsername_;
            private Object headImg_;
            private Object nickname_;
            private Object province_;
            private Object scene_;
            private Object sex_;
            private Object sign_;
            private Object ticket_;
            private Object verifyContent_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData1002_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData1002_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData1002.class, Builder.class);
            }

            private Builder() {
                this.fromUsername_ = "";
                this.nickname_ = "";
                this.verifyContent_ = "";
                this.scene_ = "";
                this.country_ = "";
                this.province_ = "";
                this.city_ = "";
                this.sign_ = "";
                this.sex_ = "";
                this.alias_ = "";
                this.ticket_ = "";
                this.headImg_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.fromUsername_ = "";
                this.nickname_ = "";
                this.verifyContent_ = "";
                this.scene_ = "";
                this.country_ = "";
                this.province_ = "";
                this.city_ = "";
                this.sign_ = "";
                this.sex_ = "";
                this.alias_ = "";
                this.ticket_ = "";
                this.headImg_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = CmdData1002.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                this.fromUsername_ = "";
                this.nickname_ = "";
                this.verifyContent_ = "";
                this.scene_ = "";
                this.country_ = "";
                this.province_ = "";
                this.city_ = "";
                this.sign_ = "";
                this.sex_ = "";
                this.alias_ = "";
                this.ticket_ = "";
                this.headImg_ = "";
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData1002_descriptor;
            }

            public CmdData1002 getDefaultInstanceForType() {
                return CmdData1002.getDefaultInstance();
            }

            public CmdData1002 build() {
                CmdData1002 buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public CmdData1002 buildPartial() {
                CmdData1002 cmdData1002 = new CmdData1002((GeneratedMessageV3.Builder) this);
                Object unused = cmdData1002.fromUsername_ = this.fromUsername_;
                Object unused2 = cmdData1002.nickname_ = this.nickname_;
                Object unused3 = cmdData1002.verifyContent_ = this.verifyContent_;
                Object unused4 = cmdData1002.scene_ = this.scene_;
                Object unused5 = cmdData1002.country_ = this.country_;
                Object unused6 = cmdData1002.province_ = this.province_;
                Object unused7 = cmdData1002.city_ = this.city_;
                Object unused8 = cmdData1002.sign_ = this.sign_;
                Object unused9 = cmdData1002.sex_ = this.sex_;
                Object unused10 = cmdData1002.alias_ = this.alias_;
                Object unused11 = cmdData1002.ticket_ = this.ticket_;
                Object unused12 = cmdData1002.headImg_ = this.headImg_;
                onBuilt();
                return cmdData1002;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder mergeFrom(Message message) {
                if (message instanceof CmdData1002) {
                    return mergeFrom((CmdData1002) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CmdData1002 cmdData1002) {
                if (cmdData1002 == CmdData1002.getDefaultInstance()) {
                    return this;
                }
                if (!cmdData1002.getFromUsername().isEmpty()) {
                    this.fromUsername_ = cmdData1002.fromUsername_;
                    onChanged();
                }
                if (!cmdData1002.getNickname().isEmpty()) {
                    this.nickname_ = cmdData1002.nickname_;
                    onChanged();
                }
                if (!cmdData1002.getVerifyContent().isEmpty()) {
                    this.verifyContent_ = cmdData1002.verifyContent_;
                    onChanged();
                }
                if (!cmdData1002.getScene().isEmpty()) {
                    this.scene_ = cmdData1002.scene_;
                    onChanged();
                }
                if (!cmdData1002.getCountry().isEmpty()) {
                    this.country_ = cmdData1002.country_;
                    onChanged();
                }
                if (!cmdData1002.getProvince().isEmpty()) {
                    this.province_ = cmdData1002.province_;
                    onChanged();
                }
                if (!cmdData1002.getCity().isEmpty()) {
                    this.city_ = cmdData1002.city_;
                    onChanged();
                }
                if (!cmdData1002.getSign().isEmpty()) {
                    this.sign_ = cmdData1002.sign_;
                    onChanged();
                }
                if (!cmdData1002.getSex().isEmpty()) {
                    this.sex_ = cmdData1002.sex_;
                    onChanged();
                }
                if (!cmdData1002.getAlias().isEmpty()) {
                    this.alias_ = cmdData1002.alias_;
                    onChanged();
                }
                if (!cmdData1002.getTicket().isEmpty()) {
                    this.ticket_ = cmdData1002.ticket_;
                    onChanged();
                }
                if (!cmdData1002.getHeadImg().isEmpty()) {
                    this.headImg_ = cmdData1002.headImg_;
                    onChanged();
                }
                mergeUnknownFields(cmdData1002.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.xp.wx.middleware.MsgProtos.CmdData1002.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.xp.wx.middleware.MsgProtos.CmdData1002.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.xp.wx.middleware.MsgProtos$CmdData1002 r3 = (com.xp.wx.middleware.MsgProtos.CmdData1002) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData1002) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.xp.wx.middleware.MsgProtos$CmdData1002 r4 = (com.xp.wx.middleware.MsgProtos.CmdData1002) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData1002) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.middleware.MsgProtos.CmdData1002.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.xp.wx.middleware.MsgProtos$CmdData1002$Builder");
            }

            public String getFromUsername() {
                Object obj = this.fromUsername_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.fromUsername_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getFromUsernameBytes() {
                Object obj = this.fromUsername_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.fromUsername_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setFromUsername(String str) {
                if (str != null) {
                    this.fromUsername_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearFromUsername() {
                this.fromUsername_ = CmdData1002.getDefaultInstance().getFromUsername();
                onChanged();
                return this;
            }

            public Builder setFromUsernameBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData1002.checkByteStringIsUtf8(byteString);
                    this.fromUsername_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getNickname() {
                Object obj = this.nickname_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.nickname_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getNicknameBytes() {
                Object obj = this.nickname_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.nickname_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setNickname(String str) {
                if (str != null) {
                    this.nickname_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearNickname() {
                this.nickname_ = CmdData1002.getDefaultInstance().getNickname();
                onChanged();
                return this;
            }

            public Builder setNicknameBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData1002.checkByteStringIsUtf8(byteString);
                    this.nickname_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getVerifyContent() {
                Object obj = this.verifyContent_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.verifyContent_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getVerifyContentBytes() {
                Object obj = this.verifyContent_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.verifyContent_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setVerifyContent(String str) {
                if (str != null) {
                    this.verifyContent_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearVerifyContent() {
                this.verifyContent_ = CmdData1002.getDefaultInstance().getVerifyContent();
                onChanged();
                return this;
            }

            public Builder setVerifyContentBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData1002.checkByteStringIsUtf8(byteString);
                    this.verifyContent_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getScene() {
                Object obj = this.scene_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.scene_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getSceneBytes() {
                Object obj = this.scene_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.scene_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setScene(String str) {
                if (str != null) {
                    this.scene_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearScene() {
                this.scene_ = CmdData1002.getDefaultInstance().getScene();
                onChanged();
                return this;
            }

            public Builder setSceneBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData1002.checkByteStringIsUtf8(byteString);
                    this.scene_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getCountry() {
                Object obj = this.country_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.country_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getCountryBytes() {
                Object obj = this.country_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.country_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setCountry(String str) {
                if (str != null) {
                    this.country_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearCountry() {
                this.country_ = CmdData1002.getDefaultInstance().getCountry();
                onChanged();
                return this;
            }

            public Builder setCountryBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData1002.checkByteStringIsUtf8(byteString);
                    this.country_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getProvince() {
                Object obj = this.province_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.province_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getProvinceBytes() {
                Object obj = this.province_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.province_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setProvince(String str) {
                if (str != null) {
                    this.province_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearProvince() {
                this.province_ = CmdData1002.getDefaultInstance().getProvince();
                onChanged();
                return this;
            }

            public Builder setProvinceBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData1002.checkByteStringIsUtf8(byteString);
                    this.province_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getCity() {
                Object obj = this.city_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.city_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getCityBytes() {
                Object obj = this.city_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.city_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setCity(String str) {
                if (str != null) {
                    this.city_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearCity() {
                this.city_ = CmdData1002.getDefaultInstance().getCity();
                onChanged();
                return this;
            }

            public Builder setCityBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData1002.checkByteStringIsUtf8(byteString);
                    this.city_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getSign() {
                Object obj = this.sign_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.sign_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getSignBytes() {
                Object obj = this.sign_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sign_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setSign(String str) {
                if (str != null) {
                    this.sign_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearSign() {
                this.sign_ = CmdData1002.getDefaultInstance().getSign();
                onChanged();
                return this;
            }

            public Builder setSignBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData1002.checkByteStringIsUtf8(byteString);
                    this.sign_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getSex() {
                Object obj = this.sex_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.sex_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getSexBytes() {
                Object obj = this.sex_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sex_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setSex(String str) {
                if (str != null) {
                    this.sex_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearSex() {
                this.sex_ = CmdData1002.getDefaultInstance().getSex();
                onChanged();
                return this;
            }

            public Builder setSexBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData1002.checkByteStringIsUtf8(byteString);
                    this.sex_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getAlias() {
                Object obj = this.alias_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.alias_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getAliasBytes() {
                Object obj = this.alias_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.alias_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setAlias(String str) {
                if (str != null) {
                    this.alias_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearAlias() {
                this.alias_ = CmdData1002.getDefaultInstance().getAlias();
                onChanged();
                return this;
            }

            public Builder setAliasBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData1002.checkByteStringIsUtf8(byteString);
                    this.alias_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getTicket() {
                Object obj = this.ticket_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.ticket_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getTicketBytes() {
                Object obj = this.ticket_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.ticket_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setTicket(String str) {
                if (str != null) {
                    this.ticket_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearTicket() {
                this.ticket_ = CmdData1002.getDefaultInstance().getTicket();
                onChanged();
                return this;
            }

            public Builder setTicketBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData1002.checkByteStringIsUtf8(byteString);
                    this.ticket_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getHeadImg() {
                Object obj = this.headImg_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.headImg_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getHeadImgBytes() {
                Object obj = this.headImg_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.headImg_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setHeadImg(String str) {
                if (str != null) {
                    this.headImg_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearHeadImg() {
                this.headImg_ = CmdData1002.getDefaultInstance().getHeadImg();
                onChanged();
                return this;
            }

            public Builder setHeadImgBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData1002.checkByteStringIsUtf8(byteString);
                    this.headImg_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static CmdData1002 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<CmdData1002> parser() {
            return PARSER;
        }

        public Parser<CmdData1002> getParserForType() {
            return PARSER;
        }

        public CmdData1002 getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class CmdData1003 extends GeneratedMessageV3 implements CmdData1003OrBuilder {
        private static final CmdData1003 DEFAULT_INSTANCE = new CmdData1003();
        public static final int FROMUSERNAME_FIELD_NUMBER = 2;
        public static final int MSG_FIELD_NUMBER = 4;
        /* access modifiers changed from: private */
        public static final Parser<CmdData1003> PARSER = new AbstractParser<CmdData1003>() {
            public CmdData1003 parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new CmdData1003(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int TOUSERNAME_FIELD_NUMBER = 3;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int USERLIST_FIELD_NUMBER = 6;
        public static final int USER_FIELD_NUMBER = 5;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public volatile Object fromUsername_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public volatile Object msg_;
        /* access modifiers changed from: private */
        public volatile Object toUsername_;
        /* access modifiers changed from: private */
        public volatile Object type_;
        /* access modifiers changed from: private */
        public List<Friend> userList_;
        /* access modifiers changed from: private */
        public Friend user_;

        private CmdData1003(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private CmdData1003() {
            this.memoizedIsInitialized = -1;
            this.type_ = "";
            this.fromUsername_ = "";
            this.toUsername_ = "";
            this.msg_ = "";
            this.userList_ = Collections.emptyList();
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private CmdData1003(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                boolean z2 = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.type_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.fromUsername_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                this.toUsername_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 34) {
                                this.msg_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 42) {
                                Friend.Builder builder = this.user_ != null ? this.user_.toBuilder() : null;
                                Friend friend = (Friend) codedInputStream.readMessage(Friend.parser(), extensionRegistryLite);
                                this.user_ = friend;
                                if (builder != null) {
                                    builder.mergeFrom(friend);
                                    this.user_ = builder.buildPartial();
                                }
                            } else if (readTag == 50) {
                                if (!(z2 & true)) {
                                    this.userList_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.userList_.add(codedInputStream.readMessage(Friend.parser(), extensionRegistryLite));
                            } else if (!parseUnknownFieldProto3(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        if (z2 & true) {
                            this.userList_ = Collections.unmodifiableList(this.userList_);
                        }
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if (z2 & true) {
                    this.userList_ = Collections.unmodifiableList(this.userList_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw null;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData1003_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData1003_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData1003.class, Builder.class);
        }

        public String getType() {
            Object obj = this.type_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.type_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getTypeBytes() {
            Object obj = this.type_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.type_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getFromUsername() {
            Object obj = this.fromUsername_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.fromUsername_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getFromUsernameBytes() {
            Object obj = this.fromUsername_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.fromUsername_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getToUsername() {
            Object obj = this.toUsername_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.toUsername_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getToUsernameBytes() {
            Object obj = this.toUsername_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.toUsername_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getMsg() {
            Object obj = this.msg_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.msg_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getMsgBytes() {
            Object obj = this.msg_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.msg_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public boolean hasUser() {
            return this.user_ != null;
        }

        public Friend getUser() {
            Friend friend = this.user_;
            return friend == null ? Friend.getDefaultInstance() : friend;
        }

        public FriendOrBuilder getUserOrBuilder() {
            return getUser();
        }

        public List<Friend> getUserListList() {
            return this.userList_;
        }

        public List<? extends FriendOrBuilder> getUserListOrBuilderList() {
            return this.userList_;
        }

        public int getUserListCount() {
            return this.userList_.size();
        }

        public Friend getUserList(int i) {
            return this.userList_.get(i);
        }

        public FriendOrBuilder getUserListOrBuilder(int i) {
            return this.userList_.get(i);
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getTypeBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.type_);
            }
            if (!getFromUsernameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.fromUsername_);
            }
            if (!getToUsernameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.toUsername_);
            }
            if (!getMsgBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.msg_);
            }
            if (this.user_ != null) {
                codedOutputStream.writeMessage(5, getUser());
            }
            for (int i = 0; i < this.userList_.size(); i++) {
                codedOutputStream.writeMessage(6, this.userList_.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !getTypeBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.type_) + 0 : 0;
            if (!getFromUsernameBytes().isEmpty()) {
                computeStringSize += GeneratedMessageV3.computeStringSize(2, this.fromUsername_);
            }
            if (!getToUsernameBytes().isEmpty()) {
                computeStringSize += GeneratedMessageV3.computeStringSize(3, this.toUsername_);
            }
            if (!getMsgBytes().isEmpty()) {
                computeStringSize += GeneratedMessageV3.computeStringSize(4, this.msg_);
            }
            if (this.user_ != null) {
                computeStringSize += CodedOutputStream.computeMessageSize(5, getUser());
            }
            for (int i2 = 0; i2 < this.userList_.size(); i2++) {
                computeStringSize += CodedOutputStream.computeMessageSize(6, this.userList_.get(i2));
            }
            int serializedSize = computeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CmdData1003)) {
                return super.equals(obj);
            }
            CmdData1003 cmdData1003 = (CmdData1003) obj;
            boolean z = ((((getType().equals(cmdData1003.getType())) && getFromUsername().equals(cmdData1003.getFromUsername())) && getToUsername().equals(cmdData1003.getToUsername())) && getMsg().equals(cmdData1003.getMsg())) && hasUser() == cmdData1003.hasUser();
            if (hasUser()) {
                z = z && getUser().equals(cmdData1003.getUser());
            }
            if (!(z && getUserListList().equals(cmdData1003.getUserListList())) || !this.unknownFields.equals(cmdData1003.unknownFields)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getType().hashCode()) * 37) + 2) * 53) + getFromUsername().hashCode()) * 37) + 3) * 53) + getToUsername().hashCode()) * 37) + 4) * 53) + getMsg().hashCode();
            if (hasUser()) {
                hashCode = (((hashCode * 37) + 5) * 53) + getUser().hashCode();
            }
            if (getUserListCount() > 0) {
                hashCode = (((hashCode * 37) + 6) * 53) + getUserListList().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public static CmdData1003 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static CmdData1003 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static CmdData1003 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static CmdData1003 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CmdData1003 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static CmdData1003 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CmdData1003 parseFrom(InputStream inputStream) throws IOException {
            return (CmdData1003) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CmdData1003 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData1003) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData1003 parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CmdData1003) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CmdData1003 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData1003) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData1003 parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CmdData1003) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CmdData1003 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData1003) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(CmdData1003 cmdData1003) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cmdData1003);
        }

        public Builder toBuilder() {
            if (this == DEFAULT_INSTANCE) {
                return new Builder();
            }
            return new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CmdData1003OrBuilder {
            private int bitField0_;
            private Object fromUsername_;
            private Object msg_;
            private Object toUsername_;
            private Object type_;
            private SingleFieldBuilderV3<Friend, Friend.Builder, FriendOrBuilder> userBuilder_;
            private RepeatedFieldBuilderV3<Friend, Friend.Builder, FriendOrBuilder> userListBuilder_;
            private List<Friend> userList_;
            private Friend user_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData1003_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData1003_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData1003.class, Builder.class);
            }

            private Builder() {
                this.type_ = "";
                this.fromUsername_ = "";
                this.toUsername_ = "";
                this.msg_ = "";
                this.user_ = null;
                this.userList_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.type_ = "";
                this.fromUsername_ = "";
                this.toUsername_ = "";
                this.msg_ = "";
                this.user_ = null;
                this.userList_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (CmdData1003.alwaysUseFieldBuilders) {
                    getUserListFieldBuilder();
                }
            }

            public Builder clear() {
                super.clear();
                this.type_ = "";
                this.fromUsername_ = "";
                this.toUsername_ = "";
                this.msg_ = "";
                if (this.userBuilder_ == null) {
                    this.user_ = null;
                } else {
                    this.user_ = null;
                    this.userBuilder_ = null;
                }
                RepeatedFieldBuilderV3<Friend, Friend.Builder, FriendOrBuilder> repeatedFieldBuilderV3 = this.userListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.userList_ = Collections.emptyList();
                    this.bitField0_ &= -33;
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData1003_descriptor;
            }

            public CmdData1003 getDefaultInstanceForType() {
                return CmdData1003.getDefaultInstance();
            }

            public CmdData1003 build() {
                CmdData1003 buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public CmdData1003 buildPartial() {
                CmdData1003 cmdData1003 = new CmdData1003((GeneratedMessageV3.Builder) this);
                Object unused = cmdData1003.type_ = this.type_;
                Object unused2 = cmdData1003.fromUsername_ = this.fromUsername_;
                Object unused3 = cmdData1003.toUsername_ = this.toUsername_;
                Object unused4 = cmdData1003.msg_ = this.msg_;
                SingleFieldBuilderV3<Friend, Friend.Builder, FriendOrBuilder> singleFieldBuilderV3 = this.userBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Friend unused5 = cmdData1003.user_ = this.user_;
                } else {
                    Friend unused6 = cmdData1003.user_ = singleFieldBuilderV3.build();
                }
                RepeatedFieldBuilderV3<Friend, Friend.Builder, FriendOrBuilder> repeatedFieldBuilderV3 = this.userListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 32) == 32) {
                        this.userList_ = Collections.unmodifiableList(this.userList_);
                        this.bitField0_ &= -33;
                    }
                    List unused7 = cmdData1003.userList_ = this.userList_;
                } else {
                    List unused8 = cmdData1003.userList_ = repeatedFieldBuilderV3.build();
                }
                int unused9 = cmdData1003.bitField0_ = 0;
                onBuilt();
                return cmdData1003;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder mergeFrom(Message message) {
                if (message instanceof CmdData1003) {
                    return mergeFrom((CmdData1003) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CmdData1003 cmdData1003) {
                if (cmdData1003 == CmdData1003.getDefaultInstance()) {
                    return this;
                }
                if (!cmdData1003.getType().isEmpty()) {
                    this.type_ = cmdData1003.type_;
                    onChanged();
                }
                if (!cmdData1003.getFromUsername().isEmpty()) {
                    this.fromUsername_ = cmdData1003.fromUsername_;
                    onChanged();
                }
                if (!cmdData1003.getToUsername().isEmpty()) {
                    this.toUsername_ = cmdData1003.toUsername_;
                    onChanged();
                }
                if (!cmdData1003.getMsg().isEmpty()) {
                    this.msg_ = cmdData1003.msg_;
                    onChanged();
                }
                if (cmdData1003.hasUser()) {
                    mergeUser(cmdData1003.getUser());
                }
                if (this.userListBuilder_ == null) {
                    if (!cmdData1003.userList_.isEmpty()) {
                        if (this.userList_.isEmpty()) {
                            this.userList_ = cmdData1003.userList_;
                            this.bitField0_ &= -33;
                        } else {
                            ensureUserListIsMutable();
                            this.userList_.addAll(cmdData1003.userList_);
                        }
                        onChanged();
                    }
                } else if (!cmdData1003.userList_.isEmpty()) {
                    if (this.userListBuilder_.isEmpty()) {
                        this.userListBuilder_.dispose();
                        RepeatedFieldBuilderV3<Friend, Friend.Builder, FriendOrBuilder> repeatedFieldBuilderV3 = null;
                        this.userListBuilder_ = null;
                        this.userList_ = cmdData1003.userList_;
                        this.bitField0_ &= -33;
                        if (CmdData1003.alwaysUseFieldBuilders) {
                            repeatedFieldBuilderV3 = getUserListFieldBuilder();
                        }
                        this.userListBuilder_ = repeatedFieldBuilderV3;
                    } else {
                        this.userListBuilder_.addAllMessages(cmdData1003.userList_);
                    }
                }
                mergeUnknownFields(cmdData1003.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.xp.wx.middleware.MsgProtos.CmdData1003.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.xp.wx.middleware.MsgProtos.CmdData1003.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.xp.wx.middleware.MsgProtos$CmdData1003 r3 = (com.xp.wx.middleware.MsgProtos.CmdData1003) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData1003) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.xp.wx.middleware.MsgProtos$CmdData1003 r4 = (com.xp.wx.middleware.MsgProtos.CmdData1003) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData1003) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.middleware.MsgProtos.CmdData1003.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.xp.wx.middleware.MsgProtos$CmdData1003$Builder");
            }

            public String getType() {
                Object obj = this.type_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.type_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getTypeBytes() {
                Object obj = this.type_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.type_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setType(String str) {
                if (str != null) {
                    this.type_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearType() {
                this.type_ = CmdData1003.getDefaultInstance().getType();
                onChanged();
                return this;
            }

            public Builder setTypeBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData1003.checkByteStringIsUtf8(byteString);
                    this.type_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getFromUsername() {
                Object obj = this.fromUsername_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.fromUsername_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getFromUsernameBytes() {
                Object obj = this.fromUsername_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.fromUsername_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setFromUsername(String str) {
                if (str != null) {
                    this.fromUsername_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearFromUsername() {
                this.fromUsername_ = CmdData1003.getDefaultInstance().getFromUsername();
                onChanged();
                return this;
            }

            public Builder setFromUsernameBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData1003.checkByteStringIsUtf8(byteString);
                    this.fromUsername_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getToUsername() {
                Object obj = this.toUsername_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.toUsername_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getToUsernameBytes() {
                Object obj = this.toUsername_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.toUsername_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setToUsername(String str) {
                if (str != null) {
                    this.toUsername_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearToUsername() {
                this.toUsername_ = CmdData1003.getDefaultInstance().getToUsername();
                onChanged();
                return this;
            }

            public Builder setToUsernameBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData1003.checkByteStringIsUtf8(byteString);
                    this.toUsername_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getMsg() {
                Object obj = this.msg_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.msg_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getMsgBytes() {
                Object obj = this.msg_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.msg_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setMsg(String str) {
                if (str != null) {
                    this.msg_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearMsg() {
                this.msg_ = CmdData1003.getDefaultInstance().getMsg();
                onChanged();
                return this;
            }

            public Builder setMsgBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData1003.checkByteStringIsUtf8(byteString);
                    this.msg_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public boolean hasUser() {
                return (this.userBuilder_ == null && this.user_ == null) ? false : true;
            }

            public Friend getUser() {
                SingleFieldBuilderV3<Friend, Friend.Builder, FriendOrBuilder> singleFieldBuilderV3 = this.userBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessage();
                }
                Friend friend = this.user_;
                return friend == null ? Friend.getDefaultInstance() : friend;
            }

            public Builder setUser(Friend friend) {
                SingleFieldBuilderV3<Friend, Friend.Builder, FriendOrBuilder> singleFieldBuilderV3 = this.userBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.setMessage(friend);
                } else if (friend != null) {
                    this.user_ = friend;
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder setUser(Friend.Builder builder) {
                SingleFieldBuilderV3<Friend, Friend.Builder, FriendOrBuilder> singleFieldBuilderV3 = this.userBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.user_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeUser(Friend friend) {
                SingleFieldBuilderV3<Friend, Friend.Builder, FriendOrBuilder> singleFieldBuilderV3 = this.userBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Friend friend2 = this.user_;
                    if (friend2 != null) {
                        this.user_ = Friend.newBuilder(friend2).mergeFrom(friend).buildPartial();
                    } else {
                        this.user_ = friend;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(friend);
                }
                return this;
            }

            public Builder clearUser() {
                if (this.userBuilder_ == null) {
                    this.user_ = null;
                    onChanged();
                } else {
                    this.user_ = null;
                    this.userBuilder_ = null;
                }
                return this;
            }

            public Friend.Builder getUserBuilder() {
                onChanged();
                return getUserFieldBuilder().getBuilder();
            }

            public FriendOrBuilder getUserOrBuilder() {
                SingleFieldBuilderV3<Friend, Friend.Builder, FriendOrBuilder> singleFieldBuilderV3 = this.userBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessageOrBuilder();
                }
                Friend friend = this.user_;
                return friend == null ? Friend.getDefaultInstance() : friend;
            }

            private SingleFieldBuilderV3<Friend, Friend.Builder, FriendOrBuilder> getUserFieldBuilder() {
                if (this.userBuilder_ == null) {
                    this.userBuilder_ = new SingleFieldBuilderV3<>(getUser(), getParentForChildren(), isClean());
                    this.user_ = null;
                }
                return this.userBuilder_;
            }

            private void ensureUserListIsMutable() {
                if ((this.bitField0_ & 32) != 32) {
                    this.userList_ = new ArrayList(this.userList_);
                    this.bitField0_ |= 32;
                }
            }

            public List<Friend> getUserListList() {
                RepeatedFieldBuilderV3<Friend, Friend.Builder, FriendOrBuilder> repeatedFieldBuilderV3 = this.userListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.userList_);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            public int getUserListCount() {
                RepeatedFieldBuilderV3<Friend, Friend.Builder, FriendOrBuilder> repeatedFieldBuilderV3 = this.userListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.userList_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public Friend getUserList(int i) {
                RepeatedFieldBuilderV3<Friend, Friend.Builder, FriendOrBuilder> repeatedFieldBuilderV3 = this.userListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.userList_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            public Builder setUserList(int i, Friend friend) {
                RepeatedFieldBuilderV3<Friend, Friend.Builder, FriendOrBuilder> repeatedFieldBuilderV3 = this.userListBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i, friend);
                } else if (friend != null) {
                    ensureUserListIsMutable();
                    this.userList_.set(i, friend);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder setUserList(int i, Friend.Builder builder) {
                RepeatedFieldBuilderV3<Friend, Friend.Builder, FriendOrBuilder> repeatedFieldBuilderV3 = this.userListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureUserListIsMutable();
                    this.userList_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder addUserList(Friend friend) {
                RepeatedFieldBuilderV3<Friend, Friend.Builder, FriendOrBuilder> repeatedFieldBuilderV3 = this.userListBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(friend);
                } else if (friend != null) {
                    ensureUserListIsMutable();
                    this.userList_.add(friend);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addUserList(int i, Friend friend) {
                RepeatedFieldBuilderV3<Friend, Friend.Builder, FriendOrBuilder> repeatedFieldBuilderV3 = this.userListBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(i, friend);
                } else if (friend != null) {
                    ensureUserListIsMutable();
                    this.userList_.add(i, friend);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addUserList(Friend.Builder builder) {
                RepeatedFieldBuilderV3<Friend, Friend.Builder, FriendOrBuilder> repeatedFieldBuilderV3 = this.userListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureUserListIsMutable();
                    this.userList_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addUserList(int i, Friend.Builder builder) {
                RepeatedFieldBuilderV3<Friend, Friend.Builder, FriendOrBuilder> repeatedFieldBuilderV3 = this.userListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureUserListIsMutable();
                    this.userList_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addAllUserList(Iterable<? extends Friend> iterable) {
                RepeatedFieldBuilderV3<Friend, Friend.Builder, FriendOrBuilder> repeatedFieldBuilderV3 = this.userListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureUserListIsMutable();
                    AbstractMessageLite.Builder.addAll(iterable, this.userList_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder clearUserList() {
                RepeatedFieldBuilderV3<Friend, Friend.Builder, FriendOrBuilder> repeatedFieldBuilderV3 = this.userListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.userList_ = Collections.emptyList();
                    this.bitField0_ &= -33;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder removeUserList(int i) {
                RepeatedFieldBuilderV3<Friend, Friend.Builder, FriendOrBuilder> repeatedFieldBuilderV3 = this.userListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureUserListIsMutable();
                    this.userList_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public Friend.Builder getUserListBuilder(int i) {
                return getUserListFieldBuilder().getBuilder(i);
            }

            public FriendOrBuilder getUserListOrBuilder(int i) {
                RepeatedFieldBuilderV3<Friend, Friend.Builder, FriendOrBuilder> repeatedFieldBuilderV3 = this.userListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.userList_.get(i);
                }
                return repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            public List<? extends FriendOrBuilder> getUserListOrBuilderList() {
                RepeatedFieldBuilderV3<Friend, Friend.Builder, FriendOrBuilder> repeatedFieldBuilderV3 = this.userListBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.userList_);
            }

            public Friend.Builder addUserListBuilder() {
                return getUserListFieldBuilder().addBuilder(Friend.getDefaultInstance());
            }

            public Friend.Builder addUserListBuilder(int i) {
                return getUserListFieldBuilder().addBuilder(i, Friend.getDefaultInstance());
            }

            public List<Friend.Builder> getUserListBuilderList() {
                return getUserListFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<Friend, Friend.Builder, FriendOrBuilder> getUserListFieldBuilder() {
                if (this.userListBuilder_ == null) {
                    this.userListBuilder_ = new RepeatedFieldBuilderV3<>(this.userList_, (this.bitField0_ & 32) == 32, getParentForChildren(), isClean());
                    this.userList_ = null;
                }
                return this.userListBuilder_;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static CmdData1003 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<CmdData1003> parser() {
            return PARSER;
        }

        public Parser<CmdData1003> getParserForType() {
            return PARSER;
        }

        public CmdData1003 getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class CmdData1004 extends GeneratedMessageV3 implements CmdData1004OrBuilder {
        public static final int BIGHEADIMAGE_FIELD_NUMBER = 11;
        public static final int CITY_FIELD_NUMBER = 4;
        private static final CmdData1004 DEFAULT_INSTANCE = new CmdData1004();
        public static final int LABELIDS_FIELD_NUMBER = 6;
        public static final int LABELNAMES_FIELD_NUMBER = 7;
        public static final int NICKNAME_FIELD_NUMBER = 8;
        /* access modifiers changed from: private */
        public static final Parser<CmdData1004> PARSER = new AbstractParser<CmdData1004>() {
            public CmdData1004 parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new CmdData1004(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int PROVINCE_FIELD_NUMBER = 3;
        public static final int REMARK_FIELD_NUMBER = 5;
        public static final int SEX_FIELD_NUMBER = 2;
        public static final int SIGNATURE_FIELD_NUMBER = 9;
        public static final int SMALLHEADIMAGE_FIELD_NUMBER = 10;
        public static final int USERNAME_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public volatile Object bigHeadImage_;
        /* access modifiers changed from: private */
        public volatile Object city_;
        /* access modifiers changed from: private */
        public volatile Object labelIds_;
        /* access modifiers changed from: private */
        public volatile Object labelNames_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public volatile Object nickname_;
        /* access modifiers changed from: private */
        public volatile Object province_;
        /* access modifiers changed from: private */
        public volatile Object remark_;
        /* access modifiers changed from: private */
        public volatile Object sex_;
        /* access modifiers changed from: private */
        public volatile Object signature_;
        /* access modifiers changed from: private */
        public volatile Object smallHeadImage_;
        /* access modifiers changed from: private */
        public volatile Object username_;

        private CmdData1004(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private CmdData1004() {
            this.memoizedIsInitialized = -1;
            this.username_ = "";
            this.sex_ = "";
            this.province_ = "";
            this.city_ = "";
            this.remark_ = "";
            this.labelIds_ = "";
            this.labelNames_ = "";
            this.nickname_ = "";
            this.signature_ = "";
            this.smallHeadImage_ = "";
            this.bigHeadImage_ = "";
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private CmdData1004(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        switch (readTag) {
                            case 0:
                                z = true;
                                break;
                            case 10:
                                this.username_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 18:
                                this.sex_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 26:
                                this.province_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 34:
                                this.city_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 42:
                                this.remark_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 50:
                                this.labelIds_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 58:
                                this.labelNames_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 66:
                                this.nickname_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 74:
                                this.signature_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 82:
                                this.smallHeadImage_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 90:
                                this.bigHeadImage_ = codedInputStream.readStringRequireUtf8();
                                break;
                            default:
                                if (parseUnknownFieldProto3(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                    break;
                                }
                                z = true;
                                break;
                        }
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw null;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData1004_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MsgProtos.internal_static_com_xp_wx_middleware_CmdData1004_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData1004.class, Builder.class);
        }

        public String getUsername() {
            Object obj = this.username_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.username_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getUsernameBytes() {
            Object obj = this.username_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.username_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getSex() {
            Object obj = this.sex_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sex_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getSexBytes() {
            Object obj = this.sex_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sex_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getProvince() {
            Object obj = this.province_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.province_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getProvinceBytes() {
            Object obj = this.province_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.province_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getCity() {
            Object obj = this.city_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.city_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getCityBytes() {
            Object obj = this.city_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.city_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getRemark() {
            Object obj = this.remark_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.remark_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getRemarkBytes() {
            Object obj = this.remark_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.remark_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getLabelIds() {
            Object obj = this.labelIds_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.labelIds_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getLabelIdsBytes() {
            Object obj = this.labelIds_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.labelIds_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getLabelNames() {
            Object obj = this.labelNames_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.labelNames_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getLabelNamesBytes() {
            Object obj = this.labelNames_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.labelNames_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getNickname() {
            Object obj = this.nickname_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.nickname_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getNicknameBytes() {
            Object obj = this.nickname_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.nickname_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getSignature() {
            Object obj = this.signature_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.signature_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getSignatureBytes() {
            Object obj = this.signature_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.signature_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getSmallHeadImage() {
            Object obj = this.smallHeadImage_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.smallHeadImage_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getSmallHeadImageBytes() {
            Object obj = this.smallHeadImage_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.smallHeadImage_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getBigHeadImage() {
            Object obj = this.bigHeadImage_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.bigHeadImage_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getBigHeadImageBytes() {
            Object obj = this.bigHeadImage_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bigHeadImage_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getUsernameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.username_);
            }
            if (!getSexBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.sex_);
            }
            if (!getProvinceBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.province_);
            }
            if (!getCityBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.city_);
            }
            if (!getRemarkBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 5, this.remark_);
            }
            if (!getLabelIdsBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 6, this.labelIds_);
            }
            if (!getLabelNamesBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 7, this.labelNames_);
            }
            if (!getNicknameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 8, this.nickname_);
            }
            if (!getSignatureBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 9, this.signature_);
            }
            if (!getSmallHeadImageBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 10, this.smallHeadImage_);
            }
            if (!getBigHeadImageBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 11, this.bigHeadImage_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!getUsernameBytes().isEmpty()) {
                i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.username_);
            }
            if (!getSexBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(2, this.sex_);
            }
            if (!getProvinceBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(3, this.province_);
            }
            if (!getCityBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(4, this.city_);
            }
            if (!getRemarkBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(5, this.remark_);
            }
            if (!getLabelIdsBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(6, this.labelIds_);
            }
            if (!getLabelNamesBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(7, this.labelNames_);
            }
            if (!getNicknameBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(8, this.nickname_);
            }
            if (!getSignatureBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(9, this.signature_);
            }
            if (!getSmallHeadImageBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(10, this.smallHeadImage_);
            }
            if (!getBigHeadImageBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(11, this.bigHeadImage_);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CmdData1004)) {
                return super.equals(obj);
            }
            CmdData1004 cmdData1004 = (CmdData1004) obj;
            if (!(((((((((((getUsername().equals(cmdData1004.getUsername())) && getSex().equals(cmdData1004.getSex())) && getProvince().equals(cmdData1004.getProvince())) && getCity().equals(cmdData1004.getCity())) && getRemark().equals(cmdData1004.getRemark())) && getLabelIds().equals(cmdData1004.getLabelIds())) && getLabelNames().equals(cmdData1004.getLabelNames())) && getNickname().equals(cmdData1004.getNickname())) && getSignature().equals(cmdData1004.getSignature())) && getSmallHeadImage().equals(cmdData1004.getSmallHeadImage())) && getBigHeadImage().equals(cmdData1004.getBigHeadImage())) || !this.unknownFields.equals(cmdData1004.unknownFields)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getUsername().hashCode()) * 37) + 2) * 53) + getSex().hashCode()) * 37) + 3) * 53) + getProvince().hashCode()) * 37) + 4) * 53) + getCity().hashCode()) * 37) + 5) * 53) + getRemark().hashCode()) * 37) + 6) * 53) + getLabelIds().hashCode()) * 37) + 7) * 53) + getLabelNames().hashCode()) * 37) + 8) * 53) + getNickname().hashCode()) * 37) + 9) * 53) + getSignature().hashCode()) * 37) + 10) * 53) + getSmallHeadImage().hashCode()) * 37) + 11) * 53) + getBigHeadImage().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public static CmdData1004 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static CmdData1004 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static CmdData1004 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static CmdData1004 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CmdData1004 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static CmdData1004 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CmdData1004 parseFrom(InputStream inputStream) throws IOException {
            return (CmdData1004) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CmdData1004 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData1004) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData1004 parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CmdData1004) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CmdData1004 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData1004) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CmdData1004 parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CmdData1004) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CmdData1004 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CmdData1004) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(CmdData1004 cmdData1004) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cmdData1004);
        }

        public Builder toBuilder() {
            if (this == DEFAULT_INSTANCE) {
                return new Builder();
            }
            return new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CmdData1004OrBuilder {
            private Object bigHeadImage_;
            private Object city_;
            private Object labelIds_;
            private Object labelNames_;
            private Object nickname_;
            private Object province_;
            private Object remark_;
            private Object sex_;
            private Object signature_;
            private Object smallHeadImage_;
            private Object username_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData1004_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData1004_fieldAccessorTable.ensureFieldAccessorsInitialized(CmdData1004.class, Builder.class);
            }

            private Builder() {
                this.username_ = "";
                this.sex_ = "";
                this.province_ = "";
                this.city_ = "";
                this.remark_ = "";
                this.labelIds_ = "";
                this.labelNames_ = "";
                this.nickname_ = "";
                this.signature_ = "";
                this.smallHeadImage_ = "";
                this.bigHeadImage_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.username_ = "";
                this.sex_ = "";
                this.province_ = "";
                this.city_ = "";
                this.remark_ = "";
                this.labelIds_ = "";
                this.labelNames_ = "";
                this.nickname_ = "";
                this.signature_ = "";
                this.smallHeadImage_ = "";
                this.bigHeadImage_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = CmdData1004.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                this.username_ = "";
                this.sex_ = "";
                this.province_ = "";
                this.city_ = "";
                this.remark_ = "";
                this.labelIds_ = "";
                this.labelNames_ = "";
                this.nickname_ = "";
                this.signature_ = "";
                this.smallHeadImage_ = "";
                this.bigHeadImage_ = "";
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return MsgProtos.internal_static_com_xp_wx_middleware_CmdData1004_descriptor;
            }

            public CmdData1004 getDefaultInstanceForType() {
                return CmdData1004.getDefaultInstance();
            }

            public CmdData1004 build() {
                CmdData1004 buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public CmdData1004 buildPartial() {
                CmdData1004 cmdData1004 = new CmdData1004((GeneratedMessageV3.Builder) this);
                Object unused = cmdData1004.username_ = this.username_;
                Object unused2 = cmdData1004.sex_ = this.sex_;
                Object unused3 = cmdData1004.province_ = this.province_;
                Object unused4 = cmdData1004.city_ = this.city_;
                Object unused5 = cmdData1004.remark_ = this.remark_;
                Object unused6 = cmdData1004.labelIds_ = this.labelIds_;
                Object unused7 = cmdData1004.labelNames_ = this.labelNames_;
                Object unused8 = cmdData1004.nickname_ = this.nickname_;
                Object unused9 = cmdData1004.signature_ = this.signature_;
                Object unused10 = cmdData1004.smallHeadImage_ = this.smallHeadImage_;
                Object unused11 = cmdData1004.bigHeadImage_ = this.bigHeadImage_;
                onBuilt();
                return cmdData1004;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder mergeFrom(Message message) {
                if (message instanceof CmdData1004) {
                    return mergeFrom((CmdData1004) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CmdData1004 cmdData1004) {
                if (cmdData1004 == CmdData1004.getDefaultInstance()) {
                    return this;
                }
                if (!cmdData1004.getUsername().isEmpty()) {
                    this.username_ = cmdData1004.username_;
                    onChanged();
                }
                if (!cmdData1004.getSex().isEmpty()) {
                    this.sex_ = cmdData1004.sex_;
                    onChanged();
                }
                if (!cmdData1004.getProvince().isEmpty()) {
                    this.province_ = cmdData1004.province_;
                    onChanged();
                }
                if (!cmdData1004.getCity().isEmpty()) {
                    this.city_ = cmdData1004.city_;
                    onChanged();
                }
                if (!cmdData1004.getRemark().isEmpty()) {
                    this.remark_ = cmdData1004.remark_;
                    onChanged();
                }
                if (!cmdData1004.getLabelIds().isEmpty()) {
                    this.labelIds_ = cmdData1004.labelIds_;
                    onChanged();
                }
                if (!cmdData1004.getLabelNames().isEmpty()) {
                    this.labelNames_ = cmdData1004.labelNames_;
                    onChanged();
                }
                if (!cmdData1004.getNickname().isEmpty()) {
                    this.nickname_ = cmdData1004.nickname_;
                    onChanged();
                }
                if (!cmdData1004.getSignature().isEmpty()) {
                    this.signature_ = cmdData1004.signature_;
                    onChanged();
                }
                if (!cmdData1004.getSmallHeadImage().isEmpty()) {
                    this.smallHeadImage_ = cmdData1004.smallHeadImage_;
                    onChanged();
                }
                if (!cmdData1004.getBigHeadImage().isEmpty()) {
                    this.bigHeadImage_ = cmdData1004.bigHeadImage_;
                    onChanged();
                }
                mergeUnknownFields(cmdData1004.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.xp.wx.middleware.MsgProtos.CmdData1004.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.xp.wx.middleware.MsgProtos.CmdData1004.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.xp.wx.middleware.MsgProtos$CmdData1004 r3 = (com.xp.wx.middleware.MsgProtos.CmdData1004) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData1004) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.xp.wx.middleware.MsgProtos$CmdData1004 r4 = (com.xp.wx.middleware.MsgProtos.CmdData1004) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.CmdData1004) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.middleware.MsgProtos.CmdData1004.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.xp.wx.middleware.MsgProtos$CmdData1004$Builder");
            }

            public String getUsername() {
                Object obj = this.username_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.username_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getUsernameBytes() {
                Object obj = this.username_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.username_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setUsername(String str) {
                if (str != null) {
                    this.username_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearUsername() {
                this.username_ = CmdData1004.getDefaultInstance().getUsername();
                onChanged();
                return this;
            }

            public Builder setUsernameBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData1004.checkByteStringIsUtf8(byteString);
                    this.username_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getSex() {
                Object obj = this.sex_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.sex_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getSexBytes() {
                Object obj = this.sex_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sex_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setSex(String str) {
                if (str != null) {
                    this.sex_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearSex() {
                this.sex_ = CmdData1004.getDefaultInstance().getSex();
                onChanged();
                return this;
            }

            public Builder setSexBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData1004.checkByteStringIsUtf8(byteString);
                    this.sex_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getProvince() {
                Object obj = this.province_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.province_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getProvinceBytes() {
                Object obj = this.province_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.province_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setProvince(String str) {
                if (str != null) {
                    this.province_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearProvince() {
                this.province_ = CmdData1004.getDefaultInstance().getProvince();
                onChanged();
                return this;
            }

            public Builder setProvinceBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData1004.checkByteStringIsUtf8(byteString);
                    this.province_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getCity() {
                Object obj = this.city_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.city_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getCityBytes() {
                Object obj = this.city_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.city_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setCity(String str) {
                if (str != null) {
                    this.city_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearCity() {
                this.city_ = CmdData1004.getDefaultInstance().getCity();
                onChanged();
                return this;
            }

            public Builder setCityBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData1004.checkByteStringIsUtf8(byteString);
                    this.city_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getRemark() {
                Object obj = this.remark_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.remark_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getRemarkBytes() {
                Object obj = this.remark_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.remark_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setRemark(String str) {
                if (str != null) {
                    this.remark_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearRemark() {
                this.remark_ = CmdData1004.getDefaultInstance().getRemark();
                onChanged();
                return this;
            }

            public Builder setRemarkBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData1004.checkByteStringIsUtf8(byteString);
                    this.remark_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getLabelIds() {
                Object obj = this.labelIds_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.labelIds_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getLabelIdsBytes() {
                Object obj = this.labelIds_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.labelIds_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setLabelIds(String str) {
                if (str != null) {
                    this.labelIds_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearLabelIds() {
                this.labelIds_ = CmdData1004.getDefaultInstance().getLabelIds();
                onChanged();
                return this;
            }

            public Builder setLabelIdsBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData1004.checkByteStringIsUtf8(byteString);
                    this.labelIds_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getLabelNames() {
                Object obj = this.labelNames_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.labelNames_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getLabelNamesBytes() {
                Object obj = this.labelNames_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.labelNames_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setLabelNames(String str) {
                if (str != null) {
                    this.labelNames_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearLabelNames() {
                this.labelNames_ = CmdData1004.getDefaultInstance().getLabelNames();
                onChanged();
                return this;
            }

            public Builder setLabelNamesBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData1004.checkByteStringIsUtf8(byteString);
                    this.labelNames_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getNickname() {
                Object obj = this.nickname_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.nickname_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getNicknameBytes() {
                Object obj = this.nickname_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.nickname_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setNickname(String str) {
                if (str != null) {
                    this.nickname_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearNickname() {
                this.nickname_ = CmdData1004.getDefaultInstance().getNickname();
                onChanged();
                return this;
            }

            public Builder setNicknameBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData1004.checkByteStringIsUtf8(byteString);
                    this.nickname_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getSignature() {
                Object obj = this.signature_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.signature_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getSignatureBytes() {
                Object obj = this.signature_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.signature_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setSignature(String str) {
                if (str != null) {
                    this.signature_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearSignature() {
                this.signature_ = CmdData1004.getDefaultInstance().getSignature();
                onChanged();
                return this;
            }

            public Builder setSignatureBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData1004.checkByteStringIsUtf8(byteString);
                    this.signature_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getSmallHeadImage() {
                Object obj = this.smallHeadImage_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.smallHeadImage_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getSmallHeadImageBytes() {
                Object obj = this.smallHeadImage_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.smallHeadImage_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setSmallHeadImage(String str) {
                if (str != null) {
                    this.smallHeadImage_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearSmallHeadImage() {
                this.smallHeadImage_ = CmdData1004.getDefaultInstance().getSmallHeadImage();
                onChanged();
                return this;
            }

            public Builder setSmallHeadImageBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData1004.checkByteStringIsUtf8(byteString);
                    this.smallHeadImage_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getBigHeadImage() {
                Object obj = this.bigHeadImage_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.bigHeadImage_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getBigHeadImageBytes() {
                Object obj = this.bigHeadImage_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.bigHeadImage_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setBigHeadImage(String str) {
                if (str != null) {
                    this.bigHeadImage_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearBigHeadImage() {
                this.bigHeadImage_ = CmdData1004.getDefaultInstance().getBigHeadImage();
                onChanged();
                return this;
            }

            public Builder setBigHeadImageBytes(ByteString byteString) {
                if (byteString != null) {
                    CmdData1004.checkByteStringIsUtf8(byteString);
                    this.bigHeadImage_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static CmdData1004 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<CmdData1004> parser() {
            return PARSER;
        }

        public Parser<CmdData1004> getParserForType() {
            return PARSER;
        }

        public CmdData1004 getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class Friend extends GeneratedMessageV3 implements FriendOrBuilder {
        public static final int ALIAS_FIELD_NUMBER = 1;
        public static final int ATTACHPICURL_FIELD_NUMBER = 16;
        public static final int CERTFLAG_FIELD_NUMBER = 14;
        public static final int CITY_FIELD_NUMBER = 7;
        public static final int CONREMARK_FIELD_NUMBER = 3;
        private static final Friend DEFAULT_INSTANCE = new Friend();
        public static final int DESC_FIELD_NUMBER = 12;
        public static final int HEADIMAGEURL_FIELD_NUMBER = 15;
        public static final int LABELIDS_FIELD_NUMBER = 8;
        public static final int LABELNAMES_FIELD_NUMBER = 9;
        public static final int NICKNAME_FIELD_NUMBER = 4;
        /* access modifiers changed from: private */
        public static final Parser<Friend> PARSER = new AbstractParser<Friend>() {
            public Friend parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Friend(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int PROVINCE_FIELD_NUMBER = 6;
        public static final int SEX_FIELD_NUMBER = 5;
        public static final int SIGNATURE_FIELD_NUMBER = 10;
        public static final int TEL_FIELD_NUMBER = 13;
        public static final int USERNAME_FIELD_NUMBER = 2;
        public static final int V2TICKET_FIELD_NUMBER = 11;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public volatile Object alias_;
        /* access modifiers changed from: private */
        public volatile Object attachPicUrl_;
        /* access modifiers changed from: private */
        public int certFlag_;
        /* access modifiers changed from: private */
        public volatile Object city_;
        /* access modifiers changed from: private */
        public volatile Object conRemark_;
        /* access modifiers changed from: private */
        public volatile Object desc_;
        /* access modifiers changed from: private */
        public volatile Object headImageUrl_;
        /* access modifiers changed from: private */
        public volatile Object labelIds_;
        /* access modifiers changed from: private */
        public volatile Object labelNames_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public volatile Object nickname_;
        /* access modifiers changed from: private */
        public volatile Object province_;
        /* access modifiers changed from: private */
        public volatile Object sex_;
        /* access modifiers changed from: private */
        public volatile Object signature_;
        /* access modifiers changed from: private */
        public volatile Object tel_;
        /* access modifiers changed from: private */
        public volatile Object username_;
        /* access modifiers changed from: private */
        public volatile Object v2Ticket_;

        private Friend(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private Friend() {
            this.memoizedIsInitialized = -1;
            this.alias_ = "";
            this.username_ = "";
            this.conRemark_ = "";
            this.nickname_ = "";
            this.sex_ = "";
            this.province_ = "";
            this.city_ = "";
            this.labelIds_ = "";
            this.labelNames_ = "";
            this.signature_ = "";
            this.v2Ticket_ = "";
            this.desc_ = "";
            this.tel_ = "";
            this.certFlag_ = 0;
            this.headImageUrl_ = "";
            this.attachPicUrl_ = "";
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Friend(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        switch (readTag) {
                            case 0:
                                z = true;
                                break;
                            case 10:
                                this.alias_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 18:
                                this.username_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 26:
                                this.conRemark_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 34:
                                this.nickname_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 42:
                                this.sex_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 50:
                                this.province_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 58:
                                this.city_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 66:
                                this.labelIds_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 74:
                                this.labelNames_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 82:
                                this.signature_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 90:
                                this.v2Ticket_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 98:
                                this.desc_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 106:
                                this.tel_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 112:
                                this.certFlag_ = codedInputStream.readInt32();
                                break;
                            case 122:
                                this.headImageUrl_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 130:
                                this.attachPicUrl_ = codedInputStream.readStringRequireUtf8();
                                break;
                            default:
                                if (parseUnknownFieldProto3(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                    break;
                                }
                                z = true;
                                break;
                        }
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw null;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MsgProtos.internal_static_com_xp_wx_middleware_Friend_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MsgProtos.internal_static_com_xp_wx_middleware_Friend_fieldAccessorTable.ensureFieldAccessorsInitialized(Friend.class, Builder.class);
        }

        public String getAlias() {
            Object obj = this.alias_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.alias_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getAliasBytes() {
            Object obj = this.alias_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.alias_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getUsername() {
            Object obj = this.username_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.username_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getUsernameBytes() {
            Object obj = this.username_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.username_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getConRemark() {
            Object obj = this.conRemark_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.conRemark_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getConRemarkBytes() {
            Object obj = this.conRemark_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.conRemark_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getNickname() {
            Object obj = this.nickname_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.nickname_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getNicknameBytes() {
            Object obj = this.nickname_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.nickname_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getSex() {
            Object obj = this.sex_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sex_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getSexBytes() {
            Object obj = this.sex_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sex_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getProvince() {
            Object obj = this.province_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.province_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getProvinceBytes() {
            Object obj = this.province_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.province_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getCity() {
            Object obj = this.city_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.city_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getCityBytes() {
            Object obj = this.city_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.city_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getLabelIds() {
            Object obj = this.labelIds_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.labelIds_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getLabelIdsBytes() {
            Object obj = this.labelIds_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.labelIds_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getLabelNames() {
            Object obj = this.labelNames_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.labelNames_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getLabelNamesBytes() {
            Object obj = this.labelNames_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.labelNames_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getSignature() {
            Object obj = this.signature_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.signature_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getSignatureBytes() {
            Object obj = this.signature_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.signature_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getV2Ticket() {
            Object obj = this.v2Ticket_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.v2Ticket_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getV2TicketBytes() {
            Object obj = this.v2Ticket_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.v2Ticket_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getDesc() {
            Object obj = this.desc_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.desc_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getDescBytes() {
            Object obj = this.desc_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.desc_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getTel() {
            Object obj = this.tel_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.tel_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getTelBytes() {
            Object obj = this.tel_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.tel_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public int getCertFlag() {
            return this.certFlag_;
        }

        public String getHeadImageUrl() {
            Object obj = this.headImageUrl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.headImageUrl_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getHeadImageUrlBytes() {
            Object obj = this.headImageUrl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.headImageUrl_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getAttachPicUrl() {
            Object obj = this.attachPicUrl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.attachPicUrl_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getAttachPicUrlBytes() {
            Object obj = this.attachPicUrl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.attachPicUrl_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getAliasBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.alias_);
            }
            if (!getUsernameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.username_);
            }
            if (!getConRemarkBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.conRemark_);
            }
            if (!getNicknameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.nickname_);
            }
            if (!getSexBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 5, this.sex_);
            }
            if (!getProvinceBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 6, this.province_);
            }
            if (!getCityBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 7, this.city_);
            }
            if (!getLabelIdsBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 8, this.labelIds_);
            }
            if (!getLabelNamesBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 9, this.labelNames_);
            }
            if (!getSignatureBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 10, this.signature_);
            }
            if (!getV2TicketBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 11, this.v2Ticket_);
            }
            if (!getDescBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 12, this.desc_);
            }
            if (!getTelBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 13, this.tel_);
            }
            int i = this.certFlag_;
            if (i != 0) {
                codedOutputStream.writeInt32(14, i);
            }
            if (!getHeadImageUrlBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 15, this.headImageUrl_);
            }
            if (!getAttachPicUrlBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 16, this.attachPicUrl_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!getAliasBytes().isEmpty()) {
                i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.alias_);
            }
            if (!getUsernameBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(2, this.username_);
            }
            if (!getConRemarkBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(3, this.conRemark_);
            }
            if (!getNicknameBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(4, this.nickname_);
            }
            if (!getSexBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(5, this.sex_);
            }
            if (!getProvinceBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(6, this.province_);
            }
            if (!getCityBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(7, this.city_);
            }
            if (!getLabelIdsBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(8, this.labelIds_);
            }
            if (!getLabelNamesBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(9, this.labelNames_);
            }
            if (!getSignatureBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(10, this.signature_);
            }
            if (!getV2TicketBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(11, this.v2Ticket_);
            }
            if (!getDescBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(12, this.desc_);
            }
            if (!getTelBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(13, this.tel_);
            }
            int i3 = this.certFlag_;
            if (i3 != 0) {
                i2 += CodedOutputStream.computeInt32Size(14, i3);
            }
            if (!getHeadImageUrlBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(15, this.headImageUrl_);
            }
            if (!getAttachPicUrlBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(16, this.attachPicUrl_);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Friend)) {
                return super.equals(obj);
            }
            Friend friend = (Friend) obj;
            if (!((((((((((((((((getAlias().equals(friend.getAlias())) && getUsername().equals(friend.getUsername())) && getConRemark().equals(friend.getConRemark())) && getNickname().equals(friend.getNickname())) && getSex().equals(friend.getSex())) && getProvince().equals(friend.getProvince())) && getCity().equals(friend.getCity())) && getLabelIds().equals(friend.getLabelIds())) && getLabelNames().equals(friend.getLabelNames())) && getSignature().equals(friend.getSignature())) && getV2Ticket().equals(friend.getV2Ticket())) && getDesc().equals(friend.getDesc())) && getTel().equals(friend.getTel())) && getCertFlag() == friend.getCertFlag()) && getHeadImageUrl().equals(friend.getHeadImageUrl())) && getAttachPicUrl().equals(friend.getAttachPicUrl())) || !this.unknownFields.equals(friend.unknownFields)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getAlias().hashCode()) * 37) + 2) * 53) + getUsername().hashCode()) * 37) + 3) * 53) + getConRemark().hashCode()) * 37) + 4) * 53) + getNickname().hashCode()) * 37) + 5) * 53) + getSex().hashCode()) * 37) + 6) * 53) + getProvince().hashCode()) * 37) + 7) * 53) + getCity().hashCode()) * 37) + 8) * 53) + getLabelIds().hashCode()) * 37) + 9) * 53) + getLabelNames().hashCode()) * 37) + 10) * 53) + getSignature().hashCode()) * 37) + 11) * 53) + getV2Ticket().hashCode()) * 37) + 12) * 53) + getDesc().hashCode()) * 37) + 13) * 53) + getTel().hashCode()) * 37) + 14) * 53) + getCertFlag()) * 37) + 15) * 53) + getHeadImageUrl().hashCode()) * 37) + 16) * 53) + getAttachPicUrl().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public static Friend parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Friend parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Friend parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Friend parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Friend parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static Friend parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Friend parseFrom(InputStream inputStream) throws IOException {
            return (Friend) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Friend parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Friend) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Friend parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Friend) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Friend parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Friend) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Friend parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Friend) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Friend parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Friend) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Friend friend) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(friend);
        }

        public Builder toBuilder() {
            if (this == DEFAULT_INSTANCE) {
                return new Builder();
            }
            return new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FriendOrBuilder {
            private Object alias_;
            private Object attachPicUrl_;
            private int certFlag_;
            private Object city_;
            private Object conRemark_;
            private Object desc_;
            private Object headImageUrl_;
            private Object labelIds_;
            private Object labelNames_;
            private Object nickname_;
            private Object province_;
            private Object sex_;
            private Object signature_;
            private Object tel_;
            private Object username_;
            private Object v2Ticket_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MsgProtos.internal_static_com_xp_wx_middleware_Friend_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return MsgProtos.internal_static_com_xp_wx_middleware_Friend_fieldAccessorTable.ensureFieldAccessorsInitialized(Friend.class, Builder.class);
            }

            private Builder() {
                this.alias_ = "";
                this.username_ = "";
                this.conRemark_ = "";
                this.nickname_ = "";
                this.sex_ = "";
                this.province_ = "";
                this.city_ = "";
                this.labelIds_ = "";
                this.labelNames_ = "";
                this.signature_ = "";
                this.v2Ticket_ = "";
                this.desc_ = "";
                this.tel_ = "";
                this.headImageUrl_ = "";
                this.attachPicUrl_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.alias_ = "";
                this.username_ = "";
                this.conRemark_ = "";
                this.nickname_ = "";
                this.sex_ = "";
                this.province_ = "";
                this.city_ = "";
                this.labelIds_ = "";
                this.labelNames_ = "";
                this.signature_ = "";
                this.v2Ticket_ = "";
                this.desc_ = "";
                this.tel_ = "";
                this.headImageUrl_ = "";
                this.attachPicUrl_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = Friend.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                this.alias_ = "";
                this.username_ = "";
                this.conRemark_ = "";
                this.nickname_ = "";
                this.sex_ = "";
                this.province_ = "";
                this.city_ = "";
                this.labelIds_ = "";
                this.labelNames_ = "";
                this.signature_ = "";
                this.v2Ticket_ = "";
                this.desc_ = "";
                this.tel_ = "";
                this.certFlag_ = 0;
                this.headImageUrl_ = "";
                this.attachPicUrl_ = "";
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return MsgProtos.internal_static_com_xp_wx_middleware_Friend_descriptor;
            }

            public Friend getDefaultInstanceForType() {
                return Friend.getDefaultInstance();
            }

            public Friend build() {
                Friend buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public Friend buildPartial() {
                Friend friend = new Friend((GeneratedMessageV3.Builder) this);
                Object unused = friend.alias_ = this.alias_;
                Object unused2 = friend.username_ = this.username_;
                Object unused3 = friend.conRemark_ = this.conRemark_;
                Object unused4 = friend.nickname_ = this.nickname_;
                Object unused5 = friend.sex_ = this.sex_;
                Object unused6 = friend.province_ = this.province_;
                Object unused7 = friend.city_ = this.city_;
                Object unused8 = friend.labelIds_ = this.labelIds_;
                Object unused9 = friend.labelNames_ = this.labelNames_;
                Object unused10 = friend.signature_ = this.signature_;
                Object unused11 = friend.v2Ticket_ = this.v2Ticket_;
                Object unused12 = friend.desc_ = this.desc_;
                Object unused13 = friend.tel_ = this.tel_;
                int unused14 = friend.certFlag_ = this.certFlag_;
                Object unused15 = friend.headImageUrl_ = this.headImageUrl_;
                Object unused16 = friend.attachPicUrl_ = this.attachPicUrl_;
                onBuilt();
                return friend;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder mergeFrom(Message message) {
                if (message instanceof Friend) {
                    return mergeFrom((Friend) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Friend friend) {
                if (friend == Friend.getDefaultInstance()) {
                    return this;
                }
                if (!friend.getAlias().isEmpty()) {
                    this.alias_ = friend.alias_;
                    onChanged();
                }
                if (!friend.getUsername().isEmpty()) {
                    this.username_ = friend.username_;
                    onChanged();
                }
                if (!friend.getConRemark().isEmpty()) {
                    this.conRemark_ = friend.conRemark_;
                    onChanged();
                }
                if (!friend.getNickname().isEmpty()) {
                    this.nickname_ = friend.nickname_;
                    onChanged();
                }
                if (!friend.getSex().isEmpty()) {
                    this.sex_ = friend.sex_;
                    onChanged();
                }
                if (!friend.getProvince().isEmpty()) {
                    this.province_ = friend.province_;
                    onChanged();
                }
                if (!friend.getCity().isEmpty()) {
                    this.city_ = friend.city_;
                    onChanged();
                }
                if (!friend.getLabelIds().isEmpty()) {
                    this.labelIds_ = friend.labelIds_;
                    onChanged();
                }
                if (!friend.getLabelNames().isEmpty()) {
                    this.labelNames_ = friend.labelNames_;
                    onChanged();
                }
                if (!friend.getSignature().isEmpty()) {
                    this.signature_ = friend.signature_;
                    onChanged();
                }
                if (!friend.getV2Ticket().isEmpty()) {
                    this.v2Ticket_ = friend.v2Ticket_;
                    onChanged();
                }
                if (!friend.getDesc().isEmpty()) {
                    this.desc_ = friend.desc_;
                    onChanged();
                }
                if (!friend.getTel().isEmpty()) {
                    this.tel_ = friend.tel_;
                    onChanged();
                }
                if (friend.getCertFlag() != 0) {
                    setCertFlag(friend.getCertFlag());
                }
                if (!friend.getHeadImageUrl().isEmpty()) {
                    this.headImageUrl_ = friend.headImageUrl_;
                    onChanged();
                }
                if (!friend.getAttachPicUrl().isEmpty()) {
                    this.attachPicUrl_ = friend.attachPicUrl_;
                    onChanged();
                }
                mergeUnknownFields(friend.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.xp.wx.middleware.MsgProtos.Friend.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.xp.wx.middleware.MsgProtos.Friend.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.xp.wx.middleware.MsgProtos$Friend r3 = (com.xp.wx.middleware.MsgProtos.Friend) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.Friend) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.xp.wx.middleware.MsgProtos$Friend r4 = (com.xp.wx.middleware.MsgProtos.Friend) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.Friend) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.middleware.MsgProtos.Friend.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.xp.wx.middleware.MsgProtos$Friend$Builder");
            }

            public String getAlias() {
                Object obj = this.alias_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.alias_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getAliasBytes() {
                Object obj = this.alias_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.alias_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setAlias(String str) {
                if (str != null) {
                    this.alias_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearAlias() {
                this.alias_ = Friend.getDefaultInstance().getAlias();
                onChanged();
                return this;
            }

            public Builder setAliasBytes(ByteString byteString) {
                if (byteString != null) {
                    Friend.checkByteStringIsUtf8(byteString);
                    this.alias_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getUsername() {
                Object obj = this.username_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.username_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getUsernameBytes() {
                Object obj = this.username_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.username_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setUsername(String str) {
                if (str != null) {
                    this.username_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearUsername() {
                this.username_ = Friend.getDefaultInstance().getUsername();
                onChanged();
                return this;
            }

            public Builder setUsernameBytes(ByteString byteString) {
                if (byteString != null) {
                    Friend.checkByteStringIsUtf8(byteString);
                    this.username_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getConRemark() {
                Object obj = this.conRemark_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.conRemark_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getConRemarkBytes() {
                Object obj = this.conRemark_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.conRemark_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setConRemark(String str) {
                if (str != null) {
                    this.conRemark_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearConRemark() {
                this.conRemark_ = Friend.getDefaultInstance().getConRemark();
                onChanged();
                return this;
            }

            public Builder setConRemarkBytes(ByteString byteString) {
                if (byteString != null) {
                    Friend.checkByteStringIsUtf8(byteString);
                    this.conRemark_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getNickname() {
                Object obj = this.nickname_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.nickname_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getNicknameBytes() {
                Object obj = this.nickname_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.nickname_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setNickname(String str) {
                if (str != null) {
                    this.nickname_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearNickname() {
                this.nickname_ = Friend.getDefaultInstance().getNickname();
                onChanged();
                return this;
            }

            public Builder setNicknameBytes(ByteString byteString) {
                if (byteString != null) {
                    Friend.checkByteStringIsUtf8(byteString);
                    this.nickname_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getSex() {
                Object obj = this.sex_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.sex_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getSexBytes() {
                Object obj = this.sex_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sex_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setSex(String str) {
                if (str != null) {
                    this.sex_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearSex() {
                this.sex_ = Friend.getDefaultInstance().getSex();
                onChanged();
                return this;
            }

            public Builder setSexBytes(ByteString byteString) {
                if (byteString != null) {
                    Friend.checkByteStringIsUtf8(byteString);
                    this.sex_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getProvince() {
                Object obj = this.province_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.province_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getProvinceBytes() {
                Object obj = this.province_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.province_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setProvince(String str) {
                if (str != null) {
                    this.province_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearProvince() {
                this.province_ = Friend.getDefaultInstance().getProvince();
                onChanged();
                return this;
            }

            public Builder setProvinceBytes(ByteString byteString) {
                if (byteString != null) {
                    Friend.checkByteStringIsUtf8(byteString);
                    this.province_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getCity() {
                Object obj = this.city_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.city_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getCityBytes() {
                Object obj = this.city_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.city_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setCity(String str) {
                if (str != null) {
                    this.city_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearCity() {
                this.city_ = Friend.getDefaultInstance().getCity();
                onChanged();
                return this;
            }

            public Builder setCityBytes(ByteString byteString) {
                if (byteString != null) {
                    Friend.checkByteStringIsUtf8(byteString);
                    this.city_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getLabelIds() {
                Object obj = this.labelIds_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.labelIds_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getLabelIdsBytes() {
                Object obj = this.labelIds_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.labelIds_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setLabelIds(String str) {
                if (str != null) {
                    this.labelIds_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearLabelIds() {
                this.labelIds_ = Friend.getDefaultInstance().getLabelIds();
                onChanged();
                return this;
            }

            public Builder setLabelIdsBytes(ByteString byteString) {
                if (byteString != null) {
                    Friend.checkByteStringIsUtf8(byteString);
                    this.labelIds_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getLabelNames() {
                Object obj = this.labelNames_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.labelNames_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getLabelNamesBytes() {
                Object obj = this.labelNames_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.labelNames_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setLabelNames(String str) {
                if (str != null) {
                    this.labelNames_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearLabelNames() {
                this.labelNames_ = Friend.getDefaultInstance().getLabelNames();
                onChanged();
                return this;
            }

            public Builder setLabelNamesBytes(ByteString byteString) {
                if (byteString != null) {
                    Friend.checkByteStringIsUtf8(byteString);
                    this.labelNames_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getSignature() {
                Object obj = this.signature_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.signature_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getSignatureBytes() {
                Object obj = this.signature_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.signature_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setSignature(String str) {
                if (str != null) {
                    this.signature_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearSignature() {
                this.signature_ = Friend.getDefaultInstance().getSignature();
                onChanged();
                return this;
            }

            public Builder setSignatureBytes(ByteString byteString) {
                if (byteString != null) {
                    Friend.checkByteStringIsUtf8(byteString);
                    this.signature_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getV2Ticket() {
                Object obj = this.v2Ticket_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.v2Ticket_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getV2TicketBytes() {
                Object obj = this.v2Ticket_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.v2Ticket_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setV2Ticket(String str) {
                if (str != null) {
                    this.v2Ticket_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearV2Ticket() {
                this.v2Ticket_ = Friend.getDefaultInstance().getV2Ticket();
                onChanged();
                return this;
            }

            public Builder setV2TicketBytes(ByteString byteString) {
                if (byteString != null) {
                    Friend.checkByteStringIsUtf8(byteString);
                    this.v2Ticket_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getDesc() {
                Object obj = this.desc_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.desc_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getDescBytes() {
                Object obj = this.desc_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.desc_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setDesc(String str) {
                if (str != null) {
                    this.desc_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearDesc() {
                this.desc_ = Friend.getDefaultInstance().getDesc();
                onChanged();
                return this;
            }

            public Builder setDescBytes(ByteString byteString) {
                if (byteString != null) {
                    Friend.checkByteStringIsUtf8(byteString);
                    this.desc_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getTel() {
                Object obj = this.tel_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.tel_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getTelBytes() {
                Object obj = this.tel_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.tel_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setTel(String str) {
                if (str != null) {
                    this.tel_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearTel() {
                this.tel_ = Friend.getDefaultInstance().getTel();
                onChanged();
                return this;
            }

            public Builder setTelBytes(ByteString byteString) {
                if (byteString != null) {
                    Friend.checkByteStringIsUtf8(byteString);
                    this.tel_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public int getCertFlag() {
                return this.certFlag_;
            }

            public Builder setCertFlag(int i) {
                this.certFlag_ = i;
                onChanged();
                return this;
            }

            public Builder clearCertFlag() {
                this.certFlag_ = 0;
                onChanged();
                return this;
            }

            public String getHeadImageUrl() {
                Object obj = this.headImageUrl_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.headImageUrl_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getHeadImageUrlBytes() {
                Object obj = this.headImageUrl_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.headImageUrl_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setHeadImageUrl(String str) {
                if (str != null) {
                    this.headImageUrl_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearHeadImageUrl() {
                this.headImageUrl_ = Friend.getDefaultInstance().getHeadImageUrl();
                onChanged();
                return this;
            }

            public Builder setHeadImageUrlBytes(ByteString byteString) {
                if (byteString != null) {
                    Friend.checkByteStringIsUtf8(byteString);
                    this.headImageUrl_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getAttachPicUrl() {
                Object obj = this.attachPicUrl_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.attachPicUrl_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getAttachPicUrlBytes() {
                Object obj = this.attachPicUrl_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.attachPicUrl_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setAttachPicUrl(String str) {
                if (str != null) {
                    this.attachPicUrl_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearAttachPicUrl() {
                this.attachPicUrl_ = Friend.getDefaultInstance().getAttachPicUrl();
                onChanged();
                return this;
            }

            public Builder setAttachPicUrlBytes(ByteString byteString) {
                if (byteString != null) {
                    Friend.checkByteStringIsUtf8(byteString);
                    this.attachPicUrl_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static Friend getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Friend> parser() {
            return PARSER;
        }

        public Parser<Friend> getParserForType() {
            return PARSER;
        }

        public Friend getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class RoomInfo extends GeneratedMessageV3 implements RoomInfoOrBuilder {
        private static final RoomInfo DEFAULT_INSTANCE = new RoomInfo();
        public static final int NICKNAME_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final Parser<RoomInfo> PARSER = new AbstractParser<RoomInfo>() {
            public RoomInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new RoomInfo(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int ROOMOWNER_FIELD_NUMBER = 4;
        public static final int TYPE_FIELD_NUMBER = 3;
        public static final int USERNAME_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public volatile Object nickname_;
        /* access modifiers changed from: private */
        public volatile Object roomOwner_;
        /* access modifiers changed from: private */
        public volatile Object type_;
        /* access modifiers changed from: private */
        public volatile Object username_;

        private RoomInfo(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private RoomInfo() {
            this.memoizedIsInitialized = -1;
            this.username_ = "";
            this.nickname_ = "";
            this.type_ = "";
            this.roomOwner_ = "";
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private RoomInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.username_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.nickname_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                this.type_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 34) {
                                this.roomOwner_ = codedInputStream.readStringRequireUtf8();
                            } else if (!parseUnknownFieldProto3(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw null;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MsgProtos.internal_static_com_xp_wx_middleware_RoomInfo_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MsgProtos.internal_static_com_xp_wx_middleware_RoomInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RoomInfo.class, Builder.class);
        }

        public String getUsername() {
            Object obj = this.username_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.username_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getUsernameBytes() {
            Object obj = this.username_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.username_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getNickname() {
            Object obj = this.nickname_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.nickname_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getNicknameBytes() {
            Object obj = this.nickname_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.nickname_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getType() {
            Object obj = this.type_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.type_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getTypeBytes() {
            Object obj = this.type_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.type_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getRoomOwner() {
            Object obj = this.roomOwner_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.roomOwner_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getRoomOwnerBytes() {
            Object obj = this.roomOwner_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.roomOwner_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getUsernameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.username_);
            }
            if (!getNicknameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.nickname_);
            }
            if (!getTypeBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.type_);
            }
            if (!getRoomOwnerBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.roomOwner_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!getUsernameBytes().isEmpty()) {
                i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.username_);
            }
            if (!getNicknameBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(2, this.nickname_);
            }
            if (!getTypeBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(3, this.type_);
            }
            if (!getRoomOwnerBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(4, this.roomOwner_);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RoomInfo)) {
                return super.equals(obj);
            }
            RoomInfo roomInfo = (RoomInfo) obj;
            if (!((((getUsername().equals(roomInfo.getUsername())) && getNickname().equals(roomInfo.getNickname())) && getType().equals(roomInfo.getType())) && getRoomOwner().equals(roomInfo.getRoomOwner())) || !this.unknownFields.equals(roomInfo.unknownFields)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getUsername().hashCode()) * 37) + 2) * 53) + getNickname().hashCode()) * 37) + 3) * 53) + getType().hashCode()) * 37) + 4) * 53) + getRoomOwner().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public static RoomInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static RoomInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static RoomInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static RoomInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static RoomInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static RoomInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static RoomInfo parseFrom(InputStream inputStream) throws IOException {
            return (RoomInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static RoomInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RoomInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RoomInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RoomInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static RoomInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RoomInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RoomInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (RoomInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static RoomInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RoomInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(RoomInfo roomInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(roomInfo);
        }

        public Builder toBuilder() {
            if (this == DEFAULT_INSTANCE) {
                return new Builder();
            }
            return new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RoomInfoOrBuilder {
            private Object nickname_;
            private Object roomOwner_;
            private Object type_;
            private Object username_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MsgProtos.internal_static_com_xp_wx_middleware_RoomInfo_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return MsgProtos.internal_static_com_xp_wx_middleware_RoomInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RoomInfo.class, Builder.class);
            }

            private Builder() {
                this.username_ = "";
                this.nickname_ = "";
                this.type_ = "";
                this.roomOwner_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.username_ = "";
                this.nickname_ = "";
                this.type_ = "";
                this.roomOwner_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = RoomInfo.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                this.username_ = "";
                this.nickname_ = "";
                this.type_ = "";
                this.roomOwner_ = "";
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return MsgProtos.internal_static_com_xp_wx_middleware_RoomInfo_descriptor;
            }

            public RoomInfo getDefaultInstanceForType() {
                return RoomInfo.getDefaultInstance();
            }

            public RoomInfo build() {
                RoomInfo buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public RoomInfo buildPartial() {
                RoomInfo roomInfo = new RoomInfo((GeneratedMessageV3.Builder) this);
                Object unused = roomInfo.username_ = this.username_;
                Object unused2 = roomInfo.nickname_ = this.nickname_;
                Object unused3 = roomInfo.type_ = this.type_;
                Object unused4 = roomInfo.roomOwner_ = this.roomOwner_;
                onBuilt();
                return roomInfo;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder mergeFrom(Message message) {
                if (message instanceof RoomInfo) {
                    return mergeFrom((RoomInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(RoomInfo roomInfo) {
                if (roomInfo == RoomInfo.getDefaultInstance()) {
                    return this;
                }
                if (!roomInfo.getUsername().isEmpty()) {
                    this.username_ = roomInfo.username_;
                    onChanged();
                }
                if (!roomInfo.getNickname().isEmpty()) {
                    this.nickname_ = roomInfo.nickname_;
                    onChanged();
                }
                if (!roomInfo.getType().isEmpty()) {
                    this.type_ = roomInfo.type_;
                    onChanged();
                }
                if (!roomInfo.getRoomOwner().isEmpty()) {
                    this.roomOwner_ = roomInfo.roomOwner_;
                    onChanged();
                }
                mergeUnknownFields(roomInfo.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.xp.wx.middleware.MsgProtos.RoomInfo.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.xp.wx.middleware.MsgProtos.RoomInfo.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.xp.wx.middleware.MsgProtos$RoomInfo r3 = (com.xp.wx.middleware.MsgProtos.RoomInfo) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.RoomInfo) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.xp.wx.middleware.MsgProtos$RoomInfo r4 = (com.xp.wx.middleware.MsgProtos.RoomInfo) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.RoomInfo) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.middleware.MsgProtos.RoomInfo.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.xp.wx.middleware.MsgProtos$RoomInfo$Builder");
            }

            public String getUsername() {
                Object obj = this.username_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.username_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getUsernameBytes() {
                Object obj = this.username_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.username_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setUsername(String str) {
                if (str != null) {
                    this.username_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearUsername() {
                this.username_ = RoomInfo.getDefaultInstance().getUsername();
                onChanged();
                return this;
            }

            public Builder setUsernameBytes(ByteString byteString) {
                if (byteString != null) {
                    RoomInfo.checkByteStringIsUtf8(byteString);
                    this.username_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getNickname() {
                Object obj = this.nickname_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.nickname_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getNicknameBytes() {
                Object obj = this.nickname_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.nickname_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setNickname(String str) {
                if (str != null) {
                    this.nickname_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearNickname() {
                this.nickname_ = RoomInfo.getDefaultInstance().getNickname();
                onChanged();
                return this;
            }

            public Builder setNicknameBytes(ByteString byteString) {
                if (byteString != null) {
                    RoomInfo.checkByteStringIsUtf8(byteString);
                    this.nickname_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getType() {
                Object obj = this.type_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.type_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getTypeBytes() {
                Object obj = this.type_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.type_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setType(String str) {
                if (str != null) {
                    this.type_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearType() {
                this.type_ = RoomInfo.getDefaultInstance().getType();
                onChanged();
                return this;
            }

            public Builder setTypeBytes(ByteString byteString) {
                if (byteString != null) {
                    RoomInfo.checkByteStringIsUtf8(byteString);
                    this.type_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getRoomOwner() {
                Object obj = this.roomOwner_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.roomOwner_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getRoomOwnerBytes() {
                Object obj = this.roomOwner_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.roomOwner_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setRoomOwner(String str) {
                if (str != null) {
                    this.roomOwner_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearRoomOwner() {
                this.roomOwner_ = RoomInfo.getDefaultInstance().getRoomOwner();
                onChanged();
                return this;
            }

            public Builder setRoomOwnerBytes(ByteString byteString) {
                if (byteString != null) {
                    RoomInfo.checkByteStringIsUtf8(byteString);
                    this.roomOwner_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static RoomInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<RoomInfo> parser() {
            return PARSER;
        }

        public Parser<RoomInfo> getParserForType() {
            return PARSER;
        }

        public RoomInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class MemberInfo extends GeneratedMessageV3 implements MemberInfoOrBuilder {
        public static final int ALIAS_FIELD_NUMBER = 1;
        public static final int BIGHEADIMAGE_FIELD_NUMBER = 7;
        private static final MemberInfo DEFAULT_INSTANCE = new MemberInfo();
        public static final int NICKNAME_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final Parser<MemberInfo> PARSER = new AbstractParser<MemberInfo>() {
            public MemberInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new MemberInfo(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int REMARK_FIELD_NUMBER = 5;
        public static final int ROOMNICKNAME_FIELD_NUMBER = 4;
        public static final int SMALLHEADIMAGE_FIELD_NUMBER = 6;
        public static final int USERNAME_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public volatile Object alias_;
        /* access modifiers changed from: private */
        public volatile Object bigHeadImage_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public volatile Object nickname_;
        /* access modifiers changed from: private */
        public volatile Object remark_;
        /* access modifiers changed from: private */
        public volatile Object roomNickname_;
        /* access modifiers changed from: private */
        public volatile Object smallHeadImage_;
        /* access modifiers changed from: private */
        public volatile Object username_;

        private MemberInfo(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private MemberInfo() {
            this.memoizedIsInitialized = -1;
            this.alias_ = "";
            this.username_ = "";
            this.nickname_ = "";
            this.roomNickname_ = "";
            this.remark_ = "";
            this.smallHeadImage_ = "";
            this.bigHeadImage_ = "";
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private MemberInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.alias_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.username_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                this.nickname_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 34) {
                                this.roomNickname_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 42) {
                                this.remark_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 50) {
                                this.smallHeadImage_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 58) {
                                this.bigHeadImage_ = codedInputStream.readStringRequireUtf8();
                            } else if (!parseUnknownFieldProto3(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw null;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MsgProtos.internal_static_com_xp_wx_middleware_MemberInfo_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MsgProtos.internal_static_com_xp_wx_middleware_MemberInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(MemberInfo.class, Builder.class);
        }

        public String getAlias() {
            Object obj = this.alias_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.alias_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getAliasBytes() {
            Object obj = this.alias_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.alias_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getUsername() {
            Object obj = this.username_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.username_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getUsernameBytes() {
            Object obj = this.username_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.username_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getNickname() {
            Object obj = this.nickname_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.nickname_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getNicknameBytes() {
            Object obj = this.nickname_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.nickname_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getRoomNickname() {
            Object obj = this.roomNickname_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.roomNickname_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getRoomNicknameBytes() {
            Object obj = this.roomNickname_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.roomNickname_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getRemark() {
            Object obj = this.remark_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.remark_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getRemarkBytes() {
            Object obj = this.remark_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.remark_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getSmallHeadImage() {
            Object obj = this.smallHeadImage_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.smallHeadImage_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getSmallHeadImageBytes() {
            Object obj = this.smallHeadImage_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.smallHeadImage_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getBigHeadImage() {
            Object obj = this.bigHeadImage_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.bigHeadImage_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getBigHeadImageBytes() {
            Object obj = this.bigHeadImage_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bigHeadImage_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getAliasBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.alias_);
            }
            if (!getUsernameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.username_);
            }
            if (!getNicknameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.nickname_);
            }
            if (!getRoomNicknameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.roomNickname_);
            }
            if (!getRemarkBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 5, this.remark_);
            }
            if (!getSmallHeadImageBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 6, this.smallHeadImage_);
            }
            if (!getBigHeadImageBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 7, this.bigHeadImage_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!getAliasBytes().isEmpty()) {
                i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.alias_);
            }
            if (!getUsernameBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(2, this.username_);
            }
            if (!getNicknameBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(3, this.nickname_);
            }
            if (!getRoomNicknameBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(4, this.roomNickname_);
            }
            if (!getRemarkBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(5, this.remark_);
            }
            if (!getSmallHeadImageBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(6, this.smallHeadImage_);
            }
            if (!getBigHeadImageBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(7, this.bigHeadImage_);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MemberInfo)) {
                return super.equals(obj);
            }
            MemberInfo memberInfo = (MemberInfo) obj;
            if (!(((((((getAlias().equals(memberInfo.getAlias())) && getUsername().equals(memberInfo.getUsername())) && getNickname().equals(memberInfo.getNickname())) && getRoomNickname().equals(memberInfo.getRoomNickname())) && getRemark().equals(memberInfo.getRemark())) && getSmallHeadImage().equals(memberInfo.getSmallHeadImage())) && getBigHeadImage().equals(memberInfo.getBigHeadImage())) || !this.unknownFields.equals(memberInfo.unknownFields)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getAlias().hashCode()) * 37) + 2) * 53) + getUsername().hashCode()) * 37) + 3) * 53) + getNickname().hashCode()) * 37) + 4) * 53) + getRoomNickname().hashCode()) * 37) + 5) * 53) + getRemark().hashCode()) * 37) + 6) * 53) + getSmallHeadImage().hashCode()) * 37) + 7) * 53) + getBigHeadImage().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public static MemberInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static MemberInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static MemberInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static MemberInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static MemberInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static MemberInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static MemberInfo parseFrom(InputStream inputStream) throws IOException {
            return (MemberInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static MemberInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MemberInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MemberInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MemberInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static MemberInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MemberInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MemberInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (MemberInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static MemberInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MemberInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(MemberInfo memberInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(memberInfo);
        }

        public Builder toBuilder() {
            if (this == DEFAULT_INSTANCE) {
                return new Builder();
            }
            return new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MemberInfoOrBuilder {
            private Object alias_;
            private Object bigHeadImage_;
            private Object nickname_;
            private Object remark_;
            private Object roomNickname_;
            private Object smallHeadImage_;
            private Object username_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MsgProtos.internal_static_com_xp_wx_middleware_MemberInfo_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return MsgProtos.internal_static_com_xp_wx_middleware_MemberInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(MemberInfo.class, Builder.class);
            }

            private Builder() {
                this.alias_ = "";
                this.username_ = "";
                this.nickname_ = "";
                this.roomNickname_ = "";
                this.remark_ = "";
                this.smallHeadImage_ = "";
                this.bigHeadImage_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.alias_ = "";
                this.username_ = "";
                this.nickname_ = "";
                this.roomNickname_ = "";
                this.remark_ = "";
                this.smallHeadImage_ = "";
                this.bigHeadImage_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = MemberInfo.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                this.alias_ = "";
                this.username_ = "";
                this.nickname_ = "";
                this.roomNickname_ = "";
                this.remark_ = "";
                this.smallHeadImage_ = "";
                this.bigHeadImage_ = "";
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return MsgProtos.internal_static_com_xp_wx_middleware_MemberInfo_descriptor;
            }

            public MemberInfo getDefaultInstanceForType() {
                return MemberInfo.getDefaultInstance();
            }

            public MemberInfo build() {
                MemberInfo buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public MemberInfo buildPartial() {
                MemberInfo memberInfo = new MemberInfo((GeneratedMessageV3.Builder) this);
                Object unused = memberInfo.alias_ = this.alias_;
                Object unused2 = memberInfo.username_ = this.username_;
                Object unused3 = memberInfo.nickname_ = this.nickname_;
                Object unused4 = memberInfo.roomNickname_ = this.roomNickname_;
                Object unused5 = memberInfo.remark_ = this.remark_;
                Object unused6 = memberInfo.smallHeadImage_ = this.smallHeadImage_;
                Object unused7 = memberInfo.bigHeadImage_ = this.bigHeadImage_;
                onBuilt();
                return memberInfo;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder mergeFrom(Message message) {
                if (message instanceof MemberInfo) {
                    return mergeFrom((MemberInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(MemberInfo memberInfo) {
                if (memberInfo == MemberInfo.getDefaultInstance()) {
                    return this;
                }
                if (!memberInfo.getAlias().isEmpty()) {
                    this.alias_ = memberInfo.alias_;
                    onChanged();
                }
                if (!memberInfo.getUsername().isEmpty()) {
                    this.username_ = memberInfo.username_;
                    onChanged();
                }
                if (!memberInfo.getNickname().isEmpty()) {
                    this.nickname_ = memberInfo.nickname_;
                    onChanged();
                }
                if (!memberInfo.getRoomNickname().isEmpty()) {
                    this.roomNickname_ = memberInfo.roomNickname_;
                    onChanged();
                }
                if (!memberInfo.getRemark().isEmpty()) {
                    this.remark_ = memberInfo.remark_;
                    onChanged();
                }
                if (!memberInfo.getSmallHeadImage().isEmpty()) {
                    this.smallHeadImage_ = memberInfo.smallHeadImage_;
                    onChanged();
                }
                if (!memberInfo.getBigHeadImage().isEmpty()) {
                    this.bigHeadImage_ = memberInfo.bigHeadImage_;
                    onChanged();
                }
                mergeUnknownFields(memberInfo.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.xp.wx.middleware.MsgProtos.MemberInfo.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.xp.wx.middleware.MsgProtos.MemberInfo.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.xp.wx.middleware.MsgProtos$MemberInfo r3 = (com.xp.wx.middleware.MsgProtos.MemberInfo) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.MemberInfo) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.xp.wx.middleware.MsgProtos$MemberInfo r4 = (com.xp.wx.middleware.MsgProtos.MemberInfo) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.xp.wx.middleware.MsgProtos.MemberInfo) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.middleware.MsgProtos.MemberInfo.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.xp.wx.middleware.MsgProtos$MemberInfo$Builder");
            }

            public String getAlias() {
                Object obj = this.alias_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.alias_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getAliasBytes() {
                Object obj = this.alias_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.alias_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setAlias(String str) {
                if (str != null) {
                    this.alias_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearAlias() {
                this.alias_ = MemberInfo.getDefaultInstance().getAlias();
                onChanged();
                return this;
            }

            public Builder setAliasBytes(ByteString byteString) {
                if (byteString != null) {
                    MemberInfo.checkByteStringIsUtf8(byteString);
                    this.alias_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getUsername() {
                Object obj = this.username_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.username_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getUsernameBytes() {
                Object obj = this.username_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.username_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setUsername(String str) {
                if (str != null) {
                    this.username_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearUsername() {
                this.username_ = MemberInfo.getDefaultInstance().getUsername();
                onChanged();
                return this;
            }

            public Builder setUsernameBytes(ByteString byteString) {
                if (byteString != null) {
                    MemberInfo.checkByteStringIsUtf8(byteString);
                    this.username_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getNickname() {
                Object obj = this.nickname_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.nickname_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getNicknameBytes() {
                Object obj = this.nickname_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.nickname_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setNickname(String str) {
                if (str != null) {
                    this.nickname_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearNickname() {
                this.nickname_ = MemberInfo.getDefaultInstance().getNickname();
                onChanged();
                return this;
            }

            public Builder setNicknameBytes(ByteString byteString) {
                if (byteString != null) {
                    MemberInfo.checkByteStringIsUtf8(byteString);
                    this.nickname_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getRoomNickname() {
                Object obj = this.roomNickname_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.roomNickname_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getRoomNicknameBytes() {
                Object obj = this.roomNickname_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.roomNickname_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setRoomNickname(String str) {
                if (str != null) {
                    this.roomNickname_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearRoomNickname() {
                this.roomNickname_ = MemberInfo.getDefaultInstance().getRoomNickname();
                onChanged();
                return this;
            }

            public Builder setRoomNicknameBytes(ByteString byteString) {
                if (byteString != null) {
                    MemberInfo.checkByteStringIsUtf8(byteString);
                    this.roomNickname_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getRemark() {
                Object obj = this.remark_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.remark_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getRemarkBytes() {
                Object obj = this.remark_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.remark_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setRemark(String str) {
                if (str != null) {
                    this.remark_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearRemark() {
                this.remark_ = MemberInfo.getDefaultInstance().getRemark();
                onChanged();
                return this;
            }

            public Builder setRemarkBytes(ByteString byteString) {
                if (byteString != null) {
                    MemberInfo.checkByteStringIsUtf8(byteString);
                    this.remark_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getSmallHeadImage() {
                Object obj = this.smallHeadImage_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.smallHeadImage_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getSmallHeadImageBytes() {
                Object obj = this.smallHeadImage_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.smallHeadImage_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setSmallHeadImage(String str) {
                if (str != null) {
                    this.smallHeadImage_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearSmallHeadImage() {
                this.smallHeadImage_ = MemberInfo.getDefaultInstance().getSmallHeadImage();
                onChanged();
                return this;
            }

            public Builder setSmallHeadImageBytes(ByteString byteString) {
                if (byteString != null) {
                    MemberInfo.checkByteStringIsUtf8(byteString);
                    this.smallHeadImage_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getBigHeadImage() {
                Object obj = this.bigHeadImage_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.bigHeadImage_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getBigHeadImageBytes() {
                Object obj = this.bigHeadImage_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.bigHeadImage_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setBigHeadImage(String str) {
                if (str != null) {
                    this.bigHeadImage_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearBigHeadImage() {
                this.bigHeadImage_ = MemberInfo.getDefaultInstance().getBigHeadImage();
                onChanged();
                return this;
            }

            public Builder setBigHeadImageBytes(ByteString byteString) {
                if (byteString != null) {
                    MemberInfo.checkByteStringIsUtf8(byteString);
                    this.bigHeadImage_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFieldsProto3(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static MemberInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MemberInfo> parser() {
            return PARSER;
        }

        public Parser<MemberInfo> getParserForType() {
            return PARSER;
        }

        public MemberInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n$com/xp/wx/middleware/MsgProtos.proto\u0012\u0014com.xp.wx.middleware\"ø\u0001\n\u0003Cmd\u0012\u000b\n\u0003cmd\u0018\u0001 \u0001(\u0005\u0012\u0011\n\ttimestamp\u0018\u0002 \u0001(\u0003\u0012\u0014\n\ffromClientId\u0018\u0003 \u0001(\t\u0012\u0012\n\ntoClientId\u0018\u0004 \u0001(\t\u0012\u000f\n\u0007cmdData\u0018\u0005 \u0001(\f\u0012\u000e\n\u0006status\u0018\u0006 \u0001(\u0005\u0012\u0010\n\bpriority\u0018\u0007 \u0001(\u0005\u0012\u000f\n\u0007localId\u0018\b \u0001(\t\u0012\u0010\n\bserverId\u0018\t \u0001(\t\u0012\u000f\n\u0007channel\u0018\n \u0003(\t\u0012\u000b\n\u0003msg\u0018\u000b \u0001(\t\u0012\f\n\u0004desc\u0018\f \u0001(\t\u0012\u0011\n\tlocalDBId\u0018\r \u0001(\u0005\u0012\u0012\n\nretryCount\u0018\u000e \u0001(\u0005\"Ä\u0001\n\bCmdData1\u0012\u000b\n\u0003tel\u0018\u0001 \u0001(\t\u0012\u0014\n\fmobileSerial\u0018\u0002 \u0001(\t\u0012\u0010\n\bnickname\u0018\u0003 \u0001(\t\u0012\u0010\n\busername\u0018\u0004 \u0001(\t\u0012\u000e\n\u0006vision\u0018\u0005 \u0001(\t\u0012\u000f\n\u0007channel\u0018\u0006 \u0001(\u0005\u0012\u000e\n\u0006apkUrl\u0018\u0007 \u0001(\t\u0012\u0013\n\u000bmobileModel\u0018\b \u0001(\t\u0012\u0016\n\u000eandroidVersion\u0018\t \u0001(\t\u0012\u0013\n\u000bsboxVersion\u0018\n \u0001(\t\"Å\u0001\n\u000bCmdData2002\u0012\u0010\n\busername\u0018\u0001 \u0001(\t\u0012\u0010\n\bnickname\u0018\u0002 \u0001(\t\u0012\u000b\n\u0003sex\u0018\u0004 \u0001(\t\u0012\u0011\n\tsignature\u0018\u0005 \u0001(\t\u0012\u0013\n\u000bcountryCode\u0018\u0006 \u0001(\t\u0012\u0014\n\fprovinceCode\u0018\u0007 \u0001(\t\u0012\u0013\n\u000bprovinceStr\u0018\b \u0001(\t\u0012\u0010\n\bcityCode\u0018\t \u0001(\t\u0012\u000f\n\u0007cityStr\u0018\n \u0001(\t\u0012\u000f\n\u0007headImg\u0018\u000b \u0001(\t\">\n\u000bCmdData2003\u0012\u000e\n\u0006toUser\u0018\u0001 \u0001(\t\u0012\u000f\n\u0007content\u0018\u0002 \u0001(\t\u0012\u000e\n\u0006atuser\u0018\u0003 \u0003(\t\".\n\u000bCmdData2004\u0012\u000e\n\u0006toUser\u0018\u0001 \u0001(\t\u0012\u000f\n\u0007imgpath\u0018\u0002 \u0003(\t\"?\n\u000bCmdData2009\u00120\n\nfriendList\u0018\u0001 \u0003(\u000b2\u001c.com.xp.wx.middleware.Friend\"?\n\u000bCmdData2011\u00120\n\broomList\u0018\u0001 \u0003(\u000b2\u001e.com.xp.wx.middleware.RoomInfo\"¤\u0001\n\u000bCmdData2012\u0012\u0010\n\busername\u0018\u0001 \u0001(\t\u0012\u0011\n\troomOwner\u0018\u0002 \u0001(\t\u0012\u0012\n\nroomNotice\u0018\u0003 \u0001(\t\u0012\u0014\n\fnoticeEditor\u0018\u0004 \u0001(\t\u00124\n\nmemberList\u0018\u0005 \u0003(\u000b2 .com.xp.wx.middleware.MemberInfo\u0012\u0010\n\broomName\u0018\u0006 \u0001(\t\";\n\u000bCmdData2014\u0012\u0010\n\busername\u0018\u0001 \u0001(\t\u0012\u001a\n\u0012friendUsernameList\u0018\u0002 \u0003(\t\"2\n\u000bCmdData2015\u0012\u0010\n\busername\u0018\u0001 \u0001(\t\u0012\u0011\n\tmemberIds\u0018\u0002 \u0003(\t\"2\n\u000bCmdData2016\u0012\u0010\n\busername\u0018\u0001 \u0001(\t\u0012\u0011\n\tmemberIds\u0018\u0002 \u0003(\t\"1\n\u000bCmdData2018\u0012\u0010\n\busername\u0018\u0001 \u0001(\t\u0012\u0010\n\bnickname\u0018\u0002 \u0001(\t\"/\n\u000bCmdData2020\u0012\u0010\n\busername\u0018\u0001 \u0001(\t\u0012\u000e\n\u0006qrcode\u0018\u0002 \u0001(\t\"6\n\u000bCmdData2021\u0012\u0010\n\busername\u0018\u0001 \u0001(\t\u0012\u0015\n\rnoticeContent\u0018\u0002 \u0001(\t\"/\n\u000bCmdData2026\u0012\u0010\n\busername\u0018\u0001 \u0001(\t\u0012\u000e\n\u0006ticket\u0018\u0002 \u0001(\t\"\u001d\n\u000bCmdData2032\u0012\u000e\n\u0006qrcode\u0018\u0001 \u0001(\t\"\u0002\n\u000bCmdData2036\u0012\u0010\n\busername\u0018\u0001 \u0001(\t\u0012\u000b\n\u0003sex\u0018\u0002 \u0001(\t\u0012\u0010\n\bprovince\u0018\u0003 \u0001(\t\u0012\f\n\u0004city\u0018\u0004 \u0001(\t\u0012\u000e\n\u0006remark\u0018\u0005 \u0001(\t\u0012\u0010\n\blabelIds\u0018\u0006 \u0001(\t\u0012\u0012\n\nlabelNames\u0018\u0007 \u0001(\t\u0012\u0010\n\bnickname\u0018\b \u0001(\t\u0012\u0011\n\tsignature\u0018\t \u0001(\t\u0012\u0016\n\u000esmallHeadImage\u0018\n \u0001(\t\u0012\u0014\n\fbigHeadImage\u0018\u000b \u0001(\t\u0012\f\n\u0004desc\u0018\f \u0001(\t\u0012\u000b\n\u0003tel\u0018\r \u0001(\t\u0012\u0011\n\tattachPic\u0018\u000e \u0001(\t\"7\n\u000bCmdData2067\u0012\f\n\u0004date\u0018\u0001 \u0001(\t\u0012\n\n\u0002id\u0018\u0002 \u0001(\u0003\u0012\u000e\n\u0006result\u0018\u0003 \u0001(\t\"-\n\u000bCmdData2068\u0012\u000e\n\u0006roomId\u0018\u0001 \u0001(\t\u0012\u000e\n\u0006qrcode\u0018\u0002 \u0001(\t\")\n\u000bCmdData4001\u0012\u000e\n\u0006status\u0018\u0001 \u0001(\u0005\u0012\n\n\u0002id\u0018\u0002 \u0001(\t\"\u001d\n\u000bCmdData4003\u0012\u000e\n\u0006roomId\u0018\u0001 \u0003(\t\"\u0001\n\u000bCmdData4005\u0012\u0012\n\nactivityId\u0018\u0001 \u0001(\t\u0012\u0018\n\u0010superiorUsername\u0018\u0002 \u0001(\t\u0012\u0018\n\u0010superiorNickname\u0018\u0003 \u0001(\t\u0012\u0014\n\fsupportCount\u0018\u0004 \u0001(\u0005\u0012\u0017\n\u000fsupportNickname\u0018\u0005 \u0001(\t\u0012\u0014\n\fisInviteRoom\u0018\u0006 \u0001(\u0005\"×\u0001\n\u000bCmdData1002\u0012\u0014\n\ffromUsername\u0018\u0001 \u0001(\t\u0012\u0010\n\bnickname\u0018\u0002 \u0001(\t\u0012\u0015\n\rverifyContent\u0018\u0003 \u0001(\t\u0012\r\n\u0005scene\u0018\u0004 \u0001(\t\u0012\u000f\n\u0007country\u0018\u0005 \u0001(\t\u0012\u0010\n\bprovince\u0018\u0006 \u0001(\t\u0012\f\n\u0004city\u0018\u0007 \u0001(\t\u0012\f\n\u0004sign\u0018\b \u0001(\t\u0012\u000b\n\u0003sex\u0018\t \u0001(\t\u0012\r\n\u0005alias\u0018\n \u0001(\t\u0012\u000e\n\u0006ticket\u0018\u000b \u0001(\t\u0012\u000f\n\u0007headImg\u0018\f \u0001(\t\"®\u0001\n\u000bCmdData1003\u0012\f\n\u0004type\u0018\u0001 \u0001(\t\u0012\u0014\n\ffromUsername\u0018\u0002 \u0001(\t\u0012\u0012\n\ntoUsername\u0018\u0003 \u0001(\t\u0012\u000b\n\u0003msg\u0018\u0004 \u0001(\t\u0012*\n\u0004user\u0018\u0005 \u0001(\u000b2\u001c.com.xp.wx.middleware.Friend\u0012.\n\buserList\u0018\u0006 \u0003(\u000b2\u001c.com.xp.wx.middleware.Friend\"Õ\u0001\n\u000bCmdData1004\u0012\u0010\n\busername\u0018\u0001 \u0001(\t\u0012\u000b\n\u0003sex\u0018\u0002 \u0001(\t\u0012\u0010\n\bprovince\u0018\u0003 \u0001(\t\u0012\f\n\u0004city\u0018\u0004 \u0001(\t\u0012\u000e\n\u0006remark\u0018\u0005 \u0001(\t\u0012\u0010\n\blabelIds\u0018\u0006 \u0001(\t\u0012\u0012\n\nlabelNames\u0018\u0007 \u0001(\t\u0012\u0010\n\bnickname\u0018\b \u0001(\t\u0012\u0011\n\tsignature\u0018\t \u0001(\t\u0012\u0016\n\u000esmallHeadImage\u0018\n \u0001(\t\u0012\u0014\n\fbigHeadImage\u0018\u000b \u0001(\t\"\u0002\n\u0006Friend\u0012\r\n\u0005alias\u0018\u0001 \u0001(\t\u0012\u0010\n\busername\u0018\u0002 \u0001(\t\u0012\u0011\n\tconRemark\u0018\u0003 \u0001(\t\u0012\u0010\n\bnickname\u0018\u0004 \u0001(\t\u0012\u000b\n\u0003sex\u0018\u0005 \u0001(\t\u0012\u0010\n\bprovince\u0018\u0006 \u0001(\t\u0012\f\n\u0004city\u0018\u0007 \u0001(\t\u0012\u0010\n\blabelIds\u0018\b \u0001(\t\u0012\u0012\n\nlabelNames\u0018\t \u0001(\t\u0012\u0011\n\tsignature\u0018\n \u0001(\t\u0012\u0010\n\bv2Ticket\u0018\u000b \u0001(\t\u0012\f\n\u0004desc\u0018\f \u0001(\t\u0012\u000b\n\u0003tel\u0018\r \u0001(\t\u0012\u0010\n\bcertFlag\u0018\u000e \u0001(\u0005\u0012\u0014\n\fheadImageUrl\u0018\u000f \u0001(\t\u0012\u0014\n\fattachPicUrl\u0018\u0010 \u0001(\t\"O\n\bRoomInfo\u0012\u0010\n\busername\u0018\u0001 \u0001(\t\u0012\u0010\n\bnickname\u0018\u0002 \u0001(\t\u0012\f\n\u0004type\u0018\u0003 \u0001(\t\u0012\u0011\n\troomOwner\u0018\u0004 \u0001(\t\"\u0001\n\nMemberInfo\u0012\r\n\u0005alias\u0018\u0001 \u0001(\t\u0012\u0010\n\busername\u0018\u0002 \u0001(\t\u0012\u0010\n\bnickname\u0018\u0003 \u0001(\t\u0012\u0014\n\froomNickname\u0018\u0004 \u0001(\t\u0012\u000e\n\u0006remark\u0018\u0005 \u0001(\t\u0012\u0016\n\u000esmallHeadImage\u0018\u0006 \u0001(\t\u0012\u0014\n\fbigHeadImage\u0018\u0007 \u0001(\tb\u0006proto3"}, new Descriptors.FileDescriptor[0], new Descriptors.FileDescriptor.InternalDescriptorAssigner() {
            public ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor fileDescriptor) {
                Descriptors.FileDescriptor unused = MsgProtos.descriptor = fileDescriptor;
                return null;
            }
        });
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_com_xp_wx_middleware_Cmd_descriptor = descriptor2;
        internal_static_com_xp_wx_middleware_Cmd_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Cmd", "Timestamp", "FromClientId", "ToClientId", "CmdData", "Status", "Priority", "LocalId", "ServerId", "Channel", "Msg", "Desc", "LocalDBId", "RetryCount"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_com_xp_wx_middleware_CmdData1_descriptor = descriptor3;
        internal_static_com_xp_wx_middleware_CmdData1_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Tel", "MobileSerial", "Nickname", "Username", "Vision", "Channel", "ApkUrl", "MobileModel", "AndroidVersion", "SboxVersion"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_com_xp_wx_middleware_CmdData2002_descriptor = descriptor4;
        internal_static_com_xp_wx_middleware_CmdData2002_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Username", "Nickname", "Sex", "Signature", "CountryCode", "ProvinceCode", "ProvinceStr", "CityCode", "CityStr", "HeadImg"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_com_xp_wx_middleware_CmdData2003_descriptor = descriptor5;
        internal_static_com_xp_wx_middleware_CmdData2003_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"ToUser", "Content", "Atuser"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_com_xp_wx_middleware_CmdData2004_descriptor = descriptor6;
        internal_static_com_xp_wx_middleware_CmdData2004_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"ToUser", "Imgpath"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_com_xp_wx_middleware_CmdData2009_descriptor = descriptor7;
        internal_static_com_xp_wx_middleware_CmdData2009_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"FriendList"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_com_xp_wx_middleware_CmdData2011_descriptor = descriptor8;
        internal_static_com_xp_wx_middleware_CmdData2011_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"RoomList"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_com_xp_wx_middleware_CmdData2012_descriptor = descriptor9;
        internal_static_com_xp_wx_middleware_CmdData2012_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"Username", "RoomOwner", "RoomNotice", "NoticeEditor", "MemberList", "RoomName"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(8);
        internal_static_com_xp_wx_middleware_CmdData2014_descriptor = descriptor10;
        internal_static_com_xp_wx_middleware_CmdData2014_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Username", "FriendUsernameList"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(9);
        internal_static_com_xp_wx_middleware_CmdData2015_descriptor = descriptor11;
        internal_static_com_xp_wx_middleware_CmdData2015_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"Username", "MemberIds"});
        Descriptors.Descriptor descriptor12 = getDescriptor().getMessageTypes().get(10);
        internal_static_com_xp_wx_middleware_CmdData2016_descriptor = descriptor12;
        internal_static_com_xp_wx_middleware_CmdData2016_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"Username", "MemberIds"});
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(11);
        internal_static_com_xp_wx_middleware_CmdData2018_descriptor = descriptor13;
        internal_static_com_xp_wx_middleware_CmdData2018_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"Username", "Nickname"});
        Descriptors.Descriptor descriptor14 = getDescriptor().getMessageTypes().get(12);
        internal_static_com_xp_wx_middleware_CmdData2020_descriptor = descriptor14;
        internal_static_com_xp_wx_middleware_CmdData2020_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"Username", "Qrcode"});
        Descriptors.Descriptor descriptor15 = getDescriptor().getMessageTypes().get(13);
        internal_static_com_xp_wx_middleware_CmdData2021_descriptor = descriptor15;
        internal_static_com_xp_wx_middleware_CmdData2021_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{"Username", "NoticeContent"});
        Descriptors.Descriptor descriptor16 = getDescriptor().getMessageTypes().get(14);
        internal_static_com_xp_wx_middleware_CmdData2026_descriptor = descriptor16;
        internal_static_com_xp_wx_middleware_CmdData2026_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor16, new String[]{"Username", "Ticket"});
        Descriptors.Descriptor descriptor17 = getDescriptor().getMessageTypes().get(15);
        internal_static_com_xp_wx_middleware_CmdData2032_descriptor = descriptor17;
        internal_static_com_xp_wx_middleware_CmdData2032_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor17, new String[]{"Qrcode"});
        Descriptors.Descriptor descriptor18 = getDescriptor().getMessageTypes().get(16);
        internal_static_com_xp_wx_middleware_CmdData2036_descriptor = descriptor18;
        internal_static_com_xp_wx_middleware_CmdData2036_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor18, new String[]{"Username", "Sex", "Province", "City", "Remark", "LabelIds", "LabelNames", "Nickname", "Signature", "SmallHeadImage", "BigHeadImage", "Desc", "Tel", "AttachPic"});
        Descriptors.Descriptor descriptor19 = getDescriptor().getMessageTypes().get(17);
        internal_static_com_xp_wx_middleware_CmdData2067_descriptor = descriptor19;
        internal_static_com_xp_wx_middleware_CmdData2067_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor19, new String[]{"Date", "Id", "Result"});
        Descriptors.Descriptor descriptor20 = getDescriptor().getMessageTypes().get(18);
        internal_static_com_xp_wx_middleware_CmdData2068_descriptor = descriptor20;
        internal_static_com_xp_wx_middleware_CmdData2068_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor20, new String[]{"RoomId", "Qrcode"});
        Descriptors.Descriptor descriptor21 = getDescriptor().getMessageTypes().get(19);
        internal_static_com_xp_wx_middleware_CmdData4001_descriptor = descriptor21;
        internal_static_com_xp_wx_middleware_CmdData4001_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor21, new String[]{"Status", "Id"});
        Descriptors.Descriptor descriptor22 = getDescriptor().getMessageTypes().get(20);
        internal_static_com_xp_wx_middleware_CmdData4003_descriptor = descriptor22;
        internal_static_com_xp_wx_middleware_CmdData4003_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor22, new String[]{"RoomId"});
        Descriptors.Descriptor descriptor23 = getDescriptor().getMessageTypes().get(21);
        internal_static_com_xp_wx_middleware_CmdData4005_descriptor = descriptor23;
        internal_static_com_xp_wx_middleware_CmdData4005_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor23, new String[]{"ActivityId", "SuperiorUsername", "SuperiorNickname", "SupportCount", "SupportNickname", "IsInviteRoom"});
        Descriptors.Descriptor descriptor24 = getDescriptor().getMessageTypes().get(22);
        internal_static_com_xp_wx_middleware_CmdData1002_descriptor = descriptor24;
        internal_static_com_xp_wx_middleware_CmdData1002_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor24, new String[]{"FromUsername", "Nickname", "VerifyContent", "Scene", "Country", "Province", "City", "Sign", "Sex", "Alias", "Ticket", "HeadImg"});
        Descriptors.Descriptor descriptor25 = getDescriptor().getMessageTypes().get(23);
        internal_static_com_xp_wx_middleware_CmdData1003_descriptor = descriptor25;
        internal_static_com_xp_wx_middleware_CmdData1003_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor25, new String[]{"Type", "FromUsername", "ToUsername", "Msg", "User", "UserList"});
        Descriptors.Descriptor descriptor26 = getDescriptor().getMessageTypes().get(24);
        internal_static_com_xp_wx_middleware_CmdData1004_descriptor = descriptor26;
        internal_static_com_xp_wx_middleware_CmdData1004_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor26, new String[]{"Username", "Sex", "Province", "City", "Remark", "LabelIds", "LabelNames", "Nickname", "Signature", "SmallHeadImage", "BigHeadImage"});
        Descriptors.Descriptor descriptor27 = getDescriptor().getMessageTypes().get(25);
        internal_static_com_xp_wx_middleware_Friend_descriptor = descriptor27;
        internal_static_com_xp_wx_middleware_Friend_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor27, new String[]{"Alias", "Username", "ConRemark", "Nickname", "Sex", "Province", "City", "LabelIds", "LabelNames", "Signature", "V2Ticket", "Desc", "Tel", "CertFlag", "HeadImageUrl", "AttachPicUrl"});
        Descriptors.Descriptor descriptor28 = getDescriptor().getMessageTypes().get(26);
        internal_static_com_xp_wx_middleware_RoomInfo_descriptor = descriptor28;
        internal_static_com_xp_wx_middleware_RoomInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor28, new String[]{"Username", "Nickname", "Type", "RoomOwner"});
        Descriptors.Descriptor descriptor29 = getDescriptor().getMessageTypes().get(27);
        internal_static_com_xp_wx_middleware_MemberInfo_descriptor = descriptor29;
        internal_static_com_xp_wx_middleware_MemberInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor29, new String[]{"Alias", "Username", "Nickname", "RoomNickname", "Remark", "SmallHeadImage", "BigHeadImage"});
    }
}
