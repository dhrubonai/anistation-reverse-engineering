package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class i extends c5.a {
    public static final Parcelable.Creator<i> CREATOR = new com.google.android.gms.common.api.y(8);

    /* renamed from: a, reason: collision with root package name */
    public final t f2530a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2531b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2532c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f2533d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2534e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f2535f;

    public i(t tVar, boolean z9, boolean z10, int[] iArr, int i10, int[] iArr2) {
        this.f2530a = tVar;
        this.f2531b = z9;
        this.f2532c = z10;
        this.f2533d = iArr;
        this.f2534e = i10;
        this.f2535f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = p7.a0.t0(20293, parcel);
        p7.a0.m0(parcel, 1, this.f2530a, i10, false);
        p7.a0.d0(parcel, 2, this.f2531b);
        p7.a0.d0(parcel, 3, this.f2532c);
        p7.a0.i0(parcel, 4, this.f2533d, false);
        p7.a0.h0(parcel, 5, this.f2534e);
        p7.a0.i0(parcel, 6, this.f2535f, false);
        p7.a0.u0(t02, parcel);
    }
}
