package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ie1 implements ic2 {
    public final /* synthetic */ long A;
    public final /* synthetic */ byte x;
    public final /* synthetic */ String y;
    public final /* synthetic */ String z;

    public /* synthetic */ ie1(String str, String str2, long j, byte b) {
        this.x = b;
        this.y = str;
        this.z = str2;
        this.A = j;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        t53 t53Var = za3.p0;
        vz3 vz3Var = vz3.x;
        boolean z = false;
        switch (b) {
            case 0:
                kd2 kd2Var = (kd2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                }
                if (kd2Var.V(intValue & 1, z)) {
                    xp0 a = vp0.a(new vr(5.0f, true, new ze0((byte) 6)), pk2.L, kd2Var, 54);
                    int hashCode = Long.hashCode(kd2Var.T);
                    al4 l = kd2Var.l();
                    yz3 E = o80.E(kd2Var, vz3Var);
                    tt0.d.getClass();
                    kd2Var.h0();
                    if (kd2Var.S) {
                        kd2Var.k(t53Var);
                    } else {
                        kd2Var.q0();
                    }
                    ss5.i(p7.F, kd2Var, a);
                    ss5.i(p7.E, kd2Var, l);
                    ss5.i(p7.G, kd2Var, Integer.valueOf(hashCode));
                    ss5.h(kd2Var);
                    ss5.i(p7.D, kd2Var, E);
                    tq1 tq1Var = pl6.a;
                    yc6.b(this.y, null, 0L, 0L, s92.C, null, 0L, null, 0L, 2, false, 1, 0, ((nl6) kd2Var.j(tq1Var)).j, kd2Var, 1572864, 28032, 102334);
                    yc6.b(this.z, null, this.A, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nl6) kd2Var.j(tq1Var)).o, kd2Var, 0, 0, 131066);
                    kd2Var.q(true);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            default:
                kd2 kd2Var2 = (kd2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                }
                if (kd2Var2.V(intValue2 & 1, z)) {
                    yz3 c = ar5.c(n77.S(vz3Var, 2.0f, 6.0f), 1.0f);
                    xp0 a2 = vp0.a(new vr(4.0f, true, new ze0((byte) 6)), pk2.L, kd2Var2, 54);
                    int hashCode2 = Long.hashCode(kd2Var2.T);
                    al4 l2 = kd2Var2.l();
                    yz3 E2 = o80.E(kd2Var2, c);
                    tt0.d.getClass();
                    kd2Var2.h0();
                    if (kd2Var2.S) {
                        kd2Var2.k(t53Var);
                    } else {
                        kd2Var2.q0();
                    }
                    ss5.i(p7.F, kd2Var2, a2);
                    ss5.i(p7.E, kd2Var2, l2);
                    ss5.i(p7.G, kd2Var2, Integer.valueOf(hashCode2));
                    ss5.h(kd2Var2);
                    ss5.i(p7.D, kd2Var2, E2);
                    tq1 tq1Var2 = pl6.a;
                    yc6.b(this.y, null, 0L, 0L, s92.C, null, 0L, new c86(3), 0L, 2, false, 2, 0, ((nl6) kd2Var2.j(tq1Var2)).j, kd2Var2, 1572864, 28032, 101310);
                    yc6.b(this.z, null, this.A, 0L, null, null, 0L, new c86(3), 0L, 2, false, 1, 0, ((nl6) kd2Var2.j(tq1Var2)).o, kd2Var2, 0, 24960, 109562);
                    kd2Var2.q(true);
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
        }
    }
}
