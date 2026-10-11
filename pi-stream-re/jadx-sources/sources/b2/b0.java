package b2;

/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1300a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f1301b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f1302c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1303d;

    public /* synthetic */ b0(e0 e0Var, int i10, long j4) {
        this.f1301b = e0Var;
        this.f1303d = i10;
        this.f1302c = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f1300a;
        e0 e0Var = this.f1301b;
        switch (i10) {
            case 0:
                e0Var.getClass();
                int i11 = f1.b0.f3799a;
                k1.a0 a0Var = (k1.a0) ((j1.z) e0Var.f1337b).f5932a.f5687q;
                k1.b T = a0Var.T(a0Var.f6316d.f6411e);
                a0Var.W(T, 1018, new k1.d(this.f1303d, this.f1302c, T));
                return;
            default:
                long j4 = this.f1302c;
                int i12 = this.f1303d;
                e0Var.getClass();
                int i13 = f1.b0.f3799a;
                k1.a0 a0Var2 = (k1.a0) ((j1.z) e0Var.f1337b).f5932a.f5687q;
                k1.b T2 = a0Var2.T(a0Var2.f6316d.f6411e);
                a0Var2.W(T2, 1021, new k1.d(i12, 0, j4, T2));
                return;
        }
    }

    public /* synthetic */ b0(e0 e0Var, long j4, int i10) {
        this.f1301b = e0Var;
        this.f1302c = j4;
        this.f1303d = i10;
    }
}
