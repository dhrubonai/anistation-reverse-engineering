package k2;

import d2.b0;
import d2.g0;
import d2.r;

/* loaded from: classes.dex */
public final class f implements r {

    /* renamed from: a, reason: collision with root package name */
    public final long f6433a;

    /* renamed from: b, reason: collision with root package name */
    public final r f6434b;

    public f(long j4, r rVar) {
        this.f6433a = j4;
        this.f6434b = rVar;
    }

    @Override // d2.r
    public final void b() {
        this.f6434b.b();
    }

    @Override // d2.r
    public final g0 i(int i10, int i11) {
        return this.f6434b.i(i10, i11);
    }

    @Override // d2.r
    public final void s(b0 b0Var) {
        this.f6434b.s(new e(this, b0Var, b0Var));
    }
}
