package r6;

import java.util.Objects;

/* loaded from: classes.dex */
public final class n1 extends o0 {

    /* renamed from: e, reason: collision with root package name */
    public static final n1 f9497e = new n1(new Object[0], 0);

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f9498c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f9499d;

    public n1(Object[] objArr, int i10) {
        this.f9498c = objArr;
        this.f9499d = i10;
    }

    @Override // r6.o0, r6.j0
    public final int c(int i10, Object[] objArr) {
        Object[] objArr2 = this.f9498c;
        int i11 = this.f9499d;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // r6.j0
    public final Object[] d() {
        return this.f9498c;
    }

    @Override // r6.j0
    public final int e() {
        return this.f9499d;
    }

    @Override // r6.j0
    public final int f() {
        return 0;
    }

    @Override // r6.j0
    public final boolean g() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        h0.n(i10, this.f9499d);
        Object obj = this.f9498c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9499d;
    }
}
