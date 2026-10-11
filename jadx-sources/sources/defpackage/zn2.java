package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zn2 implements pa3 {
    public final sb2 A;
    public final cb6 x;
    public final int y;
    public final di6 z;

    public zn2(cb6 cb6Var, int i, di6 di6Var, sb2 sb2Var) {
        this.x = cb6Var;
        this.y = i;
        this.z = di6Var;
        this.A = sb2Var;
    }

    @Override // defpackage.pa3
    public final wo3 e(xo3 xo3Var, ro3 ro3Var, long j) {
        long j2;
        if (ro3Var.n(rx0.g(j)) < rx0.h(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = rx0.a(j2, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        em4 p = ro3Var.p(j);
        int min = Math.min(p.x, rx0.h(j2));
        return xo3Var.L(min, p.y, ot1.x, new fe1((byte) 1, min, this, xo3Var, p));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zn2) {
                zn2 zn2Var = (zn2) obj;
                if (this.x == zn2Var.x && this.y == zn2Var.y && this.z.equals(zn2Var.z) && a34.i(this.A, zn2Var.A)) {
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
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.x + ", cursorOffset=" + this.y + ", transformedText=" + this.z + ", textLayoutResultProvider=" + this.A + ")";
    }
}
