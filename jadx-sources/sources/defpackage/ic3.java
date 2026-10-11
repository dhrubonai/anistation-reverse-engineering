package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ic3 extends qt0 {
    public final int A;
    public final /* synthetic */ ud3 B;
    public final /* synthetic */ wc3 C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ long G;
    public final dc3 y;
    public final ud3 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic3(dc3 dc3Var, ud3 ud3Var, int i, wc3 wc3Var, boolean z, int i2, int i3, long j) {
        super((byte) 1);
        this.B = ud3Var;
        this.C = wc3Var;
        this.D = z;
        this.E = i2;
        this.F = i3;
        this.G = j;
        this.y = dc3Var;
        this.z = ud3Var;
        this.A = i;
    }

    public final nc3 M(int i, int i2, int i3, long j, int i4) {
        int i5;
        dc3 dc3Var = this.y;
        Object b = dc3Var.b(i);
        Object S = dc3Var.b.S(i);
        List w = w(this.z, i, j);
        if (rx0.f(j)) {
            i5 = rx0.j(j);
        } else {
            if (!rx0.e(j)) {
                hz2.a("does not have fixed height");
            }
            i5 = rx0.i(j);
        }
        int i6 = i5;
        ia3 layoutDirection = this.B.y.getLayoutDirection();
        od3 od3Var = this.C.m;
        return new nc3(i, b, this.D, i6, i4, layoutDirection, this.E, this.F, w, this.G, S, od3Var, j, i2, i3);
    }

    @Override // defpackage.qt0
    public final vd3 t(int i, int i2, int i3, long j) {
        return M(i, i2, i3, j, this.A);
    }
}
