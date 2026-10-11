package defpackage;

import com.anistation.android.R;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qz3 implements ic2 {
    public final /* synthetic */ sb2 A;
    public final /* synthetic */ v11 B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ byte x = 0;
    public final /* synthetic */ ic2 y;
    public final /* synthetic */ do5 z;

    public qz3(ic2 ic2Var, wj wjVar, do5 do5Var, ic2 ic2Var2, os0 os0Var, sb2 sb2Var, v11 v11Var, boolean z) {
        this.y = ic2Var;
        this.D = wjVar;
        this.z = do5Var;
        this.E = ic2Var2;
        this.F = os0Var;
        this.A = sb2Var;
        this.B = v11Var;
        this.C = z;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        t53 t53Var = za3.p0;
        q18 q18Var = au0.a;
        ic2 ic2Var = this.y;
        Object obj3 = this.F;
        Object obj4 = this.E;
        Object obj5 = this.D;
        switch (b) {
            case 0:
                kd2 kd2Var = (kd2) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var.V(intValue & 1, z)) {
                    do5 do5Var = this.z;
                    boolean f = kd2Var.f(do5Var);
                    sb2 sb2Var = this.A;
                    boolean f2 = f | kd2Var.f(sb2Var);
                    v11 v11Var = this.B;
                    boolean h = f2 | kd2Var.h(v11Var);
                    Object Q = kd2Var.Q();
                    if (h || Q == q18Var) {
                        Q = new lz3(do5Var, sb2Var, v11Var);
                        kd2Var.n0(Q);
                    }
                    yz3 m = q23.m((sb2) Q);
                    boolean f3 = kd2Var.f((String) obj5) | kd2Var.g(this.C) | kd2Var.f(do5Var) | kd2Var.f(sb2Var) | kd2Var.f((String) obj4) | kd2Var.h(v11Var) | kd2Var.f((String) obj3);
                    String str = (String) obj5;
                    String str2 = (String) obj4;
                    String str3 = (String) obj3;
                    Object Q2 = kd2Var.Q();
                    if (f3 || Q2 == q18Var) {
                        nj1 nj1Var = new nj1(this.C, do5Var, str, str2, str3, this.A, this.B);
                        kd2Var.n0(nj1Var);
                        Q2 = nj1Var;
                    }
                    yz3 a = rh5.a(m, true, (ub2) Q2);
                    vo3 c = b90.c(pk2.y, false);
                    int s = h98.s(kd2Var);
                    al4 l = kd2Var.l();
                    yz3 E = o80.E(kd2Var, a);
                    tt0.d.getClass();
                    kd2Var.h0();
                    if (kd2Var.S) {
                        kd2Var.k(t53Var);
                    } else {
                        kd2Var.q0();
                    }
                    ss5.i(p7.F, kd2Var, c);
                    ss5.i(p7.E, kd2Var, l);
                    st0 st0Var = p7.G;
                    if (kd2Var.S || !a34.i(kd2Var.Q(), Integer.valueOf(s))) {
                        h11.p(s, kd2Var, s, st0Var);
                    }
                    ss5.i(p7.D, kd2Var, E);
                    ic2Var.invoke(kd2Var, 0);
                    kd2Var.q(true);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            default:
                kd2 kd2Var2 = (kd2) obj;
                int intValue2 = ((Number) obj2).intValue();
                wj wjVar = (wj) obj5;
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (kd2Var2.V(intValue2 & 1, z2)) {
                    yz3 k0 = h41.k0(ar5.c(vz3.x, 1.0f), (t47) ic2Var.invoke(kd2Var2, 0));
                    boolean h2 = kd2Var2.h(wjVar);
                    Object Q3 = kd2Var2.Q();
                    if (h2 || Q3 == q18Var) {
                        Q3 = new pz3(wjVar, (byte) 0);
                        kd2Var2.n0(Q3);
                    }
                    yz3 O = io3.O(k0, (ub2) Q3);
                    do5 do5Var2 = this.z;
                    yz3 O2 = io3.O(O, new y70(do5Var2, (byte) 1));
                    ic2 ic2Var2 = (ic2) obj4;
                    os0 os0Var = (os0) obj3;
                    xp0 a2 = vp0.a(x97.z, pk2.K, kd2Var2, 0);
                    int s2 = h98.s(kd2Var2);
                    al4 l2 = kd2Var2.l();
                    yz3 E2 = o80.E(kd2Var2, O2);
                    tt0.d.getClass();
                    kd2Var2.h0();
                    if (kd2Var2.S) {
                        kd2Var2.k(t53Var);
                    } else {
                        kd2Var2.q0();
                    }
                    ss5.i(p7.F, kd2Var2, a2);
                    ss5.i(p7.E, kd2Var2, l2);
                    st0 st0Var2 = p7.G;
                    if (kd2Var2.S || !a34.i(kd2Var2.Q(), Integer.valueOf(s2))) {
                        h11.p(s2, kd2Var2, s2, st0Var2);
                    }
                    ss5.i(p7.D, kd2Var2, E2);
                    if (ic2Var2 != null) {
                        kd2Var2.e0(1352934765);
                        zn5.a(nx7.R(2000500644, new qz3(do5Var2, this.A, this.B, this.C, lt5.m(R.string.m3c_bottom_sheet_dismiss_description, kd2Var2), lt5.m(R.string.m3c_bottom_sheet_expand_description, kd2Var2), lt5.m(R.string.m3c_bottom_sheet_collapse_description, kd2Var2), ic2Var2), kd2Var2), kd2Var2, 54);
                        kd2Var2.q(false);
                    } else {
                        kd2Var2.e0(1356009965);
                        kd2Var2.q(false);
                    }
                    os0Var.invoke(yp0.a, kd2Var2, 6);
                    kd2Var2.q(true);
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
        }
    }

    public qz3(do5 do5Var, sb2 sb2Var, v11 v11Var, boolean z, String str, String str2, String str3, ic2 ic2Var) {
        this.z = do5Var;
        this.A = sb2Var;
        this.B = v11Var;
        this.C = z;
        this.D = str;
        this.E = str2;
        this.F = str3;
        this.y = ic2Var;
    }
}
