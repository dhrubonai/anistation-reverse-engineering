package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class q extends c5.a {
    public static final Parcelable.Creator<q> CREATOR = new com.google.android.gms.common.api.y(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f2573a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2574b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2575c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2576d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2577e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2578f;

    /* renamed from: x, reason: collision with root package name */
    public final String f2579x;

    /* renamed from: y, reason: collision with root package name */
    public final int f2580y;

    /* renamed from: z, reason: collision with root package name */
    public final int f2581z;

    public q(int i10, int i11, int i12, long j4, long j10, String str, String str2, int i13, int i14) {
        this.f2573a = i10;
        this.f2574b = i11;
        this.f2575c = i12;
        this.f2576d = j4;
        this.f2577e = j10;
        this.f2578f = str;
        this.f2579x = str2;
        this.f2580y = i13;
        this.f2581z = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = p7.a0.t0(20293, parcel);
        p7.a0.h0(parcel, 1, this.f2573a);
        p7.a0.h0(parcel, 2, this.f2574b);
        p7.a0.h0(parcel, 3, this.f2575c);
        p7.a0.k0(parcel, 4, this.f2576d);
        p7.a0.k0(parcel, 5, this.f2577e);
        p7.a0.n0(parcel, 6, this.f2578f, false);
        p7.a0.n0(parcel, 7, this.f2579x, false);
        p7.a0.h0(parcel, 8, this.f2580y);
        p7.a0.h0(parcel, 9, this.f2581z);
        p7.a0.u0(t02, parcel);
    }
}
