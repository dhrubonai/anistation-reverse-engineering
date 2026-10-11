package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements ic2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ int y;

    public /* synthetic */ r(int i, int i2) {
        this.x = (byte) 3;
        this.y = i;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        byte b = this.x;
        t53 t53Var = za3.p0;
        vz3 vz3Var = vz3.x;
        pn6 pn6Var = pn6.a;
        int i = this.y;
        switch (b) {
            case 0:
                kd2 kd2Var = (kd2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var.V(intValue & 1, z)) {
                    vo3 c = b90.c(pk2.C, false);
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
                    ss5.i(p7.F, kd2Var, c);
                    ss5.i(p7.E, kd2Var, l);
                    ss5.i(p7.G, kd2Var, Integer.valueOf(hashCode));
                    ss5.h(kd2Var);
                    ss5.i(p7.D, kd2Var, E);
                    yt2.a(w65.H(i, kd2Var, 0), null, ar5.i(vz3Var, 20.0f), 0L, kd2Var, 440, 8);
                    kd2Var.q(true);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            case 1:
                kd2 kd2Var2 = (kd2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (kd2Var2.V(intValue2 & 1, z2)) {
                    vo3 c2 = b90.c(pk2.C, false);
                    int hashCode2 = Long.hashCode(kd2Var2.T);
                    al4 l2 = kd2Var2.l();
                    yz3 E2 = o80.E(kd2Var2, vz3Var);
                    tt0.d.getClass();
                    kd2Var2.h0();
                    if (kd2Var2.S) {
                        kd2Var2.k(t53Var);
                    } else {
                        kd2Var2.q0();
                    }
                    ss5.i(p7.F, kd2Var2, c2);
                    ss5.i(p7.E, kd2Var2, l2);
                    ss5.i(p7.G, kd2Var2, Integer.valueOf(hashCode2));
                    ss5.h(kd2Var2);
                    ss5.i(p7.D, kd2Var2, E2);
                    yt2.a(w65.H(i, kd2Var2, 0), null, ar5.i(vz3Var, 18.0f), ((mp0) kd2Var2.j(op0.a)).o, kd2Var2, 440, 0);
                    kd2Var2.q(true);
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
            case 2:
                kd2 kd2Var3 = (kd2) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kd2Var3.V(intValue3 & 1, z3)) {
                    yt2.a(w65.H(i, kd2Var3, 0), null, ar5.i(vz3Var, 20.0f), 0L, kd2Var3, 440, 8);
                } else {
                    kd2Var3.Y();
                }
                return pn6Var;
            case 3:
                ((Integer) obj2).getClass();
                sl1.d(i, (kd2) obj, kb0.N(1));
                return pn6Var;
            default:
                ((Integer) obj2).getClass();
                ss5.a(kb0.N(i | 1), (kd2) obj);
                return pn6Var;
        }
    }

    public /* synthetic */ r(int i, byte b) {
        this.x = b;
        this.y = i;
    }
}
