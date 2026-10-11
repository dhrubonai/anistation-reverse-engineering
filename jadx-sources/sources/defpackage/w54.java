package defpackage;

import com.anistation.model.animelist.WatchStatus;
import com.anistation.model.library.AnimeWithProgress;
import com.anistation.navigation.Route;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class w54 implements jc2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ byte x = 2;
    public final /* synthetic */ sb2 y;
    public final /* synthetic */ Object z;

    public /* synthetic */ w54(tm1 tm1Var, sb2 sb2Var, sb2 sb2Var2, ub2 ub2Var, sb2 sb2Var3) {
        this.A = tm1Var;
        this.y = sb2Var;
        this.B = sb2Var2;
        this.z = ub2Var;
        this.C = sb2Var3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        final int i;
        vr vrVar;
        int i2;
        boolean z2;
        boolean z3;
        byte b = this.x;
        Object obj4 = au0.a;
        pn6 pn6Var = pn6.a;
        boolean z4 = true;
        Object obj5 = this.C;
        Object obj6 = this.z;
        Object obj7 = this.B;
        Object obj8 = this.A;
        boolean z5 = false;
        Object[] objArr = 0;
        switch (b) {
            case 0:
                final um6 um6Var = (um6) obj8;
                wc3 wc3Var = (wc3) obj7;
                final ub2 ub2Var = (ub2) obj6;
                final ub2 ub2Var2 = (ub2) obj5;
                final p90 p90Var = (p90) obj;
                kd2 kd2Var = (kd2) obj2;
                int intValue = ((Integer) obj3).intValue();
                p90Var.getClass();
                if ((intValue & 6) == 0) {
                    if (kd2Var.f(p90Var)) {
                        i2 = 4;
                    } else {
                        i2 = 2;
                    }
                    intValue |= i2;
                }
                if ((intValue & 19) != 18) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var.V(intValue & 1, z)) {
                    final yc5 d0 = n77.d0(kd2Var);
                    WatchStatus watchStatus = um6Var.b;
                    List list = um6Var.a;
                    if (watchStatus != null) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj9 : list) {
                            if (((AnimeWithProgress) obj9).getAnime().getWatchStatus() == um6Var.b) {
                                arrayList.add(obj9);
                            }
                        }
                        list = arrayList;
                    }
                    if (vm1.b(p90Var.c(), 840.0f) >= 0 || vm1.b(p90Var.c(), 600.0f) >= 0) {
                        i = 2;
                    } else {
                        i = 1;
                    }
                    ki2 ki2Var = new ki2(i);
                    vr vrVar2 = new vr(15.0f, true, new ze0((byte) 6));
                    vr vrVar3 = new vr(15.0f, true, new ze0((byte) 6));
                    z22 z22Var = ar5.c;
                    final sb2 sb2Var = this.y;
                    boolean f = kd2Var.f(sb2Var) | kd2Var.f(d0) | kd2Var.h(um6Var) | kd2Var.f(ub2Var) | kd2Var.h(list);
                    if ((intValue & 14) != 4) {
                        z4 = false;
                    }
                    boolean d = f | z4 | kd2Var.d(i) | kd2Var.f(ub2Var2);
                    Object Q = kd2Var.Q();
                    if (!d && Q != obj4) {
                        vrVar = vrVar3;
                    } else {
                        final List list2 = list;
                        vrVar = vrVar3;
                        Object obj10 = new ub2() { // from class: y54
                            @Override // defpackage.ub2
                            public final Object invoke(Object obj11) {
                                bc3 bc3Var = (bc3) obj11;
                                bc3Var.getClass();
                                bc3.z0(bc3Var, "mylist-topbar", new p03((byte) 25), new os0(-1719564301, true, new sm0(sb2Var, (byte) 1)), 4);
                                p03 p03Var = new p03((byte) 26);
                                yc5 yc5Var = d0;
                                um6 um6Var2 = um6Var;
                                bc3.z0(bc3Var, "mylist-filters", p03Var, new os0(431165724, true, new ao(yc5Var, um6Var2, ub2Var, (byte) 6)), 4);
                                List list3 = list2;
                                if (list3.isEmpty() && !um6Var2.c) {
                                    bc3.z0(bc3Var, "mylist-empty-filter", new p03((byte) 27), new os0(169454456, true, new fr5(p90Var, (byte) 11)), 4);
                                } else {
                                    bc3Var.A0(list3.size(), new od(new wj3((byte) 7), list3, (byte) 18), new eo(list3, (byte) 11), new os0(-1942245546, true, new z54(list3, i, ub2Var2)));
                                }
                                bc3.z0(bc3Var, "mylist-spacer", null, kb0.g, 6);
                                return pn6.a;
                            }
                        };
                        kd2Var.n0(obj10);
                        Q = obj10;
                    }
                    x97.g(ki2Var, z22Var, wc3Var, null, vrVar, vrVar2, null, false, null, (ub2) Q, kd2Var, 1769520, 920);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            case 1:
                tm1 tm1Var = (tm1) obj8;
                sb2 sb2Var2 = (sb2) obj7;
                ub2 ub2Var3 = (ub2) obj6;
                sb2 sb2Var3 = (sb2) obj5;
                kd2 kd2Var2 = (kd2) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((Route.Downloads) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (kd2Var2.V(intValue2 & 1, z2)) {
                    w44 m = h98.m(tm1Var.d, kd2Var2);
                    boolean h = kd2Var2.h(tm1Var);
                    sb2 sb2Var4 = this.y;
                    boolean f2 = h | kd2Var2.f(sb2Var4);
                    Object Q2 = kd2Var2.Q();
                    if (f2 || Q2 == obj4) {
                        Q2 = new va1(tm1Var, sb2Var4, (byte) 4);
                        kd2Var2.n0(Q2);
                    }
                    sb2 sb2Var5 = (sb2) Q2;
                    pm1 pm1Var = (pm1) m.getValue();
                    boolean booleanValue = ((Boolean) sb2Var2.invoke()).booleanValue();
                    boolean h2 = kd2Var2.h(tm1Var);
                    Object Q3 = kd2Var2.Q();
                    if (h2 || Q3 == obj4) {
                        Object d0Var = new d0(1, tm1Var, tm1.class, "setSelectionMode", "setSelectionMode(Z)V", 0, (byte) 5);
                        kd2Var2.n0(d0Var);
                        Q3 = d0Var;
                    }
                    i73 i73Var = (i73) Q3;
                    boolean h3 = kd2Var2.h(tm1Var);
                    Object Q4 = kd2Var2.Q();
                    if (h3 || Q4 == obj4) {
                        Object d0Var2 = new d0(1, tm1Var, tm1.class, "toggleAnimeGroupSelection", "toggleAnimeGroupSelection(Ljava/lang/String;)V", 0, (byte) 6);
                        kd2Var2.n0(d0Var2);
                        Q4 = d0Var2;
                    }
                    i73 i73Var2 = (i73) Q4;
                    boolean h4 = kd2Var2.h(tm1Var);
                    Object Q5 = kd2Var2.Q();
                    if (h4 || Q5 == obj4) {
                        Object iaVar = new ia(0, tm1Var, tm1.class, "deleteSelectedAnime", "deleteSelectedAnime()V", 0, (byte) 11);
                        kd2Var2.n0(iaVar);
                        Q5 = iaVar;
                    }
                    i73 i73Var3 = (i73) Q5;
                    boolean h5 = kd2Var2.h(tm1Var) | kd2Var2.f(ub2Var3);
                    Object Q6 = kd2Var2.Q();
                    if (h5 || Q6 == obj4) {
                        Q6 = new fj1(tm1Var, ub2Var3, objArr == true ? 1 : 0);
                        kd2Var2.n0(Q6);
                    }
                    lm1.a(pm1Var, booleanValue, (ub2) Q6, (ub2) i73Var, (ub2) i73Var2, (sb2) i73Var3, sb2Var5, sb2Var3, null, kd2Var2, 8);
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
            case 2:
                rn2 rn2Var = (rn2) obj8;
                ub2 ub2Var4 = (ub2) obj6;
                ub2 ub2Var5 = (ub2) obj5;
                sb2 sb2Var6 = (sb2) obj7;
                kd2 kd2Var3 = (kd2) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((Route.Home) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kd2Var3.V(intValue3 & 1, z3)) {
                    w44 m2 = h98.m(rn2Var.e, kd2Var3);
                    tm6 tm6Var = (tm6) m2.getValue();
                    int i3 = ((tm6) m2.getValue()).c;
                    boolean h6 = kd2Var3.h(rn2Var);
                    Object Q7 = kd2Var3.Q();
                    if (h6 || Q7 == obj4) {
                        Object hj1Var = new hj1(2, rn2Var, rn2.class, "onGenreSelected", "onGenreSelected(Ljava/lang/String;I)V", 0, (byte) 3);
                        kd2Var3.n0(hj1Var);
                        Q7 = hj1Var;
                    }
                    ic2 ic2Var = (ic2) ((i73) Q7);
                    boolean h7 = kd2Var3.h(rn2Var);
                    Object Q8 = kd2Var3.Q();
                    if (h7 || Q8 == obj4) {
                        Object d0Var3 = new d0(1, rn2Var, rn2.class, "hideFromWatchHistory", "hideFromWatchHistory(Ljava/util/List;)V", 0, (byte) 13);
                        kd2Var3.n0(d0Var3);
                        Q8 = d0Var3;
                    }
                    ub2 ub2Var6 = (ub2) ((i73) Q8);
                    boolean h8 = kd2Var3.h(rn2Var);
                    Object Q9 = kd2Var3.Q();
                    if (h8 || Q9 == obj4) {
                        Object iaVar2 = new ia(0, rn2Var, rn2.class, "refresh", "refresh()V", 0, (byte) 16);
                        kd2Var3.n0(iaVar2);
                        Q9 = iaVar2;
                    }
                    sb2 sb2Var7 = (sb2) ((i73) Q9);
                    boolean h9 = kd2Var3.h(rn2Var);
                    Object Q10 = kd2Var3.Q();
                    if (h9 || Q10 == obj4) {
                        Object iaVar3 = new ia(0, rn2Var, rn2.class, "retry", "retry()V", 0, (byte) 17);
                        kd2Var3.n0(iaVar3);
                        Q10 = iaVar3;
                    }
                    kn2.b(tm6Var, i3, ic2Var, ub2Var4, ub2Var5, this.y, ub2Var6, sb2Var7, (sb2) ((i73) Q10), sb2Var6, null, kd2Var3, 0);
                } else {
                    kd2Var3.Y();
                }
                return pn6Var;
            case 3:
                vm6 vm6Var = (vm6) obj8;
                af3 af3Var = (af3) obj7;
                List list3 = (List) obj6;
                kc2 kc2Var = (kc2) obj5;
                boolean z6 = false;
                kd2 kd2Var4 = (kd2) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((zc3) obj).getClass();
                if ((intValue4 & 17) != 16) {
                    z6 = true;
                }
                if (kd2Var4.V(intValue4 & 1, z6)) {
                    pb5.a(vm6Var, af3Var, list3, kc2Var, this.y, kd2Var4, 8);
                } else {
                    kd2Var4.Y();
                }
                return pn6Var;
            default:
                yc5 yc5Var = (yc5) obj8;
                List list4 = (List) obj7;
                ub2 ub2Var7 = (ub2) obj6;
                WatchStatus watchStatus2 = (WatchStatus) obj5;
                kd2 kd2Var5 = (kd2) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((yp0) obj).getClass();
                if ((intValue5 & 17) != 16) {
                    z5 = true;
                }
                if (kd2Var5.V(intValue5 & 1, z5)) {
                    yz3 c = ar5.c(vz3.x, 1.0f);
                    WeakHashMap weakHashMap = z57.w;
                    l36.a(n77.U(h41.k0(c, new ch3(mv5.b(kd2Var5).e, 32)), 15.0f, 12.0f, 15.0f, 8.0f), ((cn5) kd2Var5.j(dn5.a)).d, ((mp0) kd2Var5.j(op0.a)).p, 0L, 0.0f, 0.0f, null, nx7.R(-870026928, new ni(yc5Var, list4, ub2Var7, this.y, watchStatus2), kd2Var5), kd2Var5, 12582912, 120);
                } else {
                    kd2Var5.Y();
                }
                return pn6Var;
        }
    }

    public /* synthetic */ w54(rn2 rn2Var, ub2 ub2Var, ub2 ub2Var2, sb2 sb2Var, sb2 sb2Var2) {
        this.A = rn2Var;
        this.z = ub2Var;
        this.C = ub2Var2;
        this.y = sb2Var;
        this.B = sb2Var2;
    }

    public /* synthetic */ w54(yc5 yc5Var, List list, ub2 ub2Var, sb2 sb2Var, WatchStatus watchStatus) {
        this.A = yc5Var;
        this.B = list;
        this.z = ub2Var;
        this.y = sb2Var;
        this.C = watchStatus;
    }

    public /* synthetic */ w54(um6 um6Var, wc3 wc3Var, sb2 sb2Var, ub2 ub2Var, ub2 ub2Var2) {
        this.A = um6Var;
        this.B = wc3Var;
        this.y = sb2Var;
        this.z = ub2Var;
        this.C = ub2Var2;
    }

    public /* synthetic */ w54(vm6 vm6Var, af3 af3Var, List list, kc2 kc2Var, sb2 sb2Var) {
        this.A = vm6Var;
        this.B = af3Var;
        this.z = list;
        this.C = kc2Var;
        this.y = sb2Var;
    }
}
