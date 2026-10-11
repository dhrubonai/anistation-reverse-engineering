package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rq7 extends y2 {
    public static final Parcelable.Creator<rq7> CREATOR = new an7((byte) 22);
    public final boolean x;
    public final boolean y;
    public final int z;

    public rq7(int i, boolean z, boolean z2) {
        this.x = z;
        this.y = z2;
        this.z = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.r0(parcel, 2, 4);
        parcel.writeInt(this.x ? 1 : 0);
        z51.r0(parcel, 3, 4);
        parcel.writeInt(this.y ? 1 : 0);
        z51.r0(parcel, 4, 4);
        parcel.writeInt(this.z);
        z51.t0(parcel, s0);
    }
}
