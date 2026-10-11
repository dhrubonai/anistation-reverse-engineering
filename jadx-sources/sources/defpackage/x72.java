package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class x72 extends d04 {
    public final w72 x;

    public x72(w72 w72Var) {
        this.x = w72Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xz3, z72] */
    @Override // defpackage.d04
    public final xz3 a() {
        ?? xz3Var = new xz3();
        xz3Var.L = this.x;
        return xz3Var;
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        z72 z72Var = (z72) xz3Var;
        z72Var.L.a.k(z72Var);
        w72 w72Var = this.x;
        z72Var.L = w72Var;
        w72Var.a.b(z72Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof x72) && a34.i(this.x, ((x72) obj).x)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.x.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.x + ")";
    }
}
