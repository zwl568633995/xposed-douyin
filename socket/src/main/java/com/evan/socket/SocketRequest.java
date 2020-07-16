package com.evan.socket;


import java.nio.charset.StandardCharsets;


public class SocketRequest {

    private CmdData cmdData;
    private long serialNo;

    public SocketRequest(byte[] requestData, long serialNo) {
        this.serialNo = serialNo;
        String cmdContent = new String(requestData, StandardCharsets.UTF_8);
        cmdContent = cmdContent.trim();
        SLog.i("receive invoke request: " + cmdContent + "  requestId: " + serialNo);
        try {
            cmdData = JsonUtil.fromJson(cmdContent, CmdData.class);
        } catch (Exception e) {
            SLog.e(e.getMessage());
        }
    }

    public CmdData getCmdData() {
        return cmdData;
    }

    public String getCmd() {
        if (cmdData != null) {
            return cmdData.cmd;
        }
        return null;
    }

    public long getSerialNo() {
        return serialNo;
    }
}
