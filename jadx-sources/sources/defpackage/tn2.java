package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tn2 extends d04 {
    public final w50 x;

    public tn2(w50 w50Var) {
        this.x = w50Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xz3, un2] */
    @Override // defpackage.d04
    public final xz3 a() {
        ?? xz3Var = new xz3();
        xz3Var.L = this.x;
        return xz3Var;
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        ((un2) xz3Var).L = this.x;
    }

    public final boolean equals(Object obj) {
        tn2 tn2Var;
        if (this == obj) {
            return true;
        }
        if (obj instanceof tn2) {
            tn2Var = (tn2) obj;
        } else {
            tn2Var = null;
        }
        if (tn2Var == null) {
            return false;
        }
        return this.x.equals(tn2Var.x);
    }

    public final int hashCode() {
        return Float.hashCode(this.x.a);
    }
}
