package p7;

/* loaded from: classes.dex */
public final class f1 extends j {

    /* renamed from: z, reason: collision with root package name */
    public final k1 f8679z;

    public f1(z6.e eVar, k1 k1Var) {
        super(1, eVar);
        this.f8679z = k1Var;
    }

    @Override // p7.j
    public final Throwable r(k1 k1Var) {
        Throwable c6;
        Object B = this.f8679z.B();
        if ((B instanceof h1) && (c6 = ((h1) B).c()) != null) {
            return c6;
        }
        if (B instanceof t) {
            return ((t) B).f8743a;
        }
        return k1Var.s();
    }

    @Override // p7.j
    public final String z() {
        return "AwaitContinuation";
    }
}
