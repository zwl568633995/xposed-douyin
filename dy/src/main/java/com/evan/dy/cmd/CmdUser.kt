package com.evan.dy.cmd

import com.ehook.helper.TryHelper
import com.evan.dy.api.ChatRoomApi
import com.evan.dy.api.DyHookApi
import com.evan.dy.api.callback.EICommonCallback
import com.evan.dy.cmd.model.*
import com.evan.socket.JsonUtil
import com.evan.socket.SocketRequest
import com.evan.socket.SocketRequestHandler
import com.evan.socket.SocketResponse

object CmdUser {
    var comList = listOf(
        Cmd212(),
        Cmd213(),
        Cmd214(),
        Cmd215(),
        Cmd216(),
        Cmd217(),
        Cmd218(),
        Cmd219(),
        Cmd220(),
        Cmd221(),
        Cmd222()
    )

    /**
     * 获取用户信息
     */
    class Cmd212 : SocketRequestHandler {
        override fun handleRequest(socketRequest: SocketRequest?, socketResponse: SocketResponse?) {
            val userInfo = DyHookApi.getCurrUser()
            if (userInfo != null) {
                socketResponse?.success(userInfo)
            } else {
                socketResponse?.failed("获取用户信息失败")
            }
        }
    }

    /**
     * 获取粉丝
     */
    class Cmd213 : SocketRequestHandler {
        override fun handleRequest(socketRequest: SocketRequest?, socketResponse: SocketResponse?) {
            if (socketRequest?.cmdData?.data != null) {
                TryHelper.tryMainThreadly {
                    var cmdBean =
                        JsonUtil.fromObj(
                            socketRequest.cmdData.data,
                            Cmd213Bean::class.java
                        )
                    DyHookApi.getFollowerList(cmdBean.maxTime, cmdBean.count, cmdBean.offset, object : EICommonCallback {
                        override fun onResult(code: Int?, message: String?, obj: Any?) {
                            if (obj != null) {
                                socketResponse?.success(obj)
                            } else {
                                socketResponse?.failed(message)
                            }
                        }
                    })
                }
            } else {
                socketResponse?.failed(-1, "数据格式不正确")
            }
        }
    }

    /**
     * 发送消息
     */
    class Cmd214 : SocketRequestHandler {
        override fun handleRequest(socketRequest: SocketRequest?, socketResponse: SocketResponse?) {
            if (socketRequest?.cmdData?.data != null) {
                TryHelper.tryMainThreadly {
                    var cmdBean =
                        JsonUtil.fromObj(
                            socketRequest.cmdData.data,
                            Cmd214Bean::class.java
                        )
                    DyHookApi.sendChatText(cmdBean.uid, cmdBean.content, object : EICommonCallback {
                        override fun onResult(code: Int?, message: String?, obj: Any?) {
                            if (obj != null) {
                                socketResponse?.success(obj)
                            } else {
                                socketResponse?.failed(message)
                            }
                        }
                    })
                }
            } else {
                socketResponse?.failed(-1, "数据格式不正确")
            }
        }
    }
    /**
     * 发送直播消息
     */
    class Cmd215 : SocketRequestHandler {
        override fun handleRequest(socketRequest: SocketRequest?, socketResponse: SocketResponse?) {
            if (socketRequest?.cmdData?.data != null) {
                TryHelper.tryMainThreadly {
                    var cmdBean =
                        JsonUtil.fromObj(
                            socketRequest.cmdData.data,
                            Cmd214Bean::class.java
                        )
                    ChatRoomApi.sendRoomTextMsg(cmdBean.content, object : EICommonCallback {
                        override fun onResult(code: Int?, message: String?, obj: Any?) {
                            if (obj != null) {
                                socketResponse?.success(obj)
                            } else {
                                socketResponse?.failed(message)
                            }
                        }
                    })
                }
            } else {
                socketResponse?.failed(-1, "数据格式不正确")
            }
        }
    }
    /**
     * 获取当前直播间
     */
    class Cmd216 : SocketRequestHandler {
        override fun handleRequest(socketRequest: SocketRequest?, socketResponse: SocketResponse?) {
            if (socketRequest?.cmdData!=null) {
                TryHelper.tryMainThreadly {
                    var room = DyHookApi.getCurRoom()
                    if (room != null) {
                        socketResponse?.success(room)
                    } else {
                        socketResponse?.failed("fail")
                    }
                }
            } else {
                socketResponse?.failed(-1, "数据格式不正确")
            }
        }
    }



