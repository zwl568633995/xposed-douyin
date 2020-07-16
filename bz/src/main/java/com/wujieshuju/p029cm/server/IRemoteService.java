package com.wujieshuju.p029cm.server;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.wujieshuju.p029cm.server.IHttpPostCallback;
import com.wujieshuju.p029cm.server.IRemoteCallback;
import java.util.List;
import java.util.Map;

/* renamed from: com.wujieshuju.cm.server.IRemoteService */
public interface IRemoteService extends IInterface {

    /* renamed from: com.wujieshuju.cm.server.IRemoteService$Default */
    public static class Default implements IRemoteService {
        public IBinder asBinder() {
            return null;
        }

        public void download(List<String> list, List<String> list2, boolean z, IRemoteCallback iRemoteCallback) throws RemoteException {
        }

        public void httpPost(String str, String str2, Map map, Map map2, IHttpPostCallback iHttpPostCallback) throws RemoteException {
        }

        public String httpPostSync(String str, String str2, Map map, Map map2) throws RemoteException {
            return null;
        }

        public void upload(List<String> list, List<String> list2, IRemoteCallback iRemoteCallback) throws RemoteException {
        }
    }

    void download(List<String> list, List<String> list2, boolean z, IRemoteCallback iRemoteCallback) throws RemoteException;

    void httpPost(String str, String str2, Map map, Map map2, IHttpPostCallback iHttpPostCallback) throws RemoteException;

    String httpPostSync(String str, String str2, Map map, Map map2) throws RemoteException;

    void upload(List<String> list, List<String> list2, IRemoteCallback iRemoteCallback) throws RemoteException;

    /* renamed from: com.wujieshuju.cm.server.IRemoteService$Stub */
    public static abstract class Stub extends Binder implements IRemoteService {
        private static final String DESCRIPTOR = "com.wujieshuju.cm.server.IRemoteService";
        static final int TRANSACTION_download = 2;
        static final int TRANSACTION_httpPost = 3;
        static final int TRANSACTION_httpPostSync = 4;
        static final int TRANSACTION_upload = 1;

        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IRemoteService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IRemoteService)) {
                return new Proxy(iBinder);
            }
            return (IRemoteService) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                upload(parcel.createStringArrayList(), parcel.createStringArrayList(), IRemoteCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                download(parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readInt() != 0, IRemoteCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                ClassLoader classLoader = getClass().getClassLoader();
                httpPost(readString, readString2, parcel.readHashMap(classLoader), parcel.readHashMap(classLoader), IHttpPostCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i == 4) {
                parcel.enforceInterface(DESCRIPTOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                ClassLoader classLoader2 = getClass().getClassLoader();
                String httpPostSync = httpPostSync(readString3, readString4, parcel.readHashMap(classLoader2), parcel.readHashMap(classLoader2));
                parcel2.writeNoException();
                parcel2.writeString(httpPostSync);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }

        /* renamed from: com.wujieshuju.cm.server.IRemoteService$Stub$Proxy */
        private static class Proxy implements IRemoteService {
            public static IRemoteService sDefaultImpl;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public void upload(List<String> list, List<String> list2, IRemoteCallback iRemoteCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStringList(list);
                    obtain.writeStringList(list2);
                    obtain.writeStrongBinder(iRemoteCallback != null ? iRemoteCallback.asBinder() : null);
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().upload(list, list2, iRemoteCallback);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void download(List<String> list, List<String> list2, boolean z, IRemoteCallback iRemoteCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStringList(list);
                    obtain.writeStringList(list2);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeStrongBinder(iRemoteCallback != null ? iRemoteCallback.asBinder() : null);
                    if (this.mRemote.transact(2, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().download(list, list2, z, iRemoteCallback);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void httpPost(String str, String str2, Map map, Map map2, IHttpPostCallback iHttpPostCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeMap(map);
                    obtain.writeMap(map2);
                    obtain.writeStrongBinder(iHttpPostCallback != null ? iHttpPostCallback.asBinder() : null);
                    if (this.mRemote.transact(3, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().httpPost(str, str2, map, map2, iHttpPostCallback);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String httpPostSync(String str, String str2, Map map, Map map2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeMap(map);
                    obtain.writeMap(map2);
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().httpPostSync(str, str2, map, map2);
                    }
                    obtain2.readException();
                    String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(IRemoteService iRemoteService) {
            if (Proxy.sDefaultImpl != null || iRemoteService == null) {
                return false;
            }
            Proxy.sDefaultImpl = iRemoteService;
            return true;
        }

        public static IRemoteService getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
