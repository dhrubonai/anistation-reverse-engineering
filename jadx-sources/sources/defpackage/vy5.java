package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vy5 implements Comparable, Parcelable {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final Parcelable.Creator<vy5> CREATOR = new c55(1);
    public final int x;
    public final int y;
    public final int z;

    static {
        String str = eq6.a;
        A = Integer.toString(0, 36);
        B = Integer.toString(1, 36);
        C = Integer.toString(2, 36);
    }

    public vy5(Parcel parcel) {
        this.x = parcel.readInt();
        this.y = parcel.readInt();
        this.z = parcel.readInt();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        vy5 vy5Var = (vy5) obj;
        int i = this.x - vy5Var.x;
        if (i == 0 && (i = this.y - vy5Var.y) == 0) {
            return this.z - vy5Var.z;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vy5.class == obj.getClass()) {
            vy5 vy5Var = (vy5) obj;
            if (this.x == vy5Var.x && this.y == vy5Var.y && this.z == vy5Var.z) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.x * 31) + this.y) * 31) + this.z;
    }

    public final String toString() {
        return this.x + "." + this.y + "." + this.z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.x);
        parcel.writeInt(this.y);
        parcel.writeInt(this.z);
    }

    public vy5(int i, int i2, int i3) {
        this.x = i;
        this.y = i2;
        this.z = i3;
    }
}
