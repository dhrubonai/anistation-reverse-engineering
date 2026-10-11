package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class k36 implements ic2 {
    public final /* synthetic */ float A;
    public final /* synthetic */ s70 B;
    public final /* synthetic */ float C;
    public final /* synthetic */ ic2 D;
    public final /* synthetic */ yz3 x;
    public final /* synthetic */ om5 y;
    public final /* synthetic */ long z;

    public k36(yz3 yz3Var, om5 om5Var, long j, float f, s70 s70Var, float f2, ic2 ic2Var) {
        this.x = yz3Var;
        this.y = om5Var;
        this.z = j;
        this.A = f;
        this.B = s70Var;
        this.C = f2;
        this.D = ic2Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        yz3 yz3Var;
        kd2 kd2Var = (kd2) obj;
        int intValue = ((Number) obj2).intValue();
        if ((intValue & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        boolean V = kd2Var.V(intValue & 1, z);
        pn6 pn6Var = pn6.a;
        if (V) {
            long b = l36.b(this.z, this.A, kd2Var);
            float g0 = ((ud1) kd2Var.j(bv0.h)).g0(this.C);
            om5 om5Var = this.y;
            yz3 yz3Var2 = vz3.x;
            if (g0 > 0.0f) {
                yz3Var = io3.Q(yz3Var2, 0.0f, 0.0f, 0.0f, g0, om5Var, 124895);
            } else {
                yz3Var = yz3Var2;
            }
            yz3 w = this.x.w(yz3Var);
            s70 s70Var = this.B;
            if (s70Var != null) {
                yz3Var2 = new r70(s70Var.a, s70Var.b, om5Var);
            }
            yz3 k = n03.k(bx7.h(w.w(yz3Var2), b, om5Var), om5Var);
            Object Q = kd2Var.Q();
            q18 q18Var = au0.a;
            if (Q == q18Var) {
                Q = new tg5((byte) 19);
                kd2Var.n0(Q);
            }
            yz3 a = rh5.a(k, false, (ub2) Q);
            Object Q2 = kd2Var.Q();
            if (Q2 == q18Var) {
                Q2 = j36.b;
                kd2Var.n0(Q2);
            }
            yz3 a2 = v36.a(a, pn6Var, (PointerInputEventHandler) Q2);
            vo3 c = b90.c(pk2.y, true);
            int s = h98.s(kd2Var);
            al4 l = kd2Var.l();
            yz3 E = o80.E(kd2Var, a2);
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
            this.D.invoke(kd2Var, 0);
            kd2Var.q(true);
            return pn6Var;
        }
        kd2Var.Y();
        return pn6Var;
    }
}
