package com.evan.socket;

import android.text.TextUtils;

import com.evan.socket.netty.protocol.SocketNatMessage;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

import io.netty.channel.Channel;


public class SocketRequestHandlerManager {
    private static final String cmd = "cmd";
    private static final String cmdList = "__cmdList";

    private Map<String, SocketRequestHandler> requestHandlerMap = new HashMap<>();

    public void handleSocketMessage(SocketNatMessage socketNatMessage, Channel channel) {
        SocketRequest socketRequest = new SocketRequest(socketNatMessage.getData(), socketNatMessage.getSerialNumber());
        SocketResponse socketResponse = new SocketResponse(socketRequest, channel);
        String action = socketRequest.getCmd();
        if (TextUtils.isEmpty(action)) {
            socketResponse.failed("the param:{" + SocketRequestHandlerManager.cmd + "} not present");
            return;
        }

        SocketRequestHandler actionRequestHandlerGenerator = requestHandlerMap.get(action);
        if (actionRequestHandlerGenerator == null) {
            if (action.equals(cmdList)) {
                TreeSet<String> sortedActionSet = new TreeSet<>(requestHandlerMap.keySet());
                socketResponse.success(sortedActionSet);
                return;
            } else {
                socketResponse.failed("unknown cmd: " + action);
                return;
            }
        }

        try {
            actionRequestHandlerGenerator.handleRequest(socketRequest, socketResponse);
        } catch (Throwable throwable) {
            SLog.e("failed to generate cmd request handler", throwable);
            socketResponse.failed(CommonRes.statusError, throwable);
        }
    }


    public void registerHandler(String action, SocketRequestHandler socketRequestHandler) {
        SLog.e("registerHandler " + action);
        if (TextUtils.isEmpty(action)) {
            throw new IllegalArgumentException("cmd empty!!");
        }
        if (requestHandlerMap.containsKey(action)) {
            SLog.e("the request handler: " + socketRequestHandler + " for cmd:" + action + "  registered already!!");
        }
        requestHandlerMap.put(action, socketRequestHandler);
    }


}
