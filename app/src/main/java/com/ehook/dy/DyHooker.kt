package com.ehook.dy

import android.app.ActivityManager
import android.app.Application
import android.content.Context
import android.os.Process
import android.text.TextUtils
import com.ehook.EasyHook
import com.ehook.HookGlobal
import com.ehook.helper.TryHelper.tryVerbosely
import com.ehook.plugins.SharedEngine
import com.ehook.utils.LogUtil
import com.evan.dy.Global
import com.evan.dy.WeWorkService
import com.evan.dy.plugins.WwEngine
import dalvik.system.PathClassLoader
import de.robv.android.xposed.*
import de.robv.android.xposed.callbacks.XC_LoadPackage
import java.io.File


class DyHooker : IXposedHookLoadPackage, IXposedHookZygoteInit {

    override fun handleLoadPackage(lpparam: XC_LoadPackage.LoadPackageParam) {
        tryVerbosely {
            LogUtil.e("DyHooker", "processName= all =${lpparam.processName} packageName =${lpparam.packageName}")
            if (TextUtils.equals(Global.DY_PACKAGE_NAME, lpparam.processName) &&
                TextUtils.equals(Global.DY_PACKAGE_NAME, lpparam.packageName) &&
                EasyHook.isImportantDyProcess(lpparam)) {
                LogUtil.e("DyHooker", "processName= dy ........")
                hookDyAttachBaseContext(lpparam.classLoader) {
                    LogUtil.e("DyHooker", "processName= dy ... ${lpparam.processName} packageName =${lpparam.packageName}")
                    if (TextUtils.equals(Global.DY_PACKAGE_NAME, getCurrentProcessName(it))) {
                        LogUtil.e("DyHooker", "processName= dyp ... ${lpparam.processName} packageName =${lpparam.packageName}")
                        if (Global.isDebug) {
                            HookGlobal.unitTestMode = true
                            hookDyOnFly(lpparam, it)
                        } else {
                            hookDy(lpparam, it)
                        }
                    }
                }
            } else if (TextUtils.equals(Hooker.TARGET_PACKAGE, lpparam.processName)) {
                hookAttachBaseContext(lpparam.classLoader) {
                    hookLoadHooker(lpparam.classLoader)
                }
            }
        }
    }
    private fun getCurrentProcessName(context: Context): String? {
        val pid = Process.myPid()
        var processName = ""
        val manager = context.getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        for (process in manager.runningAppProcesses) {
            if (process.pid == pid) {
                processName = process.processName
            }
        }
        return processName
    }
    private fun hookLoadHooker(classLoader: ClassLoader) {

        XposedHelpers.findAndHookMethod(
            "com.ehook.dy.MainActivity", classLoader,
            "checkHook", object : XC_MethodReplacement() {
            override fun replaceHookedMethod(param: MethodHookParam): Any = true
        })
    }

    override fun initZygote(startupParam: IXposedHookZygoteInit.StartupParam?) {
        LogUtil.e(
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
    private fun hookDyAttachBaseContext(classLoader: ClassLoader, callback: (Context) -> Unit) {
        XposedHelpers.findAndHookMethod(
            "com.ss.android.ugc.aweme.app.host.HostApplication",
            classLoader,
            "attachBaseContext",
            Context::class.java,
            object : XC_MethodHook() {
                override fun afterHookedMethod(param: MethodHookParam?) {
                    callback(param?.thisObject as? Application ?: return)
                }
            })
    }

    private fun hookDy(param: XC_LoadPackage.LoadPackageParam, context: Context) {
        when (param.packageName) {
            Global.DY_PACKAGE_NAME -> {
                LogUtil.e("DyHooker", "抖音开启...")
                EasyHook.startup(
                    lpparam = param,
                    plugins = WwEngine.plugins,
                    centers = WwEngine.hookCenters + SharedEngine.hookCenters
                )
                WeWorkService.onCreate()
            }
        }
    }


    private fun hookDyOnFly(param: XC_LoadPackage.LoadPackageParam, context: Context) {
        LogUtil.e("DyHooker", "fly 抖音开启")
        val path = EasyHook.getApplicationApkPath(
            context, Hooker.TARGET_PACKAGE
        )
        when (File(path).exists()) {
            true -> {
                val pathClassLoader = PathClassLoader(path, ClassLoader.getSystemClassLoader())
                val clazz = pathClassLoader.loadClass(DyHooker::class.java.name)
                val instance = clazz.newInstance()
                val method = clazz.getDeclaredMethod(
                    "hookDy",
                    XC_LoadPackage.LoadPackageParam::class.java,
                    Context::class.java
                )
                method.isAccessible = true
                method.invoke(instance, param, context)
            }
            false -> LogUtil.v("未发现指定的插件")
        }
    }


}
