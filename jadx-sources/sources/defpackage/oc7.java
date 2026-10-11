package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class oc7 extends y2 {
    public static final Parcelable.Creator<oc7> CREATOR = new c55(14);
    public final String A;
    public final String B;
    public final String C;
    public final String D;
    public final String E;
    public final boolean F;
    public final boolean G;
    public final int x;
    public final boolean y;
    public final boolean z;

    public oc7(int i, boolean z, boolean z2, String str, String str2, String str3, String str4, String str5, boolean z3, boolean z4) {
        this.x = i;
        this.y = z;
        this.z = z2;
        this.A = str;
        this.B = str2;
        this.C = str3;
        this.D = str4;
        this.E = str5;
        this.F = z3;
        this.G = z4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oc7)) {
            return false;
        }
        oc7 oc7Var = (oc7) obj;
        if (this.x == oc7Var.x && this.y == oc7Var.y && this.z == oc7Var.z && TextUtils.equals(this.A, oc7Var.A) && TextUtils.equals(this.B, oc7Var.B) && TextUtils.equals(this.C, oc7Var.C) && TextUtils.equals(this.D, oc7Var.D) && TextUtils.equals(this.E, oc7Var.E) && this.F == oc7Var.F && this.G == oc7Var.G) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.x), Boolean.valueOf(this.y), Boolean.valueOf(this.z), this.A, this.B, this.C, this.D, this.E, Boolean.valueOf(this.F), Boolean.valueOf(this.G)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.r0(parcel, 2, 4);
        parcel.writeInt(this.x);
        z51.r0(parcel, 3, 4);
        parcel.writeInt(this.y ? 1 : 0);
        z51.r0(parcel, 4, 4);
        parcel.writeInt(this.z ? 1 : 0);
        z51.m0(parcel, 5, this.A);
        z51.m0(parcel, 6, this.B);
        z51.m0(parcel, 7, this.C);
        z51.m0(parcel, 8, this.D);
        z51.m0(parcel, 9, this.E);
        z51.r0(parcel, 10, 4);
        parcel.writeInt(this.F ? 1 : 0);
        z51.r0(parcel, 11, 4);
        parcel.writeInt(this.G ? 1 : 0);
        z51.t0(parcel, s0);
    }
}
