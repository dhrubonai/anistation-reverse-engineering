package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class d50 implements ic2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ d50(os0 os0Var, Object obj, byte b) {
        this.x = b;
        this.z = os0Var;
        this.y = obj;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        byte b = this.x;
        q18 q18Var = au0.a;
        t53 t53Var = za3.p0;
        vz3 vz3Var = vz3.x;
        pn6 pn6Var = pn6.a;
        Object obj3 = this.z;
        Object obj4 = this.y;
        boolean z6 = false;
        switch (b) {
            case 0:
                kd2 kd2Var = (kd2) obj;
                int intValue = ((Number) obj2).intValue();
                String str = (String) obj4;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var.V(intValue & 1, z)) {
                    boolean f = kd2Var.f(str);
                    Object Q = kd2Var.Q();
                    if (f || Q == q18Var) {
                        Q = new zg(str, (byte) 2);
                        kd2Var.n0(Q);
                    }
                    yz3 a = rh5.a(vz3Var, false, (ub2) Q);
                    os0 os0Var = (os0) obj3;
                    vo3 c = b90.c(pk2.y, false);
                    int s = h98.s(kd2Var);
                    al4 l = kd2Var.l();
                    yz3 E = o80.E(kd2Var, a);
                    tt0.d.getClass();
                    kd2Var.h0();
                    if (kd2Var.S) {
                        kd2Var.k(t53Var);
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
                    os0Var.invoke(kd2Var, 0);
                    kd2Var.q(true);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            case 1:
                kd2 kd2Var2 = (kd2) obj;
                int intValue2 = ((Number) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (kd2Var2.V(intValue2 & 1, z2)) {
                    ((jc2) obj4).invoke(((n80) obj3).b, kd2Var2, 0);
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
            case 2:
                kd2 kd2Var3 = (kd2) obj;
                int intValue3 = ((Number) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kd2Var3.V(intValue3 & 1, z3)) {
                    yc6.a(((nl6) obj4).j, (os0) obj3, kd2Var3, 0);
                } else {
                    kd2Var3.Y();
                }
                return pn6Var;
            case 3:
                kd2 kd2Var4 = (kd2) obj;
                int intValue4 = ((Number) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (kd2Var4.V(intValue4 & 1, z4)) {
                    os0 os0Var2 = (os0) obj3;
                    va5 va5Var = (va5) obj4;
                    vo3 c2 = b90.c(pk2.y, false);
                    int s2 = h98.s(kd2Var4);
                    al4 l2 = kd2Var4.l();
                    yz3 E2 = o80.E(kd2Var4, vz3Var);
                    tt0.d.getClass();
                    kd2Var4.h0();
                    if (kd2Var4.S) {
                        kd2Var4.k(t53Var);
                    } else {
                        kd2Var4.q0();
                    }
                    ss5.i(p7.F, kd2Var4, c2);
                    ss5.i(p7.E, kd2Var4, l2);
                    st0 st0Var2 = p7.G;
                    if (kd2Var4.S || !a34.i(kd2Var4.Q(), Integer.valueOf(s2))) {
                        h11.p(s2, kd2Var4, s2, st0Var2);
                    }
                    ss5.i(p7.D, kd2Var4, E2);
                    os0Var2.invoke(va5Var, kd2Var4, 6);
                    kd2Var4.q(true);
                } else {
                    kd2Var4.Y();
                }
                return pn6Var;
            case 4:
                kd2 kd2Var5 = (kd2) obj;
                int intValue5 = ((Number) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z6 = true;
                }
                if (kd2Var5.V(intValue5 & 1, z6)) {
                    ((os0) obj3).invoke((q66) obj4, kd2Var5, 6);
                } else {
                    kd2Var5.Y();
                }
                return pn6Var;
            default:
                kd2 kd2Var6 = (kd2) obj;
                int intValue6 = ((Number) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (kd2Var6.V(intValue6 & 1, z5)) {
                    w44 w44Var = (w44) obj4;
                    Object Q2 = kd2Var6.Q();
                    if (Q2 == q18Var) {
                        Q2 = new ef(w44Var, (byte) 20);
                        kd2Var6.n0(Q2);
                    }
                    yz3 B = wk6.B(vz3Var, (ub2) Q2);
                    os0 os0Var3 = (os0) obj3;
                    vo3 c3 = b90.c(pk2.y, false);
                    int s3 = h98.s(kd2Var6);
                    al4 l3 = kd2Var6.l();
                    yz3 E3 = o80.E(kd2Var6, B);
                    tt0.d.getClass();
                    kd2Var6.h0();
                    if (kd2Var6.S) {
                        kd2Var6.k(t53Var);
                    } else {
                        kd2Var6.q0();
                    }
                    ss5.i(p7.F, kd2Var6, c3);
                    ss5.i(p7.E, kd2Var6, l3);
                    st0 st0Var3 = p7.G;
                    if (kd2Var6.S || !a34.i(kd2Var6.Q(), Integer.valueOf(s3))) {
                        h11.p(s3, kd2Var6, s3, st0Var3);
                    }
                    ss5.i(p7.D, kd2Var6, E3);
                    os0Var3.invoke(kd2Var6, 0);
                    kd2Var6.q(true);
                } else {
                    kd2Var6.Y();
                }
                return pn6Var;
        }
    }

    public /* synthetic */ d50(Object obj, Object obj2, byte b) {
        this.x = b;
        this.y = obj;
        this.z = obj2;
    }
}
