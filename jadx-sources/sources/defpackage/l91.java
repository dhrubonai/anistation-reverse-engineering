package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class l91 implements Parcelable {
    public static final Parcelable.Creator<l91> CREATOR = new hc7((byte) 2);
    public final int x;

    public l91(int i) {
        this.x = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof l91) && this.x == ((l91) obj).x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.x);
    }

    public final String toString() {
        return qx1.i(this.x, "DefaultLazyKey(index=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.x);
    }
}
