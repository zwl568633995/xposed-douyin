package com.xp.wx.backend.remote;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.wujieshuju.cm.server.IHttpPostCallback;
import com.wujieshuju.cm.server.IRemoteCallback;
import com.wujieshuju.cm.server.IRemoteService;
import com.xp.wx.Global;
import com.xp.wx.backend.remote.BaseRemote;
import com.xp.wx.backend.remote.RemoteCompat;
import com.xp.wx.util.DownloadClient;
import com.xp.wx.util.HandlerUtil;
import com.xp.wx.util.Log;
import com.xp.wx.util.OkHttpClientUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RemoteCompat extends BaseRemote {
    /* access modifiers changed from: protected */
    public void upload(ArrayList<String> arrayList, ArrayList<String> arrayList2, final BaseRemote.Callback callback) {
        if (this.mService instanceof IRemoteService) {
            try {
                ((IRemoteService) this.mService).upload(arrayList, arrayList2, new IRemoteCallback.Stub() {
                    public void onComplete(Map map) throws RemoteException {
                        HandlerUtil.getMainHandler().post(new Runnable(map) {
                            private final /* synthetic */ Map f$1;

                            {
                                this.f$1 = r2;
                            }

                            public final void run() {
                                RemoteCompat.AnonymousClass1.lambda$onComplete$0(BaseRemote.Callback.this, this.f$1);
                            }
                        });
                    }

                    static /* synthetic */ void lambda$onComplete$0(BaseRemote.Callback callback, Map map) {
                        callback.onComplete(map == null ? new HashMap() : new HashMap(map));
                    }
                });
            } catch (RemoteException e) {
                Log.warn("call upload AIDL error. " + e.getMessage() + ", " + android.util.Log.getStackTraceString(e));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void download(ArrayList<String> arrayList, ArrayList<String> arrayList2, boolean z, final DownloadClient.DownloadCallback downloadCallback) {
        if (this.mService instanceof IRemoteService) {
            try {
                ((IRemoteService) this.mService).download(arrayList, arrayList2, z, new IRemoteCallback.Stub() {
                    public void onComplete(Map map) throws RemoteException {
                        HandlerUtil.getMainHandler().post(new Runnable(map) {
                            private final /* synthetic */ Map f$1;

                            {
                                this.f$1 = r2;
                            }

                            public final void run() {
                                RemoteCompat.AnonymousClass2.lambda$onComplete$0(DownloadClient.DownloadCallback.this, this.f$1);
                            }
                        });
                    }

                    static /* synthetic */ void lambda$onComplete$0(DownloadClient.DownloadCallback downloadCallback, Map map) {
                        downloadCallback.onDownloadFinished(map == null ? new HashMap() : new HashMap(map));
                    }
                });
            } catch (RemoteException e) {
                Log.warn("call download AIDL error. " + e.getMessage() + ", " + android.util.Log.getStackTraceString(e));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void post(String str, String str2, Map<String, String> map, Map<String, String> map2, final OkHttpClientUtil.Callback callback) {
        if (this.mService instanceof IRemoteService) {
            try {
                ((IRemoteService) this.mService).httpPost(str, str2, map, map2, new IHttpPostCallback.Stub() {
                    public void onFail(String str) {
                        HandlerUtil.getMainHandler().post(new Runnable(str) {
                            private final /* synthetic */ String f$1;

                            {
                                this.f$1 = r2;
                            }

                            public final void run() {
                                OkHttpClientUtil.Callback.this.onFail(this.f$1);
                            }
                        });
                    }

                    public void onComplete(String str) {
                        HandlerUtil.getMainHandler().post(new Runnable(str) {
                            private final /* synthetic */ String f$1;

                            {
                                this.f$1 = r2;
                            }

                            public final void run() {
                                OkHttpClientUtil.Callback.this.onComplete(this.f$1);
                            }
                        });
                    }
                });
            } catch (RemoteException e) {
                Log.warn("call post AIDL error. " + e.getMessage() + ", " + android.util.Log.getStackTraceString(e));
            }
        }
    }

    /* access modifiers changed from: protected */
    public String postSync(String str, String str2, Map<String, String> map, Map<String, String> map2) {
        if (!(this.mService instanceof IRemoteService)) {
            return "远程服务调用异常";
        }
        try {
            return ((IRemoteService) this.mService).httpPostSync(str, str2, map, map2);
        } catch (RemoteException e) {
            Log.warn("call postSync AIDL error. " + e.getMessage() + ", " + android.util.Log.getStackTraceString(e));
            return "远程服务调用异常";
        }
    }

    /* access modifiers changed from: protected */
    public IInterface asInterface(IBinder iBinder) {
        return IRemoteService.Stub.asInterface(iBinder);
    }

    /* access modifiers changed from: protected */
    public Intent createBindIntent() {
        Intent intent = new Intent();
        intent.setPackage(Global.HUIDOU_PACKAGE_NAME);
        intent.setAction("com.wujieshuju.huidou.server.RemoteService");
        return intent;
    }
}
