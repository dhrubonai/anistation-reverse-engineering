package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class t71 extends xz3 implements zo1 {
    public final u34 L;
    public boolean M;
    public boolean N;
    public boolean O;

    public t71(u34 u34Var) {
        this.L = u34Var;
    }

    @Override // defpackage.xz3
    public final void S0() {
        tl7.z(O0(), null, null, new hu1(this, null, (byte) 6), 3);
    }

    @Override // defpackage.zo1
    public final void u0(bb3 bb3Var) {
        bb3Var.a();
        xg0 xg0Var = bb3Var.x;
        if (this.M) {
            bp1.k0(bb3Var, ep0.b(0.3f, ep0.b), 0L, xg0Var.g(), 0.0f, 122);
        } else {
            if (!this.N && !this.O) {
                return;
            }
            bp1.k0(bb3Var, ep0.b(0.1f, ep0.b), 0L, xg0Var.g(), 0.0f, 122);
        }
    }
}
