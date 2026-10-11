package o5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class y extends l {
    public static final Parcelable.Creator<y> CREATOR = new com.google.android.gms.common.api.y(27);
    public final e A;
    public final f B;

    /* renamed from: a, reason: collision with root package name */
    public final c0 f8294a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f8295b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f8296c;

    /* renamed from: d, reason: collision with root package name */
    public final List f8297d;

    /* renamed from: e, reason: collision with root package name */
    public final Double f8298e;

    /* renamed from: f, reason: collision with root package name */
    public final List f8299f;

    /* renamed from: x, reason: collision with root package name */
    public final m f8300x;

    /* renamed from: y, reason: collision with root package name */
    public final Integer f8301y;

    /* renamed from: z, reason: collision with root package name */
    public final l0 f8302z;

    public y(c0 c0Var, f0 f0Var, byte[] bArr, ArrayList arrayList, Double d10, ArrayList arrayList2, m mVar, Integer num, l0 l0Var, String str, f fVar) {
        w7.b.s(c0Var);
        this.f8294a = c0Var;
        w7.b.s(f0Var);
        this.f8295b = f0Var;
        w7.b.s(bArr);
        this.f8296c = bArr;
        w7.b.s(arrayList);
        this.f8297d = arrayList;
        this.f8298e = d10;
        this.f8299f = arrayList2;
        this.f8300x = mVar;
        this.f8301y = num;
        this.f8302z = l0Var;
        if (str != null) {
            try {
                for (e eVar : e.values()) {
                    if (str.equals(eVar.f8212a)) {
                        this.A = eVar;
                    }
                }
                throw new d(str);
            } catch (d e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        this.A = null;
        this.B = fVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (p7.a0.q(this.f8294a, yVar.f8294a) && p7.a0.q(this.f8295b, yVar.f8295b) && Arrays.equals(this.f8296c, yVar.f8296c) && p7.a0.q(this.f8298e, yVar.f8298e)) {
            List list = this.f8297d;
            List list2 = yVar.f8297d;
            if (list.containsAll(list2) && list2.containsAll(list)) {
                List list3 = this.f8299f;
                List list4 = yVar.f8299f;
                if (((list3 == null && list4 == null) || (list3 != null && list4 != null && list3.containsAll(list4) && list4.containsAll(list3))) && p7.a0.q(this.f8300x, yVar.f8300x) && p7.a0.q(this.f8301y, yVar.f8301y) && p7.a0.q(this.f8302z, yVar.f8302z) && p7.a0.q(this.A, yVar.A) && p7.a0.q(this.B, yVar.B)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8294a, this.f8295b, Integer.valueOf(Arrays.hashCode(this.f8296c)), this.f8297d, this.f8298e, this.f8299f, this.f8300x, this.f8301y, this.f8302z, this.A, this.B});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str;
        int t02 = p7.a0.t0(20293, parcel);
        p7.a0.m0(parcel, 2, this.f8294a, i10, false);
        p7.a0.m0(parcel, 3, this.f8295b, i10, false);
        p7.a0.f0(parcel, 4, this.f8296c, false);
        p7.a0.s0(parcel, 5, this.f8297d, false);
        p7.a0.g0(parcel, 6, this.f8298e);
        p7.a0.s0(parcel, 7, this.f8299f, false);
        p7.a0.m0(parcel, 8, this.f8300x, i10, false);
        p7.a0.j0(parcel, 9, this.f8301y);
        p7.a0.m0(parcel, 10, this.f8302z, i10, false);
        e eVar = this.A;
        if (eVar == null) {
            str = null;
        } else {
            str = eVar.f8212a;
        }
        p7.a0.n0(parcel, 11, str, false);
        p7.a0.m0(parcel, 12, this.B, i10, false);
        p7.a0.u0(t02, parcel);
    }
}
