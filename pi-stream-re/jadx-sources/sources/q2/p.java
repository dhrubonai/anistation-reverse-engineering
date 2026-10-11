package q2;

import android.os.Parcel;
import android.os.Parcelable;
import f1.b0;

/* loaded from: classes.dex */
public final class p extends k {
    public static final Parcelable.Creator<p> CREATOR = new b(9);

    /* renamed from: b, reason: collision with root package name */
    public final String f9119b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9120c;

    public p(String str, String str2, String str3) {
        super(str);
        this.f9119b = str2;
        this.f9120c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f9106a.equals(pVar.f9106a) && b0.a(this.f9119b, pVar.f9119b) && b0.a(this.f9120c, pVar.f9120c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.f9106a.hashCode() + 527) * 31;
        int i11 = 0;
        String str = this.f9119b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f9120c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    @Override // q2.k
    public final String toString() {
        return this.f9106a + ": url=" + this.f9120c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f9106a);
        parcel.writeString(this.f9119b);
        parcel.writeString(this.f9120c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = f1.b0.f3799a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f9119b = r0
            java.lang.String r3 = r3.readString()
            r2.f9120c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.p.<init>(android.os.Parcel):void");
    }
}
