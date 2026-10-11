package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class p06 extends d04 {
    public final zm1 x;

    public p06(zm1 zm1Var) {
        this.x = zm1Var;
    }

    @Override // defpackage.d04
    public final xz3 a() {
        return new eo2(wc7.h, this.x);
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        q06 q06Var = (q06) xz3Var;
        qd qdVar = wc7.h;
        if (!a34.i(q06Var.M, qdVar)) {
            q06Var.M = qdVar;
            if (q06Var.N) {
                q06Var.c1();
            }
        }
        q06Var.L = this.x;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof p06) {
                p06 p06Var = (p06) obj;
                qd qdVar = wc7.h;
                if (!qdVar.equals(qdVar) || !a34.i(this.x, p06Var.x)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int g = zo5.g(1022 * 31, 31, false);
        zm1 zm1Var = this.x;
        if (zm1Var != null) {
            i = zm1Var.hashCode();
        }
        return g + i;
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + wc7.h + ", overrideDescendants=false, touchBoundsExpansion=" + this.x + ")";
    }
}
