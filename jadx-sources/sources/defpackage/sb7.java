package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sb7 extends y2 {
    public static final Parcelable.Creator<sb7> CREATOR = new c55(7);
    public final int x;
    public final hw0 y;
    public final zb7 z;

    public sb7(int i, hw0 hw0Var, zb7 zb7Var) {
        this.x = i;
        this.y = hw0Var;
        this.z = zb7Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.r0(parcel, 1, 4);
        parcel.writeInt(this.x);
        z51.l0(parcel, 2, this.y, i);
        z51.l0(parcel, 3, this.z, i);
        z51.t0(parcel, s0);
    }
}
