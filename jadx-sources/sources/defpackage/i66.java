package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class i66 {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final long e;

    static {
        np0 np0Var = tt4.a;
        a = tt4.c;
        b = 16.0f;
        c = 14.0f;
        d = 6.0f;
        e = hz5.g(20);
    }

    public static final void a(final boolean z, final sb2 sb2Var, final yz3 yz3Var, final boolean z2, final long j, final long j2, final os0 os0Var, kd2 kd2Var, final int i) {
        int i2;
        sb2 sb2Var2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        kd2Var.f0(-1573136853);
        if ((i & 6) == 0) {
            if (kd2Var.g(z)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i2 = i10 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            sb2Var2 = sb2Var;
            if (kd2Var.h(sb2Var2)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i2 |= i9;
        } else {
            sb2Var2 = sb2Var;
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
            if (kd2Var.g(z2)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i2 |= i7;
        }
        if ((i & 24576) == 0) {
            if (kd2Var.e(j)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i2 |= i6;
        }
        if ((196608 & i) == 0) {
            if (kd2Var.e(j2)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i2 |= i5;
        }
        if ((1572864 & i) == 0) {
            if (kd2Var.f(null)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i2 |= i4;
        }
        if ((12582912 & i) == 0) {
            if (kd2Var.h(os0Var)) {
                i3 = 8388608;
            } else {
                i3 = 4194304;
            }
            i2 |= i3;
        }
        if ((4793491 & i2) != 4793490) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (kd2Var.V(i2 & 1, z3)) {
            kd2Var.a0();
            if ((i & 1) != 0 && !kd2Var.C()) {
                kd2Var.Y();
            }
            kd2Var.r();
            os0 R = nx7.R(1128552423, new g66(yz3Var, z, j65.a(2, j), z2, sb2Var2, os0Var), kd2Var);
            int i11 = i2 >> 12;
            d(j, j2, z, R, kd2Var, ((i2 << 6) & 896) | (i11 & 112) | (i11 & 14) | 3072);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ic2() { // from class: e66
                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    i66.a(z, sb2Var, yz3Var, z2, j, j2, os0Var, (kd2) obj, kb0.N(i | 1));
                    return pn6.a;
                }
            };
        }
    }

    public static final void b(final boolean z, final sb2 sb2Var, yz3 yz3Var, boolean z2, final ic2 ic2Var, long j, long j2, kd2 kd2Var, final int i) {
        int i2;
        int i3;
        boolean z3;
        final yz3 yz3Var2;
        final boolean z4;
        final long j3;
        final long j4;
        long j5;
        int i4;
        long j6;
        os0 R;
        kd2Var.f0(1015017965);
        byte b2 = 2;
        byte b3 = 4;
        if (kd2Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (kd2Var.h(sb2Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3 | 105581952;
        boolean z5 = true;
        if ((38347923 & i6) != 38347922) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (kd2Var.V(i6 & 1, z3)) {
            kd2Var.a0();
            if ((i & 1) != 0 && !kd2Var.C()) {
                kd2Var.Y();
                i4 = i6 & (-33030145);
                yz3Var2 = yz3Var;
                z5 = z2;
                j5 = j;
                j6 = j2;
            } else {
                j5 = ((ep0) kd2Var.j(ey0.a)).a;
                i4 = i6 & (-33030145);
                yz3Var2 = vz3.x;
                j6 = j5;
            }
            kd2Var.r();
            if (ic2Var == null) {
                kd2Var.e0(1830899669);
                kd2Var.q(false);
                R = null;
            } else {
                kd2Var.e0(1830899670);
                R = nx7.R(-1745256900, new ua5(ic2Var, b3), kd2Var);
                kd2Var.q(false);
            }
            a(z, sb2Var, tl7.A(yz3Var2, new ps0((byte) 4)), z5, j5, j6, nx7.R(-906085472, new wa1(R, b2), kd2Var), kd2Var, (i4 & 112) | (i4 & 14) | 12582912 | 1575936);
            z4 = z5;
            j3 = j5;
            j4 = j6;
        } else {
            kd2Var.Y();
            yz3Var2 = yz3Var;
            z4 = z2;
            j3 = j;
            j4 = j2;
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ic2(z, sb2Var, yz3Var2, z4, ic2Var, j3, j4, i) { // from class: d66
                public final /* synthetic */ boolean A;
                public final /* synthetic */ ic2 B;
                public final /* synthetic */ long C;
                public final /* synthetic */ long D;
                public final /* synthetic */ boolean x;
                public final /* synthetic */ sb2 y;
                public final /* synthetic */ yz3 z;

                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int N = kb0.N(24577);
                    i66.b(this.x, this.y, this.z, this.A, this.B, this.C, this.D, (kd2) obj, N);
                    return pn6.a;
                }
            };
        }
    }

    public static final void c(ic2 ic2Var, kd2 kd2Var, int i) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        y50 y50Var = pk2.y;
        kd2Var.f0(-1349901398);
        byte b2 = 2;
        if (kd2Var.h(ic2Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (kd2Var.h(null)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i5 & 1, z)) {
            int i6 = i5 & 14;
            if (i6 == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i5 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z4 = z3 | z2;
            Object Q = kd2Var.Q();
            if (z4 || Q == au0.a) {
                Q = new yh3(ic2Var, b2);
                kd2Var.n0(Q);
            }
            vo3 vo3Var = (vo3) Q;
            int s = h98.s(kd2Var);
            al4 l = kd2Var.l();
            yz3 E = o80.E(kd2Var, vz3.x);
            tt0.d.getClass();
            kd2Var.h0();
            boolean z5 = kd2Var.S;
            t53 t53Var = za3.p0;
            if (z5) {
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
            if (ic2Var != null) {
                kd2Var.e0(870361332);
                yz3 T = n77.T(wc7.D("text"), b, 0.0f, 2);
                vo3 c2 = b90.c(y50Var, false);
                int s2 = h98.s(kd2Var);
                al4 l2 = kd2Var.l();
                yz3 E2 = o80.E(kd2Var, T);
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
                ic2Var.invoke(kd2Var, Integer.valueOf(i6));
                kd2Var.q(true);
                kd2Var.q(false);
            } else {
                kd2Var.e0(870466081);
                kd2Var.q(false);
            }
            kd2Var.e0(870557345);
            kd2Var.q(false);
            kd2Var.q(true);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new gi3(i, ic2Var);
        }
    }

    public static final void d(final long j, final long j2, boolean z, final os0 os0Var, kd2 kd2Var, final int i) {
        int i2;
        final boolean z2;
        boolean z3;
        long j3;
        int i3;
        long j4;
        long j5;
        boolean z4;
        tw5 N;
        int i4;
        int i5;
        int i6;
        int i7;
        kd2Var.f0(-833145221);
        if ((i & 6) == 0) {
            if (kd2Var.e(j)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (kd2Var.e(j2)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            z2 = z;
            if (kd2Var.g(z2)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i2 |= i5;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            if (kd2Var.h(os0Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        if ((i2 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (kd2Var.V(i2 & 1, z3)) {
            int i8 = i2 >> 6;
            xi6 T = tl7.T(Boolean.valueOf(z2), null, kd2Var, i8 & 14, 2);
            ti4 ti4Var = T.d;
            boolean booleanValue = ((Boolean) ti4Var.getValue()).booleanValue();
            kd2Var.e0(-1069234984);
            if (booleanValue) {
                j3 = j;
            } else {
                j3 = j2;
            }
            kd2Var.q(false);
            pp0 e2 = ep0.e(j3);
            boolean f = kd2Var.f(e2);
            Object Q = kd2Var.Q();
            if (f || Q == au0.a) {
                tk6 tk6Var = new tk6(yj.D, new bk(e2, (byte) 2));
                kd2Var.n0(tk6Var);
                Q = tk6Var;
            }
            tk6 tk6Var2 = (tk6) Q;
            boolean booleanValue2 = ((Boolean) T.a.v()).booleanValue();
            kd2Var.e0(-1069234984);
            if (booleanValue2) {
                i3 = i8;
                j4 = j;
            } else {
                i3 = i8;
                j4 = j2;
            }
            kd2Var.q(false);
            ep0 ep0Var = new ep0(j4);
            boolean booleanValue3 = ((Boolean) ti4Var.getValue()).booleanValue();
            kd2Var.e0(-1069234984);
            if (booleanValue3) {
                j5 = j;
            } else {
                j5 = j2;
            }
            kd2Var.q(false);
            ep0 ep0Var2 = new ep0(j5);
            si6 f2 = T.f();
            kd2Var.e0(1058649156);
            if (f2.b(Boolean.FALSE, Boolean.TRUE)) {
                kd2Var.e0(272207019);
                N = sw0.N(z04.z, kd2Var);
                z4 = false;
                kd2Var.q(false);
            } else {
                z4 = false;
                kd2Var.e0(272326989);
                N = sw0.N(z04.A, kd2Var);
                kd2Var.q(false);
            }
            kd2Var.q(z4);
            ui6 q = tl7.q(T, ep0Var, ep0Var2, N, tk6Var2, kd2Var, 0);
            tq1 tq1Var = ey0.a;
            ep0 ep0Var3 = (ep0) q.G.getValue();
            long j6 = ep0Var3.a;
            kb0.b(tq1Var.a(ep0Var3), os0Var, kd2Var, (i3 & 112) | 8);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ic2() { // from class: f66
                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    i66.d(j, j2, z2, os0Var, (kd2) obj, kb0.N(i | 1));
                    return pn6.a;
                }
            };
        }
    }
}
