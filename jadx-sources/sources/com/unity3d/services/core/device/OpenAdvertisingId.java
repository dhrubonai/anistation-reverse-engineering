package com.unity3d.services.core.device;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.unity3d.services.core.log.DeviceLog;
import defpackage.p65;
import java.util.Locale;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class OpenAdvertisingId {
    static long BINDER_TIMEOUT_SECONDS = 10;
    private static final String HW_DEVICE_NAME = "HUAWEI";
    private static final String HW_OPEN_ADVERTISING_ID_SERVICE_NAME = "com.uodis.opendevice.aidl.OpenDeviceIdentifierService";
    private static OpenAdvertisingId instance;
    private volatile String openAdvertisingIdentifier = null;
    private volatile boolean limitedOpenAdTracking = false;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public interface HWAdvertisingInfo extends IInterface {

        /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
        /* loaded from: classes.dex */
        public static abstract class HWAdvertisingInfoBinder extends Binder implements HWAdvertisingInfo {

            /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
            /* loaded from: classes.dex */
            public static class HWAdvertisingInfoImplementation implements HWAdvertisingInfo {
                private final IBinder _binder;

                public HWAdvertisingInfoImplementation(IBinder iBinder) {
                    this._binder = iBinder;
                }

                @Override // android.os.IInterface
                public IBinder asBinder() {
                    return this._binder;
                }

                @Override // com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingInfo
                public boolean getEnabled(boolean z) {
                    Parcel obtain = Parcel.obtain();
                    Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken(OpenAdvertisingId.HW_OPEN_ADVERTISING_ID_SERVICE_NAME);
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

                @Override // com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingInfo
                public String getId() {
                    Parcel obtain = Parcel.obtain();
                    Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken(OpenAdvertisingId.HW_OPEN_ADVERTISING_ID_SERVICE_NAME);
                        this._binder.transact(1, obtain, obtain2, 0);
                        obtain2.readException();
                        return obtain2.readString();
                    } finally {
                        obtain2.recycle();
                        obtain.recycle();
                    }
                }
            }

            public static HWAdvertisingInfo create(IBinder iBinder) {
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = iBinder.queryLocalInterface(OpenAdvertisingId.HW_OPEN_ADVERTISING_ID_SERVICE_NAME);
                if (queryLocalInterface != null && (queryLocalInterface instanceof HWAdvertisingInfo)) {
                    return (HWAdvertisingInfo) queryLocalInterface;
                }
                return new HWAdvertisingInfoImplementation(iBinder);
            }

            @Override // android.os.Binder
            public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
                boolean z;
                if (i != 1) {
                    if (i != 2) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    parcel.enforceInterface(OpenAdvertisingId.HW_OPEN_ADVERTISING_ID_SERVICE_NAME);
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
                parcel.enforceInterface(OpenAdvertisingId.HW_OPEN_ADVERTISING_ID_SERVICE_NAME);
                String id = getId();
                parcel2.writeNoException();
                parcel2.writeString(id);
                return true;
            }
        }

        boolean getEnabled(boolean z);

        String getId();
    }

    private boolean fetchOAId(Context context) {
        HWAdvertisingServiceConnection hWAdvertisingServiceConnection = new HWAdvertisingServiceConnection();
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        try {
            try {
                if (!context.bindService(intent, hWAdvertisingServiceConnection, 1)) {
                    return false;
                }
                try {
                    try {
                        HWAdvertisingInfo create = HWAdvertisingInfo.HWAdvertisingInfoBinder.create(hWAdvertisingServiceConnection.getBinder());
                        this.openAdvertisingIdentifier = create.getId();
                        this.limitedOpenAdTracking = create.getEnabled(true);
                        return true;
                    } catch (TimeoutException e) {
                        DeviceLog.exception("Timed out getting Huawei OAID service connection", e);
                        return false;
                    }
                } catch (Exception e2) {
                    DeviceLog.exception("Couldn't get openAdvertising info", e2);
                    return false;
                }
            } finally {
                context.unbindService(hWAdvertisingServiceConnection);
            }
        } catch (Exception e3) {
            DeviceLog.exception("Couldn't bind to identifier service intent", e3);
            return false;
        }
    }

    private static synchronized OpenAdvertisingId getInstance() {
        OpenAdvertisingId openAdvertisingId;
        synchronized (OpenAdvertisingId.class) {
            openAdvertisingId = instance;
            if (openAdvertisingId == null) {
                openAdvertisingId = new OpenAdvertisingId();
                instance = openAdvertisingId;
            }
        }
        return openAdvertisingId;
    }

    public static boolean getLimitedOpenAdTracking() {
        return getInstance().limitedOpenAdTracking;
    }

    public static String getOpenAdvertisingTrackingId() {
        return getInstance().openAdvertisingIdentifier;
    }

    public static boolean init(Context context) {
        if (Build.MANUFACTURER.toUpperCase(Locale.ROOT).equals(HW_DEVICE_NAME)) {
            return getInstance().fetchOAId(context);
        }
        return false;
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public class HWAdvertisingServiceConnection implements ServiceConnection {
        boolean _consumed = false;
        private final BlockingQueue<IBinder> _binderQueue = new LinkedBlockingQueue();

        public HWAdvertisingServiceConnection() {
        }

        public IBinder getBinder() {
            if (!this._consumed) {
                this._consumed = true;
                IBinder poll = this._binderQueue.poll(OpenAdvertisingId.BINDER_TIMEOUT_SECONDS, TimeUnit.SECONDS);
                if (poll != null) {
                    return poll;
                }
                throw new TimeoutException("Timed out waiting for Huawei OAID service connection");
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
