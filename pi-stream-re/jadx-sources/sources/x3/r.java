package x3;

/* loaded from: classes.dex */
public final class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11247a;

    /* renamed from: b, reason: collision with root package name */
    public final l4.g f11248b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f11249c;

    public /* synthetic */ r(u uVar, l4.g gVar, int i10) {
        this.f11247a = i10;
        this.f11249c = uVar;
        this.f11248b = gVar;
    }

    private void a() {
        l4.h hVar = (l4.h) this.f11248b;
        hVar.f6834b.a();
        synchronized (hVar.f6835c) {
            synchronized (this.f11249c) {
                t tVar = this.f11249c.f11253a;
                l4.g gVar = this.f11248b;
                tVar.getClass();
                if (tVar.f11252a.contains(new s(gVar, z7.c.f12113g))) {
                    this.f11249c.M.a();
                    u uVar = this.f11249c;
                    l4.g gVar2 = this.f11248b;
                    uVar.getClass();
                    try {
                        ((l4.h) gVar2).m(uVar.M, uVar.I, uVar.P);
                        this.f11249c.j(this.f11248b);
                    } catch (Throwable th) {
                        throw new d(th);
                    }
                }
                this.f11249c.d();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11247a) {
            case 0:
                l4.h hVar = (l4.h) this.f11248b;
                hVar.f6834b.a();
                synchronized (hVar.f6835c) {
                    synchronized (this.f11249c) {
                        t tVar = this.f11249c.f11253a;
                        l4.g gVar = this.f11248b;
                        tVar.getClass();
                        if (tVar.f11252a.contains(new s(gVar, z7.c.f12113g))) {
                            u uVar = this.f11249c;
                            l4.g gVar2 = this.f11248b;
                            uVar.getClass();
                            try {
                                ((l4.h) gVar2).k(uVar.K, 5);
                            } catch (Throwable th) {
                                throw new d(th);
                            }
                        }
                        this.f11249c.d();
                    }
                }
                return;
            default:
                a();
                return;
        }
    }
}
