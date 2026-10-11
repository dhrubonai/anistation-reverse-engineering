package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class k84 extends xz3 implements jj6, d84 {
    public d84 L;
    public g84 M;
    public k84 N;
    public final String O;

    public k84(d84 d84Var, g84 g84Var) {
        this.L = d84Var;
        this.M = g84Var == null ? new g84() : g84Var;
        this.O = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // defpackage.d84
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(long r13, long r15, defpackage.vz0 r17) {
        /*
            r12 = this;
            r1 = r17
            boolean r2 = r1 instanceof defpackage.i84
            if (r2 == 0) goto L16
            r2 = r1
            i84 r2 = (defpackage.i84) r2
            int r3 = r2.B
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.B = r3
        L14:
            r8 = r2
            goto L1e
        L16:
            i84 r2 = new i84
            xz0 r1 = (defpackage.xz0) r1
            r2.<init>(r12, r1)
            goto L14
        L1e:
            java.lang.Object r1 = r8.z
            int r2 = r8.B
            r9 = 0
            r10 = 2
            r3 = 1
            w11 r11 = defpackage.w11.x
            if (r2 == 0) goto L41
            if (r2 == r3) goto L39
            if (r2 != r10) goto L33
            long r2 = r8.x
            defpackage.m37.N(r1)
            goto L84
        L33:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r0)
            return r9
        L39:
            long r2 = r8.y
            long r4 = r8.x
            defpackage.m37.N(r1)
            goto L58
        L41:
            defpackage.m37.N(r1)
            d84 r1 = r12.L
            r8.x = r13
            r6 = r15
            r8.y = r6
            r8.B = r3
            r4 = r13
            r3 = r1
            java.lang.Object r1 = r3.A(r4, r6, r8)
            if (r1 != r11) goto L56
            goto L82
        L56:
            r4 = r13
            r2 = r15
        L58:
            ur6 r1 = (defpackage.ur6) r1
            long r6 = r1.a
            boolean r1 = r12.K
            if (r1 == 0) goto L67
            if (r1 == 0) goto L69
            k84 r9 = r12.b1()
            goto L69
        L67:
            k84 r9 = r12.N
        L69:
            if (r9 == 0) goto L8a
            long r0 = defpackage.ur6.e(r4, r6)
            long r2 = defpackage.ur6.d(r2, r6)
            r8.x = r6
            r8.B = r10
            r13 = r0
            r15 = r2
            r17 = r8
            r12 = r9
            java.lang.Object r1 = r12.A(r13, r15, r17)
            if (r1 != r11) goto L83
        L82:
            return r11
        L83:
            r2 = r6
        L84:
            ur6 r1 = (defpackage.ur6) r1
            long r0 = r1.a
            r6 = r2
            goto L8c
        L8a:
            r0 = 0
        L8c:
            long r0 = defpackage.ur6.e(r6, r0)
            ur6 r2 = new ur6
            r2.<init>(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k84.A(long, long, vz0):java.lang.Object");
    }

    @Override // defpackage.d84
    public final long O(int i, long j) {
        k84 k84Var;
        long j2;
        if (this.K) {
            k84Var = b1();
        } else {
            k84Var = null;
        }
        if (k84Var != null) {
            j2 = k84Var.O(i, j);
        } else {
            j2 = 0;
        }
        return xc4.f(j2, this.L.O(i, xc4.e(j, j2)));
    }

    @Override // defpackage.xz3
    public final void S0() {
        g84 g84Var = this.M;
        g84Var.a = this;
        g84Var.b = null;
        this.N = null;
        g84Var.c = new vt0(this, (byte) 26);
        g84Var.d = O0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w05] */
    @Override // defpackage.xz3
    public final void T0() {
        ?? obj = new Object();
        iv5.j(this, new aa(obj, (byte) 3));
        k84 k84Var = (k84) ((jj6) obj.x);
        this.N = k84Var;
        g84 g84Var = this.M;
        g84Var.b = k84Var;
        if (g84Var.a == this) {
            g84Var.a = null;
            g84Var.d = null;
            g84Var.c = bb4.K;
        }
    }

    public final v11 a1() {
        v11 v11Var;
        k84 b1 = b1();
        if (b1 != null) {
            v11Var = b1.a1();
        } else {
            v11Var = null;
        }
        if (v11Var != null && db.W(v11Var)) {
            return v11Var;
        }
        v11 v11Var2 = this.M.d;
        if (v11Var2 != null) {
            return v11Var2;
        }
        ze0.m("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    public final k84 b1() {
        kf kfVar;
        jj6 jj6Var = null;
        if (!this.K) {
            return null;
        }
        if (!this.x.K) {
            ez2.b("visitAncestors called on an unattached node");
        }
        xz3 xz3Var = this.x.B;
        za3 O = wc7.O(this);
        loop0: while (true) {
            if (O == null) {
                break;
            }
            if ((((xz3) O.c0.D).A & 262144) != 0) {
                while (xz3Var != null) {
                    if ((xz3Var.z & 262144) != 0) {
                        xz3 xz3Var2 = xz3Var;
                        z44 z44Var = null;
                        while (xz3Var2 != null) {
                            if (xz3Var2 instanceof jj6) {
                                jj6 jj6Var2 = (jj6) xz3Var2;
                                if (a34.i(this.O, jj6Var2.p()) && k84.class == jj6Var2.getClass()) {
                                    jj6Var = jj6Var2;
                                    break loop0;
                                }
                            }
                            if ((xz3Var2.z & 262144) != 0 && (xz3Var2 instanceof zc1)) {
                                int i = 0;
                                for (xz3 xz3Var3 = ((zc1) xz3Var2).M; xz3Var3 != null; xz3Var3 = xz3Var3.C) {
                                    if ((xz3Var3.z & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            xz3Var2 = xz3Var3;
                                        } else {
                                            if (z44Var == null) {
                                                z44Var = new z44(new xz3[16], 0);
                                            }
                                            if (xz3Var2 != null) {
                                                z44Var.b(xz3Var2);
                                                xz3Var2 = null;
                                            }
                                            z44Var.b(xz3Var3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            xz3Var2 = wc7.J(z44Var);
                        }
                    }
                    xz3Var = xz3Var.B;
                }
            }
            O = O.v();
            if (O != null && (kfVar = O.c0) != null) {
                xz3Var = (z66) kfVar.C;
            } else {
                xz3Var = null;
            }
        }
        return (k84) jj6Var;
    }

    @Override // defpackage.jj6
    public final Object p() {
        return this.O;
    }

    @Override // defpackage.d84
    public final long z(long j, int i, long j2) {
        k84 k84Var;
        long j3;
        long z = this.L.z(j, i, j2);
        if (this.K) {
            k84Var = b1();
        } else {
            k84Var = null;
        }
        k84 k84Var2 = k84Var;
        if (k84Var2 != null) {
            j3 = k84Var2.z(xc4.f(j, z), i, xc4.e(j2, z));
        } else {
            j3 = 0;
        }
        return xc4.f(z, j3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        if (r9 == r5) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.d84
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z0(long r7, defpackage.vz0 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.j84
            if (r0 == 0) goto L13
            r0 = r9
            j84 r0 = (defpackage.j84) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L1a
        L13:
            j84 r0 = new j84
            xz0 r9 = (defpackage.xz0) r9
            r0.<init>(r6, r9)
        L1a:
            java.lang.Object r9 = r0.y
            int r1 = r0.A
            r2 = 0
            r3 = 2
            r4 = 1
            w11 r5 = defpackage.w11.x
            if (r1 == 0) goto L3b
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2f
            long r6 = r0.x
            defpackage.m37.N(r9)
            goto L6c
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r6)
            return r2
        L35:
            long r7 = r0.x
            defpackage.m37.N(r9)
            goto L53
        L3b:
            defpackage.m37.N(r9)
            boolean r9 = r6.K
            if (r9 == 0) goto L46
            k84 r2 = r6.b1()
        L46:
            if (r2 == 0) goto L58
            r0.x = r7
            r0.A = r4
            java.lang.Object r9 = r2.z0(r7, r0)
            if (r9 != r5) goto L53
            goto L6a
        L53:
            ur6 r9 = (defpackage.ur6) r9
            long r1 = r9.a
            goto L5a
        L58:
            r1 = 0
        L5a:
            d84 r6 = r6.L
            long r7 = defpackage.ur6.d(r7, r1)
            r0.x = r1
            r0.A = r3
            java.lang.Object r9 = r6.z0(r7, r0)
            if (r9 != r5) goto L6b
        L6a:
            return r5
        L6b:
            r6 = r1
        L6c:
            ur6 r9 = (defpackage.ur6) r9
            long r8 = r9.a
            long r6 = defpackage.ur6.e(r6, r8)
            ur6 r8 = new ur6
            r8.<init>(r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k84.z0(long, vz0):java.lang.Object");
    }
}
