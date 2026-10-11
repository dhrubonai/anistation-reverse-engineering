package r6;

/* loaded from: classes.dex */
public final class t1 extends t0 {
    public static final t1 A;

    /* renamed from: z, reason: collision with root package name */
    public static final Object[] f9540z;

    /* renamed from: d, reason: collision with root package name */
    public final transient Object[] f9541d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f9542e;

    /* renamed from: f, reason: collision with root package name */
    public final transient Object[] f9543f;

    /* renamed from: x, reason: collision with root package name */
    public final transient int f9544x;

    /* renamed from: y, reason: collision with root package name */
    public final transient int f9545y;

    static {
        Object[] objArr = new Object[0];
        f9540z = objArr;
        A = new t1(objArr, 0, objArr, 0, 0);
    }

    public t1(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f9541d = objArr;
        this.f9542e = i10;
        this.f9543f = objArr2;
        this.f9544x = i11;
        this.f9545y = i12;
    }

    @Override // r6.j0
    public final int c(int i10, Object[] objArr) {
        Object[] objArr2 = this.f9541d;
        int i11 = this.f9545y;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // r6.j0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f9543f;
            if (objArr.length != 0) {
                int K0 = h0.K0(obj);
                while (true) {
                    int i10 = K0 & this.f9544x;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    K0 = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override // r6.j0
    public final Object[] d() {
        return this.f9541d;
    }

    @Override // r6.j0
    public final int e() {
        return this.f9545y;
    }

    @Override // r6.j0
    public final int f() {
        return 0;
    }

    @Override // r6.j0
    public final boolean g() {
        return false;
    }

    @Override // r6.t0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f9542e;
    }

    @Override // r6.t0
    public final o0 k() {
        return o0.h(this.f9545y, this.f9541d);
    }

    @Override // r6.t0
    /* renamed from: l */
    public final d2 iterator() {
        return b().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f9545y;
    }
}
