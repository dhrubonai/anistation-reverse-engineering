package v1;

/* loaded from: classes.dex */
public final class e1 implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final v0 f10411a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10412b;

    public e1(v0 v0Var, long j4) {
        this.f10411a = v0Var;
        this.f10412b = j4;
    }

    @Override // v1.v0
    public final boolean a() {
        return this.f10411a.a();
    }

    @Override // v1.v0
    public final void b() {
        this.f10411a.b();
    }

    @Override // v1.v0
    public final int g(androidx.appcompat.widget.a0 a0Var, i1.h hVar, int i10) {
        int g10 = this.f10411a.g(a0Var, hVar, i10);
        if (g10 == -4) {
            hVar.f5264x += this.f10412b;
        }
        return g10;
    }

    @Override // v1.v0
    public final int i(long j4) {
        return this.f10411a.i(j4 - this.f10412b);
    }
}
