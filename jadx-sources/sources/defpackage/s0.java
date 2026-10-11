package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class s0 extends t43 implements vz0, v11 {
    public final l11 A;

    public s0(l11 l11Var, boolean z, boolean z2) {
        super(z2);
        if (z) {
            N((h43) l11Var.get(h95.F));
        }
        this.A = l11Var.plus(this);
    }

    @Override // defpackage.t43
    public final void M(er0 er0Var) {
        h98.z(this.A, er0Var);
    }

    @Override // defpackage.t43
    public String S() {
        return super.S();
    }

    @Override // defpackage.t43
    public final void X(Object obj) {
        if (obj instanceof dr0) {
            dr0 dr0Var = (dr0) obj;
            Throwable th = dr0Var.a;
            boolean z = true;
            if (qs.a.getIntVolatile(dr0Var, dr0.b) != 1) {
                z = false;
            }
            g0(th, z);
            return;
        }
        h0(obj);
    }

    @Override // defpackage.vz0
    public final l11 getContext() {
        return this.A;
    }

    @Override // defpackage.v11
    public final l11 getCoroutineContext() {
        return this.A;
    }

    public final void i0(y11 y11Var, s0 s0Var, ic2 ic2Var) {
        Object invoke;
        int ordinal = y11Var.ordinal();
        pn6 pn6Var = pn6.a;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        try {
                            l11 l11Var = this.A;
                            Object c = ke6.c(l11Var, null);
                            try {
                                if (!(ic2Var instanceof h30)) {
                                    invoke = wc7.X(ic2Var, s0Var, this);
                                } else {
                                    wk6.j(2, ic2Var);
                                    invoke = ic2Var.invoke(s0Var, this);
                                }
                                ke6.a(l11Var, c);
                                if (invoke != w11.x) {
                                    resumeWith(invoke);
                                    return;
                                }
                                return;
                            } catch (Throwable th) {
                                ke6.a(l11Var, c);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (th instanceof ih1) {
                                th = ((ih1) th).x;
                            }
                            resumeWith(new y45(th));
                            return;
                        }
                    }
                    ze0.l();
                    return;
                }
                ic2Var.getClass();
                wc7.z(wc7.j(s0Var, this, ic2Var)).resumeWith(pn6Var);
                return;
            }
            return;
        }
        try {
            kh1.a(wc7.z(wc7.j(s0Var, this, ic2Var)), pn6Var);
        } catch (Throwable th3) {
            oi4.n(this, th3);
            throw null;
        }
    }

    @Override // defpackage.vz0
    public final void resumeWith(Object obj) {
        Throwable b = z45.b(obj);
        if (b != null) {
            obj = new dr0(b, false);
        }
        Object R = R(obj);
        if (R == u43.b) {
            return;
        }
        n(R);
    }

    @Override // defpackage.t43
    public final String v() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void h0(Object obj) {
    }

    public void g0(Throwable th, boolean z) {
    }
}
