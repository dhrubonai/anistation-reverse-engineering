package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import c5.a;
import p7.a0;

/* loaded from: classes.dex */
public final class zzbw extends a {
    public static final Parcelable.Creator<zzbw> CREATOR = new zzbx();
    final int zza;
    String zzb;

    public zzbw() {
        this.zza = 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.h0(parcel, 1, this.zza);
        a0.n0(parcel, 2, this.zzb, false);
        a0.u0(t02, parcel);
    }

    public final zzbw zza(String str) {
        this.zzb = str;
        return this;
    }

    public zzbw(int i10, String str) {
        this.zza = i10;
        this.zzb = str;
    }
}
