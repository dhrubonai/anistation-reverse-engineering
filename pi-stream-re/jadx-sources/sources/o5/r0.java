package o5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class r0 extends c5.a {
    public static final Parcelable.Creator<r0> CREATOR = new com.google.android.gms.common.api.y(25);

    /* renamed from: a, reason: collision with root package name */
    public final String f8271a;

    public r0(String str) {
        w7.b.s(str);
        this.f8271a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r0)) {
            return false;
        }
        return this.f8271a.equals(((r0) obj).f8271a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8271a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = p7.a0.t0(20293, parcel);
        p7.a0.n0(parcel, 1, this.f8271a, false);
        p7.a0.u0(t02, parcel);
    }
}
