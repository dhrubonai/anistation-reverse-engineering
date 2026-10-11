package y0;

import r6.h0;

/* loaded from: classes.dex */
public final class d extends c {
    public d() {
        this(a.f11462b);
    }

    @Override // y0.c
    public final Object a(b bVar) {
        h0.u(bVar, "key");
        return this.f11463a.get(bVar);
    }

    public final void b(b bVar, Object obj) {
        this.f11463a.put(bVar, obj);
    }

    public d(c cVar) {
        h0.u(cVar, "initialExtras");
        this.f11463a.putAll(cVar.f11463a);
    }
}
