package q;

import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i extends e {

    /* renamed from: d0, reason: collision with root package name */
    public float f8900d0 = -1.0f;

    /* renamed from: e0, reason: collision with root package name */
    public int f8901e0 = -1;

    /* renamed from: f0, reason: collision with root package name */
    public int f8902f0 = -1;

    /* renamed from: g0, reason: collision with root package name */
    public d f8903g0 = this.f8845y;

    /* renamed from: h0, reason: collision with root package name */
    public int f8904h0 = 0;

    public i() {
        this.G.clear();
        this.G.add(this.f8903g0);
        int length = this.F.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.F[i10] = this.f8903g0;
        }
    }

    @Override // q.e
    public final void B(p.e eVar) {
        if (this.I == null) {
            return;
        }
        d dVar = this.f8903g0;
        eVar.getClass();
        int m5 = p.e.m(dVar);
        if (this.f8904h0 == 1) {
            this.N = m5;
            this.O = 0;
            w(this.I.j());
            z(0);
            return;
        }
        this.N = 0;
        this.O = m5;
        z(this.I.m());
        w(0);
    }

    public final void C(int i10) {
        if (this.f8904h0 == i10) {
            return;
        }
        this.f8904h0 = i10;
        ArrayList arrayList = this.G;
        arrayList.clear();
        if (this.f8904h0 == 1) {
            this.f8903g0 = this.f8844x;
        } else {
            this.f8903g0 = this.f8845y;
        }
        arrayList.add(this.f8903g0);
        d[] dVarArr = this.F;
        int length = dVarArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            dVarArr[i11] = this.f8903g0;
        }
    }

    @Override // q.e
    public final void b(p.e eVar) {
        boolean z9;
        f fVar = (f) this.I;
        if (fVar == null) {
            return;
        }
        d h10 = fVar.h(c.LEFT);
        d h11 = fVar.h(c.RIGHT);
        e eVar2 = this.I;
        boolean z10 = true;
        if (eVar2 != null && eVar2.f8824c0[0] == 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f8904h0 == 0) {
            h10 = fVar.h(c.TOP);
            h11 = fVar.h(c.BOTTOM);
            e eVar3 = this.I;
            if (eVar3 == null || eVar3.f8824c0[1] != 2) {
                z10 = false;
            }
            z9 = z10;
        }
        if (this.f8901e0 != -1) {
            p.k j4 = eVar.j(this.f8903g0);
            eVar.e(j4, eVar.j(h10), this.f8901e0, 8);
            if (z9) {
                eVar.f(eVar.j(h11), j4, 0, 5);
                return;
            }
            return;
        }
        if (this.f8902f0 != -1) {
            p.k j10 = eVar.j(this.f8903g0);
            p.k j11 = eVar.j(h11);
            eVar.e(j10, j11, -this.f8902f0, 8);
            if (z9) {
                eVar.f(j10, eVar.j(h10), 0, 5);
                eVar.f(j11, j10, 0, 5);
                return;
            }
            return;
        }
        if (this.f8900d0 != -1.0f) {
            p.k j12 = eVar.j(this.f8903g0);
            p.k j13 = eVar.j(h11);
            float f10 = this.f8900d0;
            p.c k10 = eVar.k();
            k10.f8365d.d(j12, -1.0f);
            k10.f8365d.d(j13, f10);
            eVar.c(k10);
        }
    }

    @Override // q.e
    public final boolean c() {
        return true;
    }

    @Override // q.e
    public final d h(c cVar) {
        switch (cVar.ordinal()) {
            case 0:
            case 5:
            case 6:
            case zzaja.zze.zzg /* 7 */:
            case 8:
                return null;
            case 1:
            case 3:
                if (this.f8904h0 == 1) {
                    return this.f8903g0;
                }
                break;
            case 2:
            case 4:
                if (this.f8904h0 == 0) {
                    return this.f8903g0;
                }
                break;
        }
        throw new AssertionError(cVar.name());
    }
}
