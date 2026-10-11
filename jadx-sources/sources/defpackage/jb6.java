package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jb6 {
    public boolean A;
    public final in6 a;
    public uf3 d;
    public sb2 f;
    public kn0 g;
    public v11 h;
    public bn4 i;
    public sj2 j;
    public w72 k;
    public final ti4 l;
    public final ti4 m;
    public long n;
    public nd6 o;
    public long p;
    public final ti4 q;
    public final ti4 r;
    public int s;
    public mc6 t;
    public u98 u;
    public nd6 v;
    public final ti4 w;
    public final fg6 x;
    public final hb6 y;
    public final u98 z;
    public h12 b = h98.s;
    public ub2 c = new ka6((byte) 3);
    public final ti4 e = xt5.g(new mc6(0, 7, (String) null));

    public jb6(in6 in6Var) {
        this.a = in6Var;
        Boolean bool = Boolean.TRUE;
        this.l = xt5.g(bool);
        this.m = xt5.g(bool);
        this.n = 0L;
        this.p = 0L;
        this.q = xt5.g(null);
        this.r = xt5.g(null);
        this.s = -1;
        this.t = new mc6(0L, 7, (String) null);
        this.w = xt5.g(Boolean.FALSE);
        this.x = new fg6();
        this.y = new hb6(this);
        this.z = new u98(this);
    }

    public static mc6 b(ko koVar, long j) {
        return new mc6(koVar, j, (nd6) null);
    }

    public final bx5 a(boolean z) {
        v11 v11Var = this.h;
        vz0 vz0Var = null;
        if (v11Var == null) {
            return null;
        }
        return tl7.z(v11Var, null, y11.A, new sm1((Object) this, z, vz0Var, (byte) 2), 1);
    }

    public final void c() {
        v11 v11Var = this.h;
        if (v11Var != null) {
            tl7.z(v11Var, null, y11.A, new hu1(this, null, (byte) 29), 1);
        }
    }

    public final void d(xc4 xc4Var) {
        hj2 hj2Var;
        cd6 cd6Var;
        int f;
        if (!nd6.d(l().b)) {
            uf3 uf3Var = this.d;
            if (uf3Var != null) {
                cd6Var = uf3Var.d();
            } else {
                cd6Var = null;
            }
            if (xc4Var != null && cd6Var != null) {
                h12 h12Var = this.b;
                f = cd6Var.b(xc4Var.a, true);
                h12Var.c(f);
            } else {
                f = nd6.f(l().b);
            }
            mc6 a = mc6.a(l(), null, fy5.a(f, f), 5);
            this.c.invoke(a);
            this.v = new nd6(a.b);
        }
        if (xc4Var != null && l().a.y.length() > 0) {
            hj2Var = hj2.z;
        } else {
            hj2Var = hj2.x;
        }
        r(hj2Var);
        u(false);
    }

    public final void e(boolean z) {
        w72 w72Var;
        uf3 uf3Var = this.d;
        if (uf3Var != null && !uf3Var.b() && (w72Var = this.k) != null) {
            w72.a(w72Var);
        }
        this.t = l();
        u(z);
        r(hj2.y);
    }

    public final ai4 f() {
        String str;
        nd6 nd6Var;
        ko k = k();
        if (k != null && (str = k.y) != null && (nd6Var = this.v) != null) {
            long j = nd6Var.a;
            int i = (int) (j >> 32);
            this.b.b(i);
            int i2 = (int) (j & 4294967295L);
            this.b.b(i2);
            return new ai4(str, new nd6(fy5.a(i, i2)));
        }
        return null;
    }

    public final xc4 g() {
        return (xc4) this.r.getValue();
    }

    public final boolean h() {
        return ((Boolean) this.l.getValue()).booleanValue();
    }

    public final boolean i() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    public final long j(boolean z) {
        cd6 d;
        long j;
        uf3 uf3Var = this.d;
        if (uf3Var != null && (d = uf3Var.d()) != null) {
            bd6 bd6Var = d.a;
            ko k = k();
            if (k != null) {
                if (a34.i(k.y, bd6Var.a.a.y)) {
                    mc6 l = l();
                    if (z) {
                        long j2 = l.b;
                        int i = nd6.c;
                        j = j2 >> 32;
                    } else {
                        long j3 = l.b;
                        int i2 = nd6.c;
                        j = j3 & 4294967295L;
                    }
                    int i3 = (int) j;
                    this.b.b(i3);
                    return gy5.g(bd6Var, i3, z, nd6.h(l().b));
                }
                return 9205357640488583168L;
            }
            return 9205357640488583168L;
        }
        return 9205357640488583168L;
    }

    public final ko k() {
        uf3 uf3Var = this.d;
        if (uf3Var != null) {
            return (ko) uf3Var.a.b;
        }
        return null;
    }

    public final mc6 l() {
        return (mc6) this.e.getValue();
    }

    public final void m() {
        bx5 bx5Var;
        f96 f96Var = this.x.a;
        if (f96Var != null && (bx5Var = f96Var.R) != null) {
            bx5Var.l(null);
            f96Var.R = null;
        }
    }

    public final void n(nd6 nd6Var) {
        ko k;
        String str;
        v11 v11Var;
        if (nd6Var != null) {
            long j = nd6Var.a;
            bn4 bn4Var = this.i;
            if (bn4Var != null && (k = k()) != null && (str = k.y) != null) {
                h12 h12Var = this.b;
                int i = (int) (j >> 32);
                h12Var.b(i);
                int i2 = (int) (j & 4294967295L);
                h12Var.b(i2);
                long a = fy5.a(i, i2);
                if (str.length() > 0 && !nd6.d(a) && (v11Var = this.h) != null) {
                    tl7.z(v11Var, null, null, new ny0(bn4Var, str, a, nd6Var, this, h12Var, null), 3);
                }
            }
        }
    }

    public final void o() {
        v11 v11Var = this.h;
        if (v11Var != null) {
            tl7.z(v11Var, null, y11.A, new db6(this, null, (byte) 1), 1);
        }
    }

    public final void p(xc4 xc4Var) {
        this.r.setValue(xc4Var);
    }

    public final void q(cj2 cj2Var) {
        this.q.setValue(cj2Var);
    }

    public final void r(hj2 hj2Var) {
        uf3 uf3Var = this.d;
        if (uf3Var != null) {
            if (uf3Var.a() == hj2Var) {
                uf3Var = null;
            }
            if (uf3Var != null) {
                uf3Var.k.setValue(hj2Var);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (((java.lang.Boolean) r3.q.getValue()).booleanValue() == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            r4 = this;
            ft5 r0 = defpackage.et5.b()
            if (r0 == 0) goto Lb
            ub2 r1 = r0.e()
            goto Lc
        Lb:
            r1 = 0
        Lc:
            ft5 r2 = defpackage.et5.e(r0)
            boolean r3 = r4.i()     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L34
            uf3 r3 = r4.d     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L29
            ti4 r3 = r3.q     // Catch: java.lang.Throwable -> L32
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L32
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L32
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L32
            if (r3 != 0) goto L29
            goto L34
        L29:
            defpackage.et5.k(r0, r2, r1)
            fg6 r4 = r4.x
            r4.a()
            return
        L32:
            r4 = move-exception
            goto L38
        L34:
            defpackage.et5.k(r0, r2, r1)
            return
        L38:
            defpackage.et5.k(r0, r2, r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jb6.s():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(defpackage.xz0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.ib6
            if (r0 == 0) goto L13
            r0 = r5
            ib6 r0 = (defpackage.ib6) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            ib6 r0 = new ib6
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.y
            int r1 = r0.A
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            jb6 r4 = r0.x
            defpackage.m37.N(r5)
            goto L54
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.m37.N(r5)
            kn0 r5 = r4.g
            if (r5 == 0) goto L5e
            r0.x = r4
            r0.A = r2
            android.content.ClipboardManager r5 = defpackage.n03.t(r5)
            android.content.ClipDescription r5 = r5.getPrimaryClipDescription()
            if (r5 != 0) goto L45
            r5 = 0
            goto L4b
        L45:
            java.lang.String r0 = "text/*"
            boolean r5 = r5.hasMimeType(r0)
        L4b:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            w11 r0 = defpackage.w11.x
            if (r5 != r0) goto L54
            return r0
        L54:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r5.getClass()
            ti4 r4 = r4.w
            r4.setValue(r5)
        L5e:
            pn6 r4 = defpackage.pn6.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jb6.t(xz0):java.lang.Object");
    }

    public final void u(boolean z) {
        uf3 uf3Var = this.d;
        if (uf3Var != null) {
            uf3Var.l.setValue(Boolean.valueOf(z));
        }
        if (z) {
            s();
        } else {
            m();
        }
    }

    public final long v(mc6 mc6Var, long j, boolean z, boolean z2, p65 p65Var, boolean z3, tj2 tj2Var) {
        cd6 d;
        int i;
        int i2;
        int i3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        sj2 sj2Var;
        uf3 uf3Var = this.d;
        if (uf3Var != null && (d = uf3Var.d()) != null) {
            h12 h12Var = this.b;
            long j2 = mc6Var.b;
            ko koVar = mc6Var.a;
            int i4 = nd6.c;
            int i5 = (int) (j2 >> 32);
            h12Var.b(i5);
            int i6 = (int) (j2 & 4294967295L);
            this.b.b(i6);
            long a = fy5.a(i5, i6);
            boolean z8 = false;
            int b = d.b(j, false);
            if (!z2 && !z) {
                i = (int) (a >> 32);
            } else {
                i = b;
            }
            if (z2 && !z) {
                i2 = (int) (a & 4294967295L);
            } else {
                i2 = b;
            }
            u98 u98Var = this.u;
            if (z || u98Var == null || (i3 = this.s) == -1) {
                i3 = -1;
            }
            u98 y = kb0.y(d.a, i, i2, i3, a, z, z2);
            if (y.j(u98Var)) {
                this.u = y;
                this.s = b;
                yg5 a2 = p65Var.a(y);
                h12 h12Var2 = this.b;
                int i7 = a2.a.b;
                h12Var2.c(i7);
                h12 h12Var3 = this.b;
                int i8 = a2.b.b;
                h12Var3.c(i8);
                long a3 = fy5.a(i7, i8);
                if (!nd6.c(a3, j2)) {
                    if (nd6.h(a3) != nd6.h(j2) && nd6.c(fy5.a((int) (a3 & 4294967295L), (int) (a3 >> 32)), j2)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (nd6.d(a3) && nd6.d(j2)) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z3 && koVar.y.length() > 0 && !z4 && !z5 && tj2Var != null && (sj2Var = this.j) != null) {
                        ((mm4) sj2Var).a(tj2Var.a);
                    }
                    this.c.invoke(b(koVar, a3));
                    this.v = new nd6(a3);
                    if (!z3) {
                        u(!nd6.d(a3));
                    }
                    uf3 uf3Var2 = this.d;
                    if (uf3Var2 != null) {
                        uf3Var2.q.setValue(Boolean.valueOf(z3));
                    }
                    uf3 uf3Var3 = this.d;
                    if (uf3Var3 != null) {
                        if (!nd6.d(a3) && nu5.j(this, true)) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        uf3Var3.m.setValue(Boolean.valueOf(z7));
                    }
                    uf3 uf3Var4 = this.d;
                    if (uf3Var4 != null) {
                        if (!nd6.d(a3) && nu5.j(this, false)) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        uf3Var4.n.setValue(Boolean.valueOf(z6));
                    }
                    uf3 uf3Var5 = this.d;
                    if (uf3Var5 != null) {
                        if (nd6.d(a3) && nu5.j(this, true)) {
                            z8 = true;
                        }
                        uf3Var5.o.setValue(Boolean.valueOf(z8));
                    }
                    return a3;
                }
            }
            return j2;
        }
        return nd6.b;
    }
}
