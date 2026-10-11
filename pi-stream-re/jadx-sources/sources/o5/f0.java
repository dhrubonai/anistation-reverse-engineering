package o5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class f0 extends c5.a {
    public static final Parcelable.Creator<f0> CREATOR = new t0(4);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f8223a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8224b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8225c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8226d;

    public f0(String str, String str2, String str3, byte[] bArr) {
        w7.b.s(bArr);
        this.f8223a = bArr;
        w7.b.s(str);
        this.f8224b = str;
        this.f8225c = str2;
        w7.b.s(str3);
        this.f8226d = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (!Arrays.equals(this.f8223a, f0Var.f8223a) || !p7.a0.q(this.f8224b, f0Var.f8224b) || !p7.a0.q(this.f8225c, f0Var.f8225c) || !p7.a0.q(this.f8226d, f0Var.f8226d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8223a, this.f8224b, this.f8225c, this.f8226d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = p7.a0.t0(20293, parcel);
        p7.a0.f0(parcel, 2, this.f8223a, false);
        p7.a0.n0(parcel, 3, this.f8224b, false);
        p7.a0.n0(parcel, 4, this.f8225c, false);
        p7.a0.n0(parcel, 5, this.f8226d, false);
        p7.a0.u0(t02, parcel);
    }
}
