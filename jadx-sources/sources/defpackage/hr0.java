package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hr0 extends y2 {
    public static final Parcelable.Creator<hr0> CREATOR = new an7(8);
    public final boolean A;
    public final int x;
    public final int y;
    public final int z;

    public hr0(int i, int i2, int i3, boolean z) {
        this.x = i;
        this.y = i2;
        this.z = i3;
        this.A = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hr0)) {
            return false;
        }
        hr0 hr0Var = (hr0) obj;
        if (this.x != hr0Var.x || this.y != hr0Var.y || this.z != hr0Var.z || this.A != hr0Var.A) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.x), Integer.valueOf(this.y), Integer.valueOf(this.z), Boolean.valueOf(this.A)});
    }

    public final String toString() {
        int i = this.x;
        int length = String.valueOf(i).length();
        int i2 = this.y;
        int length2 = String.valueOf(i2).length();
        int i3 = this.z;
        int length3 = String.valueOf(i3).length();
        boolean z = this.A;
        StringBuilder sb = new StringBuilder(length + 55 + length2 + 19 + length3 + 13 + String.valueOf(z).length() + 1);
        sb.append("ComplianceOptions{callerProductId=");
        sb.append(i);
        sb.append(", dataOwnerProductId=");
        sb.append(i2);
        sb.append(", processingReason=");
        sb.append(i3);
        sb.append(", isUserData=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.r0(parcel, 1, 4);
        parcel.writeInt(this.x);
        z51.r0(parcel, 2, 4);
        parcel.writeInt(this.y);
        z51.r0(parcel, 3, 4);
        parcel.writeInt(this.z);
        z51.r0(parcel, 4, 4);
        parcel.writeInt(this.A ? 1 : 0);
        z51.t0(parcel, s0);
    }
}
