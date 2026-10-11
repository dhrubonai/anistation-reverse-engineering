package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ze6 implements g95 {
    public final g95 x;
    public final long y;

    public ze6(g95 g95Var, long j) {
        this.x = g95Var;
        this.y = j;
    }

    @Override // defpackage.g95
    public final int G() {
        return this.x.G();
    }

    @Override // defpackage.g95
    public final int I(pz2 pz2Var, q61 q61Var, int i) {
        int I = this.x.I(pz2Var, q61Var, i);
        if (I == -4) {
            q61Var.D += this.y;
        }
        return I;
    }

    @Override // defpackage.g95
    public final boolean isReady() {
        return this.x.isReady();
    }

    @Override // defpackage.g95
    public final void s() {
        this.x.s();
    }

    @Override // defpackage.g95
    public final int t(long j) {
        return this.x.t(j - this.y);
    }
}
