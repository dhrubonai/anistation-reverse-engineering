package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ja3 extends d04 {
    public final jc2 x;

    public ja3(jc2 jc2Var) {
        this.x = jc2Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xz3, qa3] */
    @Override // defpackage.d04
    public final xz3 a() {
        ?? xz3Var = new xz3();
        xz3Var.L = this.x;
        return xz3Var;
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        ((qa3) xz3Var).L = this.x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ja3)) {
            return false;
        }
        if (this.x == ((ja3) obj).x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.x.hashCode();
    }
}
