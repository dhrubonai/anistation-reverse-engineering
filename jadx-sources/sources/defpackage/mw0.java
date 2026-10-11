package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mw0 extends y2 {
    public static final Parcelable.Creator<mw0> CREATOR = new aw7(5);
    public final int[] A;
    public final int B;
    public final int[] C;
    public final j75 x;
    public final boolean y;
    public final boolean z;

    public mw0(j75 j75Var, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.x = j75Var;
        this.y = z;
        this.z = z2;
        this.A = iArr;
        this.B = i;
        this.C = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.l0(parcel, 1, this.x, i);
        z51.r0(parcel, 2, 4);
        parcel.writeInt(this.y ? 1 : 0);
        z51.r0(parcel, 3, 4);
        parcel.writeInt(this.z ? 1 : 0);
        z51.d0(parcel, 4, this.A);
        z51.r0(parcel, 5, 4);
        parcel.writeInt(this.B);
        z51.d0(parcel, 6, this.C);
        z51.t0(parcel, s0);
    }
}
