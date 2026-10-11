package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class s5 extends y2 {
    public static final zk3 C = new zk3("AdBreakStatus", null);
    public static final Parcelable.Creator<s5> CREATOR = new an7(9);
    public final String A;
    public final long B;
    public final long x;
    public final long y;
    public final String z;

    public s5(long j, long j2, String str, String str2, long j3) {
        this.x = j;
        this.y = j2;
        this.z = str;
        this.A = str2;
        this.B = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5)) {
            return false;
        }
        s5 s5Var = (s5) obj;
        if (this.x == s5Var.x && this.y == s5Var.y && qi0.c(this.z, s5Var.z) && qi0.c(this.A, s5Var.A) && this.B == s5Var.B) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.x), Long.valueOf(this.y), this.z, this.A, Long.valueOf(this.B)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.r0(parcel, 2, 8);
        parcel.writeLong(this.x);
        z51.r0(parcel, 3, 8);
        parcel.writeLong(this.y);
        z51.m0(parcel, 4, this.z);
        z51.m0(parcel, 5, this.A);
        z51.r0(parcel, 6, 8);
        parcel.writeLong(this.B);
        z51.t0(parcel, s0);
    }
}
