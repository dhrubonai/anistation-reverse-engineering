package androidx.fragment.app;

/* loaded from: classes.dex */
public final class l1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f926a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m1 f927b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n1 f928c;

    public /* synthetic */ l1(n1 n1Var, m1 m1Var, int i10) {
        this.f926a = i10;
        this.f928c = n1Var;
        this.f927b = m1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f926a;
        m1 m1Var = this.f927b;
        n1 n1Var = this.f928c;
        switch (i10) {
            case 0:
                if (n1Var.f943b.contains(m1Var)) {
                    a3.g.b(m1Var.f932a, m1Var.f934c.V);
                    return;
                }
                return;
            default:
                n1Var.f943b.remove(m1Var);
                n1Var.f944c.remove(m1Var);
                return;
        }
    }
}
