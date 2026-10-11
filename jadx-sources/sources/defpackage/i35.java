package defpackage;

import com.anistation.android.R;
import com.anistation.navigation.Route;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class i35 {
    public static final void a(boolean z, ic2 ic2Var, sb2 sb2Var, kd2 kd2Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        w44 w44Var;
        w44 w44Var2;
        boolean z3;
        boolean z4 = z;
        kd2 kd2Var2 = kd2Var;
        ic2Var.getClass();
        kd2Var2.f0(-1176003556);
        if (kd2Var2.g(z4)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (kd2Var2.h(ic2Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (kd2Var2.h(sb2Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i7 = i6 | i4;
        if ((i7 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var2.V(i7 & 1, z2)) {
            yc5 d0 = n77.d0(kd2Var2);
            z22 z22Var = ar5.c;
            yz3 k0 = n77.k0(bx7.h(z22Var, ((mp0) kd2Var2.j(op0.a)).n, io3.h), d0, 14);
            vr vrVar = new vr(5.0f, true, new ze0((byte) 6));
            w50 w50Var = pk2.L;
            xp0 a = vp0.a(vrVar, w50Var, kd2Var2, 54);
            int hashCode = Long.hashCode(kd2Var2.T);
            al4 l = kd2Var2.l();
            yz3 E = o80.E(kd2Var2, k0);
            tt0.d.getClass();
            kd2Var2.h0();
            boolean z5 = kd2Var2.S;
            t53 t53Var = za3.p0;
            if (z5) {
                kd2Var2.k(t53Var);
            } else {
                kd2Var2.q0();
            }
            st0 st0Var = p7.F;
            ss5.i(st0Var, kd2Var2, a);
            ys0 ys0Var = p7.E;
            ss5.i(ys0Var, kd2Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            st0 st0Var2 = p7.G;
            ss5.i(st0Var2, kd2Var2, valueOf);
            ss5.h(kd2Var2);
            ys0 ys0Var2 = p7.D;
            ss5.i(ys0Var2, kd2Var2, E);
            Route.Settings settings = Route.Settings.INSTANCE;
            String f = lz5.f(R.string.report_a_bug, kd2Var2);
            Object Q = kd2Var2.Q();
            q18 q18Var = au0.a;
            if (Q == q18Var) {
                Q = new qa4((byte) 26);
                kd2Var2.n0(Q);
            }
            aj.a(settings, null, null, f, true, false, (sb2) Q, null, sb2Var, kd2Var, ((i7 << 18) & 234881024) | 1794054, 134);
            Object Q2 = kd2Var.Q();
            if (Q2 == q18Var) {
                Q2 = xt5.g("");
                kd2Var.n0(Q2);
            }
            w44 w44Var3 = (w44) Q2;
            Object Q3 = kd2Var.Q();
            if (Q3 == q18Var) {
                Q3 = xt5.g("");
                kd2Var.n0(Q3);
            }
            w44 w44Var4 = (w44) Q3;
            String f2 = lz5.f(R.string.please_enter_a_title, kd2Var);
            String f3 = lz5.f(R.string.please_enter_a_description, kd2Var);
            yz3 V = n77.V(z22Var, 15.0f, 0.0f, 15.0f, 15.0f, 2);
            xp0 a2 = vp0.a(new vr(20.0f, true, new ze0((byte) 6)), w50Var, kd2Var, 54);
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
            String str = (String) w44Var3.getValue();
            Object Q4 = kd2Var.Q();
            if (Q4 == q18Var) {
                w44Var = w44Var3;
                Q4 = new ef(w44Var, (byte) 15);
                kd2Var.n0(Q4);
            } else {
                w44Var = w44Var3;
            }
            o80.a(str, (ub2) Q4, null, lz5.f(R.string.title, kd2Var), lz5.f(R.string.enter_a_short_issue_title, kd2Var), null, 6, null, null, null, null, false, kd2Var, 1572912, 0, 4004);
            String str2 = (String) w44Var4.getValue();
            Object Q5 = kd2Var.Q();
            if (Q5 == q18Var) {
                w44Var2 = w44Var4;
                Q5 = new ef(w44Var2, (byte) 16);
                kd2Var.n0(Q5);
            } else {
                w44Var2 = w44Var4;
            }
            o80.a(str2, (ub2) Q5, null, lz5.f(R.string.description, kd2Var), lz5.f(R.string.describe_the_issue_you_re_facing, kd2Var), ((cn5) kd2Var.j(dn5.a)).c, 0, null, null, null, null, true, kd2Var, 48, 48, 1988);
            kd2Var2 = kd2Var;
            String f4 = lz5.f(R.string.report, kd2Var2);
            boolean z6 = !z;
            yz3 V2 = n77.V(ar5.c(vz3.x, 1.0f), 0.0f, 10.0f, 0.0f, 0.0f, 13);
            boolean f5 = kd2Var2.f(f2) | kd2Var2.f(f3);
            if ((i7 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z7 = f5 | z3;
            Object Q6 = kd2Var2.Q();
            if (z7 || Q6 == q18Var) {
                sd sdVar = new sd(f2, f3, ic2Var, w44Var, w44Var2);
                kd2Var2.n0(sdVar);
                Q6 = sdVar;
            }
            z4 = z;
            nx7.a(f4, V2, null, null, z6, z4, 0.0f, 0L, 0L, null, null, (sb2) Q6, kd2Var2, ((i7 << 15) & 458752) | 48, 0, 4044);
            kd2Var2.q(true);
            kd2Var2.q(true);
        } else {
            kd2Var2.Y();
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            u.d = new wg(z4, ic2Var, sb2Var, i);
        }
    }
}
