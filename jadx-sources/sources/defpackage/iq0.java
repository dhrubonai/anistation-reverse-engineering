package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class iq0 implements yz3 {
    public final yz3 x;
    public final yz3 y;

    public iq0(yz3 yz3Var, yz3 yz3Var2) {
        this.x = yz3Var;
        this.y = yz3Var2;
    }

    @Override // defpackage.yz3
    public final boolean d(ub2 ub2Var) {
        if (this.x.d(ub2Var) && this.y.d(ub2Var)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof iq0) {
            iq0 iq0Var = (iq0) obj;
            if (this.x.equals(iq0Var.x) && a34.i(this.y, iq0Var.y)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.y.hashCode() * 31) + this.x.hashCode();
    }

    @Override // defpackage.yz3
    public final Object i(Object obj, ic2 ic2Var) {
        return this.y.i(this.x.i(obj, ic2Var), ic2Var);
    }

    public final String toString() {
        StringBuilder sb = (StringBuilder) i(new StringBuilder("["), new vs0((byte) 25));
        sb.append("]");
        return sb.toString();
    }
}
