package o2;

import android.os.Parcel;
import android.os.Parcelable;
import c1.m0;
import c1.o0;
import c1.q0;
import c1.v;
import f1.b0;
import f1.t;
import java.util.Arrays;
import q6.e;

/* loaded from: classes.dex */
public final class a implements o0 {
    public static final Parcelable.Creator<a> CREATOR = new android.support.v4.media.a(25);

    /* renamed from: a, reason: collision with root package name */
    public final int f8176a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8177b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8178c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8179d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8180e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8181f;

    /* renamed from: x, reason: collision with root package name */
    public final int f8182x;

    /* renamed from: y, reason: collision with root package name */
    public final byte[] f8183y;

    public a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f8176a = i10;
        this.f8177b = str;
        this.f8178c = str2;
        this.f8179d = i11;
        this.f8180e = i12;
        this.f8181f = i13;
        this.f8182x = i14;
        this.f8183y = bArr;
    }

    public static a d(t tVar) {
        int f10 = tVar.f();
        String o = q0.o(tVar.t(tVar.f(), e.f9205a));
        String s9 = tVar.s(tVar.f());
        int f11 = tVar.f();
        int f12 = tVar.f();
        int f13 = tVar.f();
        int f14 = tVar.f();
        int f15 = tVar.f();
        byte[] bArr = new byte[f15];
        tVar.d(bArr, 0, f15);
        return new a(f10, o, s9, f11, f12, f13, f14, bArr);
    }

    @Override // c1.o0
    public final void a(m0 m0Var) {
        m0Var.a(this.f8183y, this.f8176a);
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
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f8176a == aVar.f8176a && this.f8177b.equals(aVar.f8177b) && this.f8178c.equals(aVar.f8178c) && this.f8179d == aVar.f8179d && this.f8180e == aVar.f8180e && this.f8181f == aVar.f8181f && this.f8182x == aVar.f8182x && Arrays.equals(this.f8183y, aVar.f8183y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8183y) + ((((((((((this.f8178c.hashCode() + ((this.f8177b.hashCode() + ((527 + this.f8176a) * 31)) * 31)) * 31) + this.f8179d) * 31) + this.f8180e) * 31) + this.f8181f) * 31) + this.f8182x) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f8177b + ", description=" + this.f8178c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f8176a);
        parcel.writeString(this.f8177b);
        parcel.writeString(this.f8178c);
        parcel.writeInt(this.f8179d);
        parcel.writeInt(this.f8180e);
        parcel.writeInt(this.f8181f);
        parcel.writeInt(this.f8182x);
        parcel.writeByteArray(this.f8183y);
    }

    public a(Parcel parcel) {
        this.f8176a = parcel.readInt();
        String readString = parcel.readString();
        int i10 = b0.f3799a;
        this.f8177b = readString;
        this.f8178c = parcel.readString();
        this.f8179d = parcel.readInt();
        this.f8180e = parcel.readInt();
        this.f8181f = parcel.readInt();
        this.f8182x = parcel.readInt();
        this.f8183y = parcel.createByteArray();
    }
}
