package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ze4 extends fg4 {
    public static final ze4 c = new fg4(0, 4, 1);

    @Override // defpackage.fg4
    public final void a(fm0 fm0Var, nr nrVar, bs5 bs5Var, b25 b25Var, gg4 gg4Var) {
        k14 k14Var = (k14) fm0Var.h(2);
        k14 k14Var2 = (k14) fm0Var.h(3);
        qu0 qu0Var = (qu0) fm0Var.h(1);
        j14 j14Var = (j14) fm0Var.h(0);
        if (j14Var == null && (j14Var = qu0Var.p(k14Var)) == null) {
            eu0.b("Could not resolve state for movable content");
            v71.e();
            return;
        }
        yr5 a = as5.a(j14Var.a);
        if (bs5Var.n > 0 || bs5Var.t(bs5Var.t + 1) != 1) {
            eu0.a("Check failed");
        }
        int i = bs5Var.t;
        int i2 = bs5Var.i;
        int i3 = bs5Var.j;
        bs5Var.a(1);
        bs5Var.Q();
        bs5Var.d();
        bs5 h = a.h();
        try {
            List H = h98.H(h, 2, bs5Var, false, true, true);
            h.e(true);
            bs5Var.j();
            bs5Var.i();
            bs5Var.t = i;
            bs5Var.i = i2;
            bs5Var.j = i3;
            t80.o(bs5Var, H, k14Var2.c);
        } catch (Throwable th) {
            h.e(false);
            throw th;
        }
    }
}
