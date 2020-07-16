package com.ehook.plugins

import com.ehook.core.Clazz
import com.ehook.core.HookCenter
import com.ehook.plugins.interfaces.IActivityHook

object ActivityHook : HookCenter() {

    override val interfaces: List<Class<*>>
        get() = listOf(IActivityHook::class.java)

    override fun provideEventHooker(event: String) = when (event) {
        "onCreate" ->
            iMethodNotifyHooker(
                clazz = Clazz.Activity,
                method = "onCreate",
                iClazz = IActivityHook::class.java,
                iMethodAfter = "onCreate",
                needObject = true,
                parameterTypes = *arrayOf(Clazz.Bundle)
            )
        "onStart" ->
            iMethodNotifyHooker(
                clazz = Clazz.Activity,
                method = "onStart",
                iClazz = IActivityHook::class.java,
                iMethodAfter = "onStart",
                needObject = true
            )
        "onResume" ->
            iMethodNotifyHooker(
                clazz = Clazz.Activity,
                method = "onResume",
                iClazz = IActivityHook::class.java,
                iMethodAfter = "onResume",
                needObject = true
            )
        "onPause" ->
            iMethodNotifyHooker(
                clazz = Clazz.Activity,
                method = "onPause",
                iClazz = IActivityHook::class.java,
                iMethodAfter = "onPause",
                needObject = true
            )
        "onStop" ->
            iMethodNotifyHooker(
                clazz = Clazz.Activity,
                method = "onStop",
                iClazz = IActivityHook::class.java,
                iMethodAfter = "onStop",
                needObject = true
            )
        "onDestroy" ->
            iMethodNotifyHooker(
                clazz = Clazz.Activity,
                method = "onDestroy",
                iClazz = IActivityHook::class.java,
                iMethodAfter = "onDestroy",
                needObject = true
            )
        else -> throw IllegalArgumentException("Unknown event: $event")
    }

}
