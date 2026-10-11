package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fv1 extends x93 implements ub2 {
    public final /* synthetic */ long A;
    public final /* synthetic */ byte y;
    public final /* synthetic */ hv1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fv1(hv1 hv1Var, long j, byte b) {
        super(1);
        this.y = b;
        this.z = hv1Var;
        this.A = j;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        ub2 ub2Var;
        ub2 ub2Var2;
        long j;
        long j2;
        ub2 ub2Var3;
        ub2 ub2Var4;
        int ordinal;
        byte b = this.y;
        long j3 = this.A;
        long j4 = 0;
        hv1 hv1Var = this.z;
        switch (b) {
            case 0:
                int ordinal2 = ((tu1) obj).ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 == 2) {
                            ij0 ij0Var = hv1Var.R.a.c;
                            if (ij0Var != null && (ub2Var2 = ij0Var.b) != null) {
                                j3 = ((k13) ub2Var2.invoke(new k13(j3))).a;
                            }
                        } else {
                            ze0.l();
                            return null;
                        }
                    }
                } else {
                    ij0 ij0Var2 = hv1Var.Q.a.c;
                    if (ij0Var2 != null && (ub2Var = ij0Var2.b) != null) {
                        j3 = ((k13) ub2Var.invoke(new k13(j3))).a;
                    }
                }
                return new k13(j3);
            case 1:
                tu1 tu1Var = (tu1) obj;
                if (tu1Var == tu1.z && hv1Var.R.a.b == null) {
                    j4 = hv1Var.S.i;
                } else {
                    hr5 hr5Var = hv1Var.Q.a.b;
                    if (hr5Var != null && (ub2Var4 = hr5Var.a) != null) {
                        j = ((c13) ub2Var4.invoke(new k13(j3))).a;
                    } else {
                        j = 0;
                    }
                    hr5 hr5Var2 = hv1Var.R.a.b;
                    if (hr5Var2 != null && (ub2Var3 = hr5Var2.a) != null) {
                        j2 = ((c13) ub2Var3.invoke(new k13(j3))).a;
                    } else {
                        j2 = 0;
                    }
                    int ordinal3 = tu1Var.ordinal();
                    if (ordinal3 != 0) {
                        if (ordinal3 != 1) {
                            if (ordinal3 == 2) {
                                j4 = j2;
                            } else {
                                ze0.l();
                                return null;
                            }
                        }
                    } else {
                        j4 = j;
                    }
                }
                return new c13(j4);
            default:
                tu1 tu1Var2 = (tu1) obj;
                if (hv1Var.W != null && hv1Var.c1() != null && !a34.i(hv1Var.W, hv1Var.c1()) && (ordinal = tu1Var2.ordinal()) != 0 && ordinal != 1) {
                    if (ordinal == 2) {
                        ij0 ij0Var3 = hv1Var.R.a.c;
                        if (ij0Var3 != null) {
                            ub2 ub2Var5 = ij0Var3.b;
                            long j5 = this.A;
                            long j6 = ((k13) ub2Var5.invoke(new k13(j5))).a;
                            e7 c1 = hv1Var.c1();
                            c1.getClass();
                            ia3 ia3Var = ia3.x;
                            long a = c1.a(j5, j6, ia3Var);
                            e7 e7Var = hv1Var.W;
                            e7Var.getClass();
                            j4 = c13.c(a, e7Var.a(j5, j6, ia3Var));
                        }
                    } else {
                        ze0.l();
                        return null;
                    }
                }
                return new c13(j4);
        }
    }
}
