package o5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzau;
import com.google.android.gms.internal.fido.zzh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class z extends c5.a {
    public static final Parcelable.Creator<z> CREATOR;

    /* renamed from: a, reason: collision with root package name */
    public final e0 f8307a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f8308b;

    /* renamed from: c, reason: collision with root package name */
    public final List f8309c;

    static {
        zzau.zzi(zzh.zza, zzh.zzb);
        CREATOR = new com.google.android.gms.common.api.y(29);
    }

    public z(String str, byte[] bArr, ArrayList arrayList) {
        w7.b.s(str);
        try {
            this.f8307a = e0.d(str);
            w7.b.s(bArr);
            this.f8308b = bArr;
            this.f8309c = arrayList;
        } catch (d0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (!this.f8307a.equals(zVar.f8307a) || !Arrays.equals(this.f8308b, zVar.f8308b)) {
            return false;
        }
        List list = this.f8309c;
        List list2 = zVar.f8309c;
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null || list2 == null || !list.containsAll(list2) || !list2.containsAll(list)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8307a, Integer.valueOf(Arrays.hashCode(this.f8308b)), this.f8309c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = p7.a0.t0(20293, parcel);
        this.f8307a.getClass();
        p7.a0.n0(parcel, 2, "public-key", false);
        p7.a0.f0(parcel, 3, this.f8308b, false);
        p7.a0.s0(parcel, 4, this.f8309c, false);
        p7.a0.u0(t02, parcel);
    }
}
