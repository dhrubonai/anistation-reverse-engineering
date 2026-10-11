package b2;

/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1325a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f1326b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j1.f f1327c;

    public /* synthetic */ d0(e0 e0Var, j1.f fVar, int i10) {
        this.f1325a = i10;
        this.f1326b = e0Var;
        this.f1327c = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1325a) {
            case 0:
                e0 e0Var = this.f1326b;
                e0Var.getClass();
                int i10 = f1.b0.f3799a;
                j1.d0 d0Var = ((j1.z) e0Var.f1337b).f5932a;
                d0Var.getClass();
                k1.a0 a0Var = (k1.a0) d0Var.f5687q;
                k1.b V = a0Var.V();
                a0Var.W(V, 1015, new k1.g(V, this.f1327c, 0));
                return;
            default:
                e0 e0Var2 = this.f1326b;
                j1.f fVar = this.f1327c;
                e0Var2.getClass();
                synchronized (fVar) {
                }
                f0 f0Var = e0Var2.f1337b;
                int i11 = f1.b0.f3799a;
                k1.a0 a0Var2 = (k1.a0) ((j1.z) f0Var).f5932a.f5687q;
                k1.b T = a0Var2.T(a0Var2.f6316d.f6411e);
                a0Var2.W(T, 1020, new k1.g(T, fVar, 3));
                return;
        }
    }
}
