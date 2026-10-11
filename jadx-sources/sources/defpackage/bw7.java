package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bw7 extends y2 {
    public static final Parcelable.Creator<bw7> CREATOR = new aw7((byte) 1);
    public final boolean A;
    public final String x;
    public final String y;
    public final zv7 z;

    public bw7(String str, String str2, zv7 zv7Var, boolean z) {
        this.x = str;
        this.y = str2;
        this.z = zv7Var;
        this.A = z;
    }

    public final void c(StringBuilder sb) {
        sb.append("FlagOverride(");
        sb.append(this.x);
        sb.append(", ");
        sb.append(this.y);
        sb.append(", ");
        this.z.c(sb);
        sb.append(", ");
        sb.append(this.A);
        sb.append(")");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw7)) {
            return false;
        }
        bw7 bw7Var = (bw7) obj;
        if (ss5.l(this.x, bw7Var.x) && ss5.l(this.y, bw7Var.y) && ss5.l(this.z, bw7Var.z) && this.A == bw7Var.A) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        c(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.m0(parcel, 2, this.x);
        z51.m0(parcel, 3, this.y);
        z51.l0(parcel, 4, this.z, i);
        z51.r0(parcel, 5, 4);
        parcel.writeInt(this.A ? 1 : 0);
        z51.t0(parcel, s0);
    }
}
