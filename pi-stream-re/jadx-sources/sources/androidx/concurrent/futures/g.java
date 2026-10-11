package androidx.concurrent.futures;

/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final j f753a;

    /* renamed from: b, reason: collision with root package name */
    public final u6.b f754b;

    public g(j jVar, u6.b bVar) {
        this.f753a = jVar;
        this.f754b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f753a.value != this) {
            return;
        }
        if (j.ATOMIC_HELPER.b(this.f753a, this, j.getFutureValue(this.f754b))) {
            j.complete(this.f753a);
        }
    }
}
