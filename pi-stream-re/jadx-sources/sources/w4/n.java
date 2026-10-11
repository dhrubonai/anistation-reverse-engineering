package w4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p7.a0;

/* loaded from: classes.dex */
public final class n extends c5.a {
    public static final Parcelable.Creator<n> CREATOR = new v4.b(19);

    /* renamed from: a, reason: collision with root package name */
    public final String f10992a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10993b;

    public n(String str, String str2) {
        if (str != null) {
            String trim = str.trim();
            w7.b.n("Account identifier cannot be empty", trim);
            this.f10992a = trim;
            w7.b.o(str2);
            this.f10993b = str2;
            return;
        }
        throw new NullPointerException("Account identifier cannot be null");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (!a0.q(this.f10992a, nVar.f10992a) || !a0.q(this.f10993b, nVar.f10993b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10992a, this.f10993b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.n0(parcel, 1, this.f10992a, false);
        a0.n0(parcel, 2, this.f10993b, false);
        a0.u0(t02, parcel);
    }
}
