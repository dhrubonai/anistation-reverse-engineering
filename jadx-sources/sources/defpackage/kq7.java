package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kq7 extends y2 {
    public static final Parcelable.Creator<kq7> CREATOR;
    public final ArrayList x;
    public final boolean y;
    public final boolean z;

    static {
        new kq7(null, false, false);
        CREATOR = new an7((byte) 20);
    }

    public kq7(ArrayList arrayList, boolean z, boolean z2) {
        ArrayList arrayList2;
        if (arrayList == null) {
            arrayList2 = new ArrayList(0);
        } else {
            arrayList2 = new ArrayList(arrayList);
        }
        this.x = arrayList2;
        this.y = z;
        this.z = z2;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof kq7) {
                kq7 kq7Var = (kq7) obj;
                if (bx7.q(this.x, kq7Var.x) && bx7.q(Boolean.valueOf(this.y), Boolean.valueOf(kq7Var.y))) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.x, Boolean.valueOf(this.y)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.p0(parcel, 1, new ArrayList(this.x));
        z51.r0(parcel, 2, 4);
        parcel.writeInt(this.y ? 1 : 0);
        z51.r0(parcel, 3, 4);
        parcel.writeInt(this.z ? 1 : 0);
        z51.t0(parcel, s0);
    }
}
