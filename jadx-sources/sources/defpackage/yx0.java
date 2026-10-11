package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yx0 extends d04 {
    public final ub2 x;

    public yx0(ub2 ub2Var) {
        this.x = ub2Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xz3, zx0, a03] */
    @Override // defpackage.d04
    public final xz3 a() {
        ?? a03Var = new a03();
        a03Var.N = this.x;
        return a03Var;
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        zx0 zx0Var = (zx0) xz3Var;
        ub2 ub2Var = zx0Var.N;
        ub2 ub2Var2 = this.x;
        if (ub2Var2 != ub2Var) {
            zx0Var.N = ub2Var2;
            zx0Var.b1();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof yx0) && ((yx0) obj).x == this.x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.x.hashCode();
    }
}
