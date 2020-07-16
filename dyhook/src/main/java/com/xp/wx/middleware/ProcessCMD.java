package com.xp.wx.middleware;

import android.text.TextUtils;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageV3;
import com.xp.wx.Global;
import com.xp.wx.backend.handler.CmdQueueHandler;
import com.xp.wx.backend.helper.CmdProcessHelper;
import com.xp.wx.backend.threadpool.CatchRunnable;
import com.xp.wx.middleware.MsgProtos;
import com.xp.wx.util.HandlerUtil;
import com.xp.wx.util.Log;
import com.xp.wx.util.StringUtils;
import com.xp.wx.util.UploadLogUtil;
import java.util.ArrayList;
import java.util.List;

public class ProcessCMD {
    private static ProcessCMD mInstance;
    private static byte[] mLock = new byte[0];
    private ArrayList<String> mDelUserList = new ArrayList<>();

    private ProcessCMD() {
    }

    public static ProcessCMD getInstance() {
        if (mInstance == null) {
            synchronized (mLock) {
                if (mInstance == null) {
                    mInstance = new ProcessCMD();
                }
            }
        }
        return mInstance;
    }

    public void destroy() {
        if (mInstance != null) {
            synchronized (mLock) {
                this.mDelUserList.clear();
                this.mDelUserList = null;
            }
        }
    }

