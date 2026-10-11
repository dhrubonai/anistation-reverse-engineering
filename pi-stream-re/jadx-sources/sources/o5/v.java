package o5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class v extends c5.a {
    public static final Parcelable.Creator<v> CREATOR = new t0(29);

    /* renamed from: a, reason: collision with root package name */
    public final String f8278a;

    public v(String str) {
        w7.b.s(str);
        this.f8278a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        return this.f8278a.equals(((v) obj).f8278a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8278a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = p7.a0.t0(20293, parcel);
        p7.a0.n0(parcel, 2, this.f8278a, false);
        p7.a0.u0(t02, parcel);
    }
}
