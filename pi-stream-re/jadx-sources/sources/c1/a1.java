package c1;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a1 implements Comparable, Parcelable {
    public static final Parcelable.Creator<a1> CREATOR = new android.support.v4.media.a(17);

    /* renamed from: a, reason: collision with root package name */
    public final int f1623a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1624b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1625c;

    static {
        f1.b0.J(0);
        f1.b0.J(1);
        f1.b0.J(2);
    }

    public a1() {
        this.f1623a = -1;
        this.f1624b = -1;
        this.f1625c = -1;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        a1 a1Var = (a1) obj;
        int i10 = this.f1623a - a1Var.f1623a;
        if (i10 == 0) {
            int i11 = this.f1624b - a1Var.f1624b;
            if (i11 == 0) {
                return this.f1625c - a1Var.f1625c;
            }
            return i11;
        }
        return i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a1.class != obj.getClass()) {
            return false;
        }
        a1 a1Var = (a1) obj;
        if (this.f1623a == a1Var.f1623a && this.f1624b == a1Var.f1624b && this.f1625c == a1Var.f1625c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f1623a * 31) + this.f1624b) * 31) + this.f1625c;
    }

    public final String toString() {
        return this.f1623a + "." + this.f1624b + "." + this.f1625c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f1623a);
        parcel.writeInt(this.f1624b);
        parcel.writeInt(this.f1625c);
    }

    public a1(Parcel parcel) {
        this.f1623a = parcel.readInt();
        this.f1624b = parcel.readInt();
        this.f1625c = parcel.readInt();
    }
}
