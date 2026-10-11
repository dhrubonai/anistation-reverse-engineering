package v1;

import java.util.List;

/* loaded from: classes.dex */
public final class d0 implements y1.s {

    /* renamed from: a, reason: collision with root package name */
    public final y1.s f10390a;

    /* renamed from: b, reason: collision with root package name */
    public final c1.f1 f10391b;

    public d0(y1.s sVar, c1.f1 f1Var) {
        this.f10390a = sVar;
        this.f10391b = f1Var;
    }

    @Override // y1.s
    public final void a(boolean z9) {
        this.f10390a.a(z9);
    }

    @Override // y1.s
    public final boolean b(int i10, long j4) {
        return this.f10390a.b(i10, j4);
    }

    @Override // y1.s
    public final c1.v c(int i10) {
        return this.f10391b.f1693d[this.f10390a.f(i10)];
    }

    @Override // y1.s
    public final int d(c1.v vVar) {
        return this.f10390a.u(this.f10391b.b(vVar));
    }

    @Override // y1.s
    public final void e() {
        this.f10390a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (this.f10390a.equals(d0Var.f10390a) && this.f10391b.equals(d0Var.f10391b)) {
            return true;
        }
        return false;
    }

    @Override // y1.s
    public final int f(int i10) {
        return this.f10390a.f(i10);
    }

    @Override // y1.s
    public final int g(long j4, List list) {
        return this.f10390a.g(j4, list);
    }

    @Override // y1.s
    public final void h(long j4, long j10, long j11, List list, w1.p[] pVarArr) {
        this.f10390a.h(j4, j10, j11, list, pVarArr);
    }

    public final int hashCode() {
        return this.f10390a.hashCode() + ((this.f10391b.hashCode() + 527) * 31);
    }

    @Override // y1.s
    public final void i() {
        this.f10390a.i();
    }

    @Override // y1.s
    public final int j() {
        return this.f10390a.j();
    }

    @Override // y1.s
    public final c1.f1 k() {
        return this.f10391b;
    }

    @Override // y1.s
    public final c1.v l() {
        return this.f10391b.f1693d[this.f10390a.j()];
    }

    @Override // y1.s
    public final int length() {
        return this.f10390a.length();
    }

    @Override // y1.s
    public final int m() {
        return this.f10390a.m();
    }

    @Override // y1.s
    public final int n() {
        return this.f10390a.n();
    }

    @Override // y1.s
    public final boolean o(int i10, long j4) {
        return this.f10390a.o(i10, j4);
    }

    @Override // y1.s
    public final void p(float f10) {
        this.f10390a.p(f10);
    }

    @Override // y1.s
    public final Object q() {
        return this.f10390a.q();
    }

    @Override // y1.s
    public final void r() {
        this.f10390a.r();
    }

    @Override // y1.s
    public final boolean s(long j4, w1.f fVar, List list) {
        return this.f10390a.s(j4, fVar, list);
    }

    @Override // y1.s
    public final void t() {
        this.f10390a.t();
    }

    @Override // y1.s
    public final int u(int i10) {
        return this.f10390a.u(i10);
    }
}
