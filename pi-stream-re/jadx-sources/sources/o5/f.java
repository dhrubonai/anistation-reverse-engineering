package o5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class f extends c5.a {
    public static final Parcelable.Creator<f> CREATOR = new t0(14);
    public final s0 A;

    /* renamed from: a, reason: collision with root package name */
    public final v f8214a;

    /* renamed from: b, reason: collision with root package name */
    public final z0 f8215b;

    /* renamed from: c, reason: collision with root package name */
    public final m0 f8216c;

    /* renamed from: d, reason: collision with root package name */
    public final b1 f8217d;

    /* renamed from: e, reason: collision with root package name */
    public final p0 f8218e;

    /* renamed from: f, reason: collision with root package name */
    public final q0 f8219f;

    /* renamed from: x, reason: collision with root package name */
    public final a1 f8220x;

    /* renamed from: y, reason: collision with root package name */
    public final r0 f8221y;

    /* renamed from: z, reason: collision with root package name */
    public final w f8222z;

    public f(v vVar, z0 z0Var, m0 m0Var, b1 b1Var, p0 p0Var, q0 q0Var, a1 a1Var, r0 r0Var, w wVar, s0 s0Var) {
        this.f8214a = vVar;
        this.f8216c = m0Var;
        this.f8215b = z0Var;
        this.f8217d = b1Var;
        this.f8218e = p0Var;
        this.f8219f = q0Var;
        this.f8220x = a1Var;
        this.f8221y = r0Var;
        this.f8222z = wVar;
        this.A = s0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!p7.a0.q(this.f8214a, fVar.f8214a) || !p7.a0.q(this.f8215b, fVar.f8215b) || !p7.a0.q(this.f8216c, fVar.f8216c) || !p7.a0.q(this.f8217d, fVar.f8217d) || !p7.a0.q(this.f8218e, fVar.f8218e) || !p7.a0.q(this.f8219f, fVar.f8219f) || !p7.a0.q(this.f8220x, fVar.f8220x) || !p7.a0.q(this.f8221y, fVar.f8221y) || !p7.a0.q(this.f8222z, fVar.f8222z) || !p7.a0.q(this.A, fVar.A)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8214a, this.f8215b, this.f8216c, this.f8217d, this.f8218e, this.f8219f, this.f8220x, this.f8221y, this.f8222z, this.A});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = p7.a0.t0(20293, parcel);
        p7.a0.m0(parcel, 2, this.f8214a, i10, false);
        p7.a0.m0(parcel, 3, this.f8215b, i10, false);
        p7.a0.m0(parcel, 4, this.f8216c, i10, false);
        p7.a0.m0(parcel, 5, this.f8217d, i10, false);
        p7.a0.m0(parcel, 6, this.f8218e, i10, false);
        p7.a0.m0(parcel, 7, this.f8219f, i10, false);
        p7.a0.m0(parcel, 8, this.f8220x, i10, false);
        p7.a0.m0(parcel, 9, this.f8221y, i10, false);
        p7.a0.m0(parcel, 10, this.f8222z, i10, false);
        p7.a0.m0(parcel, 11, this.A, i10, false);
        p7.a0.u0(t02, parcel);
    }
}
