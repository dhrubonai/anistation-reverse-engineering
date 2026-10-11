package w4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p7.a0;

/* loaded from: classes.dex */
public final class f extends c5.a {
    public static final Parcelable.Creator<f> CREATOR = new v4.b(6);

    /* renamed from: a, reason: collision with root package name */
    public final e f10963a;

    /* renamed from: b, reason: collision with root package name */
    public final b f10964b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10965c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10966d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10967e;

    /* renamed from: f, reason: collision with root package name */
    public final d f10968f;

    /* renamed from: x, reason: collision with root package name */
    public final c f10969x;

    public f(e eVar, b bVar, String str, boolean z9, int i10, d dVar, c cVar) {
        w7.b.s(eVar);
        this.f10963a = eVar;
        w7.b.s(bVar);
        this.f10964b = bVar;
        this.f10965c = str;
        this.f10966d = z9;
        this.f10967e = i10;
        this.f10968f = dVar == null ? new d(false, null, null) : dVar;
        if (cVar == null) {
            c1.r rVar = new c1.r(5);
            rVar.f1885a = false;
            cVar = new c((String) rVar.f1886b, false);
        }
        this.f10969x = cVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!a0.q(this.f10963a, fVar.f10963a) || !a0.q(this.f10964b, fVar.f10964b) || !a0.q(this.f10968f, fVar.f10968f) || !a0.q(this.f10969x, fVar.f10969x) || !a0.q(this.f10965c, fVar.f10965c) || this.f10966d != fVar.f10966d || this.f10967e != fVar.f10967e) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10963a, this.f10964b, this.f10968f, this.f10969x, this.f10965c, Boolean.valueOf(this.f10966d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.m0(parcel, 1, this.f10963a, i10, false);
        a0.m0(parcel, 2, this.f10964b, i10, false);
        a0.n0(parcel, 3, this.f10965c, false);
        a0.d0(parcel, 4, this.f10966d);
        a0.h0(parcel, 5, this.f10967e);
        a0.m0(parcel, 6, this.f10968f, i10, false);
        a0.m0(parcel, 7, this.f10969x, i10, false);
        a0.u0(t02, parcel);
    }
}
