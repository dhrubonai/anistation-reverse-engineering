package defpackage;

import android.content.ClipDescription;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cc6 {
    public final gi6 a;
    public final dd6 b;
    public ud1 c;
    public final fg6 d;
    public final v11 e;
    public final bn4 f;
    public kn0 g;
    public boolean h;
    public boolean i;
    public sj2 j;
    public sb2 l;
    public sb2 m;
    public final ti4 r;
    public final ti4 s;
    public final ti4 t;
    public u98 u;
    public int v;
    public qt4 w;
    public final he1 x;
    public final mn0 y;
    public final ti4 k = xt5.g(Boolean.TRUE);
    public final ti4 n = xt5.g(new xc4(9205357640488583168L));
    public final ti4 o = xt5.g(new xc4(9205357640488583168L));
    public final ti4 p = xt5.g(null);
    public final ti4 q = xt5.g(rb6.x);

    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, mn0] */
    public cc6(gi6 gi6Var, dd6 dd6Var, ud1 ud1Var, boolean z, fg6 fg6Var, v11 v11Var, bn4 bn4Var, kn0 kn0Var) {
        this.a = gi6Var;
        this.b = dd6Var;
        this.c = ud1Var;
        this.d = fg6Var;
        this.e = v11Var;
        this.f = bn4Var;
        this.g = kn0Var;
        this.i = z;
        Boolean bool = Boolean.FALSE;
        this.r = xt5.g(bool);
        this.s = xt5.g(be6.x);
        this.t = xt5.g(bool);
        this.v = -1;
        this.x = ut5.b(new g40(this, (byte) 3));
        kn0 kn0Var2 = this.g;
        ?? obj = new Object();
        obj.y = kn0Var2;
        this.y = obj;
    }

    public static final void f(v05 v05Var, v05 v05Var2, cc6 cc6Var) {
        if ((v05Var.x & 9223372034707292159L) != 9205357640488583168L) {
            v05Var.x = 9205357640488583168L;
            v05Var2.x = 9205357640488583168L;
            cc6Var.b();
        }
    }

    public static final void h(v05 v05Var, v05 v05Var2, cc6 cc6Var) {
        if ((v05Var.x & 9223372034707292159L) != 9205357640488583168L) {
            cc6Var.b();
            v05Var.x = 9205357640488583168L;
            v05Var2.x = 0L;
            cc6Var.v = -1;
        }
    }

    public final void A(cj2 cj2Var, long j) {
        this.p.setValue(cj2Var);
        this.o.setValue(new xc4(j));
    }

    public final long B(p96 p96Var, int i, int i2, boolean z, p65 p65Var, boolean z2, boolean z3, tj2 tj2Var) {
        long j;
        boolean z4;
        long a;
        int i3;
        sj2 sj2Var;
        long j2 = p96Var.B;
        nd6 nd6Var = new nd6(j2);
        if (z3 || (!z2 && nd6.d(j2))) {
            nd6Var = null;
        }
        bd6 c = this.b.c();
        if (c == null) {
            a = nd6.b;
        } else if (nd6Var == null && a34.i(p65Var, l68.L)) {
            a = fy5.a(i, i2);
        } else {
            int i4 = this.v;
            if (nd6Var != null) {
                j = nd6Var.a;
            } else {
                j = nd6.b;
            }
            long j3 = j;
            if (nd6Var == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            u98 y = kb0.y(c, i, i2, i4, j3, z4, z);
            if (nd6Var != null && !y.j(this.u)) {
                a = nd6Var.a;
            } else {
                yg5 a2 = p65Var.a(y);
                a = fy5.a(a2.a.b, a2.b.b);
                this.u = y;
                if (z) {
                    i3 = i;
                } else {
                    i3 = i2;
                }
                this.v = i3;
            }
        }
        if (tj2Var != null && ((nd6.g(a) != nd6.g(j2) || nd6.f(a) != nd6.f(j2)) && (sj2Var = this.j) != null)) {
            ((mm4) sj2Var).a(tj2Var.a);
        }
        return a;
    }

    public final n05 a(bd6 bd6Var, p96 p96Var) {
        float f;
        float rint;
        if (!nd6.d(p96Var.B)) {
            return n05.e;
        }
        n05 c = bd6Var.c((int) (p96Var.B >> 32));
        float floor = (float) Math.floor(this.c.g0(2.0f));
        if (floor < 1.0f) {
            floor = 1.0f;
        }
        if (bd6Var.a.h == ia3.x) {
            f = (floor / 2.0f) + c.a;
        } else {
            f = c.c - (floor / 2.0f);
        }
        float f2 = floor / 2.0f;
        float f3 = ((int) (bd6Var.c >> 32)) - f2;
        if (f > f3) {
            f = f3;
        }
        if (f < f2) {
            f = f2;
        }
        if (((int) floor) % 2 == 1) {
            rint = ((float) Math.floor(f)) + 0.5f;
        } else {
            rint = (float) Math.rint(f);
        }
        return new n05(rint - f2, c.b, rint + f2, c.d);
    }

    public final void b() {
        this.p.setValue(null);
        this.o.setValue(new xc4(9205357640488583168L));
        this.n.setValue(new xc4(9205357640488583168L));
    }

    public final pn6 c(boolean z, t36 t36Var) {
        ko koVar;
        gi6 gi6Var = this.a;
        if (!nd6.d(gi6Var.d().B)) {
            p96 d = gi6Var.d();
            koVar = new ko(d.A.subSequence(nd6.g(d.B), nd6.f(d.B)).toString());
            if (z) {
                gi6Var.a();
            }
        } else {
            koVar = null;
        }
        pn6 pn6Var = pn6.a;
        if (koVar == null) {
            return pn6Var;
        }
        ((x9) this.g).a(q23.T(koVar));
        return pn6Var;
    }

    public final pn6 d(t36 t36Var) {
        ko koVar;
        gi6 gi6Var = this.a;
        if (!nd6.d(gi6Var.d().B) && m()) {
            p96 d = gi6Var.d();
            koVar = new ko(d.A.subSequence(nd6.g(d.B), nd6.f(d.B)).toString());
            gi6Var.c(false);
        } else {
            koVar = null;
        }
        pn6 pn6Var = pn6.a;
        if (koVar == null) {
            return pn6Var;
        }
        ((x9) this.g).a(q23.T(koVar));
        return pn6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, v05] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, v05] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.yq4 r9, defpackage.xz0 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.ub6
            if (r0 == 0) goto L14
            r0 = r10
            ub6 r0 = (defpackage.ub6) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.B = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            ub6 r0 = new ub6
            r0.<init>(r8, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.z
            int r0 = r6.B
            r1 = 1
            if (r0 == 0) goto L35
            if (r0 != r1) goto L2e
            v05 r9 = r6.y
            v05 r1 = r6.x
            defpackage.m37.N(r10)     // Catch: java.lang.Throwable -> L2b
            goto L75
        L2b:
            r0 = move-exception
            r10 = r0
            goto L80
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r8)
            r8 = 0
            return r8
        L35:
            defpackage.m37.N(r10)
            v05 r10 = new v05
            r10.<init>()
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r10.x = r2
            v05 r7 = new v05
            r7.<init>()
            r7.x = r2
            qb6 r2 = new qb6     // Catch: java.lang.Throwable -> L7b
            r0 = 0
            r2.<init>(r10, r8, r7, r0)     // Catch: java.lang.Throwable -> L7b
            pb6 r3 = new pb6     // Catch: java.lang.Throwable -> L7b
            r3.<init>(r10, r7, r8, r1)     // Catch: java.lang.Throwable -> L7b
            pb6 r4 = new pb6     // Catch: java.lang.Throwable -> L7b
            r0 = 2
            r4.<init>(r10, r7, r8, r0)     // Catch: java.lang.Throwable -> L7b
            df r5 = new df     // Catch: java.lang.Throwable -> L7b
            r0 = 13
            r5.<init>(r7, r8, r10, r0)     // Catch: java.lang.Throwable -> L7b
            r6.x = r10     // Catch: java.lang.Throwable -> L7b
            r6.y = r7     // Catch: java.lang.Throwable -> L7b
            r6.B = r1     // Catch: java.lang.Throwable -> L7b
            r1 = r9
            java.lang.Object r9 = defpackage.bo1.d(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L7b
            w11 r0 = defpackage.w11.x
            if (r9 != r0) goto L73
            return r0
        L73:
            r1 = r10
            r9 = r7
        L75:
            f(r1, r9, r8)
            pn6 r8 = defpackage.pn6.a
            return r8
        L7b:
            r0 = move-exception
            r9 = r0
            r1 = r10
            r10 = r9
            r9 = r7
        L80:
            f(r1, r9, r8)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cc6.e(yq4, xz0):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r1v12, types: [v05] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, v05] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, v05] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v5, types: [v05] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.yq4 r14, boolean r15, defpackage.xz0 r16) {
        /*
            Method dump skipped, instructions count: 194
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cc6.g(yq4, boolean, xz0):java.lang.Object");
    }

    public final Object i(yq4 yq4Var, t36 t36Var) {
        Object a1 = ((a46) yq4Var).a1(new f50(this, null, (byte) 2), t36Var);
        if (a1 == w11.x) {
            return a1;
        }
        return pn6.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        if (r4 != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ja6 j(boolean r12) {
        /*
            r11 = this;
            gi6 r0 = r11.a
            p96 r0 = r0.d()
            ti4 r1 = r11.r
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            ti4 r2 = r11.q
            java.lang.Object r2 = r2.getValue()
            rb6 r2 = (defpackage.rb6) r2
            rb6 r3 = defpackage.rb6.x
            r4 = 0
            if (r2 != r3) goto L21
            r2 = 1
            goto L22
        L21:
            r2 = r4
        L22:
            cj2 r3 = r11.l()
            if (r1 == 0) goto L93
            if (r2 == 0) goto L93
            long r1 = r0.B
            boolean r1 = defpackage.nd6.d(r1)
            if (r1 == 0) goto L93
            ai4 r1 = r0.D
            if (r1 != 0) goto L93
            java.lang.CharSequence r0 = r0.A
            int r0 = r0.length()
            if (r0 <= 0) goto L93
            cj2 r0 = defpackage.cj2.x
            if (r3 == r0) goto L76
            ft5 r1 = defpackage.et5.b()
            if (r1 == 0) goto L4e
            ub2 r0 = r1.e()
        L4c:
            r2 = r0
            goto L50
        L4e:
            r0 = 0
            goto L4c
        L50:
            ft5 r3 = defpackage.et5.e(r1)
            n05 r0 = r11.k()     // Catch: java.lang.Throwable -> L70
            long r5 = r0.c()     // Catch: java.lang.Throwable -> L70
            defpackage.et5.k(r1, r3, r2)
            ha3 r0 = r11.q()
            if (r0 == 0) goto L6d
            n05 r0 = defpackage.sw0.O(r0)
            boolean r4 = defpackage.sw0.k(r5, r0)
        L6d:
            if (r4 == 0) goto L93
            goto L76
        L70:
            r0 = move-exception
            r11 = r0
            defpackage.et5.k(r1, r3, r2)
            throw r11
        L76:
            ja6 r4 = new ja6
            if (r12 == 0) goto L84
            n05 r11 = r11.k()
            long r11 = r11.c()
        L82:
            r6 = r11
            goto L8a
        L84:
            r11 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            goto L82
        L8a:
            c45 r9 = defpackage.c45.x
            r10 = 0
            r5 = 1
            r8 = 0
            r4.<init>(r5, r6, r8, r9, r10)
            return r4
        L93:
            ja6 r11 = defpackage.ja6.f
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cc6.j(boolean):ja6");
    }

    public final n05 k() {
        bd6 c = this.b.c();
        if (c == null) {
            return n05.e;
        }
        return a(c, this.a.d());
    }

    public final cj2 l() {
        return (cj2) this.p.getValue();
    }

    public final boolean m() {
        if (this.i) {
            return true;
        }
        return false;
    }

    public final long n() {
        ti4 ti4Var = this.o;
        long j = 9205357640488583168L;
        if ((((xc4) ti4Var.getValue()).a & 9223372034707292159L) == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        ti4 ti4Var2 = this.n;
        if ((((xc4) ti4Var2.getValue()).a & 9223372034707292159L) == 9205357640488583168L) {
            return rv5.c(this.b, ((xc4) ti4Var.getValue()).a);
        }
        long j2 = ((xc4) ti4Var.getValue()).a;
        long j3 = ((xc4) ti4Var2.getValue()).a;
        ha3 q = q();
        if (q != null) {
            j = q.d(0L);
        }
        return xc4.f(j2, xc4.e(j3, j));
    }

    public final long o(boolean z) {
        long j;
        bd6 c = this.b.c();
        if (c == null) {
            return 0L;
        }
        long j2 = this.a.d().B;
        if (z) {
            int i = nd6.c;
            j = j2 >> 32;
        } else {
            int i2 = nd6.c;
            j = 4294967295L & j2;
        }
        return gy5.g(c, (int) j, z, nd6.h(j2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        if (r1 != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ja6 p(boolean r18, boolean r19) {
        /*
            r17 = this;
            r0 = r17
            if (r18 == 0) goto L7
            cj2 r1 = defpackage.cj2.y
            goto L9
        L7:
            cj2 r1 = defpackage.cj2.z
        L9:
            dd6 r2 = r0.b
            bd6 r2 = r2.c()
            ja6 r3 = defpackage.ja6.f
            if (r2 != 0) goto L14
            return r3
        L14:
            gi6 r4 = r0.a
            p96 r5 = r4.d()
            long r5 = r5.B
            boolean r7 = defpackage.nd6.d(r5)
            if (r7 == 0) goto L23
            return r3
        L23:
            long r7 = r17.o(r18)
            ti4 r9 = r0.q
            java.lang.Object r9 = r9.getValue()
            rb6 r9 = (defpackage.rb6) r9
            rb6 r10 = defpackage.rb6.x
            if (r9 != r10) goto L9e
            cj2 r9 = r0.l()
            r10 = 0
            if (r9 == r1) goto L4c
            ha3 r1 = r0.q()
            if (r1 == 0) goto L49
            n05 r1 = defpackage.sw0.O(r1)
            boolean r1 = defpackage.sw0.k(r7, r1)
            goto L4a
        L49:
            r1 = r10
        L4a:
            if (r1 == 0) goto L9e
        L4c:
            p96 r1 = r4.d()
            ai4 r1 = r1.D
            if (r1 != 0) goto L9e
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r1 = 32
            if (r18 == 0) goto L61
            long r9 = r5 >> r1
            int r9 = (int) r9
            goto L6a
        L61:
            long r11 = r5 & r3
            int r9 = (int) r11
            int r9 = r9 + (-1)
            int r9 = java.lang.Math.max(r9, r10)
        L6a:
            c45 r15 = r2.a(r9)
            boolean r16 = defpackage.nd6.h(r5)
            if (r19 == 0) goto L84
            ha3 r0 = r0.q()
            if (r0 == 0) goto L82
            n05 r0 = defpackage.sw0.O(r0)
            long r7 = defpackage.rv5.b(r7, r0)
        L82:
            r12 = r7
            goto L8a
        L84:
            r7 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            goto L82
        L8a:
            if (r18 == 0) goto L90
            long r0 = r5 >> r1
        L8e:
            int r0 = (int) r0
            goto L93
        L90:
            long r0 = r5 & r3
            goto L8e
        L93:
            ja6 r10 = new ja6
            r11 = 1
            float r14 = defpackage.ov5.b(r2, r0)
            r10.<init>(r11, r12, r14, r15, r16)
            return r10
        L9e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cc6.p(boolean, boolean):ja6");
    }

    public final ha3 q() {
        ha3 e = this.b.e();
        if (e != null && e.m()) {
            return e;
        }
        return null;
    }

    public final void r() {
        bn4 bn4Var = this.f;
        if (bn4Var != null) {
            gi6 gi6Var = this.a;
            CharSequence charSequence = gi6Var.d().A;
            long j = gi6Var.d().B;
            if (charSequence.length() > 0 && !nd6.d(j)) {
                tl7.z(this.e, null, y11.A, new q02(bn4Var, charSequence, j, this, (vz0) null), 1);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(boolean r7, defpackage.xz0 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.yb6
            if (r0 == 0) goto L13
            r0 = r8
            yb6 r0 = (defpackage.yb6) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            yb6 r0 = new yb6
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.x
            int r1 = r0.z
            pn6 r2 = defpackage.pn6.a
            r3 = 0
            r4 = 1
            w11 r5 = defpackage.w11.x
            if (r1 == 0) goto L51
            if (r1 == r4) goto L4d
            r7 = 2
            r4 = 3
            if (r1 == r7) goto L36
            if (r1 != r4) goto L30
            defpackage.m37.N(r8)
            return r2
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r6)
            return r3
        L36:
            defpackage.m37.N(r8)
            in0 r8 = (defpackage.in0) r8
            if (r8 != 0) goto L47
            r0.z = r4
            r7 = 0
            java.lang.Object r6 = r6.t(r7, r0)
            if (r6 != r5) goto L6c
            goto L6b
        L47:
            android.content.ClipData r6 = r8.a
            r6.getDescription()
            throw r3
        L4d:
            defpackage.m37.N(r8)
            return r2
        L51:
            defpackage.m37.N(r8)
            sb2 r8 = r6.m
            if (r8 == 0) goto L63
            java.lang.Object r8 = r8.invoke()
            if (r8 != 0) goto L5f
            goto L63
        L5f:
            defpackage.ov3.d()
            return r3
        L63:
            r0.z = r4
            java.lang.Object r6 = r6.t(r7, r0)
            if (r6 != r5) goto L6c
        L6b:
            return r5
        L6c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cc6.s(boolean, xz0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
    
        if (r10 == r7) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
    
        if (r10 == r7) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(boolean r9, defpackage.xz0 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.zb6
            if (r0 == 0) goto L13
            r0 = r10
            zb6 r0 = (defpackage.zb6) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            zb6 r0 = new zb6
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.y
            int r1 = r0.A
            r2 = 0
            r3 = 0
            pn6 r4 = defpackage.pn6.a
            r5 = 2
            r6 = 1
            w11 r7 = defpackage.w11.x
            if (r1 == 0) goto L3c
            if (r1 == r6) goto L36
            if (r1 != r5) goto L30
            boolean r9 = r0.x
            defpackage.m37.N(r10)
            goto L7d
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r8)
            return r3
        L36:
            boolean r9 = r0.x
            defpackage.m37.N(r10)
            goto L5e
        L3c:
            defpackage.m37.N(r10)
            kn0 r10 = r8.g
            r0.x = r9
            r0.A = r6
            x9 r10 = (defpackage.x9) r10
            pz2 r10 = r10.a
            android.content.ClipboardManager r10 = r10.s()
            android.content.ClipData r10 = r10.getPrimaryClip()
            if (r10 == 0) goto L5a
            in0 r1 = new in0
            r1.<init>(r10)
            r10 = r1
            goto L5b
        L5a:
            r10 = r3
        L5b:
            if (r10 != r7) goto L5e
            goto L7c
        L5e:
            in0 r10 = (defpackage.in0) r10
            if (r10 == 0) goto L89
            r0.x = r9
            r0.A = r5
            android.content.ClipData r10 = r10.a
            android.content.ClipData$Item r10 = r10.getItemAt(r2)
            if (r10 == 0) goto L79
            java.lang.CharSequence r10 = r10.getText()
            if (r10 == 0) goto L79
            java.lang.String r10 = r10.toString()
            goto L7a
        L79:
            r10 = r3
        L7a:
            if (r10 != r7) goto L7d
        L7c:
            return r7
        L7d:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 != 0) goto L82
            goto L89
        L82:
            gi6 r8 = r8.a
            r0 = 10
            defpackage.gi6.h(r8, r10, r2, r9, r0)
        L89:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cc6.t(boolean, xz0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean u(long r20) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cc6.u(long):boolean");
    }

    public final void v(boolean z) {
        this.k.setValue(Boolean.valueOf(z));
    }

    public final void w(boolean z) {
        this.r.setValue(Boolean.valueOf(z));
    }

    public final void x(be6 be6Var) {
        this.s.setValue(be6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(defpackage.xz0 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.bc6
            if (r0 == 0) goto L13
            r0 = r9
            bc6 r0 = (defpackage.bc6) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            bc6 r0 = new bc6
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.x
            int r1 = r0.z
            fg6 r2 = r8.d
            be6 r3 = defpackage.be6.x
            ti4 r4 = r8.s
            r5 = 0
            r6 = 0
            r7 = 1
            if (r1 == 0) goto L35
            if (r1 != r7) goto L2f
            defpackage.m37.N(r9)     // Catch: java.lang.Throwable -> L2d
            goto L4a
        L2d:
            r9 = move-exception
            goto L68
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r8)
            return r5
        L35:
            defpackage.m37.N(r9)
            yh r9 = new yh     // Catch: java.lang.Throwable -> L2d
            r1 = 25
            r9.<init>(r8, r5, r1)     // Catch: java.lang.Throwable -> L2d
            r0.z = r7     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r9 = defpackage.db.K(r9, r0)     // Catch: java.lang.Throwable -> L2d
            w11 r0 = defpackage.w11.x
            if (r9 != r0) goto L4a
            return r0
        L4a:
            h43 r9 = (defpackage.h43) r9     // Catch: java.lang.Throwable -> L2d
            r8.w(r6)
            java.lang.Object r8 = r4.getValue()
            be6 r8 = (defpackage.be6) r8
            if (r8 == r3) goto L65
            f96 r8 = r2.a
            if (r8 == 0) goto L65
            bx5 r9 = r8.R
            if (r9 != 0) goto L60
            goto L65
        L60:
            r9.l(r5)
            r8.R = r5
        L65:
            pn6 r8 = defpackage.pn6.a
            return r8
        L68:
            r8.w(r6)
            java.lang.Object r8 = r4.getValue()
            be6 r8 = (defpackage.be6) r8
            if (r8 == r3) goto L81
            f96 r8 = r2.a
            if (r8 == 0) goto L81
            bx5 r0 = r8.R
            if (r0 != 0) goto L7c
            goto L81
        L7c:
            r0.l(r5)
            r8.R = r5
        L81:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cc6.y(xz0):java.lang.Object");
    }

    public final pn6 z() {
        ClipDescription primaryClipDescription;
        mn0 mn0Var = this.y;
        kn0 kn0Var = (kn0) mn0Var.y;
        boolean z = false;
        if (n03.t(kn0Var).hasPrimaryClip() && (primaryClipDescription = n03.t(kn0Var).getPrimaryClipDescription()) != null && primaryClipDescription.hasMimeType("text/*")) {
            z = true;
        }
        mn0Var.x = z;
        return pn6.a;
    }
}
