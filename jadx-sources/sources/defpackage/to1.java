package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class to1 extends ho1 {
    public uo1 g0;
    public boolean h0;
    public jc2 i0;
    public jc2 j0;
    public boolean k0;

    @Override // defpackage.ho1
    public final Object e1(l5 l5Var, j10 j10Var) {
        Object a;
        rg4 rg4Var = this.N;
        if (rg4Var != null && (a = this.g0.a(new l5(l5Var, this, rg4Var, null, (byte) 7), j10Var)) == w11.x) {
            return a;
        }
        return pn6.a;
    }

    @Override // defpackage.ho1
    public final void j1(long j) {
        if (this.K && !a34.i(this.i0, ro1.a)) {
            tl7.z(O0(), null, y11.A, new so1(this, j, null), 1);
        }
    }

    @Override // defpackage.ho1
    public final void k1(sn1 sn1Var) {
        rg4 rg4Var;
        if (this.K && !a34.i(this.j0, ro1.b) && (rg4Var = this.N) != null) {
            tl7.z(O0(), null, y11.A, new l5(this, sn1Var, rg4Var, null, (byte) 8), 1);
        }
    }

    @Override // defpackage.ho1
    public final boolean s1() {
        return this.h0;
    }
}
