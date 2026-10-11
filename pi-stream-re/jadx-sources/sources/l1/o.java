package l1;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6712a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6713b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f6714c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f6715d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6716e;

    public /* synthetic */ o(Object obj, String str, long j4, long j10, int i10) {
        this.f6712a = i10;
        this.f6716e = obj;
        this.f6713b = str;
        this.f6714c = j4;
        this.f6715d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f6712a;
        Object obj = this.f6716e;
        switch (i10) {
            case 0:
                final String str = this.f6713b;
                final long j4 = this.f6714c;
                final long j10 = this.f6715d;
                s sVar = (s) ((androidx.appcompat.widget.a0) obj).f404c;
                int i11 = f1.b0.f3799a;
                k1.a0 a0Var = (k1.a0) ((j1.z) sVar).f5932a.f5687q;
                final k1.b V = a0Var.V();
                final int i12 = 1;
                a0Var.W(V, 1008, new f1.l(V, str, j10, j4, i12) { // from class: k1.f

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f6353a;

                    {
                        this.f6353a = i12;
                    }

                    @Override // f1.l
                    public final void invoke(Object obj2) {
                        switch (this.f6353a) {
                            case 0:
                                ((c) obj2).getClass();
                                return;
                            default:
                                ((c) obj2).getClass();
                                return;
                        }
                    }
                });
                return;
            default:
                b2.e0 e0Var = (b2.e0) obj;
                final String str2 = this.f6713b;
                final long j11 = this.f6714c;
                final long j12 = this.f6715d;
                e0Var.getClass();
                int i13 = f1.b0.f3799a;
                k1.a0 a0Var2 = (k1.a0) ((j1.z) e0Var.f1337b).f5932a.f5687q;
                final k1.b V2 = a0Var2.V();
                final int i14 = 0;
                a0Var2.W(V2, 1016, new f1.l(V2, str2, j12, j11, i14) { // from class: k1.f

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f6353a;

                    {
                        this.f6353a = i14;
                    }

                    @Override // f1.l
                    public final void invoke(Object obj2) {
                        switch (this.f6353a) {
                            case 0:
                                ((c) obj2).getClass();
                                return;
                            default:
                                ((c) obj2).getClass();
                                return;
                        }
                    }
                });
                return;
        }
    }
}
