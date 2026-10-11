package defpackage;

import com.anistation.android.R;
import com.anistation.navigation.Route;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class sm0 implements jc2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ sb2 y;

    public /* synthetic */ sm0(sb2 sb2Var, byte b) {
        this.x = b;
        this.y = sb2Var;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        u34 u34Var;
        boolean z;
        boolean z2;
        byte b = this.x;
        sb2 sb2Var = this.y;
        vz3 vz3Var = vz3.x;
        pn6 pn6Var = pn6.a;
        boolean z3 = false;
        switch (b) {
            case 0:
                kd2 kd2Var = (kd2) obj2;
                ((Integer) obj3).getClass();
                kd2Var.e0(-756081143);
                by2 by2Var = (by2) kd2Var.j(yx2.a);
                if (by2Var != null) {
                    kd2Var.e0(-1604682242);
                    kd2Var.q(false);
                    u34Var = null;
                } else {
                    kd2Var.e0(-1604549624);
                    Object Q = kd2Var.Q();
                    if (Q == au0.a) {
                        Q = new u34();
                        kd2Var.n0(Q);
                    }
                    u34Var = (u34) Q;
                    kd2Var.q(false);
                }
                yz3 k = q23.k(vz3.x, u34Var, by2Var, true, null, this.y);
                kd2Var.q(false);
                return k;
            case 1:
                kd2 kd2Var2 = (kd2) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((fc3) obj).getClass();
                if ((intValue & 17) != 16) {
                    z3 = true;
                }
                if (kd2Var2.V(intValue & 1, z3)) {
                    aj.a(Route.MyList.INSTANCE, null, new vh4(15.0f, 8.0f, 15.0f, 1.0f), lz5.f(R.string.my_list, kd2Var2), false, false, this.y, null, null, kd2Var2, 6, 434);
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
            case 2:
                kd2 kd2Var3 = (kd2) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((Route.Donate) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var3.V(intValue2 & 1, z)) {
                    qi1.c(sb2Var, kd2Var3, 0);
                } else {
                    kd2Var3.Y();
                }
                return pn6Var;
            case 3:
                xo3 xo3Var = (xo3) obj;
                ro3 ro3Var = (ro3) obj2;
                xo3Var.getClass();
                ro3Var.getClass();
                int h = (int) (rx0.h(r3.a) * db.B(((Number) sb2Var.invoke()).floatValue(), 0.0f, 1.0f));
                em4 p = ro3Var.p(rx0.a(((rx0) obj3).a, h, h, 0, 0, 12));
                return xo3Var.L(h, p.y, ot1.x, new r0(p, (byte) 13));
            case 4:
                kd2 kd2Var4 = (kd2) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((zc3) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z3 = true;
                }
                if (kd2Var4.V(intValue3 & 1, z3)) {
                    String f = lz5.f(R.string.reset_subtitle_settings, kd2Var4);
                    yz3 c = ar5.c(vz3Var, 1.0f);
                    tq1 tq1Var = op0.a;
                    nx7.a(f, c, null, null, false, false, 0.0f, ((mp0) kd2Var4.j(tq1Var)).r, ((mp0) kd2Var4.j(tq1Var)).o, null, null, this.y, kd2Var4, 48, 0, 3324);
                } else {
                    kd2Var4.Y();
                }
                return pn6Var;
            default:
                kd2 kd2Var5 = (kd2) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((el) obj).getClass();
                if ((intValue4 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (kd2Var5.V(intValue4 & 1, z2)) {
                    xp0 a = vp0.a(x97.z, pk2.K, kd2Var5, 0);
                    int hashCode = Long.hashCode(kd2Var5.T);
                    al4 l = kd2Var5.l();
                    yz3 E = o80.E(kd2Var5, vz3Var);
                    tt0.d.getClass();
                    kd2Var5.h0();
                    if (kd2Var5.S) {
                        kd2Var5.k(za3.p0);
                    } else {
                        kd2Var5.q0();
                    }
                    ss5.i(p7.F, kd2Var5, a);
                    ss5.i(p7.E, kd2Var5, l);
                    ss5.i(p7.G, kd2Var5, Integer.valueOf(hashCode));
                    ss5.h(kd2Var5);
                    ss5.i(p7.D, kd2Var5, E);
                    ov5.a(kd2Var5, ar5.e(vz3Var, 15.0f));
                    yz3 c2 = ar5.c(vz3Var, 1.0f);
                    String f2 = lz5.f(R.string.skip_version, kd2Var5);
                    tq1 tq1Var2 = op0.a;
                    nx7.a(f2, c2, null, null, false, false, 0.0f, ((mp0) kd2Var5.j(tq1Var2)).r, ((mp0) kd2Var5.j(tq1Var2)).o, null, null, this.y, kd2Var5, 48, 0, 3324);
                    kd2Var5.q(true);
                } else {
                    kd2Var5.Y();
                }
                return pn6Var;
        }
    }
}
