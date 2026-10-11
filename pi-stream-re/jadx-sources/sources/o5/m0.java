package o5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class m0 extends c5.a {
    public static final Parcelable.Creator<m0> CREATOR = new t0(8);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8257a;

    public m0(boolean z9) {
        this.f8257a = z9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m0) || this.f8257a != ((m0) obj).f8257a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f8257a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = p7.a0.t0(20293, parcel);
        p7.a0.d0(parcel, 1, this.f8257a);
        p7.a0.u0(t02, parcel);
    }
}
