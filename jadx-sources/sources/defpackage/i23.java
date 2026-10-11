package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class i23 extends m23 {
    public l23 M;
    public boolean N;

    @Override // defpackage.m23
    public final long a1(ro3 ro3Var, long j) {
        int c;
        if (this.M == l23.x) {
            c = ro3Var.O(rx0.h(j));
        } else {
            c = ro3Var.c(rx0.h(j));
        }
        if (c < 0) {
            c = 0;
        }
        if (c < 0) {
            gz2.a("height must be >= 0");
        }
        return sx0.h(0, Integer.MAX_VALUE, c, c);
    }

    @Override // defpackage.m23, defpackage.ra3
    public final int b0(yl3 yl3Var, ro3 ro3Var, int i) {
        if (this.M == l23.x) {
            return ro3Var.O(i);
        }
        return ro3Var.c(i);
    }

    @Override // defpackage.m23
    public final boolean b1() {
        return this.N;
    }

    @Override // defpackage.m23, defpackage.ra3
    public final int m0(yl3 yl3Var, ro3 ro3Var, int i) {
        if (this.M == l23.x) {
            return ro3Var.O(i);
        }
        return ro3Var.c(i);
    }
}
