package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gv1 extends x93 implements ub2 {
    public final /* synthetic */ byte y;
    public final /* synthetic */ hv1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gv1(hv1 hv1Var, byte b) {
        super(1);
        this.y = b;
        this.z = hv1Var;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        j32 j32Var;
        j32 j32Var2;
        byte b = this.y;
        tu1 tu1Var = tu1.z;
        tu1 tu1Var2 = tu1.y;
        tu1 tu1Var3 = tu1.x;
        hv1 hv1Var = this.z;
        switch (b) {
            case 0:
                si6 si6Var = (si6) obj;
                boolean b2 = si6Var.b(tu1Var3, tu1Var2);
                Object obj2 = null;
                if (b2) {
                    ij0 ij0Var = hv1Var.Q.a.c;
                    if (ij0Var != null) {
                        obj2 = ij0Var.c;
                    }
                } else if (si6Var.b(tu1Var2, tu1Var)) {
                    ij0 ij0Var2 = hv1Var.R.a.c;
                    if (ij0Var2 != null) {
                        obj2 = ij0Var2.c;
                    }
                } else {
                    obj2 = dv1.e;
                }
                if (obj2 == null) {
                    return dv1.e;
                }
                return obj2;
            default:
                si6 si6Var2 = (si6) obj;
                if (si6Var2.b(tu1Var3, tu1Var2)) {
                    hr5 hr5Var = hv1Var.Q.a.b;
                    if (hr5Var == null || (j32Var2 = hr5Var.b) == null) {
                        return dv1.d;
                    }
                    return j32Var2;
                }
                if (si6Var2.b(tu1Var2, tu1Var)) {
                    hr5 hr5Var2 = hv1Var.R.a.b;
                    if (hr5Var2 == null || (j32Var = hr5Var2.b) == null) {
                        return dv1.d;
                    }
                    return j32Var;
                }
                return dv1.d;
        }
    }
}
