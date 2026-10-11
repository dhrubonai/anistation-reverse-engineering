package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nn0 implements g95 {
    public final /* synthetic */ on0 A;
    public final g95 x;
    public final boolean y;
    public boolean z;

    public nn0(on0 on0Var, g95 g95Var, boolean z) {
        this.A = on0Var;
        this.x = g95Var;
        this.y = z;
    }

    @Override // defpackage.g95
    public final int G() {
        int G = this.x.G();
        if (this.A.G != Long.MIN_VALUE) {
            G |= 1;
        }
        if (this.y) {
            return (G & (-3)) | 4;
        }
        return G;
    }

    @Override // defpackage.g95
    public final int I(pz2 pz2Var, q61 q61Var, int i) {
        on0 on0Var = this.A;
        if (on0Var.k()) {
            return -3;
        }
        boolean z = on0Var.I;
        g95 g95Var = this.x;
        if (z) {
            int I = g95Var.I(pz2Var, q61Var, i);
            if (I == -5) {
                on0.t(pz2Var, on0Var.F, on0Var.G);
                return -5;
            }
            return I;
        }
        if (this.z) {
            q61Var.y = 4;
            return -4;
        }
        long s = on0Var.s();
        int I2 = g95Var.I(pz2Var, q61Var, i);
        if (on0Var.E != -9223372036854775807L && I2 != -3) {
            on0Var.E = -9223372036854775807L;
        }
        if (I2 == -5) {
            on0.t(pz2Var, on0Var.F, on0Var.G);
            return -5;
        }
        long j = on0Var.G;
        if (j != Long.MIN_VALUE && ((I2 == -4 && q61Var.D >= j) || (I2 == -3 && s == Long.MIN_VALUE && !q61Var.C))) {
            q61Var.f();
            q61Var.y = 4;
            this.z = true;
            return -4;
        }
        return I2;
    }

    @Override // defpackage.g95
    public final boolean isReady() {
        if (!this.A.k() && this.x.isReady()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.g95
    public final void s() {
        this.x.s();
    }

    @Override // defpackage.g95
    public final int t(long j) {
        if (this.A.k()) {
            return -3;
        }
        return this.x.t(j);
    }
}
