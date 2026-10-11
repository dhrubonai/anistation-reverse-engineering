package v1;

/* loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10564a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f10565b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f10566c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f10567d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f10568e;

    public /* synthetic */ y(b0 b0Var, c0 c0Var, n nVar, s sVar, int i10) {
        this.f10564a = i10;
        this.f10565b = b0Var;
        this.f10566c = c0Var;
        this.f10567d = nVar;
        this.f10568e = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f10564a;
        s sVar = this.f10568e;
        n nVar = this.f10567d;
        c0 c0Var = this.f10566c;
        b0 b0Var = this.f10565b;
        switch (i10) {
            case 0:
                c0Var.B(b0Var.f10365a, b0Var.f10366b, nVar, sVar);
                return;
            case 1:
                c0Var.q(b0Var.f10365a, b0Var.f10366b, nVar, sVar);
                return;
            default:
                c0Var.F(b0Var.f10365a, b0Var.f10366b, nVar, sVar);
                return;
        }
    }
}
