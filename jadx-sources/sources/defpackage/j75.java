package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class j75 extends y2 {
    public static final Parcelable.Creator<j75> CREATOR = new c55(16);
    public final int A;
    public final int B;
    public final int x;
    public final boolean y;
    public final boolean z;

    public j75(int i, int i2, int i3, boolean z, boolean z2) {
        this.x = i;
        this.y = z;
        this.z = z2;
        this.A = i2;
        this.B = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.r0(parcel, 1, 4);
        parcel.writeInt(this.x);
        z51.r0(parcel, 2, 4);
        parcel.writeInt(this.y ? 1 : 0);
        z51.r0(parcel, 3, 4);
        parcel.writeInt(this.z ? 1 : 0);
        z51.r0(parcel, 4, 4);
        parcel.writeInt(this.A);
        z51.r0(parcel, 5, 4);
        parcel.writeInt(this.B);
        z51.t0(parcel, s0);
    }
}
