package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fk extends x93 implements ic2 {
    public final /* synthetic */ sk4 A;
    public final /* synthetic */ ub2 B;
    public final /* synthetic */ qk C;
    public final /* synthetic */ zt5 D;
    public final /* synthetic */ os0 E;
    public final /* synthetic */ Object y;
    public final /* synthetic */ xi6 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk(Object obj, xi6 xi6Var, sk4 sk4Var, ub2 ub2Var, qk qkVar, zt5 zt5Var, os0 os0Var) {
        super(2);
        this.y = obj;
        this.z = xi6Var;
        this.A = sk4Var;
        this.B = ub2Var;
        this.C = qkVar;
        this.D = zt5Var;
        this.E = os0Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        ez0 ez0Var;
        rx1 rx1Var;
        kd2 kd2Var = (kd2) obj;
        int intValue = ((Number) obj2).intValue();
        boolean z2 = true;
        if ((intValue & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(intValue & 1, z)) {
            xi6 xi6Var = this.z;
            ti4 ti4Var = xi6Var.e;
            ti4 ti4Var2 = xi6Var.d;
            Object value = ti4Var.getValue();
            Object obj3 = this.y;
            boolean g = kd2Var.g(a34.i(obj3, value));
            Object Q = kd2Var.Q();
            ub2 ub2Var = this.B;
            sk4 sk4Var = this.A;
            q18 q18Var = au0.a;
            qk qkVar = this.C;
            if (g || Q == q18Var) {
                if (a34.i(obj3, ti4Var.getValue()) && sk4Var != null) {
                    ez0Var = (ez0) ub2Var.invoke(sk4Var);
                } else if (!a34.i(obj3, xi6Var.f().a()) && !a34.i(obj3, xi6Var.f().c())) {
                    ez0Var = (ez0) ub2Var.invoke(new sk4(qkVar, xi6Var.f().a(), obj3));
                } else {
                    ez0Var = (ez0) ub2Var.invoke(qkVar);
                }
                Q = ez0Var;
                kd2Var.n0(Q);
            }
            ez0 ez0Var2 = (ez0) Q;
            boolean g2 = kd2Var.g(a34.i(xi6Var.f().c(), obj3)) | kd2Var.g(a34.i(obj3, ti4Var.getValue()));
            Object Q2 = kd2Var.Q();
            if (g2 || Q2 == q18Var) {
                if (!a34.i(xi6Var.f().c(), obj3) && (!a34.i(obj3, ti4Var.getValue()) || sk4Var == null)) {
                    if (!a34.i(obj3, xi6Var.f().a()) && !a34.i(obj3, xi6Var.f().c())) {
                        rx1Var = ((ez0) ub2Var.invoke(new sk4(qkVar, obj3, xi6Var.f().a()))).b;
                    } else {
                        rx1Var = ((ez0) ub2Var.invoke(qkVar)).b;
                    }
                } else {
                    rx1Var = rx1.b;
                }
                Q2 = rx1Var;
                kd2Var.n0(Q2);
            }
            rx1 rx1Var2 = (rx1) Q2;
            Object Q3 = kd2Var.Q();
            if (Q3 == q18Var) {
                Q3 = new lk(a34.i(obj3, ti4Var2.getValue()));
                kd2Var.n0(Q3);
            }
            lk lkVar = (lk) Q3;
            iv1 iv1Var = ez0Var2.a;
            q97 q97Var = new q97(obj3, ez0Var2.c.h());
            lkVar.x.setValue(Boolean.valueOf(a34.i(obj3, ti4Var2.getValue())));
            if (!a34.i(obj3, ti4Var.getValue()) || a34.i(obj3, ti4Var2.getValue()) || a34.i(obj3, xi6Var.a.v())) {
                z2 = false;
            }
            lkVar.y.setValue(Boolean.valueOf(z2));
            yz3 w = q97Var.w(lkVar);
            boolean h = kd2Var.h(obj3);
            Object Q4 = kd2Var.Q();
            if (h || Q4 == q18Var) {
                Q4 = new bk(obj3, (byte) 0);
                kd2Var.n0(Q4);
            }
            ub2 ub2Var2 = (ub2) Q4;
            boolean f = kd2Var.f(rx1Var2);
            Object Q5 = kd2Var.Q();
            if (f || Q5 == q18Var) {
                Q5 = new ck(rx1Var2);
                kd2Var.n0(Q5);
            }
            te4.a(xi6Var, ub2Var2, w, iv1Var, rx1Var2, (ic2) Q5, nx7.R(1831990167, new ek(obj3, this.D, qkVar, this.E), kd2Var), kd2Var, 100663296);
        } else {
            kd2Var.Y();
        }
        return pn6.a;
    }
}
