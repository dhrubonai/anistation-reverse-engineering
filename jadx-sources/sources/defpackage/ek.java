package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ek extends x93 implements jc2 {
    public final /* synthetic */ qk A;
    public final /* synthetic */ os0 B;
    public final /* synthetic */ Object y;
    public final /* synthetic */ zt5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek(Object obj, zt5 zt5Var, qk qkVar, os0 os0Var) {
        super(3);
        this.y = obj;
        this.z = zt5Var;
        this.A = qkVar;
        this.B = os0Var;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean h;
        int i;
        el elVar = (el) obj;
        kd2 kd2Var = (kd2) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            if ((intValue & 8) == 0) {
                h = kd2Var.f(elVar);
            } else {
                h = kd2Var.h(elVar);
            }
            if (h) {
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
            zt5 zt5Var = this.z;
            boolean f = kd2Var.f(zt5Var);
            Object obj4 = this.y;
            boolean h2 = f | kd2Var.h(obj4);
            qk qkVar = this.A;
            boolean h3 = h2 | kd2Var.h(qkVar);
            Object Q = kd2Var.Q();
            q18 q18Var = au0.a;
            if (h3 || Q == q18Var) {
                Q = new yu1(zt5Var, obj4, qkVar, (byte) 2);
                kd2Var.n0(Q);
            }
            db.d(elVar, obj4, (ub2) Q, kd2Var);
            p44 p44Var = qkVar.d;
            elVar.getClass();
            p44Var.n(obj4, ((fl) elVar).b);
            Object Q2 = kd2Var.Q();
            if (Q2 == q18Var) {
                Q2 = new jk(elVar);
                kd2Var.n0(Q2);
            }
            this.B.e((jk) Q2, obj4, kd2Var, 0);
        } else {
            kd2Var.Y();
        }
        return pn6.a;
    }
}
