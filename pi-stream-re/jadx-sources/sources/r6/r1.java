package r6;

import java.util.Objects;

/* loaded from: classes.dex */
public final class r1 extends o0 {

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f9526c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f9527d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f9528e;

    public r1(Object[] objArr, int i10, int i11) {
        this.f9526c = objArr;
        this.f9527d = i10;
        this.f9528e = i11;
    }

    @Override // r6.j0
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        h0.n(i10, this.f9528e);
        Object obj = this.f9526c[(i10 * 2) + this.f9527d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9528e;
    }
}
