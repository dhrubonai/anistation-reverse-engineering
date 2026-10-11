package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c0 extends c5.a {
    public static final Parcelable.Creator<c0> CREATOR = new com.google.android.gms.common.api.y(5);

    /* renamed from: a, reason: collision with root package name */
    public final int f2502a;

    /* renamed from: b, reason: collision with root package name */
    public final IBinder f2503b;

    /* renamed from: c, reason: collision with root package name */
    public final b5.a f2504c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2505d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2506e;

    public c0(int i10, IBinder iBinder, b5.a aVar, boolean z9, boolean z10) {
        this.f2502a = i10;
        this.f2503b = iBinder;
        this.f2504c = aVar;
        this.f2505d = z9;
        this.f2506e = z10;
    }

    public final boolean equals(Object obj) {
        Object s0Var;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (this.f2504c.equals(c0Var.f2504c)) {
            Object obj2 = null;
            IBinder iBinder = this.f2503b;
            if (iBinder == null) {
                s0Var = null;
            } else {
                int i10 = a.f2494a;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface instanceof m) {
                    s0Var = (m) queryLocalInterface;
                } else {
                    s0Var = new s0(iBinder);
                }
            }
            IBinder iBinder2 = c0Var.f2503b;
            if (iBinder2 != null) {
                int i11 = a.f2494a;
                IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface2 instanceof m) {
                    obj2 = (m) queryLocalInterface2;
                } else {
                    obj2 = new s0(iBinder2);
                }
            }
            if (p7.a0.q(s0Var, obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = p7.a0.t0(20293, parcel);
        p7.a0.h0(parcel, 1, this.f2502a);
        IBinder iBinder = this.f2503b;
        if (iBinder != null) {
            int t03 = p7.a0.t0(2, parcel);
            parcel.writeStrongBinder(iBinder);
            p7.a0.u0(t03, parcel);
        }
        p7.a0.m0(parcel, 3, this.f2504c, i10, false);
        p7.a0.d0(parcel, 4, this.f2505d);
        p7.a0.d0(parcel, 5, this.f2506e);
        p7.a0.u0(t02, parcel);
    }
}
