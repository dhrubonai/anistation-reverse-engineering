package defpackage;

import android.content.res.Configuration;
import com.anistation.android.R;
import com.anistation.navigation.Route;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class lm1 {
    public static final void a(final pm1 pm1Var, final boolean z, final ub2 ub2Var, final ub2 ub2Var2, final ub2 ub2Var3, final sb2 sb2Var, final sb2 sb2Var2, final sb2 sb2Var3, wc3 wc3Var, kd2 kd2Var, final int i) {
        int i2;
        int i3;
        boolean z2;
        final wc3 wc3Var2;
        zz4 u;
        ic2 ic2Var;
        int i4;
        wc3 a;
        List list;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        final boolean z7;
        final boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        pm1Var.getClass();
        List list2 = pm1Var.a;
        ub2Var.getClass();
        ub2Var2.getClass();
        ub2Var3.getClass();
        sb2Var.getClass();
        sb2Var2.getClass();
        sb2Var3.getClass();
        kd2Var.f0(-836273268);
        if (kd2Var.S) {
            i2 = -kd2Var.I.v;
        } else {
            i2 = kd2Var.G.i;
        }
        if (kd2Var.h(pm1Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i12 = i3 | i;
        if ((i & 48) == 0) {
            if (kd2Var.g(z)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i12 |= i11;
        }
        if ((i & 384) == 0) {
            if (kd2Var.h(ub2Var)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i12 |= i10;
        }
        if ((i & 3072) == 0) {
            if (kd2Var.h(ub2Var2)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i12 |= i9;
        }
        if ((i & 24576) == 0) {
            if (kd2Var.h(ub2Var3)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i12 |= i8;
        }
        if ((i & 196608) == 0) {
            if (kd2Var.h(sb2Var)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i12 |= i7;
        }
        if ((i & 1572864) == 0) {
            if (kd2Var.h(sb2Var2)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i12 |= i6;
        }
        if ((i & 12582912) == 0) {
            if (kd2Var.h(sb2Var3)) {
                i5 = 8388608;
            } else {
                i5 = 4194304;
            }
            i12 |= i5;
        }
        int i13 = i12 | 33554432;
        if ((i13 & 38347923) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i13 & 1, z2)) {
            kd2Var.a0();
            if ((i & 1) != 0 && !kd2Var.C()) {
                kd2Var.Y();
                i4 = i13 & (-234881025);
                a = wc3Var;
            } else {
                i4 = i13 & (-234881025);
                a = yc3.a(kd2Var);
            }
            kd2Var.r();
            Route.Downloads downloads = Route.Downloads.INSTANCE;
            boolean f = kd2Var.f(a);
            Object Q = kd2Var.Q();
            q18 q18Var = au0.a;
            if (!f && Q != q18Var) {
                list = list2;
            } else {
                list = list2;
                Q = new im1(a, null, (byte) 0);
                kd2Var.n0(Q);
            }
            k66.a(downloads, (ub2) Q, kd2Var, 6);
            Object Q2 = kd2Var.Q();
            if (Q2 == q18Var) {
                Q2 = xt5.g(Boolean.FALSE);
                kd2Var.n0(Q2);
            }
            final w44 w44Var = (w44) Q2;
            int i14 = i4 & 14;
            if (i14 != 4 && !kd2Var.h(pm1Var)) {
                z3 = false;
            } else {
                z3 = true;
            }
            int i15 = i4 & 7168;
            boolean z12 = z3;
            if (i15 == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z13 = z12 | z4;
            if ((i4 & 3670016) == 1048576) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z14 = z13 | z5;
            Object Q3 = kd2Var.Q();
            if (z14 || Q3 == q18Var) {
                Q3 = new mi((Object) pm1Var, ub2Var2, (Object) sb2Var2, (byte) 7);
                kd2Var.n0(Q3);
            }
            int i16 = i4 >> 3;
            z51.a(z, (sb2) Q3, kd2Var, i16 & 14, 0);
            z22 z22Var = ar5.c;
            final wc3 wc3Var3 = a;
            yz3 h = bx7.h(z22Var, ((mp0) kd2Var.j(op0.a)).n, io3.h);
            vo3 c = b90.c(pk2.y, false);
            int hashCode = Long.hashCode(kd2Var.T);
            al4 l = kd2Var.l();
            yz3 E = o80.E(kd2Var, h);
            tt0.d.getClass();
            kd2Var.h0();
            boolean z15 = kd2Var.S;
            t53 t53Var = za3.p0;
            if (z15) {
                kd2Var.k(t53Var);
            } else {
                kd2Var.q0();
            }
            st0 st0Var = p7.F;
            ss5.i(st0Var, kd2Var, c);
            ys0 ys0Var = p7.E;
            ss5.i(ys0Var, kd2Var, l);
            Integer valueOf = Integer.valueOf(hashCode);
            int i17 = i2;
            st0 st0Var2 = p7.G;
            ss5.i(st0Var2, kd2Var, valueOf);
            ss5.h(kd2Var);
            ys0 ys0Var2 = p7.D;
            ss5.i(ys0Var2, kd2Var, E);
            kd2Var.e0(-320154341);
            if (list.isEmpty() && !pm1Var.h) {
                kd2Var.e0(-320184629);
                yz3 V = n77.V(z22Var, 0.0f, 0.0f, 0.0f, 5.0f, 7);
                xp0 a2 = vp0.a(x97.z, pk2.K, kd2Var, 0);
                int hashCode2 = Long.hashCode(kd2Var.T);
                al4 l2 = kd2Var.l();
                yz3 E2 = o80.E(kd2Var, V);
                kd2Var.h0();
                if (kd2Var.S) {
                    kd2Var.k(t53Var);
                } else {
                    kd2Var.q0();
                }
                ss5.i(st0Var, kd2Var, a2);
                ss5.i(ys0Var, kd2Var, l2);
                h11.q(hashCode2, kd2Var, st0Var2, kd2Var);
                ss5.i(ys0Var2, kd2Var, E2);
                boolean z16 = pm1Var.c;
                boolean z17 = !pm1Var.d.isEmpty();
                boolean z18 = !list.isEmpty();
                if (i15 == 2048) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (i14 != 4 && !kd2Var.h(pm1Var)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                boolean z19 = z10 | z9;
                Object Q4 = kd2Var.Q();
                if (!z19 && Q4 != q18Var) {
                    z11 = true;
                } else {
                    z11 = true;
                    Q4 = new hm1(ub2Var2, pm1Var, (byte) 1);
                    kd2Var.n0(Q4);
                }
                sb2 sb2Var4 = (sb2) Q4;
                Object Q5 = kd2Var.Q();
                if (Q5 == q18Var) {
                    Q5 = new cf(w44Var, (byte) 18);
                    kd2Var.n0(Q5);
                }
                om1.a(z16, z17, z18, null, sb2Var4, (sb2) Q5, sb2Var3, kd2Var, (i16 & 3670016) | 196608);
                yz3 V2 = n77.V(ar5.c(new ob3(1.0f, z11), 1.0f), 0.0f, 0.0f, 0.0f, 5.0f, 7);
                vo3 c2 = b90.c(pk2.C, false);
                int hashCode3 = Long.hashCode(kd2Var.T);
                al4 l3 = kd2Var.l();
                yz3 E3 = o80.E(kd2Var, V2);
                kd2Var.h0();
                if (kd2Var.S) {
                    kd2Var.k(t53Var);
                } else {
                    kd2Var.q0();
                }
                ss5.i(st0Var, kd2Var, c2);
                ss5.i(ys0Var, kd2Var, l3);
                h11.q(hashCode3, kd2Var, st0Var2, kd2Var);
                ss5.i(ys0Var2, kd2Var, E3);
                h98.d(lz5.f(R.string.downloads, kd2Var), lz5.f(R.string.no_downloads_message, kd2Var), null, kd2Var, 0, 4);
                kd2Var.q(z11);
                kd2Var.q(z11);
                kd2Var.w(i17);
                u = kd2Var.u();
                if (u != null) {
                    final byte b = 1;
                    ic2Var = new ic2() { // from class: gm1
                        @Override // defpackage.ic2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b2 = b;
                            pn6 pn6Var = pn6.a;
                            int i18 = i;
                            switch (b2) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int N = kb0.N(i18 | 1);
                                    lm1.a(pm1Var, z, ub2Var, ub2Var2, ub2Var3, sb2Var, sb2Var2, sb2Var3, wc3Var3, (kd2) obj, N);
                                    return pn6Var;
                                default:
                                    ((Integer) obj2).getClass();
                                    int N2 = kb0.N(i18 | 1);
                                    lm1.a(pm1Var, z, ub2Var, ub2Var2, ub2Var3, sb2Var, sb2Var2, sb2Var3, wc3Var3, (kd2) obj, N2);
                                    return pn6Var;
                            }
                        }
                    };
                    u.d = ic2Var;
                }
                return;
            }
            boolean z20 = false;
            kd2Var.e0(-319011248);
            kd2Var.q(false);
            Configuration configuration = (Configuration) kd2Var.j(eb.a);
            if (configuration.smallestScreenWidthDp >= 600) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (configuration.orientation == 2) {
                z7 = z6;
                z8 = true;
            } else {
                z7 = z6;
                z8 = false;
            }
            x97.b(z22Var, null, nx7.R(-2082292632, new jc2() { // from class: fm1
                @Override // defpackage.jc2
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    boolean z21;
                    int i18;
                    p90 p90Var = (p90) obj;
                    kd2 kd2Var2 = (kd2) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    p90Var.getClass();
                    int i19 = 2;
                    if ((intValue & 6) == 0) {
                        if (kd2Var2.f(p90Var)) {
                            i18 = 4;
                        } else {
                            i18 = 2;
                        }
                        intValue |= i18;
                    }
                    if ((intValue & 19) != 18) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    if (kd2Var2.V(intValue & 1, z21)) {
                        boolean z22 = z7;
                        boolean z23 = z8;
                        if (z22 && (z23 || vm1.b(p90Var.c(), 840.0f) >= 0)) {
                            i19 = 3;
                        } else if (!z22 && !z23 && vm1.b(p90Var.c(), 600.0f) < 0) {
                            i19 = 1;
                        }
                        ki2 ki2Var = new ki2(i19);
                        vr vrVar = new vr(15.0f, true, new ze0((byte) 6));
                        vr vrVar2 = new vr(15.0f, true, new ze0((byte) 6));
                        z22 z22Var2 = ar5.c;
                        final pm1 pm1Var2 = pm1Var;
                        boolean h2 = kd2Var2.h(pm1Var2);
                        final ub2 ub2Var4 = ub2Var2;
                        boolean f2 = h2 | kd2Var2.f(ub2Var4);
                        final sb2 sb2Var5 = sb2Var3;
                        boolean f3 = f2 | kd2Var2.f(sb2Var5) | kd2Var2.d(i19);
                        final ub2 ub2Var5 = ub2Var;
                        boolean f4 = f3 | kd2Var2.f(ub2Var5);
                        final ub2 ub2Var6 = ub2Var3;
                        boolean f5 = f4 | kd2Var2.f(ub2Var6);
                        Object Q6 = kd2Var2.Q();
                        if (f5 || Q6 == au0.a) {
                            final w44 w44Var2 = w44Var;
                            final int i20 = i19;
                            ub2 ub2Var7 = new ub2() { // from class: em1
                                @Override // defpackage.ub2
                                public final Object invoke(Object obj4) {
                                    bc3 bc3Var = (bc3) obj4;
                                    bc3Var.getClass();
                                    f01 f01Var = new f01((byte) 12);
                                    pm1 pm1Var3 = pm1.this;
                                    bc3.z0(bc3Var, null, f01Var, new os0(-27830732, true, new sd3(pm1Var3, ub2Var4, sb2Var5, w44Var2, (byte) 5)), 5);
                                    List list3 = pm1Var3.a;
                                    bc3Var.A0(list3.size(), new od(new st0((byte) 15), list3, (byte) 11), new eo(list3, (byte) 6), new os0(-1942245546, true, new km1(list3, i20, pm1Var3, ub2Var5, ub2Var6)));
                                    bc3.z0(bc3Var, "downloads-spacer", null, db.g, 6);
                                    return pn6.a;
                                }
                            };
                            kd2Var2.n0(ub2Var7);
                            Q6 = ub2Var7;
                        }
                        x97.g(ki2Var, z22Var2, wc3Var3, null, vrVar2, vrVar, null, false, null, (ub2) Q6, kd2Var2, 1769520, 920);
                    } else {
                        kd2Var2.Y();
                    }
                    return pn6.a;
                }
            }, kd2Var), kd2Var, 3078, 6);
            kd2Var.q(false);
            kd2Var.q(true);
            boolean booleanValue = ((Boolean) w44Var.getValue()).booleanValue();
            String f2 = lz5.f(R.string.delete_downloads, kd2Var);
            String f3 = lz5.f(R.string.delete_downloads_desc, kd2Var);
            if ((458752 & i4) == 131072) {
                z20 = true;
            }
            Object Q6 = kd2Var.Q();
            if (z20 || Q6 == q18Var) {
                Q6 = new o10(sb2Var, w44Var, (byte) 1);
                kd2Var.n0(Q6);
            }
            sb2 sb2Var5 = (sb2) Q6;
            Object Q7 = kd2Var.Q();
            if (Q7 == q18Var) {
                Q7 = new cf(w44Var, (byte) 16);
                kd2Var.n0(Q7);
            }
            iv.a(booleanValue, f2, f3, null, null, null, false, 0L, 0L, 0L, 0L, sb2Var5, (sb2) Q7, null, kd2Var, 0, 384, 10232);
            wc3Var2 = wc3Var3;
        } else {
            kd2Var.Y();
            wc3Var2 = wc3Var;
        }
        u = kd2Var.u();
        if (u != null) {
            final byte b2 = 0;
            ic2Var = new ic2() { // from class: gm1
                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    byte b22 = b2;
                    pn6 pn6Var = pn6.a;
                    int i18 = i;
                    switch (b22) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int N = kb0.N(i18 | 1);
                            lm1.a(pm1Var, z, ub2Var, ub2Var2, ub2Var3, sb2Var, sb2Var2, sb2Var3, wc3Var2, (kd2) obj, N);
                            return pn6Var;
                        default:
                            ((Integer) obj2).getClass();
                            int N2 = kb0.N(i18 | 1);
                            lm1.a(pm1Var, z, ub2Var, ub2Var2, ub2Var3, sb2Var, sb2Var2, sb2Var3, wc3Var2, (kd2) obj, N2);
                            return pn6Var;
                    }
                }
            };
            u.d = ic2Var;
        }
    }
}
