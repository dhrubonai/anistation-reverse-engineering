package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tr6 extends xz3 implements zo1 {
    public qi6 L;
    public iv1 M;
    public rx1 N;
    public ln5 O;

    @Override // defpackage.zo1
    public final void u0(bb3 bb3Var) {
        ep0 ep0Var;
        bb3Var.a();
        qi6 qi6Var = this.L;
        sr6 sr6Var = new sr6(this, (byte) 0);
        ln5 ln5Var = this.O;
        if (ln5Var.a()) {
            ep0Var = new ep0(ln5Var.e);
        } else {
            ep0Var = null;
        }
        pi6 a = qi6Var.a(sr6Var, ep0Var, null, new sr6(this, (byte) 1));
        ln5 ln5Var2 = this.O;
        long j = ((ep0) a.getValue()).a;
        ai6 ai6Var = ln5Var2.c;
        if (ln5Var2.b() && ((Boolean) ((ti4) ai6Var.e).getValue()).booleanValue()) {
            j = ((ep0) ((ti4) ai6Var.f).getValue()).a;
        }
        long j2 = j;
        if (ln5Var2.b()) {
            ln5Var2.e = j2;
        }
        if (ep0.c(j2) == 0.0f) {
            return;
        }
        wi6 wi6Var = this.M.a;
        wi6 wi6Var2 = this.N.a;
        bp1.k0(bb3Var, j2, 0L, 0L, 0.0f, 126);
    }
}
