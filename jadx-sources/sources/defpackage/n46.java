package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class n46 extends d04 {
    public final ub2 x;

    public n46(ub2 ub2Var) {
        this.x = ub2Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [o46, xz3, f03] */
    @Override // defpackage.d04
    public final xz3 a() {
        ?? f03Var = new f03(sw0.L);
        f03Var.O = this.x;
        return f03Var;
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        o46 o46Var = (o46) xz3Var;
        ub2 ub2Var = o46Var.O;
        ub2 ub2Var2 = this.x;
        if (ub2Var != ub2Var2) {
            o46Var.O = ub2Var2;
            z57 z57Var = o46Var.P;
            if (z57Var != null) {
                t47 t47Var = (t47) ub2Var2.invoke(z57Var);
                if (!a34.i(t47Var, o46Var.N)) {
                    o46Var.N = t47Var;
                    o46Var.b1();
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof n46) {
                if (this.x == ((n46) obj).x) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.x.hashCode();
    }
}
