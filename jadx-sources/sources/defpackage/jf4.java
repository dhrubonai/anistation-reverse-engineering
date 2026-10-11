package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jf4 extends fg4 {
    public static final jf4 d;
    public static final jf4 e;
    public static final jf4 f;
    public static final jf4 g;
    public final /* synthetic */ byte c;

    static {
        int i = 1;
        d = new jf4(i, 2, (byte) 0);
        int i2 = 1;
        e = new jf4(i2, i2, (byte) 1);
        f = new jf4(i, 2, (byte) 2);
        int i3 = 1;
        g = new jf4(i3, i3, (byte) 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jf4(int i, int i2, byte b) {
        super(i, i2);
        this.c = b;
    }

    @Override // defpackage.fg4
    public final void a(fm0 fm0Var, nr nrVar, bs5 bs5Var, b25 b25Var, gg4 gg4Var) {
        switch (this.c) {
            case 0:
                Object invoke = ((sb2) fm0Var.h(0)).invoke();
                ed2 ed2Var = (ed2) fm0Var.h(1);
                int f2 = fm0Var.f(0);
                ed2Var.getClass();
                bs5Var.W(bs5Var.c(ed2Var), invoke);
                nrVar.q(f2, invoke);
                nrVar.j(invoke);
                return;
            case 1:
                ed2 ed2Var2 = (ed2) fm0Var.h(0);
                int f3 = fm0Var.f(0);
                nrVar.p();
                ed2Var2.getClass();
                nrVar.i(f3, bs5Var.D(bs5Var.c(ed2Var2)));
                return;
            case 2:
                Object h = fm0Var.h(0);
                ed2 ed2Var3 = (ed2) fm0Var.h(1);
                int f4 = fm0Var.f(0);
                if (h instanceof od2) {
                    od2 od2Var = (od2) h;
                    ((z44) b25Var.d).b(od2Var);
                    ((q44) b25Var.g).a(od2Var);
                }
                Object L = bs5Var.L(bs5Var.c(ed2Var3), f4, h);
                if (L instanceof od2) {
                    b25Var.f((od2) L);
                    return;
                } else {
                    if (L instanceof zz4) {
                        ((zz4) L).c();
                        return;
                    }
                    return;
                }
            default:
                Object h2 = fm0Var.h(0);
                int f5 = fm0Var.f(0);
                if (h2 instanceof od2) {
                    od2 od2Var2 = (od2) h2;
                    ((z44) b25Var.d).b(od2Var2);
                    ((q44) b25Var.g).a(od2Var2);
                }
                Object L2 = bs5Var.L(bs5Var.t, f5, h2);
                if (L2 instanceof od2) {
                    b25Var.f((od2) L2);
                    return;
                } else {
                    if (L2 instanceof zz4) {
                        ((zz4) L2).c();
                        return;
                    }
                    return;
                }
        }
    }

    @Override // defpackage.fg4
    public ed2 b(fm0 fm0Var) {
        switch (this.c) {
            case 0:
                return (ed2) fm0Var.h(1);
            case 1:
                return (ed2) fm0Var.h(0);
            default:
                return super.b(fm0Var);
        }
    }
}
