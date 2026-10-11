package w4;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import o5.x;
import p7.a0;

/* loaded from: classes.dex */
public final class m extends c5.a {
    public static final Parcelable.Creator<m> CREATOR = new v4.b(18);

    /* renamed from: a, reason: collision with root package name */
    public final String f10983a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10984b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10985c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10986d;

    /* renamed from: e, reason: collision with root package name */
    public final Uri f10987e;

    /* renamed from: f, reason: collision with root package name */
    public final String f10988f;

    /* renamed from: x, reason: collision with root package name */
    public final String f10989x;

    /* renamed from: y, reason: collision with root package name */
    public final String f10990y;

    /* renamed from: z, reason: collision with root package name */
    public final x f10991z;

    public m(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, x xVar) {
        w7.b.o(str);
        this.f10983a = str;
        this.f10984b = str2;
        this.f10985c = str3;
        this.f10986d = str4;
        this.f10987e = uri;
        this.f10988f = str5;
        this.f10989x = str6;
        this.f10990y = str7;
        this.f10991z = xVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (!a0.q(this.f10983a, mVar.f10983a) || !a0.q(this.f10984b, mVar.f10984b) || !a0.q(this.f10985c, mVar.f10985c) || !a0.q(this.f10986d, mVar.f10986d) || !a0.q(this.f10987e, mVar.f10987e) || !a0.q(this.f10988f, mVar.f10988f) || !a0.q(this.f10989x, mVar.f10989x) || !a0.q(this.f10990y, mVar.f10990y) || !a0.q(this.f10991z, mVar.f10991z)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10983a, this.f10984b, this.f10985c, this.f10986d, this.f10987e, this.f10988f, this.f10989x, this.f10990y, this.f10991z});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.n0(parcel, 1, this.f10983a, false);
        a0.n0(parcel, 2, this.f10984b, false);
        a0.n0(parcel, 3, this.f10985c, false);
        a0.n0(parcel, 4, this.f10986d, false);
        a0.m0(parcel, 5, this.f10987e, i10, false);
        a0.n0(parcel, 6, this.f10988f, false);
        a0.n0(parcel, 7, this.f10989x, false);
        a0.n0(parcel, 8, this.f10990y, false);
        a0.m0(parcel, 9, this.f10991z, i10, false);
        a0.u0(t02, parcel);
    }
}
