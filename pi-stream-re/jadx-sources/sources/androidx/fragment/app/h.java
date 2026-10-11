package androidx.fragment.app;

/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m1 f891a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m1 f892b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f893c;

    public h(m1 m1Var, m1 m1Var2, boolean z9, n.e eVar) {
        this.f891a = m1Var;
        this.f892b = m1Var2;
        this.f893c = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y yVar = this.f891a.f934c;
        y yVar2 = this.f892b.f934c;
        g1 g1Var = b1.f847a;
        if (this.f893c) {
            yVar2.getClass();
        } else {
            yVar.getClass();
        }
    }
}
