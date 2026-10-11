package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vy4 implements qx5, w42, wc2 {
    private final h43 job;
    public final /* synthetic */ sx5 x;

    public vy4(sx5 sx5Var, bx5 bx5Var) {
        this.x = sx5Var;
        this.job = bx5Var;
    }

    @Override // defpackage.wc2
    public final w42 a(l11 l11Var, int i, ta0 ta0Var) {
        if (((i < 0 || i >= 2) && i != -2) || ta0Var != ta0.y) {
            return jn5.c(this, l11Var, i, ta0Var);
        }
        return this;
    }

    @Override // defpackage.w42
    public final Object collect(x42 x42Var, vz0 vz0Var) {
        this.x.collect(x42Var, vz0Var);
        return w11.x;
    }

    @Override // defpackage.qx5
    public final Object getValue() {
        return this.x.getValue();
    }
}
