package com.evan.socket.netty.client;


import com.evan.socket.Constants;
import com.evan.socket.SocketClient;
import com.evan.socket.SLog;
import com.evan.socket.netty.protocol.SocketNatMessage;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.timeout.IdleStateEvent;
import io.netty.handler.timeout.IdleStateHandler;

public class ClientIdleCheckHandler extends IdleStateHandler {

    private SocketClient sekiroClient;

    public ClientIdleCheckHandler(SocketClient sekiroClient) {
        super(Constants.READ_IDLE_TIME, Constants.WRITE_IDLE_TIME, 0);
        this.sekiroClient = sekiroClient;
    }

    @Override
    protected void channelIdle(ChannelHandlerContext ctx, IdleStateEvent evt) throws Exception {
        Channel cmdChannel = sekiroClient.getCmdChannel();
        if (ctx.channel() == cmdChannel) {
            //如果不是cmd channel的事件，直接丢弃
            handleIdle(ctx, evt);
        } else {
            ctx.close();
        }
        super.channelIdle(ctx, evt);
    }

    private void handleIdle(ChannelHandlerContext ctx, IdleStateEvent evt) {
        SLog.i("idle event:" + evt.state());
        if (IdleStateEvent.FIRST_WRITER_IDLE_STATE_EVENT == evt) {
            SLog.i("write idle, write a heartbeat message to server");
            SocketNatMessage socketNatMessage = new SocketNatMessage();
            socketNatMessage.setType(SocketNatMessage.TYPE_HEARTBEAT);
            ctx.channel().writeAndFlush(socketNatMessage);
        } else if (IdleStateEvent.FIRST_READER_IDLE_STATE_EVENT == evt) {
            SLog.i("read timeout,close channel");
            ctx.channel().close();
            SLog.i("the cmd channel lost,restart client");
            sekiroClient.connectNatServer();
        }
    }
}
