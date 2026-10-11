package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qq4 extends d04 {
    public final qd x;

    public qq4(qd qdVar) {
        this.x = qdVar;
    }

    @Override // defpackage.d04
    public final xz3 a() {
        return new eo2(this.x, null);
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        rq4 rq4Var = (rq4) xz3Var;
        qd qdVar = rq4Var.M;
        qd qdVar2 = this.x;
        if (!a34.i(qdVar, qdVar2)) {
            rq4Var.M = qdVar2;
            if (rq4Var.N) {
                rq4Var.c1();
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof qq4) && this.x.equals(((qq4) obj).x)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.x.hashCode() * 31);
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.x + ", overrideDescendants=false)";
    }
}
