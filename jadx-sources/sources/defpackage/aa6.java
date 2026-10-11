package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class aa6 implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ fa6 y;

    public /* synthetic */ aa6(fa6 fa6Var, byte b) {
        this.x = b;
        this.y = fa6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v20, types: [n13, bn1, java.lang.Object] */
    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        boolean z = false;
        byte b2 = 1;
        pn6 pn6Var = pn6.a;
        fa6 fa6Var = this.y;
        switch (b) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean z2 = fa6Var.Q;
                if (booleanValue) {
                    if (((rz2) ((tz2) ((sz2) t80.C(fa6Var, bv0.m))).a.getValue()).a != 1) {
                        fa6Var.P.v(false);
                    }
                    if (z2) {
                        fa6Var.i1(false);
                    }
                } else {
                    fa6Var.d1();
                    gi6 gi6Var = fa6Var.N;
                    ic6 ic6Var = gi6Var.a;
                    ic6Var.b.a().n();
                    o96 o96Var = ic6Var.b;
                    o96Var.f(null);
                    gi6Var.l(o96Var);
                    ic6Var.b(true, ia6.x);
                    ic6Var.f(true);
                    ic6Var.e(ic6Var.b.A);
                    fa6Var.N.a();
                }
                h98.I(fa6Var, new z96(fa6Var, b2));
                return pn6Var;
            case 1:
                a34.f0(fa6Var);
                return pn6Var;
            case 2:
                ?? obj2 = new Object();
                fa6Var.U.b(obj2);
                fa6Var.Y = obj2;
                a34.f0(fa6Var);
                return pn6Var;
            case 3:
                dd6 dd6Var = fa6Var.O;
                long j = ((xc4) obj).a;
                ha3 b3 = dd6Var.b();
                if (b3 != null && b3.m()) {
                    j = b3.q(j);
                }
                int d = fa6Var.O.d(j, true);
                if (d >= 0) {
                    fa6Var.N.j(fy5.a(d, d));
                }
                fa6Var.P.A(cj2.x, j);
                return pn6Var;
            case 4:
                fa6Var.e1();
                fa6Var.P.b();
                a34.f0(fa6Var);
                return pn6Var;
            case 5:
                fa6Var.e1();
                return pn6Var;
            case 6:
                List list = (List) obj;
                bd6 c = fa6Var.O.c();
                if (c != null) {
                    z = list.add(c);
                }
                return Boolean.valueOf(z);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                fa6Var.P.k.setValue(bool);
                return pn6Var;
        }
    }
}
