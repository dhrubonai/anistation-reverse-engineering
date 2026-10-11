package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class t extends c5.a {
    public static final Parcelable.Creator<t> CREATOR = new com.google.android.gms.common.api.y(6);

    /* renamed from: a, reason: collision with root package name */
    public final int f2595a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2596b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2597c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2598d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2599e;

    public t(int i10, boolean z9, boolean z10, int i11, int i12) {
        this.f2595a = i10;
        this.f2596b = z9;
        this.f2597c = z10;
        this.f2598d = i11;
        this.f2599e = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = p7.a0.t0(20293, parcel);
        p7.a0.h0(parcel, 1, this.f2595a);
        p7.a0.d0(parcel, 2, this.f2596b);
        p7.a0.d0(parcel, 3, this.f2597c);
        p7.a0.h0(parcel, 4, this.f2598d);
        p7.a0.h0(parcel, 5, this.f2599e);
        p7.a0.u0(t02, parcel);
    }
}
