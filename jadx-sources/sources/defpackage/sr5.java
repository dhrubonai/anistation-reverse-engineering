package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class sr5 {
    public static final float a = kb0.y;
    public static final float b;
    public static final es6 c;

    /* JADX WARN: Type inference failed for: r0v2, types: [f7, es6] */
    static {
        float f = kb0.w;
        b = f;
        float f2 = kb0.v;
        n03.e(f, f2);
        n03.e(f2, f);
        c = new f7(or5.x);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final float r22, final defpackage.ub2 r23, final defpackage.yz3 r24, final boolean r25, defpackage.sb2 r26, defpackage.ir5 r27, defpackage.u34 r28, int r29, final defpackage.os0 r30, final defpackage.os0 r31, final defpackage.do0 r32, defpackage.kd2 r33, final int r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sr5.a(float, ub2, yz3, boolean, sb2, ir5, u34, int, os0, os0, do0, kd2, int, int, int):void");
    }

    public static final void b(final tr5 tr5Var, final yz3 yz3Var, final boolean z, ir5 ir5Var, final u34 u34Var, final os0 os0Var, final os0 os0Var2, kd2 kd2Var, final int i) {
        int i2;
        boolean z2;
        final ir5 ir5Var2;
        int i3;
        ir5 a2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        kd2Var.f0(409861960);
        if ((i & 6) == 0) {
            if (kd2Var.h(tr5Var)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (kd2Var.f(yz3Var)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        if ((i & 384) == 0) {
            if (kd2Var.g(z)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i2 |= i7;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        if ((i & 24576) == 0) {
            if (kd2Var.f(u34Var)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i2 |= i6;
        }
        if ((196608 & i) == 0) {
            if (kd2Var.h(os0Var)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i2 |= i5;
        }
        if ((1572864 & i) == 0) {
            if (kd2Var.h(os0Var2)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i2 |= i4;
        }
        if ((599187 & i2) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i2 & 1, z2)) {
            kd2Var.a0();
            if ((i & 1) != 0 && !kd2Var.C()) {
                kd2Var.Y();
                i3 = i2 & (-7169);
                a2 = ir5Var;
            } else {
                int i10 = kr5.a;
                i3 = i2 & (-7169);
                a2 = kr5.a(kd2Var);
            }
            kd2Var.r();
            if (tr5Var.x >= 0) {
                int i11 = i3 >> 3;
                c(yz3Var, tr5Var, z, u34Var, os0Var, os0Var2, kd2Var, (i3 & 896) | (i11 & 14) | ((i3 << 3) & 112) | (i11 & 7168) | (57344 & i11) | (i11 & 458752));
                ir5Var2 = a2;
            } else {
                ze0.k("steps should be >= 0");
                return;
            }
        } else {
            kd2Var.Y();
            ir5Var2 = ir5Var;
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ic2() { // from class: mr5
                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    sr5.b(tr5.this, yz3Var, z, ir5Var2, u34Var, os0Var, os0Var2, (kd2) obj, kb0.N(i | 1));
                    return pn6.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(yz3 yz3Var, tr5 tr5Var, boolean z, u34 u34Var, os0 os0Var, os0 os0Var2, kd2 kd2Var, int i) {
        int i2;
        boolean z2;
        os0 os0Var3;
        tr5 tr5Var2;
        boolean z3;
        boolean z4;
        pi4 pi4Var;
        rg4 rg4Var;
        yz3 yz3Var2;
        yz3 q;
        float f;
        float f2;
        yz3 yz3Var3;
        boolean z5;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        do0 do0Var = tr5Var.z;
        kd2Var.f0(898172835);
        byte b2 = 2;
        byte b3 = 4;
        if ((i & 6) == 0) {
            if (kd2Var.f(yz3Var)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (kd2Var.h(tr5Var)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & 384) == 0) {
            if (kd2Var.g(z)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            if (kd2Var.f(u34Var)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((i & 24576) == 0) {
            if (kd2Var.h(os0Var)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            if (kd2Var.h(os0Var2)) {
                i3 = 131072;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        int i9 = i2;
        if ((i9 & 74899) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i9 & 1, z2)) {
            if (kd2Var.j(bv0.n) == ia3.y) {
                z3 = true;
            } else {
                z3 = false;
            }
            tr5Var.G = z3;
            pi4 pi4Var2 = tr5Var.A;
            rg4 rg4Var2 = tr5Var.J;
            if (rg4Var2 == rg4.y && z3) {
                z4 = true;
            } else {
                z4 = false;
            }
            vz3 vz3Var = vz3.x;
            if (z) {
                ec ecVar = new ec(tr5Var, b3);
                nq4 nq4Var = v36.a;
                pi4Var = pi4Var2;
                rg4Var = rg4Var2;
                yz3Var2 = new u36(tr5Var, u34Var, null, ecVar, 4);
            } else {
                pi4Var = pi4Var2;
                rg4Var = rg4Var2;
                yz3Var2 = vz3Var;
            }
            rg4 rg4Var3 = tr5Var.J;
            boolean booleanValue = ((Boolean) tr5Var.K.getValue()).booleanValue();
            boolean h = kd2Var.h(tr5Var);
            Object Q = kd2Var.Q();
            q18 q18Var = au0.a;
            if (h || Q == q18Var) {
                Q = new g70(tr5Var, null, b2);
                kd2Var.n0(Q);
            }
            yz3 yz3Var4 = yz3Var2;
            yz3 a2 = ro1.a(vz3Var, tr5Var, rg4Var3, z, u34Var, booleanValue, (jc2) Q, z4, 32);
            jr5 jr5Var = jr5.x;
            rg4 rg4Var4 = rg4.x;
            rg4 rg4Var5 = rg4Var;
            if (rg4Var5 == rg4Var4) {
                q = ar5.o(wc7.D(jr5Var));
            } else {
                q = ar5.q(wc7.D(jr5Var));
            }
            vn2 vn2Var = q13.a;
            yz3 w = yz3Var.w(vy3.x);
            float f3 = b;
            float f4 = a;
            if (rg4Var5 == rg4Var4) {
                f = f4;
            } else {
                f = f3;
            }
            if (rg4Var5 == rg4Var4) {
                f2 = f3;
            } else {
                f2 = f4;
            }
            yz3 a3 = rh5.a(ar5.h(w, f, f2, 0.0f, 0.0f, 12), false, new ej(z, tr5Var));
            if (rg4Var5 == rg4Var4) {
                yz3Var3 = j4.b;
            } else {
                yz3Var3 = j4.a;
            }
            yz3 w2 = a3.w(yz3Var3);
            final float h2 = pi4Var.h();
            final do0 do0Var2 = new do0(do0Var.a, do0Var.b);
            final int i10 = tr5Var.x;
            yz3 q2 = n03.q(rh5.a(w2, true, new ub2() { // from class: ev4
                @Override // defpackage.ub2
                public final Object invoke(Object obj) {
                    Float valueOf = Float.valueOf(h2);
                    do0 do0Var3 = do0Var2;
                    zu4 zu4Var = new zu4(((Number) db.G(valueOf, do0Var3)).floatValue(), do0Var3, i10);
                    w73[] w73VarArr = zh5.a;
                    ai5 ai5Var = yh5.c;
                    w73 w73Var = zh5.a[1];
                    ai5Var.getClass();
                    ((bi5) obj).b(ai5Var, zu4Var);
                    return pn6.a;
                }
            }), z, u34Var);
            int i11 = tr5Var.x;
            float h3 = pi4Var.h();
            ub2 ub2Var = tr5Var.B;
            boolean z6 = z4;
            sb2 sb2Var = tr5Var.y;
            if (i11 >= 0) {
                yz3 yz3Var5 = q;
                tr5Var2 = tr5Var;
                yz3 w3 = n77.N(q2, new qr5(z, ub2Var, do0Var, i11, z6, h3, sb2Var)).w(yz3Var4).w(a2);
                boolean h4 = kd2Var.h(tr5Var2);
                Object Q2 = kd2Var.Q();
                if (h4 || Q2 == q18Var) {
                    Q2 = new yh3(tr5Var2, (byte) 1);
                    kd2Var.n0(Q2);
                }
                vo3 vo3Var = (vo3) Q2;
                int s = h98.s(kd2Var);
                al4 l = kd2Var.l();
                yz3 E = o80.E(kd2Var, w3);
                tt0.d.getClass();
                kd2Var.h0();
                boolean z7 = kd2Var.S;
                t53 t53Var = za3.p0;
                if (z7) {
                    kd2Var.k(t53Var);
                } else {
                    kd2Var.q0();
                }
                st0 st0Var = p7.F;
                ss5.i(st0Var, kd2Var, vo3Var);
                ys0 ys0Var = p7.E;
                ss5.i(ys0Var, kd2Var, l);
                st0 st0Var2 = p7.G;
                if (kd2Var.S || !a34.i(kd2Var.Q(), Integer.valueOf(s))) {
                    h11.p(s, kd2Var, s, st0Var2);
                }
                ys0 ys0Var2 = p7.D;
                ss5.i(ys0Var2, kd2Var, E);
                boolean h5 = kd2Var.h(tr5Var2);
                Object Q3 = kd2Var.Q();
                if (!h5 && Q3 != q18Var) {
                    z5 = false;
                } else {
                    z5 = false;
                    Q3 = new nr5(tr5Var2, 0 == true ? 1 : 0);
                    kd2Var.n0(Q3);
                }
                yz3 D = m37.D(yz3Var5, (ub2) Q3);
                y50 y50Var = pk2.y;
                vo3 c2 = b90.c(y50Var, z5);
                int s2 = h98.s(kd2Var);
                al4 l2 = kd2Var.l();
                yz3 E2 = o80.E(kd2Var, D);
                kd2Var.h0();
                if (kd2Var.S) {
                    kd2Var.k(t53Var);
                } else {
                    kd2Var.q0();
                }
                ss5.i(st0Var, kd2Var, c2);
                ss5.i(ys0Var, kd2Var, l2);
                if (kd2Var.S || !a34.i(kd2Var.Q(), Integer.valueOf(s2))) {
                    h11.p(s2, kd2Var, s2, st0Var2);
                }
                ss5.i(ys0Var2, kd2Var, E2);
                int i12 = (i9 >> 3) & 14;
                os0Var.invoke(tr5Var2, kd2Var, Integer.valueOf(((i9 >> 9) & 112) | i12));
                kd2Var.q(true);
                yz3 D2 = wc7.D(jr5.y);
                vo3 c3 = b90.c(y50Var, false);
                int s3 = h98.s(kd2Var);
                al4 l3 = kd2Var.l();
                yz3 E3 = o80.E(kd2Var, D2);
                kd2Var.h0();
                if (kd2Var.S) {
                    kd2Var.k(t53Var);
                } else {
                    kd2Var.q0();
                }
                ss5.i(st0Var, kd2Var, c3);
                ss5.i(ys0Var, kd2Var, l3);
                if (kd2Var.S || !a34.i(kd2Var.Q(), Integer.valueOf(s3))) {
                    h11.p(s3, kd2Var, s3, st0Var2);
                }
                ss5.i(ys0Var2, kd2Var, E3);
                os0Var3 = os0Var2;
                os0Var3.invoke(tr5Var2, kd2Var, Integer.valueOf(i12 | ((i9 >> 12) & 112)));
                kd2Var.q(true);
                kd2Var.q(true);
            } else {
                ze0.k("steps should be >= 0");
                return;
            }
        } else {
            os0Var3 = os0Var2;
            tr5Var2 = tr5Var;
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new tl(yz3Var, tr5Var2, z, u34Var, os0Var, os0Var3, i);
        }
    }

    public static final float d(float f, float[] fArr, float f2, float f3) {
        Float valueOf;
        if (fArr.length == 0) {
            valueOf = null;
        } else {
            float f4 = fArr[0];
            int i = 1;
            int length = fArr.length - 1;
            if (length == 0) {
                valueOf = Float.valueOf(f4);
            } else {
                float abs = Math.abs(q23.I(f2, f3, f4) - f);
                if (1 <= length) {
                    while (true) {
                        float f5 = fArr[i];
                        float abs2 = Math.abs(q23.I(f2, f3, f5) - f);
                        if (Float.compare(abs, abs2) > 0) {
                            f4 = f5;
                            abs = abs2;
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
                valueOf = Float.valueOf(f4);
            }
        }
        if (valueOf != null) {
            return q23.I(f2, f3, valueOf.floatValue());
        }
        return f;
    }
}
