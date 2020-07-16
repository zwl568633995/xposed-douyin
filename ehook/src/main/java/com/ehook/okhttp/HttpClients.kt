package com.ehook.okhttp

import android.util.Log
import com.ehook.cache.LRUCache
import com.ehook.helper.MD5
import com.ehook.helper.TryHelper.tryMainThreadly
import com.ehook.utils.LogUtil
import okhttp3.*
import java.io.IOException


object HttpClients {

    /**
     * 同步下载资源文件，这里由于企业微信发送文件必须是本地路径，故缓存策略固定为DISK
     * @param urlString 下载地址
     * @param type 文件类型
     * @param retryTimes 重试次数，默认不重试
     *
     * @return 文件缓存地址
     */
    fun download(
        urlString: String,
        type: IHttpConfigs.Type = IHttpConfigs.Type.DEFAULT,
        retryTimes: Int = 0
    ): String? {
        if (!urlString.startsWith("http")) return null
        return try {
            val request = Request.Builder().url(urlString).build()
            OkHttpClient.Builder()
                .addInterceptor(Interceptors.getRetryInterceptor(retryTimes))
                .addInterceptor(
                    Interceptors.getCacheInterceptor(
                        IHttpConfigs.CachePolicy.DISK,
                        type
                    )
                )
                .build().newCall(request).execute()
            val cacheKey = request.url.toString().MD5()
            LRUCache.cacheDiskPath(type.value, cacheKey)
        } catch (e: Exception) {
            Log.e(HttpClients::class.java.name, "download fail: ${e.message}")
            null
        }
    }

    /**
     * 异步下载资源文件
     * @param urlString 下载地址
     * @param type 文件类型
     * @param retryTimes 重试次数，默认不重试
     * @param iDownloadCallback 下载回调
     * @param iProgressRequestCallback 上传进度
     * @param iProgressResponseCallback 下载进度
     */
    fun download(
        urlString: String, type: IHttpConfigs.Type = IHttpConfigs.Type.DEFAULT,
        retryTimes: Int = 0, iDownloadCallback: IDownloadCallback,
        iProgressRequestCallback: IProgressRequestCallback? = null,
        iProgressResponseCallback: IProgressResponseCallback? = null
    ) {
        val clientBuilder = OkHttpClient.Builder()
            .addInterceptor(Interceptors.getRetryInterceptor(retryTimes))
            .addInterceptor(Interceptors.getCacheInterceptor(IHttpConfigs.CachePolicy.DISK, type))
//        if (iProgressRequestCallback != null) {
//            clientBuilder.addInterceptor(Interceptors.getProgressRequestInterceptor(iProgressRequestCallback))
//        }
//        if (iProgressResponseCallback != null) {
//            clientBuilder.addInterceptor(Interceptors.getProgressResponseInterceptor(iProgressResponseCallback))
//        }

        val request = Request.Builder().url(urlString).build()
        LogUtil.e(HttpClients.javaClass.simpleName,"start")
        clientBuilder.build().newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                LogUtil.e(HttpClients.javaClass.simpleName,"onFailure")
                tryMainThreadly {
                    iDownloadCallback(null, type)
                }
            }

            override fun onResponse(call: Call, response: Response) {
                LogUtil.e(HttpClients.javaClass.simpleName,"response$")
                val cacheKey = call.request().url.toString().MD5()
                tryMainThreadly {
                    iDownloadCallback(LRUCache.cacheDiskPath(type.value, cacheKey), type)
                }
            }
        })
    }

}