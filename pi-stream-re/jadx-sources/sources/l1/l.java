package l1;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6682a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.a0 f6683b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Exception f6684c;

    public /* synthetic */ l(androidx.appcompat.widget.a0 a0Var, Exception exc, int i10) {
        this.f6682a = i10;
        this.f6683b = a0Var;
        this.f6684c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f6682a;
        Exception exc = this.f6684c;
        androidx.appcompat.widget.a0 a0Var = this.f6683b;
        switch (i10) {
            case 0:
                s sVar = (s) a0Var.f404c;
                int i11 = f1.b0.f3799a;
                k1.a0 a0Var2 = (k1.a0) ((j1.z) sVar).f5932a.f5687q;
                k1.b V = a0Var2.V();
                a0Var2.W(V, 1029, new k1.y(V, exc, 2));
                return;
            default:
                s sVar2 = (s) a0Var.f404c;
                int i12 = f1.b0.f3799a;
                k1.a0 a0Var3 = (k1.a0) ((j1.z) sVar2).f5932a.f5687q;
                k1.b V2 = a0Var3.V();
                a0Var3.W(V2, 1014, new k1.y(V2, exc, 1));
                return;
        }
    }
}
