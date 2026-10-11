package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class k91 {
    public int a;
    public boolean b;
    public int c;
    public float d;
    public Object e;

    public static int a(ue3 ue3Var, boolean z) {
        if (z) {
            return ((ve3) yo0.r0(ue3Var.l)).a + 1;
        }
        return ((ve3) yo0.k0(ue3Var.l)).a - 1;
    }

    public static int b(mc3 mc3Var, boolean z) {
        int i;
        int i2;
        rg4 rg4Var = rg4.x;
        if (z) {
            nc3 nc3Var = (nc3) yo0.r0(mc3Var.n);
            if (mc3Var.r == rg4Var) {
                i2 = nc3Var.y;
            } else {
                i2 = nc3Var.z;
            }
            return i2 + 1;
        }
        nc3 nc3Var2 = (nc3) yo0.k0(mc3Var.n);
        if (mc3Var.r == rg4Var) {
            i = nc3Var2.y;
        } else {
            i = nc3Var2.z;
        }
        return i - 1;
    }
}
