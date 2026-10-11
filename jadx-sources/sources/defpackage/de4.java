package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class de4 extends d04 {
    public final ub2 x;

    public de4(ub2 ub2Var) {
        this.x = ub2Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xz3, ee4] */
    @Override // defpackage.d04
    public final xz3 a() {
        ?? xz3Var = new xz3();
        xz3Var.L = this.x;
        return xz3Var;
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        ((ee4) xz3Var).L = this.x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof de4)) {
            return false;
        }
        if (this.x == ((de4) obj).x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.x.hashCode();
    }
}
