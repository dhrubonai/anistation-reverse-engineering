package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ex4 {
    public static final ex4 a = new Object();
    public static final o75 b = p75.a;
    public static final float c = 80.0f;
    public static final float d = 80.0f;
    public static final float e = 3.0f;

    public final void a(final mx4 mx4Var, final boolean z, final yz3 yz3Var, long j, long j2, float f, kd2 kd2Var, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        final float f2;
        int i8;
        float f3;
        kd2Var.f0(-1076870256);
        if (kd2Var.f(mx4Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i9 = i | i3;
        if (kd2Var.g(z)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i10 = i9 | i4;
        if (kd2Var.f(yz3Var)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i11 = i10 | i5;
        final long j3 = j;
        if ((i2 & 8) == 0 && kd2Var.e(j3)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i12 = i11 | i6;
        final long j4 = j2;
        if ((i2 & 16) == 0 && kd2Var.e(j4)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i13 = i12 | i7 | 65536;
        if ((599187 & i13) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i13 & 1, z2)) {
            kd2Var.a0();
            if ((i & 1) != 0 && !kd2Var.C()) {
                kd2Var.Y();
                if ((i2 & 8) != 0) {
                    i13 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    i13 &= -57345;
                }
                i8 = i13 & (-458753);
                f3 = f;
            } else {
                if ((i2 & 8) != 0) {
                    j3 = ((mp0) kd2Var.j(op0.a)).G;
                    i13 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    j4 = ((mp0) kd2Var.j(op0.a)).s;
                    i13 &= -57345;
                }
                i8 = i13 & (-458753);
                f3 = d;
            }
            long j5 = j4;
            long j6 = j3;
            kd2Var.r();
            b(mx4Var, z, yz3Var, f3, null, j6, 0.0f, nx7.R(298232649, new dx4(z, j5, mx4Var), kd2Var), kd2Var, ((i8 << 6) & 458752) | (i8 & 14) | 12582912 | (i8 & 112) | (i8 & 896) | 100663296);
            f2 = f3;
            j3 = j6;
            j4 = j5;
        } else {
            kd2Var.Y();
            f2 = f;
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ic2(mx4Var, z, yz3Var, j3, j4, f2, i, i2) { // from class: ww4
                public final /* synthetic */ yz3 A;
                public final /* synthetic */ long B;
                public final /* synthetic */ long C;
                public final /* synthetic */ float D;
                public final /* synthetic */ byte E;
                public final /* synthetic */ mx4 y;
                public final /* synthetic */ boolean z;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.E = i2;
                }

                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int N = kb0.N(1572865);
                    ex4.this.a(this.y, this.z, this.A, this.B, this.C, this.D, (kd2) obj, N, this.E);
                    return pn6.a;
                }
            };
        }
    }

    public final void b(final mx4 mx4Var, final boolean z, final yz3 yz3Var, final float f, om5 om5Var, final long j, float f2, final os0 os0Var, kd2 kd2Var, final int i) {
        final mx4 mx4Var2;
        int i2;
        ex4 ex4Var;
        boolean z2;
        final om5 om5Var2;
        final float f3;
        int i3;
        om5 om5Var3;
        boolean z3;
        boolean z4;
        boolean z5;
        final om5 om5Var4;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        kd2Var.f0(-1341144489);
        if ((i & 6) == 0) {
            mx4Var2 = mx4Var;
            if (kd2Var.f(mx4Var2)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i2 = i10 | i;
        } else {
            mx4Var2 = mx4Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (kd2Var.g(z)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i2 |= i9;
        }
        if ((i & 384) == 0) {
            if (kd2Var.f(yz3Var)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i2 |= i8;
        }
        if ((i & 3072) == 0) {
            if (kd2Var.c(f)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i2 |= i7;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((196608 & i) == 0) {
            if (kd2Var.e(j)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i2 |= i6;
        }
        if ((1572864 & i) == 0) {
            i2 |= 524288;
        }
        if ((12582912 & i) == 0) {
            if (kd2Var.h(os0Var)) {
                i5 = 8388608;
            } else {
                i5 = 4194304;
            }
            i2 |= i5;
        }
        if ((100663296 & i) == 0) {
            ex4Var = this;
            if (kd2Var.f(ex4Var)) {
                i4 = 67108864;
            } else {
                i4 = 33554432;
            }
            i2 |= i4;
        } else {
            ex4Var = this;
        }
        if ((38347923 & i2) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i2 & 1, z2)) {
            kd2Var.a0();
            if ((i & 1) != 0 && !kd2Var.C()) {
                kd2Var.Y();
                i3 = i2 & (-3727361);
                om5Var3 = om5Var;
                f3 = f2;
            } else {
                i3 = i2 & (-3727361);
                om5Var3 = b;
                f3 = e;
            }
            int i11 = i3;
            kd2Var.r();
            yz3 i12 = ar5.i(yz3Var, 40.0f);
            Object Q = kd2Var.Q();
            q18 q18Var = au0.a;
            if (Q == q18Var) {
                Q = new rs4((byte) 4);
                kd2Var.n0(Q);
            }
            yz3 y = nx7.y(i12, (ub2) Q);
            if ((i11 & 14) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i11 & 112) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z6 = z4 | z3;
            if ((((i11 & 7168) ^ 3072) > 2048 && kd2Var.c(f)) || (i11 & 3072) == 2048) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean c2 = z6 | z5 | kd2Var.c(f3) | kd2Var.f(om5Var3);
            Object Q2 = kd2Var.Q();
            if (!c2 && Q2 != q18Var) {
                om5Var4 = om5Var3;
            } else {
                om5Var4 = om5Var3;
                jc2 jc2Var = new jc2() { // from class: xw4
                    @Override // defpackage.jc2
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        final em4 p = ((ro3) obj2).p(((rx0) obj3).a);
                        int i13 = p.x;
                        int i14 = p.y;
                        final mx4 mx4Var3 = mx4.this;
                        final boolean z7 = z;
                        final float f4 = f;
                        final float f5 = f3;
                        final om5 om5Var5 = om5Var4;
                        return ((xo3) obj).L(i13, i14, ot1.x, new ub2() { // from class: zw4
                            @Override // defpackage.ub2
                            public final Object invoke(Object obj4) {
                                final mx4 mx4Var4 = mx4Var3;
                                final boolean z8 = z7;
                                final float f6 = f4;
                                final float f7 = f5;
                                final om5 om5Var6 = om5Var5;
                                dm4.n((dm4) obj4, em4.this, 0, 0, new ub2() { // from class: ax4
                                    @Override // defpackage.ub2
                                    public final Object invoke(Object obj5) {
                                        boolean z9;
                                        p55 p55Var = (p55) obj5;
                                        mx4 mx4Var5 = mx4.this;
                                        float f8 = 0.0f;
                                        if (mx4Var5.a() <= 0.0f && !z8) {
                                            z9 = false;
                                        } else {
                                            z9 = true;
                                        }
                                        p55Var.n((mx4Var5.a() * p55Var.x0(f6)) - Float.intBitsToFloat((int) (p55Var.O & 4294967295L)));
                                        if (z9) {
                                            f8 = p55Var.Q.b() * f7;
                                        }
                                        p55Var.j(f8);
                                        p55Var.k(om5Var6);
                                        p55Var.e(true);
                                        return pn6.a;
                                    }
                                }, 4);
                                return pn6.a;
                            }
                        });
                    }
                };
                kd2Var.n0(jc2Var);
                Q2 = jc2Var;
            }
            yz3 h = bx7.h(tl7.A(y, (jc2) Q2), j, om5Var4);
            int i13 = ((i11 >> 12) & 7168) | 48;
            vo3 c3 = b90.c(pk2.C, false);
            int s = h98.s(kd2Var);
            al4 l = kd2Var.l();
            yz3 E = o80.E(kd2Var, h);
            tt0.d.getClass();
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(za3.p0);
            } else {
                kd2Var.q0();
            }
            ss5.i(p7.F, kd2Var, c3);
            ss5.i(p7.E, kd2Var, l);
            st0 st0Var = p7.G;
            if (kd2Var.S || !a34.i(kd2Var.Q(), Integer.valueOf(s))) {
                h11.p(s, kd2Var, s, st0Var);
            }
            ss5.i(p7.D, kd2Var, E);
            os0Var.invoke(n90.a, kd2Var, Integer.valueOf(((i13 >> 6) & 112) | 6));
            kd2Var.q(true);
            om5Var2 = om5Var4;
        } else {
            kd2Var.Y();
            om5Var2 = om5Var;
            f3 = f2;
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            final ex4 ex4Var2 = ex4Var;
            u.d = new ic2() { // from class: yw4
                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ex4.this.b(mx4Var, z, yz3Var, f, om5Var2, j, f3, os0Var, (kd2) obj, kb0.N(i | 1));
                    return pn6.a;
                }
            };
        }
    }
}
