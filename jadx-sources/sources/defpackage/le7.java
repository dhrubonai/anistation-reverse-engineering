package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class le7 extends y2 {
    public static final Parcelable.Creator<le7> CREATOR = new c55(15);
    public mr A;
    public int B;
    public kk7 C;
    public double D;
    public double x;
    public boolean y;
    public int z;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof le7)) {
            return false;
        }
        le7 le7Var = (le7) obj;
        if (this.x == le7Var.x && this.y == le7Var.y && this.z == le7Var.z && qi0.c(this.A, le7Var.A) && this.B == le7Var.B) {
            kk7 kk7Var = this.C;
            if (qi0.c(kk7Var, kk7Var) && this.D == le7Var.D) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.x), Boolean.valueOf(this.y), Integer.valueOf(this.z), this.A, Integer.valueOf(this.B), this.C, Double.valueOf(this.D)});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "volume=%f", Double.valueOf(this.x));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        double d = this.x;
        z51.r0(parcel, 2, 8);
        parcel.writeDouble(d);
        boolean z = this.y;
        z51.r0(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        int i2 = this.z;
        z51.r0(parcel, 4, 4);
        parcel.writeInt(i2);
        z51.l0(parcel, 5, this.A, i);
        int i3 = this.B;
        z51.r0(parcel, 6, 4);
        parcel.writeInt(i3);
        z51.l0(parcel, 7, this.C, i);
        double d2 = this.D;
        z51.r0(parcel, 8, 8);
        parcel.writeDouble(d2);
        z51.t0(parcel, s0);
    }
}
