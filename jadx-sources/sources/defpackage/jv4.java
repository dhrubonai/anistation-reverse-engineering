package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jv4 implements bh6 {
    public final f95 a;
    public final f95 b;
    public final vg1 c = new vg1();
    public final AtomicBoolean d = new AtomicBoolean(false);

    public jv4(f95 f95Var) {
        this.a = f95Var;
        this.b = f95Var;
    }

    @Override // defpackage.bh6
    public final void a(long j, int i, int i2, int i3, ah6 ah6Var) {
        h().a(j, i, i2, i3, ah6Var);
    }

    @Override // defpackage.bh6
    public final void b(zi4 zi4Var, int i, int i2) {
        h().b(zi4Var, i, i2);
    }

    @Override // defpackage.bh6
    public final int c(m41 m41Var, int i, boolean z) {
        return h().c(m41Var, i, z);
    }

    @Override // defpackage.bh6
    public final void e(int i, zi4 zi4Var) {
        h().e(i, zi4Var);
    }

    @Override // defpackage.bh6
    public final int f(m41 m41Var, int i, boolean z) {
        return h().f(m41Var, i, z);
    }

    @Override // defpackage.bh6
    public final void g(ea2 ea2Var) {
        this.a.g(ea2Var);
    }

    public final bh6 h() {
        if (this.d.get()) {
            return this.c;
        }
        return this.b;
    }

    @Override // defpackage.bh6
    public final void d(long j) {
    }
}
