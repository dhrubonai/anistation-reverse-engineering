package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class s21 extends x93 implements ic2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ os0 B;
    public final /* synthetic */ xi6 y;
    public final /* synthetic */ j32 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s21(xi6 xi6Var, j32 j32Var, Object obj, os0 os0Var) {
        super(2);
        this.y = xi6Var;
        this.z = j32Var;
        this.A = obj;
        this.B = os0Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        Object v;
        float f;
        ub2 ub2Var;
        kd2 kd2Var = (kd2) obj;
        int intValue = ((Number) obj2).intValue();
        if ((intValue & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(intValue & 1, z)) {
            tk6 tk6Var = db.l;
            xi6 xi6Var = this.y;
            boolean h = xi6Var.h();
            qt0 qt0Var = xi6Var.a;
            q18 q18Var = au0.a;
            if (!h) {
                kd2Var.e0(1666573488);
                boolean f2 = kd2Var.f(xi6Var);
                v = kd2Var.Q();
                if (f2 || v == q18Var) {
                    ft5 b = et5.b();
                    if (b != null) {
                        ub2Var = b.e();
                    } else {
                        ub2Var = null;
                    }
                    ft5 e = et5.e(b);
                    try {
                        Object v2 = qt0Var.v();
                        et5.k(b, e, ub2Var);
                        kd2Var.n0(v2);
                        v = v2;
                    } catch (Throwable th) {
                        et5.k(b, e, ub2Var);
                        throw th;
                    }
                }
                kd2Var.q(false);
            } else {
                kd2Var.e0(1666827533);
                kd2Var.q(false);
                v = qt0Var.v();
            }
            kd2Var.e0(1378811975);
            Object obj3 = this.A;
            boolean i = a34.i(v, obj3);
            float f3 = 0.0f;
            if (i) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            kd2Var.q(false);
            Float valueOf = Float.valueOf(f);
            boolean f4 = kd2Var.f(xi6Var);
            Object Q = kd2Var.Q();
            if (f4 || Q == q18Var) {
                Q = ut5.b(new rh(xi6Var, (byte) 6));
                kd2Var.n0(Q);
            }
            Object value = ((px5) Q).getValue();
            kd2Var.e0(1378811975);
            if (a34.i(value, obj3)) {
                f3 = 1.0f;
            }
            kd2Var.q(false);
            Float valueOf2 = Float.valueOf(f3);
            boolean f5 = kd2Var.f(xi6Var);
            Object Q2 = kd2Var.Q();
            if (f5 || Q2 == q18Var) {
                Q2 = ut5.b(new rh(xi6Var, (byte) 7));
                kd2Var.n0(Q2);
            }
            kd2Var.e0(955869654);
            kd2Var.q(false);
            ui6 q = tl7.q(xi6Var, valueOf, valueOf2, this.z, tk6Var, kd2Var, 0);
            boolean f6 = kd2Var.f(q);
            Object Q3 = kd2Var.Q();
            if (f6 || Q3 == q18Var) {
                Q3 = new bk(q, (byte) 4);
                kd2Var.n0(Q3);
            }
            yz3 O = io3.O(vz3.x, (ub2) Q3);
            vo3 c = b90.c(pk2.y, false);
            int hashCode = Long.hashCode(kd2Var.T);
            al4 l = kd2Var.l();
            yz3 E = o80.E(kd2Var, O);
            tt0.d.getClass();
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(za3.p0);
            } else {
                kd2Var.q0();
            }
            ss5.i(p7.F, kd2Var, c);
            ss5.i(p7.E, kd2Var, l);
            ss5.e(kd2Var, Integer.valueOf(hashCode));
            ss5.h(kd2Var);
            ss5.i(p7.D, kd2Var, E);
            this.B.invoke(obj3, kd2Var, 0);
            kd2Var.q(true);
        } else {
            kd2Var.Y();
        }
        return pn6.a;
    }
}
