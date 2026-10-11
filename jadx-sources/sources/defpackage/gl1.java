package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gl1 implements Parcelable {
    public static final Parcelable.Creator<gl1> CREATOR = new hc7((byte) 4);
    public final long x;
    public final long y;

    public gl1(Parcel parcel) {
        boolean z;
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        if (readLong >= 0) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        io3.n(readLong2 >= 0 || readLong2 == -1);
        this.x = readLong;
        this.y = readLong2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gl1)) {
            return false;
        }
        gl1 gl1Var = (gl1) obj;
        if (this.x != gl1Var.x || this.y != gl1Var.y) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((int) this.x) * 961) + ((int) this.y);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.x);
        parcel.writeLong(this.y);
    }
}
