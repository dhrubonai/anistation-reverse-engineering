package defpackage;

import com.anistation.android.R;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class rl1 implements ic2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ ub2 z;

    public /* synthetic */ rl1(boolean z, ub2 ub2Var, int i) {
        this.x = (byte) 1;
        this.y = z;
        this.z = ub2Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        byte b = this.x;
        boolean z2 = false;
        pn6 pn6Var = pn6.a;
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
                    vz3 vz3Var = vz3.x;
                    yz3 S = n77.S(vz3Var, 16.0f, 18.0f);
                    z75 a = y75.a(x97.y, pk2.I, kd2Var, 48);
                    int hashCode = Long.hashCode(kd2Var.T);
                    al4 l = kd2Var.l();
                    yz3 E = o80.E(kd2Var, S);
                    tt0.d.getClass();
                    kd2Var.h0();
                    boolean z3 = kd2Var.S;
                    t53 t53Var = za3.p0;
                    if (z3) {
                        kd2Var.k(t53Var);
                    } else {
                        kd2Var.q0();
                    }
                    st0 st0Var = p7.F;
                    ss5.i(st0Var, kd2Var, a);
                    ys0 ys0Var = p7.E;
                    ss5.i(ys0Var, kd2Var, l);
                    Integer valueOf = Integer.valueOf(hashCode);
                    st0 st0Var2 = p7.G;
                    ss5.i(st0Var2, kd2Var, valueOf);
                    ss5.h(kd2Var);
                    ys0 ys0Var2 = p7.D;
                    ss5.i(ys0Var2, kd2Var, E);
                    sl1.d(R.drawable.wifi, kd2Var, 0);
                    ov5.a(kd2Var, ar5.l(vz3Var, 14.0f));
                    ob3 ob3Var = new ob3(1.0f, true);
                    xp0 a2 = vp0.a(x97.z, pk2.K, kd2Var, 0);
                    int hashCode2 = Long.hashCode(kd2Var.T);
                    al4 l2 = kd2Var.l();
                    yz3 E2 = o80.E(kd2Var, ob3Var);
                    kd2Var.h0();
                    if (kd2Var.S) {
                        kd2Var.k(t53Var);
                    } else {
                        kd2Var.q0();
                    }
                    ss5.i(st0Var, kd2Var, a2);
                    ss5.i(ys0Var, kd2Var, l2);
                    h11.q(hashCode2, kd2Var, st0Var2, kd2Var);
                    ss5.i(ys0Var2, kd2Var, E2);
                    String f = lz5.f(R.string.download_over_wifi_only, kd2Var);
                    tq1 tq1Var = pl6.a;
                    xd6 xd6Var = ((nl6) kd2Var.j(tq1Var)).j;
                    s92 s92Var = s92.C;
                    tq1 tq1Var2 = op0.a;
                    yc6.b(f, null, ((mp0) kd2Var.j(tq1Var2)).q, 0L, s92Var, null, 0L, null, 0L, 0, false, 0, 0, xd6Var, kd2Var, 1572864, 0, 131002);
                    ov5.a(kd2Var, ar5.e(vz3Var, 4.0f));
                    yc6.b(lz5.f(R.string.download_over_wifi_only_summary, kd2Var), null, ep0.b(0.68f, ((mp0) kd2Var.j(tq1Var2)).q), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, xd6.a(((nl6) kd2Var.j(tq1Var)).l, 0L, null, null, 0L, null, hz5.g(16), null, 16646143), kd2Var, 0, 0, 131066);
                    kd2Var.q(true);
                    ov5.a(kd2Var, ar5.l(vz3Var, 12.0f));
                    sw0.a(this.y, this.z, null, false, kd2Var, 0, 12);
                    kd2Var.q(true);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            case 1:
                ((Integer) obj2).getClass();
                sl1.f(this.y, this.z, (kd2) obj, kb0.N(1));
                return pn6Var;
            case 2:
                kd2 kd2Var2 = (kd2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                }
                if (kd2Var2.V(intValue2 & 1, z2)) {
                    sw0.a(this.y, this.z, null, false, kd2Var2, 0, 12);
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
            default:
                kd2 kd2Var3 = (kd2) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z2 = true;
                }
                if (kd2Var3.V(intValue3 & 1, z2)) {
                    sw0.a(this.y, this.z, null, false, kd2Var3, 0, 12);
                } else {
                    kd2Var3.Y();
                }
                return pn6Var;
        }
    }

    public /* synthetic */ rl1(byte b, ub2 ub2Var, boolean z) {
        this.x = b;
        this.y = z;
        this.z = ub2Var;
    }
}
