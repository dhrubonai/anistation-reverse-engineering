package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ye1 implements ic2 {
    public final /* synthetic */ ub2 A;
    public final /* synthetic */ byte x = 0;
    public final /* synthetic */ List y;
    public final /* synthetic */ int z;

    public /* synthetic */ ye1(int i, List list, ub2 ub2Var) {
        this.z = i;
        this.y = list;
        this.A = ub2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        ub2 ub2Var = this.A;
        List list = this.y;
        byte b2 = 1;
        boolean z3 = false;
        Object[] objArr = 0;
        switch (b) {
            case 0:
                kd2 kd2Var = (kd2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z3 = true;
                }
                if (kd2Var.V(intValue & 1, z3)) {
                    long j = ((mp0) kd2Var.j(op0.a)).n;
                    final int i = this.z;
                    vv5.b(10.0f, 50.0f, i, 920322048, j, 0L, nx7.R(-1056692398, new jc2() { // from class: ze1
                        @Override // defpackage.jc2
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            boolean z4;
                            boolean h;
                            int i2;
                            q66 q66Var = (q66) obj3;
                            kd2 kd2Var2 = (kd2) obj4;
                            int intValue2 = ((Integer) obj5).intValue();
                            q66Var.getClass();
                            if ((intValue2 & 6) == 0) {
                                if ((intValue2 & 8) == 0) {
                                    h = kd2Var2.f(q66Var);
                                } else {
                                    h = kd2Var2.h(q66Var);
                                }
                                if (h) {
                                    i2 = 4;
                                } else {
                                    i2 = 2;
                                }
                                intValue2 |= i2;
                            }
                            if ((intValue2 & 19) != 18) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (kd2Var2.V(intValue2 & 1, z4)) {
                                pk2.f0.d(new a66(q66Var.a, i, q66Var.b), 0.0f, ((mp0) kd2Var2.j(op0.a)).o, kd2Var2, 3072, 2);
                            } else {
                                kd2Var2.Y();
                            }
                            return pn6.a;
                        }
                    }, kd2Var), bx7.e, nx7.R(-715534359, new ye1(list, i, ub2Var), kd2Var), kd2Var, null, null);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            default:
                kd2 kd2Var2 = (kd2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var2.V(intValue2 & 1, z)) {
                    int i2 = 0;
                    for (Object obj3 : list) {
                        int i3 = i2 + 1;
                        if (i2 >= 0) {
                            String str = (String) obj3;
                            if (this.z == i2) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            boolean f = kd2Var2.f(ub2Var) | kd2Var2.d(i2);
                            Object Q = kd2Var2.Q();
                            if (f || Q == au0.a) {
                                Q = new af1(ub2Var, i2, objArr == true ? 1 : 0);
                                kd2Var2.n0(Q);
                            }
                            i66.b(z2, (sb2) Q, null, false, nx7.R(-1603466187, new q10(str, b2), kd2Var2), 0L, 0L, kd2Var2, 24576);
                            i2 = i3;
                        } else {
                            te4.R();
                            throw null;
                        }
                    }
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
        }
    }

    public /* synthetic */ ye1(List list, int i, ub2 ub2Var) {
        this.y = list;
        this.z = i;
        this.A = ub2Var;
    }
}
