package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class q12 extends y2 {
    public static final Parcelable.Creator<q12> CREATOR = new c55(25);
    public final boolean A;
    public final String x;
    public final int y;
    public final long z;

    public q12(String str, int i, long j, boolean z) {
        this.x = str;
        this.y = i;
        this.z = j;
        this.A = z;
    }

    public final long c() {
        long j = this.z;
        if (j == -1) {
            return this.y;
        }
        return j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q12) {
            q12 q12Var = (q12) obj;
            if (bx7.q(this.x, q12Var.x) && c() == q12Var.c() && this.A == q12Var.A) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.x, Long.valueOf(c()), Boolean.valueOf(this.A)});
    }

    public final String toString() {
        y23 y23Var = new y23(this);
        y23Var.R(this.x, MediationMetaData.KEY_NAME);
        y23Var.R(Long.valueOf(c()), "version");
        y23Var.R(Boolean.valueOf(this.A), "is_fully_rolled_out");
        return y23Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.m0(parcel, 1, this.x);
        z51.r0(parcel, 2, 4);
        parcel.writeInt(this.y);
        long c = c();
        z51.r0(parcel, 3, 8);
        parcel.writeLong(c);
        z51.r0(parcel, 4, 4);
        parcel.writeInt(this.A ? 1 : 0);
        z51.t0(parcel, s0);
    }
}
