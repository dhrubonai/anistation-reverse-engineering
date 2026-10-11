package defpackage;

import com.anistation.android.R;
import com.anistation.model.AnimeWatchOrderItem;
import com.anistation.model.download.DownloadAnimeGroup;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class vx6 implements ic2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ byte x = 2;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ Object z;

    public /* synthetic */ vx6(ev2 ev2Var, String str, boolean z, String str2, AnimeWatchOrderItem animeWatchOrderItem, String str3, String str4) {
        this.B = ev2Var;
        this.z = str;
        this.y = z;
        this.A = str2;
        this.E = animeWatchOrderItem;
        this.C = str3;
        this.D = str4;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        long b;
        boolean z2;
        byte b2 = this.x;
        final boolean z3 = this.y;
        pn6 pn6Var = pn6.a;
        Object obj3 = this.E;
        Object obj4 = this.D;
        Object obj5 = this.C;
        Object obj6 = this.A;
        Object obj7 = this.z;
        Object obj8 = this.B;
        byte b3 = 6;
        switch (b2) {
            case 0:
                ev2 ev2Var = (ev2) obj8;
                String str = (String) obj7;
                String str2 = (String) obj6;
                final AnimeWatchOrderItem animeWatchOrderItem = (AnimeWatchOrderItem) obj3;
                final String str3 = (String) obj5;
                final String str4 = (String) obj4;
                kd2 kd2Var = (kd2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var.V(intValue & 1, z)) {
                    vz3 vz3Var = vz3.x;
                    yz3 t = wk6.t(n77.R(ar5.c(vz3Var, 1.0f), 8.0f));
                    z75 a = y75.a(x97.y, pk2.I, kd2Var, 48);
                    int hashCode = Long.hashCode(kd2Var.T);
                    al4 l = kd2Var.l();
                    yz3 E = o80.E(kd2Var, t);
                    tt0.d.getClass();
                    kd2Var.h0();
                    boolean z4 = kd2Var.S;
                    t53 t53Var = za3.p0;
                    if (z4) {
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
                    yz3 k = n03.k(ar5.g(ar5.l(vz3Var, 80.0f).w(ar5.b), 110.0f, 0.0f, 2), ((cn5) kd2Var.j(dn5.a)).b);
                    tq1 tq1Var = op0.a;
                    yz3 h = bx7.h(k, ((mp0) kd2Var.j(tq1Var)).r, io3.h);
                    y50 y50Var = pk2.y;
                    vo3 c = b90.c(y50Var, false);
                    int hashCode2 = Long.hashCode(kd2Var.T);
                    al4 l2 = kd2Var.l();
                    yz3 E2 = o80.E(kd2Var, h);
                    kd2Var.h0();
                    if (kd2Var.S) {
                        kd2Var.k(t53Var);
                    } else {
                        kd2Var.q0();
                    }
                    ss5.i(st0Var, kd2Var, c);
                    ss5.i(ys0Var, kd2Var, l2);
                    h11.q(hashCode2, kd2Var, st0Var2, kd2Var);
                    ss5.i(ys0Var2, kd2Var, E2);
                    xh4 H = w65.H(R.drawable.question_mark, kd2Var, 0);
                    n90 n90Var = n90.a;
                    tl7.b(ev2Var, str, n90Var.b(vz3Var), null, H, kd2Var, 262144, 31704);
                    if (z3) {
                        kd2Var.e0(1037074723);
                        b = ((mp0) kd2Var.j(tq1Var)).a;
                        kd2Var.q(false);
                    } else {
                        kd2Var.e0(1037076175);
                        kd2Var.q(false);
                        b = ep0.b(0.75f, ep0.b);
                    }
                    n03.c(str2, n77.R(n90Var.a(vz3Var, y50Var), 6.0f), null, b, null, ep0.e, null, null, kd2Var, 196608, 212);
                    kd2Var.q(true);
                    yz3 U = n77.U(new ob3(1.0f, true), 12.0f, 2.0f, 4.0f, 2.0f);
                    xp0 a2 = vp0.a(new vr(5.0f, true, new ze0((byte) 6)), pk2.K, kd2Var, 6);
                    int hashCode3 = Long.hashCode(kd2Var.T);
                    al4 l3 = kd2Var.l();
                    yz3 E3 = o80.E(kd2Var, U);
                    kd2Var.h0();
                    if (kd2Var.S) {
                        kd2Var.k(t53Var);
                    } else {
                        kd2Var.q0();
                    }
                    ss5.i(st0Var, kd2Var, a2);
                    ss5.i(ys0Var, kd2Var, l3);
                    h11.q(hashCode3, kd2Var, st0Var2, kd2Var);
                    ss5.i(ys0Var2, kd2Var, E3);
                    tq1 tq1Var2 = pl6.a;
                    yc6.b(str, null, ((mp0) kd2Var.j(tq1Var)).o, 0L, s92.C, null, 0L, null, 0L, 2, false, 2, 0, xd6.a(((nl6) kd2Var.j(tq1Var2)).k, 0L, null, null, 0L, null, hz5.g(20), null, 16646143), kd2Var, 1572864, 24960, 110522);
                    String startDate = animeWatchOrderItem.getStartDate();
                    if (startDate == null) {
                        kd2Var.e0(566608354);
                        kd2Var.q(false);
                    } else {
                        kd2Var.e0(566608355);
                        yc6.b(startDate, null, ep0.b(0.62f, ((mp0) kd2Var.j(tq1Var)).o), 0L, null, null, 0L, null, 0L, 2, false, 1, 0, ((nl6) kd2Var.j(tq1Var2)).l, kd2Var, 0, 24960, 110586);
                        kd2Var.q(false);
                    }
                    q23.b(n77.V(vz3Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), new vr(6.0f, true, new ze0((byte) 6)), new vr(6.0f, true, new ze0((byte) 6)), null, 0, 0, nx7.R(-2003523033, new jc2() { // from class: wx6
                        @Override // defpackage.jc2
                        public final Object invoke(Object obj9, Object obj10, Object obj11) {
                            boolean z5;
                            kd2 kd2Var2 = (kd2) obj10;
                            int intValue2 = ((Integer) obj11).intValue();
                            ((t62) obj9).getClass();
                            if ((intValue2 & 17) != 16) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (kd2Var2.V(intValue2 & 1, z5)) {
                                String label = AnimeWatchOrderItem.this.getFormat().getLabel();
                                tq1 tq1Var3 = op0.a;
                                n03.c(label, null, null, ((mp0) kd2Var2.j(tq1Var3)).o, null, ((mp0) kd2Var2.j(tq1Var3)).n, null, null, kd2Var2, 0, 214);
                                String str5 = str3;
                                if (str5 != null) {
                                    kd2Var2.e0(206144985);
                                    n03.c(str5, null, null, ((mp0) kd2Var2.j(tq1Var3)).r, null, ((mp0) kd2Var2.j(tq1Var3)).o, null, null, kd2Var2, 0, 214);
                                    kd2Var2.q(false);
                                } else {
                                    kd2Var2.e0(206423675);
                                    kd2Var2.q(false);
                                }
                                String str6 = str4;
                                if (str6 != null) {
                                    kd2Var2.e0(206485272);
                                    n03.c(str6, null, null, ((mp0) kd2Var2.j(tq1Var3)).r, null, ((mp0) kd2Var2.j(tq1Var3)).o, null, null, kd2Var2, 0, 214);
                                    kd2Var2.q(false);
                                } else {
                                    kd2Var2.e0(206764923);
                                    kd2Var2.q(false);
                                }
                                if (z3) {
                                    kd2Var2.e0(206810059);
                                    n03.c(lz5.f(R.string.current, kd2Var2), null, null, ((mp0) kd2Var2.j(tq1Var3)).a, null, ep0.e, null, null, kd2Var2, 196608, 214);
                                    kd2Var2.q(false);
                                } else {
                                    kd2Var2.e0(207071451);
                                    kd2Var2.q(false);
                                }
                            } else {
                                kd2Var2.Y();
                            }
                            return pn6.a;
                        }
                    }, kd2Var), kd2Var, 1573302, 56);
                    kd2Var.q(true);
                    kd2Var.q(true);
                    return pn6Var;
                }
                kd2Var.Y();
                return pn6Var;
            case 1:
                ub2 ub2Var = (ub2) obj8;
                o83 o83Var = (o83) obj5;
                m83 m83Var = (m83) obj4;
                w44 w44Var = (w44) obj3;
                String str5 = (String) obj7;
                String str6 = (String) obj6;
                kd2 kd2Var2 = (kd2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (kd2Var2.V(intValue2 & 1, z2)) {
                    mc6 mc6Var = (mc6) w44Var.getValue();
                    tq1 tq1Var3 = op0.a;
                    xd6 xd6Var = new xd6(((mp0) kd2Var2.j(tq1Var3)).o, hz5.g(16), null, null, 0L, 0, 0, 0L, 16777212);
                    su5 su5Var = new su5(((mp0) kd2Var2.j(tq1Var3)).o);
                    boolean z5 = !z3;
                    ob3 ob3Var = new ob3(0.8f, true);
                    boolean f = kd2Var2.f(ub2Var);
                    Object Q = kd2Var2.Q();
                    if (f || Q == au0.a) {
                        Q = new b0(ub2Var, w44Var, b3);
                        kd2Var2.n0(Q);
                    }
                    s40.c(mc6Var, (ub2) Q, ob3Var, false, xd6Var, o83Var, m83Var, z5, 0, 0, null, null, su5Var, nx7.R(1249268496, new xh(z3, str5, str6), kd2Var2), kd2Var2, 0);
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
            case 2:
                ((Integer) obj2).getClass();
                dk1.b((DownloadAnimeGroup) obj8, (List) obj7, this.y, (Set) obj6, (ub2) obj5, (sb2) obj4, (sb2) obj3, (kd2) obj, kb0.N(1));
                return pn6Var;
            default:
                ((Integer) obj2).getClass();
                nx7.e(this.y, (sb2) obj8, (yz3) obj7, (mx4) obj6, (e7) obj5, (jc2) obj4, (os0) obj3, (kd2) obj, kb0.N(1769857));
                return pn6Var;
        }
    }

    public /* synthetic */ vx6(DownloadAnimeGroup downloadAnimeGroup, List list, boolean z, Set set, ub2 ub2Var, sb2 sb2Var, sb2 sb2Var2, int i) {
        this.B = downloadAnimeGroup;
        this.z = list;
        this.y = z;
        this.A = set;
        this.C = ub2Var;
        this.D = sb2Var;
        this.E = sb2Var2;
    }

    public /* synthetic */ vx6(boolean z, sb2 sb2Var, yz3 yz3Var, mx4 mx4Var, e7 e7Var, jc2 jc2Var, os0 os0Var, int i) {
        this.y = z;
        this.B = sb2Var;
        this.z = yz3Var;
        this.A = mx4Var;
        this.C = e7Var;
        this.D = jc2Var;
        this.E = os0Var;
    }

    public /* synthetic */ vx6(boolean z, ub2 ub2Var, o83 o83Var, m83 m83Var, w44 w44Var, String str, String str2) {
        this.y = z;
        this.B = ub2Var;
        this.C = o83Var;
        this.D = m83Var;
        this.E = w44Var;
        this.z = str;
        this.A = str2;
    }
}
