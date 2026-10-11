package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zh4 extends xz3 implements ra3, zo1 {
    public xh4 L;
    public boolean M;
    public e7 N;
    public dz0 O;
    public float P;
    public w60 Q;

    public static boolean b1(long j) {
        if (!uq5.b(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040) {
            return true;
        }
        return false;
    }

    public static boolean c1(long j) {
        if (!uq5.b(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040) {
            return true;
        }
        return false;
    }

    @Override // defpackage.xz3
    public final boolean P0() {
        return false;
    }

    public final boolean a1() {
        if (this.M && this.L.h() != 9205357640488583168L) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ra3
    public final int b0(yl3 yl3Var, ro3 ro3Var, int i) {
        if (a1()) {
            long d1 = d1(sx0.b(0, i, 0, 0, 13));
            return Math.max(rx0.i(d1), ro3Var.c(i));
        }
        return ro3Var.c(i);
    }

    public final long d1(long j) {
        boolean z;
        int j2;
        int i;
        float intBitsToFloat;
        float intBitsToFloat2;
        boolean z2 = false;
        if (rx0.d(j) && rx0.c(j)) {
            z = true;
        } else {
            z = false;
        }
        if (rx0.f(j) && rx0.e(j)) {
            z2 = true;
        }
        if ((!a1() && z) || z2) {
            return rx0.a(j, rx0.h(j), 0, rx0.g(j), 0, 10);
        }
        long h = this.L.h();
        if (c1(h)) {
            j2 = Math.round(Float.intBitsToFloat((int) (h >> 32)));
        } else {
            j2 = rx0.j(j);
        }
        if (b1(h)) {
            i = Math.round(Float.intBitsToFloat((int) (h & 4294967295L)));
        } else {
            i = rx0.i(j);
        }
        int g = sx0.g(j2, j);
        float f = sx0.f(i, j);
        long floatToRawIntBits = (Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(g) << 32);
        if (a1()) {
            if (!c1(this.L.h())) {
                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            } else {
                intBitsToFloat = Float.intBitsToFloat((int) (this.L.h() >> 32));
            }
            if (!b1(this.L.h())) {
                intBitsToFloat2 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
            } else {
                intBitsToFloat2 = Float.intBitsToFloat((int) (this.L.h() & 4294967295L));
            }
            long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
            if (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) == 0.0f) {
                floatToRawIntBits = 0;
            } else {
                floatToRawIntBits = te4.S(floatToRawIntBits2, this.O.a(floatToRawIntBits2, floatToRawIntBits));
            }
        }
        return rx0.a(j, sx0.g(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits >> 32))), j), 0, sx0.f(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L))), j), 0, 10);
    }

    @Override // defpackage.ra3
    public final wo3 e(xo3 xo3Var, ro3 ro3Var, long j) {
        em4 p = ro3Var.p(d1(j));
        return xo3Var.L(p.x, p.y, ot1.x, new r0(p, (byte) 11));
    }

    @Override // defpackage.ra3
    public final int j(yl3 yl3Var, ro3 ro3Var, int i) {
        if (a1()) {
            long d1 = d1(sx0.b(0, 0, 0, i, 7));
            return Math.max(rx0.j(d1), ro3Var.n(i));
        }
        return ro3Var.n(i);
    }

    @Override // defpackage.ra3
    public final int m0(yl3 yl3Var, ro3 ro3Var, int i) {
        if (a1()) {
            long d1 = d1(sx0.b(0, i, 0, 0, 13));
            return Math.max(rx0.i(d1), ro3Var.O(i));
        }
        return ro3Var.O(i);
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.L + ", sizeToIntrinsics=" + this.M + ", alignment=" + this.N + ", alpha=" + this.P + ", colorFilter=" + this.Q + ")";
    }

    @Override // defpackage.zo1
    public final void u0(bb3 bb3Var) {
        float intBitsToFloat;
        float intBitsToFloat2;
        long j;
        xg0 xg0Var = bb3Var.x;
        long h = this.L.h();
        if (c1(h)) {
            intBitsToFloat = Float.intBitsToFloat((int) (h >> 32));
        } else {
            intBitsToFloat = Float.intBitsToFloat((int) (xg0Var.g() >> 32));
        }
        if (b1(h)) {
            intBitsToFloat2 = Float.intBitsToFloat((int) (h & 4294967295L));
        } else {
            intBitsToFloat2 = Float.intBitsToFloat((int) (xg0Var.g() & 4294967295L));
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
        if (Float.intBitsToFloat((int) (xg0Var.g() >> 32)) == 0.0f || Float.intBitsToFloat((int) (xg0Var.g() & 4294967295L)) == 0.0f) {
            j = 0;
        } else {
            j = te4.S(floatToRawIntBits, this.O.a(floatToRawIntBits, xg0Var.g()));
        }
        long a = this.N.a((Math.round(Float.intBitsToFloat((int) (j >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L), (Math.round(Float.intBitsToFloat((int) (xg0Var.g() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (xg0Var.g() & 4294967295L))) & 4294967295L), bb3Var.getLayoutDirection());
        float f = (int) (a >> 32);
        float f2 = (int) (a & 4294967295L);
        ((af2) xg0Var.y.y).s(f, f2);
        try {
            this.L.g(bb3Var, j, this.P, this.Q);
            ((af2) xg0Var.y.y).s(-f, -f2);
            bb3Var.a();
        } catch (Throwable th) {
            ((af2) xg0Var.y.y).s(-f, -f2);
            throw th;
        }
    }

    @Override // defpackage.ra3
    public final int y0(yl3 yl3Var, ro3 ro3Var, int i) {
        if (a1()) {
            long d1 = d1(sx0.b(0, 0, 0, i, 7));
            return Math.max(rx0.j(d1), ro3Var.k(i));
        }
        return ro3Var.k(i);
    }
}
