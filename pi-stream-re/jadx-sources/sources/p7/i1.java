package p7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class i1 extends t7.b {

    /* renamed from: b, reason: collision with root package name */
    public final t7.n f8693b;

    /* renamed from: c, reason: collision with root package name */
    public t7.n f8694c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k1 f8695d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8696e;

    public i1(t7.n nVar, k1 k1Var, Object obj) {
        this.f8695d = k1Var;
        this.f8696e = obj;
        this.f8693b = nVar;
    }

    @Override // t7.b
    public final void b(Object obj, Object obj2) {
        boolean z9;
        t7.n nVar;
        t7.n nVar2 = (t7.n) obj;
        boolean z10 = true;
        if (obj2 == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        t7.n nVar3 = this.f8693b;
        if (z9) {
            nVar = nVar3;
        } else {
            nVar = this.f8694c;
        }
        if (nVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = t7.n.f10075a;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(nVar2, this, nVar)) {
                    break;
                } else if (atomicReferenceFieldUpdater.get(nVar2) != this) {
                    z10 = false;
                    break;
                }
            }
            if (z10 && z9) {
                t7.n nVar4 = this.f8694c;
                r6.h0.q(nVar4);
                nVar3.f(nVar4);
            }
        }
    }

    @Override // t7.b
    public final w4.o c(Object obj) {
        boolean z9;
        if (this.f8695d.B() == this.f8696e) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            return null;
        }
        return t7.l.f10074a;
    }
}
