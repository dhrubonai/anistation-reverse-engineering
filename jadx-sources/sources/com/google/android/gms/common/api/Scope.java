package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.a34;
import defpackage.an7;
import defpackage.y2;
import defpackage.z51;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class Scope extends y2 implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new an7(11);
    public final int x;
    public final String y;

    public Scope(int i, String str) {
        a34.v(str, "scopeUri must not be null or empty");
        this.x = i;
        this.y = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.y.equals(((Scope) obj).y);
    }

    public final int hashCode() {
        return this.y.hashCode();
    }

    public final String toString() {
        return this.y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.r0(parcel, 1, 4);
        parcel.writeInt(this.x);
        z51.m0(parcel, 2, this.y);
        z51.t0(parcel, s0);
    }
}
