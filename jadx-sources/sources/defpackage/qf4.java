package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qf4 extends fg4 {
    public static final qf4 c = new fg4(0, 1, 1);

    @Override // defpackage.fg4
    public final void a(fm0 fm0Var, nr nrVar, bs5 bs5Var, b25 b25Var, gg4 gg4Var) {
        zz4 zz4Var = (zz4) fm0Var.h(0);
        Set set = (Set) b25Var.a;
        if (set == null) {
            return;
        }
        ok4 ok4Var = new ok4(set);
        p44 p44Var = (p44) b25Var.j;
        if (p44Var == null) {
            long[] jArr = cb5.a;
            p44Var = new p44();
            b25Var.j = p44Var;
        }
        p44Var.n(zz4Var, ok4Var);
        ((z44) b25Var.d).b(new od2(ok4Var, -1));
    }
}
