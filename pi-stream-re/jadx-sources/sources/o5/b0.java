package o5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class b0 extends l {
    public static final Parcelable.Creator<b0> CREATOR = new t0(1);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f8196a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f8197b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8198c;

    /* renamed from: d, reason: collision with root package name */
    public final List f8199d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f8200e;

    /* renamed from: f, reason: collision with root package name */
    public final l0 f8201f;

    /* renamed from: x, reason: collision with root package name */
    public final v0 f8202x;

    /* renamed from: y, reason: collision with root package name */
    public final f f8203y;

    /* renamed from: z, reason: collision with root package name */
    public final Long f8204z;

    public b0(byte[] bArr, Double d10, String str, ArrayList arrayList, Integer num, l0 l0Var, String str2, f fVar, Long l10) {
        w7.b.s(bArr);
        this.f8196a = bArr;
        this.f8197b = d10;
        w7.b.s(str);
        this.f8198c = str;
        this.f8199d = arrayList;
        this.f8200e = num;
        this.f8201f = l0Var;
        this.f8204z = l10;
        if (str2 != null) {
            try {
                this.f8202x = v0.d(str2);
            } catch (u0 e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            this.f8202x = null;
        }
        this.f8203y = fVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (Arrays.equals(this.f8196a, b0Var.f8196a) && p7.a0.q(this.f8197b, b0Var.f8197b) && p7.a0.q(this.f8198c, b0Var.f8198c)) {
            List list = this.f8199d;
            List list2 = b0Var.f8199d;
            if (((list == null && list2 == null) || (list != null && list2 != null && list.containsAll(list2) && list2.containsAll(list))) && p7.a0.q(this.f8200e, b0Var.f8200e) && p7.a0.q(this.f8201f, b0Var.f8201f) && p7.a0.q(this.f8202x, b0Var.f8202x) && p7.a0.q(this.f8203y, b0Var.f8203y) && p7.a0.q(this.f8204z, b0Var.f8204z)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f8196a)), this.f8197b, this.f8198c, this.f8199d, this.f8200e, this.f8201f, this.f8202x, this.f8203y, this.f8204z});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str;
        int t02 = p7.a0.t0(20293, parcel);
        p7.a0.f0(parcel, 2, this.f8196a, false);
        p7.a0.g0(parcel, 3, this.f8197b);
        p7.a0.n0(parcel, 4, this.f8198c, false);
        p7.a0.s0(parcel, 5, this.f8199d, false);
        p7.a0.j0(parcel, 6, this.f8200e);
        p7.a0.m0(parcel, 7, this.f8201f, i10, false);
        v0 v0Var = this.f8202x;
        if (v0Var == null) {
            str = null;
        } else {
            str = v0Var.f8280a;
        }
        p7.a0.n0(parcel, 8, str, false);
        p7.a0.m0(parcel, 9, this.f8203y, i10, false);
        p7.a0.l0(parcel, 10, this.f8204z);
        p7.a0.u0(t02, parcel);
    }
}
