package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bm3 implements ha3 {
    public final am3 x;

    public bm3(am3 am3Var) {
        this.x = am3Var;
    }

    @Override // defpackage.ha3
    public final long B(ha3 ha3Var, long j) {
        return E(ha3Var, j);
    }

    @Override // defpackage.ha3
    public final long D(long j) {
        return xc4.f(this.x.R.D(j), a());
    }

    @Override // defpackage.ha3
    public final long E(ha3 ha3Var, long j) {
        boolean z = ha3Var instanceof bm3;
        am3 am3Var = this.x;
        if (z) {
            am3 am3Var2 = ((bm3) ha3Var).x;
            fa4 fa4Var = am3Var2.R;
            fa4Var.i1();
            am3 W0 = am3Var.R.U0(fa4Var).W0();
            if (W0 != null) {
                long c = c13.c(c13.d(am3Var2.P0(W0, false), w65.R(j)), am3Var.P0(W0, false));
                return (Float.floatToRawIntBits((int) (c >> 32)) << 32) | (Float.floatToRawIntBits((int) (c & 4294967295L)) & 4294967295L);
            }
            am3 w = o80.w(am3Var2);
            long d = c13.d(c13.d(am3Var2.P0(w, false), w.S), w65.R(j));
            am3 w2 = o80.w(am3Var);
            long c2 = c13.c(d, c13.d(am3Var.P0(w2, false), w2.S));
            long floatToRawIntBits = Float.floatToRawIntBits((int) (c2 >> 32));
            long floatToRawIntBits2 = Float.floatToRawIntBits((int) (c2 & 4294967295L)) & 4294967295L;
            fa4 fa4Var2 = w2.R.T;
            fa4Var2.getClass();
            fa4 fa4Var3 = w.R.T;
            fa4Var3.getClass();
            return fa4Var2.E(fa4Var3, floatToRawIntBits2 | (floatToRawIntBits << 32));
        }
        am3 w3 = o80.w(am3Var);
        fa4 fa4Var4 = w3.R;
        long E = E(w3.U, j);
        float f = (int) (w3.S & 4294967295L);
        long e = xc4.e(E, (4294967295L & Float.floatToRawIntBits(f)) | (Float.floatToRawIntBits((int) (r5 >> 32)) << 32));
        if (!fa4Var4.Y0().K) {
            ez2.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        fa4Var4.i1();
        fa4 fa4Var5 = fa4Var4.T;
        if (fa4Var5 != null) {
            fa4Var4 = fa4Var5;
        }
        return xc4.f(e, fa4Var4.E(ha3Var, 0L));
    }

    @Override // defpackage.ha3
    public final n05 G(ha3 ha3Var, boolean z) {
        return this.x.R.G(ha3Var, z);
    }

    @Override // defpackage.ha3
    public final long J(long j) {
        return this.x.R.J(xc4.f(j, a()));
    }

    public final long a() {
        am3 am3Var = this.x;
        am3 w = o80.w(am3Var);
        return xc4.e(E(w.U, 0L), am3Var.R.E(w.R, 0L));
    }

    @Override // defpackage.ha3
    public final long d(long j) {
        return this.x.R.d(xc4.f(j, a()));
    }

    @Override // defpackage.ha3
    public final void h(float[] fArr) {
        this.x.R.h(fArr);
    }

    @Override // defpackage.ha3
    public final void i(ha3 ha3Var, float[] fArr) {
        this.x.R.i(ha3Var, fArr);
    }

    @Override // defpackage.ha3
    public final long j() {
        am3 am3Var = this.x;
        return (am3Var.x << 32) | (am3Var.y & 4294967295L);
    }

    @Override // defpackage.ha3
    public final boolean m() {
        return this.x.R.Y0().K;
    }

    @Override // defpackage.ha3
    public final long o(long j) {
        return this.x.R.o(xc4.f(j, a()));
    }

    @Override // defpackage.ha3
    public final long q(long j) {
        return xc4.f(this.x.R.q(j), a());
    }

    @Override // defpackage.ha3
    public final ha3 x() {
        am3 W0;
        if (!m()) {
            ez2.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        fa4 fa4Var = ((fa4) this.x.R.R.c0.B).T;
        if (fa4Var != null && (W0 = fa4Var.W0()) != null) {
            return W0.U;
        }
        return null;
    }
}
