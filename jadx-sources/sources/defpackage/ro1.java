package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class ro1 {
    public static final qo1 a = new qo1(3, null, (byte) 0);
    public static final qo1 b = new qo1(3, null, (byte) 1);

    public static yz3 a(yz3 yz3Var, uo1 uo1Var, rg4 rg4Var, boolean z, u34 u34Var, boolean z2, jc2 jc2Var, boolean z3, int i) {
        boolean z4;
        if ((i & 8) != 0) {
            u34Var = null;
        }
        u34 u34Var2 = u34Var;
        if ((i & 128) != 0) {
            z4 = false;
        } else {
            z4 = z3;
        }
        return yz3Var.w(new oo1(uo1Var, rg4Var, z, u34Var2, z2, a, jc2Var, z4));
    }

    public static final long b(long j) {
        float b2;
        float f = 0.0f;
        if (Float.isNaN(ur6.b(j))) {
            b2 = 0.0f;
        } else {
            b2 = ur6.b(j);
        }
        if (!Float.isNaN(ur6.c(j))) {
            f = ur6.c(j);
        }
        return ez5.a(b2, f);
    }
}
