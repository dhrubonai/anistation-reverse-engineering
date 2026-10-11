package p7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class m extends c1 {

    /* renamed from: e, reason: collision with root package name */
    public final j f8721e;

    public m(j jVar) {
        this.f8721e = jVar;
    }

    @Override // h7.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        l((Throwable) obj);
        return w6.f.f11019a;
    }

    @Override // p7.e1
    public final void l(Throwable th) {
        boolean z9;
        k1 k10 = k();
        j jVar = this.f8721e;
        Throwable r8 = jVar.r(k10);
        boolean z10 = false;
        if (jVar.x()) {
            z6.e eVar = jVar.f8700d;
            r6.h0.r(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            t7.i iVar = (t7.i) eVar;
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = t7.i.f10061y;
                Object obj = atomicReferenceFieldUpdater.get(iVar);
                w4.o oVar = t7.j.f10067b;
                boolean z11 = true;
                if (r6.h0.g(obj, oVar)) {
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(iVar, oVar, r8)) {
                            z9 = true;
                            break;
                        } else if (atomicReferenceFieldUpdater.get(iVar) != oVar) {
                            z9 = false;
                            break;
                        }
                    }
                    if (z9) {
                        break;
                    }
                } else {
                    if (obj instanceof Throwable) {
                        break;
                    }
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(iVar, obj, null)) {
                            break;
                        } else if (atomicReferenceFieldUpdater.get(iVar) != obj) {
                            z11 = false;
                            break;
                        }
                    }
                    if (z11) {
                        break;
                    }
                }
            }
            z10 = true;
        }
        if (!z10) {
            jVar.o(r8);
            if (!jVar.x()) {
                jVar.p();
            }
        }
    }
}
