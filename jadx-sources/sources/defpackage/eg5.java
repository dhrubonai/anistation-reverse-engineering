package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class eg5 extends e85 {
    public final ue0 E;
    public final cg5 F;
    public final byte[] G;
    public final gf0 H;

    public eg5(dg5 dg5Var, ue0 ue0Var, cg5 cg5Var, byte[] bArr) {
        this.E = ue0Var;
        this.F = cg5Var;
        this.G = bArr;
        this.H = new gf0(ue0Var, dg5Var.y, bArr, cg5Var);
    }

    @Override // defpackage.e85
    public final void c() {
        this.H.j = true;
    }

    @Override // defpackage.e85
    public final Object d() {
        this.H.a();
        cg5 cg5Var = this.F;
        if (cg5Var != null) {
            cg5Var.B++;
            cg5Var.x.b(cg5Var.b(), cg5Var.y, cg5Var.A);
            return null;
        }
        return null;
    }
}
