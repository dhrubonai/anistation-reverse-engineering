package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class er3 extends y2 {
    public static final zk3 B = new zk3("MediaLiveSeekableRange", null);
    public static final Parcelable.Creator<er3> CREATOR = new an7(1);
    public final boolean A;
    public final long x;
    public final long y;
    public final boolean z;

    public er3(long j, long j2, boolean z, boolean z2) {
        this.x = Math.max(j, 0L);
        this.y = Math.max(j2, 0L);
        this.z = z;
        this.A = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er3)) {
            return false;
        }
        er3 er3Var = (er3) obj;
        if (this.x == er3Var.x && this.y == er3Var.y && this.z == er3Var.z && this.A == er3Var.A) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.x), Long.valueOf(this.y), Boolean.valueOf(this.z), Boolean.valueOf(this.A)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.r0(parcel, 2, 8);
        parcel.writeLong(this.x);
        z51.r0(parcel, 3, 8);
        parcel.writeLong(this.y);
        z51.r0(parcel, 4, 4);
        parcel.writeInt(this.z ? 1 : 0);
        z51.r0(parcel, 5, 4);
        parcel.writeInt(this.A ? 1 : 0);
        z51.t0(parcel, s0);
    }
}
