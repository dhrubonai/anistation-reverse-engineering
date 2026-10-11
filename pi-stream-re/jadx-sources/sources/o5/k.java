package o5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzaj;
import com.google.android.gms.internal.fido.zzak;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class k extends l {
    public static final Parcelable.Creator<k> CREATOR = new t0(20);

    /* renamed from: a, reason: collision with root package name */
    public final u f8248a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8249b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8250c;

    public k(int i10, String str, int i11) {
        try {
            for (u uVar : u.values()) {
                if (i10 == uVar.f8277a) {
                    this.f8248a = uVar;
                    this.f8249b = str;
                    this.f8250c = i11;
                    return;
                }
            }
            throw new t(i10);
        } catch (t e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!p7.a0.q(this.f8248a, kVar.f8248a) || !p7.a0.q(this.f8249b, kVar.f8249b) || !p7.a0.q(Integer.valueOf(this.f8250c), Integer.valueOf(kVar.f8250c))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8248a, this.f8249b, Integer.valueOf(this.f8250c)});
    }

    public final String toString() {
        zzaj zza = zzak.zza(this);
        zza.zza("errorCode", this.f8248a.f8277a);
        String str = this.f8249b;
        if (str != null) {
            zza.zzb("errorMessage", str);
        }
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = p7.a0.t0(20293, parcel);
        p7.a0.h0(parcel, 2, this.f8248a.f8277a);
        p7.a0.n0(parcel, 3, this.f8249b, false);
        p7.a0.h0(parcel, 4, this.f8250c);
        p7.a0.u0(t02, parcel);
    }
}
