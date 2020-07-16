package com.xp.wx.backend.handler;

import android.os.Handler;
import android.os.Message;
import com.xp.wx.Global;
import com.xp.wx.backend.helper.CmdProcessHelper;
import com.xp.wx.middleware.MsgProtos;
import com.xp.wx.middleware.ProcessCMD;
import com.xp.wx.spellbook.base.BaseGlobal;
import com.xp.wx.util.HandlerUtil;
import com.xp.wx.util.Log;
import com.xp.wx.util.StringUtils;
import com.xp.wx.util.WebSocketUtil;

public class CmdQueueHandler {
    private static final long MSG_DELAYED = 500;
    private static final int MSG_DOWN_QUEUE = 100;
    private static final int MSG_RECONNECT_SOCKET = 105;
    private static final int MSG_UP_QUEUE = 101;
    private static CmdQueueHandler mInstance = null;
    public static final byte[] mLock = WebSocketUtil.mLock;
    private Handler mHandler = new Handler(HandlerUtil.createNewHandler("CmdQueue").getLooper()) {
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 100) {
                CmdQueueHandler.this.processDownCmd();
            } else if (i == 101) {
                CmdQueueHandler.this.processUpCmd();
            } else if (i == 105) {
                CmdQueueHandler.this.reconnectSocket();
            }
        }
    };
    private boolean mIsProcessingDown = false;
    private boolean mIsProcessingUp = false;
    private long mLastDownTime = 0;
    private long mLastReconnectTime = 0;
    private long mLastUpTime = 0;

    private CmdQueueHandler() {
    }

    public static CmdQueueHandler getInstance() {
        if (mInstance == null) {
            synchronized (mLock) {
                if (mInstance == null) {
                    mInstance = new CmdQueueHandler();
                }
            }
        }
        return mInstance;
    }

    /* access modifiers changed from: private */
    public void reconnectSocket() {
        long currentTimeMillis = System.currentTimeMillis();
        if (Math.abs(currentTimeMillis - this.mLastReconnectTime) > 5000) {
            BaseGlobal global = Global.INSTANCE.getGlobal();
            if (global == null) {
                Log.warn("reconnect, global = null");
            } else if (!global.isSocketOpen()) {
                Log.debug("reconnect socket");
                global.initSocket();
                this.mLastReconnectTime = currentTimeMillis;
            } else {
                Log.debug("socket is opened");
            }
        } else {
            Log.debug("time is too short, not reconnect");
        }
    }

    public void notifyDownQueue() {
        synchronized (mLock) {
            if (this.mIsProcessingDown && System.currentTimeMillis() - this.mLastDownTime > 5000) {
                Log.debug("down timeout. reset");
                this.mIsProcessingDown = false;
            }
            if (this.mIsProcessingDown) {
                Log.debug("don't notify down queue, is downing");
                return;
            }
            Log.debug("notifyDownQueue");
            this.mIsProcessingDown = true;
            this.mHandler.removeMessages(100);
            this.mHandler.sendEmptyMessage(100);
        }
    }

    public void notifyUpQueue() {
        synchronized (mLock) {
            if (this.mIsProcessingUp && System.currentTimeMillis() - this.mLastUpTime > 5000) {
                Log.debug("up timeout. reset");
                this.mIsProcessingUp = false;
            }
            if (this.mIsProcessingUp) {
                Log.debug("don't notify up queue, is uping");
                return;
            }
            Log.debug("notifyUpQueue");
            this.mIsProcessingUp = true;
            this.mHandler.removeMessages(101);
            this.mHandler.sendEmptyMessage(101);
        }
    }

    /* access modifiers changed from: private */
    public void processDownCmd() {
        synchronized (mLock) {
            this.mLastDownTime = System.currentTimeMillis();
            MsgProtos.Cmd executeDownCmd = CmdProcessHelper.INSTANCE.getExecuteDownCmd();
            if (executeDownCmd != null) {
                Log.debug("processDownCmd, cmd = " + executeDownCmd.getCmd() + ", serverId = " + executeDownCmd.getServerId());
                ProcessCMD.getInstance().dispatchMsg(executeDownCmd);
                this.mHandler.sendEmptyMessageDelayed(100, MSG_DELAYED);
            } else {
                Log.debug("processDownCmd, no more");
                this.mIsProcessingDown = false;
            }
        }
    }

    /* access modifiers changed from: private */
    public void processUpCmd() {
        synchronized (mLock) {
            this.mLastUpTime = System.currentTimeMillis();
            BaseGlobal global = Global.INSTANCE.getGlobal();
            if (global != null) {
                try {
                    WebSocketUtil socket = global.getSocket();
                    if (socket != null && socket.isOpen() && !socket.isClosed()) {
                        MsgProtos.Cmd executeUpCmd = CmdProcessHelper.INSTANCE.getExecuteUpCmd();
                        if (executeUpCmd != null) {
                            Log.debug("processUpCmd, cmd = " + executeUpCmd.getCmd() + ", serverId = " + executeUpCmd.getServerId());
                            if (socket.send(executeUpCmd)) {
                                CmdProcessHelper.INSTANCE.executeUpCmdSuccess(executeUpCmd.getLocalDBId());
                                processUpCmd();
                                return;
                            }
                            CmdProcessHelper.INSTANCE.executeDownCmdFail(executeUpCmd.getLocalDBId());
                        } else {
                            Log.debug("processUpCmd, no more");
                        }
                    } else if (global.isInitializeChannelDone()) {
                        Log.debug("processUpCmd, socket not open");
                        this.mHandler.sendEmptyMessage(105);
                    } else {
                        Log.warn("processUpCmd, global not init");
                    }
                } catch (Exception e) {
                    Log.error(StringUtils.emptyIfNull(e.getMessage()));
                }
            } else {
                Log.warn("processUpCmd, global = null");
            }
            this.mIsProcessingUp = false;
        }
    }
}
