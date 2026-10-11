package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class u extends c5.a {
    public static final Parcelable.Creator<u> CREATOR = new com.google.android.gms.common.api.y(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f2600a;

    /* renamed from: b, reason: collision with root package name */
    public List f2601b;

    public u(int i10, List list) {
        this.f2600a = i10;
        this.f2601b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = p7.a0.t0(20293, parcel);
        p7.a0.h0(parcel, 1, this.f2600a);
        p7.a0.s0(parcel, 2, this.f2601b, false);
        p7.a0.u0(t02, parcel);
    }
}
