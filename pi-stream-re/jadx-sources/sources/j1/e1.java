package j1;

/* loaded from: classes.dex */
public final class e1 extends v1.l {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5716c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5717d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f5718e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(f1 f1Var, c1.e1 e1Var) {
        super(e1Var);
        this.f5718e = f1Var;
        this.f5717d = new c1.d1();
    }

    @Override // v1.l, c1.e1
    public final c1.c1 g(int i10, c1.c1 c1Var, boolean z9) {
        int i11 = this.f5716c;
        Object obj = this.f5717d;
        switch (i11) {
            case 0:
                c1.c1 g10 = super.g(i10, c1Var, z9);
                if (n(g10.f1643c, (c1.d1) obj).a()) {
                    Object obj2 = c1Var.f1641a;
                    Object obj3 = c1Var.f1642b;
                    int i12 = c1Var.f1643c;
                    long j4 = c1Var.f1644d;
                    long j10 = c1Var.f1645e;
                    c1.b bVar = c1.b.f1626c;
                    g10.f1641a = obj2;
                    g10.f1642b = obj3;
                    g10.f1643c = i12;
                    g10.f1644d = j4;
                    g10.f1645e = j10;
                    g10.f1647g = bVar;
                    g10.f1646f = true;
                } else {
                    g10.f1646f = true;
                }
                return g10;
            default:
                super.g(i10, c1Var, z9);
                c1Var.f1644d = ((long[]) obj)[i10];
                return c1Var;
        }
    }

    @Override // v1.l, c1.e1
    public final c1.d1 o(int i10, c1.d1 d1Var, long j4) {
        long j10;
        switch (this.f5716c) {
            case 1:
                super.o(i10, d1Var, j4);
                long j11 = ((long[]) this.f5718e)[i10];
                d1Var.f1668n = j11;
                if (j11 != -9223372036854775807L) {
                    long j12 = d1Var.f1667m;
                    if (j12 != -9223372036854775807L) {
                        j10 = Math.min(j12, j11);
                        d1Var.f1667m = j10;
                        return d1Var;
                    }
                }
                j10 = d1Var.f1667m;
                d1Var.f1667m = j10;
                return d1Var;
            default:
                return super.o(i10, d1Var, j4);
        }
    }
}
