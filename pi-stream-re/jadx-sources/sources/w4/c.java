package w4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p7.a0;

/* loaded from: classes.dex */
public final class c extends c5.a {
    public static final Parcelable.Creator<c> CREATOR = new v4.b(11);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10957a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10958b;

    public c(String str, boolean z9) {
        if (z9) {
            w7.b.s(str);
        }
        this.f10957a = z9;
        this.f10958b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f10957a == cVar.f10957a && a0.q(this.f10958b, cVar.f10958b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f10957a), this.f10958b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.d0(parcel, 1, this.f10957a);
        a0.n0(parcel, 2, this.f10958b, false);
        a0.u0(t02, parcel);
    }
}
