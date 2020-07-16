package com.xp.wx.middleware;

import android.os.Handler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/xp/wx/middleware/BotInfo;", "", "()V", "Companion", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: BotInfo.kt */
public final class BotInfo {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static String WeChatID = "";
    /* access modifiers changed from: private */
    public static String down_queue = "";
    /* access modifiers changed from: private */
    public static String heartBeat = "";
    /* access modifiers changed from: private */
    public static Handler mHandler;
    /* access modifiers changed from: private */
    public static String status = "";
    /* access modifiers changed from: private */
    public static String up_queue = "";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001b\u001a\u00020\u001cR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\b¨\u0006\u001d"}, d2 = {"Lcom/xp/wx/middleware/BotInfo$Companion;", "", "()V", "WeChatID", "", "getWeChatID", "()Ljava/lang/String;", "setWeChatID", "(Ljava/lang/String;)V", "down_queue", "getDown_queue", "setDown_queue", "heartBeat", "getHeartBeat", "setHeartBeat", "mHandler", "Landroid/os/Handler;", "getMHandler", "()Landroid/os/Handler;", "setMHandler", "(Landroid/os/Handler;)V", "status", "getStatus", "setStatus", "up_queue", "getUp_queue", "setUp_queue", "get", "Lcom/xp/wx/middleware/BotInfo;", "app_release"}, k = 1, mv = {1, 1, 13})
    /* compiled from: BotInfo.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Handler getMHandler() {
            return BotInfo.mHandler;
        }

        public final void setMHandler(Handler handler) {
            BotInfo.mHandler = handler;
        }

        public final String getStatus() {
            return BotInfo.status;
        }

        public final void setStatus(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            BotInfo.status = str;
        }

        public final String getWeChatID() {
            return BotInfo.WeChatID;
        }

        public final void setWeChatID(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            BotInfo.WeChatID = str;
        }

        public final String getHeartBeat() {
            return BotInfo.heartBeat;
        }

        public final void setHeartBeat(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            BotInfo.heartBeat = str;
        }

        public final String getUp_queue() {
            return BotInfo.up_queue;
        }

        public final void setUp_queue(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            BotInfo.up_queue = str;
        }

        public final String getDown_queue() {
            return BotInfo.down_queue;
        }

        public final void setDown_queue(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            BotInfo.down_queue = str;
        }

        public final BotInfo get() {
            return new BotInfo();
        }
    }
}
