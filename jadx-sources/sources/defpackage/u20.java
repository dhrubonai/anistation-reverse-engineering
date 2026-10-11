package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class u20 implements ic2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ th4 y;
    public final /* synthetic */ os0 z;

    public /* synthetic */ u20(th4 th4Var, os0 os0Var, byte b) {
        this.x = b;
        this.y = th4Var;
        this.z = os0Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        t53 t53Var = za3.p0;
        vz3 vz3Var = vz3.x;
        os0 os0Var = this.z;
        th4 th4Var = this.y;
        kd2 kd2Var = (kd2) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var.V(intValue & 1, z)) {
                    yz3 Q = n77.Q(vz3Var, th4Var);
                    vo3 c = b90.c(pk2.C, false);
                    int hashCode = Long.hashCode(kd2Var.T);
                    al4 l = kd2Var.l();
                    yz3 E = o80.E(kd2Var, Q);
                    tt0.d.getClass();
                    kd2Var.h0();
                    if (kd2Var.S) {
                        kd2Var.k(t53Var);
                    } else {
                        kd2Var.q0();
                    }
                    ss5.i(p7.F, kd2Var, c);
                    ss5.i(p7.E, kd2Var, l);
                    ss5.i(p7.G, kd2Var, Integer.valueOf(hashCode));
                    ss5.h(kd2Var);
                    ss5.i(p7.D, kd2Var, E);
                    os0Var.invoke(kd2Var, 0);
                    kd2Var.q(true);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            default:
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (kd2Var.V(intValue & 1, z2)) {
                    yz3 Q2 = n77.Q(vz3Var, th4Var);
                    vo3 c2 = b90.c(pk2.C, false);
                    int hashCode2 = Long.hashCode(kd2Var.T);
                    al4 l2 = kd2Var.l();
                    yz3 E2 = o80.E(kd2Var, Q2);
                    tt0.d.getClass();
                    kd2Var.h0();
                    if (kd2Var.S) {
                        kd2Var.k(t53Var);
                    } else {
                        kd2Var.q0();
                    }
                    ss5.i(p7.F, kd2Var, c2);
                    ss5.i(p7.E, kd2Var, l2);
                    ss5.i(p7.G, kd2Var, Integer.valueOf(hashCode2));
                    ss5.h(kd2Var);
                    ss5.i(p7.D, kd2Var, E2);
                    os0Var.invoke(kd2Var, 0);
                    kd2Var.q(true);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
        }
    }
}
