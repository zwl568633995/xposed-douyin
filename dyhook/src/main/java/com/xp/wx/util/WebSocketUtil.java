package com.xp.wx.util;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.PowerManager;
import android.text.TextUtils;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.qiniu.android.common.Constants;
import com.xp.wx.Global;
import com.xp.wx.GlobalConst;
import com.xp.wx.backend.handler.CmdQueueHandler;
import com.xp.wx.backend.helper.CmdProcessHelper;
import com.xp.wx.middleware.ActionReceiver;
import com.xp.wx.middleware.MsgProtos;
import com.xp.wx.middleware.ProcessCMD;
import com.xp.wx.spellbook.base.BaseGlobal;
import com.xp.wx.spellbook.douyin.DyGlobal;
import com.xp.wx.spellbook.util.AppUtil;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import org.java_websocket.WebSocket;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.framing.Framedata;
import org.java_websocket.handshake.ServerHandshake;
import org.java_websocket.protocols.Protocol;

public class WebSocketUtil extends WebSocketClient {
    private static final long CHECK_PONG_DELAY = 5000;
    private static final int MSG_CHECK_PONG = 224;
    private static final int MSG_PING = 223;
    private static final int MSG_RECONNECT = 222;
    private static final long RECONNECT_NOW = 1000;
    private static final long SEND_PING_DELAY = 10000;
    private static WebSocketUtil mInstance;
    public static final byte[] mLock = new byte[0];
    private MsgProtos.Cmd PB_Msg;
    private Handler mSecondHandler = new Handler(HandlerUtil.getSecondHandler().getLooper()) {
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == WebSocketUtil.MSG_RECONNECT) {
                BaseGlobal global = Global.INSTANCE.getGlobal();
                if (global != null) {
                    global.initSocket();
                }
            } else if (i == WebSocketUtil.MSG_CHECK_PONG) {
                Log.warn("not receive pong after 5000ms");
                WebSocketUtil.this.reconnectLocal(3000);
            }
        }
    };
    private long mSocketOpenTime;
    private Context mSystemContext;
    private PowerManager.WakeLock mWakeLock;
    private MsgProtos.Cmd registerMsg;

    public void onMessage(String str) {
    }

    private WebSocketUtil(Draft draft, Map<String, String> map) throws URISyntaxException {
        super(new URI(Global.INSTANCE.getSOCKETSERVER()), draft, map, 15000);
    }

    public static WebSocketUtil getInstance() throws URISyntaxException {
        if (mInstance == null) {
            synchronized (mLock) {
                if (mInstance == null) {
                    try {
                        String encode = URLEncoder.encode(Global.INSTANCE.getSOCKET_TOKEN(), Constants.UTF_8);
                        Draft_6455 draft_6455 = new Draft_6455();
                        HashMap hashMap = null;
                        if (!TextUtils.isEmpty(encode)) {
                            draft_6455.getKnownProtocols().add(new Protocol(encode));
                            hashMap = new HashMap();
                            hashMap.put("Sec-WebSocket-Protocol", encode);
                        }
                        mInstance = new WebSocketUtil(draft_6455, hashMap);
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return mInstance;
    }

    public void destroy() {
        synchronized (mLock) {
            if (mInstance != null) {
                close();
                if (this.mWakeLock != null && this.mWakeLock.isHeld()) {
                    this.mWakeLock.release();
                    this.mWakeLock = null;
                }
                resetHandler();
                this.mSecondHandler = null;
                this.registerMsg = null;
                this.mSystemContext = null;
                mInstance = null;
            }
        }
    }

    public void setUri(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                this.uri = new URI(str);
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }

    public void reconnect() {
        Log.info(GlobalConst.TAG, "WebSocket准备重连~~~~");
        resetHandler();
        super.reconnect();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b7, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean send(com.xp.wx.middleware.MsgProtos.Cmd r12) {
        /*
            r11 = this;
            byte[] r0 = mLock
            monitor-enter(r0)
            r1 = 0
            if (r12 != 0) goto L_0x0008
            monitor-exit(r0)     // Catch:{ all -> 0x00b8 }
            return r1
        L_0x0008:
            r11.startConnectionLostTimer()     // Catch:{ all -> 0x00b8 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00b8 }
            long r4 = r11.mSocketOpenTime     // Catch:{ all -> 0x00b8 }
            long r2 = r2 - r4
            r4 = 2000(0x7d0, double:9.88E-321)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0025
            java.lang.String r2 = "socket open less than 2s, need sleep 2s"
            com.xp.wx.util.Log.debug(r2)     // Catch:{ InterruptedException -> 0x0021 }
            java.lang.Thread.sleep(r4)     // Catch:{ InterruptedException -> 0x0021 }
            goto L_0x0025
        L_0x0021:
            r2 = move-exception
            com.xp.wx.util.Log.error((java.lang.Throwable) r2)     // Catch:{ all -> 0x00b8 }
        L_0x0025:
            java.lang.String r2 = r12.getServerId()     // Catch:{ all -> 0x00b8 }
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            java.lang.String r7 = "temp_"
            boolean r7 = r2.startsWith(r7)     // Catch:{ Exception -> 0x007a }
            if (r7 == 0) goto L_0x003c
            java.lang.String r7 = "serverId_"
            java.lang.String r8 = ""
            com.xp.api.XposedHelpers.setObjectField(r12, r7, r8)     // Catch:{ Exception -> 0x007a }
        L_0x003c:
            byte[] r7 = r12.toByteArray()     // Catch:{ Exception -> 0x007a }
            super.send((byte[]) r7)     // Catch:{ Exception -> 0x007a }
            int r7 = r12.getCmd()     // Catch:{ Exception -> 0x007a }
            if (r7 == r5) goto L_0x00ab
            int r7 = r12.getCmd()     // Catch:{ Exception -> 0x007a }
            if (r7 == r6) goto L_0x00ab
            java.lang.String r7 = com.xp.wx.GlobalConst.TAG     // Catch:{ Exception -> 0x007a }
            java.lang.String r8 = "Socket发送消息成功=====> cmd:%s, serverId:%s, status:%s, msg:%s"
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x007a }
            int r10 = r12.getCmd()     // Catch:{ Exception -> 0x007a }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x007a }
            r9[r1] = r10     // Catch:{ Exception -> 0x007a }
            r9[r6] = r2     // Catch:{ Exception -> 0x007a }
            int r10 = r12.getStatus()     // Catch:{ Exception -> 0x007a }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x007a }
            r9[r5] = r10     // Catch:{ Exception -> 0x007a }
            java.lang.String r10 = r12.getMsg()     // Catch:{ Exception -> 0x007a }
            r9[r4] = r10     // Catch:{ Exception -> 0x007a }
            java.lang.String r8 = java.lang.String.format(r8, r9)     // Catch:{ Exception -> 0x007a }
            com.xp.wx.util.Log.debug(r7, r8)     // Catch:{ Exception -> 0x007a }
            r1 = 1
            goto L_0x00ab
        L_0x007a:
            r7 = move-exception
            java.lang.String r8 = com.xp.wx.GlobalConst.TAG     // Catch:{ all -> 0x00b8 }
            java.lang.String r9 = "Socket发送消息失败=====> error:%s, cmd:%s, serverId:%s, status:%s, msg:%s"
            r10 = 5
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ all -> 0x00b8 }
            java.lang.String r7 = r7.getMessage()     // Catch:{ all -> 0x00b8 }
            r10[r1] = r7     // Catch:{ all -> 0x00b8 }
            int r7 = r12.getCmd()     // Catch:{ all -> 0x00b8 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x00b8 }
            r10[r6] = r7     // Catch:{ all -> 0x00b8 }
            r10[r5] = r2     // Catch:{ all -> 0x00b8 }
            int r2 = r12.getStatus()     // Catch:{ all -> 0x00b8 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x00b8 }
            r10[r4] = r2     // Catch:{ all -> 0x00b8 }
            java.lang.String r12 = r12.getMsg()     // Catch:{ all -> 0x00b8 }
            r10[r3] = r12     // Catch:{ all -> 0x00b8 }
            java.lang.String r12 = java.lang.String.format(r9, r10)     // Catch:{ all -> 0x00b8 }
            com.xp.wx.util.Log.error(r8, r12)     // Catch:{ all -> 0x00b8 }
        L_0x00ab:
            if (r1 == 0) goto L_0x00b1
            r11.sendPingIfNecessary()     // Catch:{ all -> 0x00b8 }
            goto L_0x00b6
        L_0x00b1:
            r2 = 1000(0x3e8, double:4.94E-321)
            r11.reconnectLocal(r2)     // Catch:{ all -> 0x00b8 }
        L_0x00b6:
            monitor-exit(r0)     // Catch:{ all -> 0x00b8 }
            return r1
        L_0x00b8:
            r12 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b8 }
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.util.WebSocketUtil.send(com.xp.wx.middleware.MsgProtos$Cmd):boolean");
    }

    private void checkPong() {
        Handler handler = this.mSecondHandler;
        if (handler != null) {
            handler.removeMessages(MSG_CHECK_PONG);
            this.mSecondHandler.sendEmptyMessageDelayed(MSG_CHECK_PONG, CHECK_PONG_DELAY);
        }
    }

    private void sendPingIfNecessary() {
        Handler handler = this.mSecondHandler;
        if (handler != null) {
            handler.removeMessages(MSG_PING);
            this.mSecondHandler.sendEmptyMessageDelayed(MSG_PING, SEND_PING_DELAY);
        }
    }

    /* access modifiers changed from: private */
    public void reconnectLocal(long j) {
        Handler handler = this.mSecondHandler;
        if (handler != null) {
            handler.removeMessages(MSG_RECONNECT);
            this.mSecondHandler.sendEmptyMessageDelayed(MSG_RECONNECT, j);
        }
    }

    private void resetHandler() {
        Handler handler = this.mSecondHandler;
        if (handler != null) {
            handler.removeMessages(MSG_RECONNECT);
            this.mSecondHandler.removeMessages(MSG_PING);
            this.mSecondHandler.removeMessages(MSG_CHECK_PONG);
        }
    }

    public void connect() {
        super.connect();
        resetHandler();
    }

    public void onOpen(ServerHandshake serverHandshake) {
        if (serverHandshake.getHttpStatus() == 101) {
            this.mSocketOpenTime = System.currentTimeMillis();
            String str = GlobalConst.TAG;
            Log.info(str, "WebSocketClient=====> onOpen, Host:" + getURI().getHost());
            checkVersion();
            send(this.registerMsg);
            resetHandler();
            sendStateReceiver(false);
            CmdQueueHandler.getInstance().notifyDownQueue();
            CmdQueueHandler.getInstance().notifyUpQueue();
            UploadLogUtil.uploadFileLog();
            sendPingIfNecessary();
            return;
        }
        close(1000, "WebSocket状态不正确=====> " + serverHandshake.getHttpStatus());
    }

    private void checkVersion() {
        UpdateUtil.checkModulesUpdate();
    }

    public void onMessage(ByteBuffer byteBuffer) {
        startConnectionLostTimer();
        try {
            this.PB_Msg = MsgProtos.Cmd.parseFrom(byteBuffer);
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
            String str = GlobalConst.TAG;
            Log.error(str, "onMessage: " + e.getMessage());
        }
        MsgProtos.Cmd cmd = this.PB_Msg;
        if (cmd != null) {
            int cmd2 = cmd.getCmd();
            if (!(cmd2 == 1 || cmd2 == 2)) {
                Log.info(GlobalConst.TAG, String.format("收到ByteBuffer类型的消息 cmd - %s  msg - %s, serverId - %s, fromClientId %s", new Object[]{Integer.valueOf(this.PB_Msg.getCmd()), this.PB_Msg.getMsg(), this.PB_Msg.getServerId(), this.PB_Msg.getFromClientId()}));
                if (TextUtils.isEmpty(this.PB_Msg.getServerId())) {
                    Log.warn("empty serverId: cmd = " + this.PB_Msg.getCmd());
                    return;
                }
                sendReceiveCmd(this.PB_Msg);
                try {
                    CmdProcessHelper.INSTANCE.insertDownCmd(this.PB_Msg);
                    CmdQueueHandler.getInstance().notifyDownQueue();
                } catch (Exception e2) {
                    ProcessCMD.getInstance().replyServerSuccess(this.PB_Msg, e2.getMessage());
                }
            }
            sendPingIfNecessary();
        }
    }

    private void sendReceiveCmd(MsgProtos.Cmd cmd) {
        send(cmd.toBuilder().setFromClientId(cmd.getToClientId()).setToClientId(cmd.getFromClientId()).setTimestamp(System.currentTimeMillis()).setStatus(12).setCmdData(ByteString.copyFrom(new byte[0])).build());
    }

    public void onClose(int i, String str, boolean z) {
        Context context;
        PowerManager powerManager;
        String str2 = GlobalConst.TAG;
        Log.error(str2, "WebSocket onClose=====> code:" + i + ", remote:" + z + ", reason:" + str);
        if (!(i == 200 || (context = this.mSystemContext) == null || (powerManager = (PowerManager) context.getSystemService("power")) == null || powerManager.isScreenOn())) {
            powerManager.newWakeLock(268435462, "bright").acquire(DyGlobal.INIT_TIMEOUT);
            Log.debug(GlobalConst.TAG, "wake lock");
        }
        sendStateReceiver(false);
        reconnectLocal(RECONNECT_NOW);
        UploadLogUtil.upload("socket onClose, code = " + i + ", reason = " + str + ", remote = " + z);
    }

    public void onError(Exception exc) {
        String str = GlobalConst.TAG;
        Log.error(str, "WebSocket onError:" + exc.getMessage());
        sendStateReceiver(false);
        reconnectLocal(RECONNECT_NOW);
    }

    public void onWebsocketPing(WebSocket webSocket, Framedata framedata) {
        super.onWebsocketPing(webSocket, framedata);
        Log.debug(GlobalConst.TAG, ">>>>> receive ping");
        startConnectionLostTimer();
    }

    public void onWebsocketPong(WebSocket webSocket, Framedata framedata) {
        super.onWebsocketPong(webSocket, framedata);
        Log.debug(GlobalConst.TAG, ">>>>> receive pong");
        Handler handler = this.mSecondHandler;
        if (handler != null) {
            handler.removeMessages(MSG_CHECK_PONG);
        }
        sendStateReceiver(true);
    }

    public void init(String str) {
        PowerManager powerManager;
        Log.info(GlobalConst.TAG, "WebSocket init: " + str);
        Context systemContext = AppUtil.INSTANCE.getSystemContext();
        this.mSystemContext = systemContext;
        if (this.mWakeLock == null && (powerManager = (PowerManager) systemContext.getSystemService("power")) != null) {
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(536870913, getClass().getCanonicalName());
            this.mWakeLock = newWakeLock;
            newWakeLock.acquire();
        }
        MonitorUtils instance = MonitorUtils.getInstance();
        String deviceSerial = instance.getDeviceSerial();
        String telephonyNumber = instance.getTelephonyNumber();
        int versionCode = instance.getVersionCode();
        this.registerMsg = MsgProtos.Cmd.newBuilder().setCmd(1).setFromClientId(str).setStatus(2).setCmdData(ByteString.copyFrom(MsgProtos.CmdData1.newBuilder().setTel(StringUtils.emptyIfNull(telephonyNumber)).setMobileSerial(StringUtils.emptyIfNull(deviceSerial)).setNickname("").setUsername(StringUtils.emptyIfNull(str)).setVision(String.valueOf(versionCode)).setMobileModel(Build.BRAND + "  " + Build.MODEL).setAndroidVersion("Android " + Build.VERSION.RELEASE).setSboxVersion(instance.getVersionName(Global.SBOX_PACKAGE_NAME)).setChannel(1).build().toByteArray())).build();
        Log.info(GlobalConst.TAG, "WebSocket Msg初始化完成");
    }

    private static String getSerialNumber() {
        try {
            Method declaredMethod = Class.forName("android.os.Build").getDeclaredMethod("getString", new Class[]{Class.forName("java.lang.String")});
            if (!declaredMethod.isAccessible()) {
                declaredMethod.setAccessible(true);
            }
            return (String) declaredMethod.invoke(new Build(), new Object[]{"ro.serialno"});
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private void sendStateReceiver(boolean z) {
        if (this.mSystemContext != null) {
            Intent intent = new Intent(ActionReceiver.ACTION_HEART);
            String host = getURI().getHost();
            int port = getURI().getPort();
            int i = -1;
            if (port != -1) {
                host = host + ":" + port;
            }
            intent.putExtra(ActionReceiver.EXTRA_SCOKET_URL, host);
            if (!isClosed() && isOpen()) {
                i = 0;
            }
            intent.putExtra(ActionReceiver.EXTRA_SOCKET_STATE, i);
            if (z) {
                intent.putExtra(ActionReceiver.EXTRA_TIME_STAMP, System.currentTimeMillis());
            }
            this.mSystemContext.sendBroadcast(intent);
        }
    }
}
