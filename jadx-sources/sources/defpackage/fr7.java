package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fr7 extends y2 {
    public static final Parcelable.Creator<fr7> CREATOR = new an7(23);
    public final int A;
    public final String B;
    public final boolean C;
    public final int x;
    public final boolean y;
    public final ArrayList z;

    public fr7(int i, boolean z, ArrayList arrayList, int i2, String str, boolean z2) {
        ArrayList arrayList2 = new ArrayList();
        this.z = arrayList2;
        this.x = i;
        this.y = z;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        this.A = i2;
        this.B = str;
        this.C = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.r0(parcel, 2, 4);
        parcel.writeInt(this.x);
        z51.r0(parcel, 3, 4);
        parcel.writeInt(this.y ? 1 : 0);
        z51.n0(parcel, 4, this.z);
        z51.r0(parcel, 5, 4);
        parcel.writeInt(this.A);
        z51.m0(parcel, 6, this.B);
        z51.r0(parcel, 7, 4);
        parcel.writeInt(this.C ? 1 : 0);
        z51.t0(parcel, s0);
    }
}
