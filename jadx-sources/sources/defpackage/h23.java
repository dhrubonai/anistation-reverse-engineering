package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class h23 extends d04 {
    /* JADX WARN: Type inference failed for: r1v1, types: [xz3, i23, m23] */
    @Override // defpackage.d04
    public final xz3 a() {
        ?? m23Var = new m23((byte) 0);
        m23Var.M = l23.x;
        m23Var.N = true;
        return m23Var;
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        i23 i23Var = (i23) xz3Var;
        i23Var.M = l23.x;
        i23Var.N = true;
    }

    public final boolean equals(Object obj) {
        h23 h23Var;
        if (this == obj) {
            return true;
        }
        if (obj instanceof h23) {
            h23Var = (h23) obj;
        } else {
            h23Var = null;
        }
        if (h23Var != null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (l23.x.hashCode() * 31);
    }
}
