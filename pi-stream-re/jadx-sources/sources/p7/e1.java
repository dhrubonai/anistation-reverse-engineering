package p7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class e1 extends t7.n implements k0, x0, h7.l {

    /* renamed from: d, reason: collision with root package name */
    public k1 f8675d;

    @Override // p7.x0
    public final boolean a() {
        return true;
    }

    @Override // p7.k0
    public final void b() {
        boolean z9;
        t7.n nVar;
        boolean z10;
        k1 k10 = k();
        do {
            Object B = k10.B();
            z9 = false;
            if (B instanceof e1) {
                if (B == this) {
                    n0 n0Var = l1.f8720g;
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k1.f8709a;
                        if (atomicReferenceFieldUpdater.compareAndSet(k10, B, n0Var)) {
                            z9 = true;
                            break;
                        } else if (atomicReferenceFieldUpdater.get(k10) != B) {
                            break;
                        }
                    }
                } else {
                    return;
                }
            } else {
                if (!(B instanceof x0) || ((x0) B).d() == null) {
                    return;
                }
                do {
                    Object g10 = g();
                    if (g10 instanceof t7.u) {
                        t7.n nVar2 = ((t7.u) g10).f10088a;
                        return;
                    }
                    if (g10 == this) {
                        return;
                    }
                    r6.h0.r(g10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    nVar = (t7.n) g10;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = t7.n.f10077c;
                    t7.u uVar = (t7.u) atomicReferenceFieldUpdater2.get(nVar);
                    if (uVar == null) {
                        uVar = new t7.u(nVar);
                        atomicReferenceFieldUpdater2.lazySet(nVar, uVar);
                    }
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = t7.n.f10075a;
                        if (atomicReferenceFieldUpdater3.compareAndSet(this, g10, uVar)) {
                            z10 = true;
                            break;
                        } else if (atomicReferenceFieldUpdater3.get(this) != g10) {
                            z10 = false;
                            break;
                        }
                    }
                } while (!z10);
                nVar.e();
                return;
            }
        } while (!z9);
    }

    @Override // p7.x0
    public final n1 d() {
        return null;
    }

    public final k1 k() {
        k1 k1Var = this.f8675d;
        if (k1Var != null) {
            return k1Var;
        }
        r6.h0.X0("job");
        throw null;
    }

    public abstract void l(Throwable th);

    @Override // t7.n
    public final String toString() {
        return getClass().getSimpleName() + '@' + a0.z(this) + "[job@" + a0.z(k()) + ']';
    }
}
