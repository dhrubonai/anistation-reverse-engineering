package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hw7 extends y2 implements Comparable {
    public static final Parcelable.Creator<hw7> CREATOR = new aw7((byte) 3);
    public final int x;
    public final int y;

    public hw7(int i, int i2) {
        this.x = i;
        this.y = i2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        hw7 hw7Var = (hw7) obj;
        int i = hw7Var.x;
        int i2 = this.x;
        if (i2 >= i) {
            if (i2 <= i) {
                int i3 = hw7Var.y;
                int i4 = this.y;
                if (i4 < i3) {
                    return -1;
                }
                if (i4 > i3) {
                    return 1;
                }
                return 0;
            }
            return 1;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        hw7 hw7Var;
        int i;
        int i2;
        int i3;
        int i4;
        if ((obj instanceof hw7) && (i2 = this.x) >= (i = (hw7Var = (hw7) obj).x) && i2 <= i && (i4 = this.y) >= (i3 = hw7Var.y) && i4 <= i3) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.x * 31) + this.y;
    }

    public final String toString() {
        int i = this.x;
        int length = String.valueOf(i).length();
        int i2 = this.y;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(i2).length() + 1);
        sb.append("GenericDimension(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.r0(parcel, 1, 4);
        parcel.writeInt(this.x);
        z51.r0(parcel, 2, 4);
        parcel.writeInt(this.y);
        z51.t0(parcel, s0);
    }
}
