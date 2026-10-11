package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p7.a0;

/* loaded from: classes.dex */
public final class Scope extends c5.a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new y(0);

    /* renamed from: a, reason: collision with root package name */
    public final int f2354a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2355b;

    public Scope(int i10, String str) {
        w7.b.n("scopeUri must not be null or empty", str);
        this.f2354a = i10;
        this.f2355b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f2355b.equals(((Scope) obj).f2355b);
    }

    public final int hashCode() {
        return this.f2355b.hashCode();
    }

    public final String toString() {
        return this.f2355b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.h0(parcel, 1, this.f2354a);
        a0.n0(parcel, 2, this.f2355b, false);
        a0.u0(t02, parcel);
    }
}
