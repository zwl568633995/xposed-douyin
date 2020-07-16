package com.evan.dy.api.callback


interface EICommonCallback {
    fun onResult(code: Int?, message: String?, obj: Any?)
}

interface EICommonCallback2 {
    fun onResult(code: Int?, message: String?, userArr: Array<Any>?)
}
interface EICommonCallback3 {
    fun onResult(code: Int?, message: String?, depArr: Array<Any>?, userArr: Array<Any>?)
}
interface EIConversationAndUsers {
    fun onResult(code: Int?, message: String?, conversation: Any?, userArr: Array<Any>?)
}
interface EIMessageCallback {
    fun onResult(code: Int?, message: String?, messageArr: Array<Any>?)
}
