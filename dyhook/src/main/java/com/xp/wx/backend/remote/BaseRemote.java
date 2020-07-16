package com.xp.wx.backend.remote;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import com.xp.wx.backend.remote.BaseRemote;
import com.xp.wx.spellbook.util.AppUtil;
import com.xp.wx.util.DownloadClient;
import com.xp.wx.util.HandlerUtil;
import com.xp.wx.util.Log;
import com.xp.wx.util.OkHttpClientUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class BaseRemote {
    public static final int MSG_RECONNECT = 100;
    /* access modifiers changed from: private */
    public boolean mIsBinding = false;
    /* access modifiers changed from: private */
    public final Object mLock = new Object();
    private Handler mMainHandler = HandlerUtil.getMainHandler();
    /* access modifiers changed from: private */
    public Handler mRemoteHandler = new Handler(HandlerUtil.createNewHandler("RemoteHandler").getLooper()) {
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 100) {
                BaseRemote.this.bindUploadService();
            }
        }
    };
    protected IInterface mService = null;
    private ServiceConnection mServiceConnection = new ServiceConnection() {
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            synchronized (BaseRemote.this.mLock) {
                Log.debug("remote. onServiceConnected");
                BaseRemote.this.mRemoteHandler.removeMessages(100);
                BaseRemote.this.mService = BaseRemote.this.asInterface(iBinder);
                BaseRemote.this.mLock.notifyAll();
                boolean unused = BaseRemote.this.mIsBinding = false;
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            synchronized (BaseRemote.this.mLock) {
                Log.debug("remote. onServiceDisconnected");
                BaseRemote.this.mService = null;
                boolean unused = BaseRemote.this.mIsBinding = false;
                if (BaseRemote.this.mRemoteHandler != null) {
                    BaseRemote.this.mRemoteHandler.removeMessages(100);
                    BaseRemote.this.mRemoteHandler.sendEmptyMessageDelayed(100, 2000);
                }
            }
        }
    };

    public interface Callback {
        void onComplete(HashMap<String, String> hashMap);
    }

    /* access modifiers changed from: protected */
    public abstract IInterface asInterface(IBinder iBinder);

    /* access modifiers changed from: protected */
    public abstract Intent createBindIntent();

    /* access modifiers changed from: protected */
    public abstract void download(ArrayList<String> arrayList, ArrayList<String> arrayList2, boolean z, DownloadClient.DownloadCallback downloadCallback);

    /* access modifiers changed from: protected */
    public abstract void post(String str, String str2, Map<String, String> map, Map<String, String> map2, OkHttpClientUtil.Callback callback);

    /* access modifiers changed from: protected */
    public abstract String postSync(String str, String str2, Map<String, String> map, Map<String, String> map2);

    /* access modifiers changed from: protected */
    public abstract void upload(ArrayList<String> arrayList, ArrayList<String> arrayList2, Callback callback);

    public Handler getRemoteHandler() {
        return this.mRemoteHandler;
    }

    public void destroy() {
        synchronized (this.mLock) {
            if (this.mRemoteHandler != null) {
                this.mRemoteHandler.removeMessages(100);
                this.mRemoteHandler = null;
            }
            AppUtil.INSTANCE.getSystemContext().unbindService(this.mServiceConnection);
            this.mService = null;
        }
    }

    /* access modifiers changed from: private */
    public void bindUploadService() {
        synchronized (this.mLock) {
            if (!this.mIsBinding) {
                Log.debug("remote. bindUploadService");
                this.mRemoteHandler.removeMessages(100);
                this.mIsBinding = true;
                AppUtil.INSTANCE.getSystemContext().bindService(createBindIntent(), this.mServiceConnection, 1);
            }
        }
    }

    public void checkRemoteState() {
        synchronized (this.mLock) {
            if (this.mService == null) {
                bindUploadService();
                Log.debug("remote service = null, wait");
                try {
                    this.mLock.wait(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void uploadFiles(ArrayList<String> arrayList, ArrayList<String> arrayList2, Callback callback) {
        checkRemoteState();
        if (this.mService == null) {
            Log.error("upload. can't bind service");
            this.mMainHandler.post(new Runnable() {
                public final void run() {
                    BaseRemote.Callback.this.onComplete(new HashMap());
                }
            });
            return;
        }
        upload(arrayList, arrayList2, callback);
    }

    public void downloadFiles(ArrayList<String> arrayList, ArrayList<String> arrayList2, boolean z, DownloadClient.DownloadCallback downloadCallback) {
        checkRemoteState();
        if (this.mService == null) {
            Log.error("download. can't bind service");
            this.mMainHandler.post(new Runnable() {
                public final void run() {
                    DownloadClient.DownloadCallback.this.onDownloadFinished(new HashMap());
                }
            });
            return;
        }
        download(arrayList, arrayList2, z, downloadCallback);
    }

    public void httpPost(String str, String str2, Map<String, String> map, Map<String, String> map2, OkHttpClientUtil.Callback callback) {
        checkRemoteState();
        if (this.mService == null) {
            Log.error("httpPost. can't bind service");
            this.mMainHandler.post(new Runnable() {
                public final void run() {
                    OkHttpClientUtil.Callback.this.onFail("远程服务连接失败");
                }
            });
            return;
        }
        post(str, str2, map, map2, callback);
    }

    public String httpPostSync(String str, String str2, Map<String, String> map, Map<String, String> map2) {
        checkRemoteState();
        if (this.mService != null) {
            return postSync(str, str2, map, map2);
        }
        Log.error("httpPost. can't bind service");
        return "远程服务连接失败";
    }
}
