package v7;

import h7.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p7.b2;
import w4.o;

/* loaded from: classes.dex */
public final class c implements p7.i, b2 {

    /* renamed from: a, reason: collision with root package name */
    public final p7.j f10674a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10675b = null;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f10676c;

    public c(e eVar, p7.j jVar) {
        this.f10676c = eVar;
        this.f10674a = jVar;
    }

    @Override // p7.b2
    public final void a(k kVar, int i10) {
        this.f10674a.a(kVar, i10);
    }

    @Override // p7.i
    public final void c(l lVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e.f10677h;
        Object obj = this.f10675b;
        e eVar = this.f10676c;
        atomicReferenceFieldUpdater.set(eVar, obj);
        this.f10674a.c(new b(eVar, this, 0));
    }

    @Override // p7.i
    public final o d(x6.a aVar) {
        w6.f fVar = w6.f.f11019a;
        e eVar = this.f10676c;
        o D = this.f10674a.D(fVar, new b(eVar, this, 1));
        if (D != null) {
            e.f10677h.set(eVar, this.f10675b);
        }
        return D;
    }

    @Override // p7.i
    public final o e(Throwable th) {
        return this.f10674a.e(th);
    }

    @Override // p7.i
    public final void g(Object obj) {
        this.f10674a.g(obj);
    }

    @Override // z6.e
    public final z6.i getContext() {
        return this.f10674a.f8701e;
    }

    @Override // z6.e
    public final void resumeWith(Object obj) {
        this.f10674a.resumeWith(obj);
    }
}
