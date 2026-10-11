package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class m23 extends xz3 implements ra3 {
    public final /* synthetic */ byte L;

    public abstract long a1(ro3 ro3Var, long j);

    public int b0(yl3 yl3Var, ro3 ro3Var, int i) {
        switch (this.L) {
            case 0:
                return ro3Var.c(i);
            default:
                return ro3Var.c(i);
        }
    }

    public abstract boolean b1();

    public wo3 e(xo3 xo3Var, ro3 ro3Var, long j) {
        long a1 = a1(ro3Var, j);
        if (b1()) {
            a1 = sx0.e(j, a1);
        }
        em4 p = ro3Var.p(a1);
        return xo3Var.L(p.x, p.y, ot1.x, new r0(p, (byte) 9));
    }

    @Override // defpackage.ra3
    public int j(yl3 yl3Var, ro3 ro3Var, int i) {
        switch (this.L) {
            case 0:
                return ro3Var.n(i);
            default:
                return ro3Var.n(i);
        }
    }

    public int m0(yl3 yl3Var, ro3 ro3Var, int i) {
        switch (this.L) {
            case 0:
                return ro3Var.O(i);
            default:
                return ro3Var.O(i);
        }
    }

    @Override // defpackage.ra3
    public int y0(yl3 yl3Var, ro3 ro3Var, int i) {
        switch (this.L) {
            case 0:
                return ro3Var.k(i);
            default:
                return ro3Var.k(i);
        }
    }
}
