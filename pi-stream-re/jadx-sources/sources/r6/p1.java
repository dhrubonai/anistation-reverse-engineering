package r6;

import java.util.Map;

/* loaded from: classes.dex */
public final class p1 extends t0 {

    /* renamed from: d, reason: collision with root package name */
    public final transient r0 f9511d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f9512e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f9513f = 0;

    /* renamed from: x, reason: collision with root package name */
    public final transient int f9514x;

    public p1(r0 r0Var, Object[] objArr, int i10) {
        this.f9511d = r0Var;
        this.f9512e = objArr;
        this.f9514x = i10;
    }

    @Override // r6.j0
    public final int c(int i10, Object[] objArr) {
        return b().c(i10, objArr);
    }

    @Override // r6.j0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        if (value == null || !value.equals(this.f9511d.get(key))) {
            return false;
        }
        return true;
    }

    @Override // r6.j0
    public final boolean g() {
        return true;
    }

    @Override // r6.t0
    public final o0 k() {
        return new o1(this);
    }

    @Override // r6.t0
    /* renamed from: l */
    public final d2 iterator() {
        return b().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f9514x;
    }
}
