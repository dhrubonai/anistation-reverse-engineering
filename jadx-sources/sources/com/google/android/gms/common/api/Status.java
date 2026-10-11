package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.a55;
import defpackage.an7;
import defpackage.bx7;
import defpackage.hw0;
import defpackage.wc7;
import defpackage.y2;
import defpackage.y23;
import defpackage.z51;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class Status extends y2 implements a55, ReflectedParcelable {
    public final hw0 A;
    public final int x;
    public final String y;
    public final PendingIntent z;
    public static final Status B = new Status(0, null, null, null);
    public static final Status C = new Status(15, null, null, null);
    public static final Status D = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new an7(18);

    public Status(int i, String str, PendingIntent pendingIntent, hw0 hw0Var) {
        this.x = i;
        this.y = str;
        this.z = pendingIntent;
        this.A = hw0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.x != status.x || !bx7.q(this.y, status.y) || !bx7.q(this.z, status.z) || !bx7.q(this.A, status.A)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.x), this.y, this.z, this.A});
    }

    public final String toString() {
        y23 y23Var = new y23(this);
        String str = this.y;
        if (str == null) {
            str = wc7.u(this.x);
        }
        y23Var.R(str, "statusCode");
        y23Var.R(this.z, "resolution");
        return y23Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.r0(parcel, 1, 4);
        parcel.writeInt(this.x);
        z51.m0(parcel, 2, this.y);
        z51.l0(parcel, 3, this.z, i);
        z51.l0(parcel, 4, this.A, i);
        z51.t0(parcel, s0);
    }

    @Override // defpackage.a55
    public final Status b() {
        return this;
    }
}
