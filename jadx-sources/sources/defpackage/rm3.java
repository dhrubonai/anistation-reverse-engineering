package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rm3 implements xr4 {
    public k13 A;
    public c13 B;
    public final i75 x;
    public k13 y;
    public ia3 z;

    public rm3(i75 i75Var) {
        this.x = i75Var;
    }

    @Override // defpackage.xr4
    public final long b(g13 g13Var, long j, ia3 ia3Var, long j2) {
        boolean a;
        c13 c13Var = this.B;
        if (c13Var != null) {
            k13 k13Var = this.y;
            boolean z = false;
            if (k13Var == null) {
                a = false;
            } else {
                a = k13.a(k13Var.a, j);
            }
            if (a && this.z == ia3Var) {
                k13 k13Var2 = this.A;
                if (k13Var2 != null) {
                    z = k13.a(k13Var2.a, j2);
                }
                if (z) {
                    return c13Var.a;
                }
            }
        }
        long b = this.x.b(g13Var, j, ia3Var, j2);
        this.y = new k13(j);
        this.z = ia3Var;
        this.A = new k13(j2);
        this.B = new c13(b);
        return b;
    }
}
