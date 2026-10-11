package q2;

import android.os.Parcel;
import android.os.Parcelable;
import f1.b0;

/* loaded from: classes.dex */
public final class l extends k {
    public static final Parcelable.Creator<l> CREATOR = new b(5);

    /* renamed from: b, reason: collision with root package name */
    public final String f9107b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9108c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9109d;

    public l(String str, String str2, String str3) {
        super("----");
        this.f9107b = str;
        this.f9108c = str2;
        this.f9109d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (b0.a(this.f9108c, lVar.f9108c) && b0.a(this.f9107b, lVar.f9107b) && b0.a(this.f9109d, lVar.f9109d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f9107b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (527 + i10) * 31;
        String str2 = this.f9108c;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f9109d;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i14 + i12;
    }

    @Override // q2.k
    public final String toString() {
        return this.f9106a + ": domain=" + this.f9107b + ", description=" + this.f9108c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f9106a);
        parcel.writeString(this.f9107b);
        parcel.writeString(this.f9109d);
    }

    public l(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i10 = b0.f3799a;
        this.f9107b = readString;
        this.f9108c = parcel.readString();
        this.f9109d = parcel.readString();
    }
}
