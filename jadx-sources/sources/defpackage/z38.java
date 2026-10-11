package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class z38 extends y2 {
    public static final Parcelable.Creator<z38> CREATOR = new aw7((byte) 17);
    public final int A;
    public final long B;
    public final boolean x;
    public final String y;
    public final int z;

    public z38(boolean z, String str, int i, int i2, long j) {
        this.x = z;
        this.y = str;
        this.z = nv5.v(i) - 1;
        this.A = mv5.j(i2) - 1;
        this.B = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.r0(parcel, 1, 4);
        parcel.writeInt(this.x ? 1 : 0);
        z51.m0(parcel, 2, this.y);
        z51.r0(parcel, 3, 4);
        parcel.writeInt(this.z);
        z51.r0(parcel, 4, 4);
        parcel.writeInt(this.A);
        z51.r0(parcel, 5, 8);
        parcel.writeLong(this.B);
        z51.t0(parcel, s0);
    }
}
