package com.unity3d.services.core.device;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.unity3d.services.core.log.DeviceLog;
import defpackage.p65;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class AdvertisingId {
    private static final String ADVERTISING_ID_SERVICE_NAME = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";
    static long BINDER_TIMEOUT_SECONDS = 10;
    private static AdvertisingId instance;
    private volatile String advertisingIdentifier = null;
    private volatile boolean limitedAdvertisingTracking = false;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public interface GoogleAdvertisingInfo extends IInterface {

        /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
        /* loaded from: classes.dex */
        public static abstract class GoogleAdvertisingInfoBinder extends Binder implements GoogleAdvertisingInfo {

            /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
            /* loaded from: classes.dex */
            public static class GoogleAdvertisingInfoImplementation implements GoogleAdvertisingInfo {
                private final IBinder _binder;

                public GoogleAdvertisingInfoImplementation(IBinder iBinder) {
                    this._binder = iBinder;
                }

                @Override // android.os.IInterface
                public IBinder asBinder() {
                    return this._binder;
                }

                @Override // com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingInfo
                public boolean getEnabled(boolean z) {
                    Parcel obtain = Parcel.obtain();
                    Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken(AdvertisingId.ADVERTISING_ID_SERVICE_NAME);
                        obtain.writeInt(z ? 1 : 0);
                        boolean z2 = false;
                        this._binder.transact(2, obtain, obtain2, 0);
                        obtain2.readException();
                        if (obtain2.readInt() != 0) {
                            z2 = true;
                        }
                        return z2;
                    } finally {
                        obtain2.recycle();
                        obtain.recycle();
                    }
                }

                @Override // com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingInfo
                public String getId() {
                    Parcel obtain = Parcel.obtain();
                    Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken(AdvertisingId.ADVERTISING_ID_SERVICE_NAME);
                        this._binder.transact(1, obtain, obtain2, 0);
                        obtain2.readException();
                        return obtain2.readString();
                    } finally {
                        obtain2.recycle();
                        obtain.recycle();
                    }
                }
            }

            public static GoogleAdvertisingInfo create(IBinder iBinder) {
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = iBinder.queryLocalInterface(AdvertisingId.ADVERTISING_ID_SERVICE_NAME);
                if (queryLocalInterface != null && (queryLocalInterface instanceof GoogleAdvertisingInfo)) {
                    return (GoogleAdvertisingInfo) queryLocalInterface;
                }
                return new GoogleAdvertisingInfoImplementation(iBinder);
            }

            @Override // android.os.Binder
            public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
                boolean z;
                if (i != 1) {
                    if (i != 2) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    parcel.enforceInterface(AdvertisingId.ADVERTISING_ID_SERVICE_NAME);
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean enabled = getEnabled(z);
                    parcel2.writeNoException();
                    parcel2.writeInt(enabled ? 1 : 0);
                    return true;
                }
                parcel.enforceInterface(AdvertisingId.ADVERTISING_ID_SERVICE_NAME);
                String id = getId();
                parcel2.writeNoException();
                parcel2.writeString(id);
                return true;
            }
        }

        boolean getEnabled(boolean z);

        String getId();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        r7.unbindService(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r1 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        if (r1 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005a, code lost:
    
        if (r1 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean fetchAdvertisingId(android.content.Context r7) {
        /*
            r6 = this;
            com.unity3d.services.core.device.AdvertisingId$GoogleAdvertisingServiceConnection r0 = new com.unity3d.services.core.device.AdvertisingId$GoogleAdvertisingServiceConnection
            r0.<init>()
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "com.google.android.gms.ads.identifier.service.START"
            r1.<init>(r2)
            java.lang.String r2 = "com.google.android.gms"
            r1.setPackage(r2)
            r2 = 1
            r3 = 0
            boolean r1 = r7.bindService(r1, r0, r2)     // Catch: java.lang.Exception -> L18
            goto L1f
        L18:
            r1 = move-exception
            java.lang.String r4 = "Couldn't bind to identifier service intent"
            com.unity3d.services.core.log.DeviceLog.exception(r4, r1)
            r1 = r3
        L1f:
            if (r1 == 0) goto L5a
            android.os.IBinder r4 = r0.getBinder()     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d java.util.concurrent.TimeoutException -> L3f
            com.unity3d.services.core.device.AdvertisingId$GoogleAdvertisingInfo r4 = com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingInfo.GoogleAdvertisingInfoBinder.create(r4)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d java.util.concurrent.TimeoutException -> L3f
            java.lang.String r5 = r4.getId()     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d java.util.concurrent.TimeoutException -> L3f
            r6.advertisingIdentifier = r5     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d java.util.concurrent.TimeoutException -> L3f
            boolean r4 = r4.getEnabled(r2)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d java.util.concurrent.TimeoutException -> L3f
            r6.limitedAdvertisingTracking = r4     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d java.util.concurrent.TimeoutException -> L3f
            if (r1 == 0) goto L3a
            r7.unbindService(r0)
        L3a:
            return r2
        L3b:
            r6 = move-exception
            goto L54
        L3d:
            r6 = move-exception
            goto L41
        L3f:
            r6 = move-exception
            goto L4c
        L41:
            java.lang.String r2 = "Couldn't get advertising info"
            com.unity3d.services.core.log.DeviceLog.exception(r2, r6)     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L5d
        L48:
            r7.unbindService(r0)
            goto L5d
        L4c:
            java.lang.String r2 = "Timed out getting advertising ID service connection"
            com.unity3d.services.core.log.DeviceLog.exception(r2, r6)     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L5d
            goto L48
        L54:
            if (r1 == 0) goto L59
            r7.unbindService(r0)
        L59:
            throw r6
        L5a:
            if (r1 == 0) goto L5d
            goto L48
        L5d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.AdvertisingId.fetchAdvertisingId(android.content.Context):boolean");
    }

    public static String getAdvertisingTrackingId() {
        return getInstance().advertisingIdentifier;
    }

    private static synchronized AdvertisingId getInstance() {
        AdvertisingId advertisingId;
        synchronized (AdvertisingId.class) {
            advertisingId = instance;
            if (advertisingId == null) {
                advertisingId = new AdvertisingId();
                instance = advertisingId;
            }
        }
        return advertisingId;
    }

    public static boolean getLimitedAdTracking() {
        return getInstance().limitedAdvertisingTracking;
    }

    public static boolean init(Context context) {
        return getInstance().fetchAdvertisingId(context);
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public class GoogleAdvertisingServiceConnection implements ServiceConnection {
        boolean _consumed = false;
        private final BlockingQueue<IBinder> _binderQueue = new LinkedBlockingQueue();

        public GoogleAdvertisingServiceConnection() {
        }

        public IBinder getBinder() {
            if (!this._consumed) {
                this._consumed = true;
                IBinder poll = this._binderQueue.poll(AdvertisingId.BINDER_TIMEOUT_SECONDS, TimeUnit.SECONDS);
                if (poll != null) {
                    return poll;
                }
                throw new TimeoutException("Timed out waiting for advertising ID service connection");
            }
            p65.l();
            return null;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this._binderQueue.put(iBinder);
            } catch (InterruptedException unused) {
                DeviceLog.debug("Couldn't put service to binder que");
                Thread.currentThread().interrupt();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
