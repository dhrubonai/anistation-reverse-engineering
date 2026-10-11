package j1;

/* loaded from: classes.dex */
public final class k implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final k1 f5811a;

    /* renamed from: b, reason: collision with root package name */
    public final j f5812b;

    /* renamed from: c, reason: collision with root package name */
    public g1 f5813c;

    /* renamed from: d, reason: collision with root package name */
    public o0 f5814d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5815e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5816f;

    public k(j jVar, f1.a aVar) {
        this.f5812b = jVar;
        this.f5811a = new k1(aVar);
    }

    @Override // j1.o0
    public final boolean c() {
        if (this.f5815e) {
            this.f5811a.getClass();
            return false;
        }
        o0 o0Var = this.f5814d;
        o0Var.getClass();
        return o0Var.c();
    }

    @Override // j1.o0
    public final c1.t0 h() {
        o0 o0Var = this.f5814d;
        if (o0Var != null) {
            return o0Var.h();
        }
        return this.f5811a.f5821e;
    }

    @Override // j1.o0
    public final void j(c1.t0 t0Var) {
        o0 o0Var = this.f5814d;
        if (o0Var != null) {
            o0Var.j(t0Var);
            t0Var = this.f5814d.h();
        }
        this.f5811a.j(t0Var);
    }

    @Override // j1.o0
    public final long k() {
        if (this.f5815e) {
            return this.f5811a.k();
        }
        o0 o0Var = this.f5814d;
        o0Var.getClass();
        return o0Var.k();
    }
}
