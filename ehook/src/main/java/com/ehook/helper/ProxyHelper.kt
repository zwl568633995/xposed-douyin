package com.ehook.helper

import com.ehook.HookGlobal
import com.ehook.core.InterfaceProxy
import com.ehook.utils.LogUtil
import java.lang.reflect.Proxy

object ProxyHelper {
    fun newProxyInstance(interfaceProxy: InterfaceProxy): Any {
        return Proxy.newProxyInstance(
            HookGlobal.classLoader,
            arrayOf(interfaceProxy.interfaces)
        ) { _, method, args ->
            val iMethod = ReflecterHelper.findMethodsByExactName(
                interfaceProxy::class.java,
                method.name
            ).firstOrNull()
            iMethod?.invoke(interfaceProxy, * args.orEmpty())
        }
    }
}