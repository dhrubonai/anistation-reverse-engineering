package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class iq7 extends y2 {
    public static final Parcelable.Creator<iq7> CREATOR = new an7((byte) 19);
    public final String x;
    public final byte[] y;
    public final ArrayList z;

    public iq7(String str, byte[] bArr, ArrayList arrayList) {
        ArrayList arrayList2;
        this.x = str;
        this.y = bArr;
        if (arrayList == null) {
            arrayList2 = new ArrayList(0);
        } else {
            arrayList2 = new ArrayList(arrayList);
        }
        this.z = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof iq7) {
                iq7 iq7Var = (iq7) obj;
                if (bx7.q(this.x, iq7Var.x) && bx7.q(this.y, iq7Var.y) && bx7.q(this.z, iq7Var.z)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.x, this.y, this.z});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.m0(parcel, 1, this.x);
        z51.a0(parcel, 2, this.y);
        z51.e0(parcel, 3, new ArrayList(this.z));
        z51.t0(parcel, s0);
    }
}
