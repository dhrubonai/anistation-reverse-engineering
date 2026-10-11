package o5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzal;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class l0 extends c5.a {
    public static final Parcelable.Creator<l0> CREATOR = new t0(7);

    /* renamed from: a, reason: collision with root package name */
    public final j0 f8251a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8252b;

    static {
        new l0("supported", null);
        new l0("not-supported", null);
    }

    public l0(String str, String str2) {
        w7.b.s(str);
        try {
            for (j0 j0Var : j0.values()) {
                if (str.equals(j0Var.f8247a)) {
                    this.f8251a = j0Var;
                    this.f8252b = str2;
                    return;
                }
            }
            throw new k0(str);
        } catch (k0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (!zzal.zza(this.f8251a, l0Var.f8251a) || !zzal.zza(this.f8252b, l0Var.f8252b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8251a, this.f8252b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = p7.a0.t0(20293, parcel);
        p7.a0.n0(parcel, 2, this.f8251a.f8247a, false);
        p7.a0.n0(parcel, 3, this.f8252b, false);
        p7.a0.u0(t02, parcel);
    }
}
