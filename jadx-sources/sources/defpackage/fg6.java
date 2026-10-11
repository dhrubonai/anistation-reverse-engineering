package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fg6 {
    public f96 a;
    public eg6 b = eg6.x;

    public final void a() {
        y86 y86Var;
        if (this.b == eg6.x) {
            hz2.c("ToolbarRequester is not initialized.");
        }
        f96 f96Var = this.a;
        if (f96Var != null && f96Var.K) {
            bx5 bx5Var = f96Var.R;
            if ((bx5Var == null || !bx5Var.isActive()) && (y86Var = (y86) t80.C(f96Var, z86.b)) != null) {
                f96Var.R = tl7.z(f96Var.O0(), null, y11.A, new an(f96Var, y86Var, null, (byte) 9), 1);
            }
        }
    }
}
