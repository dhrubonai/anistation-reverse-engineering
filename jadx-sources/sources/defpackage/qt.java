package defpackage;

import android.os.Trace;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qt extends xh4 implements c25 {
    public static final ui R = new ui((byte) 11);
    public w60 E;
    public boolean F;
    public h43 G;
    public v11 I;
    public ub2 K;
    public tt M;
    public kt N;
    public final sx5 O;
    public final sx5 P;
    public final vy4 Q;
    public final ti4 C = xt5.g(null);
    public float D = 1.0f;
    public long H = 9205357640488583168L;
    public ub2 J = R;
    public dz0 L = pk2.P;

    public qt(kt ktVar) {
        this.N = ktVar;
        this.O = tx5.a(ktVar);
        sx5 a = tx5.a(lt.a);
        this.P = a;
        this.Q = h41.d(a);
    }

    @Override // defpackage.c25
    public final void a() {
        h43 h43Var = this.G;
        c25 c25Var = null;
        if (h43Var != null) {
            h43Var.l(null);
        }
        this.G = null;
        Object j = j();
        if (j instanceof c25) {
            c25Var = (c25) j;
        }
        if (c25Var != null) {
            c25Var.a();
        }
        this.F = false;
    }

    @Override // defpackage.c25
    public final void b() {
        h43 h43Var = this.G;
        c25 c25Var = null;
        if (h43Var != null) {
            h43Var.l(null);
        }
        this.G = null;
        Object j = j();
        if (j instanceof c25) {
            c25Var = (c25) j;
        }
        if (c25Var != null) {
            c25Var.b();
        }
        this.F = false;
    }

    @Override // defpackage.c25
    public final void c() {
        c25 c25Var;
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            Object j = j();
            if (j instanceof c25) {
                c25Var = (c25) j;
            } else {
                c25Var = null;
            }
            if (c25Var != null) {
                c25Var.c();
            }
            k();
            this.F = true;
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.xh4
    public final boolean d(float f) {
        this.D = f;
        return true;
    }

    @Override // defpackage.xh4
    public final boolean e(w60 w60Var) {
        this.E = w60Var;
        return true;
    }

    @Override // defpackage.xh4
    public final long h() {
        xh4 j = j();
        if (j != null) {
            return j.h();
        }
        return 9205357640488583168L;
    }

    @Override // defpackage.xh4
    public final void i(bp1 bp1Var) {
        long g = bp1Var.g();
        if (!uq5.b(this.H, g)) {
            this.H = g;
        }
        xh4 j = j();
        if (j != null) {
            j.g(bp1Var, bp1Var.g(), this.D, this.E);
        }
    }

    public final xh4 j() {
        return (xh4) this.C.getValue();
    }

    public final void k() {
        n11 n11Var;
        bx5 y;
        kt ktVar = this.N;
        if (ktVar == null) {
            return;
        }
        v11 v11Var = this.I;
        vz0 vz0Var = null;
        if (v11Var != null) {
            an anVar = new an(this, ktVar, vz0Var, (byte) 1);
            l11 coroutineContext = v11Var.getCoroutineContext();
            int i = lq6.b;
            j11 j11Var = coroutineContext.get(h95.B);
            if (j11Var instanceof n11) {
                n11Var = (n11) j11Var;
            } else {
                n11Var = null;
            }
            y11 y11Var = y11.A;
            if (n11Var != null && !n11Var.equals(rh1.b)) {
                y = tl7.y(db.b(new pc1(v11Var.getCoroutineContext())), new qc1(n11Var), y11Var, anVar);
            } else {
                y = tl7.y(v11Var, rh1.b, y11Var, anVar);
            }
            h43 h43Var = this.G;
            if (h43Var != null) {
                h43Var.l(null);
            }
            this.G = y;
            return;
        }
        a34.s0("scope");
        throw null;
    }

    public final void l(kt ktVar) {
        if (!a34.i(this.N, ktVar)) {
            this.N = ktVar;
            if (ktVar == null) {
                h43 h43Var = this.G;
                if (h43Var != null) {
                    h43Var.l(null);
                }
                this.G = null;
            } else if (this.F) {
                k();
            }
            if (ktVar != null) {
                this.O.l(null, ktVar);
            }
        }
    }

    public final ev2 m(ev2 ev2Var, boolean z) {
        xa5 xa5Var;
        bv2 a = ev2.a(ev2Var);
        a.d = new pz2(ev2Var, this, (byte) 5);
        dv2 dv2Var = ev2Var.s;
        if (dv2Var.d == null) {
            a.i = cr5.m;
        }
        if (dv2Var.e == null) {
            dz0 dz0Var = this.L;
            int i = lq6.b;
            if (!a34.i(dz0Var, pk2.P) && !a34.i(dz0Var, pk2.S)) {
                xa5Var = xa5.x;
            } else {
                xa5Var = xa5.y;
            }
            a.j = xa5Var;
        }
        if (dv2Var.f == null) {
            a.k = as4.y;
        }
        if (z) {
            it1 it1Var = it1.x;
            a.f = it1Var;
            a.g = it1Var;
            a.h = it1Var;
        }
        return a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(defpackage.pt r12) {
        /*
            r11 = this;
            sx5 r0 = r11.P
            java.lang.Object r1 = r0.getValue()
            pt r1 = (defpackage.pt) r1
            ub2 r2 = r11.J
            java.lang.Object r12 = r2.invoke(r12)
            pt r12 = (defpackage.pt) r12
            r0.k(r12)
            dz0 r5 = r11.L
            boolean r0 = r12 instanceof defpackage.ot
            r10 = 0
            if (r0 == 0) goto L20
            r0 = r12
            ot r0 = (defpackage.ot) r0
            o26 r0 = r0.b
            goto L29
        L20:
            boolean r0 = r12 instanceof defpackage.mt
            if (r0 == 0) goto L80
            r0 = r12
            mt r0 = (defpackage.mt) r0
            jw1 r0 = r0.b
        L29:
            ev2 r2 = r0.b()
            w4 r3 = defpackage.jv2.a
            java.lang.Object r2 = defpackage.wk6.o(r2, r3)
            ri6 r2 = (defpackage.ri6) r2
            rt r3 = defpackage.jf7.x
            vi6 r2 = r2.a(r3, r0)
            boolean r3 = r2 instanceof defpackage.w21
            if (r3 == 0) goto L80
            xh4 r3 = r1.a()
            boolean r4 = r1 instanceof defpackage.nt
            if (r4 == 0) goto L48
            goto L49
        L48:
            r3 = r10
        L49:
            xh4 r4 = r12.a()
            m18 r6 = defpackage.fq1.y
            w21 r2 = (defpackage.w21) r2
            int r2 = r2.c
            jq1 r6 = defpackage.jq1.MILLISECONDS
            long r6 = defpackage.w65.V(r2, r6)
            boolean r2 = r0 instanceof defpackage.o26
            if (r2 == 0) goto L68
            r2 = r0
            o26 r2 = (defpackage.o26) r2
            boolean r2 = r2.g
            if (r2 != 0) goto L65
            goto L68
        L65:
            r2 = 0
        L66:
            r8 = r2
            goto L6a
        L68:
            r2 = 1
            goto L66
        L6a:
            ev2 r0 = r0.b()
            w4 r2 = defpackage.iv2.b
            java.lang.Object r0 = defpackage.wk6.o(r0, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r9 = r0.booleanValue()
            u21 r2 = new u21
            r2.<init>(r3, r4, r5, r6, r8, r9)
            goto L81
        L80:
            r2 = r10
        L81:
            if (r2 == 0) goto L84
            goto L88
        L84:
            xh4 r2 = r12.a()
        L88:
            ti4 r0 = r11.C
            r0.setValue(r2)
            xh4 r0 = r1.a()
            xh4 r2 = r12.a()
            if (r0 == r2) goto Lb8
            xh4 r0 = r1.a()
            boolean r1 = r0 instanceof defpackage.c25
            if (r1 == 0) goto La2
            c25 r0 = (defpackage.c25) r0
            goto La3
        La2:
            r0 = r10
        La3:
            if (r0 == 0) goto La8
            r0.b()
        La8:
            xh4 r0 = r12.a()
            boolean r1 = r0 instanceof defpackage.c25
            if (r1 == 0) goto Lb3
            r10 = r0
            c25 r10 = (defpackage.c25) r10
        Lb3:
            if (r10 == 0) goto Lb8
            r10.c()
        Lb8:
            ub2 r11 = r11.K
            if (r11 == 0) goto Lbf
            r11.invoke(r12)
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qt.n(pt):void");
    }
}
