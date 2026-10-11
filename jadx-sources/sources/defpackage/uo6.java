package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class uo6 extends xz3 implements ra3 {
    public float L;
    public float M;

    @Override // defpackage.ra3
    public final int b0(yl3 yl3Var, ro3 ro3Var, int i) {
        int i2;
        int c = ro3Var.c(i);
        if (!Float.isNaN(this.M)) {
            i2 = yl3Var.x0(this.M);
        } else {
            i2 = 0;
        }
        if (c < i2) {
            return i2;
        }
        return c;
    }

    @Override // defpackage.ra3
    public final wo3 e(xo3 xo3Var, ro3 ro3Var, long j) {
        int j2;
        int i;
        int i2 = 0;
        if (!Float.isNaN(this.L) && rx0.j(j) == 0) {
            int x0 = xo3Var.x0(this.L);
            j2 = rx0.h(j);
            if (x0 < 0) {
                x0 = 0;
            }
            if (x0 <= j2) {
                j2 = x0;
            }
        } else {
            j2 = rx0.j(j);
        }
        int h = rx0.h(j);
        if (!Float.isNaN(this.M) && rx0.i(j) == 0) {
            int x02 = xo3Var.x0(this.M);
            i = rx0.g(j);
            if (x02 >= 0) {
                i2 = x02;
            }
            if (i2 <= i) {
                i = i2;
            }
        } else {
            i = rx0.i(j);
        }
        em4 p = ro3Var.p(sx0.a(j2, h, i, rx0.g(j)));
        return xo3Var.L(p.x, p.y, ot1.x, new r0(p, (byte) 19));
    }

    @Override // defpackage.ra3
    public final int j(yl3 yl3Var, ro3 ro3Var, int i) {
        int i2;
        int n = ro3Var.n(i);
        if (!Float.isNaN(this.L)) {
            i2 = yl3Var.x0(this.L);
        } else {
            i2 = 0;
        }
        if (n < i2) {
            return i2;
        }
        return n;
    }

    @Override // defpackage.ra3
    public final int m0(yl3 yl3Var, ro3 ro3Var, int i) {
        int i2;
        int O = ro3Var.O(i);
        if (!Float.isNaN(this.M)) {
            i2 = yl3Var.x0(this.M);
        } else {
            i2 = 0;
        }
        if (O < i2) {
            return i2;
        }
        return O;
    }

    @Override // defpackage.ra3
    public final int y0(yl3 yl3Var, ro3 ro3Var, int i) {
        int i2;
        int k = ro3Var.k(i);
        if (!Float.isNaN(this.L)) {
            i2 = yl3Var.x0(this.L);
        } else {
            i2 = 0;
        }
        if (k < i2) {
            return i2;
        }
        return k;
    }
}
