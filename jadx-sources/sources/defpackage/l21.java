package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class l21 extends y2 {
    public static final Parcelable.Creator<l21> CREATOR = new c55((byte) 19);
    public final String x;
    public final String y;

    public l21(String str, String str2) {
        this.x = str;
        this.y = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l21)) {
            return false;
        }
        l21 l21Var = (l21) obj;
        if (bx7.q(this.x, l21Var.x) && bx7.q(this.y, l21Var.y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.x, this.y});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.m0(parcel, 1, this.x);
        z51.m0(parcel, 2, this.y);
        z51.t0(parcel, s0);
    }
}
