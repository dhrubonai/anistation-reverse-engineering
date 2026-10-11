package defpackage;

import com.anistation.android.R;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class je5 implements ic2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ sb2 y;

    public /* synthetic */ je5(int i, sb2 sb2Var) {
        this.x = (byte) 2;
        this.y = sb2Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        byte b = this.x;
        sb2 sb2Var = this.y;
        boolean z2 = false;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                kd2 kd2Var = (kd2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                }
                if (kd2Var.V(intValue & 1, z2)) {
                    zz.a(null, false, true, null, null, 0L, 0L, this.y, null, n03.g, kd2Var, 805306752, 379);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            case 1:
                kd2 kd2Var2 = (kd2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var2.V(intValue2 & 1, z)) {
                    nx7.l(sb2Var, null, kd2Var2, 0);
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
            case 2:
                ((Integer) obj2).getClass();
                nx7.m(sb2Var, (kd2) obj, kb0.N(1));
                return pn6Var;
            default:
                kd2 kd2Var3 = (kd2) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z2 = true;
                }
                if (kd2Var3.V(intValue3 & 1, z2)) {
                    vz3 vz3Var = vz3.x;
                    yz3 R = n77.R(vz3Var, 20.0f);
                    w50 w50Var = pk2.L;
                    xp0 a = vp0.a(new vr(20.0f, true, new ze0((byte) 6)), w50Var, kd2Var3, 54);
                    int hashCode = Long.hashCode(kd2Var3.T);
                    al4 l = kd2Var3.l();
                    yz3 E = o80.E(kd2Var3, R);
                    tt0.d.getClass();
                    kd2Var3.h0();
                    boolean z3 = kd2Var3.S;
                    t53 t53Var = za3.p0;
                    if (z3) {
                        kd2Var3.k(t53Var);
                    } else {
                        kd2Var3.q0();
                    }
                    st0 st0Var = p7.F;
                    ss5.i(st0Var, kd2Var3, a);
                    ys0 ys0Var = p7.E;
                    ss5.i(ys0Var, kd2Var3, l);
                    Integer valueOf = Integer.valueOf(hashCode);
                    st0 st0Var2 = p7.G;
                    ss5.i(st0Var2, kd2Var3, valueOf);
                    ss5.h(kd2Var3);
                    ys0 ys0Var2 = p7.D;
                    ss5.i(ys0Var2, kd2Var3, E);
                    yz3 T = n77.T(vz3Var, 5.0f, 0.0f, 2);
                    xp0 a2 = vp0.a(new vr(10.0f, true, new ze0((byte) 6)), w50Var, kd2Var3, 54);
                    int hashCode2 = Long.hashCode(kd2Var3.T);
                    al4 l2 = kd2Var3.l();
                    yz3 E2 = o80.E(kd2Var3, T);
                    kd2Var3.h0();
                    if (kd2Var3.S) {
                        kd2Var3.k(t53Var);
                    } else {
                        kd2Var3.q0();
                    }
                    ss5.i(st0Var, kd2Var3, a2);
                    ss5.i(ys0Var, kd2Var3, l2);
                    h11.q(hashCode2, kd2Var3, st0Var2, kd2Var3);
                    ss5.i(ys0Var2, kd2Var3, E2);
                    String f = lz5.f(R.string.permission_required, kd2Var3);
                    tq1 tq1Var = pl6.a;
                    xd6 xd6Var = ((nl6) kd2Var3.j(tq1Var)).g;
                    s92 s92Var = s92.D;
                    tq1 tq1Var2 = op0.a;
                    yc6.b(f, null, ((mp0) kd2Var3.j(tq1Var2)).q, 0L, s92Var, null, 0L, null, 0L, 0, false, 0, 0, xd6Var, kd2Var3, 1572864, 0, 131002);
                    yc6.b(lz5.f(R.string.allow_install_message, kd2Var3), null, ep0.b(0.82f, ((mp0) kd2Var3.j(tq1Var2)).q), 0L, null, null, 0L, new c86(3), 0L, 0, false, 0, 0, ((nl6) kd2Var3.j(tq1Var)).k, kd2Var3, 0, 0, 130042);
                    kd2Var3.q(true);
                    nx7.a(lz5.f(R.string.continue_text, kd2Var3), ar5.c(vz3Var, 1.0f), null, null, false, false, 0.0f, 0L, 0L, null, null, this.y, kd2Var3, 48, 0, 4092);
                    kd2Var3.q(true);
                } else {
                    kd2Var3.Y();
                }
                return pn6Var;
        }
    }

    public /* synthetic */ je5(sb2 sb2Var, byte b) {
        this.x = b;
        this.y = sb2Var;
    }
}
