package g2;

import d2.d0;
import d2.p;
import d2.q;
import d2.r;
import d2.t;

/* loaded from: classes.dex */
public final class a implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4339a;

    /* renamed from: b, reason: collision with root package name */
    public final p f4340b;

    public a(int i10, int i11) {
        this.f4339a = i10;
        if (i10 != 1) {
            this.f4340b = new d0(16973, 2, "image/bmp");
        } else {
            this.f4340b = new d0(35152, 2, "image/png");
        }
    }

    @Override // d2.p
    public final void a() {
        switch (this.f4339a) {
            case 0:
            case 1:
                return;
            default:
                this.f4340b.a();
                return;
        }
    }

    @Override // d2.p
    public final p c() {
        return this;
    }

    @Override // d2.p
    public final void e(long j4, long j10) {
        int i10 = this.f4339a;
        p pVar = this.f4340b;
        switch (i10) {
            case 0:
                ((d0) pVar).e(j4, j10);
                return;
            case 1:
                ((d0) pVar).e(j4, j10);
                return;
            default:
                pVar.e(j4, j10);
                return;
        }
    }

    @Override // d2.p
    public final void f(r rVar) {
        int i10 = this.f4339a;
        p pVar = this.f4340b;
        switch (i10) {
            case 0:
                ((d0) pVar).f(rVar);
                return;
            case 1:
                ((d0) pVar).f(rVar);
                return;
            default:
                pVar.f(rVar);
                return;
        }
    }

    @Override // d2.p
    public final boolean h(q qVar) {
        int i10 = this.f4339a;
        p pVar = this.f4340b;
        switch (i10) {
            case 0:
                return ((d0) pVar).h(qVar);
            case 1:
                return ((d0) pVar).h(qVar);
            default:
                return pVar.h(qVar);
        }
    }

    @Override // d2.p
    public final int i(q qVar, t tVar) {
        int i10 = this.f4339a;
        p pVar = this.f4340b;
        switch (i10) {
            case 0:
                return ((d0) pVar).i(qVar, tVar);
            case 1:
                return ((d0) pVar).i(qVar, tVar);
            default:
                return pVar.i(qVar, tVar);
        }
    }

    public a(int i10) {
        this.f4339a = 2;
        if ((i10 & 1) != 0) {
            this.f4340b = new d0(65496, 2, "image/jpeg");
        } else {
            this.f4340b = new k2.a();
        }
    }
}
