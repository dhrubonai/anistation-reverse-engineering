package v1;

/* loaded from: classes.dex */
public final class n0 extends l {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10480c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final Object f10481d;

    public n0(c1.e1 e1Var, c1.k0 k0Var) {
        super(e1Var);
        this.f10481d = k0Var;
    }

    @Override // v1.l, c1.e1
    public final c1.c1 g(int i10, c1.c1 c1Var, boolean z9) {
        switch (this.f10480c) {
            case 0:
                super.g(i10, c1Var, z9);
                c1Var.f1646f = true;
                return c1Var;
            default:
                return super.g(i10, c1Var, z9);
        }
    }

    @Override // v1.l, c1.e1
    public final c1.d1 o(int i10, c1.d1 d1Var, long j4) {
        Object obj;
        switch (this.f10480c) {
            case 0:
                super.o(i10, d1Var, j4);
                d1Var.f1666l = true;
                return d1Var;
            default:
                super.o(i10, d1Var, j4);
                c1.k0 k0Var = (c1.k0) this.f10481d;
                d1Var.f1657c = k0Var;
                c1.f0 f0Var = k0Var.f1769b;
                if (f0Var != null) {
                    obj = f0Var.f1688g;
                } else {
                    obj = null;
                }
                d1Var.f1656b = obj;
                return d1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(o0 o0Var, z0 z0Var) {
        super(z0Var);
        this.f10481d = o0Var;
    }
}
