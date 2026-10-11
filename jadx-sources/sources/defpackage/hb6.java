package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hb6 implements k96 {
    public nd6 b;
    public final /* synthetic */ jb6 d;
    public boolean a = true;
    public p65 c = l68.K;

    public hb6(jb6 jb6Var) {
        this.d = jb6Var;
    }

    @Override // defpackage.k96
    public final void a(long j, p65 p65Var) {
        long j2;
        cd6 d;
        cd6 d2;
        jb6 jb6Var = this.d;
        if (jb6Var.i() && ((cj2) jb6Var.q.getValue()) == null) {
            jb6Var.q(cj2.z);
            jb6Var.s = -1;
            this.a = true;
            this.c = p65Var;
            jb6Var.m();
            uf3 uf3Var = jb6Var.d;
            if (uf3Var != null && (d2 = uf3Var.d()) != null && d2.c(j)) {
                if (jb6Var.l().a.y.length() != 0) {
                    jb6Var.e(false);
                    long v = jb6Var.v(mc6.a(jb6Var.l(), null, nd6.b, 5), j, true, false, this.c, true, new tj2(0));
                    j2 = j;
                    jb6Var.o = new nd6(v);
                    this.b = new nd6(v);
                } else {
                    return;
                }
            } else {
                j2 = j;
                uf3 uf3Var2 = jb6Var.d;
                if (uf3Var2 != null && (d = uf3Var2.d()) != null) {
                    int b = d.b(j2, true);
                    jb6Var.b.c(b);
                    mc6 b2 = jb6.b(jb6Var.l().a, fy5.a(b, b));
                    jb6Var.e(false);
                    sj2 sj2Var = jb6Var.j;
                    if (sj2Var != null) {
                        ((mm4) sj2Var).a(0);
                    }
                    jb6Var.c.invoke(b2);
                    jb6Var.v = new nd6(b2.b);
                }
                this.a = false;
            }
            jb6Var.r(hj2.x);
            jb6Var.n = j2;
            jb6Var.p(new xc4(j2));
            jb6Var.p = 0L;
        }
    }

    @Override // defpackage.k96
    public final void b() {
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00e2  */
    @Override // defpackage.k96
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r10) {
        /*
            r9 = this;
            jb6 r0 = r9.d
            boolean r1 = r0.i()
            if (r1 == 0) goto Le7
            mc6 r1 = r0.l()
            ko r1 = r1.a
            java.lang.String r1 = r1.y
            int r1 = r1.length()
            if (r1 != 0) goto L18
            goto Le7
        L18:
            long r1 = r0.p
            long r10 = defpackage.xc4.f(r1, r10)
            r0.p = r10
            uf3 r10 = r0.d
            r11 = 0
            if (r10 == 0) goto Le4
            cd6 r10 = r10.d()
            if (r10 == 0) goto Le4
            long r1 = r0.n
            long r3 = r0.p
            long r1 = defpackage.xc4.f(r1, r3)
            xc4 r3 = new xc4
            r3.<init>(r1)
            r0.p(r3)
            nd6 r1 = r0.o
            r2 = 9
            if (r1 != 0) goto L92
            xc4 r1 = r0.g()
            r1.getClass()
            long r3 = r1.a
            boolean r1 = r10.c(r3)
            if (r1 != 0) goto L92
            h12 r1 = r0.b
            long r3 = r0.n
            r5 = 1
            int r3 = r10.b(r3, r5)
            r1.c(r3)
            h12 r1 = r0.b
            xc4 r4 = r0.g()
            r4.getClass()
            long r6 = r4.a
            int r10 = r10.b(r6, r5)
            r1.c(r10)
            if (r3 != r10) goto L74
            p65 r10 = defpackage.l68.K
        L72:
            r6 = r10
            goto L77
        L74:
            p65 r10 = defpackage.l68.M
            goto L72
        L77:
            mc6 r1 = r0.l()
            xc4 r10 = r0.g()
            r10.getClass()
            long r3 = r10.a
            tj2 r8 = new tj2
            r8.<init>(r2)
            r2 = r3
            r4 = 0
            r5 = 0
            r7 = 1
            long r1 = r0.v(r1, r2, r4, r5, r6, r7, r8)
            goto Ld3
        L92:
            nd6 r1 = r0.o
            if (r1 == 0) goto L9d
            long r3 = r1.a
            r1 = 32
            long r3 = r3 >> r1
            int r1 = (int) r3
            goto La3
        L9d:
            long r3 = r0.n
            int r1 = r10.b(r3, r11)
        La3:
            xc4 r3 = r0.g()
            r3.getClass()
            long r3 = r3.a
            int r10 = r10.b(r3, r11)
            nd6 r3 = r0.o
            if (r3 != 0) goto Lb7
            if (r1 != r10) goto Lb7
            goto Le7
        Lb7:
            mc6 r1 = r0.l()
            xc4 r10 = r0.g()
            r10.getClass()
            long r3 = r10.a
            p65 r6 = r9.c
            tj2 r8 = new tj2
            r8.<init>(r2)
            r2 = r3
            r4 = 0
            r5 = 0
            r7 = 1
            long r1 = r0.v(r1, r2, r4, r5, r6, r7, r8)
        Ld3:
            nd6 r10 = new nd6
            r10.<init>(r1)
            r9.b = r10
            nd6 r10 = r0.o
            boolean r10 = defpackage.nd6.b(r1, r10)
            if (r10 != 0) goto Le4
            r9.a = r11
        Le4:
            r0.u(r11)
        Le7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hb6.e(long):void");
    }

    public final void f() {
        long j;
        hj2 hj2Var;
        boolean z;
        boolean z2;
        jb6 jb6Var = this.d;
        jb6Var.q(null);
        jb6Var.p(null);
        this.c = l68.K;
        boolean z3 = true;
        jb6Var.u(true);
        nd6 nd6Var = this.b;
        if (nd6Var != null) {
            j = nd6Var.a;
        } else {
            j = jb6Var.l().b;
        }
        boolean d = nd6.d(j);
        if (d) {
            hj2Var = hj2.z;
        } else {
            hj2Var = hj2.y;
        }
        jb6Var.r(hj2Var);
        uf3 uf3Var = jb6Var.d;
        if (uf3Var != null) {
            if (!d && nu5.j(jb6Var, true)) {
                z2 = true;
            } else {
                z2 = false;
            }
            uf3Var.m.setValue(Boolean.valueOf(z2));
        }
        uf3 uf3Var2 = jb6Var.d;
        if (uf3Var2 != null) {
            if (!d && nu5.j(jb6Var, false)) {
                z = true;
            } else {
                z = false;
            }
            uf3Var2.n.setValue(Boolean.valueOf(z));
        }
        uf3 uf3Var3 = jb6Var.d;
        if (uf3Var3 != null) {
            if (!d || !nu5.j(jb6Var, true)) {
                z3 = false;
            }
            uf3Var3.o.setValue(Boolean.valueOf(z3));
        }
        if (this.a) {
            jb6Var.n(jb6Var.o);
        }
        jb6Var.o = null;
    }

    @Override // defpackage.k96
    public final void onCancel() {
        f();
    }

    @Override // defpackage.k96
    public final void c() {
    }

    @Override // defpackage.k96
    public final void d() {
    }
}
