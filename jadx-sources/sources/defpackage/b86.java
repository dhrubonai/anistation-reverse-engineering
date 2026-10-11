package defpackage;

import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class b86 extends ge6 {
    public jh6 A;
    public g34 B;
    public bb2 C;
    public final oe2 D;

    public b86(oe2 oe2Var, ts6 ts6Var) {
        super(ts6Var);
        this.D = oe2Var;
    }

    @Override // defpackage.ge6
    public final synchronized void b() {
        jh6 jh6Var = this.A;
        jh6Var.getClass();
        jh6Var.q();
        super.b();
    }

    @Override // defpackage.ge6
    public final int d() {
        int size;
        jh6 jh6Var = this.A;
        jh6Var.getClass();
        synchronized (jh6Var) {
            size = ((ArrayDeque) jh6Var.B).size();
        }
        return size;
    }

    @Override // defpackage.ge6
    public final void f(final int i, final long j) {
        final bb2 bb2Var = this.C;
        bb2Var.getClass();
        this.B.getClass();
        this.x.f(new ss6() { // from class: a86
            @Override // defpackage.ss6
            public final void run() {
                b86 b86Var = b86.this;
                int i2 = i;
                bb2 bb2Var2 = bb2Var;
                long j2 = j;
                ea2 ea2Var = bb2Var2.a;
                we2 we2Var = new we2(i2, -1, ea2Var.w, ea2Var.x);
                jh6 jh6Var = b86Var.A;
                jh6Var.getClass();
                jh6Var.e(we2Var, j2);
                LinkedHashMap linkedHashMap = a61.a;
                synchronized (a61.class) {
                }
            }
        }, true);
    }

    @Override // defpackage.te2
    public final void h() {
        this.A.getClass();
        jh6 jh6Var = this.A;
        Objects.requireNonNull(jh6Var);
        this.x.f(new cc1(jh6Var, (byte) 1), true);
    }

    @Override // defpackage.te2
    public final void k(we2 we2Var) {
        this.x.f(new fj0(this, we2Var, (byte) 5), true);
    }

    @Override // defpackage.ge6
    public final void l(bb2 bb2Var, boolean z) {
        this.C = bb2Var;
    }

    @Override // defpackage.ge6
    public final void m(g34 g34Var) {
        this.B = g34Var;
    }

    @Override // defpackage.ge6
    public final void n(oa1 oa1Var) {
        this.A = new jh6(this.D, oa1Var, this.x);
    }
}
