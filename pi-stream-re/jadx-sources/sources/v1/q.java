package v1;

/* loaded from: classes.dex */
public final class q extends c1.e1 {

    /* renamed from: b, reason: collision with root package name */
    public final c1.k0 f10506b;

    public q(c1.k0 k0Var) {
        this.f10506b = k0Var;
    }

    @Override // c1.e1
    public final int b(Object obj) {
        if (obj == p.f10499e) {
            return 0;
        }
        return -1;
    }

    @Override // c1.e1
    public final c1.c1 g(int i10, c1.c1 c1Var, boolean z9) {
        Integer num;
        Object obj = null;
        if (z9) {
            num = 0;
        } else {
            num = null;
        }
        if (z9) {
            obj = p.f10499e;
        }
        c1.b bVar = c1.b.f1626c;
        c1Var.getClass();
        c1.b bVar2 = c1.b.f1626c;
        c1Var.f1641a = num;
        c1Var.f1642b = obj;
        c1Var.f1643c = 0;
        c1Var.f1644d = -9223372036854775807L;
        c1Var.f1645e = 0L;
        c1Var.f1647g = bVar2;
        c1Var.f1646f = true;
        return c1Var;
    }

    @Override // c1.e1
    public final int i() {
        return 1;
    }

    @Override // c1.e1
    public final Object m(int i10) {
        return p.f10499e;
    }

    @Override // c1.e1
    public final c1.d1 o(int i10, c1.d1 d1Var, long j4) {
        Object obj = c1.d1.f1653r;
        d1Var.b(this.f10506b, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0L);
        d1Var.f1666l = true;
        return d1Var;
    }

    @Override // c1.e1
    public final int p() {
        return 1;
    }
}
