package androidx.appcompat.widget;

/* loaded from: classes.dex */
public final /* synthetic */ class z3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f734a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f735b;

    public /* synthetic */ z3(Toolbar toolbar, int i10) {
        this.f734a = i10;
        this.f735b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j.q qVar;
        int i10 = this.f734a;
        Toolbar toolbar = this.f735b;
        switch (i10) {
            case 0:
                toolbar.l();
                return;
            default:
                c4 c4Var = toolbar.f386f0;
                if (c4Var == null) {
                    qVar = null;
                } else {
                    qVar = c4Var.f436b;
                }
                if (qVar != null) {
                    qVar.collapseActionView();
                    return;
                }
                return;
        }
    }
}
