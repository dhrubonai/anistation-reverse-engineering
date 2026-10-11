package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cs6;
import defpackage.ds6;
import defpackage.hc7;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new hc7((byte) 19);
    public final ds6 x;

    public ParcelImpl(Parcel parcel) {
        this.x = new cs6(parcel).h();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new cs6(parcel).l(this.x);
    }

    public ParcelImpl(ds6 ds6Var) {
        this.x = ds6Var;
    }
}
