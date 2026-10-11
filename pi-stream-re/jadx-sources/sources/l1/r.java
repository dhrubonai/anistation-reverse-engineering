package l1;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6732a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.a0 f6733b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.q0 f6734c;

    public /* synthetic */ r(androidx.appcompat.widget.a0 a0Var, androidx.lifecycle.q0 q0Var, int i10) {
        this.f6732a = i10;
        this.f6733b = a0Var;
        this.f6734c = q0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f6732a;
        final androidx.lifecycle.q0 q0Var = this.f6734c;
        androidx.appcompat.widget.a0 a0Var = this.f6733b;
        switch (i10) {
            case 0:
                s sVar = (s) a0Var.f404c;
                int i11 = f1.b0.f3799a;
                k1.a0 a0Var2 = (k1.a0) ((j1.z) sVar).f5932a.f5687q;
                final k1.b V = a0Var2.V();
                final int i12 = 1;
                a0Var2.W(V, 1032, new f1.l(V, q0Var, i12) { // from class: k1.q

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f6397a;

                    {
                        this.f6397a = i12;
                    }

                    @Override // f1.l
                    public final void invoke(Object obj) {
                        switch (this.f6397a) {
                            case 0:
                                ((c) obj).getClass();
                                return;
                            default:
                                ((c) obj).getClass();
                                return;
                        }
                    }
                });
                return;
            default:
                s sVar2 = (s) a0Var.f404c;
                int i13 = f1.b0.f3799a;
                k1.a0 a0Var3 = (k1.a0) ((j1.z) sVar2).f5932a.f5687q;
                final k1.b V2 = a0Var3.V();
                final int i14 = 0;
                a0Var3.W(V2, 1031, new f1.l(V2, q0Var, i14) { // from class: k1.q

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f6397a;

                    {
                        this.f6397a = i14;
                    }

                    @Override // f1.l
                    public final void invoke(Object obj) {
                        switch (this.f6397a) {
                            case 0:
                                ((c) obj).getClass();
                                return;
                            default:
                                ((c) obj).getClass();
                                return;
                        }
                    }
                });
                return;
        }
    }
}
