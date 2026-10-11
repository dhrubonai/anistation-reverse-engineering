package o5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class p0 extends c5.a {
    public static final Parcelable.Creator<p0> CREATOR = new com.google.android.gms.common.api.y(22);

    /* renamed from: a, reason: collision with root package name */
    public final long f8268a;

    public p0(long j4) {
        Long valueOf = Long.valueOf(j4);
        w7.b.s(valueOf);
        this.f8268a = valueOf.longValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p0) || this.f8268a != ((p0) obj).f8268a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f8268a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = p7.a0.t0(20293, parcel);
        p7.a0.k0(parcel, 1, this.f8268a);
        p7.a0.u0(t02, parcel);
    }
}
