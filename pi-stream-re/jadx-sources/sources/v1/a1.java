package v1;

/* loaded from: classes.dex */
public final class a1 implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public int f10362a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10363b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c1 f10364c;

    public a1(c1 c1Var) {
        this.f10364c = c1Var;
    }

    @Override // v1.v0
    public final boolean a() {
        return this.f10364c.C;
    }

    @Override // v1.v0
    public final void b() {
        c1 c1Var = this.f10364c;
        if (!c1Var.B) {
            c1Var.f10383z.b();
        }
    }

    public final void c() {
        if (!this.f10363b) {
            c1 c1Var = this.f10364c;
            c1Var.f10379e.a(c1.q0.i(c1Var.A.f1935m), c1Var.A, 0, null, 0L);
            this.f10363b = true;
        }
    }

    @Override // v1.v0
    public final int g(androidx.appcompat.widget.a0 a0Var, i1.h hVar, int i10) {
        c();
        c1 c1Var = this.f10364c;
        boolean z9 = c1Var.C;
        if (z9 && c1Var.D == null) {
            this.f10362a = 2;
        }
        int i11 = this.f10362a;
        if (i11 == 2) {
            hVar.e(4);
            return -4;
        }
        if ((i10 & 2) == 0 && i11 != 0) {
            if (!z9) {
                return -3;
            }
            c1Var.D.getClass();
            hVar.e(1);
            hVar.f5264x = 0L;
            if ((i10 & 4) == 0) {
                hVar.j(c1Var.E);
                hVar.f5262e.put(c1Var.D, 0, c1Var.E);
            }
            if ((i10 & 1) == 0) {
                this.f10362a = 2;
            }
            return -4;
        }
        a0Var.f404c = c1Var.A;
        this.f10362a = 1;
        return -5;
    }

    @Override // v1.v0
    public final int i(long j4) {
        c();
        if (j4 > 0 && this.f10362a != 2) {
            this.f10362a = 2;
            return 1;
        }
        return 0;
    }
}
