package com.ehook

import android.content.Context
import android.os.Build
import android.util.Log
import com.ehook.utils.LogUtil
import com.ehook.core.HookCenter
import com.ehook.core.IHookProvider
import com.ehook.core.Version
import com.ehook.utils.ParallelUtil.parallelForEach
import com.ehook.utils.XposedUtil
import de.robv.android.xposed.XposedBridge
import de.robv.android.xposed.XposedHelpers
import de.robv.android.xposed.callbacks.XC_LoadPackage
import java.io.File

object EasyHook {
    fun isImportantDyProcess(lpparam: XC_LoadPackage.LoadPackageParam): Boolean {
        val processName = lpparam.processName
        when {
            processName.contains(':') -> {
                return false
            }
        }
        // 检查微信依赖的JNI库是否存在, 以此判断当前应用是不是微信/企业微信
        val features = listOf (
            "libv8.cr.so",
            "libavmdl.so",
            "libcutsame.so",
            "libAkeva.so"
        )
        return try {
            val libraryDir = File(lpparam.appInfo.nativeLibraryDir)
            features.filter { filename ->
                File(libraryDir, filename).exists()
            }.size >= 2
        } catch (t: Throwable) { false }
    }
    fun isImportantWechatProcess(lpparam: XC_LoadPackage.LoadPackageParam): Boolean {
        val processName = lpparam.processName
        when {
            !processName.contains(':') -> {
            }
            processName.endsWith(":tools") -> {
            }
            else -> return false
        }
        // 检查微信依赖的JNI库是否存在, 以此判断当前应用是不是微信/企业微信
        val features = listOf (
            "libwechatcommon.so",
            "libwechatmm.so",
            "libwechatnetwork.so",
            "libwechatsight.so",
            "libwechatxlog.so"
        )
        return try {
            val libraryDir = File(lpparam.appInfo.nativeLibraryDir)
            features.filter { filename ->
                File(libraryDir, filename).exists()
            }.size >= 2
        } catch (t: Throwable) { false }
    }

    fun getSystemContext(): Context {
        val activityThreadClass = XposedHelpers.findClass("android.app.ActivityThread", null)
        val activityThread = XposedHelpers.callStaticMethod(activityThreadClass, "currentActivityThread")
        val context = XposedHelpers.callMethod(activityThread, "getSystemContext") as Context?
        return context ?: throw Error("Failed to get system context.")
    }

    // 查找apk路径
    fun getApplicationApkPath(context: Context, packageName: String): String {
        val pm = context.packageManager
        val apkPath = pm.getApplicationInfo(packageName, 0)?.publicSourceDir
        return apkPath ?: throw Error("Failed to get the APK path of $packageName")
    }

    fun getApplicationApkPath(packageName: String): String {
        val pm = EasyHook.getSystemContext().packageManager
        val apkPath = pm.getApplicationInfo(packageName, 0).publicSourceDir
        return apkPath ?: throw Error("Failed to get the APK path of $packageName")
    }

    fun getApplicationLibsPath(packageName: String): String =
            "${getApplicationApkPath(packageName).removeSuffix("base.apk")}lib/${Build.SUPPORTED_ABIS.first().split("-").first()}"

    fun getApplicationVersion(packageName: String): Version {
        val pm = getSystemContext().packageManager
        val versionName = pm.getPackageInfo(packageName, 0).versionName
        return Version(
            versionName
                ?: throw Error("Failed to get the version of $packageName")
        )
    }

    fun startup(lpparam: XC_LoadPackage.LoadPackageParam, plugins: List<Any>?, centers: List<HookCenter>) {
        XposedBridge.log("Wechat EHooker: ${plugins?.size ?: 0} plugins.")
        HookGlobal.init(lpparam) {
            when (it) {
                true -> {
                    registerPlugins(plugins, centers)
                    registerHookers(plugins)
//                    XposedHelpers.setObjectField(
//                        EasyHook::class.java.classLoader?.parent,
//                        "parent",
//                        lpparam.classLoader
//                    )
                }
                else ->
                    LogUtil.v("查找初始化失败")
            }
        }
    }

    private fun registerPlugins(plugins: List<Any>?, centers: List<HookCenter>) {
        val observers = plugins?.filter { it !is IHookProvider } ?: listOf()
        centers.parallelForEach { center ->
            center.interfaces.forEach { `interface` ->
                observers.forEach { plugin ->
                    val assignable = `interface`.isAssignableFrom(plugin::class.java)
                    if (assignable) {
                        center.register(`interface`, plugin)
                    }
                }
            }
        }
    }

    /**
     * 检查插件中是否存在自定义的事件, 将它们直接注册到 Xposed 框架上
     */
    private fun registerHookers(plugins: List<Any>?) {
        val providers = plugins?.filter { it is IHookProvider } ?: listOf()
        providers.parallelForEach {
            (it as IHookProvider).provideStaticHookers()?.forEach { hooker ->
                if (!hooker.hasHooked) {
                    XposedUtil.postHooker(hooker)
                }
            }
        }
    }
}
