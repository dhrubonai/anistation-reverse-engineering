package w4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p7.a0;

/* loaded from: classes.dex */
public final class e extends c5.a {
    public static final Parcelable.Creator<e> CREATOR = new v4.b(13);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10962a;

    public e(boolean z9) {
        this.f10962a = z9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e) || this.f10962a != ((e) obj).f10962a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f10962a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.d0(parcel, 1, this.f10962a);
        a0.u0(t02, parcel);
    }
}
