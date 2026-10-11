package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ag4 extends fg4 {
    public static final ag4 c = new fg4(1, 0, 2);

    @Override // defpackage.fg4
    public final void a(fm0 fm0Var, nr nrVar, bs5 bs5Var, b25 b25Var, gg4 gg4Var) {
        int f = fm0Var.f(0);
        int i = bs5Var.v;
        int O = bs5Var.O(bs5Var.b, bs5Var.q(i));
        int f2 = bs5Var.f(bs5Var.b, bs5Var.q(i + 1));
        for (int max = Math.max(O, f2 - f); max < f2; max++) {
            Object obj = bs5Var.c[bs5Var.g(max)];
            if (obj instanceof od2) {
                b25Var.f((od2) obj);
            } else if (obj instanceof zz4) {
                ((zz4) obj).c();
            }
        }
        if (f <= 0) {
            eu0.a("Check failed");
        }
        int i2 = bs5Var.v;
        int O2 = bs5Var.O(bs5Var.b, bs5Var.q(i2));
        int f3 = bs5Var.f(bs5Var.b, bs5Var.q(i2 + 1)) - f;
        if (f3 < O2) {
            eu0.a("Check failed");
        }
        bs5Var.K(f3, f, i2);
        int i3 = bs5Var.i;
        if (i3 >= O2) {
            bs5Var.i = i3 - f;
        }
    }
}
