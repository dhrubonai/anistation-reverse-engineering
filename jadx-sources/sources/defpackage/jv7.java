package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jv7 extends y2 {
    public static final Parcelable.Creator<jv7> CREATOR = new aw7(4);
    public mw0 A;
    public Bundle x;
    public q12[] y;
    public int z;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.Z(parcel, 1, this.x);
        z51.o0(parcel, 2, this.y, i);
        int i2 = this.z;
        z51.r0(parcel, 3, 4);
        parcel.writeInt(i2);
        z51.l0(parcel, 4, this.A, i);
        z51.t0(parcel, s0);
    }
}
