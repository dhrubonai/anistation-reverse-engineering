package l1;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6686a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.a0 f6687b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j1.f f6688c;

    public /* synthetic */ m(androidx.appcompat.widget.a0 a0Var, j1.f fVar, int i10) {
        this.f6686a = i10;
        this.f6687b = a0Var;
        this.f6688c = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6686a) {
            case 0:
                androidx.appcompat.widget.a0 a0Var = this.f6687b;
                j1.f fVar = this.f6688c;
                a0Var.getClass();
                synchronized (fVar) {
                }
                s sVar = (s) a0Var.f404c;
                int i10 = f1.b0.f3799a;
                k1.a0 a0Var2 = (k1.a0) ((j1.z) sVar).f5932a.f5687q;
                k1.b T = a0Var2.T(a0Var2.f6316d.f6411e);
                a0Var2.W(T, 1013, new k1.g(T, fVar, 2));
                return;
            default:
                s sVar2 = (s) this.f6687b.f404c;
                int i11 = f1.b0.f3799a;
                j1.d0 d0Var = ((j1.z) sVar2).f5932a;
                d0Var.getClass();
                k1.a0 a0Var3 = (k1.a0) d0Var.f5687q;
                k1.b V = a0Var3.V();
                a0Var3.W(V, 1007, new k1.g(V, this.f6688c, 1));
                return;
        }
    }
}
