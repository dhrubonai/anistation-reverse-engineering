package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class t86 implements q86 {
    public final long x;
    public final /* synthetic */ u86 y;

    public t86(u86 u86Var, long j) {
        this.y = u86Var;
        this.x = j;
    }

    @Override // defpackage.q86
    public final p86 U() {
        return nz5.b(this.y);
    }

    @Override // defpackage.q86
    public final long k(ha3 ha3Var) {
        ha3 ha3Var2 = (ha3) this.y.O.getValue();
        if (ha3Var2 != null) {
            if (!ha3Var2.m()) {
                return 0L;
            }
            return ha3Var.D(ha3Var2.o(this.x));
        }
        hz2.d("Tried to open context menu before the anchor was placed.");
        v71.e();
        return 0L;
    }

    @Override // defpackage.q86
    public final n05 n(ha3 ha3Var) {
        return n03.g(k(ha3Var), 0L);
    }
}
