package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class b1 extends bx7 {
    public final AtomicReferenceFieldUpdater i;
    public final AtomicReferenceFieldUpdater j;
    public final AtomicReferenceFieldUpdater k;
    public final AtomicReferenceFieldUpdater l;
    public final AtomicReferenceFieldUpdater m;

    public b1(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.i = atomicReferenceFieldUpdater;
        this.j = atomicReferenceFieldUpdater2;
        this.k = atomicReferenceFieldUpdater3;
        this.l = atomicReferenceFieldUpdater4;
        this.m = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.bx7
    public final void F(i1 i1Var, i1 i1Var2) {
        this.j.lazySet(i1Var, i1Var2);
    }

    @Override // defpackage.bx7
    public final void G(i1 i1Var, Thread thread) {
        this.i.lazySet(i1Var, thread);
    }

    @Override // defpackage.bx7
    public final boolean k(j1 j1Var, a1 a1Var, a1 a1Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.l;
            if (atomicReferenceFieldUpdater.compareAndSet(j1Var, a1Var, a1Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(j1Var) == a1Var);
        return false;
    }

    @Override // defpackage.bx7
    public final boolean l(j1 j1Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.m;
            if (atomicReferenceFieldUpdater.compareAndSet(j1Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(j1Var) == obj);
        return false;
    }

    @Override // defpackage.bx7
    public final boolean m(j1 j1Var, i1 i1Var, i1 i1Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.k;
            if (atomicReferenceFieldUpdater.compareAndSet(j1Var, i1Var, i1Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(j1Var) == i1Var);
        return false;
    }

    @Override // defpackage.bx7
    public final a1 t(j1 j1Var) {
        return (a1) this.l.getAndSet(j1Var, a1.d);
    }

    @Override // defpackage.bx7
    public final i1 u(j1 j1Var) {
        return (i1) this.k.getAndSet(j1Var, i1.c);
    }
}
