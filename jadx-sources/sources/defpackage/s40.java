package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class s40 {
    public static final long a = n03.e(40.0f, 40.0f);

    public static final void a(ic6 ic6Var, yz3 yz3Var, boolean z, xd6 xd6Var, o83 o83Var, he5 he5Var, sa6 sa6Var, ka0 ka0Var, v96 v96Var, yc5 yc5Var, kd2 kd2Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        boolean z3;
        yc5 yc5Var2;
        int i9;
        yc5 d0;
        kd2Var.f0(469439921);
        if (kd2Var.f(ic6Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i10 = i | i2;
        int i11 = 16;
        if (kd2Var.f(yz3Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i12 = i10 | i3 | 28032;
        if (kd2Var.f(xd6Var)) {
            i4 = 131072;
        } else {
            i4 = 65536;
        }
        int i13 = i12 | i4;
        if (kd2Var.f(o83Var)) {
            i5 = 1048576;
        } else {
            i5 = 524288;
        }
        int i14 = i13 | i5;
        if (kd2Var.f(he5Var)) {
            i6 = 8388608;
        } else {
            i6 = 4194304;
        }
        int i15 = i14 | i6;
        if (kd2Var.f(sa6Var)) {
            i7 = 67108864;
        } else {
            i7 = 33554432;
        }
        int i16 = i15 | i7 | 805306368;
        if (kd2Var.f(ka0Var)) {
            i11 = 32;
        }
        int i17 = i11 | 390;
        if (kd2Var.f(v96Var)) {
            i8 = 2048;
        } else {
            i8 = 1024;
        }
        int i18 = i17 | i8 | 8192;
        boolean z4 = true;
        if ((306783379 & i16) == 306783378 && (i18 & 9363) == 9362) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (kd2Var.V(i16 & 1, z2)) {
            kd2Var.a0();
            if ((i & 1) != 0 && !kd2Var.C()) {
                kd2Var.Y();
                i9 = i18 & (-57345);
                z4 = z;
                d0 = yc5Var;
            } else {
                i9 = i18 & (-57345);
                d0 = n77.d0(kd2Var);
            }
            kd2Var.r();
            boolean z5 = z4;
            b(ic6Var, yz3Var, z5, xd6Var, o83Var, he5Var, sa6Var, ka0Var, v96Var, d0, kd2Var, 2147483646 & i16, (i9 & 112) | 3462 | ((i9 << 3) & 57344));
            z3 = z5;
            yc5Var2 = d0;
        } else {
            kd2Var.Y();
            z3 = z;
            yc5Var2 = yc5Var;
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new th(ic6Var, yz3Var, z3, xd6Var, o83Var, he5Var, sa6Var, ka0Var, v96Var, yc5Var2, i);
        }
    }

    public static final void b(final ic6 ic6Var, final yz3 yz3Var, final boolean z, final xd6 xd6Var, final o83 o83Var, final he5 he5Var, final sa6 sa6Var, final ka0 ka0Var, final v96 v96Var, final yc5 yc5Var, kd2 kd2Var, final int i, final int i2) {
        int i3;
        int i4;
        Object obj;
        boolean z2;
        kd2 kd2Var2;
        rg4 rg4Var;
        int i5;
        boolean z3;
        boolean z4;
        boolean z5;
        Object cc6Var;
        t44 t44Var;
        int i6;
        ud1 ud1Var;
        ia3 ia3Var;
        int i7;
        int i8;
        final bn4 bn4Var;
        final kn0 kn0Var;
        dd6 dd6Var;
        Object obj2;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        final cc6 cc6Var2;
        Object obj3;
        Object obj4;
        final gi6 gi6Var;
        boolean z10;
        boolean z11;
        boolean z12;
        yc5 yc5Var2;
        rg4 rg4Var2;
        boolean z13;
        boolean h;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z14 = z;
        kd2Var.f0(965149429);
        if ((i & 6) == 0) {
            if (kd2Var.f(ic6Var)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i3 = i20 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (kd2Var.f(yz3Var)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i3 |= i19;
        }
        int i21 = 128;
        if ((i & 384) == 0) {
            if (kd2Var.g(z14)) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i3 |= i18;
        }
        int i22 = 1024;
        if ((i & 3072) == 0) {
            if (kd2Var.g(false)) {
                i17 = 2048;
            } else {
                i17 = 1024;
            }
            i3 |= i17;
        }
        int i23 = 8192;
        if ((i & 24576) == 0) {
            if (kd2Var.f(null)) {
                i16 = 16384;
            } else {
                i16 = 8192;
            }
            i3 |= i16;
        }
        int i24 = 131072;
        if ((i & 196608) == 0) {
            if (kd2Var.f(xd6Var)) {
                i15 = 131072;
            } else {
                i15 = 65536;
            }
            i3 |= i15;
        }
        if ((i & 1572864) == 0) {
            if (kd2Var.f(o83Var)) {
                i14 = 1048576;
            } else {
                i14 = 524288;
            }
            i3 |= i14;
        }
        if ((i & 12582912) == 0) {
            if (kd2Var.f(he5Var)) {
                i13 = 8388608;
            } else {
                i13 = 4194304;
            }
            i3 |= i13;
        }
        if ((i & 100663296) == 0) {
            if (kd2Var.f(sa6Var)) {
                i12 = 67108864;
            } else {
                i12 = 33554432;
            }
            i3 |= i12;
        }
        if ((i & 805306368) == 0) {
            if (kd2Var.h(null)) {
                i11 = 536870912;
            } else {
                i11 = 268435456;
            }
            i3 |= i11;
        }
        if ((i2 & 6) == 0) {
            if (kd2Var.f(null)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i4 = i10 | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if (kd2Var.f(ka0Var)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i4 |= i9;
        }
        if ((i2 & 384) == 0) {
            obj = null;
            if (kd2Var.f(null)) {
                i21 = 256;
            }
            i4 |= i21;
        } else {
            obj = null;
        }
        if ((i2 & 3072) == 0) {
            if (kd2Var.f(obj)) {
                i22 = 2048;
            }
            i4 |= i22;
        }
        if ((i2 & 24576) == 0) {
            if ((32768 & i2) == 0) {
                h = kd2Var.f(v96Var);
            } else {
                h = kd2Var.h(v96Var);
            }
            if (h) {
                i23 = 16384;
            }
            i4 |= i23;
        }
        if ((i2 & 196608) == 0) {
            if (!kd2Var.f(yc5Var)) {
                i24 = 65536;
            }
            i4 |= i24;
        }
        int i25 = i4 | 1572864;
        if ((306783379 & i3) == 306783378 && (599187 & i25) == 599186) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (kd2Var.V(i3 & 1, z2)) {
            kd2Var.a0();
            if ((i & 1) != 0 && !kd2Var.C()) {
                kd2Var.Y();
            }
            kd2Var.r();
            ud1 ud1Var2 = (ud1) kd2Var.j(bv0.h);
            ia3 ia3Var2 = (ia3) kd2Var.j(bv0.n);
            final boolean i26 = a34.i(sa6Var, l68.Q);
            kd2Var.e0(-2038132442);
            Object Q = kd2Var.Q();
            Object obj5 = au0.a;
            if (Q == obj5) {
                Q = new u34();
                kd2Var.n0(Q);
            }
            final u34 u34Var = (u34) Q;
            kd2Var.q(false);
            rg4 rg4Var3 = rg4.x;
            if (i26) {
                rg4Var = rg4.y;
            } else {
                rg4Var = rg4Var3;
            }
            Object Q2 = kd2Var.Q();
            if (Q2 == obj5) {
                i5 = i3;
                Q2 = jn5.b(1, 0, ta0.z, 2);
                kd2Var.n0(Q2);
            } else {
                i5 = i3;
            }
            t44 t44Var2 = (t44) Q2;
            if ((i5 & 14) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i25 & 896) == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z15 = z3 | z4;
            if ((i25 & 7168) == 2048) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z16 = z15 | z5;
            Object Q3 = kd2Var.Q();
            if (z16 || Q3 == obj5) {
                h95 h95Var = h95.L;
                if (!i26) {
                    h95Var = null;
                }
                Q3 = new gi6(ic6Var, h95Var);
                kd2Var.n0(Q3);
            }
            gi6 gi6Var2 = (gi6) Q3;
            boolean f = kd2Var.f(gi6Var2);
            Object Q4 = kd2Var.Q();
            if (f || Q4 == obj5) {
                Q4 = new dd6();
                kd2Var.n0(Q4);
            }
            dd6 dd6Var2 = (dd6) Q4;
            Object Q5 = kd2Var.Q();
            if (Q5 == obj5) {
                Q5 = db.L(kd2Var);
                kd2Var.n0(Q5);
            }
            v11 v11Var = (v11) Q5;
            kd2Var.e0(-2036249936);
            fk3 fk3Var = xd6Var.a.k;
            if (fk3Var == null) {
                fk3 fk3Var2 = fk3.z;
                fk3Var = om4.a.r();
            }
            bn4 b = dn4.b(fk3Var, kd2Var);
            kd2Var.q(false);
            Object Q6 = kd2Var.Q();
            if (Q6 == obj5) {
                Q6 = new fg6();
                kd2Var.n0(Q6);
            }
            final fg6 fg6Var = (fg6) Q6;
            kn0 kn0Var2 = (kn0) kd2Var.j(bv0.f);
            boolean f2 = kd2Var.f(gi6Var2);
            Object Q7 = kd2Var.Q();
            if (!f2 && Q7 != obj5) {
                bn4Var = b;
                t44Var = t44Var2;
                i6 = i25;
                ud1Var = ud1Var2;
                ia3Var = ia3Var2;
                i7 = i5;
                cc6Var = Q7;
                dd6Var = dd6Var2;
                obj2 = v11Var;
                kn0Var = kn0Var2;
                i8 = 16384;
            } else {
                t44Var = t44Var2;
                i6 = i25;
                ud1Var = ud1Var2;
                ia3Var = ia3Var2;
                i7 = i5;
                i8 = 16384;
                cc6Var = new cc6(gi6Var2, dd6Var2, ud1Var, z, fg6Var, v11Var, b, kn0Var2);
                bn4Var = b;
                kn0Var = kn0Var2;
                dd6Var = dd6Var2;
                obj2 = v11Var;
                kd2Var.n0(cc6Var);
            }
            cc6 cc6Var3 = (cc6) cc6Var;
            final sj2 sj2Var = (sj2) kd2Var.j(bv0.l);
            boolean f3 = kd2Var.f((zd6) kd2Var.j(bv0.r)) | kd2Var.f(obj2);
            Object Q8 = kd2Var.Q();
            if (f3 || Q8 == obj5) {
                Q8 = new Object();
                kd2Var.n0(Q8);
            }
            final p40 p40Var = (p40) Q8;
            boolean f4 = kd2Var.f(gi6Var2);
            if ((i7 & 57344) == i8) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean h2 = z6 | f4 | kd2Var.h(cc6Var3) | kd2Var.h(sj2Var) | kd2Var.h(kn0Var) | kd2Var.f(p40Var) | kd2Var.f(ud1Var);
            if ((i7 & 896) == 256) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z17 = h2 | z7;
            if ((i7 & 7168) == 2048) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z18 = z17 | z8;
            if ((i6 & 3670016) == 1048576) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z19 = z18 | z9;
            Object Q9 = kd2Var.Q();
            if (z19 || Q9 == obj5) {
                Object obj6 = obj2;
                cc6Var2 = cc6Var3;
                obj4 = obj6;
                gi6Var = gi6Var2;
                final ud1 ud1Var3 = ud1Var;
                obj3 = new sb2(cc6Var2, sj2Var, kn0Var, p40Var, ud1Var3, z) { // from class: j40
                    public final /* synthetic */ kn0 A;
                    public final /* synthetic */ ud1 B;
                    public final /* synthetic */ boolean C;
                    public final /* synthetic */ cc6 y;
                    public final /* synthetic */ sj2 z;

                    {
                        this.B = ud1Var3;
                        this.C = z;
                    }

                    @Override // defpackage.sb2
                    public final Object invoke() {
                        f96 f96Var;
                        bx5 bx5Var;
                        gi6.this.getClass();
                        cc6 cc6Var4 = this.y;
                        boolean z20 = this.C;
                        if (!z20 && (f96Var = cc6Var4.d.a) != null && (bx5Var = f96Var.R) != null) {
                            bx5Var.l(null);
                            f96Var.R = null;
                        }
                        cc6Var4.j = this.z;
                        cc6Var4.g = this.A;
                        cc6Var4.c = this.B;
                        cc6Var4.i = z20;
                        return pn6.a;
                    }
                };
                z10 = z;
                kd2Var.n0(obj3);
            } else {
                z10 = z;
                obj4 = obj2;
                cc6Var2 = cc6Var3;
                obj3 = Q9;
                gi6Var = gi6Var2;
            }
            db.m((sb2) obj3, kd2Var);
            boolean h3 = kd2Var.h(cc6Var2);
            Object Q10 = kd2Var.Q();
            if (h3 || Q10 == obj5) {
                Q10 = new k40(cc6Var2, (byte) 0);
                kd2Var.n0(Q10);
            }
            db.c(cc6Var2, (ub2) Q10, kd2Var);
            int i27 = o83Var.c;
            if (i27 == 7 || i27 == 8) {
                z11 = false;
            } else {
                z11 = true;
            }
            final rb6 rb6Var = (rb6) cc6Var2.q.getValue();
            t44 t44Var3 = t44Var;
            boolean g = kd2Var.g(z11) | kd2Var.h(t44Var3);
            Object Q11 = kd2Var.Q();
            if (g || Q11 == obj5) {
                Q11 = new l40((byte) 0, t44Var3, z11);
                kd2Var.n0(Q11);
            }
            yz3 Q12 = bb4.Q(yz3Var, z10, z11, (sb2) Q11);
            int i28 = i7;
            final cc6 cc6Var4 = cc6Var2;
            final dd6 dd6Var3 = dd6Var;
            yz3 w = Q12.w(new w96(gi6Var, dd6Var3, cc6Var4, z10, o83Var, he5Var, i26, u34Var, t44Var3));
            if (z && rb6Var == rb6.x) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (ia3Var == ia3.y && rg4Var != rg4Var3) {
                yc5Var2 = yc5Var;
                rg4Var2 = rg4Var;
                z13 = false;
            } else {
                yc5Var2 = yc5Var;
                rg4Var2 = rg4Var;
                z13 = true;
            }
            yz3 a2 = fd5.a(w, yc5Var2, rg4Var2, z12, z13, u34Var);
            sq4.a.getClass();
            yz3 p = n77.p(kb0.G(a2, kb0.l), new vl5(cc6Var4, obj4, (byte) 5));
            vo3 c = b90.c(pk2.y, true);
            int hashCode = Long.hashCode(kd2Var.T);
            al4 l = kd2Var.l();
            yz3 E = o80.E(kd2Var, p);
            tt0.d.getClass();
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(za3.p0);
            } else {
                kd2Var.q0();
            }
            ss5.i(p7.F, kd2Var, c);
            ss5.i(p7.E, kd2Var, l);
            ss5.i(p7.G, kd2Var, Integer.valueOf(hashCode));
            ss5.h(kd2Var);
            ss5.i(p7.D, kd2Var, E);
            final gi6 gi6Var3 = gi6Var;
            kd2Var2 = kd2Var;
            final rg4 rg4Var4 = rg4Var2;
            z14 = z;
            te4.g(cc6Var4, z14, nx7.R(-673241599, new ic2() { // from class: m40
                @Override // defpackage.ic2
                public final Object invoke(Object obj7, Object obj8) {
                    boolean z20;
                    kd2 kd2Var3 = (kd2) obj7;
                    int intValue = ((Integer) obj8).intValue();
                    if ((intValue & 3) != 2) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    if (kd2Var3.V(intValue & 1, z20)) {
                        v96 v96Var2 = v96.this;
                        if (v96Var2 == null) {
                            v96Var2 = p7.A;
                        }
                        final u34 u34Var2 = u34Var;
                        final sa6 sa6Var2 = sa6Var;
                        final xd6 xd6Var2 = xd6Var;
                        final dd6 dd6Var4 = dd6Var3;
                        final boolean z21 = i26;
                        final rb6 rb6Var2 = rb6Var;
                        final gi6 gi6Var4 = gi6Var3;
                        final cc6 cc6Var5 = cc6Var4;
                        final ka0 ka0Var2 = ka0Var;
                        final boolean z22 = z;
                        final yc5 yc5Var3 = yc5Var;
                        final rg4 rg4Var5 = rg4Var4;
                        final fg6 fg6Var2 = fg6Var;
                        final bn4 bn4Var2 = bn4Var;
                        final o83 o83Var2 = o83Var;
                        v96Var2.c(nx7.R(1969169726, new ic2() { // from class: o40
                            @Override // defpackage.ic2
                            public final Object invoke(Object obj9, Object obj10) {
                                boolean z23;
                                int i29;
                                boolean z24;
                                kd2 kd2Var4 = (kd2) obj9;
                                int intValue2 = ((Integer) obj10).intValue();
                                if ((intValue2 & 3) != 2) {
                                    z23 = true;
                                } else {
                                    z23 = false;
                                }
                                if (kd2Var4.V(intValue2 & 1, z23)) {
                                    Object Q13 = kd2Var4.Q();
                                    q18 q18Var = au0.a;
                                    if (Q13 == q18Var) {
                                        Q13 = xt5.g(Boolean.FALSE);
                                        kd2Var4.n0(Q13);
                                    }
                                    w44 w44Var = (w44) Q13;
                                    u34 u34Var3 = u34.this;
                                    boolean f5 = kd2Var4.f(u34Var3);
                                    Object Q14 = kd2Var4.Q();
                                    if (f5 || Q14 == q18Var) {
                                        Q14 = new en1(u34Var3, w44Var, null, (byte) 1);
                                        kd2Var4.n0(Q14);
                                    }
                                    db.f((ic2) Q14, kd2Var4, u34Var3);
                                    Object Q15 = kd2Var4.Q();
                                    if (Q15 == q18Var) {
                                        Q15 = xt5.g(Boolean.FALSE);
                                        kd2Var4.n0(Q15);
                                    }
                                    w44 w44Var2 = (w44) Q15;
                                    boolean f6 = kd2Var4.f(u34Var3);
                                    Object Q16 = kd2Var4.Q();
                                    if (f6 || Q16 == q18Var) {
                                        Q16 = new en1(u34Var3, w44Var2, null, (byte) 0);
                                        kd2Var4.n0(Q16);
                                    }
                                    db.f((ic2) Q16, kd2Var4, u34Var3);
                                    r47 r47Var = (r47) kd2Var4.j(bv0.u);
                                    boolean f7 = kd2Var4.f(u34Var3) | kd2Var4.f(r47Var);
                                    Object Q17 = kd2Var4.Q();
                                    if (f7 || Q17 == q18Var) {
                                        Q17 = ut5.b(new n(r47Var, w44Var, (byte) 17));
                                        kd2Var4.n0(Q17);
                                    }
                                    px5 px5Var = (px5) Q17;
                                    ((Boolean) w44Var.getValue()).getClass();
                                    if (sa6Var2 instanceof ra6) {
                                        i29 = Integer.MAX_VALUE;
                                    } else {
                                        i29 = 1;
                                    }
                                    dd6 dd6Var5 = dd6Var4;
                                    yz3 A = tl7.A(vz3.x, new fr5(dd6Var5, (byte) 4));
                                    q23.X(1, i29);
                                    xd6 xd6Var3 = xd6Var2;
                                    boolean z25 = z21;
                                    if (i29 != Integer.MAX_VALUE && !z25) {
                                        A = A.w(new wk2(xd6Var3, 1, i29));
                                    }
                                    yz3 l2 = n03.l(A.w(new gc6(xd6Var3)));
                                    boolean booleanValue = ((Boolean) px5Var.getValue()).booleanValue();
                                    boolean booleanValue2 = ((Boolean) w44Var2.getValue()).booleanValue();
                                    if (rb6Var2 == rb6.y) {
                                        z24 = true;
                                    } else {
                                        z24 = false;
                                    }
                                    gi6 gi6Var5 = gi6Var4;
                                    cc6 cc6Var6 = cc6Var5;
                                    ka0 ka0Var3 = ka0Var2;
                                    boolean z26 = z22;
                                    yz3 w2 = l2.w(new q96(booleanValue, booleanValue2, z24, dd6Var5, gi6Var5, cc6Var6, ka0Var3, z26, yc5Var3, rg4Var5, fg6Var2, bn4Var2));
                                    vo3 c2 = b90.c(pk2.y, true);
                                    int hashCode2 = Long.hashCode(kd2Var4.T);
                                    al4 l3 = kd2Var4.l();
                                    yz3 E2 = o80.E(kd2Var4, w2);
                                    tt0.d.getClass();
                                    kd2Var4.h0();
                                    if (kd2Var4.S) {
                                        kd2Var4.k(za3.p0);
                                    } else {
                                        kd2Var4.q0();
                                    }
                                    ss5.i(p7.F, kd2Var4, c2);
                                    ss5.i(p7.E, kd2Var4, l3);
                                    ss5.i(p7.G, kd2Var4, Integer.valueOf(hashCode2));
                                    ss5.h(kd2Var4);
                                    ss5.i(p7.D, kd2Var4, E2);
                                    b90.a(new jc6(dd6Var5, gi6Var5, xd6Var3, z25, o83Var2), kd2Var4, 0);
                                    if (z26 && ((Boolean) px5Var.getValue()).booleanValue() && ((Boolean) cc6Var6.k.getValue()).booleanValue()) {
                                        kd2Var4.e0(-810654004);
                                        s40.e(cc6Var6, kd2Var4, 0);
                                        kd2Var4.e0(-810526873);
                                        s40.d(cc6Var6, kd2Var4, 0);
                                        kd2Var4.q(false);
                                        kd2Var4.q(false);
                                    } else {
                                        kd2Var4.e0(-810390690);
                                        kd2Var4.q(false);
                                    }
                                    kd2Var4.q(true);
                                } else {
                                    kd2Var4.Y();
                                }
                                return pn6.a;
                            }
                        }, kd2Var3), kd2Var3, 6);
                    } else {
                        kd2Var3.Y();
                    }
                    return pn6.a;
                }
            }, kd2Var2), kd2Var2, ((i28 >> 3) & 112) | 384);
            kd2Var2.q(true);
        } else {
            kd2Var2 = kd2Var;
            kd2Var2.Y();
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            final boolean z20 = z14;
            u.d = new ic2() { // from class: n40
                @Override // defpackage.ic2
                public final Object invoke(Object obj7, Object obj8) {
                    ((Integer) obj8).getClass();
                    s40.b(ic6.this, yz3Var, z20, xd6Var, o83Var, he5Var, sa6Var, ka0Var, v96Var, yc5Var, (kd2) obj7, kb0.N(i | 1), kb0.N(i2));
                    return pn6.a;
                }
            };
        }
    }

    public static final void c(final mc6 mc6Var, final ub2 ub2Var, final yz3 yz3Var, boolean z, final xd6 xd6Var, final o83 o83Var, final m83 m83Var, final boolean z2, int i, int i2, p65 p65Var, ub2 ub2Var2, final su5 su5Var, final os0 os0Var, kd2 kd2Var, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z3;
        final boolean z4;
        final int i12;
        final int i13;
        final p65 p65Var2;
        final ub2 ub2Var3;
        int i14;
        ub2 ub2Var4;
        p65 p65Var3;
        int i15;
        int i16;
        boolean z5;
        int i17;
        int i18;
        int i19;
        boolean z6;
        kd2Var.f0(-971111025);
        if (kd2Var.f(mc6Var)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i20 = i3 | i4;
        if (kd2Var.h(ub2Var)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i21 = i20 | i5;
        if (kd2Var.f(yz3Var)) {
            i6 = 256;
        } else {
            i6 = 128;
        }
        int i22 = i21 | i6 | 27648;
        if (kd2Var.f(xd6Var)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i23 = i22 | i7;
        if (kd2Var.f(o83Var)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i24 = i23 | i8;
        if (kd2Var.f(m83Var)) {
            i9 = 8388608;
        } else {
            i9 = 4194304;
        }
        int i25 = i24 | i9;
        if (kd2Var.g(z2)) {
            i10 = 67108864;
        } else {
            i10 = 33554432;
        }
        int i26 = i25 | i10 | 268435456;
        if (kd2Var.f(su5Var)) {
            i11 = 16384;
        } else {
            i11 = 8192;
        }
        int i27 = i11 | 200118;
        boolean z7 = true;
        if ((306783379 & i26) == 306783378 && (74899 & i27) == 74898) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (kd2Var.V(i26 & 1, z3)) {
            kd2Var.a0();
            int i28 = i3 & 1;
            q18 q18Var = au0.a;
            if (i28 != 0 && !kd2Var.C()) {
                kd2Var.Y();
                i15 = i;
                i17 = i2;
                p65Var3 = p65Var;
                ub2Var4 = ub2Var2;
                i16 = i26 & (-1879048193);
                z5 = z;
            } else {
                if (z2) {
                    i14 = 1;
                } else {
                    i14 = Integer.MAX_VALUE;
                }
                int i29 = i26 & (-1879048193);
                p65 p65Var4 = nr1.S;
                Object Q = kd2Var.Q();
                if (Q == q18Var) {
                    Q = new ui((byte) 18);
                    kd2Var.n0(Q);
                }
                ub2 ub2Var5 = (ub2) Q;
                int i30 = i14;
                ub2Var4 = ub2Var5;
                p65Var3 = p65Var4;
                i15 = i30;
                i16 = i29;
                z5 = true;
                i17 = 1;
            }
            kd2Var.r();
            ub2 ub2Var6 = ub2Var4;
            yv2 b = o83Var.b(z2);
            boolean z8 = z5;
            p65 p65Var5 = p65Var3;
            boolean z9 = !z2;
            if (z2) {
                i18 = 1;
            } else {
                i18 = i17;
            }
            if (z2) {
                i19 = 1;
            } else {
                i19 = i15;
            }
            if ((i16 & 14) == 4) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z10 = z6;
            if ((i16 & 112) != 32) {
                z7 = false;
            }
            boolean z11 = z10 | z7;
            Object Q2 = kd2Var.Q();
            if (z11 || Q2 == q18Var) {
                Q2 = new b0(mc6Var, ub2Var, (byte) 15);
                kd2Var.n0(Q2);
            }
            n77.f(mc6Var, (ub2) Q2, yz3Var, xd6Var, p65Var5, ub2Var6, su5Var, z9, i19, i18, b, m83Var, z8, os0Var, kd2Var, ((i16 >> 6) & 7168) | (i16 & 910) | 1794048 | ((i27 << 9) & 29360128), ((i16 >> 15) & 896) | 224256);
            p65Var2 = p65Var5;
            i12 = i15;
            i13 = i17;
            ub2Var3 = ub2Var6;
            z4 = z8;
        } else {
            kd2Var.Y();
            z4 = z;
            i12 = i;
            i13 = i2;
            p65Var2 = p65Var;
            ub2Var3 = ub2Var2;
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ic2(ub2Var, yz3Var, z4, xd6Var, o83Var, m83Var, z2, i12, i13, p65Var2, ub2Var3, su5Var, os0Var, i3) { // from class: i40
                public final /* synthetic */ boolean A;
                public final /* synthetic */ xd6 B;
                public final /* synthetic */ o83 C;
                public final /* synthetic */ m83 D;
                public final /* synthetic */ boolean E;
                public final /* synthetic */ int F;
                public final /* synthetic */ boolean G;
                public final /* synthetic */ p65 H;
                public final /* synthetic */ ub2 I;
                public final /* synthetic */ su5 J;
                public final /* synthetic */ os0 K;
                public final /* synthetic */ ub2 y;
                public final /* synthetic */ yz3 z;

                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int N = kb0.N(1);
                    mc6 mc6Var2 = mc6.this;
                    ub2 ub2Var7 = this.y;
                    yz3 yz3Var2 = this.z;
                    boolean z12 = this.A;
                    xd6 xd6Var2 = this.B;
                    o83 o83Var2 = this.C;
                    m83 m83Var2 = this.D;
                    boolean z13 = this.E;
                    int i31 = this.F;
                    boolean z14 = this.G;
                    p65 p65Var6 = this.H;
                    ub2 ub2Var8 = this.I;
                    su5 su5Var2 = this.J;
                    os0 os0Var2 = this.K;
                    s40.c(mc6Var2, ub2Var7, yz3Var2, z12, xd6Var2, o83Var2, m83Var2, z13, i31, z14 ? 1 : 0, p65Var6, ub2Var8, su5Var2, os0Var2, (kd2) obj, N);
                    return pn6.a;
                }
            };
        }
    }

    public static final void d(cc6 cc6Var, kd2 kd2Var, int i) {
        int i2;
        boolean z;
        kd2 kd2Var2;
        kd2Var.f0(1991581797);
        if (kd2Var.h(cc6Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i3 & 1, z)) {
            boolean f = kd2Var.f(cc6Var);
            Object Q = kd2Var.Q();
            q18 q18Var = au0.a;
            if (f || Q == q18Var) {
                Q = ut5.b(new g40(cc6Var, (byte) 2));
                kd2Var.n0(Q);
            }
            if (((Boolean) ((px5) Q).getValue()).booleanValue()) {
                kd2Var.e0(535437134);
                boolean h = kd2Var.h(cc6Var);
                Object Q2 = kd2Var.Q();
                if (h || Q2 == q18Var) {
                    Q2 = new q40(cc6Var, (byte) 0);
                    kd2Var.n0(Q2);
                }
                ad4 ad4Var = (ad4) Q2;
                boolean h2 = kd2Var.h(cc6Var);
                Object Q3 = kd2Var.Q();
                if (h2 || Q3 == q18Var) {
                    Q3 = new r40(cc6Var, (byte) 0);
                    kd2Var.n0(Q3);
                }
                kd2Var2 = kd2Var;
                rb.a(ad4Var, v36.a(vz3.x, cc6Var, (PointerInputEventHandler) Q3), a, kd2Var2, 384, 0);
                kd2Var2.q(false);
            } else {
                kd2Var2 = kd2Var;
                kd2Var2.e0(535820573);
                kd2Var2.q(false);
            }
        } else {
            kd2Var2 = kd2Var;
            kd2Var2.Y();
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            u.d = new h40(cc6Var, i, (byte) 1);
        }
    }

    public static final void e(cc6 cc6Var, kd2 kd2Var, int i) {
        int i2;
        boolean z;
        q18 q18Var;
        vz3 vz3Var;
        kd2Var.f0(2025287684);
        if (kd2Var.h(cc6Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i3 & 1, z)) {
            boolean f = kd2Var.f(cc6Var);
            Object Q = kd2Var.Q();
            q18 q18Var2 = au0.a;
            if (f || Q == q18Var2) {
                Q = ut5.b(new g40(cc6Var, (byte) 0));
                kd2Var.n0(Q);
            }
            ja6 ja6Var = (ja6) ((px5) Q).getValue();
            boolean z2 = ja6Var.a;
            vz3 vz3Var2 = vz3.x;
            if (z2) {
                kd2Var.e0(-354609545);
                boolean h = kd2Var.h(cc6Var);
                Object Q2 = kd2Var.Q();
                if (h || Q2 == q18Var2) {
                    Q2 = new q40(cc6Var, (byte) 1);
                    kd2Var.n0(Q2);
                }
                ad4 ad4Var = (ad4) Q2;
                c45 c45Var = ja6Var.d;
                boolean z3 = ja6Var.e;
                boolean h2 = kd2Var.h(cc6Var);
                Object Q3 = kd2Var.Q();
                if (h2 || Q3 == q18Var2) {
                    Q3 = new r40(cc6Var, (byte) 1);
                    kd2Var.n0(Q3);
                }
                vz3Var = vz3Var2;
                q18Var = q18Var2;
                x97.h(ad4Var, true, c45Var, z3, a, ja6Var.c, v36.a(vz3Var2, cc6Var, (PointerInputEventHandler) Q3), kd2Var, 24624, 0);
                kd2Var.q(false);
            } else {
                q18Var = q18Var2;
                vz3Var = vz3Var2;
                kd2Var.e0(-353981826);
                kd2Var.q(false);
            }
            boolean f2 = kd2Var.f(cc6Var);
            Object Q4 = kd2Var.Q();
            if (f2 || Q4 == q18Var) {
                Q4 = ut5.b(new g40(cc6Var, (byte) 1));
                kd2Var.n0(Q4);
            }
            ja6 ja6Var2 = (ja6) ((px5) Q4).getValue();
            if (ja6Var2.a) {
                kd2Var.e0(-353488678);
                boolean h3 = kd2Var.h(cc6Var);
                Object Q5 = kd2Var.Q();
                if (h3 || Q5 == q18Var) {
                    Q5 = new q40(cc6Var, (byte) 2);
                    kd2Var.n0(Q5);
                }
                ad4 ad4Var2 = (ad4) Q5;
                c45 c45Var2 = ja6Var2.d;
                boolean z4 = ja6Var2.e;
                boolean h4 = kd2Var.h(cc6Var);
                Object Q6 = kd2Var.Q();
                if (h4 || Q6 == q18Var) {
                    Q6 = new r40(cc6Var, (byte) 2);
                    kd2Var.n0(Q6);
                }
                x97.h(ad4Var2, false, c45Var2, z4, a, ja6Var2.c, v36.a(vz3Var, cc6Var, (PointerInputEventHandler) Q6), kd2Var, 24624, 0);
                kd2Var.q(false);
            } else {
                kd2Var.e0(-352863842);
                kd2Var.q(false);
            }
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new h40(cc6Var, i, (byte) 0);
        }
    }
}
