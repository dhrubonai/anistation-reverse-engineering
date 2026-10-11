package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class fh implements ic2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ byte x;
    public final /* synthetic */ th4 y;
    public final /* synthetic */ long z;

    public /* synthetic */ fh(th4 th4Var, Object obj, long j, byte b) {
        this.x = b;
        this.y = th4Var;
        this.A = obj;
        this.z = j;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        t53 t53Var = za3.p0;
        Object obj3 = this.A;
        th4 th4Var = this.y;
        vz3 vz3Var = vz3.x;
        switch (b) {
            case 0:
                String str = (String) obj3;
                kd2 kd2Var = (kd2) obj;
                int intValue = ((Integer) obj2).intValue();
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
                    yc6.b(str, null, this.z, 0L, s92.C, null, 0L, null, 0L, 0, false, 0, 0, ((nl6) kd2Var.j(pl6.a)).k, kd2Var, 1572864, 0, 131002);
                    kd2Var.q(true);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            default:
                ys0 ys0Var = p7.D;
                st0 st0Var = p7.G;
                ys0 ys0Var2 = p7.E;
                st0 st0Var2 = p7.F;
                List list = (List) obj3;
                kd2 kd2Var2 = (kd2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (kd2Var2.V(intValue2 & 1, z2)) {
                    yz3 Q2 = n77.Q(ar5.c(vz3Var, 1.0f), th4Var);
                    int i = 54;
                    xp0 a = vp0.a(new vr(16.0f, true, new ze0((byte) 6)), pk2.L, kd2Var2, 54);
                    int hashCode2 = Long.hashCode(kd2Var2.T);
                    al4 l2 = kd2Var2.l();
                    yz3 E2 = o80.E(kd2Var2, Q2);
                    tt0.d.getClass();
                    kd2Var2.h0();
                    if (kd2Var2.S) {
                        kd2Var2.k(t53Var);
                    } else {
                        kd2Var2.q0();
                    }
                    ss5.i(st0Var2, kd2Var2, a);
                    ss5.i(ys0Var2, kd2Var2, l2);
                    h11.q(hashCode2, kd2Var2, st0Var, kd2Var2);
                    ss5.i(ys0Var, kd2Var2, E2);
                    kd2Var2.e0(1412804854);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        te1 te1Var = (te1) it.next();
                        yz3 c2 = ar5.c(vz3Var, 1.0f);
                        x50 x50Var = pk2.I;
                        z75 a2 = y75.a(x97.B, x50Var, kd2Var2, i);
                        pn6 pn6Var2 = pn6Var;
                        Iterator it2 = it;
                        int hashCode3 = Long.hashCode(kd2Var2.T);
                        al4 l3 = kd2Var2.l();
                        yz3 E3 = o80.E(kd2Var2, c2);
                        tt0.d.getClass();
                        kd2Var2.h0();
                        if (kd2Var2.S) {
                            kd2Var2.k(t53Var);
                        } else {
                            kd2Var2.q0();
                        }
                        ss5.i(st0Var2, kd2Var2, a2);
                        ss5.i(ys0Var2, kd2Var2, l3);
                        h11.q(hashCode3, kd2Var2, st0Var, kd2Var2);
                        ss5.i(ys0Var, kd2Var2, E3);
                        ob3 ob3Var = new ob3(1.0f, false);
                        z75 a3 = y75.a(new vr(6.0f, true, new ze0((byte) 6)), x50Var, kd2Var2, i);
                        int hashCode4 = Long.hashCode(kd2Var2.T);
                        al4 l4 = kd2Var2.l();
                        yz3 E4 = o80.E(kd2Var2, ob3Var);
                        kd2Var2.h0();
                        if (kd2Var2.S) {
                            kd2Var2.k(t53Var);
                        } else {
                            kd2Var2.q0();
                        }
                        ss5.i(st0Var2, kd2Var2, a3);
                        ss5.i(ys0Var2, kd2Var2, l4);
                        h11.q(hashCode4, kd2Var2, st0Var, kd2Var2);
                        ss5.i(ys0Var, kd2Var2, E4);
                        xh4 H = w65.H(te1Var.a, kd2Var2, 0);
                        yz3 i2 = ar5.i(vz3Var, 20.0f);
                        long j = this.z;
                        kd2 kd2Var3 = kd2Var2;
                        yt2.a(H, null, i2, j, kd2Var3, 440, 0);
                        String str2 = te1Var.b;
                        tq1 tq1Var = pl6.a;
                        xd6 xd6Var = ((nl6) kd2Var3.j(tq1Var)).k;
                        s92 s92Var = s92.C;
                        yc6.b(str2, null, j, 0L, s92Var, null, 0L, null, 0L, 2, false, 1, 0, xd6Var, kd2Var3, 1572864, 24960, 110522);
                        kd2Var3.q(true);
                        ov5.a(kd2Var3, ar5.l(vz3Var, 8.0f));
                        yc6.b(te1Var.c, null, ((mp0) kd2Var3.j(op0.a)).o, 0L, s92Var, null, 0L, new c86(6), 0L, 2, false, 2, 0, ((nl6) kd2Var3.j(tq1Var)).k, kd2Var3, 1572864, 24960, 109498);
                        kd2Var3.q(true);
                        i = i;
                        kd2Var2 = kd2Var3;
                        pn6Var = pn6Var2;
                        it = it2;
                    }
                    pn6 pn6Var3 = pn6Var;
                    kd2 kd2Var4 = kd2Var2;
                    kd2Var4.q(false);
                    kd2Var4.q(true);
                    return pn6Var3;
                }
                kd2Var2.Y();
                return pn6Var;
        }
    }
}
