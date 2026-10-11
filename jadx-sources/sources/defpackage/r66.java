package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class r66 implements ic2 {
    public final /* synthetic */ float A;
    public final /* synthetic */ float B;
    public final /* synthetic */ int C;
    public final /* synthetic */ os0 D;
    public final /* synthetic */ yc5 x;
    public final /* synthetic */ os0 y;
    public final /* synthetic */ os0 z;

    public r66(yc5 yc5Var, os0 os0Var, os0 os0Var2, float f, float f2, int i, os0 os0Var3) {
        this.x = yc5Var;
        this.y = os0Var;
        this.z = os0Var2;
        this.A = f;
        this.B = f2;
        this.C = i;
        this.D = os0Var3;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        st0 st0Var;
        Object p66Var;
        kd2 kd2Var = (kd2) obj;
        int intValue = ((Number) obj2).intValue();
        byte b = 0;
        if ((intValue & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(intValue & 1, z)) {
            Object Q = kd2Var.Q();
            q18 q18Var = au0.a;
            if (Q == q18Var) {
                Q = db.L(kd2Var);
                kd2Var.n0(Q);
            }
            v11 v11Var = (v11) Q;
            z04 z04Var = z04.x;
            tw5 N = sw0.N(z04Var, kd2Var);
            tw5 N2 = sw0.N(z04Var, kd2Var);
            yc5 yc5Var = this.x;
            boolean f = kd2Var.f(yc5Var) | kd2Var.f(v11Var);
            Object Q2 = kd2Var.Q();
            if (f || Q2 == q18Var) {
                Q2 = new ld5(yc5Var, v11Var, N);
                kd2Var.n0(Q2);
            }
            ld5 ld5Var = (ld5) Q2;
            Object Q3 = kd2Var.Q();
            if (Q3 == q18Var) {
                Q3 = new q66(N2);
                kd2Var.n0(Q3);
            }
            q66 q66Var = (q66) Q3;
            vo3 c = b90.c(pk2.E, false);
            int s = h98.s(kd2Var);
            al4 l = kd2Var.l();
            vz3 vz3Var = vz3.x;
            yz3 E = o80.E(kd2Var, vz3Var);
            tt0.d.getClass();
            kd2Var.h0();
            boolean z2 = kd2Var.S;
            t53 t53Var = za3.p0;
            if (z2) {
                kd2Var.k(t53Var);
            } else {
                kd2Var.q0();
            }
            st0 st0Var2 = p7.F;
            ss5.i(st0Var2, kd2Var, c);
            ys0 ys0Var = p7.E;
            ss5.i(ys0Var, kd2Var, l);
            st0 st0Var3 = p7.G;
            if (kd2Var.S || !a34.i(kd2Var.Q(), Integer.valueOf(s))) {
                h11.p(s, kd2Var, s, st0Var3);
            }
            ys0 ys0Var2 = p7.D;
            ss5.i(ys0Var2, kd2Var, E);
            this.y.invoke(kd2Var, 0);
            List I = te4.I(this.z, nx7.R(509386037, new d50(this.D, (Object) q66Var, (byte) 4), kd2Var));
            yz3 l2 = n03.l(rh5.a(n77.K(ar5.p(ar5.c(vz3Var, 1.0f), 2), yc5Var, 14), false, new tg5(b)));
            float f2 = this.A;
            boolean c2 = kd2Var.c(f2);
            float f3 = this.B;
            boolean c3 = c2 | kd2Var.c(f3);
            int i = this.C;
            boolean d = c3 | kd2Var.d(i) | kd2Var.h(ld5Var);
            Object Q4 = kd2Var.Q();
            if (d || Q4 == q18Var) {
                st0Var = st0Var2;
                p66Var = new p66(f2, f3, q66Var, i, ld5Var);
                kd2Var.n0(p66Var);
            } else {
                p66Var = Q4;
                st0Var = st0Var2;
            }
            f24 f24Var = (f24) p66Var;
            os0 os0Var = new os0(1271844412, true, new oa3(I, (byte) 0));
            boolean f4 = kd2Var.f(f24Var);
            Object Q5 = kd2Var.Q();
            if (f4 || Q5 == q18Var) {
                Q5 = new g24(f24Var);
                kd2Var.n0(Q5);
            }
            vo3 vo3Var = (vo3) Q5;
            int s2 = h98.s(kd2Var);
            al4 l3 = kd2Var.l();
            yz3 E2 = o80.E(kd2Var, l2);
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(t53Var);
            } else {
                kd2Var.q0();
            }
            ss5.i(st0Var, kd2Var, vo3Var);
            ss5.i(ys0Var, kd2Var, l3);
            if (kd2Var.S || !a34.i(kd2Var.Q(), Integer.valueOf(s2))) {
                h11.p(s2, kd2Var, s2, st0Var3);
            }
            ss5.i(ys0Var2, kd2Var, E2);
            os0Var.invoke(kd2Var, 0);
            kd2Var.q(true);
            kd2Var.q(true);
        } else {
            kd2Var.Y();
        }
        return pn6.a;
    }
}
