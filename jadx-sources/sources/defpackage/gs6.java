package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gs6 implements pa3 {
    public final sb2 A;
    public final cb6 x;
    public final int y;
    public final di6 z;

    public gs6(cb6 cb6Var, int i, di6 di6Var, sb2 sb2Var) {
        this.x = cb6Var;
        this.y = i;
        this.z = di6Var;
        this.A = sb2Var;
    }

    @Override // defpackage.pa3
    public final wo3 e(xo3 xo3Var, ro3 ro3Var, long j) {
        em4 p = ro3Var.p(rx0.a(j, 0, 0, 0, Integer.MAX_VALUE, 7));
        int min = Math.min(p.y, rx0.g(j));
        return xo3Var.L(p.x, min, ot1.x, new vm(this, p, min));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gs6) {
                gs6 gs6Var = (gs6) obj;
                if (this.x == gs6Var.x && this.y == gs6Var.y && this.z.equals(gs6Var.z) && a34.i(this.A, gs6Var.A)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A.hashCode() + ((this.z.hashCode() + qx1.c(this.y, this.x.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.x + ", cursorOffset=" + this.y + ", transformedText=" + this.z + ", textLayoutResultProvider=" + this.A + ")";
    }
}
