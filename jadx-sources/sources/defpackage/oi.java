package defpackage;

import com.anistation.model.settings.SubtitleStyleSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class oi implements jc2 {
    public final /* synthetic */ List A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ byte x = 0;
    public final /* synthetic */ Object y;
    public final /* synthetic */ w44 z;

    public /* synthetic */ oi(xh4 xh4Var, List list, af3 af3Var, ub2 ub2Var, sb2 sb2Var, w44 w44Var) {
        this.y = xh4Var;
        this.A = list;
        this.B = af3Var;
        this.C = ub2Var;
        this.D = sb2Var;
        this.z = w44Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v36, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v37, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v44, types: [java.util.ArrayList] */
    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        ys0 ys0Var;
        st0 st0Var;
        Iterator it;
        long j;
        boolean z2;
        Object obj4;
        ?? f0;
        boolean z3;
        boolean z4;
        vm1 vm1Var;
        int i;
        byte b = this.x;
        List list = this.A;
        final w44 w44Var = this.z;
        Object obj5 = this.y;
        pn6 pn6Var = pn6.a;
        q18 q18Var = au0.a;
        Object obj6 = this.D;
        Object obj7 = this.C;
        Object obj8 = this.B;
        final byte b2 = 1;
        final byte b3 = 0;
        switch (b) {
            case 0:
                ys0 ys0Var2 = p7.D;
                st0 st0Var2 = p7.G;
                ys0 ys0Var3 = p7.E;
                st0 st0Var3 = p7.F;
                om5 om5Var = (om5) obj8;
                ub2 ub2Var = (ub2) obj7;
                ub2 ub2Var2 = (ub2) obj6;
                kd2 kd2Var = (kd2) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((yp0) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var.V(intValue & 1, z)) {
                    vz3 vz3Var = vz3.x;
                    yz3 k0 = n77.k0(ar5.g(n77.T(vz3Var, 8.0f, 0.0f, 2), 0.0f, 280.0f, 1), n77.d0(kd2Var), 14);
                    xp0 a = vp0.a(x97.z, pk2.K, kd2Var, 0);
                    int hashCode = Long.hashCode(kd2Var.T);
                    al4 l = kd2Var.l();
                    yz3 E = o80.E(kd2Var, k0);
                    tt0.d.getClass();
                    kd2Var.h0();
                    boolean z5 = kd2Var.S;
                    t53 t53Var = za3.p0;
                    if (z5) {
                        kd2Var.k(t53Var);
                    } else {
                        kd2Var.q0();
                    }
                    ss5.i(st0Var3, kd2Var, a);
                    ss5.i(ys0Var3, kd2Var, l);
                    ss5.i(st0Var2, kd2Var, Integer.valueOf(hashCode));
                    ss5.h(kd2Var);
                    ss5.i(ys0Var2, kd2Var, E);
                    kd2Var.e0(-1274384459);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (a34.i(next, obj5)) {
                            it = it2;
                            kd2Var.e0(-193990522);
                            ys0Var = ys0Var2;
                            st0Var = st0Var2;
                            j = ep0.b(0.12f, ((mp0) kd2Var.j(op0.a)).o);
                            kd2Var.q(false);
                        } else {
                            ys0Var = ys0Var2;
                            st0Var = st0Var2;
                            it = it2;
                            kd2Var.e0(-193880689);
                            kd2Var.q(false);
                            j = ep0.h;
                        }
                        yz3 h = bx7.h(ar5.c(vz3Var, 1.0f), j, om5Var);
                        boolean f = kd2Var.f(ub2Var) | kd2Var.h(next);
                        Object Q = kd2Var.Q();
                        if (f || Q == q18Var) {
                            Q = new mi((Object) ub2Var, next, (Object) w44Var, (byte) 0);
                            kd2Var.n0(Q);
                        }
                        kd2 kd2Var2 = kd2Var;
                        yz3 S = n77.S(kb0.A(h, false, null, null, false, (sb2) Q, kd2Var2, 0, 31), 12.0f, 10.0f);
                        vo3 c = b90.c(pk2.B, false);
                        w44 w44Var2 = w44Var;
                        Object obj9 = obj5;
                        int hashCode2 = Long.hashCode(kd2Var2.T);
                        al4 l2 = kd2Var2.l();
                        yz3 E2 = o80.E(kd2Var2, S);
                        tt0.d.getClass();
                        kd2Var2.h0();
                        if (kd2Var2.S) {
                            kd2Var2.k(t53Var);
                        } else {
                            kd2Var2.q0();
                        }
                        ss5.i(st0Var3, kd2Var2, c);
                        ss5.i(ys0Var3, kd2Var2, l2);
                        Integer valueOf = Integer.valueOf(hashCode2);
                        st0 st0Var4 = st0Var;
                        ss5.i(st0Var4, kd2Var2, valueOf);
                        ss5.h(kd2Var2);
                        ys0 ys0Var4 = ys0Var;
                        ss5.i(ys0Var4, kd2Var2, E2);
                        yc6.b((String) ub2Var2.invoke(next), null, ((mp0) kd2Var2.j(op0.a)).o, 0L, s92.C, null, 0L, null, 0L, 0, false, 0, 0, ((nl6) kd2Var2.j(pl6.a)).k, kd2Var2, 0, 0, 131002);
                        kd2Var2.q(true);
                        ys0Var2 = ys0Var4;
                        obj5 = obj9;
                        it2 = it;
                        kd2Var = kd2Var2;
                        st0Var2 = st0Var4;
                        w44Var = w44Var2;
                    }
                    kd2 kd2Var3 = kd2Var;
                    kd2Var3.q(false);
                    kd2Var3.q(true);
                    return pn6Var;
                }
                kd2Var.Y();
                return pn6Var;
            case 1:
                Set set = (Set) obj8;
                Set set2 = (Set) obj7;
                j74 j74Var = (j74) obj6;
                kd2 kd2Var4 = (kd2) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (kd2Var4.V(intValue2 & 1, z2)) {
                    boolean h2 = kd2Var4.h(set);
                    Object obj10 = this.y;
                    boolean h3 = h2 | kd2Var4.h(obj10) | kd2Var4.h(set2);
                    w44 w44Var3 = this.z;
                    boolean f2 = h3 | kd2Var4.f(w44Var3);
                    Object Q2 = kd2Var4.Q();
                    if (!f2 && Q2 != q18Var) {
                        obj4 = obj10;
                    } else {
                        obj4 = obj10;
                        Q2 = new gj((Object) set, obj4, (Object) set2, (Object) w44Var3, (byte) 4);
                        kd2Var4.n0(Q2);
                    }
                    db.c(obj4, (ub2) Q2, kd2Var4);
                    kd2Var4.e0(358947325);
                    if (list instanceof RandomAccess) {
                        q44 q44Var = new q44(list.size());
                        f0 = new ArrayList(list.size());
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            Object obj11 = list.get(i2);
                            if (q44Var.a(obj11)) {
                                f0.add(obj11);
                            }
                        }
                    } else {
                        f0 = yo0.f0(list);
                    }
                    if (!f0.isEmpty()) {
                        ListIterator listIterator = f0.listIterator(f0.size());
                        while (listIterator.hasPrevious()) {
                            j74Var = new j74(j74Var, nx7.R(-330823412, new h((k74) listIterator.previous(), j74Var, (byte) 4), kd2Var4));
                        }
                    }
                    kd2Var4.q(false);
                    j74Var.a(0, kd2Var4);
                } else {
                    kd2Var4.Y();
                }
                return pn6Var;
            default:
                xh4 xh4Var = (xh4) obj5;
                af3 af3Var = (af3) obj8;
                final ub2 ub2Var3 = (ub2) obj7;
                sb2 sb2Var = (sb2) obj6;
                p90 p90Var = (p90) obj;
                kd2 kd2Var5 = (kd2) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                p90Var.getClass();
                if ((intValue3 & 6) == 0) {
                    if (kd2Var5.f(p90Var)) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue3 |= i;
                }
                if ((intValue3 & 19) != 18) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kd2Var5.V(intValue3 & 1, z3)) {
                    if (vm1.b(p90Var.c(), p90Var.b()) > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    List list2 = this.A;
                    if (z4 && vm1.b(p90Var.c(), 600.0f) >= 0) {
                        kd2Var5.e0(-1810055595);
                        SubtitleStyleSettings subtitleStyleSettings = (SubtitleStyleSettings) w44Var.getValue();
                        Object Q3 = kd2Var5.Q();
                        if (Q3 == q18Var) {
                            Q3 = new zj1(w44Var, (byte) 2);
                            kd2Var5.n0(Q3);
                        }
                        ub2 ub2Var4 = (ub2) ((i73) Q3);
                        boolean f3 = kd2Var5.f(ub2Var3);
                        Object Q4 = kd2Var5.Q();
                        if (f3 || Q4 == q18Var) {
                            Q4 = new f26((byte) 0, ub2Var3, w44Var);
                            kd2Var5.n0(Q4);
                        }
                        ub2 ub2Var5 = (ub2) ((i73) Q4);
                        boolean f4 = kd2Var5.f(ub2Var3);
                        Object Q5 = kd2Var5.Q();
                        if (f4 || Q5 == q18Var) {
                            Q5 = new sb2() { // from class: e26
                                @Override // defpackage.sb2
                                public final Object invoke() {
                                    byte b4 = b3;
                                    pn6 pn6Var2 = pn6.a;
                                    ub2 ub2Var6 = ub2Var3;
                                    w44 w44Var4 = w44Var;
                                    switch (b4) {
                                        case 0:
                                            SubtitleStyleSettings normalized = ((SubtitleStyleSettings) w44Var4.getValue()).normalized();
                                            w44Var4.setValue(normalized);
                                            ub2Var6.invoke(normalized);
                                            return pn6Var2;
                                        default:
                                            SubtitleStyleSettings normalized2 = ((SubtitleStyleSettings) w44Var4.getValue()).normalized();
                                            w44Var4.setValue(normalized2);
                                            ub2Var6.invoke(normalized2);
                                            return pn6Var2;
                                    }
                                }
                            };
                            kd2Var5.n0(Q5);
                        }
                        sb2 sb2Var2 = (sb2) Q5;
                        boolean f5 = kd2Var5.f(sb2Var);
                        Object Q6 = kd2Var5.Q();
                        if (f5 || Q6 == q18Var) {
                            Q6 = new o10(sb2Var, w44Var, (byte) 3);
                            kd2Var5.n0(Q6);
                        }
                        h26.f(xh4Var, list2, subtitleStyleSettings, af3Var, ub2Var4, ub2Var5, sb2Var2, (sb2) Q6, kd2Var5, 24584);
                        kd2Var5.q(false);
                    } else {
                        kd2Var5.e0(-1809480018);
                        if (z4) {
                            vm1Var = new vm1(p90Var.b() * 0.42f);
                        } else {
                            vm1Var = null;
                        }
                        vm1 vm1Var2 = vm1Var;
                        SubtitleStyleSettings subtitleStyleSettings2 = (SubtitleStyleSettings) w44Var.getValue();
                        Object Q7 = kd2Var5.Q();
                        if (Q7 == q18Var) {
                            Q7 = new zj1(w44Var, (byte) 3);
                            kd2Var5.n0(Q7);
                        }
                        ub2 ub2Var6 = (ub2) ((i73) Q7);
                        boolean f6 = kd2Var5.f(ub2Var3);
                        Object Q8 = kd2Var5.Q();
                        if (f6 || Q8 == q18Var) {
                            Q8 = new f26((byte) 1, ub2Var3, w44Var);
                            kd2Var5.n0(Q8);
                        }
                        ub2 ub2Var7 = (ub2) ((i73) Q8);
                        boolean f7 = kd2Var5.f(ub2Var3);
                        Object Q9 = kd2Var5.Q();
                        if (f7 || Q9 == q18Var) {
                            Q9 = new sb2() { // from class: e26
                                @Override // defpackage.sb2
                                public final Object invoke() {
                                    byte b4 = b2;
                                    pn6 pn6Var2 = pn6.a;
                                    ub2 ub2Var62 = ub2Var3;
                                    w44 w44Var4 = w44Var;
                                    switch (b4) {
                                        case 0:
                                            SubtitleStyleSettings normalized = ((SubtitleStyleSettings) w44Var4.getValue()).normalized();
                                            w44Var4.setValue(normalized);
                                            ub2Var62.invoke(normalized);
                                            return pn6Var2;
                                        default:
                                            SubtitleStyleSettings normalized2 = ((SubtitleStyleSettings) w44Var4.getValue()).normalized();
                                            w44Var4.setValue(normalized2);
                                            ub2Var62.invoke(normalized2);
                                            return pn6Var2;
                                    }
                                }
                            };
                            kd2Var5.n0(Q9);
                        }
                        sb2 sb2Var3 = (sb2) Q9;
                        boolean f8 = kd2Var5.f(sb2Var);
                        Object Q10 = kd2Var5.Q();
                        if (f8 || Q10 == q18Var) {
                            Q10 = new o10(sb2Var, w44Var, (byte) 4);
                            kd2Var5.n0(Q10);
                        }
                        h26.a(xh4Var, list2, subtitleStyleSettings2, af3Var, vm1Var2, ub2Var6, ub2Var7, sb2Var3, (sb2) Q10, kd2Var5, 196616);
                        kd2Var5.q(false);
                    }
                } else {
                    kd2Var5.Y();
                }
                return pn6Var;
        }
    }

    public /* synthetic */ oi(List list, Object obj, om5 om5Var, ub2 ub2Var, w44 w44Var, ub2 ub2Var2) {
        this.A = list;
        this.y = obj;
        this.B = om5Var;
        this.C = ub2Var;
        this.z = w44Var;
        this.D = ub2Var2;
    }

    public /* synthetic */ oi(Set set, Object obj, Set set2, w44 w44Var, List list, j74 j74Var) {
        this.B = set;
        this.y = obj;
        this.C = set2;
        this.z = w44Var;
        this.A = list;
        this.D = j74Var;
    }
}
