package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bj0 extends r61 implements k16 {
    public k16 B;
    public long C;
    public final /* synthetic */ byte D = 0;
    public Object E;

    public bj0(jd1 jd1Var) {
        this.E = jd1Var;
    }

    @Override // defpackage.k16
    public final int a(long j) {
        k16 k16Var = this.B;
        k16Var.getClass();
        return k16Var.a(j - this.C);
    }

    @Override // defpackage.k16
    public final long e(int i) {
        k16 k16Var = this.B;
        k16Var.getClass();
        return k16Var.e(i) + this.C;
    }

    @Override // defpackage.r61
    public final void f() {
        this.y = 0;
        this.z = 0L;
        this.A = false;
        this.B = null;
    }

    @Override // defpackage.k16
    public final List g(long j) {
        k16 k16Var = this.B;
        k16Var.getClass();
        return k16Var.g(j - this.C);
    }

    @Override // defpackage.k16
    public final int h() {
        k16 k16Var = this.B;
        k16Var.getClass();
        return k16Var.h();
    }

    @Override // defpackage.r61
    public final void i() {
        switch (this.D) {
            case 0:
                cj0 cj0Var = (cj0) ((h5) this.E).y;
                f();
                cj0Var.b.add(this);
                return;
            default:
                ((jd1) this.E).m(this);
                return;
        }
    }

    public /* synthetic */ bj0() {
    }
}
