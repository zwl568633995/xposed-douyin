package com.wujieshuju.p029cm.server;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* renamed from: com.wujieshuju.cm.server.IRemoteCallback */
public interface IRemoteCallback extends IInterface {

    /* renamed from: com.wujieshuju.cm.server.IRemoteCallback$Default */
    public static class Default implements IRemoteCallback {
        public IBinder asBinder() {
            return null;
        }

        public void onComplete(Map map) throws RemoteException {
        }
    }

    void onComplete(Map map) throws RemoteException;

    /* renamed from: com.wujieshuju.cm.server.IRemoteCallback$Stub */
    public static abstract class Stub extends Binder implements IRemoteCallback {
        private static final String DESCRIPTOR = "com.wujieshuju.cm.server.IRemoteCallback";
        static final int TRANSACTION_onComplete = 1;

        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IRemoteCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IRemoteCallback)) {
                return new Proxy(iBinder);
            }
            return (IRemoteCallback) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onComplete(parcel.readHashMap(getClass().getClassLoader()));
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }

        /* renamed from: com.wujieshuju.cm.server.IRemoteCallback$Stub$Proxy */
        private static class Proxy implements IRemoteCallback {
            public static IRemoteCallback sDefaultImpl;
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

            public void onComplete(Map map) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeMap(map);
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onComplete(map);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(IRemoteCallback iRemoteCallback) {
            if (Proxy.sDefaultImpl != null || iRemoteCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iRemoteCallback;
            return true;
        }

        public static IRemoteCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
