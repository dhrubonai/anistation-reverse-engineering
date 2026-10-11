package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qw7 extends y2 {
    public static final Parcelable.Creator<qw7> CREATOR = new aw7(6);
    public final boolean x;

    public qw7(boolean z) {
        this.x = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.r0(parcel, 2, 4);
        parcel.writeInt(this.x ? 1 : 0);
        z51.t0(parcel, s0);
    }
}
