package com.evan.socket;


import android.text.TextUtils;

import com.evan.socket.netty.client.ClientChannelHandler;
import com.evan.socket.netty.client.ClientIdleCheckHandler;
import com.evan.socket.netty.protocol.SocketMessageEncoder;
import com.evan.socket.netty.protocol.SocketNatMessage;
import com.evan.socket.netty.protocol.SocketNatMessageDecoder;
import com.google.gson.JsonObject;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * https://github.com/virjar/sekiro
 * https://sekiro.virjar.com/invoke?group=wework&action=onMessage&param=%E8%87%AA%E5%AE%9A%E4%B9%89%E5%8F%82%E6%95%B0
 */
public class SocketClient {
    private static SocketClient socketClient;
    private String serverHost;
    private int serverPort;
    private String clientId;
    private String group = "default";

    private AtomicBoolean isStartUp = new AtomicBoolean(false);

    private static Map<String, SocketClient> allClient = new ConcurrentHashMap<>();

    private SocketRequestHandlerManager socketRequestHandlerManager = new SocketRequestHandlerManager();


    private SocketClient() {

    }

    private SocketClient(String serverHost, int serverPort, String clientId, String group) {
        this.serverHost = serverHost;
        this.serverPort = serverPort;
        //@ 是一个hermes保留分隔符
        clientId = clientId.replaceAll("@", "_");
        this.clientId = clientId;
        this.group = group;
        if (TextUtils.isEmpty(group)) {
            this.group = "default";
        }
    }

    public static SocketClient start(String serverHost, final String clientID) {
        return start(serverHost, Constants.defaultNatServerPort, clientID, "default");
    }

    public static SocketClient start(String serverHost, int serverPort, final String clientID) {
        return start(serverHost, serverPort, clientID, "default");
    }

    public static SocketClient start(String serverHost, final String clientID, String group) {
        return start(serverHost, Constants.defaultNatServerPort, clientID, group);
    }


    /**
     * 开启一个长链接调用隧道，可以实现在公网服务器调用NAT网络下的手机功能
     *
     * @param serverHost 服务器地址
     * @param serverPort 服务器ip
     * @param clientID   手机id，唯一标记一个手机（请注意，一个手机应该只开启一个隧道）
     * @param group      分组，解决同一个app，在不同团队安装了不同的服务的问题。不同group
     * @return 一个client控制器实例
     */
    public static SocketClient start(String serverHost, int serverPort, final String clientID, String group) {
        SocketClient sekiroClient = allClient.get(serverHost + ":" + serverHost);
        if (sekiroClient == null) {
            synchronized (SocketClient.class) {
                sekiroClient = allClient.get(serverHost + ":" + serverHost);
                if (sekiroClient == null) {
                    sekiroClient = new SocketClient(serverHost, serverPort, clientID, group);
                    allClient.put(serverHost + ":" + serverHost, sekiroClient);
                }
            }
        }
        sekiroClient.startInternal();
        return sekiroClient;
    }

    public SocketClient connect(String serverHost, int serverPort, String clientId, String group) {
        this.serverHost = serverHost;
        this.serverPort = serverPort;
        //@ 是一个hermes保留分隔符
        this.clientId = clientId.replaceAll("@", "_");
        this.group = group;
        if (TextUtils.isEmpty(group)) {
            this.group = "default";
        }
        socketClient.startInternal();
        return this;
    }

    public static SocketClient getInstance() {
        synchronized (SocketClient.class) {
            if (socketClient == null) {
                socketClient = new SocketClient();
            }
        }
        return socketClient;
    }

    private Bootstrap natClientBootstrap;

    public boolean isConnecting() {
        return isConnecting;
    }

