package r6;

/* loaded from: classes.dex */
public final class a2 extends t0 {

    /* renamed from: d, reason: collision with root package name */
    public final transient Object f9438d;

    public a2(Object obj) {
        obj.getClass();
        this.f9438d = obj;
    }

    @Override // r6.t0, r6.j0
    public final o0 b() {
        return o0.o(this.f9438d);
    }

    @Override // r6.j0
    public final int c(int i10, Object[] objArr) {
        objArr[i10] = this.f9438d;
        return i10 + 1;
    }

    @Override // r6.j0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f9438d.equals(obj);
    }

    @Override // r6.j0
    public final boolean g() {
        return false;
    }

    @Override // r6.t0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f9438d.hashCode();
    }

    @Override // r6.t0
    /* renamed from: l */
    public final d2 iterator() {
        return new v0(this.f9438d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f9438d.toString() + ']';
    }
}
