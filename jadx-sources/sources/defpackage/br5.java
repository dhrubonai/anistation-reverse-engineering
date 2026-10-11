package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class br5 extends xz3 implements ra3 {
    public float L;
    public float M;
    public float N;
    public float O;
    public boolean P;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (r4 != Integer.MAX_VALUE) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a1(defpackage.xo3 r7) {
        /*
            r6 = this;
            float r0 = r6.N
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            if (r0 != 0) goto L16
            float r0 = r6.N
            int r0 = r7.x0(r0)
            if (r0 >= 0) goto L17
            r0 = r2
            goto L17
        L16:
            r0 = r1
        L17:
            float r3 = r6.O
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L29
            float r3 = r6.O
            int r3 = r7.x0(r3)
            if (r3 >= 0) goto L2a
            r3 = r2
            goto L2a
        L29:
            r3 = r1
        L2a:
            float r4 = r6.L
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L41
            float r4 = r6.L
            int r4 = r7.x0(r4)
            if (r4 >= 0) goto L3b
            r4 = r2
        L3b:
            if (r4 <= r0) goto L3e
            r4 = r0
        L3e:
            if (r4 == r1) goto L41
            goto L42
        L41:
            r4 = r2
        L42:
            float r5 = r6.M
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L59
            float r6 = r6.M
            int r6 = r7.x0(r6)
            if (r6 >= 0) goto L53
            r6 = r2
        L53:
            if (r6 <= r3) goto L56
            r6 = r3
        L56:
            if (r6 == r1) goto L59
            r2 = r6
        L59:
            long r6 = defpackage.sx0.a(r4, r0, r2, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.br5.a1(xo3):long");
    }

    @Override // defpackage.ra3
    public final int b0(yl3 yl3Var, ro3 ro3Var, int i) {
        long a1 = a1(yl3Var);
        if (rx0.e(a1)) {
            return rx0.g(a1);
        }
        if (!this.P) {
            i = sx0.g(i, a1);
        }
        return sx0.f(ro3Var.c(i), a1);
    }

    @Override // defpackage.ra3
    public final wo3 e(xo3 xo3Var, ro3 ro3Var, long j) {
        int j2;
        int h;
        int i;
        int g;
        long a;
        long a1 = a1(xo3Var);
        if (this.P) {
            a = sx0.e(j, a1);
        } else {
            if (!Float.isNaN(this.L)) {
                j2 = rx0.j(a1);
            } else {
                j2 = rx0.j(j);
                int h2 = rx0.h(a1);
                if (j2 > h2) {
                    j2 = h2;
                }
            }
            if (!Float.isNaN(this.N)) {
                h = rx0.h(a1);
            } else {
                h = rx0.h(j);
                int j3 = rx0.j(a1);
                if (h < j3) {
                    h = j3;
                }
            }
            if (!Float.isNaN(this.M)) {
                i = rx0.i(a1);
            } else {
                i = rx0.i(j);
                int g2 = rx0.g(a1);
                if (i > g2) {
                    i = g2;
                }
            }
            if (!Float.isNaN(this.O)) {
                g = rx0.g(a1);
            } else {
                g = rx0.g(j);
                int i2 = rx0.i(a1);
                if (g < i2) {
                    g = i2;
                }
            }
            a = sx0.a(j2, h, i, g);
        }
        em4 p = ro3Var.p(a);
        return xo3Var.L(p.x, p.y, ot1.x, new r0(p, (byte) 14));
    }

    @Override // defpackage.ra3
    public final int j(yl3 yl3Var, ro3 ro3Var, int i) {
        long a1 = a1(yl3Var);
        if (rx0.f(a1)) {
            return rx0.h(a1);
        }
        if (!this.P) {
            i = sx0.f(i, a1);
        }
        return sx0.g(ro3Var.n(i), a1);
    }

    @Override // defpackage.ra3
    public final int m0(yl3 yl3Var, ro3 ro3Var, int i) {
        long a1 = a1(yl3Var);
        if (rx0.e(a1)) {
            return rx0.g(a1);
        }
        if (!this.P) {
            i = sx0.g(i, a1);
        }
        return sx0.f(ro3Var.O(i), a1);
    }

    @Override // defpackage.ra3
    public final int y0(yl3 yl3Var, ro3 ro3Var, int i) {
        long a1 = a1(yl3Var);
        if (rx0.f(a1)) {
            return rx0.h(a1);
        }
        if (!this.P) {
            i = sx0.f(i, a1);
        }
        return sx0.g(ro3Var.k(i), a1);
    }
}
