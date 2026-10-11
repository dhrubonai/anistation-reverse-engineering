package j2;

import d2.d0;
import d2.p;
import d2.q;
import d2.r;
import f1.t;

/* loaded from: classes.dex */
public final class a implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5938a;

    /* renamed from: b, reason: collision with root package name */
    public final t f5939b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f5940c;

    public a(int i10) {
        this.f5938a = i10;
        if (i10 != 1) {
            this.f5939b = new t(4);
            this.f5940c = new d0(-1, -1, "image/heif");
        } else {
            this.f5939b = new t(4);
            this.f5940c = new d0(-1, -1, "image/webp");
        }
    }

    @Override // d2.p
    public final void a() {
    }

    @Override // d2.p
    public final p c() {
        return this;
    }

    @Override // d2.p
    public final void e(long j4, long j10) {
        int i10 = this.f5938a;
        d0 d0Var = this.f5940c;
        switch (i10) {
            case 0:
                d0Var.e(j4, j10);
                return;
            default:
                d0Var.e(j4, j10);
                return;
        }
    }

    @Override // d2.p
    public final void f(r rVar) {
        int i10 = this.f5938a;
        d0 d0Var = this.f5940c;
        switch (i10) {
            case 0:
                d0Var.f(rVar);
                return;
            default:
                d0Var.f(rVar);
                return;
        }
    }

    @Override // d2.p
    public final boolean h(q qVar) {
        boolean z9;
        boolean z10;
        t tVar = this.f5939b;
        boolean z11 = true;
        switch (this.f5938a) {
            case 0:
                qVar.o(4);
                tVar.D(4);
                qVar.n(tVar.f3858a, 0, 4);
                if (tVar.w() == 1718909296) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    tVar.D(4);
                    qVar.n(tVar.f3858a, 0, 4);
                    if (tVar.w() == 1751476579) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        return true;
                    }
                }
                return false;
            default:
                tVar.D(4);
                qVar.n(tVar.f3858a, 0, 4);
                if (tVar.w() != 1380533830) {
                    return false;
                }
                qVar.o(4);
                tVar.D(4);
                qVar.n(tVar.f3858a, 0, 4);
                if (tVar.w() != 1464156752) {
                    z11 = false;
                }
                return z11;
        }
    }

    @Override // d2.p
    public final int i(q qVar, d2.t tVar) {
        int i10 = this.f5938a;
        d0 d0Var = this.f5940c;
        switch (i10) {
            case 0:
                return d0Var.i(qVar, tVar);
            default:
                return d0Var.i(qVar, tVar);
        }
    }
}
