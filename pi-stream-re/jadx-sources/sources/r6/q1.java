package r6;

/* loaded from: classes.dex */
public final class q1 extends t0 {

    /* renamed from: d, reason: collision with root package name */
    public final transient r0 f9521d;

    /* renamed from: e, reason: collision with root package name */
    public final transient o0 f9522e;

    public q1(r0 r0Var, r1 r1Var) {
        this.f9521d = r0Var;
        this.f9522e = r1Var;
    }

    @Override // r6.t0, r6.j0
    public final o0 b() {
        return this.f9522e;
    }

    @Override // r6.j0
    public final int c(int i10, Object[] objArr) {
        return this.f9522e.c(i10, objArr);
    }

    @Override // r6.j0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (this.f9521d.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // r6.j0
    public final boolean g() {
        return true;
    }

    @Override // r6.t0
    /* renamed from: l */
    public final d2 iterator() {
        return this.f9522e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((s1) this.f9521d).f9534f;
    }
}
