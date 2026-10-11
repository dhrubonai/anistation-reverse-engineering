package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nx3 implements ic2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ byte x = 1;
    public final /* synthetic */ os0 y;
    public final /* synthetic */ Object z;

    public nx3(yz3 yz3Var, yc5 yc5Var, os0 os0Var) {
        this.z = yz3Var;
        this.A = yc5Var;
        this.y = os0Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        t53 t53Var = za3.p0;
        Object obj3 = this.A;
        os0 os0Var = this.y;
        Object obj4 = this.z;
        switch (b) {
            case 0:
                kd2 kd2Var = (kd2) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var.V(intValue & 1, z)) {
                    yz3 k0 = n77.k0(wk6.L(n77.T((yz3) obj4, 0.0f, 8.0f, 1)), (yc5) obj3, 14);
                    xp0 a = vp0.a(x97.z, pk2.K, kd2Var, 0);
                    int s = h98.s(kd2Var);
                    al4 l = kd2Var.l();
                    yz3 E = o80.E(kd2Var, k0);
                    tt0.d.getClass();
                    kd2Var.h0();
                    if (kd2Var.S) {
                        kd2Var.k(t53Var);
                    } else {
                        kd2Var.q0();
                    }
                    ss5.i(p7.F, kd2Var, a);
                    ss5.i(p7.E, kd2Var, l);
                    st0 st0Var = p7.G;
                    if (kd2Var.S || !a34.i(kd2Var.Q(), Integer.valueOf(s))) {
                        h11.p(s, kd2Var, s, st0Var);
                    }
                    ss5.i(p7.D, kd2Var, E);
                    os0Var.invoke(yp0.a, kd2Var, 6);
                    kd2Var.q(true);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            default:
                kd2 kd2Var2 = (kd2) obj;
                int intValue2 = ((Number) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (kd2Var2.V(intValue2 & 1, z2)) {
                    zt0 zt0Var = new zt0(new wa1((xi6) obj4, (byte) 3));
                    lg6 lg6Var = (lg6) obj3;
                    vo3 c = b90.c(pk2.y, false);
                    int s2 = h98.s(kd2Var2);
                    al4 l2 = kd2Var2.l();
                    yz3 E2 = o80.E(kd2Var2, zt0Var);
                    tt0.d.getClass();
                    kd2Var2.h0();
                    if (kd2Var2.S) {
                        kd2Var2.k(t53Var);
                    } else {
                        kd2Var2.q0();
                    }
                    ss5.i(p7.F, kd2Var2, c);
                    ss5.i(p7.E, kd2Var2, l2);
                    st0 st0Var2 = p7.G;
                    if (kd2Var2.S || !a34.i(kd2Var2.Q(), Integer.valueOf(s2))) {
                        h11.p(s2, kd2Var2, s2, st0Var2);
                    }
                    ss5.i(p7.D, kd2Var2, E2);
                    os0Var.invoke(lg6Var, kd2Var2, 6);
                    kd2Var2.q(true);
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
        }
    }

    public nx3(xi6 xi6Var, os0 os0Var, lg6 lg6Var) {
        this.z = xi6Var;
        this.y = os0Var;
        this.A = lg6Var;
    }
}
