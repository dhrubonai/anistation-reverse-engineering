package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class x76 extends y2 {
    public static final Parcelable.Creator<x76> CREATOR = new c55(2);
    public final int x;
    public List y;

    public x76(int i, List list) {
        this.x = i;
        this.y = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.r0(parcel, 1, 4);
        parcel.writeInt(this.x);
        z51.p0(parcel, 2, this.y);
        z51.t0(parcel, s0);
    }
}
