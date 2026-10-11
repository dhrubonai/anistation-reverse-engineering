package androidx.concurrent.futures;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class f extends a {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f748a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f749b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f750c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f751d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f752e;

    public f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f748a = atomicReferenceFieldUpdater;
        this.f749b = atomicReferenceFieldUpdater2;
        this.f750c = atomicReferenceFieldUpdater3;
        this.f751d = atomicReferenceFieldUpdater4;
        this.f752e = atomicReferenceFieldUpdater5;
    }

    @Override // androidx.concurrent.futures.a
    public final boolean a(j jVar, e eVar, e eVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f751d;
            if (atomicReferenceFieldUpdater.compareAndSet(jVar, eVar, eVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(jVar) == eVar);
        return false;
    }

    @Override // androidx.concurrent.futures.a
    public final boolean b(j jVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f752e;
            if (atomicReferenceFieldUpdater.compareAndSet(jVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(jVar) == obj);
        return false;
    }

    @Override // androidx.concurrent.futures.a
    public final boolean c(j jVar, i iVar, i iVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f750c;
            if (atomicReferenceFieldUpdater.compareAndSet(jVar, iVar, iVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(jVar) == iVar);
        return false;
    }

    @Override // androidx.concurrent.futures.a
    public final void d(i iVar, i iVar2) {
        this.f749b.lazySet(iVar, iVar2);
    }

    @Override // androidx.concurrent.futures.a
    public final void e(i iVar, Thread thread) {
        this.f748a.lazySet(iVar, thread);
    }
}
