package defpackage;

import com.anistation.android.R;
import com.anistation.model.Info;
import com.anistation.model.watch.Provider;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class q01 implements ic2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ Object z;

    public /* synthetic */ q01(zw zwVar, boolean z) {
        this.x = (byte) 4;
        this.z = zwVar;
        this.y = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v20, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v21 */
    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        long b;
        ?? r3;
        boolean z2;
        byte b2 = this.x;
        t53 t53Var = za3.p0;
        vz3 vz3Var = vz3.x;
        pn6 pn6Var = pn6.a;
        boolean z3 = this.y;
        Object obj3 = this.z;
        switch (b2) {
            case 0:
                ((Integer) obj2).getClass();
                n77.m((jb6) obj3, z3, (kd2) obj, kb0.N(1));
                return pn6Var;
            case 1:
                ((Integer) obj2).getClass();
                bb4.h((Info) obj3, z3, (kd2) obj, kb0.N(1));
                return pn6Var;
            case 2:
                ((Integer) obj2).getClass();
                ie6.a(z3, (os0) obj3, (kd2) obj, kb0.N(385));
                return pn6Var;
            case 3:
                Provider provider = (Provider) obj3;
                kd2 kd2Var = (kd2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var.V(intValue & 1, z)) {
                    yz3 R = n77.R(ar5.c(vz3Var, 1.0f), 14.0f);
                    z75 a = y75.a(x97.B, pk2.I, kd2Var, 54);
                    int hashCode = Long.hashCode(kd2Var.T);
                    al4 l = kd2Var.l();
                    yz3 E = o80.E(kd2Var, R);
                    tt0.d.getClass();
                    kd2Var.h0();
                    if (kd2Var.S) {
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
                    xp0 a2 = vp0.a(new vr(4.0f, true, new ze0((byte) 6)), pk2.K, kd2Var, 54);
                    int hashCode2 = Long.hashCode(kd2Var.T);
                    al4 l2 = kd2Var.l();
                    yz3 E2 = o80.E(kd2Var, vz3Var);
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
                    String a3 = e02.a(provider.getId(), false);
                    a3.getClass();
                    tq1 tq1Var = pl6.a;
                    yc6.b(a3, null, 0L, 0L, s92.C, null, 0L, null, 0L, 0, false, 0, 0, ((nl6) kd2Var.j(tq1Var)).k, kd2Var, 1572864, 0, 131006);
                    String tip = provider.getTip();
                    if (tip == null) {
                        kd2Var.e0(-821623572);
                        r3 = 0;
                        kd2Var.q(false);
                    } else {
                        kd2Var.e0(-821623571);
                        xd6 xd6Var = ((nl6) kd2Var.j(tq1Var)).l;
                        if (z3) {
                            kd2Var.e0(-154086084);
                            b = ep0.b(0.65f, ((mp0) kd2Var.j(op0.a)).n);
                            kd2Var.q(false);
                        } else {
                            kd2Var.e0(-153961030);
                            b = ep0.b(0.65f, ((mp0) kd2Var.j(op0.a)).o);
                            kd2Var.q(false);
                        }
                        yc6.b(tip, null, b, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, xd6Var, kd2Var, 0, 0, 131066);
                        r3 = 0;
                        kd2Var.q(false);
                    }
                    kd2Var.q(true);
                    if (z3) {
                        kd2Var.e0(-1589635689);
                        yt2.a(w65.H(R.drawable.tick, kd2Var, r3), lz5.f(R.string.selected_text, kd2Var), ar5.i(vz3Var, 18.0f), ((mp0) kd2Var.j(op0.a)).n, kd2Var, 392, 0);
                        kd2Var.q(r3);
                    } else {
                        kd2Var.e0(-1589301540);
                        kd2Var.q(r3);
                    }
                    kd2Var.q(true);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            default:
                zw zwVar = (zw) obj3;
                kd2 kd2Var2 = (kd2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (kd2Var2.V(intValue2 & 1, z2)) {
                    yz3 R2 = n77.R(ar5.c(vz3Var, 1.0f), 14.0f);
                    z75 a4 = y75.a(x97.B, pk2.I, kd2Var2, 54);
                    int hashCode3 = Long.hashCode(kd2Var2.T);
                    al4 l3 = kd2Var2.l();
                    yz3 E3 = o80.E(kd2Var2, R2);
                    tt0.d.getClass();
                    kd2Var2.h0();
                    if (kd2Var2.S) {
                        kd2Var2.k(t53Var);
                    } else {
                        kd2Var2.q0();
                    }
                    ss5.i(p7.F, kd2Var2, a4);
                    ss5.i(p7.E, kd2Var2, l3);
                    ss5.i(p7.G, kd2Var2, Integer.valueOf(hashCode3));
                    ss5.h(kd2Var2);
                    ss5.i(p7.D, kd2Var2, E3);
                    yc6.b(zwVar.b, null, 0L, 0L, s92.C, null, 0L, null, 0L, 0, false, 0, 0, ((nl6) kd2Var2.j(pl6.a)).k, kd2Var2, 1572864, 0, 131006);
                    if (z3) {
                        kd2Var2.e0(1171740282);
                        yt2.a(w65.H(R.drawable.tick, kd2Var2, 0), lz5.f(R.string.selected_text, kd2Var2), ar5.i(vz3Var, 18.0f), ((mp0) kd2Var2.j(op0.a)).n, kd2Var2, 392, 0);
                        kd2Var2.q(false);
                    } else {
                        kd2Var2.e0(1172074431);
                        kd2Var2.q(false);
                    }
                    kd2Var2.q(true);
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
        }
    }

    public /* synthetic */ q01(Object obj, boolean z, int i, byte b) {
        this.x = b;
        this.z = obj;
        this.y = z;
    }

    public /* synthetic */ q01(boolean z, os0 os0Var, int i) {
        this.x = (byte) 2;
        this.y = z;
        this.z = os0Var;
    }

    public /* synthetic */ q01(boolean z, Provider provider) {
        this.x = (byte) 3;
        this.y = z;
        this.z = provider;
    }
}
