package q2;

import android.os.Parcel;
import android.os.Parcelable;
import f1.b0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d extends k {
    public static final Parcelable.Creator<d> CREATOR = new b(1);

    /* renamed from: b, reason: collision with root package name */
    public final String f9083b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9084c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9085d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9086e;

    /* renamed from: f, reason: collision with root package name */
    public final long f9087f;

    /* renamed from: x, reason: collision with root package name */
    public final k[] f9088x;

    public d(String str, int i10, int i11, long j4, long j10, k[] kVarArr) {
        super("CHAP");
        this.f9083b = str;
        this.f9084c = i10;
        this.f9085d = i11;
        this.f9086e = j4;
        this.f9087f = j10;
        this.f9088x = kVarArr;
    }

    @Override // q2.k, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f9084c == dVar.f9084c && this.f9085d == dVar.f9085d && this.f9086e == dVar.f9086e && this.f9087f == dVar.f9087f && b0.a(this.f9083b, dVar.f9083b) && Arrays.equals(this.f9088x, dVar.f9088x)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f9084c) * 31) + this.f9085d) * 31) + ((int) this.f9086e)) * 31) + ((int) this.f9087f)) * 31;
        String str = this.f9083b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f9083b);
        parcel.writeInt(this.f9084c);
        parcel.writeInt(this.f9085d);
        parcel.writeLong(this.f9086e);
        parcel.writeLong(this.f9087f);
        k[] kVarArr = this.f9088x;
        parcel.writeInt(kVarArr.length);
        for (k kVar : kVarArr) {
            parcel.writeParcelable(kVar, 0);
        }
    }

    public d(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i10 = b0.f3799a;
        this.f9083b = readString;
        this.f9084c = parcel.readInt();
        this.f9085d = parcel.readInt();
        this.f9086e = parcel.readLong();
        this.f9087f = parcel.readLong();
        int readInt = parcel.readInt();
        this.f9088x = new k[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            this.f9088x[i11] = (k) parcel.readParcelable(k.class.getClassLoader());
        }
    }
}
