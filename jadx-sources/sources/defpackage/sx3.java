package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sx3 implements jz1 {
    public final jz1 a;
    public final yg6 b;

    public sx3(jz1 jz1Var, yg6 yg6Var) {
        this.a = jz1Var;
        this.b = yg6Var;
    }

    @Override // defpackage.jz1
    public final boolean a(int i, long j) {
        return this.a.a(i, j);
    }

    @Override // defpackage.jz1
    public final void b(long j, long j2, long j3, List list, ep3[] ep3VarArr) {
        this.a.b(j, j2, j3, list, ep3VarArr);
    }

    @Override // defpackage.jz1
    public final yg6 c() {
        return this.b;
    }

    @Override // defpackage.jz1
    public final int d() {
        return this.a.d();
    }

    @Override // defpackage.jz1
    public final void e() {
        this.a.e();
    }

    public final boolean equals(Object obj) {
        if (v(obj) && (obj instanceof sx3)) {
            return this.b.equals(((sx3) obj).b);
        }
        return false;
    }

    @Override // defpackage.jz1
    public final boolean f(long j, pl0 pl0Var, List list) {
        return this.a.f(j, pl0Var, list);
    }

    @Override // defpackage.jz1
    public final void g(boolean z) {
        this.a.g(z);
    }

    @Override // defpackage.jz1
    public final ea2 h(int i) {
        return this.b.d[this.a.j(i)];
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.jz1
    public final void i() {
        this.a.i();
    }

    @Override // defpackage.jz1
    public final int j(int i) {
        return this.a.j(i);
    }

    @Override // defpackage.jz1
    public final int k(long j, List list) {
        return this.a.k(j, list);
    }

    @Override // defpackage.jz1
    public final void l() {
        this.a.l();
    }

    @Override // defpackage.jz1
    public final int length() {
        return this.a.length();
    }

    @Override // defpackage.jz1
    public final int m() {
        return this.a.m();
    }

    @Override // defpackage.jz1
    public final ea2 n() {
        return this.b.d[this.a.m()];
    }

    @Override // defpackage.jz1
    public final int o() {
        return this.a.o();
    }

    @Override // defpackage.jz1
    public final boolean p(int i, long j) {
        return this.a.p(i, j);
    }

    @Override // defpackage.jz1
    public final void q(float f) {
        this.a.q(f);
    }

    @Override // defpackage.jz1
    public final Object r() {
        return this.a.r();
    }

    @Override // defpackage.jz1
    public final void s() {
        this.a.s();
    }

    @Override // defpackage.jz1
    public final void t() {
        this.a.t();
    }

    @Override // defpackage.jz1
    public final int u(int i) {
        return this.a.u(i);
    }

    public final boolean v(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx3)) {
            return false;
        }
        return this.a.equals(((sx3) obj).a);
    }
}
