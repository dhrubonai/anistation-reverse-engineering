package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class yc {
    public static final yr4 a = new yr4(true);

    public static final void a(final boolean z, final sb2 sb2Var, final yz3 yz3Var, final long j, yc5 yc5Var, yr4 yr4Var, final om5 om5Var, final long j2, float f, final os0 os0Var, kd2 kd2Var, final int i) {
        int i2;
        sb2 sb2Var2;
        yz3 yz3Var2;
        boolean z2;
        final yc5 yc5Var2;
        final yr4 yr4Var2;
        final float f2;
        int i3;
        yc5 d0;
        float f3;
        yr4 yr4Var3;
        boolean z3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        kd2Var.f0(1725609375);
        if ((i & 6) == 0) {
            if (kd2Var.g(z)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            sb2Var2 = sb2Var;
            if (kd2Var.h(sb2Var2)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        } else {
            sb2Var2 = sb2Var;
        }
        if ((i & 384) == 0) {
            yz3Var2 = yz3Var;
            if (kd2Var.f(yz3Var2)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i2 |= i7;
        } else {
            yz3Var2 = yz3Var;
        }
        if ((i & 3072) == 0) {
            if (kd2Var.e(j)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        int i10 = i2 | 196608;
        if ((1572864 & i) == 0) {
            if (kd2Var.f(om5Var)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i10 |= i5;
        }
        if ((12582912 & i) == 0) {
            if (kd2Var.e(j2)) {
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i10 |= i4;
        }
        int i11 = i10 | 905969664;
        if ((306783379 & i11) == 306783378) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (kd2Var.V(i11 & 1, z2)) {
            kd2Var.a0();
            if ((i & 1) != 0 && !kd2Var.C()) {
                kd2Var.Y();
                i3 = i11 & (-57345);
                d0 = yc5Var;
                yr4Var3 = yr4Var;
                f3 = f;
            } else {
                i3 = i11 & (-57345);
                d0 = n77.d0(kd2Var);
                f3 = ix3.a;
                yr4Var3 = a;
            }
            kd2Var.r();
            Object Q = kd2Var.Q();
            Object obj = au0.a;
            if (Q == obj) {
                Q = new y44(Boolean.FALSE);
                kd2Var.n0(Q);
            }
            y44 y44Var = (y44) Q;
            y44Var.z.setValue(Boolean.valueOf(z));
            if (!((Boolean) y44Var.y.getValue()).booleanValue() && !((Boolean) y44Var.z.getValue()).booleanValue()) {
                kd2Var.e0(1166965571);
                kd2Var.q(false);
            } else {
                kd2Var.e0(1165905588);
                Object Q2 = kd2Var.Q();
                if (Q2 == obj) {
                    Q2 = xt5.g(new xh6(xh6.b));
                    kd2Var.n0(Q2);
                }
                w44 w44Var = (w44) Q2;
                ud1 ud1Var = (ud1) kd2Var.j(bv0.h);
                int i12 = i3;
                if ((i3 & 7168) == 2048) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean f4 = z3 | kd2Var.f(ud1Var);
                Object Q3 = kd2Var.Q();
                if (f4 || Q3 == obj) {
                    Q3 = new bq1(j, ud1Var, new ub(w44Var, (byte) 1));
                    kd2Var.n0(Q3);
                }
                ae.a((bq1) Q3, sb2Var2, yr4Var3, nx7.R(-917492520, new xc(yz3Var2, y44Var, w44Var, d0, om5Var, j2, f3, os0Var), kd2Var), kd2Var, (i12 & 112) | 3072 | ((i12 >> 9) & 896), 0);
                kd2Var.q(false);
            }
            yr4Var2 = yr4Var3;
            yc5Var2 = d0;
            f2 = f3;
        } else {
            kd2Var.Y();
            yc5Var2 = yc5Var;
            yr4Var2 = yr4Var;
            f2 = f;
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ic2() { // from class: wc
                @Override // defpackage.ic2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int N = kb0.N(i | 1);
                    yc.a(z, sb2Var, yz3Var, j, yc5Var2, yr4Var2, om5Var, j2, f2, os0Var, (kd2) obj2, N);
                    return pn6.a;
                }
            };
        }
    }
}
