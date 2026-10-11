package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class no1 extends xz3 implements ra3 {
    public d9 L;
    public ic2 M;
    public rg4 N;
    public boolean O;

    @Override // defpackage.xz3
    public final void T0() {
        this.O = false;
    }

    @Override // defpackage.ra3
    public final wo3 e(xo3 xo3Var, ro3 ro3Var, long j) {
        boolean z;
        em4 p = ro3Var.p(j);
        if (!xo3Var.d0() || !this.O) {
            ai4 ai4Var = (ai4) this.M.invoke(new k13((p.y & 4294967295L) | (p.x << 32)), new rx0(j));
            d9 d9Var = this.L;
            cn3 cn3Var = (cn3) ai4Var.x;
            Object obj = ai4Var.y;
            cn3 d = d9Var.d();
            ti4 ti4Var = d9Var.k;
            if (!a34.i(d, cn3Var)) {
                d9Var.l.setValue(cn3Var);
                m54 m54Var = d9Var.e.b;
                boolean f = m54Var.f();
                if (f) {
                    try {
                        z8 z8Var = d9Var.m;
                        float d2 = d9Var.d().d(obj);
                        if (!Float.isNaN(d2)) {
                            d9 d9Var2 = z8Var.a;
                            d9Var2.i.i(d2);
                            d9Var2.j.i(0.0f);
                            ti4Var.setValue(null);
                        }
                        d9Var.g(obj);
                    } finally {
                        m54Var.l(null);
                    }
                }
                if (!f) {
                    ti4Var.setValue(obj);
                }
            }
        }
        if (!xo3Var.d0() && !this.O) {
            z = false;
        } else {
            z = true;
        }
        this.O = z;
        return xo3Var.L(p.x, p.y, ot1.x, new bg(xo3Var, this, p, (byte) 12));
    }
}
