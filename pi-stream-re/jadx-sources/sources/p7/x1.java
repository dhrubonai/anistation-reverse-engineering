package p7;

/* loaded from: classes.dex */
public final class x1 extends t7.w implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final long f8756e;

    public x1(long j4, b7.c cVar) {
        super(cVar, cVar.getContext());
        this.f8756e = j4;
    }

    @Override // p7.a, p7.k1
    public final String J() {
        return super.J() + "(timeMillis=" + this.f8756e + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        f0 f0Var;
        z6.g r8 = this.f8635c.r(androidx.lifecycle.q0.A);
        if (r8 instanceof f0) {
            f0Var = (f0) r8;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            f0 f0Var2 = c0.f8669a;
        }
        k(new w1("Timed out waiting for " + this.f8756e + " ms", this));
    }
}
