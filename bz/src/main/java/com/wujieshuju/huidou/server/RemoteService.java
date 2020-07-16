package com.wujieshuju.huidou.server;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.wujieshuju.huidou.Const;
import com.wujieshuju.huidou.network.OkHttpClientUtil;
import com.wujieshuju.huidou.util.LogUtil;
import com.wujieshuju.p029cm.server.IHttpPostCallback;
import com.wujieshuju.p029cm.server.IRemoteCallback;
import com.wujieshuju.p029cm.server.IRemoteService;
import java.util.List;
import java.util.Map;

public class RemoteService extends Service {
    public IBinder onBind(Intent intent) {
        return new MyBind();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }

    class MyBind extends IRemoteService.Stub {
        public void download(List<String> list, List<String> list2, boolean z, IRemoteCallback iRemoteCallback) throws RemoteException {
        }

        public String httpPostSync(String str, String str2, Map map, Map map2) throws RemoteException {
            return "";
        }

        public void upload(List<String> list, List<String> list2, IRemoteCallback iRemoteCallback) throws RemoteException {
        }

        MyBind() {
        }

        public void httpPost(String str, String str2, Map map, Map map2, final IHttpPostCallback iHttpPostCallback) throws RemoteException {
            OkHttpClientUtil.getInstance().postWithRemote(str, str2, map, map2, new OkHttpClientUtil.Callback() {
                public void onFail(String str) {
                    try {
                        iHttpPostCallback.onFail(str);
                    } catch (RemoteException e) {
                        LogUtil.m819e(Const.TAG, "", e);
                    }
                }

                public void onComplete(String str) {
                    try {
                        iHttpPostCallback.onComplete(str);
                    } catch (RemoteException e) {
                        LogUtil.m819e(Const.TAG, "", e);
                    }
                }
            });
        }
    }
}
