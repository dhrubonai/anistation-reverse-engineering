package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tu2 extends y2 {
    public static final Parcelable.Creator<tu2> CREATOR = new an7((byte) 24);
    public final int x;
    public final int y;
    public final int z;

    public tu2(int i, int i2, int i3) {
        this.x = i;
        this.y = i2;
        this.z = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.r0(parcel, 2, 4);
        parcel.writeInt(this.x);
        z51.r0(parcel, 3, 4);
        parcel.writeInt(this.y);
        z51.r0(parcel, 4, 4);
        parcel.writeInt(this.z);
        z51.t0(parcel, s0);
    }
}
