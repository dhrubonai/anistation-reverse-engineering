package v1;

/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10429a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f10430b;

    public /* synthetic */ g0(m0 m0Var, int i10) {
        this.f10429a = i10;
        this.f10430b = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f10429a;
        m0 m0Var = this.f10430b;
        switch (i10) {
            case 0:
                m0Var.z();
                return;
            case 1:
                if (!m0Var.f10472d0) {
                    t tVar = m0Var.I;
                    tVar.getClass();
                    tVar.s(m0Var);
                    return;
                }
                return;
            default:
                m0Var.X = true;
                return;
        }
    }
}
