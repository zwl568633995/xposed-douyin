package com.evan.socket.netty.client;

import com.evan.socket.SocketClient;
import com.evan.socket.SLog;
import com.evan.socket.netty.protocol.SocketNatMessage;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class ClientChannelHandler extends SimpleChannelInboundHandler<SocketNatMessage> {

    private SocketClient socketClient;

    public ClientChannelHandler(SocketClient socketClient) {
        this.socketClient = socketClient;
    }

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, SocketNatMessage socketNatMessage) throws Exception {
        switch (socketNatMessage.getType()) {
            case SocketNatMessage.TYPE_INVOKE:
                handleInvokeRequest(socketNatMessage, channelHandlerContext.channel());
                break;
        }
    }

    private void handleInvokeRequest(SocketNatMessage socketNatMessage, Channel channel) {
        long serialNumber = socketNatMessage.getSerialNumber();
        if (serialNumber < 0) {
            SLog.e("the serial number not set");
        }
        socketClient.getSocketRequestHandlerManager().handleSocketMessage(socketNatMessage, channel);
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        super.channelInactive(ctx);
        Channel cmdChannel = socketClient.getCmdChannel();
        if (cmdChannel == ctx.channel()) {
            SLog.e("channel inactive ,reconnect to nat server");
            socketClient.connectNatServer();
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        //System.out.println("exception caught: ", cause);
        cause.printStackTrace();
        SLog.e("exception caught", cause);
        super.exceptionCaught(ctx, cause);
    }
}
