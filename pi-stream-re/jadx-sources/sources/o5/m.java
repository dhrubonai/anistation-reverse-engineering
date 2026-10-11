package o5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class m extends c5.a {
    public static final Parcelable.Creator<m> CREATOR = new t0(21);

    /* renamed from: a, reason: collision with root package name */
    public final c f8253a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f8254b;

    /* renamed from: c, reason: collision with root package name */
    public final v0 f8255c;

    /* renamed from: d, reason: collision with root package name */
    public final i0 f8256d;

    public m(String str, Boolean bool, String str2, String str3) {
        c cVar;
        v0 d10;
        i0 i0Var = null;
        if (str == null) {
            cVar = null;
        } else {
            try {
                c[] values = c.values();
                int length = values.length;
                for (int i10 = 0; i10 < length; i10++) {
                    cVar = values[i10];
                    if (!str.equals(cVar.f8207a)) {
                    }
                }
                throw new b(str);
            } catch (b e10) {
                e = e10;
                throw new IllegalArgumentException(e);
            } catch (h0 e11) {
                e = e11;
                throw new IllegalArgumentException(e);
            } catch (u0 e12) {
                e = e12;
                throw new IllegalArgumentException(e);
            }
        }
        this.f8253a = cVar;
        this.f8254b = bool;
        if (str2 == null) {
            d10 = null;
        } else {
            d10 = v0.d(str2);
        }
        this.f8255c = d10;
        if (str3 != null) {
            i0[] values2 = i0.values();
            int length2 = values2.length;
            for (int i11 = 0; i11 < length2; i11++) {
                i0Var = values2[i11];
                if (!str3.equals(i0Var.f8241a)) {
                }
            }
            throw new h0(str3);
        }
        this.f8256d = i0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (!p7.a0.q(this.f8253a, mVar.f8253a) || !p7.a0.q(this.f8254b, mVar.f8254b) || !p7.a0.q(this.f8255c, mVar.f8255c) || !p7.a0.q(this.f8256d, mVar.f8256d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8253a, this.f8254b, this.f8255c, this.f8256d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str;
        String str2;
        int t02 = p7.a0.t0(20293, parcel);
        String str3 = null;
        c cVar = this.f8253a;
        if (cVar == null) {
            str = null;
        } else {
            str = cVar.f8207a;
        }
        p7.a0.n0(parcel, 2, str, false);
        Boolean bool = this.f8254b;
        if (bool != null) {
            parcel.writeInt(262147);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        v0 v0Var = this.f8255c;
        if (v0Var == null) {
            str2 = null;
        } else {
            str2 = v0Var.f8280a;
        }
        p7.a0.n0(parcel, 4, str2, false);
        i0 i0Var = this.f8256d;
        if (i0Var != null) {
            str3 = i0Var.f8241a;
        }
        p7.a0.n0(parcel, 5, str3, false);
        p7.a0.u0(t02, parcel);
    }
}
