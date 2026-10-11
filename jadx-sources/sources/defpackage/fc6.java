package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fc6 {
    public ia3 a;
    public ud1 b;
    public p82 c;
    public xd6 d;
    public Object e;
    public final ti4 f = xt5.g(Boolean.TRUE);
    public long g = 0;

    public fc6(ia3 ia3Var, ud1 ud1Var, p82 p82Var, xd6 xd6Var, Object obj) {
        this.a = ia3Var;
        this.b = ud1Var;
        this.c = p82Var;
        this.d = xd6Var;
        this.e = obj;
    }

    public static void a(fc6 fc6Var, ia3 ia3Var, ud1 ud1Var, xd6 xd6Var, int i) {
        if ((i & 1) != 0) {
            ia3Var = fc6Var.a;
        }
        if ((i & 2) != 0) {
            ud1Var = fc6Var.b;
        }
        p82 p82Var = fc6Var.c;
        if ((i & 8) != 0) {
            xd6Var = fc6Var.d;
        }
        Object obj = fc6Var.e;
        ia3 ia3Var2 = fc6Var.a;
        ti4 ti4Var = fc6Var.f;
        if (ia3Var == ia3Var2 && a34.i(ud1Var, fc6Var.b) && a34.i(p82Var, fc6Var.c) && a34.i(xd6Var, fc6Var.d)) {
            if (!a34.i(obj, fc6Var.e)) {
                fc6Var.e = obj;
                ti4Var.setValue(Boolean.TRUE);
                return;
            }
            return;
        }
        fc6Var.a = ia3Var;
        fc6Var.b = ud1Var;
        fc6Var.c = p82Var;
        fc6Var.d = xd6Var;
        ti4Var.setValue(Boolean.TRUE);
    }
}
