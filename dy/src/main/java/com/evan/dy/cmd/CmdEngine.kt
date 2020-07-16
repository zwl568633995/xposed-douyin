package com.evan.dy.cmd

import com.evan.socket.SocketRequestHandler

object CmdEngine {
    var cmdList: List<SocketRequestHandler> =
        CmdUser.comList

}
