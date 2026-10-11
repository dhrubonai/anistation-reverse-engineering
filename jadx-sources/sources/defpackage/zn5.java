package defpackage;

import com.anistation.android.R;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class zn5 {
    public static final sk6 a = z51.V(300, 2, br1.a);

    public static final void a(os0 os0Var, kd2 kd2Var, int i) {
        boolean z;
        kd2Var.f0(1033612924);
        byte b = 1;
        if ((i & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i & 1, z)) {
            String m = lt5.m(R.string.m3c_bottom_sheet_drag_handle_description, kd2Var);
            tn2 tn2Var = new tn2(pk2.L);
            vo3 c = b90.c(pk2.y, false);
            int s = h98.s(kd2Var);
            al4 l = kd2Var.l();
            yz3 E = o80.E(kd2Var, tn2Var);
            tt0.d.getClass();
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(za3.p0);
            } else {
                kd2Var.q0();
            }
            ss5.i(p7.F, kd2Var, c);
            ss5.i(p7.E, kd2Var, l);
            st0 st0Var = p7.G;
            if (kd2Var.S || !a34.i(kd2Var.Q(), Integer.valueOf(s))) {
                h11.p(s, kd2Var, s, st0Var);
            }
            ss5.i(p7.D, kd2Var, E);
            float f = gg6.a;
            vh4 vh4Var = jg6.a;
            int x0 = ((ud1) kd2Var.j(bv0.h)).x0(4.0f);
            boolean d = kd2Var.d(x0);
            Object Q = kd2Var.Q();
            Object obj = au0.a;
            if (d || Q == obj) {
                Q = new kg6(x0);
                kd2Var.n0(Q);
            }
            kg6 kg6Var = (kg6) Q;
            os0 R = nx7.R(2059851063, new wa1(m, b), kd2Var);
            i54 i54Var = b50.a;
            boolean g = kd2Var.g(false) | kd2Var.f(i54Var);
            Object Q2 = kd2Var.Q();
            if (g || Q2 == obj) {
                Q2 = new ng6(i54Var);
                kd2Var.n0(Q2);
            }
            jg6.b(kg6Var, R, (ng6) Q2, null, false, os0Var, kd2Var, 100663344);
            kd2Var.q(true);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new k(os0Var, i, (byte) 5);
        }
    }

    public static final do5 b(boolean z, final ub2 ub2Var, final eo5 eo5Var, kd2 kd2Var, int i, int i2) {
        final boolean z2;
        final boolean z3;
        boolean z4;
        boolean z5;
        char c;
        int i3;
        int i4;
        byte b = 0;
        if ((i2 & 1) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        int i5 = i2 & 8;
        byte b2 = 1;
        if (i5 != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        float f = x70.d;
        float f2 = x70.e;
        Object obj = (ud1) kd2Var.j(bv0.h);
        boolean f3 = kd2Var.f(obj);
        if ((((57344 & i) ^ 24576) > 16384 && kd2Var.c(f)) || (i & 24576) == 16384) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z6 = f3 | z4;
        Object Q = kd2Var.Q();
        Object obj2 = au0.a;
        Object obj3 = Q;
        if (z6 || Q == obj2) {
            Object wn5Var = new wn5(obj, f, b);
            kd2Var.n0(wn5Var);
            obj3 = wn5Var;
        }
        final sb2 sb2Var = (sb2) obj3;
        boolean f4 = kd2Var.f(obj);
        if ((((458752 & i) ^ 196608) > 131072 && kd2Var.c(f2)) || (i & 196608) == 131072) {
            z5 = true;
        } else {
            z5 = false;
        }
        boolean z7 = f4 | z5;
        Object Q2 = kd2Var.Q();
        Object obj4 = Q2;
        if (z7 || Q2 == obj2) {
            Object wn5Var2 = new wn5(obj, f2, b2);
            kd2Var.n0(wn5Var2);
            obj4 = wn5Var2;
        }
        final sb2 sb2Var2 = (sb2) obj4;
        Object[] objArr = {Boolean.valueOf(z2), ub2Var, Boolean.valueOf(z3)};
        y23 y23Var = new y23(new ao5(b), new ub2() { // from class: bo5
            @Override // defpackage.ub2
            public final Object invoke(Object obj5) {
                return new do5(z2, sb2Var, sb2Var2, (eo5) obj5, ub2Var, z3);
            }
        }, (byte) 14);
        if ((((i & 14) ^ 6) > 4 && kd2Var.g(z2)) || (i & 6) == 4) {
            c = 1;
        } else {
            c = 0;
        }
        int i6 = c | (kd2Var.f(sb2Var) ? 1 : 0) | (kd2Var.f(sb2Var2) ? 1 : 0);
        if ((((i & 896) ^ 384) > 256 && kd2Var.d(eo5Var.ordinal())) || (i & 384) == 256) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i7 = i6 | i3;
        if ((((i & 112) ^ 48) > 32 && kd2Var.f(ub2Var)) || (i & 48) == 32) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        int i8 = i7 | i4;
        if ((((i & 7168) ^ 3072) <= 2048 || !kd2Var.g(z3)) && (i & 3072) != 2048) {
            b2 = 0;
        }
        int i9 = i8 | b2;
        Object Q3 = kd2Var.Q();
        if (i9 != 0 || Q3 == obj2) {
            final boolean z8 = z3;
            Object obj5 = new sb2() { // from class: xn5
                @Override // defpackage.sb2
                public final Object invoke() {
                    return new do5(z2, sb2Var, sb2Var2, eo5Var, ub2Var, z8);
                }
            };
            kd2Var.n0(obj5);
            Q3 = obj5;
        }
        return (do5) oi4.D(objArr, y23Var, (sb2) Q3, kd2Var, 0);
    }
}
