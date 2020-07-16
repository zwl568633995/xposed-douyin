package com.evan.socket;

public interface SocketRequestHandler {
    void handleRequest(SocketRequest socketRequest, SocketResponse socketResponse);
}
