package b5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.y;
import java.util.Arrays;
import p7.a0;

/* loaded from: classes.dex */
public final class c extends c5.a {
    public static final Parcelable.Creator<c> CREATOR = new y(18);

    /* renamed from: a, reason: collision with root package name */
    public final String f1513a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1514b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1515c;

    public c(String str, long j4) {
        this.f1513a = str;
        this.f1515c = j4;
        this.f1514b = -1;
    }

    public final long d() {
        long j4 = this.f1515c;
        return j4 == -1 ? this.f1514b : j4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str = this.f1513a;
            if (((str != null && str.equals(cVar.f1513a)) || (str == null && cVar.f1513a == null)) && d() == cVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1513a, Long.valueOf(d())});
    }

    public final String toString() {
        z3.e eVar = new z3.e(this);
        eVar.f(this.f1513a, "name");
        eVar.f(Long.valueOf(d()), "version");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.n0(parcel, 1, this.f1513a, false);
        a0.h0(parcel, 2, this.f1514b);
        a0.k0(parcel, 3, d());
        a0.u0(t02, parcel);
    }

    public c(String str, long j4, int i10) {
        this.f1513a = str;
        this.f1514b = i10;
        this.f1515c = j4;
    }
}
