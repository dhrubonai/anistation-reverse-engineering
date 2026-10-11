package defpackage;

import com.anistation.android.R;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ap6 implements ic2 {
    public final /* synthetic */ sb2 A;
    public final /* synthetic */ byte x;
    public final /* synthetic */ String y;
    public final /* synthetic */ boolean z;

    public /* synthetic */ ap6(String str, boolean z, sb2 sb2Var, byte b) {
        this.x = b;
        this.y = str;
        this.z = z;
        this.A = sb2Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        sb2 sb2Var;
        float f;
        boolean z2;
        byte b = this.x;
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
                    yz3 R = n77.R(vz3Var, 20.0f);
                    w50 w50Var = pk2.L;
                    xp0 a = vp0.a(new vr(20.0f, true, new ze0((byte) 6)), w50Var, kd2Var, 54);
                    int hashCode = Long.hashCode(kd2Var.T);
                    al4 l = kd2Var.l();
                    yz3 E = o80.E(kd2Var, R);
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
                    yz3 T = n77.T(vz3Var, 5.0f, 0.0f, 2);
                    xp0 a2 = vp0.a(new vr(10.0f, true, new ze0((byte) 6)), w50Var, kd2Var, 54);
                    int hashCode2 = Long.hashCode(kd2Var.T);
                    al4 l2 = kd2Var.l();
                    yz3 E2 = o80.E(kd2Var, T);
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
                    String f2 = lz5.f(R.string.update_failed, kd2Var);
                    tq1 tq1Var = pl6.a;
                    xd6 xd6Var = ((nl6) kd2Var.j(tq1Var)).g;
                    s92 s92Var = s92.D;
                    tq1 tq1Var2 = op0.a;
                    yc6.b(f2, null, ((mp0) kd2Var.j(tq1Var2)).o, 0L, s92Var, null, 0L, null, 0L, 0, false, 0, 0, xd6Var, kd2Var, 1572864, 0, 131002);
                    yc6.b(this.y, null, ep0.b(0.82f, ((mp0) kd2Var.j(tq1Var2)).o), 0L, null, null, 0L, new c86(3), 0L, 0, false, 0, 0, ((nl6) kd2Var.j(tq1Var)).k, kd2Var, 0, 0, 130042);
                    kd2Var.q(true);
                    z75 a3 = y75.a(new vr(12.0f, true, new ze0((byte) 6)), pk2.H, kd2Var, 6);
                    int hashCode3 = Long.hashCode(kd2Var.T);
                    al4 l3 = kd2Var.l();
                    yz3 E3 = o80.E(kd2Var, vz3Var);
                    kd2Var.h0();
                    if (kd2Var.S) {
                        kd2Var.k(t53Var);
                    } else {
                        kd2Var.q0();
                    }
                    ss5.i(st0Var, kd2Var, a3);
                    ss5.i(ys0Var, kd2Var, l3);
                    h11.q(hashCode3, kd2Var, st0Var2, kd2Var);
                    ss5.i(ys0Var2, kd2Var, E3);
                    float f3 = Float.MAX_VALUE;
                    boolean z4 = this.z;
                    sb2 sb2Var2 = this.A;
                    if (!z4) {
                        kd2Var.e0(-1499418258);
                        String f4 = lz5.f(R.string.later, kd2Var);
                        if (1.0f <= 0.0d) {
                            cz2.a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f = Float.MAX_VALUE;
                        } else {
                            f = 1.0f;
                        }
                        sb2Var = sb2Var2;
                        nx7.a(f4, new ob3(f, true), null, null, false, false, 0.0f, 0L, 0L, null, null, sb2Var, kd2Var, 0, 0, 4092);
                        kd2Var.q(false);
                    } else {
                        sb2Var = sb2Var2;
                        kd2Var.e0(-1499208202);
                        kd2Var.q(false);
                    }
                    String f5 = lz5.f(R.string.retry, kd2Var);
                    long j = ip0.k;
                    long j2 = ep0.e;
                    if (1.0f <= 0.0d) {
                        cz2.a("invalid weight; must be greater than zero");
                    }
                    if (1.0f <= Float.MAX_VALUE) {
                        f3 = 1.0f;
                    }
                    nx7.a(f5, new ob3(f3, true), null, null, false, false, 0.0f, j, j2, null, null, sb2Var, kd2Var, 805306368, 0, 3324);
                    kd2Var.q(true);
                    kd2Var.q(true);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            default:
                kd2 kd2Var2 = (kd2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (kd2Var2.V(intValue2 & 1, z2)) {
                    nx7.i(this.y, this.z, this.A, null, kd2Var2, 0);
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
        }
    }
}
