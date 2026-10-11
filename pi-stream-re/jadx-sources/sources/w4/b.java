package w4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import p7.a0;

/* loaded from: classes.dex */
public final class b extends c5.a {
    public static final Parcelable.Creator<b> CREATOR = new v4.b(10);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10950a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10951b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10952c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10953d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10954e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f10955f;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f10956x;

    public b(boolean z9, String str, String str2, boolean z10, String str3, ArrayList arrayList, boolean z11) {
        boolean z12;
        ArrayList arrayList2;
        if (z10 && z11) {
            z12 = false;
        } else {
            z12 = true;
        }
        w7.b.i("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z12);
        this.f10950a = z9;
        if (z9 && str == null) {
            throw new NullPointerException("serverClientId must be provided if Google ID tokens are requested");
        }
        this.f10951b = str;
        this.f10952c = str2;
        this.f10953d = z10;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2);
        } else {
            arrayList2 = null;
        }
        this.f10955f = arrayList2;
        this.f10954e = str3;
        this.f10956x = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f10950a != bVar.f10950a || !a0.q(this.f10951b, bVar.f10951b) || !a0.q(this.f10952c, bVar.f10952c) || this.f10953d != bVar.f10953d || !a0.q(this.f10954e, bVar.f10954e) || !a0.q(this.f10955f, bVar.f10955f) || this.f10956x != bVar.f10956x) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f10950a), this.f10951b, this.f10952c, Boolean.valueOf(this.f10953d), this.f10954e, this.f10955f, Boolean.valueOf(this.f10956x)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.d0(parcel, 1, this.f10950a);
        a0.n0(parcel, 2, this.f10951b, false);
        a0.n0(parcel, 3, this.f10952c, false);
        a0.d0(parcel, 4, this.f10953d);
        a0.n0(parcel, 5, this.f10954e, false);
        a0.p0(parcel, 6, this.f10955f);
        a0.d0(parcel, 7, this.f10956x);
        a0.u0(t02, parcel);
    }
}
