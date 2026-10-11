package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ab4 extends y2 {
    public static final Parcelable.Creator<ab4> CREATOR = new aw7(15);
    public final String x;
    public final int y;
    public final String z;

    public ab4(String str, int i, String str2) {
        this.x = str;
        this.y = i;
        this.z = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.m0(parcel, 2, this.x);
        z51.r0(parcel, 3, 4);
        parcel.writeInt(this.y);
        z51.m0(parcel, 4, this.z);
        z51.t0(parcel, s0);
    }
}
