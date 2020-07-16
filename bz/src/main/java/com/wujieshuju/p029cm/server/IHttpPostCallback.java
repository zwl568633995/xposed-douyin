package com.wujieshuju.p029cm.server;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.wujieshuju.cm.server.IHttpPostCallback */
public interface IHttpPostCallback extends IInterface {

    /* renamed from: com.wujieshuju.cm.server.IHttpPostCallback$Default */
    public static class Default implements IHttpPostCallback {
        public IBinder asBinder() {
            return null;
        }

        public void onComplete(String str) throws RemoteException {
        }

        public void onFail(String str) throws RemoteException {
        }
    }

    void onComplete(String str) throws RemoteException;

    void onFail(String str) throws RemoteException;

    /* renamed from: com.wujieshuju.cm.server.IHttpPostCallback$Stub */
    public static abstract class Stub extends Binder implements IHttpPostCallback {
        private static final String DESCRIPTOR = "com.wujieshuju.cm.server.IHttpPostCallback";
        static final int TRANSACTION_onComplete = 1;
        static final int TRANSACTION_onFail = 2;

        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IHttpPostCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IHttpPostCallback)) {
                return new Proxy(iBinder);
            }
            return (IHttpPostCallback) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onComplete(parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                onFail(parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }

        /* renamed from: com.wujieshuju.cm.server.IHttpPostCallback$Stub$Proxy */
        private static class Proxy implements IHttpPostCallback {
            public static IHttpPostCallback sDefaultImpl;
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

            public void onComplete(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onComplete(str);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onFail(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (this.mRemote.transact(2, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onFail(str);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(IHttpPostCallback iHttpPostCallback) {
            if (Proxy.sDefaultImpl != null || iHttpPostCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iHttpPostCallback;
            return true;
        }

        public static IHttpPostCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
