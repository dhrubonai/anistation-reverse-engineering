package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class t2 extends zz {
    public final AtomicReferenceFieldUpdater k;
    public final AtomicReferenceFieldUpdater l;
    public final AtomicReferenceFieldUpdater m;
    public final AtomicReferenceFieldUpdater n;
    public final AtomicReferenceFieldUpdater o;

    public t2(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.k = atomicReferenceFieldUpdater;
        this.l = atomicReferenceFieldUpdater2;
        this.m = atomicReferenceFieldUpdater3;
        this.n = atomicReferenceFieldUpdater4;
        this.o = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.zz
    public final void S(w2 w2Var, w2 w2Var2) {
        this.l.lazySet(w2Var, w2Var2);
    }

    @Override // defpackage.zz
    public final void T(w2 w2Var, Thread thread) {
        this.k.lazySet(w2Var, thread);
    }

    @Override // defpackage.zz
    public final boolean n(x2 x2Var, s2 s2Var, s2 s2Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.n;
            if (atomicReferenceFieldUpdater.compareAndSet(x2Var, s2Var, s2Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(x2Var) == s2Var);
        return false;
    }

    @Override // defpackage.zz
    public final boolean o(x2 x2Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.o;
            if (atomicReferenceFieldUpdater.compareAndSet(x2Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(x2Var) == obj);
        return false;
    }

    @Override // defpackage.zz
    public final boolean p(x2 x2Var, w2 w2Var, w2 w2Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.m;
            if (atomicReferenceFieldUpdater.compareAndSet(x2Var, w2Var, w2Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(x2Var) == w2Var);
        return false;
    }
}
