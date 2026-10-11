package p2;

import android.os.Parcel;
import android.os.Parcelable;
import c1.m0;
import c1.o0;
import c1.v;
import f1.b0;

/* loaded from: classes.dex */
public final class b implements o0 {
    public static final Parcelable.Creator<b> CREATOR = new android.support.v4.media.a(27);

    /* renamed from: a, reason: collision with root package name */
    public final int f8546a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8547b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8548c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8549d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8550e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8551f;

    public b(int i10, String str, String str2, String str3, boolean z9, int i11) {
        w7.b.g(i11 == -1 || i11 > 0);
        this.f8546a = i10;
        this.f8547b = str;
        this.f8548c = str2;
        this.f8549d = str3;
        this.f8550e = z9;
        this.f8551f = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p2.b d(java.util.Map r14) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.b.d(java.util.Map):p2.b");
    }

    @Override // c1.o0
    public final void a(m0 m0Var) {
        String str = this.f8548c;
        if (str != null) {
            m0Var.C = str;
        }
        String str2 = this.f8547b;
        if (str2 != null) {
            m0Var.A = str2;
        }
    }

    @Override // c1.o0
    public final /* synthetic */ v b() {
        return null;
    }

    @Override // c1.o0
    public final /* synthetic */ byte[] c() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f8546a == bVar.f8546a && b0.a(this.f8547b, bVar.f8547b) && b0.a(this.f8548c, bVar.f8548c) && b0.a(this.f8549d, bVar.f8549d) && this.f8550e == bVar.f8550e && this.f8551f == bVar.f8551f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = (527 + this.f8546a) * 31;
        int i13 = 0;
        String str = this.f8547b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i12 + i10) * 31;
        String str2 = this.f8548c;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (i14 + i11) * 31;
        String str3 = this.f8549d;
        if (str3 != null) {
            i13 = str3.hashCode();
        }
        return ((((i15 + i13) * 31) + (this.f8550e ? 1 : 0)) * 31) + this.f8551f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f8548c + "\", genre=\"" + this.f8547b + "\", bitrate=" + this.f8546a + ", metadataInterval=" + this.f8551f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f8546a);
        parcel.writeString(this.f8547b);
        parcel.writeString(this.f8548c);
        parcel.writeString(this.f8549d);
        int i11 = b0.f3799a;
        parcel.writeInt(this.f8550e ? 1 : 0);
        parcel.writeInt(this.f8551f);
    }

    public b(Parcel parcel) {
        this.f8546a = parcel.readInt();
        this.f8547b = parcel.readString();
        this.f8548c = parcel.readString();
        this.f8549d = parcel.readString();
        int i10 = b0.f3799a;
        this.f8550e = parcel.readInt() != 0;
        this.f8551f = parcel.readInt();
    }
}