    private void throwException(String str) {
        throw new RuntimeException(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a8 A[Catch:{ NoSuchMethodException -> 0x00f1, InvocationTargetException -> 0x00a9, all -> 0x0069, all -> 0x0129 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b2 A[Catch:{ NoSuchMethodException -> 0x00f1, InvocationTargetException -> 0x00a9, all -> 0x0069, all -> 0x0129 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00f0 A[Catch:{ NoSuchMethodException -> 0x00f1, InvocationTargetException -> 0x00a9, all -> 0x0069, all -> 0x0129 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispatchMsg(com.xp.wx.middleware.MsgProtos.Cmd r10) {
        /*
            r9 = this;
            java.lang.String r0 = "no such method: parseCmd"
            java.lang.String r1 = ", "
            java.lang.String r2 = "cmd = "
            if (r10 != 0) goto L_0x000e
            java.lang.String r10 = "msg is null"
            com.xp.wx.util.Log.warn((java.lang.String) r10)
            return
        L_0x000e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "dispatchMsg, msg = "
            r3.append(r4)
            int r4 = r10.getCmd()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.xp.wx.util.Log.debug(r3)
            r3 = 0
            r4 = 1
            java.lang.Class r5 = r9.getClass()     // Catch:{ NoSuchMethodException -> 0x00f1, InvocationTargetException -> 0x00a9, all -> 0x0069 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ NoSuchMethodException -> 0x00f1, InvocationTargetException -> 0x00a9, all -> 0x0069 }
            r6.<init>()     // Catch:{ NoSuchMethodException -> 0x00f1, InvocationTargetException -> 0x00a9, all -> 0x0069 }
            java.lang.String r7 = "parseCmd"
            r6.append(r7)     // Catch:{ NoSuchMethodException -> 0x00f1, InvocationTargetException -> 0x00a9, all -> 0x0069 }
            int r7 = r10.getCmd()     // Catch:{ NoSuchMethodException -> 0x00f1, InvocationTargetException -> 0x00a9, all -> 0x0069 }
            r6.append(r7)     // Catch:{ NoSuchMethodException -> 0x00f1, InvocationTargetException -> 0x00a9, all -> 0x0069 }
            java.lang.String r6 = r6.toString()     // Catch:{ NoSuchMethodException -> 0x00f1, InvocationTargetException -> 0x00a9, all -> 0x0069 }
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x00f1, InvocationTargetException -> 0x00a9, all -> 0x0069 }
            java.lang.Class<com.xp.wx.middleware.MsgProtos$Cmd> r8 = com.xp.wx.middleware.MsgProtos.Cmd.class
            r7[r3] = r8     // Catch:{ NoSuchMethodException -> 0x00f1, InvocationTargetException -> 0x00a9, all -> 0x0069 }
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r6, r7)     // Catch:{ NoSuchMethodException -> 0x00f1, InvocationTargetException -> 0x00a9, all -> 0x0069 }
            r5.setAccessible(r4)     // Catch:{ NoSuchMethodException -> 0x00f1, InvocationTargetException -> 0x00a9, all -> 0x0069 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ NoSuchMethodException -> 0x00f1, InvocationTargetException -> 0x00a9, all -> 0x0069 }
            r6[r3] = r10     // Catch:{ NoSuchMethodException -> 0x00f1, InvocationTargetException -> 0x00a9, all -> 0x0069 }
            r5.invoke(r9, r6)     // Catch:{ NoSuchMethodException -> 0x00f1, InvocationTargetException -> 0x00a9, all -> 0x0069 }
            com.xp.wx.backend.helper.CmdProcessHelper r3 = com.xp.wx.backend.helper.CmdProcessHelper.INSTANCE     // Catch:{ NoSuchMethodException -> 0x0066, InvocationTargetException -> 0x0063, all -> 0x0060 }
            int r5 = r10.getLocalDBId()     // Catch:{ NoSuchMethodException -> 0x0066, InvocationTargetException -> 0x0063, all -> 0x0060 }
            r3.executeDownCmdSuccess(r5)     // Catch:{ NoSuchMethodException -> 0x0066, InvocationTargetException -> 0x0063, all -> 0x0060 }
            goto L_0x0128
        L_0x0060:
            r0 = move-exception
            r3 = 1
            goto L_0x006a
        L_0x0063:
            r0 = move-exception
            r3 = 1
            goto L_0x00aa
        L_0x0066:
            r3 = 1
            goto L_0x00f1
        L_0x0069:
            r0 = move-exception
        L_0x006a:
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)     // Catch:{ all -> 0x0129 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0129 }
            r4.<init>()     // Catch:{ all -> 0x0129 }
            r4.append(r2)     // Catch:{ all -> 0x0129 }
            int r5 = r10.getCmd()     // Catch:{ all -> 0x0129 }
            r4.append(r5)     // Catch:{ all -> 0x0129 }
            r4.append(r1)     // Catch:{ all -> 0x0129 }
            r4.append(r0)     // Catch:{ all -> 0x0129 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0129 }
            com.xp.wx.util.Log.error((java.lang.String) r4)     // Catch:{ all -> 0x0129 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0129 }
            r4.<init>()     // Catch:{ all -> 0x0129 }
            r4.append(r2)     // Catch:{ all -> 0x0129 }
            int r2 = r10.getCmd()     // Catch:{ all -> 0x0129 }
            r4.append(r2)     // Catch:{ all -> 0x0129 }
            r4.append(r1)     // Catch:{ all -> 0x0129 }
            r4.append(r0)     // Catch:{ all -> 0x0129 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0129 }
            r9.replyServerFail(r10, r0)     // Catch:{ all -> 0x0129 }
            if (r3 != 0) goto L_0x0128
            goto L_0x011f
        L_0x00a9:
            r0 = move-exception
        L_0x00aa:
            java.lang.Throwable r0 = r0.getTargetException()     // Catch:{ all -> 0x0129 }
            java.lang.String r4 = "targetException is null"
            if (r0 == 0) goto L_0x00b6
            java.lang.String r4 = android.util.Log.getStackTraceString(r0)     // Catch:{ all -> 0x0129 }
        L_0x00b6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0129 }
            r0.<init>()     // Catch:{ all -> 0x0129 }
            r0.append(r2)     // Catch:{ all -> 0x0129 }
            int r5 = r10.getCmd()     // Catch:{ all -> 0x0129 }
            r0.append(r5)     // Catch:{ all -> 0x0129 }
            r0.append(r1)     // Catch:{ all -> 0x0129 }
            r0.append(r4)     // Catch:{ all -> 0x0129 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0129 }
            com.xp.wx.util.Log.error((java.lang.String) r0)     // Catch:{ all -> 0x0129 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0129 }
            r0.<init>()     // Catch:{ all -> 0x0129 }
            r0.append(r2)     // Catch:{ all -> 0x0129 }
            int r2 = r10.getCmd()     // Catch:{ all -> 0x0129 }
            r0.append(r2)     // Catch:{ all -> 0x0129 }
            r0.append(r1)     // Catch:{ all -> 0x0129 }
            r0.append(r4)     // Catch:{ all -> 0x0129 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0129 }
            r9.replyServerFail(r10, r0)     // Catch:{ all -> 0x0129 }
            if (r3 != 0) goto L_0x0128
            goto L_0x011f
        L_0x00f1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0129 }
            r1.<init>()     // Catch:{ all -> 0x0129 }
            r1.append(r0)     // Catch:{ all -> 0x0129 }
            int r2 = r10.getCmd()     // Catch:{ all -> 0x0129 }
            r1.append(r2)     // Catch:{ all -> 0x0129 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0129 }
            com.xp.wx.util.Log.error((java.lang.String) r1)     // Catch:{ all -> 0x0129 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0129 }
            r1.<init>()     // Catch:{ all -> 0x0129 }
            r1.append(r0)     // Catch:{ all -> 0x0129 }
            int r0 = r10.getCmd()     // Catch:{ all -> 0x0129 }
            r1.append(r0)     // Catch:{ all -> 0x0129 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0129 }
            r9.replyServerFail(r10, r0)     // Catch:{ all -> 0x0129 }
            if (r3 != 0) goto L_0x0128
        L_0x011f:
            com.xp.wx.backend.helper.CmdProcessHelper r0 = com.xp.wx.backend.helper.CmdProcessHelper.INSTANCE
            java.lang.String r10 = r10.getServerId()
            r0.deleteDownCmd(r10)
        L_0x0128:
            return
        L_0x0129:
            r0 = move-exception
            if (r3 != 0) goto L_0x0135
            com.xp.wx.backend.helper.CmdProcessHelper r1 = com.xp.wx.backend.helper.CmdProcessHelper.INSTANCE
            java.lang.String r10 = r10.getServerId()
            r1.deleteDownCmd(r10)
        L_0x0135:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.middleware.ProcessCMD.dispatchMsg(com.xp.wx.middleware.MsgProtos$Cmd):void");
    }

    private void checkValidity(String... strArr) {
        if (strArr != null && strArr.length > 0) {
            for (String isEmpty : strArr) {
                if (TextUtils.isEmpty(isEmpty)) {
                    throwException("params can't be null or ''!");
                }
            }
        }
    }

    public void replyServerExecuting(MsgProtos.Cmd cmd, String str) {
        sendCmd(cmd.getCmd(), cmd.getFromClientId(), 11, cmd.getPriority(), cmd.getLocalId(), cmd.getServerId(), cmd.getChannelList(), str, cmd.getDesc(), (GeneratedMessageV3) null);
    }

    public void replyServerSuccess(MsgProtos.Cmd cmd) {
        replyServerSuccess(cmd, "成功");
    }

    public void replyServerSuccess(MsgProtos.Cmd cmd, String str) {
        replyServerSuccess(cmd, str, (GeneratedMessageV3) null);
    }

    public void replyServerSuccess(MsgProtos.Cmd cmd, GeneratedMessageV3 generatedMessageV3) {
        replyServerSuccess(cmd, "成功", generatedMessageV3);
    }

    public void replyServerSuccess(MsgProtos.Cmd cmd, String str, GeneratedMessageV3 generatedMessageV3) {
        sendCmd(cmd.getCmd(), cmd.getFromClientId(), 2, cmd.getPriority(), cmd.getLocalId(), cmd.getServerId(), cmd.getChannelList(), str, cmd.getDesc(), generatedMessageV3);
    }

    public void replyServerFail(MsgProtos.Cmd cmd, String str) {
        replyServerFail(cmd, str, (GeneratedMessageV3) null);
    }

    public void replyServerFail(MsgProtos.Cmd cmd, String str, GeneratedMessageV3 generatedMessageV3) {
        sendCmd(cmd.getCmd(), cmd.getFromClientId(), 3, cmd.getPriority(), cmd.getLocalId(), cmd.getServerId(), cmd.getChannelList(), str, cmd.getDesc(), generatedMessageV3);
        UploadLogUtil.upload("cmd = " + cmd.getCmd() + ", serverId = " + cmd.getServerId() + ", " + cmd);
    }

    public void replyServerFailAndRetry(MsgProtos.Cmd cmd, String str) {
        Log.debug("retry cmd = " + cmd.getCmd() + ", serverId = " + cmd.getServerId() + ", retryCount = " + cmd.getRetryCount());
        if (cmd.getRetryCount() < 3) {
            HandlerUtil.getSecondHandler().postDelayed(new Runnable() {
                public final void run() {
                    ProcessCMD.lambda$replyServerFailAndRetry$0(MsgProtos.Cmd.this);
                }
            }, (long) ((((int) (Math.random() * 0.4d * 10.0d)) + 1) * 1000));
        } else {
            replyServerFail(cmd, str);
        }
    }

    static /* synthetic */ void lambda$replyServerFailAndRetry$0(MsgProtos.Cmd cmd) {
        CmdProcessHelper.INSTANCE.retryDownCmd(cmd);
        CmdQueueHandler.getInstance().notifyDownQueue();
    }

    public void sendCmd(int i, GeneratedMessageV3 generatedMessageV3) {
        sendCmd(i, "", generatedMessageV3);
    }

    public void sendCmd(int i, String str, GeneratedMessageV3 generatedMessageV3) {
        sendCmd(i, str, 2, generatedMessageV3);
    }

    public void sendCmd(int i, String str, int i2, GeneratedMessageV3 generatedMessageV3) {
        sendCmd(i, str, i2, 0, generatedMessageV3);
    }

    public void sendCmd(int i, String str, int i2, int i3, GeneratedMessageV3 generatedMessageV3) {
        sendCmd(i, str, i2, i3, "", "", generatedMessageV3);
    }

    public void sendCmd(int i, String str, int i2, int i3, String str2, String str3, GeneratedMessageV3 generatedMessageV3) {
        sendCmd(i, str, i2, i3, str2, str3, (List<String>) null, generatedMessageV3);
    }

    public void sendCmd(int i, String str, int i2, int i3, String str2, String str3, List<String> list, GeneratedMessageV3 generatedMessageV3) {
        sendCmd(i, str, i2, i3, str2, str3, list, "成功", generatedMessageV3);
    }

    public void sendCmd(int i, String str, int i2, int i3, String str2, String str3, List<String> list, String str4, GeneratedMessageV3 generatedMessageV3) {
        sendCmd(i, str, i2, i3, str2, str3, list, str4, "", generatedMessageV3);
    }

    public void sendCmd(int i, String str, int i2, int i3, String str2, String str3, List<String> list, String str4, String str5, GeneratedMessageV3 generatedMessageV3) {
        String loginUserId = Global.INSTANCE.getGlobal().getLoginUserId();
        CmdProcessHelper cmdProcessHelper = CmdProcessHelper.INSTANCE;
        MsgProtos.Cmd.Builder serverId = MsgProtos.Cmd.newBuilder().setCmd(i).setTimestamp(System.currentTimeMillis()).setFromClientId(StringUtils.emptyIfNull(loginUserId)).setToClientId(StringUtils.emptyIfNull(str)).setStatus(i2).setPriority(i3).setCmdData(generatedMessageV3 == null ? ByteString.copyFrom(new byte[0]) : ByteString.copyFrom(generatedMessageV3.toByteArray())).setLocalId(StringUtils.emptyIfNull(str2)).setServerId(StringUtils.emptyIfNull(str3));
        if (list == null) {
            list = new ArrayList<>();
        }
        cmdProcessHelper.insertUpCmd(serverId.addAllChannel(list).setMsg(StringUtils.emptyIfNull(str4)).setDesc(StringUtils.emptyIfNull(str5)).build());
        CmdQueueHandler.getInstance().notifyUpQueue();
    }

    private abstract class CatchCmdRunnable extends CatchRunnable {
        private MsgProtos.Cmd mCmd;

        CatchCmdRunnable(MsgProtos.Cmd cmd) {
            this.mCmd = cmd;
        }

        public void run() {
            try {
                runInTry();
            } catch (Throwable th) {
                if (this.mCmd != null) {
                    String stackTraceString = android.util.Log.getStackTraceString(th);
                    Log.error("cmd = " + this.mCmd.getCmd() + ", " + stackTraceString);
                    ProcessCMD processCMD = ProcessCMD.this;
                    MsgProtos.Cmd cmd = this.mCmd;
                    processCMD.replyServerFail(cmd, "cmd = " + this.mCmd.getCmd() + ", " + stackTraceString);
                } else {
                    Log.error(th);
                }
            }
            this.mCmd = null;
        }
    }
}
