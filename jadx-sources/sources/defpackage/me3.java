package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class me3 implements hd3 {
    public final af3 a;

    public me3(af3 af3Var) {
        this.a = af3Var;
    }

    @Override // defpackage.hd3
    public final int a() {
        return this.a.j().o;
    }

    @Override // defpackage.hd3
    public final int b() {
        return Math.min(a() - 1, ((ve3) yo0.r0(this.a.j().l)).a);
    }

    @Override // defpackage.hd3
    public final int c() {
        long g;
        int i;
        af3 af3Var = this.a;
        if (af3Var.j().l.isEmpty()) {
            return 0;
        }
        ue3 j = af3Var.j();
        if (j.p == rg4.x) {
            g = j.g() & 4294967295L;
        } else {
            g = j.g() >> 32;
        }
        int i2 = (int) g;
        int W = z51.W(af3Var.j());
        if (W == 0 || (i = i2 / W) < 1) {
            return 1;
        }
        return i;
    }

    @Override // defpackage.hd3
    public final boolean d() {
        return !this.a.j().l.isEmpty();
    }

    @Override // defpackage.hd3
    public final int e() {
        return Math.max(0, this.a.h());
    }
}
