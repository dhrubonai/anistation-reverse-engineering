package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class f0 implements o {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f2513a;

    public f0(IBinder iBinder) {
        this.f2513a = iBinder;
    }

    public final void a(i0 i0Var, j jVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(i0Var.asBinder());
            obtain.writeInt(1);
            com.google.android.gms.common.api.y.a(jVar, obtain, 0);
            this.f2513a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f2513a;
    }
}
