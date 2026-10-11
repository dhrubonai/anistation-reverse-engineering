package w4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p7.a0;

/* loaded from: classes.dex */
public final class h extends c5.a {
    public static final Parcelable.Creator<h> CREATOR = new v4.b(8);

    /* renamed from: a, reason: collision with root package name */
    public final int f10971a;

    public h(int i10) {
        this.f10971a = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        return a0.q(Integer.valueOf(this.f10971a), Integer.valueOf(((h) obj).f10971a));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10971a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.h0(parcel, 1, this.f10971a);
        a0.u0(t02, parcel);
    }
}