    /**
     * 获取商品
     */
    class Cmd217 : SocketRequestHandler {
        override fun handleRequest(socketRequest: SocketRequest?, socketResponse: SocketResponse?) {
            if (socketRequest?.cmdData!=null) {
                TryHelper.tryMainThreadly {
//                    var cmdBean =
//                        JsonUtil.fromObj(
//                            socketRequest.cmdData.data,
//                            Cmd217Bean::class.java
//                        )
                    ChatRoomApi.getLivePromotions(object : EICommonCallback {
                        override fun onResult(code: Int?, message: String?, obj: Any?) {
                            if (obj != null) {
                                socketResponse?.success(obj)
                            } else {
                                socketResponse?.failed(message)
                            }
                        }
                    })
                }
            } else {
                socketResponse?.failed(-1, "数据格式不正确")
            }
        }
    }

    /**
     * 涮单
     */
    class Cmd218 : SocketRequestHandler {
        override fun handleRequest(socketRequest: SocketRequest?, socketResponse: SocketResponse?) {
            if (socketRequest?.cmdData!=null) {
                TryHelper.tryMainThreadly {
//                    var cmdBean =
//                        JsonUtil.fromObj(
//                            socketRequest.cmdData.data,
//                            Cmd218Bean::class.java
//                        )
                    ChatRoomApi.sendLiveEvent(object : EICommonCallback {
                        override fun onResult(code: Int?, message: String?, obj: Any?) {
                            if (obj != null) {
                                socketResponse?.success(obj)
                            } else {
                                socketResponse?.failed(message)
                            }
                        }
                    })
                }
            } else {
                socketResponse?.failed(-1, "数据格式不正确")
            }
        }
    }

    /**
     * 点赞
     */
    class Cmd219 : SocketRequestHandler {
        override fun handleRequest(socketRequest: SocketRequest?, socketResponse: SocketResponse?) {
            if (socketRequest?.cmdData!=null) {
                TryHelper.tryMainThreadly {
//                    var cmdBean =
//                        JsonUtil.fromObj(
//                            socketRequest.cmdData.data,
//                            Cmd218Bean::class.java
//                        )
                    ChatRoomApi.digg(object : EICommonCallback {
                        override fun onResult(code: Int?, message: String?, obj: Any?) {
                            if (obj != null) {
                                socketResponse?.success(obj)
                            } else {
                                socketResponse?.failed(message)
                            }
                        }
                    })
                }
            } else {
                socketResponse?.failed(-1, "数据格式不正确")
            }
        }
    }

    /**
     * 刷礼物
     */
    class Cmd220 : SocketRequestHandler {
        override fun handleRequest(socketRequest: SocketRequest?, socketResponse: SocketResponse?) {
            if (socketRequest?.cmdData?.data != null) {
                TryHelper.tryMainThreadly {
                    var cmdBean =
                        JsonUtil.fromObj(
                            socketRequest.cmdData.data,
                            Cmd220Bean::class.java
                        )
                    ChatRoomApi.sendGift(cmdBean.giftName, cmdBean.count, object : EICommonCallback {
                        override fun onResult(code: Int?, message: String?, obj: Any?) {
                            if (obj != null) {
                                socketResponse?.success(obj)
                            } else {
                                socketResponse?.failed(message)
                            }
                        }
                    })
                }
            } else {
                socketResponse?.failed(-1, "数据格式不正确")
            }
        }
    }
    /**
     * 查询礼物id
     */
    class Cmd221 : SocketRequestHandler {
        override fun handleRequest(socketRequest: SocketRequest?, socketResponse: SocketResponse?) {
            if (socketRequest?.cmdData?.data != null) {
                TryHelper.tryMainThreadly {
                    var cmdBean =
                        JsonUtil.fromObj(
                            socketRequest.cmdData.data,
                            Cmd221Bean::class.java
                        )
                    val giftIdFromName = ChatRoomApi.getGiftIdFromName(cmdBean.name)
                    if (giftIdFromName >-1) {
                        socketResponse?.success(giftIdFromName)
                    } else {
                        socketResponse?.failed("fail")
                    }
                }
            } else {
                socketResponse?.failed(-1, "数据格式不正确")
            }
        }
    }
    /**
     * 群发消息
     */
    class Cmd222 : SocketRequestHandler {
        override fun handleRequest(socketRequest: SocketRequest?, socketResponse: SocketResponse?) {
            if (socketRequest?.cmdData?.data != null) {
                TryHelper.tryMainThreadly {
                    var cmdBean =
                        JsonUtil.fromObj(
                            socketRequest.cmdData.data,
                            Cmd222Bean::class.java
                        )
//                    count: Int, gender: Int, followStatus: Int,content
                    DyHookApi.sendMass(cmdBean.count,cmdBean.gender,cmdBean.followStatus,cmdBean.content,object :EICommonCallback{
                        override fun onResult(code: Int?, message: String?, obj: Any?) {
                            if (code == 0) {
                                socketResponse?.success(message)
                            } else {
                                socketResponse?.failed("fail")
                            }
                        }
                    })
                }
            } else {
                socketResponse?.failed(-1, "数据格式不正确")
            }
        }
    }
}
