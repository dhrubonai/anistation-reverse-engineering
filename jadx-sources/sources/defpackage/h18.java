package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class h18 extends y2 {
    public static final Parcelable.Creator<h18> CREATOR = new aw7(13);
    public final List x;

    public h18(ArrayList arrayList) {
        this.x = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.p0(parcel, 1, this.x);
        z51.t0(parcel, s0);
    }
}
