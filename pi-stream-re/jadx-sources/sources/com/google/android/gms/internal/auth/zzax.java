package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import c5.a;
import p7.a0;
import w7.b;

/* loaded from: classes.dex */
public final class zzax extends a {
    public static final Parcelable.Creator<zzax> CREATOR = new zzay();
    final int zza;
    public final String zzb;

    public zzax(int i10, String str) {
        this.zza = 1;
        b.s(str);
        this.zzb = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.h0(parcel, 1, this.zza);
        a0.n0(parcel, 2, this.zzb, false);
        a0.u0(t02, parcel);
    }

    public zzax(String str) {
        this(1, str);
    }
}
