package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lp extends y2 {
    public static final lp A;
    public static final Parcelable.Creator<lp> CREATOR = hc7.b;
    public final hr0 x;
    public final boolean y;
    public boolean z;

    static {
        lp lpVar = new lp(null, false);
        lpVar.z = false;
        A = lpVar;
    }

    public lp(hr0 hr0Var, boolean z) {
        this.x = hr0Var;
        this.y = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lp) {
            lp lpVar = (lp) obj;
            if (bx7.q(this.x, lpVar.x) && this.z == lpVar.z && this.y == lpVar.y) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.x, Boolean.valueOf(this.z), Boolean.valueOf(this.y)});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.x);
        return qx1.q(new StringBuilder(valueOf.length() + 31), "ApiMetadata(complianceOptions=", valueOf, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.z) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int s0 = z51.s0(parcel, 20293);
        z51.l0(parcel, 1, this.x, i);
        z51.r0(parcel, 2, 4);
        parcel.writeInt(this.y ? 1 : 0);
        z51.t0(parcel, s0);
    }
}
