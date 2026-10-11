package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import c5.a;
import p7.a0;
import w7.b;

/* loaded from: classes.dex */
public final class zzav extends a {
    public static final Parcelable.Creator<zzav> CREATOR = new zzaw();
    final int zza;
    public final String zzb;
    public final int zzc;

    public zzav(int i10, String str, int i11) {
        this.zza = 1;
        b.s(str);
        this.zzb = str;
        this.zzc = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.h0(parcel, 1, this.zza);
        a0.n0(parcel, 2, this.zzb, false);
        a0.h0(parcel, 3, this.zzc);
        a0.u0(t02, parcel);
    }

    public zzav(String str, int i10) {
        this(1, str, i10);
    }
}
