package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class x08 extends y2 {
    public static final Parcelable.Creator<x08> CREATOR = new aw7(10);
    public final String x;
    public final long y;
    public final int z;

    public x08(long j, int i, String str) {
        this.x = str;
        this.y = j;
        this.z = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.m0(parcel, 1, this.x);
        z51.r0(parcel, 2, 8);
        parcel.writeLong(this.y);
        z51.r0(parcel, 3, 4);
        parcel.writeInt(this.z);
        z51.t0(parcel, s0);
    }
}
