package t3;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class a implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f9996a;

    public a(e eVar) {
        this.f9996a = eVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.f9996a) {
            e eVar = this.f9996a;
            if (eVar.f10018z != null) {
                eVar.M();
                if (this.f9996a.x()) {
                    this.f9996a.K();
                    this.f9996a.B = 0;
                }
                return null;
            }
            return null;
        }
    }
}
