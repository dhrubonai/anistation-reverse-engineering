package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

/* loaded from: classes.dex */
public abstract class i extends zab implements j {
    public i() {
        super("com.google.android.gms.common.api.internal.IStatusCallback");
    }

    public static j asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
        if (queryLocalInterface instanceof j) {
            return (j) queryLocalInterface;
        }
        return new l0(iBinder);
    }

    @Override // com.google.android.gms.internal.base.zab
    public final boolean zaa(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            onResult((Status) zac.zaa(parcel, Status.CREATOR));
            return true;
        }
        return false;
    }
}
