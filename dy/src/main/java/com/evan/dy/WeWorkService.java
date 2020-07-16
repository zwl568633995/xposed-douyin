package com.evan.dy;

import com.ehook.utils.LogUtil;
import com.evan.socket.Constants;
import com.evan.socket.SocketClient;
import com.evan.socket.SocketRequestHandler;
import com.evan.dy.cmd.CmdEngine;

public class WeWorkService {
    public static final String TAG = "WeWorkService";

    public static void onCreate() {
        LogUtil.INSTANCE.e(TAG, "WeWorkService onCreate ....");
        SocketClient.getInstance()
            .connect("sekiro.virjar.com", Constants.defaultNatServerPort, "123456789", "dy");
        for (SocketRequestHandler handler : CmdEngine.INSTANCE.getCmdList()) {
            SocketClient.getInstance().registerHandler(handler.getClass().getSimpleName(), handler);
        }
    }
}
