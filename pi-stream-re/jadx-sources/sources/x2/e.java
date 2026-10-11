package x2;

import c1.r0;
import d2.p;
import d2.q;
import d2.r;
import f1.b0;
import f1.t;

/* loaded from: classes.dex */
public final class e implements p {

    /* renamed from: a, reason: collision with root package name */
    public r f11100a;

    /* renamed from: b, reason: collision with root package name */
    public j f11101b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11102c;

    @Override // d2.p
    public final void a() {
    }

    public final boolean b(q qVar) {
        boolean z9;
        boolean z10;
        g gVar = new g();
        if (gVar.a(qVar, true) && (gVar.f11108a & 2) == 2) {
            int min = Math.min(gVar.f11112e, 8);
            t tVar = new t(min);
            qVar.n(tVar.f3858a, 0, min);
            tVar.G(0);
            if (tVar.f3860c - tVar.f3859b >= 5 && tVar.v() == 127 && tVar.w() == 1179402563) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                this.f11101b = new d();
            } else {
                tVar.G(0);
                try {
                    z10 = q6.g.r0(1, tVar, true);
                } catch (r0 unused) {
                    z10 = false;
                }
                if (z10) {
                    this.f11101b = new l();
                } else {
                    tVar.G(0);
                    if (i.e(tVar, i.o)) {
                        this.f11101b = new i();
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // d2.p
    public final p c() {
        return this;
    }

    @Override // d2.p
    public final void e(long j4, long j10) {
        j jVar = this.f11101b;
        if (jVar != null) {
            f fVar = jVar.f11117a;
            g gVar = fVar.f11103a;
            gVar.f11108a = 0;
            gVar.f11109b = 0L;
            gVar.f11110c = 0;
            gVar.f11111d = 0;
            gVar.f11112e = 0;
            fVar.f11104b.D(0);
            fVar.f11105c = -1;
            fVar.f11107e = false;
            if (j4 == 0) {
                jVar.d(!jVar.f11128l);
                return;
            }
            if (jVar.f11124h != 0) {
                long j11 = (jVar.f11125i * j10) / 1000000;
                jVar.f11121e = j11;
                h hVar = jVar.f11120d;
                int i10 = b0.f3799a;
                hVar.t(j11);
                jVar.f11124h = 2;
            }
        }
    }

    @Override // d2.p
    public final void f(r rVar) {
        this.f11100a = rVar;
    }

    @Override // d2.p
    public final boolean h(q qVar) {
        try {
            return b(qVar);
        } catch (r0 unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x017e  */
    @Override // d2.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(d2.q r21, d2.t r22) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.e.i(d2.q, d2.t):int");
    }
}