    private void startInternal() {
        if (isStartUp.compareAndSet(false, true)) {
            natClientBootstrap = new Bootstrap();
            NioEventLoopGroup workerGroup = new NioEventLoopGroup();
            natClientBootstrap.option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 120 * 1000);
            natClientBootstrap.group(workerGroup);
            natClientBootstrap.channel(NioSocketChannel.class);
            natClientBootstrap.handler(new ChannelInitializer<SocketChannel>() {
                @Override
                protected void initChannel(SocketChannel socketChannel) throws Exception {
                    socketChannel.pipeline().addLast(new SocketNatMessageDecoder());
                    socketChannel.pipeline().addLast(new SocketMessageEncoder());
                    socketChannel.pipeline().addLast(new ClientIdleCheckHandler(SocketClient.this));
                    socketChannel.pipeline().addLast(new ClientChannelHandler(SocketClient.this));
                }
            });
            SLog.i("connect to nat server at service startUp");
            connectNatServer();
        }
    }

    /**
     * 可以在运行时切换client group，比如我们把手机根据是否登陆进行分组，一个手机可以从未登录转化为登录。此时对应的group将会跟随这切换
     *
     * @param newGroup 新的groupId
     */
    public synchronized void updateGroup(String newGroup) {
        if (group.equals(newGroup)) {
            return;
        }
        SLog.i("the group update from :" + group + " to:" + newGroup);
        Channel cmdChannelCopy = cmdChannel;
        if (cmdChannelCopy != null && cmdChannelCopy.isActive()) {
            cmdChannelCopy.close();
            cmdChannel = null;
            isConnecting = false;
        }
        group = newGroup;
        if (TextUtils.isEmpty(group)) {
            this.group = "default";
        }
        connectNatServer();
    }

    //和服务器保持链接的channel
    private Channel cmdChannel = null;
    private volatile boolean isConnecting = false;

    public synchronized void connectNatServer() {
        Channel cmdChannelCopy = cmdChannel;
        if (cmdChannelCopy != null && cmdChannelCopy.isActive()) {
            return;
        }
        if (isConnecting) {
            SLog.w("connect event fire already");
            return;
        }
        isConnecting = true;
        natClientBootstrap.group().submit(new Runnable() {
            @Override
            public void run() {
                SLog.i("connect to nat server...");
                Channel cmdChannelCopy = cmdChannel;
                if (cmdChannelCopy != null && cmdChannelCopy.isActive()) {
                    SLog.i("cmd channel active, and close channel,heartbeat timeout ?");
                    cmdChannelCopy.close();
                    //TODO clean up all resource
                }
                natClientBootstrap.connect(serverHost, serverPort).addListener(new ChannelFutureListener() {
                    @Override
                    public void operationComplete(ChannelFuture channelFuture) throws Exception {
                        isConnecting = false;
                        if (!channelFuture.isSuccess()) {
                            SLog.w("connect to nat server failed", channelFuture.cause());
                            natClientBootstrap.group().schedule(new Runnable() {
                                @Override
                                public void run() {
                                    SLog.i("connect to nat server failed, reconnect by scheduler task start");
                                    connectNatServer();
                                }
                            }, reconnectWait(), TimeUnit.MILLISECONDS);

                        } else {
                            sleepTimeMill = 1000;
                            cmdChannel = channelFuture.channel();
                            SLog.i("connect to nat server success:" + cmdChannel);

                            SocketNatMessage socketNatMessage = new SocketNatMessage();
                            socketNatMessage.setType(SocketNatMessage.C_TYPE_REGISTER);
                            socketNatMessage.setExtra(clientId + "@" + group);
                            cmdChannel.writeAndFlush(socketNatMessage);
                        }
                    }
                });
            }
        });

    }

    private static long sleepTimeMill = 1000;

    private static long reconnectWait() {

        if (sleepTimeMill > 120000) {
            sleepTimeMill = 120000;
        }

        synchronized (SocketClient.class) {
            sleepTimeMill = sleepTimeMill + 1000;
            return sleepTimeMill;
        }

    }


    public Channel getCmdChannel() {
        return cmdChannel;
    }

    public SocketClient registerHandler(String action, SocketRequestHandler socketRequestHandler) {
        socketRequestHandlerManager.registerHandler(action, socketRequestHandler);
        return this;
    }

    public SocketClient registerHandler(CmdHandler cmdHandler) {
        socketRequestHandlerManager.registerHandler(cmdHandler.cmd(), cmdHandler);
        return this;
    }

    public SocketRequestHandlerManager getSocketRequestHandlerManager() {
        return socketRequestHandlerManager;
    }

    public void send(String msg) {
        if (getCmdChannel() != null) {
            new SocketResponse(getCmdChannel()).success(msg);
        }
    }

    public void send(JsonObject msg) {
        if (getCmdChannel() != null) {
            new SocketResponse(getCmdChannel()).success(msg);
        }
    }
}
