package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class n23 extends d04 {
    /* JADX WARN: Type inference failed for: r1v1, types: [p23, xz3, m23] */
    @Override // defpackage.d04
    public final xz3 a() {
        ?? m23Var = new m23((byte) 0);
        m23Var.M = l23.y;
        m23Var.N = true;
        return m23Var;
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        p23 p23Var = (p23) xz3Var;
        p23Var.M = l23.y;
        p23Var.N = true;
    }

    public final boolean equals(Object obj) {
        n23 n23Var;
        if (this == obj) {
            return true;
        }
        if (obj instanceof n23) {
            n23Var = (n23) obj;
        } else {
            n23Var = null;
        }
        if (n23Var != null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (l23.y.hashCode() * 31);
    }
}
