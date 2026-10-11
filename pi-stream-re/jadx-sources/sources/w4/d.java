package w4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p7.a0;

/* loaded from: classes.dex */
public final class d extends c5.a {
    public static final Parcelable.Creator<d> CREATOR = new v4.b(12);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10959a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f10960b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10961c;

    public d(boolean z9, byte[] bArr, String str) {
        if (z9) {
            w7.b.s(bArr);
            w7.b.s(str);
        }
        this.f10959a = z9;
        this.f10960b = bArr;
        this.f10961c = str;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f10959a == dVar.f10959a && Arrays.equals(this.f10960b, dVar.f10960b) && ((str = this.f10961c) == (str2 = dVar.f10961c) || (str != null && str.equals(str2)))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10960b) + (Arrays.hashCode(new Object[]{Boolean.valueOf(this.f10959a), this.f10961c}) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.d0(parcel, 1, this.f10959a);
        a0.f0(parcel, 2, this.f10960b, false);
        a0.n0(parcel, 3, this.f10961c, false);
        a0.u0(t02, parcel);
    }
}
