package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class uh4 extends d04 {
    public final th4 x;

    public uh4(th4 th4Var) {
        this.x = th4Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xz3, wh4] */
    @Override // defpackage.d04
    public final xz3 a() {
        ?? xz3Var = new xz3();
        xz3Var.L = this.x;
        return xz3Var;
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        ((wh4) xz3Var).L = this.x;
    }

    public final boolean equals(Object obj) {
        uh4 uh4Var;
        if (obj instanceof uh4) {
            uh4Var = (uh4) obj;
        } else {
            uh4Var = null;
        }
        if (uh4Var == null) {
            return false;
        }
        return a34.i(this.x, uh4Var.x);
    }

    public final int hashCode() {
        return this.x.hashCode();
    }
}
