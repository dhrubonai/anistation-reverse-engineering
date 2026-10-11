package m3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class i1 implements Parcelable {
    public static final Parcelable.Creator<i1> CREATOR = new q2.b(22);
    public boolean A;

    /* renamed from: a, reason: collision with root package name */
    public int f7245a;

    /* renamed from: b, reason: collision with root package name */
    public int f7246b;

    /* renamed from: c, reason: collision with root package name */
    public int f7247c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f7248d;

    /* renamed from: e, reason: collision with root package name */
    public int f7249e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f7250f;

    /* renamed from: x, reason: collision with root package name */
    public List f7251x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f7252y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f7253z;

    public i1(Parcel parcel) {
        this.f7245a = parcel.readInt();
        this.f7246b = parcel.readInt();
        int readInt = parcel.readInt();
        this.f7247c = readInt;
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.f7248d = iArr;
            parcel.readIntArray(iArr);
        }
        int readInt2 = parcel.readInt();
        this.f7249e = readInt2;
        if (readInt2 > 0) {
            int[] iArr2 = new int[readInt2];
            this.f7250f = iArr2;
            parcel.readIntArray(iArr2);
        }
        this.f7252y = parcel.readInt() == 1;
        this.f7253z = parcel.readInt() == 1;
        this.A = parcel.readInt() == 1;
        this.f7251x = parcel.readArrayList(h1.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f7245a);
        parcel.writeInt(this.f7246b);
        parcel.writeInt(this.f7247c);
        if (this.f7247c > 0) {
            parcel.writeIntArray(this.f7248d);
        }
        parcel.writeInt(this.f7249e);
        if (this.f7249e > 0) {
            parcel.writeIntArray(this.f7250f);
        }
        parcel.writeInt(this.f7252y ? 1 : 0);
        parcel.writeInt(this.f7253z ? 1 : 0);
        parcel.writeInt(this.A ? 1 : 0);
        parcel.writeList(this.f7251x);
    }

    public i1(i1 i1Var) {
        this.f7247c = i1Var.f7247c;
        this.f7245a = i1Var.f7245a;
        this.f7246b = i1Var.f7246b;
        this.f7248d = i1Var.f7248d;
        this.f7249e = i1Var.f7249e;
        this.f7250f = i1Var.f7250f;
        this.f7252y = i1Var.f7252y;
        this.f7253z = i1Var.f7253z;
        this.A = i1Var.A;
        this.f7251x = i1Var.f7251x;
    }
}
