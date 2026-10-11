package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class se3 extends qt0 {
    public final long A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ ud3 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;
    public final /* synthetic */ d7 F;
    public final /* synthetic */ x50 G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;
    public final /* synthetic */ long J;
    public final /* synthetic */ af3 K;
    public final qe3 y;
    public final ud3 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se3(long j, boolean z, qe3 qe3Var, ud3 ud3Var, int i, int i2, d7 d7Var, x50 x50Var, int i3, int i4, long j2, af3 af3Var) {
        super((byte) 1);
        int i5;
        this.B = z;
        this.C = ud3Var;
        this.D = i;
        this.E = i2;
        this.F = d7Var;
        this.G = x50Var;
        this.H = i3;
        this.I = i4;
        this.J = j2;
        this.K = af3Var;
        this.y = qe3Var;
        this.z = ud3Var;
        if (z) {
            i5 = rx0.h(j);
        } else {
            i5 = Integer.MAX_VALUE;
        }
        this.A = sx0.b(0, i5, 0, z ? Integer.MAX_VALUE : rx0.g(j), 5);
    }

    public final ve3 M(int i, long j) {
        int i2;
        qe3 qe3Var = this.y;
        Object b = qe3Var.b(i);
        Object S = qe3Var.b.S(i);
        List w = w(this.z, i, j);
        if (i == this.D - 1) {
            i2 = 0;
        } else {
            i2 = this.E;
        }
        return new ve3(i, w, this.B, this.F, this.G, this.C.y.getLayoutDirection(), this.H, this.I, i2, this.J, b, S, this.K.o, j);
    }

    @Override // defpackage.qt0
    public final vd3 t(int i, int i2, int i3, long j) {
        return M(i, j);
    }
}
