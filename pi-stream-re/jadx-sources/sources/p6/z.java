package p6;

/* loaded from: classes.dex */
public final class z extends w {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f8633x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f8634y;

    public /* synthetic */ z(Object obj, int i10) {
        this.f8633x = i10;
        this.f8634y = obj;
    }

    @Override // p6.w
    public final void b() {
        switch (this.f8633x) {
            case 0:
                synchronized (((c) this.f8634y).f8609f) {
                    if (((c) this.f8634y).f8615l.get() > 0 && ((c) this.f8634y).f8615l.decrementAndGet() > 0) {
                        ((c) this.f8634y).f8605b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                        return;
                    }
                    c cVar = (c) this.f8634y;
                    if (cVar.f8617n != null) {
                        cVar.f8605b.b("Unbind from service.", new Object[0]);
                        c cVar2 = (c) this.f8634y;
                        cVar2.f8604a.unbindService(cVar2.f8616m);
                        Object obj = this.f8634y;
                        ((c) obj).f8610g = false;
                        ((c) obj).f8617n = null;
                        ((c) obj).f8616m = null;
                    }
                    ((c) this.f8634y).e();
                    return;
                }
            default:
                b bVar = (b) this.f8634y;
                c cVar3 = bVar.f8601a;
                cVar3.f8605b.b("unlinkToDeath", new Object[0]);
                cVar3.f8617n.asBinder().unlinkToDeath(cVar3.f8614k, 0);
                c cVar4 = bVar.f8601a;
                cVar4.f8617n = null;
                cVar4.f8610g = false;
                return;
        }
    }
}
