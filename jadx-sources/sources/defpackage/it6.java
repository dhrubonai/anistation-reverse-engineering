package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class it6 extends y2 {
    public static final zk3 A = new zk3("VideoInfo", null);
    public static final Parcelable.Creator<it6> CREATOR = new an7(17);
    public final int x;
    public final int y;
    public final int z;

    public it6(int i, int i2, int i3) {
        this.x = i;
        this.y = i2;
        this.z = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it6)) {
            return false;
        }
        it6 it6Var = (it6) obj;
        if (this.y == it6Var.y && this.x == it6Var.x && this.z == it6Var.z) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.y), Integer.valueOf(this.x), Integer.valueOf(this.z)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.r0(parcel, 2, 4);
        parcel.writeInt(this.x);
        z51.r0(parcel, 3, 4);
        parcel.writeInt(this.y);
        z51.r0(parcel, 4, 4);
        parcel.writeInt(this.z);
        z51.t0(parcel, s0);
    }
}
