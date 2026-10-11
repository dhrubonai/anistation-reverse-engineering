package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class mb implements ic2 {
    public final /* synthetic */ byte x = 0;
    public final /* synthetic */ long y;
    public final /* synthetic */ Object z;

    public /* synthetic */ mb(long j, yz3 yz3Var) {
        this.y = j;
        this.z = yz3Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        long j = this.y;
        Object obj3 = this.z;
        switch (b) {
            case 0:
                yz3 yz3Var = (yz3) obj3;
                kd2 kd2Var = (kd2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var.V(intValue & 1, z)) {
                    if (j != 9205357640488583168L) {
                        kd2Var.e0(-1244013944);
                        yz3 h = ar5.h(yz3Var, ym1.b(j), ym1.a(j), 0.0f, 0.0f, 12);
                        vo3 c = b90.c(pk2.z, false);
                        int hashCode = Long.hashCode(kd2Var.T);
                        al4 l = kd2Var.l();
                        yz3 E = o80.E(kd2Var, h);
                        tt0.d.getClass();
                        kd2Var.h0();
                        if (kd2Var.S) {
                            kd2Var.k(za3.p0);
                        } else {
                            kd2Var.q0();
                        }
                        ss5.i(p7.F, kd2Var, c);
                        ss5.i(p7.E, kd2Var, l);
                        ss5.i(p7.G, kd2Var, Integer.valueOf(hashCode));
                        ss5.h(kd2Var);
                        ss5.i(p7.D, kd2Var, E);
                        rb.b(null, kd2Var, 0, 1);
                        kd2Var.q(true);
                        kd2Var.q(false);
                    } else {
                        kd2Var.e0(-1243644858);
                        rb.b(yz3Var, kd2Var, 0, 0);
                        kd2Var.q(false);
                    }
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            default:
                ((Integer) obj2).getClass();
                nx7.b((bx4) obj3, j, (kd2) obj, kb0.N(1));
                return pn6Var;
        }
    }

    public /* synthetic */ mb(bx4 bx4Var, long j, int i) {
        this.z = bx4Var;
        this.y = j;
    }
}
