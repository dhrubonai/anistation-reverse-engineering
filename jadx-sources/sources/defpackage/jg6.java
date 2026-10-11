package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class jg6 {
    public static final vh4 a = new vh4(8.0f, 4.0f, 8.0f, 4.0f);

    public static final void a(final lg6 lg6Var, yz3 yz3Var, float f, om5 om5Var, long j, long j2, final os0 os0Var, kd2 kd2Var, final int i) {
        int i2;
        boolean z;
        yz3 yz3Var2;
        final float f2;
        final om5 om5Var2;
        final long j3;
        final long j4;
        float f3;
        long d;
        int i3;
        om5 om5Var3;
        long j5;
        int i4;
        boolean h;
        int i5;
        kd2Var.f0(-343758958);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h = kd2Var.f(lg6Var);
            } else {
                h = kd2Var.h(lg6Var);
            }
            if (h) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        int i6 = i2 | 3504;
        if ((i & 24576) == 0) {
            i6 = i2 | 11696;
        }
        if ((196608 & i) == 0) {
            i6 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i6 |= 524288;
        }
        int i7 = 113246208 | i6;
        if ((805306368 & i) == 0) {
            if (kd2Var.h(os0Var)) {
                i4 = 536870912;
            } else {
                i4 = 268435456;
            }
            i7 |= i4;
        }
        if ((306783379 & i7) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i7 & 1, z)) {
            kd2Var.a0();
            if ((i & 1) != 0 && !kd2Var.C()) {
                kd2Var.Y();
                i3 = i7 & (-4186113);
                yz3Var2 = yz3Var;
                f3 = f;
                om5Var3 = om5Var;
                j5 = j;
                d = j2;
            } else {
                f3 = gg6.a;
                om5 a2 = dn5.a(wc7.e, kd2Var);
                long d2 = op0.d(wc7.f, kd2Var);
                d = op0.d(wc7.d, kd2Var);
                i3 = i7 & (-4186113);
                om5Var3 = a2;
                j5 = d2;
                yz3Var2 = vz3.x;
            }
            kd2Var.r();
            kd2Var.e0(-1719831991);
            kd2Var.q(false);
            int i8 = i3 >> 9;
            l36.a(yz3Var2, om5Var3, d, 0L, 0.0f, 0.0f, null, nx7.R(-1573998995, new ig6(f3, j5, os0Var), kd2Var), kd2Var, (57344 & i8) | 12582912 | (i8 & 458752), 72);
            f2 = f3;
            j3 = j5;
            om5Var2 = om5Var3;
            j4 = d;
        } else {
            kd2Var.Y();
            yz3Var2 = yz3Var;
            f2 = f;
            om5Var2 = om5Var;
            j3 = j;
            j4 = j2;
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            final yz3 yz3Var3 = yz3Var2;
            u.d = new ic2() { // from class: hg6
                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    jg6.a(lg6.this, yz3Var3, f2, om5Var2, j3, j4, os0Var, (kd2) obj, kb0.N(i | 1));
                    return pn6.a;
                }
            };
        }
    }

    public static final void b(xr4 xr4Var, os0 os0Var, ng6 ng6Var, yz3 yz3Var, boolean z, os0 os0Var2, kd2 kd2Var, int i) {
        int i2;
        boolean z2;
        yz3 yz3Var2;
        boolean z3;
        int i3;
        boolean h;
        int i4;
        int i5;
        int i6;
        kd2Var.f0(-293753984);
        if ((i & 6) == 0) {
            if (kd2Var.f(xr4Var)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (kd2Var.h(os0Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if ((i & 512) == 0) {
                h = kd2Var.f(ng6Var);
            } else {
                h = kd2Var.h(ng6Var);
            }
            if (h) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        int i7 = i2 | 14380032;
        if ((100663296 & i) == 0) {
            if (kd2Var.h(os0Var2)) {
                i3 = 67108864;
            } else {
                i3 = 33554432;
            }
            i7 |= i3;
        }
        if ((38347923 & i7) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i7 & 1, z2)) {
            xi6 M = tl7.M(ng6Var.b, "tooltip transition", kd2Var, 48);
            Object Q = kd2Var.Q();
            q18 q18Var = au0.a;
            if (Q == q18Var) {
                Q = xt5.g(null);
                kd2Var.n0(Q);
            }
            w44 w44Var = (w44) Q;
            Object Q2 = kd2Var.Q();
            if (Q2 == q18Var) {
                new cf(w44Var, (byte) 28);
                Q2 = new Object();
                kd2Var.n0(Q2);
            }
            io3.c(xr4Var, nx7.R(-527401546, new nx3(M, os0Var, (lg6) Q2), kd2Var), ng6Var, nx7.R(-23901870, new d50(w44Var, os0Var2, (byte) 5), kd2Var), kd2Var, (i7 & 14) | 100663344 | (i7 & 896) | (i7 & 7168) | (57344 & i7) | (458752 & i7) | (3670016 & i7) | (i7 & 29360128));
            yz3Var2 = vz3.x;
            z3 = true;
        } else {
            kd2Var.Y();
            yz3Var2 = yz3Var;
            z3 = z;
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new tl(xr4Var, os0Var, ng6Var, yz3Var2, z3, os0Var2, i);
        }
    }
}
