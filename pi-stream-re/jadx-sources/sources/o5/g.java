package o5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g extends c5.a {
    public static final Parcelable.Creator<g> CREATOR = new t0(13);

    /* renamed from: a, reason: collision with root package name */
    public final n0 f8227a;

    /* renamed from: b, reason: collision with root package name */
    public final w0 f8228b;

    /* renamed from: c, reason: collision with root package name */
    public final h f8229c;

    /* renamed from: d, reason: collision with root package name */
    public final x0 f8230d;

    public g(n0 n0Var, w0 w0Var, h hVar, x0 x0Var) {
        this.f8227a = n0Var;
        this.f8228b = w0Var;
        this.f8229c = hVar;
        this.f8230d = x0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!p7.a0.q(this.f8227a, gVar.f8227a) || !p7.a0.q(this.f8228b, gVar.f8228b) || !p7.a0.q(this.f8229c, gVar.f8229c) || !p7.a0.q(this.f8230d, gVar.f8230d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8227a, this.f8228b, this.f8229c, this.f8230d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = p7.a0.t0(20293, parcel);
        p7.a0.m0(parcel, 1, this.f8227a, i10, false);
        p7.a0.m0(parcel, 2, this.f8228b, i10, false);
        p7.a0.m0(parcel, 3, this.f8229c, i10, false);
        p7.a0.m0(parcel, 4, this.f8230d, i10, false);
        p7.a0.u0(t02, parcel);
    }
}
