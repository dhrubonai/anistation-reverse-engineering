package r4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p7.a0;

/* loaded from: classes.dex */
public final class a extends c5.a {
    public static final Parcelable.Creator<a> CREATOR = new v4.b(27);

    /* renamed from: a, reason: collision with root package name */
    public final int f9401a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9402b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9403c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9404d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9405e;

    /* renamed from: f, reason: collision with root package name */
    public final String f9406f;

    public a(int i10, long j4, String str, int i11, int i12, String str2) {
        this.f9401a = i10;
        this.f9402b = j4;
        w7.b.s(str);
        this.f9403c = str;
        this.f9404d = i11;
        this.f9405e = i12;
        this.f9406f = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        a aVar = (a) obj;
        if (this.f9401a != aVar.f9401a || this.f9402b != aVar.f9402b || !a0.q(this.f9403c, aVar.f9403c) || this.f9404d != aVar.f9404d || this.f9405e != aVar.f9405e || !a0.q(this.f9406f, aVar.f9406f)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9401a), Long.valueOf(this.f9402b), this.f9403c, Integer.valueOf(this.f9404d), Integer.valueOf(this.f9405e), this.f9406f});
    }

    public final String toString() {
        String str;
        int i10 = this.f9404d;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        str = "UNKNOWN";
                    } else {
                        str = "RENAMED_TO";
                    }
                } else {
                    str = "RENAMED_FROM";
                }
            } else {
                str = "REMOVED";
            }
        } else {
            str = "ADDED";
        }
        return "AccountChangeEvent {accountName = " + this.f9403c + ", changeType = " + str + ", changeData = " + this.f9406f + ", eventIndex = " + this.f9405e + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.h0(parcel, 1, this.f9401a);
        a0.k0(parcel, 2, this.f9402b);
        a0.n0(parcel, 3, this.f9403c, false);
        a0.h0(parcel, 4, this.f9404d);
        a0.h0(parcel, 5, this.f9405e);
        a0.n0(parcel, 6, this.f9406f, false);
        a0.u0(t02, parcel);
    }
}
