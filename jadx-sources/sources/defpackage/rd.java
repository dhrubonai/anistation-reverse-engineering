package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class rd implements ic2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ vr4 y;
    public final /* synthetic */ w44 z;

    public /* synthetic */ rd(vr4 vr4Var, w44 w44Var, byte b) {
        this.x = b;
        this.y = vr4Var;
        this.z = w44Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        float f;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        boolean z2 = false;
        w44 w44Var = this.z;
        vr4 vr4Var = this.y;
        byte b2 = 1;
        kd2 kd2Var = (kd2) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                if ((intValue & 3) != 2) {
                    z2 = true;
                }
                if (kd2Var.V(intValue & 1, z2)) {
                    kb0.b(ae.b.a(Boolean.TRUE), nx7.R(1022273628, new rd(vr4Var, w44Var, b2), kd2Var), kd2Var, 56);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            default:
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var.V(intValue & 1, z)) {
                    Object Q = kd2Var.Q();
                    q18 q18Var = au0.a;
                    if (Q == q18Var) {
                        Q = new b3((byte) 15);
                        kd2Var.n0(Q);
                    }
                    yz3 a = rh5.a(vz3.x, false, (ub2) Q);
                    boolean h = kd2Var.h(vr4Var);
                    Object Q2 = kd2Var.Q();
                    if (h || Q2 == q18Var) {
                        Q2 = new td(vr4Var, (byte) 1);
                        kd2Var.n0(Q2);
                    }
                    yz3 D = m37.D(a, (ub2) Q2);
                    if (vr4Var.getCanCalculatePosition()) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    yz3 d = sw0.d(D, f);
                    ic2 ic2Var = (ic2) w44Var.getValue();
                    Object Q3 = kd2Var.Q();
                    if (Q3 == q18Var) {
                        Q3 = yb.c;
                        kd2Var.n0(Q3);
                    }
                    vo3 vo3Var = (vo3) Q3;
                    int hashCode = Long.hashCode(kd2Var.T);
                    al4 l = kd2Var.l();
                    yz3 E = o80.E(kd2Var, d);
                    tt0.d.getClass();
                    kd2Var.h0();
                    if (kd2Var.S) {
                        kd2Var.k(za3.p0);
                    } else {
                        kd2Var.q0();
                    }
                    ss5.i(p7.F, kd2Var, vo3Var);
                    ss5.i(p7.E, kd2Var, l);
                    ss5.i(p7.G, kd2Var, Integer.valueOf(hashCode));
                    ss5.h(kd2Var);
                    ss5.i(p7.D, kd2Var, E);
                    ic2Var.invoke(kd2Var, 0);
                    kd2Var.q(true);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
        }
    }
}
