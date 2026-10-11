package defpackage;

import com.anistation.model.Info;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class gf1 implements jc2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ Object z;

    public /* synthetic */ gf1(byte b, Object obj, boolean z) {
        this.x = b;
        this.z = obj;
        this.y = z;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        byte b = this.x;
        boolean z5 = this.y;
        Object obj4 = this.z;
        switch (b) {
            case 0:
                Info info = (Info) obj4;
                kd2 kd2Var = (kd2) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((zc3) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var.V(intValue & 1, z)) {
                    bb4.h(info, z5, kd2Var, 0);
                } else {
                    kd2Var.Y();
                }
                return pn6.a;
            default:
                cb6 cb6Var = (cb6) obj4;
                ti4 ti4Var = cb6Var.f;
                kd2 kd2Var2 = (kd2) obj2;
                ((Integer) obj3).getClass();
                kd2Var2.e0(-2137546592);
                if (kd2Var2.j(bv0.n) == ia3.y) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (((rg4) ti4Var.getValue()) != rg4.x && z2) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                boolean f = kd2Var2.f(cb6Var);
                Object Q = kd2Var2.Q();
                Object obj5 = au0.a;
                if (f || Q == obj5) {
                    Q = new pp5((Object) cb6Var, (byte) 12);
                    kd2Var2.n0(Q);
                }
                w44 h = xt5.h((ub2) Q, kd2Var2);
                Object Q2 = kd2Var2.Q();
                if (Q2 == obj5) {
                    Object ma1Var = new ma1(new ef(h, (byte) 17));
                    kd2Var2.n0(ma1Var);
                    Q2 = ma1Var;
                }
                kd5 kd5Var = (kd5) Q2;
                boolean f2 = kd2Var2.f(kd5Var) | kd2Var2.f(cb6Var);
                Object Q3 = kd2Var2.Q();
                if (f2 || Q3 == obj5) {
                    Q3 = new bb6(kd5Var, cb6Var);
                    kd2Var2.n0(Q3);
                }
                bb6 bb6Var = (bb6) Q3;
                rg4 rg4Var = (rg4) ti4Var.getValue();
                if (z5 && cb6Var.b.h() != 0.0f) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                yz3 a = fd5.a(vz3.x, bb6Var, rg4Var, z4, z3, null);
                kd2Var2.q(false);
                return a;
        }
    }
}
