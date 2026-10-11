package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vs extends xz3 implements ra3 {
    public float L;

    public final long a1(long j, boolean z) {
        int round;
        int g = rx0.g(j);
        if (g != Integer.MAX_VALUE && (round = Math.round(g * this.L)) > 0) {
            if (!z || wc7.A(round, j, g)) {
                return (round << 32) | (g & 4294967295L);
            }
            return 0L;
        }
        return 0L;
    }

    @Override // defpackage.ra3
    public final int b0(yl3 yl3Var, ro3 ro3Var, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(i / this.L);
        }
        return ro3Var.c(i);
    }

    public final long b1(long j, boolean z) {
        int round;
        int h = rx0.h(j);
        if (h != Integer.MAX_VALUE && (round = Math.round(h / this.L)) > 0) {
            if (!z || wc7.A(h, j, round)) {
                return (h << 32) | (round & 4294967295L);
            }
            return 0L;
        }
        return 0L;
    }

    public final long c1(long j, boolean z) {
        int i = rx0.i(j);
        int round = Math.round(i * this.L);
        if (round > 0) {
            if (!z || wc7.A(round, j, i)) {
                return (round << 32) | (i & 4294967295L);
            }
            return 0L;
        }
        return 0L;
    }

    public final long d1(long j, boolean z) {
        int j2 = rx0.j(j);
        int round = Math.round(j2 / this.L);
        if (round > 0) {
            if (!z || wc7.A(j2, j, round)) {
                return (j2 << 32) | (round & 4294967295L);
            }
            return 0L;
        }
        return 0L;
    }

    @Override // defpackage.ra3
    public final wo3 e(xo3 xo3Var, ro3 ro3Var, long j) {
        boolean z;
        boolean z2 = true;
        long b1 = b1(j, true);
        if (k13.a(b1, 0L)) {
            b1 = a1(j, true);
            if (k13.a(b1, 0L)) {
                b1 = d1(j, true);
                if (k13.a(b1, 0L)) {
                    b1 = c1(j, true);
                    if (k13.a(b1, 0L)) {
                        b1 = b1(j, false);
                        if (k13.a(b1, 0L)) {
                            b1 = a1(j, false);
                            if (k13.a(b1, 0L)) {
                                b1 = d1(j, false);
                                if (k13.a(b1, 0L)) {
                                    b1 = c1(j, false);
                                    if (k13.a(b1, 0L)) {
                                        b1 = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!k13.a(b1, 0L)) {
            int i = (int) (b1 >> 32);
            int i2 = (int) (4294967295L & b1);
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (i2 < 0) {
                z2 = false;
            }
            if (!(z & z2)) {
                gz2.a("width and height must be >= 0");
            }
            j = sx0.h(i, i, i2, i2);
        }
        em4 p = ro3Var.p(j);
        return xo3Var.L(p.x, p.y, ot1.x, new r0(p, (byte) 2));
    }

    @Override // defpackage.ra3
    public final int j(yl3 yl3Var, ro3 ro3Var, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(i * this.L);
        }
        return ro3Var.n(i);
    }

    @Override // defpackage.ra3
    public final int m0(yl3 yl3Var, ro3 ro3Var, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(i / this.L);
        }
        return ro3Var.O(i);
    }

    @Override // defpackage.ra3
    public final int y0(yl3 yl3Var, ro3 ro3Var, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(i * this.L);
        }
        return ro3Var.k(i);
    }
}
