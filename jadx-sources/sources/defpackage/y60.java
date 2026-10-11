package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class y60 extends xz3 implements ra3, sh5 {
    public ub2 L;

    public y60(ub2 ub2Var) {
        this.L = ub2Var;
    }

    @Override // defpackage.sh5
    public final void I0(bi5 bi5Var) {
        om5 om5Var;
        boolean z;
        ub2 ub2Var;
        fa4 M = wc7.M(this, 2);
        if (!M.k0) {
            p55 p55Var = io3.c;
            if (p55Var == null) {
                io3.c = new p55();
            } else {
                p55Var.a();
            }
            p55 p55Var2 = io3.c;
            p55Var2.getClass();
            p55Var2.Q = M.R.V;
            p55Var2.O = m37.O(M.z);
            ft5 b = et5.b();
            if (b != null) {
                ub2Var = b.e();
            } else {
                ub2Var = null;
            }
            ft5 e = et5.e(b);
            try {
                this.L.invoke(p55Var2);
                et5.k(b, e, ub2Var);
                om5Var = p55Var2.L;
                z = p55Var2.M;
            } catch (Throwable th) {
                et5.k(b, e, ub2Var);
                throw th;
            }
        } else {
            om5Var = M.g0;
            z = M.j0;
        }
        if (!z) {
            return;
        }
        zh5.h(bi5Var, om5Var);
    }

    @Override // defpackage.xz3
    public final boolean P0() {
        return false;
    }

    @Override // defpackage.ra3
    public final wo3 e(xo3 xo3Var, ro3 ro3Var, long j) {
        em4 p = ro3Var.p(j);
        return xo3Var.L(p.x, p.y, ot1.x, new b0(p, this, (byte) 17));
    }

    @Override // defpackage.sh5
    public final boolean l() {
        return false;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.L + ")";
    }
}
