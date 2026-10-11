package o5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class w extends c5.a {
    public static final Parcelable.Creator<w> CREATOR = new com.google.android.gms.common.api.y(24);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8281a;

    public w(boolean z9) {
        this.f8281a = z9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        if (this.f8281a != ((w) obj).f8281a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f8281a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = p7.a0.t0(20293, parcel);
        p7.a0.d0(parcel, 1, this.f8281a);
        p7.a0.u0(t02, parcel);
    }
}
