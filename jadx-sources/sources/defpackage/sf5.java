package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sf5 extends qt0 {
    public static final nl P = new nl(0.0f);
    public static final nl Q = new nl(1.0f);
    public Object A;
    public xi6 B;
    public long C;
    public final nj4 D;
    public eu5 E;
    public final pi4 F;
    public qg0 G;
    public final m54 H;
    public final j54 I;
    public long J;
    public final f44 K;
    public lf5 L;
    public final kf5 M;
    public float N;
    public final kf5 O;
    public final ti4 y;
    public final ti4 z;

    /* JADX WARN: Type inference failed for: r3v6, types: [kf5] */
    /* JADX WARN: Type inference failed for: r3v7, types: [kf5] */
    public sf5(Object obj) {
        super((byte) 6);
        this.y = xt5.g(obj);
        this.z = xt5.g(obj);
        this.A = obj;
        this.D = new nj4(this, (byte) 16);
        this.F = new pi4(0.0f);
        this.H = new m54();
        this.I = new j54();
        this.J = Long.MIN_VALUE;
        this.K = new f44();
        final byte b = 0;
        this.M = new ub2(this) { // from class: kf5
            public final /* synthetic */ sf5 y;

            {
                this.y = this;
            }

            @Override // defpackage.ub2
            public final Object invoke(Object obj2) {
                byte b2 = b;
                pn6 pn6Var = pn6.a;
                sf5 sf5Var = this.y;
                long longValue = ((Long) obj2).longValue();
                switch (b2) {
                    case 0:
                        sf5Var.J = longValue;
                        return pn6Var;
                    default:
                        long j = longValue - sf5Var.J;
                        sf5Var.J = longValue;
                        long i0 = io3.i0(j / sf5Var.N);
                        f44 f44Var = sf5Var.K;
                        if (f44Var.j()) {
                            Object[] objArr = f44Var.a;
                            int i = f44Var.b;
                            int i2 = 0;
                            for (int i3 = 0; i3 < i; i3++) {
                                lf5 lf5Var = (lf5) objArr[i3];
                                sf5.P(lf5Var, i0);
                                lf5Var.c = true;
                            }
                            xi6 xi6Var = sf5Var.B;
                            if (xi6Var != null) {
                                xi6Var.q();
                            }
                            int i4 = f44Var.b;
                            Object[] objArr2 = f44Var.a;
                            f13 r0 = db.r0(0, i4);
                            int i5 = r0.x;
                            int i6 = r0.y;
                            if (i5 <= i6) {
                                while (true) {
                                    objArr2[i5 - i2] = objArr2[i5];
                                    if (((lf5) objArr2[i5]).c) {
                                        i2++;
                                    }
                                    if (i5 != i6) {
                                        i5++;
                                    }
                                }
                            }
                            ms.E0(i4 - i2, i4, null, objArr2);
                            f44Var.b -= i2;
                        }
                        lf5 lf5Var2 = sf5Var.L;
                        if (lf5Var2 != null) {
                            lf5Var2.g = sf5Var.C;
                            sf5.P(lf5Var2, i0);
                            sf5Var.T(lf5Var2.d);
                            if (lf5Var2.d == 1.0f) {
                                sf5Var.L = null;
                            }
                            sf5Var.S();
                        }
                        return pn6Var;
                }
            }
        };
        final byte b2 = 1;
        this.O = new ub2(this) { // from class: kf5
            public final /* synthetic */ sf5 y;

            {
                this.y = this;
            }

            @Override // defpackage.ub2
            public final Object invoke(Object obj2) {
                byte b22 = b2;
                pn6 pn6Var = pn6.a;
                sf5 sf5Var = this.y;
                long longValue = ((Long) obj2).longValue();
                switch (b22) {
                    case 0:
                        sf5Var.J = longValue;
                        return pn6Var;
                    default:
                        long j = longValue - sf5Var.J;
                        sf5Var.J = longValue;
                        long i0 = io3.i0(j / sf5Var.N);
                        f44 f44Var = sf5Var.K;
                        if (f44Var.j()) {
                            Object[] objArr = f44Var.a;
                            int i = f44Var.b;
                            int i2 = 0;
                            for (int i3 = 0; i3 < i; i3++) {
                                lf5 lf5Var = (lf5) objArr[i3];
                                sf5.P(lf5Var, i0);
                                lf5Var.c = true;
                            }
                            xi6 xi6Var = sf5Var.B;
                            if (xi6Var != null) {
                                xi6Var.q();
                            }
                            int i4 = f44Var.b;
                            Object[] objArr2 = f44Var.a;
                            f13 r0 = db.r0(0, i4);
                            int i5 = r0.x;
                            int i6 = r0.y;
                            if (i5 <= i6) {
                                while (true) {
                                    objArr2[i5 - i2] = objArr2[i5];
                                    if (((lf5) objArr2[i5]).c) {
                                        i2++;
                                    }
                                    if (i5 != i6) {
                                        i5++;
                                    }
                                }
                            }
                            ms.E0(i4 - i2, i4, null, objArr2);
                            f44Var.b -= i2;
                        }
                        lf5 lf5Var2 = sf5Var.L;
                        if (lf5Var2 != null) {
                            lf5Var2.g = sf5Var.C;
                            sf5.P(lf5Var2, i0);
                            sf5Var.T(lf5Var2.d);
                            if (lf5Var2.d == 1.0f) {
                                sf5Var.L = null;
                            }
                            sf5Var.S();
                        }
                        return pn6Var;
                }
            }
        };
    }

    public static void P(lf5 lf5Var, long j) {
        long j2 = lf5Var.a + j;
        lf5Var.a = j2;
        long j3 = lf5Var.h;
        if (j2 >= j3) {
            lf5Var.d = 1.0f;
            return;
        }
        nr6 nr6Var = lf5Var.b;
        nl nlVar = lf5Var.e;
        if (nr6Var != null) {
            nl nlVar2 = lf5Var.f;
            if (nlVar2 == null) {
                nlVar2 = P;
            }
            lf5Var.d = db.B(((nl) nr6Var.y(j2, nlVar, Q, nlVar2)).a(0), 0.0f, 1.0f);
            return;
        }
        float f = ((float) j2) / ((float) j3);
        float f2 = 1.0f - f;
        lf5Var.d = (f * 1.0f) + (f2 * nlVar.a(0));
    }

    @Override // defpackage.qt0
    public final void B(Object obj) {
        this.z.setValue(obj);
    }

    @Override // defpackage.qt0
    public final void C(xi6 xi6Var) {
        xi6 xi6Var2 = this.B;
        if (xi6Var2 != null && !xi6Var.equals(xi6Var2)) {
            fs4.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.B + ", new instance: " + xi6Var);
        }
        this.B = xi6Var;
    }

    @Override // defpackage.qt0
    public final void D() {
        this.B = null;
        eu5 eu5Var = this.E;
        if (eu5Var != null) {
            eu5Var.b(this);
        }
    }

    public final Object M(xz0 xz0Var) {
        float j = nv5.j(xz0Var.getContext());
        pn6 pn6Var = pn6.a;
        if (j <= 0.0f) {
            N();
            return pn6Var;
        }
        this.N = j;
        Object a = t80.P(xz0Var.getContext()).a(this.O, xz0Var);
        if (a == w11.x) {
            return a;
        }
        return pn6Var;
    }

    public final void N() {
        xi6 xi6Var = this.B;
        if (xi6Var != null) {
            xi6Var.c();
        }
        this.K.d();
        if (this.L != null) {
            this.L = null;
            T(1.0f);
            S();
        }
    }

    public final void O() {
        xi6 xi6Var = this.B;
        if (xi6Var == null) {
            return;
        }
        lf5 lf5Var = this.L;
        if (lf5Var == null) {
            if (this.C > 0) {
                pi4 pi4Var = this.F;
                if (pi4Var.h() != 1.0f && !a34.i(this.z.getValue(), this.y.getValue())) {
                    lf5 lf5Var2 = new lf5();
                    lf5Var2.d = pi4Var.h();
                    long j = this.C;
                    lf5Var2.g = j;
                    lf5Var2.h = io3.i0((1.0d - pi4Var.h()) * j);
                    lf5Var2.e.e(0, pi4Var.h());
                    lf5Var = lf5Var2;
                }
            }
            lf5Var = null;
        }
        if (lf5Var != null) {
            lf5Var.g = this.C;
            this.K.a(lf5Var);
            xi6Var.n(lf5Var);
        }
        this.L = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x006f, code lost:
    
        if (defpackage.t80.P(r0.getContext()).a(r11.M, r0) == r8) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q(defpackage.xz0 r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.nf5
            if (r0 == 0) goto L13
            r0 = r12
            nf5 r0 = (defpackage.nf5) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            nf5 r0 = new nf5
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.x
            int r1 = r0.z
            f44 r2 = r11.K
            r3 = 2
            r4 = 1
            r5 = -9223372036854775808
            pn6 r7 = defpackage.pn6.a
            w11 r8 = defpackage.w11.x
            if (r1 == 0) goto L38
            if (r1 == r4) goto L34
            if (r1 != r3) goto L2d
            goto L34
        L2d:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r11)
            r11 = 0
            return r11
        L34:
            defpackage.m37.N(r12)
            goto L72
        L38:
            defpackage.m37.N(r12)
            boolean r12 = r2.i()
            if (r12 == 0) goto L46
            lf5 r12 = r11.L
            if (r12 != 0) goto L46
            return r7
        L46:
            l11 r12 = r0.getContext()
            float r12 = defpackage.nv5.j(r12)
            r1 = 0
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r12 != 0) goto L59
            r11.N()
            r11.J = r5
            return r7
        L59:
            long r9 = r11.J
            int r12 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r12 != 0) goto L72
            r0.z = r4
            l11 r12 = r0.getContext()
            uf r12 = defpackage.t80.P(r12)
            kf5 r1 = r11.M
            java.lang.Object r12 = r12.a(r1, r0)
            if (r12 != r8) goto L72
            goto L88
        L72:
            boolean r12 = r2.j()
            if (r12 != 0) goto L80
            lf5 r12 = r11.L
            if (r12 == 0) goto L7d
            goto L80
        L7d:
            r11.J = r5
            return r7
        L80:
            r0.z = r3
            java.lang.Object r12 = r11.M(r0)
            if (r12 != r8) goto L72
        L88:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sf5.Q(xz0):java.lang.Object");
    }

    public final Object R(float f, Object obj, t36 t36Var) {
        if (0.0f > f || f > 1.0f) {
            fs4.a("Expecting fraction between 0 and 1. Got " + f);
        }
        xi6 xi6Var = this.B;
        if (xi6Var != null) {
            Object a = j54.a(this.I, new pf5(obj, this.y.getValue(), this, xi6Var, f, null), t36Var);
            if (a == w11.x) {
                return a;
            }
        }
        return pn6.a;
    }

    public final void S() {
        xi6 xi6Var = this.B;
        if (xi6Var == null) {
            return;
        }
        xi6Var.m(io3.i0(this.F.h() * ((Number) xi6Var.m.getValue()).longValue()));
    }

    public final void T(float f) {
        this.F.i(f);
    }

    public final void U(eu5 eu5Var) {
        xv3 xv3Var;
        if (!a34.i(this.E, eu5Var)) {
            eu5 eu5Var2 = this.E;
            if (eu5Var2 != null) {
                eu5Var2.b(this);
            }
            eu5 eu5Var3 = this.E;
            if (eu5Var3 != null && (xv3Var = eu5Var3.h) != null) {
                xv3Var.d();
            }
            this.E = eu5Var;
            if (eu5Var != null) {
                eu5Var.e();
            }
            eu5 eu5Var4 = this.E;
            if (eu5Var4 != null) {
                eu5Var4.d(this, tl7.j, this.D);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
    
        if (r3.a(r0) == r6) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object V(defpackage.xz0 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.qf5
            if (r0 == 0) goto L13
            r0 = r9
            qf5 r0 = (defpackage.qf5) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            qf5 r0 = new qf5
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.y
            int r1 = r0.A
            r2 = 0
            m54 r3 = r8.H
            r4 = 2
            r5 = 1
            w11 r6 = defpackage.w11.x
            if (r1 == 0) goto L3c
            if (r1 == r5) goto L35
            if (r1 != r4) goto L2f
            java.lang.Object r0 = r0.x
            defpackage.m37.N(r9)
            goto L6f
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r8)
            return r2
        L35:
            java.lang.Object r1 = r0.x
            defpackage.m37.N(r9)
            r9 = r1
            goto L50
        L3c:
            defpackage.m37.N(r9)
            ti4 r9 = r8.y
            java.lang.Object r9 = r9.getValue()
            r0.x = r9
            r0.A = r5
            java.lang.Object r1 = r3.a(r0)
            if (r1 != r6) goto L50
            goto L6b
        L50:
            r0.x = r9
            r0.A = r4
            qg0 r1 = new qg0
            vz0 r0 = defpackage.wc7.z(r0)
            r1.<init>(r5, r0)
            r1.t()
            r8.G = r1
            r3.l(r2)
            java.lang.Object r0 = r1.r()
            if (r0 != r6) goto L6c
        L6b:
            return r6
        L6c:
            r7 = r0
            r0 = r9
            r9 = r7
        L6f:
            boolean r9 = defpackage.a34.i(r9, r0)
            if (r9 == 0) goto L78
            pn6 r8 = defpackage.pn6.a
            return r8
        L78:
            r0 = -9223372036854775808
            r8.J = r0
            java.util.concurrent.CancellationException r8 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "targetState while waiting for composition"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sf5.V(xz0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004d, code lost:
    
        if (r4.a(r0) == r6) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object W(defpackage.xz0 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.rf5
            if (r0 == 0) goto L13
            r0 = r9
            rf5 r0 = (defpackage.rf5) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            rf5 r0 = new rf5
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.y
            int r1 = r0.A
            r2 = 0
            r3 = 2
            m54 r4 = r8.H
            r5 = 1
            w11 r6 = defpackage.w11.x
            if (r1 == 0) goto L3c
            if (r1 == r5) goto L35
            if (r1 != r3) goto L2f
            java.lang.Object r0 = r0.x
            defpackage.m37.N(r9)
            goto L7b
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r8)
            return r2
        L35:
            java.lang.Object r1 = r0.x
            defpackage.m37.N(r9)
            r9 = r1
            goto L50
        L3c:
            defpackage.m37.N(r9)
            ti4 r9 = r8.y
            java.lang.Object r9 = r9.getValue()
            r0.x = r9
            r0.A = r5
            java.lang.Object r1 = r4.a(r0)
            if (r1 != r6) goto L50
            goto L77
        L50:
            java.lang.Object r1 = r8.A
            boolean r1 = defpackage.a34.i(r9, r1)
            if (r1 == 0) goto L5c
            r4.l(r2)
            goto L81
        L5c:
            r0.x = r9
            r0.A = r3
            qg0 r1 = new qg0
            vz0 r0 = defpackage.wc7.z(r0)
            r1.<init>(r5, r0)
            r1.t()
            r8.G = r1
            r4.l(r2)
            java.lang.Object r0 = r1.r()
            if (r0 != r6) goto L78
        L77:
            return r6
        L78:
            r7 = r0
            r0 = r9
            r9 = r7
        L7b:
            boolean r1 = defpackage.a34.i(r9, r0)
            if (r1 == 0) goto L84
        L81:
            pn6 r8 = defpackage.pn6.a
            return r8
        L84:
            r1 = -9223372036854775808
            r8.J = r1
            java.util.concurrent.CancellationException r8 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "snapTo() was canceled because state was changed to "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r9 = " instead of "
            r1.append(r9)
            r1.append(r0)
            java.lang.String r9 = r1.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sf5.W(xz0):java.lang.Object");
    }

    @Override // defpackage.qt0
    public final Object v() {
        return this.z.getValue();
    }

    @Override // defpackage.qt0
    public final Object x() {
        return this.y.getValue();
    }
}
