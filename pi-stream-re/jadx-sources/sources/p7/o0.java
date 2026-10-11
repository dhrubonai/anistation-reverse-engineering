package p7;

/* loaded from: classes.dex */
public final class o0 extends p0 {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f8726c;

    public o0(x1 x1Var, long j4) {
        super(j4);
        this.f8726c = x1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8726c.run();
    }

    @Override // p7.p0
    public final String toString() {
        return super.toString() + this.f8726c;
    }
}
