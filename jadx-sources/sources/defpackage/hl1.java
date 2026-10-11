package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hl1 implements Parcelable {
    public static final Parcelable.Creator<hl1> CREATOR = new hc7((byte) 5);
    public final long x;
    public final long y;

    public hl1(Parcel parcel) {
        boolean z;
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        if (readLong2 < 0 && readLong2 != -9223372036854775807L) {
            z = false;
        } else {
            z = true;
        }
        io3.n(z);
        this.x = readLong;
        this.y = readLong2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hl1)) {
            return false;
        }
        hl1 hl1Var = (hl1) obj;
        if (this.x != hl1Var.x || this.y != hl1Var.y) {
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
