package o5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a0 extends c5.a {
    public static final Parcelable.Creator<a0> CREATOR = new t0(0);

    /* renamed from: a, reason: collision with root package name */
    public final e0 f8193a;

    /* renamed from: b, reason: collision with root package name */
    public final r f8194b;

    public a0(String str, int i10) {
        w7.b.s(str);
        try {
            this.f8193a = e0.d(str);
            w7.b.s(Integer.valueOf(i10));
            try {
                this.f8194b = r.d(i10);
            } catch (q e10) {
                throw new IllegalArgumentException(e10);
            }
        } catch (d0 e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (!this.f8193a.equals(a0Var.f8193a) || !this.f8194b.equals(a0Var.f8194b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8193a, this.f8194b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = p7.a0.t0(20293, parcel);
        this.f8193a.getClass();
        p7.a0.n0(parcel, 2, "public-key", false);
        p7.a0.j0(parcel, 3, Integer.valueOf(this.f8194b.f8270a.a()));
        p7.a0.u0(t02, parcel);
    }
}
