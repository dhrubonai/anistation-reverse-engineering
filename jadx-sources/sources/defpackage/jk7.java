package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jk7 extends y2 {
    public static final Parcelable.Creator<jk7> CREATOR = new c55((byte) 21);
    public final Bundle x;

    public jk7(Bundle bundle) {
        this.x = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.Z(parcel, 1, this.x);
        z51.t0(parcel, s0);
    }
}
