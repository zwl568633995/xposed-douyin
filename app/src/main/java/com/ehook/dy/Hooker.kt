package com.ehook.dy

import android.app.Application
import android.content.Context
import com.ehook.helper.TryHelper.tryVerbosely
import com.ehook.utils.LogUtil
import de.robv.android.xposed.*
import de.robv.android.xposed.callbacks.XC_LoadPackage


class Hooker : IXposedHookLoadPackage, IXposedHookZygoteInit {
    companion object {
        const val TARGET_PACKAGE = "com.ehook.dy"
    }

    override fun handleLoadPackage(lpparam: XC_LoadPackage.LoadPackageParam) {
        tryVerbosely {
            when (lpparam.processName) {
                TARGET_PACKAGE ->
                    hookAttachBaseContext(lpparam.classLoader) {
                        hookLoadHooker(lpparam.classLoader)
                    }
            }
        }
    }


    override fun initZygote(startupParam: IXposedHookZygoteInit.StartupParam?) {
        LogUtil.v(
            "initZygote  ${startupParam?.modulePath}   ${startupParam?.startsSystemServer}"
        )
    }

    private fun hookAttachBaseContext(classLoader: ClassLoader, callback: (Context) -> Unit) {
        XposedHelpers.findAndHookMethod(
            "android.content.ContextWrapper",
            classLoader,
            "attachBaseContext",
            Context::class.java,
            object : XC_MethodHook() {
                override fun afterHookedMethod(param: MethodHookParam?) {
                    callback(param?.thisObject as? Application ?: return)
                }
            })
    }

    private fun hookLoadHooker(classLoader: ClassLoader) {
        LogUtil.v("启动抖音插件")
        XposedHelpers.findAndHookMethod(
            "com.ehook.dy.MainActivity", classLoader,
            "checkHook", object : XC_MethodReplacement() {
                override fun replaceHookedMethod(param: MethodHookParam): Any = true
            })
    }

}
