package com.google.android.gms.cast.framework;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.a34;
import defpackage.el7;
import defpackage.h04;
import defpackage.hk7;
import defpackage.ic4;
import defpackage.il7;
import defpackage.nk7;
import defpackage.nn7;
import defpackage.pk5;
import defpackage.qd7;
import defpackage.sk7;
import defpackage.tt2;
import defpackage.xh0;
import defpackage.yl7;
import defpackage.zk3;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class ReconnectionService extends Service {
    public static final zk3 y = new zk3("ReconnectionService", null);
    public sk7 x;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        sk7 sk7Var = this.x;
        if (sk7Var != null) {
            try {
                nk7 nk7Var = (nk7) sk7Var;
                Parcel K = nk7Var.K();
                nn7.b(K, intent);
                Parcel L = nk7Var.L(K, 3);
                IBinder readStrongBinder = L.readStrongBinder();
                L.recycle();
                return readStrongBinder;
            } catch (RemoteException e) {
                y.a(e, "Unable to call %s on %s.", "onBind", sk7.class.getSimpleName());
            }
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        tt2 tt2Var;
        tt2 tt2Var2;
        xh0 b = xh0.b(this);
        b.getClass();
        a34.s();
        pk5 pk5Var = b.c;
        pk5Var.getClass();
        sk7 sk7Var = null;
        try {
            el7 el7Var = pk5Var.a;
            Parcel L = el7Var.L(el7Var.K(), 7);
            tt2Var = ic4.L(L.readStrongBinder());
            L.recycle();
        } catch (RemoteException e) {
            pk5.c.a(e, "Unable to call %s on %s.", "getWrappedThis", el7.class.getSimpleName());
            tt2Var = null;
        }
        a34.s();
        qd7 qd7Var = b.d;
        qd7Var.getClass();
        try {
            hk7 hk7Var = qd7Var.a;
            Parcel L2 = hk7Var.L(hk7Var.K(), 5);
            tt2Var2 = ic4.L(L2.readStrongBinder());
            L2.recycle();
        } catch (RemoteException e2) {
            qd7.b.a(e2, "Unable to call %s on %s.", "getWrappedThis", hk7.class.getSimpleName());
            tt2Var2 = null;
        }
        zk3 zk3Var = il7.a;
        if (tt2Var != null && tt2Var2 != null) {
            try {
                sk7Var = il7.b(getApplicationContext()).R(new ic4(this), tt2Var, tt2Var2);
            } catch (RemoteException | h04 e3) {
                il7.a.a(e3, "Unable to call %s on %s.", "newReconnectionServiceImpl", yl7.class.getSimpleName());
            }
        }
        this.x = sk7Var;
        if (sk7Var != null) {
            try {
                nk7 nk7Var = (nk7) sk7Var;
                nk7Var.M(nk7Var.K(), 1);
            } catch (RemoteException e4) {
                y.a(e4, "Unable to call %s on %s.", "onCreate", sk7.class.getSimpleName());
            }
            super.onCreate();
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        sk7 sk7Var = this.x;
        if (sk7Var != null) {
            try {
                nk7 nk7Var = (nk7) sk7Var;
                nk7Var.M(nk7Var.K(), 4);
            } catch (RemoteException e) {
                y.a(e, "Unable to call %s on %s.", "onDestroy", sk7.class.getSimpleName());
            }
            super.onDestroy();
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        sk7 sk7Var = this.x;
        if (sk7Var != null) {
            try {
                nk7 nk7Var = (nk7) sk7Var;
                Parcel K = nk7Var.K();
                nn7.b(K, intent);
                K.writeInt(i);
                K.writeInt(i2);
                Parcel L = nk7Var.L(K, 2);
                int readInt = L.readInt();
                L.recycle();
                return readInt;
            } catch (RemoteException e) {
                y.a(e, "Unable to call %s on %s.", "onStartCommand", sk7.class.getSimpleName());
            }
        }
        return 2;
    }
}
