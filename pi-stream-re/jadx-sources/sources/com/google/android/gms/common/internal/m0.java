package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class m0 extends c5.a {
    public static final Parcelable.Creator<m0> CREATOR = new com.google.android.gms.common.api.y(7);

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f2555a;

    /* renamed from: b, reason: collision with root package name */
    public final b5.c[] f2556b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2557c;

    /* renamed from: d, reason: collision with root package name */
    public final i f2558d;

    public m0(Bundle bundle, b5.c[] cVarArr, int i10, i iVar) {
        this.f2555a = bundle;
        this.f2556b = cVarArr;
        this.f2557c = i10;
        this.f2558d = iVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = p7.a0.t0(20293, parcel);
        p7.a0.e0(parcel, 1, this.f2555a, false);
        p7.a0.r0(parcel, 2, this.f2556b, i10);
        p7.a0.h0(parcel, 3, this.f2557c);
        p7.a0.m0(parcel, 4, this.f2558d, i10, false);
        p7.a0.u0(t02, parcel);
    }
}
