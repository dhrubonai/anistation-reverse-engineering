package o5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a1 extends c5.a {
    public static final Parcelable.Creator<a1> CREATOR = new t0(27);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8195a;

    public a1(boolean z9) {
        Boolean valueOf = Boolean.valueOf(z9);
        w7.b.s(valueOf);
        this.f8195a = valueOf.booleanValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a1) || this.f8195a != ((a1) obj).f8195a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f8195a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = p7.a0.t0(20293, parcel);
        p7.a0.d0(parcel, 1, this.f8195a);
        p7.a0.u0(t02, parcel);
    }
}
