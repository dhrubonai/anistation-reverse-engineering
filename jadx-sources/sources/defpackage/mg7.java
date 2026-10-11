package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mg7 extends y2 {
    public static final Parcelable.Creator<mg7> CREATOR = new c55((byte) 17);
    public final long x;
    public final int y;
    public final long z;

    public mg7(long j, int i, long j2) {
        this.x = j;
        this.y = i;
        this.z = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.r0(parcel, 1, 8);
        parcel.writeLong(this.x);
        z51.r0(parcel, 2, 4);
        parcel.writeInt(this.y);
        z51.r0(parcel, 3, 8);
        parcel.writeLong(this.z);
        z51.t0(parcel, s0);
    }
}
