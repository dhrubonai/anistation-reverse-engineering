package defpackage;

import android.content.Context;
import com.anistation.android.R;
import com.anistation.model.Status;
import com.anistation.model.github.DevProfile;
import com.anistation.model.library.AnimeListItem;
import com.anistation.model.library.AnimeWithProgress;
import com.anistation.model.settings.SubtitleStyleSettings;
import com.anistation.model.update.AppUpdateCheck;
import com.anistation.navigation.Route;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class fj implements ic2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ fj(ic6 ic6Var, o83 o83Var, he5 he5Var, String str) {
        this.x = (byte) 4;
        this.A = ic6Var;
        this.z = o83Var;
        this.B = he5Var;
        this.y = str;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        boolean z6;
        boolean z7;
        vz3 vz3Var;
        String g;
        byte b = this.x;
        q18 q18Var = au0.a;
        t53 t53Var = za3.p0;
        pn6 pn6Var = pn6.a;
        Object obj3 = this.B;
        Object obj4 = this.z;
        Object obj5 = this.y;
        Object obj6 = this.A;
        switch (b) {
            case 0:
                Context context = (Context) obj6;
                String str = (String) obj5;
                String str2 = (String) obj4;
                dz0 dz0Var = (dz0) obj3;
                kd2 kd2Var = (kd2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var.V(intValue & 1, z)) {
                    z22 z22Var = ar5.c;
                    yz3 h = bx7.h(z22Var, ep0.b, io3.h);
                    vo3 c = b90.c(pk2.y, false);
                    int hashCode = Long.hashCode(kd2Var.T);
                    al4 l = kd2Var.l();
                    yz3 E = o80.E(kd2Var, h);
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
                    bv2 bv2Var = new bv2(context);
                    bv2Var.c = str;
                    hv2.a(bv2Var, false);
                    tl7.a(bv2Var.a(), str2, z22Var, dz0Var, kd2Var, 384);
                    kd2Var.q(true);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            case 1:
                String str3 = (String) obj5;
                Status status = (Status) obj6;
                String str4 = (String) obj4;
                sb2 sb2Var = (sb2) obj3;
                kd2 kd2Var2 = (kd2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (kd2Var2.V(intValue2 & 1, z2)) {
                    yz3 R = n77.R(ar5.c, 20.0f);
                    xp0 a = vp0.a(x97.A, pk2.L, kd2Var2, 54);
                    int hashCode2 = Long.hashCode(kd2Var2.T);
                    al4 l2 = kd2Var2.l();
                    yz3 E2 = o80.E(kd2Var2, R);
                    tt0.d.getClass();
                    kd2Var2.h0();
                    if (kd2Var2.S) {
                        kd2Var2.k(t53Var);
                    } else {
                        kd2Var2.q0();
                    }
                    ss5.i(p7.F, kd2Var2, a);
                    ss5.i(p7.E, kd2Var2, l2);
                    ss5.i(p7.G, kd2Var2, Integer.valueOf(hashCode2));
                    ss5.h(kd2Var2);
                    ss5.i(p7.D, kd2Var2, E2);
                    if (str3 == null) {
                        str3 = "Unknown error";
                    }
                    String str5 = str3 + " \n[" + status + "]";
                    xd6 xd6Var = ((nl6) kd2Var2.j(pl6.a)).j;
                    vz3 vz3Var2 = vz3.x;
                    yc6.b(str5, ar5.c(vz3Var2, 0.65f), 0L, 0L, null, null, 0L, new c86(3), 0L, 0, false, 0, 0, xd6Var, kd2Var2, 48, 0, 130044);
                    nx7.a(str4, ar5.l(n77.V(vz3Var2, 0.0f, 10.0f, 0.0f, 0.0f, 13), 100.0f), null, null, false, false, 45.0f, 0L, 0L, null, null, sb2Var, kd2Var2, 12582960, 0, 3964);
                    kd2Var2.q(true);
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
            case 2:
                ((Integer) obj2).getClass();
                u.g((DevProfile) obj5, (Context) obj6, (sb2) obj4, (yz3) obj3, (kd2) obj, kb0.N(1));
                return pn6Var;
            case 3:
                ys0 ys0Var = p7.D;
                st0 st0Var = p7.G;
                ys0 ys0Var2 = p7.E;
                st0 st0Var2 = p7.F;
                List list = (List) obj6;
                Route route = (Route) obj5;
                final ub2 ub2Var = (ub2) obj4;
                ub2 ub2Var2 = (ub2) obj3;
                kd2 kd2Var3 = (kd2) obj;
                int intValue3 = ((Integer) obj2).intValue();
                y50 y50Var = pk2.C;
                if ((intValue3 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kd2Var3.V(intValue3 & 1, z3)) {
                    vz3 vz3Var3 = vz3.x;
                    yz3 c2 = ar5.c(vz3Var3, 1.0f);
                    xp0 a2 = vp0.a(x97.z, pk2.K, kd2Var3, 0);
                    int hashCode3 = Long.hashCode(kd2Var3.T);
                    al4 l3 = kd2Var3.l();
                    yz3 E3 = o80.E(kd2Var3, c2);
                    tt0.d.getClass();
                    kd2Var3.h0();
                    ub2 ub2Var3 = ub2Var2;
                    if (kd2Var3.S) {
                        kd2Var3.k(t53Var);
                    } else {
                        kd2Var3.q0();
                    }
                    ss5.i(st0Var2, kd2Var3, a2);
                    ss5.i(ys0Var2, kd2Var3, l3);
                    h11.q(hashCode3, kd2Var3, st0Var, kd2Var3);
                    ss5.i(ys0Var, kd2Var3, E3);
                    kb0.e(ar5.c(vz3Var3, 1.0f), 0.0f, ep0.b(0.8f, ((mp0) kd2Var3.j(op0.a)).p), kd2Var3, 6, 2);
                    yz3 c3 = ar5.c(n77.V(vz3Var3, 0.0f, 5.0f, 0.0f, 0.0f, 13), 1.0f);
                    vo3 c4 = b90.c(y50Var, false);
                    int hashCode4 = Long.hashCode(kd2Var3.T);
                    al4 l4 = kd2Var3.l();
                    yz3 E4 = o80.E(kd2Var3, c3);
                    kd2Var3.h0();
                    if (kd2Var3.S) {
                        kd2Var3.k(t53Var);
                    } else {
                        kd2Var3.q0();
                    }
                    ss5.i(st0Var2, kd2Var3, c4);
                    ss5.i(ys0Var2, kd2Var3, l4);
                    h11.q(hashCode4, kd2Var3, st0Var, kd2Var3);
                    ss5.i(ys0Var, kd2Var3, E4);
                    yz3 c5 = ar5.c(ar5.n(vz3Var3, 0.0f, 540.0f, 1), 1.0f);
                    z75 a3 = y75.a(x97.y, pk2.I, kd2Var3, 48);
                    int hashCode5 = Long.hashCode(kd2Var3.T);
                    al4 l5 = kd2Var3.l();
                    yz3 E5 = o80.E(kd2Var3, c5);
                    kd2Var3.h0();
                    if (kd2Var3.S) {
                        kd2Var3.k(t53Var);
                    } else {
                        kd2Var3.q0();
                    }
                    ss5.i(st0Var2, kd2Var3, a3);
                    ss5.i(ys0Var2, kd2Var3, l5);
                    h11.q(hashCode5, kd2Var3, st0Var, kd2Var3);
                    ss5.i(ys0Var, kd2Var3, E5);
                    kd2Var3.e0(1952446019);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        t70 t70Var = (t70) it.next();
                        final boolean i2 = a34.i(route, t70Var.a);
                        ob3 ob3Var = new ob3(1.0f, true);
                        vo3 c6 = b90.c(y50Var, false);
                        Iterator it2 = it;
                        int hashCode6 = Long.hashCode(kd2Var3.T);
                        al4 l6 = kd2Var3.l();
                        yz3 E6 = o80.E(kd2Var3, ob3Var);
                        tt0.d.getClass();
                        kd2Var3.h0();
                        y50 y50Var2 = y50Var;
                        if (kd2Var3.S) {
                            kd2Var3.k(t53Var);
                        } else {
                            kd2Var3.q0();
                        }
                        ss5.i(st0Var2, kd2Var3, c6);
                        ss5.i(ys0Var2, kd2Var3, l6);
                        h11.q(hashCode6, kd2Var3, st0Var, kd2Var3);
                        ss5.i(ys0Var, kd2Var3, E6);
                        final ub2 ub2Var4 = ub2Var3;
                        boolean g2 = kd2Var3.g(i2) | kd2Var3.f(ub2Var) | kd2Var3.f(ub2Var4);
                        Object Q = kd2Var3.Q();
                        if (g2 || Q == q18Var) {
                            Q = new ub2() { // from class: vg
                                @Override // defpackage.ub2
                                public final Object invoke(Object obj7) {
                                    ub2 ub2Var5;
                                    Route route2 = (Route) obj7;
                                    route2.getClass();
                                    if (i2 && (ub2Var5 = ub2Var) != null) {
                                        ub2Var5.invoke(route2);
                                    } else {
                                        ub2Var4.invoke(route2);
                                    }
                                    return pn6.a;
                                }
                            };
                            kd2Var3.n0(Q);
                        }
                        yg.b(t70Var, i2, (ub2) Q, kd2Var3, 0);
                        kd2Var3.q(true);
                        it = it2;
                        ub2Var3 = ub2Var4;
                        y50Var = y50Var2;
                    }
                    kd2Var3.q(false);
                    kd2Var3.q(true);
                    kd2Var3.q(true);
                    kd2Var3.q(true);
                } else {
                    kd2Var3.Y();
                }
                return pn6Var;
            case 4:
                ic6 ic6Var = (ic6) obj6;
                o83 o83Var = (o83) obj4;
                he5 he5Var = (he5) obj3;
                String str6 = (String) obj5;
                kd2 kd2Var4 = (kd2) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (kd2Var4.V(intValue4 & 1, z4)) {
                    tq1 tq1Var = op0.a;
                    s40.a(ic6Var, new ob3(0.8f, true), false, new xd6(((mp0) kd2Var4.j(tq1Var)).o, hz5.g(16), null, null, 0L, 0, 0, 0L, 16777212), o83Var, he5Var, l68.Q, new su5(((mp0) kd2Var4.j(tq1Var)).o), new pz2(ic6Var, str6, (byte) 1), null, kd2Var4, 0);
                } else {
                    kd2Var4.Y();
                }
                return pn6Var;
            case 5:
                ev2 ev2Var = (ev2) obj6;
                String str7 = (String) obj5;
                AnimeWithProgress animeWithProgress = (AnimeWithProgress) obj4;
                AnimeListItem animeListItem = (AnimeListItem) obj3;
                kd2 kd2Var5 = (kd2) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (kd2Var5.V(intValue5 & 1, z5)) {
                    vz3 vz3Var4 = vz3.x;
                    yz3 c7 = ar5.c(vz3Var4, 1.0f);
                    Object Q2 = kd2Var5.Q();
                    if (Q2 == q18Var) {
                        Q2 = yb.d;
                        kd2Var5.n0(Q2);
                    }
                    vo3 vo3Var = (vo3) Q2;
                    int hashCode7 = Long.hashCode(kd2Var5.T);
                    al4 l7 = kd2Var5.l();
                    yz3 E7 = o80.E(kd2Var5, c7);
                    tt0.d.getClass();
                    kd2Var5.h0();
                    if (kd2Var5.S) {
                        kd2Var5.k(t53Var);
                    } else {
                        kd2Var5.q0();
                    }
                    st0 st0Var3 = p7.F;
                    ss5.i(st0Var3, kd2Var5, vo3Var);
                    ys0 ys0Var3 = p7.E;
                    ss5.i(ys0Var3, kd2Var5, l7);
                    Integer valueOf = Integer.valueOf(hashCode7);
                    st0 st0Var4 = p7.G;
                    ss5.i(st0Var4, kd2Var5, valueOf);
                    ss5.h(kd2Var5);
                    ys0 ys0Var4 = p7.D;
                    ss5.i(ys0Var4, kd2Var5, E7);
                    yz3 k = n03.k(n77.V(ar5.l(vz3Var4, 90.0f), 8.0f, 8.0f, 0.0f, 8.0f, 4), ((cn5) kd2Var5.j(dn5.a)).b);
                    tq1 tq1Var2 = op0.a;
                    yz3 h2 = bx7.h(k, ((mp0) kd2Var5.j(tq1Var2)).r, io3.h);
                    vo3 c8 = b90.c(pk2.y, false);
                    int hashCode8 = Long.hashCode(kd2Var5.T);
                    al4 l8 = kd2Var5.l();
                    yz3 E8 = o80.E(kd2Var5, h2);
                    kd2Var5.h0();
                    if (kd2Var5.S) {
                        kd2Var5.k(t53Var);
                    } else {
                        kd2Var5.q0();
                    }
                    ss5.i(st0Var3, kd2Var5, c8);
                    ss5.i(ys0Var3, kd2Var5, l8);
                    h11.q(hashCode8, kd2Var5, st0Var4, kd2Var5);
                    ss5.i(ys0Var4, kd2Var5, E8);
                    tl7.a(ev2Var, str7, n90.a.b(vz3Var4), pk2.O, kd2Var5, 1572864);
                    kd2Var5.q(true);
                    yz3 U = n77.U(vz3Var4, 12.0f, 8.0f, 12.0f, 8.0f);
                    xp0 a4 = vp0.a(new vr(4.0f, true, new ze0((byte) 6)), pk2.K, kd2Var5, 6);
                    int hashCode9 = Long.hashCode(kd2Var5.T);
                    al4 l9 = kd2Var5.l();
                    yz3 E9 = o80.E(kd2Var5, U);
                    kd2Var5.h0();
                    if (kd2Var5.S) {
                        kd2Var5.k(t53Var);
                    } else {
                        kd2Var5.q0();
                    }
                    ss5.i(st0Var3, kd2Var5, a4);
                    ss5.i(ys0Var3, kd2Var5, l9);
                    h11.q(hashCode9, kd2Var5, st0Var4, kd2Var5);
                    ss5.i(ys0Var4, kd2Var5, E9);
                    yc6.b(str7, null, ((mp0) kd2Var5.j(tq1Var2)).o, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, ((nl6) kd2Var5.j(pl6.a)).j, kd2Var5, 0, 24960, 110586);
                    q23.b(n77.V(vz3Var4, 0.0f, 4.0f, 0.0f, 0.0f, 13), new vr(6.0f, true, new ze0((byte) 6)), new vr(6.0f, true, new ze0((byte) 6)), null, 0, 0, nx7.R(-1177529022, new fr5((Object) animeListItem, (byte) 2), kd2Var5), kd2Var5, 1573302, 56);
                    Integer currentEpisode = animeWithProgress.getCurrentEpisode();
                    if (currentEpisode != null) {
                        i = currentEpisode.intValue();
                    } else {
                        i = 0;
                    }
                    wk6.f(i, animeListItem.getTotalEpisodes(), animeListItem.getCurrentAiredEpisodes(), animeListItem.getMediaStatus(), n77.V(vz3Var4, 0.0f, 8.0f, 0.0f, 2.0f, 5), kd2Var5, 24576);
                    kd2Var5.q(true);
                    kd2Var5.q(true);
                } else {
                    kd2Var5.Y();
                }
                return pn6Var;
            case 6:
                yz3 yz3Var = (yz3) obj6;
                w44 w44Var = (w44) obj5;
                os0 os0Var = (os0) obj4;
                f40 f40Var = (f40) obj3;
                kd2 kd2Var6 = (kd2) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (kd2Var6.V(intValue6 & 1, z6)) {
                    Object Q3 = kd2Var6.Q();
                    if (Q3 == q18Var) {
                        Q3 = new ef(w44Var, (byte) 1);
                        kd2Var6.n0(Q3);
                    }
                    yz3 B = wk6.B(yz3Var, (ub2) Q3);
                    vo3 c9 = b90.c(pk2.y, true);
                    int hashCode10 = Long.hashCode(kd2Var6.T);
                    al4 l10 = kd2Var6.l();
                    yz3 E10 = o80.E(kd2Var6, B);
                    tt0.d.getClass();
                    kd2Var6.h0();
                    if (kd2Var6.S) {
                        kd2Var6.k(t53Var);
                    } else {
                        kd2Var6.q0();
                    }
                    ss5.i(p7.F, kd2Var6, c9);
                    ss5.i(p7.E, kd2Var6, l10);
                    ss5.i(p7.G, kd2Var6, Integer.valueOf(hashCode10));
                    ss5.h(kd2Var6);
                    ss5.i(p7.D, kd2Var6, E10);
                    os0Var.invoke(kd2Var6, 0);
                    Object Q4 = kd2Var6.Q();
                    if (Q4 == q18Var) {
                        Q4 = new cf(w44Var, (byte) 8);
                        kd2Var6.n0(Q4);
                    }
                    f40Var.b((sb2) Q4, kd2Var6, 6);
                    kd2Var6.q(true);
                } else {
                    kd2Var6.Y();
                }
                return pn6Var;
            case 7:
                ((Integer) obj2).getClass();
                o80.e((sb2) obj6, (yz3) obj5, (be3) obj4, (td3) obj3, (kd2) obj, kb0.N(1));
                return pn6Var;
            case 8:
                ((Integer) obj2).getClass();
                ho3.b((mp0) obj6, (cn5) obj5, (nl6) obj4, (os0) obj3, (kd2) obj, kb0.N(1));
                return pn6Var;
            case 9:
                ((Integer) obj2).getClass();
                h26.e((SubtitleStyleSettings) obj6, (ub2) obj5, (sb2) obj4, (sb2) obj3, (kd2) obj, kb0.N(1));
                return pn6Var;
            case 10:
                ((Integer) obj2).getClass();
                h26.c((xh4) obj6, (List) obj5, (SubtitleStyleSettings) obj4, (yz3) obj3, (kd2) obj, kb0.N(9));
                return pn6Var;
            case 11:
                ((Integer) obj2).getClass();
                nx7.n((do5) obj6, (AppUpdateCheck) obj5, (sb2) obj4, (sb2) obj3, (kd2) obj, kb0.N(1));
                return pn6Var;
            default:
                ys0 ys0Var5 = p7.D;
                st0 st0Var5 = p7.G;
                ys0 ys0Var6 = p7.E;
                st0 st0Var6 = p7.F;
                List list2 = (List) obj6;
                List list3 = (List) obj5;
                w44 w44Var2 = (w44) obj4;
                AppUpdateCheck appUpdateCheck = (AppUpdateCheck) obj3;
                kd2 kd2Var7 = (kd2) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if ((intValue7 & 3) != 2) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (kd2Var7.V(intValue7 & 1, z7)) {
                    vz3 vz3Var5 = vz3.x;
                    yz3 R2 = n77.R(vz3Var5, 18.0f);
                    xp0 a5 = vp0.a(new vr(12.0f, true, new ze0((byte) 6)), pk2.K, kd2Var7, 6);
                    int hashCode11 = Long.hashCode(kd2Var7.T);
                    al4 l11 = kd2Var7.l();
                    yz3 E11 = o80.E(kd2Var7, R2);
                    tt0.d.getClass();
                    kd2Var7.h0();
                    if (kd2Var7.S) {
                        kd2Var7.k(t53Var);
                    } else {
                        kd2Var7.q0();
                    }
                    ss5.i(st0Var6, kd2Var7, a5);
                    ss5.i(ys0Var6, kd2Var7, l11);
                    h11.q(hashCode11, kd2Var7, st0Var5, kd2Var7);
                    ss5.i(ys0Var5, kd2Var7, E11);
                    yz3 c10 = ar5.c(vz3Var5, 1.0f);
                    z75 a6 = y75.a(x97.y, pk2.I, kd2Var7, 48);
                    int hashCode12 = Long.hashCode(kd2Var7.T);
                    al4 l12 = kd2Var7.l();
                    yz3 E12 = o80.E(kd2Var7, c10);
                    kd2Var7.h0();
                    if (kd2Var7.S) {
                        kd2Var7.k(t53Var);
                    } else {
                        kd2Var7.q0();
                    }
                    ss5.i(st0Var6, kd2Var7, a6);
                    ss5.i(ys0Var6, kd2Var7, l12);
                    h11.q(hashCode12, kd2Var7, st0Var5, kd2Var7);
                    ss5.i(ys0Var5, kd2Var7, E12);
                    String f = lz5.f(R.string.whats_new, kd2Var7);
                    ob3 ob3Var2 = new ob3(1.0f, true);
                    tq1 tq1Var3 = pl6.a;
                    xd6 xd6Var2 = ((nl6) kd2Var7.j(tq1Var3)).h;
                    tq1 tq1Var4 = op0.a;
                    yc6.b(f, ob3Var2, ((mp0) kd2Var7.j(tq1Var4)).o, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, xd6Var2, kd2Var7, 0, 0, 131064);
                    String latestVersionName = appUpdateCheck.getLatestVersionName();
                    if (latestVersionName == null) {
                        latestVersionName = "";
                    }
                    yc6.b("v".concat(latestVersionName), null, ((mp0) kd2Var7.j(tq1Var4)).o, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nl6) kd2Var7.j(tq1Var3)).j, kd2Var7, 0, 0, 131066);
                    kd2Var7.q(true);
                    if (list2.isEmpty()) {
                        kd2Var7.e0(1972085272);
                        yc6.b(lz5.f(R.string.performance_improvements, kd2Var7), null, ep0.b(0.82f, ((mp0) kd2Var7.j(tq1Var4)).o), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nl6) kd2Var7.j(tq1Var3)).j, kd2Var7, 0, 0, 131066);
                        kd2Var7.q(false);
                        vz3Var = vz3Var5;
                    } else {
                        kd2Var7.e0(1972374378);
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            String str8 = (String) it3.next();
                            yz3 c11 = ar5.c(vz3Var5, 1.0f);
                            Iterator it4 = it3;
                            z75 a7 = y75.a(new vr(4.0f, true, new ze0((byte) 6)), pk2.H, kd2Var7, 54);
                            vz3 vz3Var6 = vz3Var5;
                            int hashCode13 = Long.hashCode(kd2Var7.T);
                            al4 l13 = kd2Var7.l();
                            yz3 E13 = o80.E(kd2Var7, c11);
                            tt0.d.getClass();
                            kd2Var7.h0();
                            if (kd2Var7.S) {
                                kd2Var7.k(t53Var);
                            } else {
                                kd2Var7.q0();
                            }
                            ss5.i(st0Var6, kd2Var7, a7);
                            ss5.i(ys0Var6, kd2Var7, l13);
                            h11.q(hashCode13, kd2Var7, st0Var5, kd2Var7);
                            ss5.i(ys0Var5, kd2Var7, E13);
                            tq1 tq1Var5 = pl6.a;
                            xd6 xd6Var3 = ((nl6) kd2Var7.j(tq1Var5)).k;
                            tq1 tq1Var6 = op0.a;
                            yc6.b("•", null, ep0.b(0.82f, ((mp0) kd2Var7.j(tq1Var6)).o), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, xd6Var3, kd2Var7, 6, 0, 131066);
                            yc6.b(str8, null, ep0.b(0.82f, ((mp0) kd2Var7.j(tq1Var6)).o), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nl6) kd2Var7.j(tq1Var5)).k, kd2Var7, 0, 0, 131066);
                            kd2Var7.q(true);
                            vz3Var5 = vz3Var6;
                            it3 = it4;
                        }
                        vz3Var = vz3Var5;
                        kd2Var7.q(false);
                    }
                    if (list3.size() > 2) {
                        kd2Var7.e0(1973282275);
                        if (((Boolean) w44Var2.getValue()).booleanValue()) {
                            g = h11.i(kd2Var7, 202202608, R.string.show_less, kd2Var7, false);
                        } else {
                            kd2Var7.e0(202204539);
                            g = lz5.g(R.string.more, new Object[]{Integer.valueOf(list3.size() - 2)}, kd2Var7);
                            kd2Var7.q(false);
                        }
                        long j = ((mp0) kd2Var7.j(op0.a)).o;
                        xd6 xd6Var4 = ((nl6) kd2Var7.j(pl6.a)).i;
                        boolean f2 = kd2Var7.f(w44Var2);
                        Object Q5 = kd2Var7.Q();
                        if (f2 || Q5 == q18Var) {
                            Q5 = new cf(w44Var2, (byte) 29);
                            kd2Var7.n0(Q5);
                        }
                        yc6.b(g, q23.l(vz3Var, null, null, false, null, (sb2) Q5, 28), j, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, xd6Var4, kd2Var7, 0, 0, 131064);
                        kd2Var7.q(false);
                    } else {
                        kd2Var7.e0(1973804532);
                        kd2Var7.q(false);
                    }
                    kd2Var7.q(true);
                    return pn6Var;
                }
                kd2Var7.Y();
                return pn6Var;
        }
    }

    public /* synthetic */ fj(DevProfile devProfile, Context context, sb2 sb2Var, yz3 yz3Var, int i) {
        this.x = (byte) 2;
        this.y = devProfile;
        this.A = context;
        this.z = sb2Var;
        this.B = yz3Var;
    }

    public /* synthetic */ fj(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.x = b;
        this.A = obj;
        this.y = obj2;
        this.z = obj3;
        this.B = obj4;
    }

    public /* synthetic */ fj(Object obj, Object obj2, Object obj3, Object obj4, int i, byte b) {
        this.x = b;
        this.A = obj;
        this.y = obj2;
        this.z = obj3;
        this.B = obj4;
    }

    public /* synthetic */ fj(String str, Status status, String str2, sb2 sb2Var) {
        this.x = (byte) 1;
        this.y = str;
        this.A = status;
        this.z = str2;
        this.B = sb2Var;
    }
}
