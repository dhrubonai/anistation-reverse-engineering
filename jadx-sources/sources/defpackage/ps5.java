package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ps5 implements jc2 {
    public final /* synthetic */ l12 x;
    public final /* synthetic */ String y;

    public ps5(l12 l12Var, String str) {
        this.x = l12Var;
        this.y = str;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i;
        ic2 ic2Var = (ic2) obj;
        kd2 kd2Var = (kd2) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            if (kd2Var.h(ic2Var)) {
                i = 4;
            } else {
                i = 2;
            }
            intValue |= i;
        }
        if ((intValue & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(intValue & 1, z)) {
            Object N = sw0.N(z04.A, kd2Var);
            vz0 vz0Var = null;
            boolean f = kd2Var.f(null);
            Object obj4 = this.x;
            boolean h = f | kd2Var.h(obj4);
            Object Q = kd2Var.Q();
            Object obj5 = au0.a;
            if (h || Q == obj5) {
                Q = new nj4(obj4, (byte) 25);
                kd2Var.n0(Q);
            }
            Object obj6 = (sb2) Q;
            Object Q2 = kd2Var.Q();
            if (Q2 == obj5) {
                Q2 = v94.a(0.0f);
                kd2Var.n0(Q2);
            }
            wj wjVar = (wj) Q2;
            Boolean bool = Boolean.TRUE;
            boolean h2 = kd2Var.h(wjVar) | kd2Var.g(true) | kd2Var.h(N) | kd2Var.f(obj6);
            Object Q3 = kd2Var.Q();
            if (h2 || Q3 == obj5) {
                Q3 = new e05(wjVar, N, obj6, null, (byte) 8);
                kd2Var.n0(Q3);
            }
            db.f((ic2) Q3, kd2Var, bool);
            ml mlVar = wjVar.c;
            Object N2 = sw0.N(z04.y, kd2Var);
            Object Q4 = kd2Var.Q();
            if (Q4 == obj5) {
                Q4 = v94.a(0.8f);
                kd2Var.n0(Q4);
            }
            wj wjVar2 = (wj) Q4;
            boolean h3 = kd2Var.h(wjVar2) | kd2Var.g(true) | kd2Var.h(N2);
            Object Q5 = kd2Var.Q();
            if (h3 || Q5 == obj5) {
                Q5 = new e52(wjVar2, N2, vz0Var, (byte) 26);
                kd2Var.n0(Q5);
            }
            db.f((ic2) Q5, kd2Var, bool);
            ml mlVar2 = wjVar2.c;
            yz3 Q6 = io3.Q(vz3.x, ((Number) mlVar2.y.getValue()).floatValue(), ((Number) mlVar2.y.getValue()).floatValue(), ((Number) mlVar.y.getValue()).floatValue(), 0.0f, null, 131064);
            boolean g = kd2Var.g(true) | kd2Var.f(null);
            String str = this.y;
            boolean f2 = g | kd2Var.f(str);
            Object Q7 = kd2Var.Q();
            if (f2 || Q7 == obj5) {
                Q7 = new zg(str, (byte) 23);
                kd2Var.n0(Q7);
            }
            yz3 a = rh5.a(Q6, false, (ub2) Q7);
            vo3 c = b90.c(pk2.y, false);
            int s = h98.s(kd2Var);
            al4 l = kd2Var.l();
            yz3 E = o80.E(kd2Var, a);
            tt0.d.getClass();
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(za3.p0);
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
            ic2Var.invoke(kd2Var, Integer.valueOf(intValue & 14));
            kd2Var.q(true);
        } else {
            kd2Var.Y();
        }
        return pn6.a;
    }
}
