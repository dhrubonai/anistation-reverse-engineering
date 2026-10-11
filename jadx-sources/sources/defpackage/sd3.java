package defpackage;

import android.os.Build;
import android.view.View;
import com.anistation.android.R;
import com.anistation.model.download.DownloadAnimeGroup;
import com.anistation.model.download.DownloadAnimeGroupKt;
import com.anistation.model.settings.SubtitleStyleSettings;
import com.anistation.navigation.Route;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class sd3 implements jc2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ sd3(ic2 ic2Var, rz0 rz0Var, jc2 jc2Var, sb2 sb2Var) {
        this.x = (byte) 2;
        this.y = ic2Var;
        this.z = rz0Var;
        this.A = jc2Var;
        this.B = sb2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [ft4] */
    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        yz3 w;
        Object obj4;
        boolean z;
        boolean z2;
        wc3 wc3Var;
        boolean z3;
        boolean z4;
        boolean z5;
        tm1 tm1Var;
        Object d0Var;
        boolean h;
        int i;
        boolean z6;
        float c;
        int i2;
        Object obj5;
        byte b = this.x;
        vz3 vz3Var = vz3.x;
        vz0 vz0Var = null;
        DownloadAnimeGroup downloadAnimeGroup = null;
        int i3 = 4;
        q18 q18Var = au0.a;
        pn6 pn6Var = pn6.a;
        boolean z7 = true;
        boolean z8 = true;
        Object obj6 = this.B;
        Object obj7 = this.A;
        Object obj8 = this.z;
        Object obj9 = this.y;
        boolean z9 = false;
        switch (b) {
            case 0:
                be3 be3Var = (be3) obj9;
                yz3 yz3Var = (yz3) obj8;
                td3 td3Var = (td3) obj7;
                w44 w44Var = (w44) obj6;
                j95 j95Var = (j95) obj;
                kd2 kd2Var = (kd2) obj2;
                ((Integer) obj3).getClass();
                Object Q = kd2Var.Q();
                Object obj10 = Q;
                if (Q == q18Var) {
                    qd3 qd3Var = new qd3(j95Var, new cf(w44Var, (byte) 20));
                    kd2Var.n0(qd3Var);
                    obj10 = qd3Var;
                }
                qd3 qd3Var2 = (qd3) obj10;
                Object Q2 = kd2Var.Q();
                Object obj11 = Q2;
                if (Q2 == q18Var) {
                    w06 w06Var = new w06(new y23(qd3Var2));
                    kd2Var.n0(w06Var);
                    obj11 = w06Var;
                }
                w06 w06Var2 = (w06) obj11;
                if (be3Var != null) {
                    kd2Var.e0(1743490539);
                    kd2Var.e0(887527095);
                    String str = Build.FINGERPRINT;
                    if (str != null && str.equals("robolectric")) {
                        kd2Var.e0(1345548711);
                        Object Q3 = kd2Var.Q();
                        if (Q3 == q18Var) {
                            Q3 = new Object();
                            kd2Var.n0(Q3);
                        }
                        obj4 = (gt4) Q3;
                        z = false;
                        kd2Var.q(false);
                    } else {
                        kd2Var.e0(1345729441);
                        View view = (View) kd2Var.j(eb.f);
                        boolean f = kd2Var.f(view);
                        Object Q4 = kd2Var.Q();
                        if (f || Q4 == q18Var) {
                            Object tag = view.getTag(R.id.compose_prefetch_scheduler);
                            if (tag instanceof ft4) {
                                vz0Var = (ft4) tag;
                            }
                            if (vz0Var == null) {
                                Q4 = new ce(view);
                                view.setTag(R.id.compose_prefetch_scheduler, Q4);
                            } else {
                                Q4 = vz0Var;
                            }
                            kd2Var.n0(Q4);
                        }
                        obj4 = (ft4) Q4;
                        z = false;
                        kd2Var.q(false);
                    }
                    kd2Var.q(z);
                    Object[] objArr = {be3Var, qd3Var2, w06Var2, obj4};
                    boolean f2 = kd2Var.f(be3Var) | kd2Var.h(qd3Var2) | kd2Var.h(w06Var2) | kd2Var.h(obj4);
                    Object Q5 = kd2Var.Q();
                    if (f2 || Q5 == q18Var) {
                        gj gjVar = new gj((Object) be3Var, (Object) qd3Var2, (Object) w06Var2, obj4, (byte) 8);
                        kd2Var.n0(gjVar);
                        Q5 = gjVar;
                    }
                    db.e(objArr, (ub2) Q5, kd2Var);
                    kd2Var.q(false);
                } else {
                    kd2Var.e0(1744076749);
                    kd2Var.q(false);
                }
                int i4 = ce3.a;
                if (be3Var != null && (w = yz3Var.w(new kj6(be3Var))) != null) {
                    yz3Var = w;
                }
                boolean f3 = kd2Var.f(qd3Var2) | kd2Var.f(td3Var);
                Object Q6 = kd2Var.Q();
                Object obj12 = Q6;
                if (f3 || Q6 == q18Var) {
                    q qVar = new q(qd3Var2, td3Var, (byte) 25);
                    kd2Var.n0(qVar);
                    obj12 = qVar;
                }
                te4.m(w06Var2, yz3Var, (ic2) obj12, kd2Var, 8);
                return pn6Var;
            case 1:
                int i5 = 2;
                wc3 wc3Var2 = (wc3) obj9;
                List list = (List) obj8;
                ub2 ub2Var = (ub2) obj7;
                wm6 wm6Var = (wm6) obj6;
                p90 p90Var = (p90) obj;
                kd2 kd2Var2 = (kd2) obj2;
                int intValue = ((Integer) obj3).intValue();
                p90Var.getClass();
                if ((intValue & 6) == 0) {
                    if (!kd2Var2.f(p90Var)) {
                        i3 = 2;
                    }
                    intValue |= i3;
                }
                if ((intValue & 19) != 18) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (kd2Var2.V(intValue & 1, z2)) {
                    if (vm1.b(p90Var.c(), 840.0f) >= 0 || vm1.b(p90Var.c(), 600.0f) >= 0) {
                        wc3Var = wc3Var2;
                    } else {
                        wc3Var = wc3Var2;
                        i5 = 1;
                    }
                    ki2 ki2Var = new ki2(i5);
                    vh4 j = n77.j(0.0f, 15.0f, 1);
                    vr vrVar = new vr(15.0f, true, new ze0((byte) 6));
                    vr vrVar2 = new vr(15.0f, true, new ze0((byte) 6));
                    wc3 wc3Var3 = wc3Var;
                    z22 z22Var = ar5.c;
                    boolean h2 = kd2Var2.h(list) | kd2Var2.f(ub2Var) | kd2Var2.h(wm6Var);
                    Object Q7 = kd2Var2.Q();
                    if (h2 || Q7 == q18Var) {
                        Q7 = new bg((Object) list, (Object) wm6Var, (Object) ub2Var, (byte) 23);
                        kd2Var2.n0(Q7);
                    }
                    x97.g(ki2Var, z22Var, wc3Var3, j, vrVar2, vrVar, null, false, null, (ub2) Q7, kd2Var2, 1772592, 912);
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
            case 2:
                ic2 ic2Var = (ic2) obj9;
                rz0 rz0Var = (rz0) obj8;
                jc2 jc2Var = (jc2) obj7;
                sb2 sb2Var = (sb2) obj6;
                qz0 qz0Var = (qz0) obj;
                kd2 kd2Var3 = (kd2) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    if (!kd2Var3.f(qz0Var)) {
                        i3 = 2;
                    }
                    intValue2 |= i3;
                }
                if ((intValue2 & 19) == 18) {
                    z7 = false;
                }
                if (kd2Var3.V(intValue2 & 1, z7)) {
                    String str2 = (String) ic2Var.invoke(kd2Var3, 0);
                    if (uz5.V(str2)) {
                        hz2.c("Label must not be blank");
                    }
                    rz0Var.getClass();
                    n77.c.f(str2, Boolean.TRUE, qz0Var, jc2Var, sb2Var, kd2Var3, Integer.valueOf((intValue2 << 9) & 7168));
                } else {
                    kd2Var3.Y();
                }
                return pn6Var;
            case 3:
                List list2 = (List) obj9;
                ub2 ub2Var2 = (ub2) obj8;
                w44 w44Var2 = (w44) obj6;
                w44 w44Var3 = (w44) obj7;
                p90 p90Var2 = (p90) obj;
                kd2 kd2Var4 = (kd2) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                p90Var2.getClass();
                if ((intValue3 & 6) == 0) {
                    if (!kd2Var4.f(p90Var2)) {
                        i3 = 2;
                    }
                    intValue3 |= i3;
                }
                if ((intValue3 & 19) != 18) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kd2Var4.V(intValue3 & 1, z3)) {
                    float f4 = 180.0f;
                    if (vm1.b(p90Var2.c(), 840.0f) < 0 && vm1.b(p90Var2.c(), 600.0f) < 0) {
                        f4 = ((p90Var2.c() - 24.0f) - 12.0f) / 2.0f;
                    }
                    vh4 j2 = n77.j(12.0f, 0.0f, 2);
                    vr vrVar3 = new vr(12.0f, true, new ze0((byte) 6));
                    x50 x50Var = pk2.H;
                    boolean h3 = kd2Var4.h(list2) | kd2Var4.c(f4) | kd2Var4.f(ub2Var2);
                    Object Q8 = kd2Var4.Q();
                    if (h3 || Q8 == q18Var) {
                        e01 e01Var = new e01(list2, f4, ub2Var2, w44Var2, w44Var3);
                        kd2Var4.n0(e01Var);
                        Q8 = e01Var;
                    }
                    n77.i(null, null, j2, vrVar3, x50Var, null, false, null, (ub2) Q8, kd2Var4, 221568, 459);
                } else {
                    kd2Var4.Y();
                }
                return pn6Var;
            case 4:
                tm1 tm1Var2 = (tm1) obj9;
                sb2 sb2Var2 = (sb2) obj8;
                ub2 ub2Var3 = (ub2) obj7;
                sb2 sb2Var3 = (sb2) obj6;
                Route.DownloadList downloadList = (Route.DownloadList) obj;
                kd2 kd2Var5 = (kd2) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                downloadList.getClass();
                if ((intValue4 & 6) == 0) {
                    if ((intValue4 & 8) == 0) {
                        h = kd2Var5.f(downloadList);
                    } else {
                        h = kd2Var5.h(downloadList);
                    }
                    if (h) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue4 |= i;
                }
                if ((intValue4 & 19) != 18) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (kd2Var5.V(intValue4 & 1, z4)) {
                    w44 m = h98.m(tm1Var2.d, kd2Var5);
                    String animeId = downloadList.getAnimeId();
                    Integer anilistId = downloadList.getAnilistId();
                    boolean h4 = kd2Var5.h(tm1Var2);
                    if ((intValue4 & 14) != 4 && ((intValue4 & 8) == 0 || !kd2Var5.h(downloadList))) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    boolean z10 = z5 | h4;
                    Object Q9 = kd2Var5.Q();
                    if (z10 || Q9 == q18Var) {
                        Q9 = new gj1(tm1Var2, downloadList, null);
                        kd2Var5.n0(Q9);
                    }
                    db.g(animeId, anilistId, (ic2) Q9, kd2Var5);
                    pm1 pm1Var = (pm1) m.getValue();
                    Iterator it = pm1Var.a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            ?? next = it.next();
                            if (a34.i(((DownloadAnimeGroup) next).getAnimeId(), pm1Var.b)) {
                                downloadAnimeGroup = next;
                            }
                        }
                    }
                    DownloadAnimeGroup downloadAnimeGroup2 = downloadAnimeGroup;
                    if (downloadAnimeGroup2 == null) {
                        downloadAnimeGroup2 = DownloadAnimeGroupKt.findDownloadGroup(((pm1) m.getValue()).a, downloadList.getAnimeId(), downloadList.getAnilistId());
                    }
                    DownloadAnimeGroup downloadAnimeGroup3 = downloadAnimeGroup2;
                    List list3 = ((pm1) m.getValue()).e;
                    boolean booleanValue = ((Boolean) sb2Var2.invoke()).booleanValue();
                    boolean h5 = kd2Var5.h(tm1Var2) | kd2Var5.f(ub2Var3);
                    Object Q10 = kd2Var5.Q();
                    if (h5 || Q10 == q18Var) {
                        Q10 = new fj1(tm1Var2, ub2Var3, true ? (byte) 1 : (byte) 0);
                        kd2Var5.n0(Q10);
                    }
                    ub2 ub2Var4 = (ub2) Q10;
                    boolean h6 = kd2Var5.h(tm1Var2);
                    Object Q11 = kd2Var5.Q();
                    if (h6 || Q11 == q18Var) {
                        tm1Var = tm1Var2;
                        d0Var = new d0(1, tm1Var, tm1.class, "cancelDownload", "cancelDownload(Ljava/lang/String;)V", 0, (byte) 7);
                        kd2Var5.n0(d0Var);
                    } else {
                        tm1Var = tm1Var2;
                        d0Var = Q11;
                    }
                    ub2 ub2Var5 = (ub2) ((i73) d0Var);
                    boolean h7 = kd2Var5.h(tm1Var);
                    Object Q12 = kd2Var5.Q();
                    if (h7 || Q12 == q18Var) {
                        hj1 hj1Var = new hj1(2, tm1Var, tm1.class, "setDownloadPaused", "setDownloadPaused(Ljava/lang/String;Z)V", 0, (byte) 0);
                        kd2Var5.n0(hj1Var);
                        Q12 = hj1Var;
                    }
                    ic2 ic2Var2 = (ic2) ((i73) Q12);
                    boolean h8 = kd2Var5.h(tm1Var);
                    Object Q13 = kd2Var5.Q();
                    if (h8 || Q13 == q18Var) {
                        d0 d0Var2 = new d0(1, tm1Var, tm1.class, "deleteEpisodes", "deleteEpisodes(Ljava/util/List;)V", 0, (byte) 8);
                        kd2Var5.n0(d0Var2);
                        Q13 = d0Var2;
                    }
                    dk1.d(downloadAnimeGroup3, list3, booleanValue, ub2Var4, ub2Var5, ic2Var2, (ub2) ((i73) Q13), sb2Var3, kd2Var5, 0);
                } else {
                    kd2Var5.Y();
                }
                return pn6Var;
            case 5:
                pm1 pm1Var2 = (pm1) obj9;
                ub2 ub2Var6 = (ub2) obj8;
                sb2 sb2Var4 = (sb2) obj7;
                w44 w44Var4 = (w44) obj6;
                kd2 kd2Var6 = (kd2) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((fc3) obj).getClass();
                if ((intValue5 & 17) != 16) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (kd2Var6.V(intValue5 & 1, z6)) {
                    boolean z11 = pm1Var2.c;
                    boolean z12 = !pm1Var2.d.isEmpty();
                    boolean z13 = !pm1Var2.a.isEmpty();
                    boolean f5 = kd2Var6.f(ub2Var6) | kd2Var6.h(pm1Var2);
                    Object Q14 = kd2Var6.Q();
                    if (f5 || Q14 == q18Var) {
                        Q14 = new hm1(ub2Var6, pm1Var2, (byte) 0);
                        kd2Var6.n0(Q14);
                    }
                    sb2 sb2Var5 = (sb2) Q14;
                    Object Q15 = kd2Var6.Q();
                    if (Q15 == q18Var) {
                        Q15 = new cf(w44Var4, (byte) 17);
                        kd2Var6.n0(Q15);
                    }
                    om1.a(z11, z12, z13, null, sb2Var5, (sb2) Q15, sb2Var4, kd2Var6, 196608);
                } else {
                    kd2Var6.Y();
                }
                return pn6Var;
            case 6:
                tm6 tm6Var = (tm6) obj9;
                ub2 ub2Var7 = (ub2) obj8;
                ub2 ub2Var8 = (ub2) obj7;
                sb2 sb2Var6 = (sb2) obj6;
                kd2 kd2Var7 = (kd2) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((fc3) obj).getClass();
                if ((intValue6 & 17) != 16) {
                    z9 = true;
                }
                if (kd2Var7.V(intValue6 & 1, z9)) {
                    List D0 = yo0.D0(tm6Var.e, 20);
                    boolean f6 = kd2Var7.f(ub2Var7);
                    Object Q16 = kd2Var7.Q();
                    if (f6 || Q16 == q18Var) {
                        Q16 = new wi(ub2Var7, (byte) 5);
                        kd2Var7.n0(Q16);
                    }
                    w65.h(null, D0, (ub2) Q16, ub2Var8, sb2Var6, kd2Var7, 0, 1);
                } else {
                    kd2Var7.Y();
                }
                return pn6Var;
            case 7:
                vm1 vm1Var = (vm1) obj9;
                xh4 xh4Var = (xh4) obj8;
                List list4 = (List) obj7;
                SubtitleStyleSettings subtitleStyleSettings = (SubtitleStyleSettings) obj6;
                p90 p90Var3 = (p90) obj;
                kd2 kd2Var8 = (kd2) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                p90Var3.getClass();
                if ((intValue7 & 6) == 0) {
                    if (kd2Var8.f(p90Var3)) {
                        i2 = 4;
                    } else {
                        i2 = 2;
                    }
                    intValue7 |= i2;
                }
                if ((intValue7 & 19) != 18) {
                    z9 = true;
                }
                if (kd2Var8.V(intValue7 & 1, z9)) {
                    if (vm1Var != null) {
                        float f7 = vm1Var.x;
                        vm1 vm1Var2 = new vm1(p90Var3.c());
                        vm1 vm1Var3 = new vm1(f7 * 1.7777778f);
                        if (vm1Var2.compareTo(vm1Var3) > 0) {
                            vm1Var2 = vm1Var3;
                        }
                        c = vm1Var2.x;
                    } else {
                        c = p90Var3.c();
                    }
                    h26.c(xh4Var, list4, subtitleStyleSettings, ar5.l(vz3Var, c), kd2Var8, 8);
                } else {
                    kd2Var8.Y();
                }
                return pn6Var;
            default:
                su5 su5Var = (su5) obj9;
                uf3 uf3Var = (uf3) obj8;
                mc6 mc6Var = (mc6) obj7;
                h12 h12Var = (h12) obj6;
                yz3 yz3Var2 = (yz3) obj;
                kd2 kd2Var9 = (kd2) obj2;
                ((Integer) obj3).getClass();
                kd2Var9.e0(-84507373);
                boolean booleanValue2 = ((Boolean) kd2Var9.j(bv0.y)).booleanValue();
                boolean g = kd2Var9.g(booleanValue2);
                Object Q17 = kd2Var9.Q();
                if (g || Q17 == q18Var) {
                    Q17 = new j31(booleanValue2);
                    kd2Var9.n0(Q17);
                }
                j31 j31Var = (j31) Q17;
                if (su5Var.a == 16) {
                    z8 = false;
                }
                if (((lf3) ((r47) kd2Var9.j(bv0.u))).a() && uf3Var.b() && nd6.d(mc6Var.b) && z8) {
                    kd2Var9.e0(-707487962);
                    ko koVar = mc6Var.a;
                    nd6 nd6Var = new nd6(mc6Var.b);
                    boolean h9 = kd2Var9.h(j31Var);
                    Object Q18 = kd2Var9.Q();
                    if (h9 || Q18 == q18Var) {
                        Q18 = new hu1(j31Var, vz0Var, (byte) 26);
                        kd2Var9.n0(Q18);
                    }
                    db.g(koVar, nd6Var, (ic2) Q18, kd2Var9);
                    boolean h10 = kd2Var9.h(j31Var) | kd2Var9.h(h12Var) | kd2Var9.f(mc6Var) | kd2Var9.h(uf3Var) | kd2Var9.f(su5Var);
                    Object Q19 = kd2Var9.Q();
                    if (h10 || Q19 == q18Var) {
                        Q19 = new g5(j31Var, h12Var, mc6Var, uf3Var, su5Var, (byte) 8);
                        kd2Var9.n0(Q19);
                    }
                    Object y = nx7.y(yz3Var2, (ub2) Q19);
                    kd2Var9.q(false);
                    obj5 = y;
                } else {
                    kd2Var9.e0(-705473241);
                    kd2Var9.q(false);
                    obj5 = vz3Var;
                }
                kd2Var9.q(false);
                return obj5;
        }
    }

    public /* synthetic */ sd3(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.x = b;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
        this.B = obj4;
    }

    public /* synthetic */ sd3(List list, ub2 ub2Var, w44 w44Var, w44 w44Var2) {
        this.x = (byte) 3;
        this.y = list;
        this.z = ub2Var;
        this.B = w44Var;
        this.A = w44Var2;
    }
}
