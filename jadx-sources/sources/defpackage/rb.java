package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class rb {
    public static final float a = (25.0f * 2.0f) / 2.4142137f;

    public static final void a(final ad4 ad4Var, final yz3 yz3Var, long j, kd2 kd2Var, final int i, final int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        kd2Var.f0(1776202187);
        if (kd2Var.f(ad4Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i3 | i;
        if (kd2Var.f(yz3Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0 && kd2Var.e(j)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i7 |= i5;
        }
        boolean z2 = true;
        if ((i7 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i7 & 1, z)) {
            kd2Var.a0();
            if ((i & 1) != 0 && !kd2Var.C()) {
                kd2Var.Y();
                if ((i2 & 4) != 0) {
                    i7 &= -897;
                }
            } else if ((i2 & 4) != 0) {
                i7 &= -897;
                j = 9205357640488583168L;
            }
            kd2Var.r();
            int i8 = i7 & 14;
            if (i8 != 4) {
                z2 = false;
            }
            Object Q = kd2Var.Q();
            if (z2 || Q == au0.a) {
                Q = new l0(ad4Var, (byte) 10);
                kd2Var.n0(Q);
            }
            x97.e(ad4Var, pk2.z, nx7.R(-1653527038, new mb(j, rh5.a(yz3Var, false, (ub2) Q)), kd2Var), kd2Var, i8 | 432);
        } else {
            kd2Var.Y();
        }
        final long j2 = j;
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ic2() { // from class: nb
                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    rb.a(ad4.this, yz3Var, j2, (kd2) obj, kb0.N(i | 1), i2);
                    return pn6.a;
                }
            };
        }
    }

    public static final void b(yz3 yz3Var, kd2 kd2Var, int i, int i2) {
        int i3;
        int i4;
        boolean z;
        kd2Var.f0(694251107);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i4 = i | 6;
        } else {
            if (kd2Var.f(yz3Var)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i4 = i3 | i;
        }
        if ((i4 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i4 & 1, z)) {
            if (i5 != 0) {
                yz3Var = vz3.x;
            }
            ov5.a(kd2Var, nx7.x(ar5.j(yz3Var, a, 25.0f), new pb(((qd6) kd2Var.j(rd6.a)).a, (byte) 0)));
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ob(yz3Var, i, i2);
        }
    }
}
