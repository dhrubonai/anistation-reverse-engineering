package p5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p7.a0;

/* loaded from: classes.dex */
public final class g extends c5.a {
    public static final Parcelable.Creator<g> CREATOR = new i(4);

    /* renamed from: a, reason: collision with root package name */
    public final int f8591a;

    /* renamed from: b, reason: collision with root package name */
    public final f f8592b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f8593c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8594d;

    public g(int i10, String str, String str2, byte[] bArr) {
        this.f8591a = i10;
        try {
            this.f8592b = f.d(str);
            this.f8593c = bArr;
            this.f8594d = str2;
        } catch (e e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!Arrays.equals(this.f8593c, gVar.f8593c) || this.f8592b != gVar.f8592b) {
            return false;
        }
        String str = gVar.f8594d;
        String str2 = this.f8594d;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((Arrays.hashCode(this.f8593c) + 31) * 31) + this.f8592b.hashCode();
        String str = this.f8594d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (hashCode2 * 31) + hashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.h0(parcel, 1, this.f8591a);
        a0.n0(parcel, 2, this.f8592b.f8590a, false);
        a0.f0(parcel, 3, this.f8593c, false);
        a0.n0(parcel, 4, this.f8594d, false);
        a0.u0(t02, parcel);
    }
}
