package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yq5 extends m23 {
    public tw5 M;
    public long N;
    public long O;
    public boolean P;
    public final ti4 Q;

    public yq5(tw5 tw5Var) {
        super((byte) 1);
        this.M = tw5Var;
        this.N = -9223372034707292160L;
        this.O = sx0.b(0, 0, 0, 0, 15);
        this.Q = xt5.g(null);
    }

    @Override // defpackage.xz3
    public final void S0() {
        this.N = -9223372034707292160L;
        this.P = false;
    }

    @Override // defpackage.xz3
    public final void U0() {
        this.Q.setValue(null);
    }

    @Override // defpackage.m23, defpackage.ra3
    public final wo3 e(xo3 xo3Var, ro3 ro3Var, long j) {
        long j2;
        em4 p;
        long j3;
        char c;
        long j4;
        wq5 wq5Var;
        long d;
        wq5 wq5Var2;
        boolean z = true;
        if (xo3Var.d0()) {
            this.O = j;
            this.P = true;
            p = ro3Var.p(j);
        } else {
            if (this.P) {
                j2 = this.O;
            } else {
                j2 = j;
            }
            p = ro3Var.p(j2);
        }
        em4 em4Var = p;
        long j5 = (em4Var.y & 4294967295L) | (em4Var.x << 32);
        if (xo3Var.d0()) {
            this.N = j5;
            c = ' ';
            d = j5;
            j4 = d;
        } else {
            if (!k13.a(this.N, -9223372034707292160L)) {
                j3 = this.N;
            } else {
                j3 = j5;
            }
            ti4 ti4Var = this.Q;
            wq5 wq5Var3 = (wq5) ti4Var.getValue();
            if (wq5Var3 != null) {
                wj wjVar = wq5Var3.a;
                c = ' ';
                j4 = j5;
                if (k13.a(j3, ((k13) wjVar.d()).a) || wjVar.e()) {
                    z = false;
                }
                if (k13.a(j3, ((k13) wjVar.e.getValue()).a) && !z) {
                    wq5Var2 = wq5Var3;
                } else {
                    wq5Var3.b = ((k13) wjVar.d()).a;
                    wq5Var2 = wq5Var3;
                    tl7.z(O0(), null, null, new so1(wq5Var2, j3, this, (vz0) null), 3);
                }
                wq5Var = wq5Var2;
            } else {
                long j6 = j3;
                c = ' ';
                j4 = j5;
                wq5Var = new wq5(new wj(new k13(j6), db.s, new k13(4294967297L), 8), j6);
            }
            ti4Var.setValue(wq5Var);
            d = sx0.d(j, ((k13) wq5Var.a.d()).a);
        }
        int i = (int) (d >> c);
        int i2 = (int) (d & 4294967295L);
        return xo3Var.L(i, i2, ot1.x, new xq5(this, j4, i, i2, xo3Var, em4Var));
    }
}
