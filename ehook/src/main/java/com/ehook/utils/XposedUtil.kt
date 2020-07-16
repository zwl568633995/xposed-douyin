package com.ehook.utils

import android.os.Build
import android.os.Handler
import android.os.HandlerThread
import com.ehook.core.EHook
import com.ehook.helper.TryHelper.tryVerbosely
import com.ehook.helper.TryHelper.trySilently

object XposedUtil {

    private val workerPool = ParallelUtil.createThreadPool()

    private val managerThread = HandlerThread("HookHandler").apply { start() }

    private val managerHandler: Handler = Handler(managerThread.looper)

    @JvmStatic
    private inline fun tryHook(crossinline hook: () -> Unit) {
        when {
            Build.VERSION.SDK_INT >= Build.VERSION_CODES.N -> {
                tryVerbosely(hook)
            }
            Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP -> {
                workerPool.execute { tryVerbosely(hook) }
            }
            else -> {
                workerPool.execute { trySilently(hook) }
            }
        }
    }

    @JvmStatic
    fun postHooker(EHook: EHook) {
        managerHandler.post {
            EHook.hook()
        }
    }

}