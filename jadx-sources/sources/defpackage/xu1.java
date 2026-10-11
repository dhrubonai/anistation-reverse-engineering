package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xu1 extends x93 implements ub2 {
    public final /* synthetic */ rx1 A;
    public final /* synthetic */ byte y;
    public final /* synthetic */ iv1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xu1(iv1 iv1Var, rx1 rx1Var, byte b) {
        super(1);
        this.y = b;
        this.z = iv1Var;
        this.A = rx1Var;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        j32 j32Var;
        j32 j32Var2;
        j32 j32Var3;
        j32 j32Var4;
        byte b = this.y;
        rx1 rx1Var = this.A;
        tu1 tu1Var = tu1.z;
        iv1 iv1Var = this.z;
        tu1 tu1Var2 = tu1.y;
        tu1 tu1Var3 = tu1.x;
        switch (b) {
            case 0:
                si6 si6Var = (si6) obj;
                if (si6Var.b(tu1Var3, tu1Var2)) {
                    j12 j12Var = iv1Var.a.a;
                    if (j12Var == null || (j32Var2 = j12Var.b) == null) {
                        return dv1.b;
                    }
                    return j32Var2;
                }
                if (si6Var.b(tu1Var2, tu1Var)) {
                    j12 j12Var2 = rx1Var.a.a;
                    if (j12Var2 == null || (j32Var = j12Var2.b) == null) {
                        return dv1.b;
                    }
                    return j32Var;
                }
                return dv1.b;
            default:
                si6 si6Var2 = (si6) obj;
                if (si6Var2.b(tu1Var3, tu1Var2)) {
                    ya5 ya5Var = iv1Var.a.d;
                    if (ya5Var == null || (j32Var4 = ya5Var.c) == null) {
                        return dv1.b;
                    }
                    return j32Var4;
                }
                if (si6Var2.b(tu1Var2, tu1Var)) {
                    ya5 ya5Var2 = rx1Var.a.d;
                    if (ya5Var2 == null || (j32Var3 = ya5Var2.c) == null) {
                        return dv1.b;
                    }
                    return j32Var3;
                }
                return dv1.b;
        }
    }
}
