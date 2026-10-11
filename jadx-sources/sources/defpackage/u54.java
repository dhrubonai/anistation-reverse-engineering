package defpackage;

import com.anistation.android.R;
import com.anistation.navigation.Route;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class u54 implements jc2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ ub2 y;
    public final /* synthetic */ sb2 z;

    public /* synthetic */ u54(sb2 sb2Var, ub2 ub2Var) {
        this.x = (byte) 3;
        this.z = sb2Var;
        this.y = ub2Var;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.x;
        ub2 ub2Var = this.y;
        boolean z = false;
        pn6 pn6Var = pn6.a;
        q18 q18Var = au0.a;
        vz0 vz0Var = null;
        switch (b) {
            case 0:
                kd2 kd2Var = (kd2) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((Route.MyList) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                }
                if (kd2Var.V(intValue & 1, z)) {
                    ew6 a = dk3.a(kd2Var);
                    if (a != null) {
                        b64 b64Var = (b64) h98.S(z05.a(b64.class), a.getViewModelStore(), null, zz.v(a), x83.a(kd2Var), null);
                        um6 um6Var = (um6) h98.m(b64Var.c, kd2Var).getValue();
                        boolean h = kd2Var.h(b64Var);
                        Object Q = kd2Var.Q();
                        if (h || Q == q18Var) {
                            Q = new d0(1, b64Var, b64.class, "setWatchStatus", "setWatchStatus(Lcom/anistation/model/animelist/WatchStatus;)V", 0, (byte) 16);
                            kd2Var.n0(Q);
                        }
                        a64.a(um6Var, (ub2) ((i73) Q), this.y, this.z, null, kd2Var, 8);
                        return pn6Var;
                    }
                    ze0.m("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                kd2Var.Y();
                return pn6Var;
            case 1:
                kd2 kd2Var2 = (kd2) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((Route.Schedule) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z = true;
                }
                if (kd2Var2.V(intValue2 & 1, z)) {
                    ew6 a2 = dk3.a(kd2Var2);
                    if (a2 != null) {
                        Class<sb5> cls = sb5.class;
                        sb5 sb5Var = (sb5) h98.S(z05.a(sb5.class), a2.getViewModelStore(), null, zz.v(a2), x83.a(kd2Var2), null);
                        vm6 vm6Var = (vm6) h98.m(sb5Var.c, kd2Var2).getValue();
                        boolean h2 = kd2Var2.h(sb5Var);
                        Object Q2 = kd2Var2.Q();
                        if (h2 || Q2 == q18Var) {
                            pe1 pe1Var = new pe1(4, sb5Var, cls, "onDateSelected", "onDateSelected(Ljava/time/LocalDate;JJLjava/lang/String;)V", 0, (byte) 1);
                            kd2Var2.n0(pe1Var);
                            Q2 = pe1Var;
                        }
                        kc2 kc2Var = (kc2) ((i73) Q2);
                        boolean h3 = kd2Var2.h(sb5Var);
                        Object Q3 = kd2Var2.Q();
                        if (h3 || Q3 == q18Var) {
                            ia iaVar = new ia(0, sb5Var, cls, "retry", "retry()V", 0, (byte) 19);
                            kd2Var2.n0(iaVar);
                            Q3 = iaVar;
                        }
                        pb5.b(vm6Var, kc2Var, this.y, this.z, (sb2) ((i73) Q3), null, kd2Var2, 8);
                        return pn6Var;
                    }
                    ze0.m("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                kd2Var2.Y();
                return pn6Var;
            case 2:
                kd2 kd2Var3 = (kd2) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((Route.Search) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z = true;
                }
                if (kd2Var3.V(intValue3 & 1, z)) {
                    ew6 a3 = dk3.a(kd2Var3);
                    if (a3 != null) {
                        Class<af5> cls2 = af5.class;
                        af5 af5Var = (af5) h98.S(z05.a(af5.class), a3.getViewModelStore(), null, zz.v(a3), x83.a(kd2Var3), null);
                        w44 m = h98.m(af5Var.e, kd2Var3);
                        String f = lz5.f(R.string.search_history_update_error, kd2Var3);
                        boolean h4 = kd2Var3.h(af5Var) | kd2Var3.f(f);
                        Object Q4 = kd2Var3.Q();
                        if (h4 || Q4 == q18Var) {
                            Q4 = new e52(af5Var, f, vz0Var, (byte) 19);
                            kd2Var3.n0(Q4);
                        }
                        db.g(af5Var, f, (ic2) Q4, kd2Var3);
                        wm6 wm6Var = (wm6) m.getValue();
                        boolean h5 = kd2Var3.h(af5Var);
                        Object Q5 = kd2Var3.Q();
                        if (h5 || Q5 == q18Var) {
                            Q5 = new d0(1, af5Var, af5.class, "setQuery", "setQuery(Ljava/lang/String;)V", 0, (byte) 18);
                            kd2Var3.n0(Q5);
                        }
                        ub2 ub2Var2 = (ub2) ((i73) Q5);
                        boolean h6 = kd2Var3.h(af5Var);
                        Object Q6 = kd2Var3.Q();
                        if (h6 || Q6 == q18Var) {
                            Q6 = new ia(0, af5Var, cls2, "clearQuery", "clearQuery()V", 0, (byte) 20);
                            kd2Var3.n0(Q6);
                        }
                        sb2 sb2Var = (sb2) ((i73) Q6);
                        boolean h7 = kd2Var3.h(af5Var);
                        Object Q7 = kd2Var3.Q();
                        if (h7 || Q7 == q18Var) {
                            Q7 = new d0(1, af5Var, af5.class, "onSearchTriggered", "onSearchTriggered(Ljava/lang/String;)V", 0, (byte) 19);
                            kd2Var3.n0(Q7);
                        }
                        ub2 ub2Var3 = (ub2) ((i73) Q7);
                        boolean h8 = kd2Var3.h(af5Var);
                        Object Q8 = kd2Var3.Q();
                        if (h8 || Q8 == q18Var) {
                            Q8 = new d0(1, af5Var, af5.class, "searchHistoryQuery", "searchHistoryQuery(Ljava/lang/String;)V", 0, (byte) 20);
                            kd2Var3.n0(Q8);
                        }
                        ub2 ub2Var4 = (ub2) ((i73) Q8);
                        boolean h9 = kd2Var3.h(af5Var);
                        Object Q9 = kd2Var3.Q();
                        if (h9 || Q9 == q18Var) {
                            Q9 = new d0(1, af5Var, af5.class, "removeHistoryQuery", "removeHistoryQuery(Ljava/lang/String;)V", 0, (byte) 21);
                            kd2Var3.n0(Q9);
                        }
                        ub2 ub2Var5 = (ub2) ((i73) Q9);
                        boolean h10 = kd2Var3.h(af5Var);
                        Object Q10 = kd2Var3.Q();
                        if (h10 || Q10 == q18Var) {
                            Q10 = new ia(0, af5Var, cls2, "loadMore", "loadMore()V", 0, (byte) 21);
                            kd2Var3.n0(Q10);
                        }
                        sb2 sb2Var2 = (sb2) ((i73) Q10);
                        boolean h11 = kd2Var3.h(af5Var);
                        Object Q11 = kd2Var3.Q();
                        if (h11 || Q11 == q18Var) {
                            Q11 = new ia(0, af5Var, cls2, "retry", "retry()V", 0, (byte) 22);
                            kd2Var3.n0(Q11);
                        }
                        sb2 sb2Var3 = (sb2) ((i73) Q11);
                        boolean h12 = kd2Var3.h(af5Var) | kd2Var3.f(ub2Var);
                        Object Q12 = kd2Var3.Q();
                        if (h12 || Q12 == q18Var) {
                            Q12 = new r82(af5Var, ub2Var, (byte) 29);
                            kd2Var3.n0(Q12);
                        }
                        jf7.d(wm6Var, ub2Var2, sb2Var, ub2Var3, ub2Var4, ub2Var5, sb2Var2, sb2Var3, (ub2) Q12, this.z, kd2Var3, 8);
                        return pn6Var;
                    }
                    ze0.m("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                kd2Var3.Y();
                return pn6Var;
            default:
                kd2 kd2Var4 = (kd2) obj2;
                ((Integer) obj3).getClass();
                kd2Var4.e0(759876635);
                Object Q13 = kd2Var4.Q();
                if (Q13 == q18Var) {
                    Q13 = ut5.b(this.z);
                    kd2Var4.n0(Q13);
                }
                px5 px5Var = (px5) Q13;
                Object Q14 = kd2Var4.Q();
                if (Q14 == q18Var) {
                    xc4 xc4Var = (xc4) px5Var.getValue();
                    long j = xc4Var.a;
                    Q14 = new wj(xc4Var, kh5.b, new xc4(kh5.c), 8);
                    kd2Var4.n0(Q14);
                }
                wj wjVar = (wj) Q14;
                boolean h13 = kd2Var4.h(wjVar);
                Object Q15 = kd2Var4.Q();
                if (h13 || Q15 == q18Var) {
                    Q15 = new e05(px5Var, wjVar, (vz0) null, (byte) 5);
                    kd2Var4.n0(Q15);
                }
                db.f((ic2) Q15, kd2Var4, pn6Var);
                ml mlVar = wjVar.c;
                boolean f2 = kd2Var4.f(mlVar);
                Object Q16 = kd2Var4.Q();
                if (f2 || Q16 == q18Var) {
                    Q16 = new ci(mlVar, (byte) 1);
                    kd2Var4.n0(Q16);
                }
                yz3 yz3Var = (yz3) ub2Var.invoke((sb2) Q16);
                kd2Var4.q(false);
                return yz3Var;
        }
    }

    public /* synthetic */ u54(ub2 ub2Var, sb2 sb2Var, byte b) {
        this.x = b;
        this.y = ub2Var;
        this.z = sb2Var;
    }
}
