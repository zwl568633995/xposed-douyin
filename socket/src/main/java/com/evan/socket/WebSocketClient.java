package com.evan.socket;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;

public class WebSocketClient {

    private static final WebSocketClient ourInstance = new WebSocketClient();
    private static final String TAG = WebSocketClient.class.getSimpleName();
    private final OkHttpClient client;
    private WebSocket mWebSocket;

    public static WebSocketClient getDefault() {
        return ourInstance;
    }

    private WebSocketClient() {
        client = new OkHttpClient().newBuilder()
            .writeTimeout(10, TimeUnit.SECONDS)
            .readTimeout(10, TimeUnit.SECONDS)
            .connectTimeout(10, TimeUnit.SECONDS)
            .pingInterval(10, TimeUnit.SECONDS)
            .retryOnConnectionFailure(true)
            .build();
    }

    public void connect(String url) {
        if (mWebSocket != null) {
            mWebSocket.cancel();
        }
        Request request = new Request.Builder()
            .url(url)
            .build();
        mWebSocket = client.newWebSocket(request, new SocketListener());
    }

    public void send(String msg) {
        if (mWebSocket != null) {
            boolean isSend = mWebSocket.send(msg);
        }
    }

    class SocketListener extends WebSocketListener {

        @Override
        public void onOpen(WebSocket webSocket, Response response) {
            super.onOpen(webSocket, response);
            SLog.v(TAG, "onOpen response=" + response);
        }

        @Override
        public void onMessage(WebSocket webSocket, String text) {
            super.onMessage(webSocket, text);
            SLog.v(TAG, "onMessage text=" + text);
        }

        @Override
        public void onMessage(WebSocket webSocket, ByteString bytes) {
            super.onMessage(webSocket, bytes);
            SLog.v(TAG, "onMessage bytes=" + bytes);
        }

        @Override
        public void onClosing(WebSocket webSocket, int code, String reason) {
            super.onClosing(webSocket, code, reason);
            SLog.v(TAG, "onClosing code=" + code);
        }

        @Override
        public void onClosed(WebSocket webSocket, int code, String reason) {
            super.onClosed(webSocket, code, reason);
            SLog.v(TAG, "onClosed code=" + code);
        }

        @Override
        public void onFailure(WebSocket webSocket, Throwable t, Response response) {
            super.onFailure(webSocket, t, response);
            SLog.v(TAG, "onFailure t=" + t.getMessage());
        }
    }
}
