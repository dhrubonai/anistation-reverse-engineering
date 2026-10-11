package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c5.a;
import p7.a0;
import w7.b;

/* loaded from: classes.dex */
public final class zzbb extends a {
    public static final Parcelable.Creator<zzbb> CREATOR = new zzbc();
    final int zza;
    public final String zzb;
    public final PendingIntent zzc;

    public zzbb(int i10, String str, PendingIntent pendingIntent) {
        this.zza = 1;
        b.s(str);
        this.zzb = str;
        b.s(pendingIntent);
        this.zzc = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.h0(parcel, 1, this.zza);
        a0.n0(parcel, 2, this.zzb, false);
        a0.m0(parcel, 3, this.zzc, i10, false);
        a0.u0(t02, parcel);
    }

    public zzbb(String str, PendingIntent pendingIntent) {
        this(1, str, pendingIntent);
    }
}
