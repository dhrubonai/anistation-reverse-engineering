package androidx.fragment.app;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f867a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f868b;

    public /* synthetic */ e(Object obj, int i10) {
        this.f867a = i10;
        this.f868b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f867a;
        Object obj = this.f868b;
        switch (i10) {
            case 0:
                f fVar = (f) obj;
                fVar.f878b.endViewTransition(fVar.f879c);
                fVar.f880d.b();
                return;
            case 1:
                q qVar = (q) obj;
                qVar.f953p0.onDismiss(qVar.f961x0);
                return;
            default:
                ((s0) obj).x(true);
                return;
        }
    }
}
