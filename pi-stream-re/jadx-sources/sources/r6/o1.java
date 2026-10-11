package r6;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class o1 extends o0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f9506c;

    public o1(p1 p1Var) {
        this.f9506c = p1Var;
    }

    @Override // r6.j0
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        p1 p1Var = this.f9506c;
        h0.n(i10, p1Var.f9514x);
        int i11 = i10 * 2;
        int i12 = p1Var.f9513f;
        Object[] objArr = p1Var.f9512e;
        Object obj = objArr[i12 + i11];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i11 + (i12 ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9506c.f9514x;
    }
}
