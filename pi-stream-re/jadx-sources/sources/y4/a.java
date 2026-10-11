package y4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p7.a0;

/* loaded from: classes.dex */
public final class a extends c5.a {
    public static final Parcelable.Creator<a> CREATOR = new v4.b(20);

    /* renamed from: a, reason: collision with root package name */
    public final String f11619a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11620b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11621c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f11622d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11623e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f11624f;

    public a(int i10, String str, int i11, long j4, byte[] bArr, Bundle bundle) {
        this.f11623e = i10;
        this.f11619a = str;
        this.f11620b = i11;
        this.f11621c = j4;
        this.f11622d = bArr;
        this.f11624f = bundle;
    }

    public final String toString() {
        return "ProxyRequest[ url: " + this.f11619a + ", method: " + this.f11620b + " ]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.n0(parcel, 1, this.f11619a, false);
        a0.h0(parcel, 2, this.f11620b);
        a0.k0(parcel, 3, this.f11621c);
        a0.f0(parcel, 4, this.f11622d, false);
        a0.e0(parcel, 5, this.f11624f, false);
        a0.h0(parcel, 1000, this.f11623e);
        a0.u0(t02, parcel);
    }
}
