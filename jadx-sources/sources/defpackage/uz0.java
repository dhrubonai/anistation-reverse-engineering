package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class uz0 {
    public static final qz0 a;

    static {
        tq1 tq1Var = ae.a;
        long j = ep0.e;
        long j2 = ep0.b;
        a = new qz0(j, j2, j2, ep0.b(0.38f, j2), ep0.b(0.38f, j2));
    }

    public static final void a(qz0 qz0Var, yz3 yz3Var, os0 os0Var, kd2 kd2Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        kd2Var.f0(-527864079);
        if ((i & 6) == 0) {
            if (kd2Var.f(qz0Var)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (kd2Var.f(yz3Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (kd2Var.h(os0Var)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i2 & 1, z)) {
            x50 x50Var = sz0.a;
            yz3 k0 = n77.k0(n77.T(wk6.L(bx7.h(wk6.F(yz3Var, 3.0f, p75.a(4.0f)), qz0Var.a, io3.h)), 0.0f, sz0.d, 1), n77.d0(kd2Var), 14);
            int i6 = (i2 << 3) & 7168;
            xp0 a2 = vp0.a(x97.z, pk2.K, kd2Var, 0);
            int hashCode = Long.hashCode(kd2Var.T);
            al4 l = kd2Var.l();
            yz3 E = o80.E(kd2Var, k0);
            tt0.d.getClass();
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(za3.p0);
            } else {
                kd2Var.q0();
            }
            ss5.i(p7.F, kd2Var, a2);
            ss5.i(p7.E, kd2Var, l);
            ss5.i(p7.G, kd2Var, Integer.valueOf(hashCode));
            ss5.h(kd2Var);
            ss5.i(p7.D, kd2Var, E);
            os0Var.invoke(yp0.a, kd2Var, Integer.valueOf(((i6 >> 6) & 112) | 6));
            kd2Var.q(true);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new je((byte) 5, i, (Object) qz0Var, (Object) yz3Var, (Object) os0Var);
        }
    }

    public static final void b(yz3 yz3Var, qz0 qz0Var, ub2 ub2Var, kd2 kd2Var, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        kd2Var.f0(-625529233);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i4 = i | 6;
        } else {
            if (kd2Var.f(yz3Var)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i4 = i3 | i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i6 = i4 | 48;
        } else {
            if (kd2Var.f(qz0Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i6 = i4 | i5;
        }
        if (kd2Var.h(ub2Var)) {
            i7 = 256;
        } else {
            i7 = 128;
        }
        int i10 = i6 | i7;
        if ((i10 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i10 & 1, z)) {
            if (i8 != 0) {
                yz3Var = vz3.x;
            }
            if (i9 != 0) {
                qz0Var = a;
            }
            a(qz0Var, yz3Var, nx7.R(-250345048, new h(ub2Var, qz0Var, (byte) 3), kd2Var), kd2Var, ((i10 << 3) & 112) | ((i10 >> 3) & 14) | 384);
        } else {
            kd2Var.Y();
        }
        yz3 yz3Var2 = yz3Var;
        qz0 qz0Var2 = qz0Var;
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new tz0(yz3Var2, qz0Var2, ub2Var, i, i2);
        }
    }

    public static final void c(String str, boolean z, qz0 qz0Var, yz3 yz3Var, jc2 jc2Var, sb2 sb2Var, kd2 kd2Var, int i) {
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        long j;
        long j2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        kd2Var.f0(-2001167027);
        if ((i & 6) == 0) {
            if (kd2Var.f(str)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (kd2Var.g(z)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        if ((i & 384) == 0) {
            if (kd2Var.f(qz0Var)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i2 |= i7;
        }
        if ((i & 3072) == 0) {
            if (kd2Var.f(yz3Var)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        }
        if ((i & 24576) == 0) {
            if (kd2Var.h(jc2Var)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        }
        if ((196608 & i) == 0) {
            if (kd2Var.h(sb2Var)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i2 |= i4;
        }
        if ((74899 & i2) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i2 & 1, z2)) {
            x50 x50Var = sz0.a;
            float f = sz0.c;
            vr vrVar = new vr(f, true, new ze0((byte) 6));
            if ((i2 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((458752 & i2) == 131072) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z5 = z3 | z4;
            Object Q = kd2Var.Q();
            if (z5 || Q == au0.a) {
                Q = new mh(z, sb2Var, (byte) 4);
                kd2Var.n0(Q);
            }
            yz3 T = n77.T(ar5.k(ar5.c(q23.n(12, (sb2) Q, yz3Var, str, z), 1.0f), 112.0f, 48.0f, 280.0f, 48.0f), f, 0.0f, 2);
            z75 a2 = y75.a(vrVar, x50Var, kd2Var, 54);
            int hashCode = Long.hashCode(kd2Var.T);
            al4 l = kd2Var.l();
            yz3 E = o80.E(kd2Var, T);
            tt0.d.getClass();
            kd2Var.h0();
            boolean z6 = kd2Var.S;
            t53 t53Var = za3.p0;
            if (z6) {
                kd2Var.k(t53Var);
            } else {
                kd2Var.q0();
            }
            st0 st0Var = p7.F;
            ss5.i(st0Var, kd2Var, a2);
            ys0 ys0Var = p7.E;
            ss5.i(ys0Var, kd2Var, l);
            Integer valueOf = Integer.valueOf(hashCode);
            st0 st0Var2 = p7.G;
            ss5.i(st0Var2, kd2Var, valueOf);
            ss5.h(kd2Var);
            ys0 ys0Var2 = p7.D;
            ss5.i(ys0Var2, kd2Var, E);
            if (jc2Var == null) {
                kd2Var.e0(-1597947094);
                kd2Var.q(false);
                i3 = i2;
            } else {
                kd2Var.e0(-1597947093);
                float f2 = sz0.e;
                yz3 h = ar5.h(vz3.x, f2, 0.0f, f2, f2, 2);
                vo3 c = b90.c(pk2.y, false);
                i3 = i2;
                int hashCode2 = Long.hashCode(kd2Var.T);
                al4 l2 = kd2Var.l();
                yz3 E2 = o80.E(kd2Var, h);
                kd2Var.h0();
                if (kd2Var.S) {
                    kd2Var.k(t53Var);
                } else {
                    kd2Var.q0();
                }
                ss5.i(st0Var, kd2Var, c);
                ss5.i(ys0Var, kd2Var, l2);
                h11.q(hashCode2, kd2Var, st0Var2, kd2Var);
                ss5.i(ys0Var2, kd2Var, E2);
                if (z) {
                    j = qz0Var.c;
                } else {
                    j = qz0Var.e;
                }
                jc2Var.invoke(new ep0(j), kd2Var, 0);
                kd2Var.q(true);
                kd2Var.q(false);
            }
            if (z) {
                j2 = qz0Var.b;
            } else {
                j2 = qz0Var.d;
            }
            long j3 = j2;
            a34.e(str, new ob3(1.0f, true), new xd6(j3, sz0.h, sz0.i, null, sz0.k, sz0.b, 0, sz0.j, 16613240), 0, false, 1, 0, kd2Var, (i3 & 14) | 1572864, 952);
            kd2Var.q(true);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new tl(str, z, qz0Var, yz3Var, jc2Var, sb2Var, i);
        }
    }
}
