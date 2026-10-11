package c0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1602a;

    /* renamed from: b, reason: collision with root package name */
    public c f1603b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1604c;

    public final void a(c cVar) {
        synchronized (this) {
            while (this.f1604c) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.f1603b == cVar) {
                return;
            }
            this.f1603b = cVar;
            if (this.f1602a) {
                cVar.p();
            }
        }
    }
}
