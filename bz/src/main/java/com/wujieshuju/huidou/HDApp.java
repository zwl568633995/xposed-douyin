package com.wujieshuju.huidou;

import android.app.Application;
import android.graphics.Bitmap;
import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.cache.memory.impl.UsingFreqLimitedMemoryCache;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;
import com.nostra13.universalimageloader.core.download.BaseImageDownloader;
import com.wujieshuju.huidou.util.LogUtil;

public class HDApp extends Application {
    private static HDApp mApp;

    public void onCreate() {
        super.onCreate();
        mApp = this;
        init();
    }

    private void init() {
        LogUtil.init(this);
        initImageLoader();
    }

    private void initImageLoader() {
        ImageLoader.getInstance().init(new ImageLoaderConfiguration.Builder(this).memoryCacheExtraOptions(480, 800).denyCacheImageMultipleSizesInMemory().diskCacheFileNameGenerator(new Md5FileNameGenerator()).memoryCache(new UsingFreqLimitedMemoryCache(2097152)).memoryCacheSize(2097152).diskCacheSize(52428800).tasksProcessingOrder(QueueProcessingType.LIFO).defaultDisplayImageOptions(new DisplayImageOptions.Builder().cacheInMemory(false).cacheOnDisk(true).bitmapConfig(Bitmap.Config.RGB_565).considerExifParams(true).resetViewBeforeLoading(true).build()).imageDownloader(new BaseImageDownloader(this, BaseImageDownloader.DEFAULT_HTTP_CONNECT_TIMEOUT, 30000)).build());
    }

    public static HDApp getApp() {
        return mApp;
    }
}
