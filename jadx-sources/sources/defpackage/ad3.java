package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ad3 extends d04 {
    public final tw5 x;

    public ad3(tw5 tw5Var) {
        this.x = tw5Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xz3, bd3] */
    @Override // defpackage.d04
    public final xz3 a() {
        ?? xz3Var = new xz3();
        xz3Var.L = this.x;
        return xz3Var;
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        bd3 bd3Var = (bd3) xz3Var;
        bd3Var.getClass();
        bd3Var.L = this.x;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ad3) || !this.x.equals(((ad3) obj).x)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.x.hashCode() * 31;
    }

    public final String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=null, placementSpec=" + this.x + ", fadeOutSpec=null)";
    }
}
