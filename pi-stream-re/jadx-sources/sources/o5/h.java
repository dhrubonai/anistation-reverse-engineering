package o5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h extends c5.a {
    public static final Parcelable.Creator<h> CREATOR = new t0(15);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8234a;

    public h(boolean z9) {
        this.f8234a = z9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h) || this.f8234a != ((h) obj).f8234a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f8234a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = p7.a0.t0(20293, parcel);
        p7.a0.d0(parcel, 1, this.f8234a);
        p7.a0.u0(t02, parcel);
    }
}
