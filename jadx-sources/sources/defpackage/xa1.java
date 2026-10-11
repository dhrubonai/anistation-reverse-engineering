package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class xa1 {
    public static final yr4 a;

    static {
        boolean z;
        if ((30 & 1) != 0) {
            z = false;
        } else {
            z = true;
        }
        a = new yr4(z, ef5.x, true, 0);
    }

    public static final void a(b96 b96Var, p86 p86Var, kd2 kd2Var, int i) {
        int i2;
        int i3;
        boolean z;
        kd2 kd2Var2;
        kd2Var.f0(1904307118);
        if (kd2Var.f(b96Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        byte b = 16;
        if (kd2Var.h(p86Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        boolean z2 = false;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i5 & 1, z)) {
            kd2Var.e0(-1009482584);
            Context context = (Context) kd2Var.j(eb.b);
            kd2Var.q(false);
            boolean h = kd2Var.h(p86Var);
            if ((i5 & 14) == 4) {
                z2 = true;
            }
            boolean h2 = h | z2 | kd2Var.h(context);
            Object Q = kd2Var.Q();
            if (h2 || Q == au0.a) {
                Q = new bg((Object) p86Var, (Object) context, (Object) b96Var, (byte) 8);
                kd2Var.n0(Q);
            }
            kd2Var2 = kd2Var;
            uz0.b(null, null, (ub2) Q, kd2Var2, 0, 3);
        } else {
            kd2Var2 = kd2Var;
            kd2Var2.Y();
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            u.d = new q(b, i, b96Var, p86Var);
        }
    }

    public static final void b(final int i, final long j, kd2 kd2Var, final int i2) {
        final int i3;
        int i4;
        boolean z;
        zz4 u;
        ic2 ic2Var;
        boolean z2;
        int i5;
        int i6;
        kd2Var.f0(-1240244237);
        if ((i2 & 6) == 0) {
            i3 = i;
            if (kd2Var.d(i3)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i4 = i2 | i6;
        } else {
            i3 = i;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if (kd2Var.e(j)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i4 |= i5;
        }
        boolean z3 = true;
        if ((i4 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i4 & 1, z)) {
            Context context = (Context) kd2Var.j(eb.b);
            boolean f = kd2Var.f(context);
            if ((i4 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z4 = z2 | f;
            Object Q = kd2Var.Q();
            Object obj = au0.a;
            if (z4 || Q == obj) {
                Q = Integer.valueOf(context.obtainStyledAttributes(new int[]{i3}).getResourceId(0, -1));
                kd2Var.n0(Q);
            }
            int intValue = ((Number) Q).intValue();
            if (intValue == -1) {
                u = kd2Var.u();
                if (u != null) {
                    final byte b = 1;
                    ic2Var = new ic2() { // from class: ua1
                        @Override // defpackage.ic2
                        public final Object invoke(Object obj2, Object obj3) {
                            byte b2 = b;
                            pn6 pn6Var = pn6.a;
                            int i7 = i2;
                            long j2 = j;
                            int i8 = i3;
                            kd2 kd2Var2 = (kd2) obj2;
                            ((Integer) obj3).getClass();
                            switch (b2) {
                                case 0:
                                    xa1.b(i8, j2, kd2Var2, kb0.N(i7 | 1));
                                    return pn6Var;
                                default:
                                    xa1.b(i8, j2, kd2Var2, kb0.N(i7 | 1));
                                    return pn6Var;
                            }
                        }
                    };
                    u.d = ic2Var;
                }
                return;
            }
            xh4 H = w65.H(intValue, kd2Var, 0);
            if ((i4 & 112) != 32) {
                z3 = false;
            }
            Object Q2 = kd2Var.Q();
            if (z3 || Q2 == obj) {
                if (j == 16) {
                    Q2 = null;
                } else {
                    Q2 = new w60(j, 5);
                }
                kd2Var.n0(Q2);
            }
            b90.a(x97.H(ar5.i(vz3.x, sz0.e), H, pk2.P, 0.0f, (w60) Q2, 22), kd2Var, 0);
        } else {
            kd2Var.Y();
        }
        u = kd2Var.u();
        if (u != null) {
            final byte b2 = 0;
            ic2Var = new ic2() { // from class: ua1
                @Override // defpackage.ic2
                public final Object invoke(Object obj2, Object obj3) {
                    byte b22 = b2;
                    pn6 pn6Var = pn6.a;
                    int i7 = i2;
                    long j2 = j;
                    int i8 = i;
                    kd2 kd2Var2 = (kd2) obj2;
                    ((Integer) obj3).getClass();
                    switch (b22) {
                        case 0:
                            xa1.b(i8, j2, kd2Var2, kb0.N(i7 | 1));
                            return pn6Var;
                        default:
                            xa1.b(i8, j2, kd2Var2, kb0.N(i7 | 1));
                            return pn6Var;
                    }
                }
            };
            u.d = ic2Var;
        }
    }

    public static final void c(b96 b96Var, q86 q86Var, sb2 sb2Var, kd2 kd2Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        boolean h;
        int i4;
        boolean h2;
        int i5;
        kd2Var.f0(-2040393164);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h2 = kd2Var.f(b96Var);
            } else {
                h2 = kd2Var.h(b96Var);
            }
            if (h2) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0) {
                h = kd2Var.f(q86Var);
            } else {
                h = kd2Var.h(q86Var);
            }
            if (h) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (kd2Var.h(sb2Var)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        boolean z3 = false;
        if ((i2 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i2 & 1, z)) {
            if ((i2 & 112) != 32 && ((i2 & 64) == 0 || !kd2Var.f(q86Var))) {
                z2 = false;
            } else {
                z2 = true;
            }
            Object Q = kd2Var.Q();
            q18 q18Var = au0.a;
            if (z2 || Q == q18Var) {
                Q = new rm3(new i75(new va1(q86Var, sb2Var, (byte) 0), (byte) 12));
                kd2Var.n0(Q);
            }
            rm3 rm3Var = (rm3) Q;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && kd2Var.h(b96Var))) {
                z3 = true;
            }
            Object Q2 = kd2Var.Q();
            if (z3 || Q2 == q18Var) {
                Q2 = new vt0(b96Var, (byte) 6);
                kd2Var.n0(Q2);
            }
            ae.a(rm3Var, (sb2) Q2, a, nx7.R(1315155414, new q(q86Var, b96Var, (byte) 15), kd2Var), kd2Var, 3456, 0);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new je((byte) 6, i, (Object) b96Var, (Object) q86Var, (Object) sb2Var);
        }
    }

    public static final void d(yz3 yz3Var, os0 os0Var, kd2 kd2Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        kd2Var.f0(1392105195);
        byte b = 2;
        if ((i & 6) == 0) {
            if (kd2Var.f(yz3Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (kd2Var.h(os0Var)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i2 & 1, z)) {
            q23.d(yz3Var, z86.a, os0Var, kd2Var, ((i2 << 6) & 7168) | (i2 & 14) | 432);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new bf(yz3Var, os0Var, i, b);
        }
    }
}
