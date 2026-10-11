package q2;

import android.os.Parcel;
import android.os.Parcelable;
import f1.b0;

/* loaded from: classes.dex */
public final class f extends k {
    public static final Parcelable.Creator<f> CREATOR = new b(3);

    /* renamed from: b, reason: collision with root package name */
    public final String f9094b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9095c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9096d;

    public f(String str, String str2, String str3) {
        super("COMM");
        this.f9094b = str;
        this.f9095c = str2;
        this.f9096d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (b0.a(this.f9095c, fVar.f9095c) && b0.a(this.f9094b, fVar.f9094b) && b0.a(this.f9096d, fVar.f9096d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f9094b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (527 + i10) * 31;
        String str2 = this.f9095c;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f9096d;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i14 + i12;
    }

    @Override // q2.k
    public final String toString() {
        return this.f9106a + ": language=" + this.f9094b + ", description=" + this.f9095c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f9106a);
        parcel.writeString(this.f9094b);
        parcel.writeString(this.f9096d);
    }

    public f(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i10 = b0.f3799a;
        this.f9094b = readString;
        this.f9095c = parcel.readString();
        this.f9096d = parcel.readString();
    }
}
