package w1;

import c1.v;
import d2.f0;
import d2.g0;
import f1.b0;
import f1.t;

/* loaded from: classes.dex */
public final class d implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f10751a;

    /* renamed from: b, reason: collision with root package name */
    public final v f10752b;

    /* renamed from: c, reason: collision with root package name */
    public final d2.o f10753c = new d2.o();

    /* renamed from: d, reason: collision with root package name */
    public v f10754d;

    /* renamed from: e, reason: collision with root package name */
    public g0 f10755e;

    /* renamed from: f, reason: collision with root package name */
    public long f10756f;

    public d(int i10, int i11, v vVar) {
        this.f10751a = i11;
        this.f10752b = vVar;
    }

    @Override // d2.g0
    public final int a(c1.l lVar, int i10, boolean z9) {
        g0 g0Var = this.f10755e;
        int i11 = b0.f3799a;
        return g0Var.c(lVar, i10, z9);
    }

    @Override // d2.g0
    public final void b(v vVar) {
        v vVar2 = this.f10752b;
        if (vVar2 != null) {
            vVar = vVar.d(vVar2);
        }
        this.f10754d = vVar;
        g0 g0Var = this.f10755e;
        int i10 = b0.f3799a;
        g0Var.b(vVar);
    }

    @Override // d2.g0
    public final int c(c1.l lVar, int i10, boolean z9) {
        return a(lVar, i10, z9);
    }

    @Override // d2.g0
    public final void d(long j4, int i10, int i11, int i12, f0 f0Var) {
        long j10 = this.f10756f;
        if (j10 != -9223372036854775807L && j4 >= j10) {
            this.f10755e = this.f10753c;
        }
        g0 g0Var = this.f10755e;
        int i13 = b0.f3799a;
        g0Var.d(j4, i10, i11, i12, f0Var);
    }

    @Override // d2.g0
    public final void e(int i10, int i11, t tVar) {
        g0 g0Var = this.f10755e;
        int i12 = b0.f3799a;
        g0Var.f(i10, tVar);
    }

    @Override // d2.g0
    public final void f(int i10, t tVar) {
        e(i10, 0, tVar);
    }

    public final void g(g gVar, long j4) {
        if (gVar == null) {
            this.f10755e = this.f10753c;
            return;
        }
        this.f10756f = j4;
        g0 a10 = ((c) gVar).a(this.f10751a);
        this.f10755e = a10;
        v vVar = this.f10754d;
        if (vVar != null) {
            a10.b(vVar);
        }
    }
}
