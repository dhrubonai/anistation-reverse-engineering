package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vv7 extends y2 {
    public static final Parcelable.Creator<vv7> CREATOR = new an7(28);
    public final byte[] x;

    public vv7(byte[] bArr) {
        this.x = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.a0(parcel, 2, this.x);
        z51.t0(parcel, s0);
    }
}
