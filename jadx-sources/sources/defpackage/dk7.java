package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dk7 extends y2 {
    public static final Parcelable.Creator<dk7> CREATOR = new c55((byte) 20);
    public final float x;
    public final float y;
    public final float z;

    public dk7(float f, float f2, float f3) {
        this.x = f;
        this.y = f2;
        this.z = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk7)) {
            return false;
        }
        dk7 dk7Var = (dk7) obj;
        if (this.x == dk7Var.x && this.y == dk7Var.y && this.z == dk7Var.z) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.x), Float.valueOf(this.y), Float.valueOf(this.z)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.r0(parcel, 2, 4);
        parcel.writeFloat(this.x);
        z51.r0(parcel, 3, 4);
        parcel.writeFloat(this.y);
        z51.r0(parcel, 4, 4);
        parcel.writeFloat(this.z);
        z51.t0(parcel, s0);
    }
}
