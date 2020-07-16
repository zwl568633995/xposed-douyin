package com.evan.dy.debug;

import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

import com.ehook.utils.LogUtil;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpUtils {
    private static final java.lang.String TAG = "HttpClientUtils";
    private String urlPath;
    private String outPath;
    private String fileName;

    /**
     * @param urlPath
     * @param outPath
     * @param fileName
     */
    public HttpUtils(String urlPath, String outPath, String fileName) {
        this.fileName = fileName;
        this.outPath = outPath;
        this.urlPath = urlPath;
    }

    /**
     * 下载文件
     */
    public void downloadFile() {
        // 启动新线程下载软件
        new downloadFileThread().start();
    }

    /**
     * 下载文件线程
     */
    private class downloadFileThread extends Thread {
        @Override
        public void run() {
            try {
                // 判断SD卡是否存在，并且是否具有读写权限
                // 获得存储卡的路径
                //http://182.92.158.132/cloud/cloudfile?path=/public/notice/201606101737302282/16-131109141345 (1)_20160610173730880.jpg
                //http://182.92.158.132/cloud/cloudfile?path=/public/notice/201606101737302282/16-131109141345%20(1)_20160610173730880.jpg
                URL url = new URL(urlPath);
                // 创建连接
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.connect();
                // 获取文件大小
                int length = conn.getContentLength();
                // 创建输入流
                InputStream is = conn.getInputStream();
                LogUtil.INSTANCE.e("xxxx", "start");
                outPath = Environment.getExternalStorageDirectory().getPath() + File.separator + outPath;
                File file = new File(outPath);
                // 判断文件目录是否存在
                if (!file.exists()) {
                    file.mkdirs();
                }
                File apkFile = new File(outPath, fileName);
                FileOutputStream fos = new FileOutputStream(apkFile);
                int count = 0;
                // 缓存
                byte buf[] = new byte[1024];
                // 写入到文件中

                int numread = is.read(buf);
                count += numread;
                Log.e("xxxxx", "count .." + count + "  numread .." + numread);
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        LogUtil.INSTANCE.e("xxxx", "hh");
                    }
                },0);
                // 写入文件
                fos.write(buf, 0, numread);
                fos.close();
                is.close();
            } catch (MalformedURLException e) {
                e.printStackTrace();
                LogUtil.INSTANCE.e("xxxx", "ss");
            } catch (IOException e) {
                LogUtil.INSTANCE.e("xxxx", "sssss");
                e.printStackTrace();
            }

        }
    }
}
