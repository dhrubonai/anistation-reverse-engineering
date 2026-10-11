package k9;

import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class o extends x6.e implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final j[] f6537a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f6538b;

    public o(j[] jVarArr, int[] iArr) {
        this.f6537a = jVarArr;
        this.f6538b = iArr;
    }

    @Override // x6.b
    public final int b() {
        return this.f6537a.length;
    }

    @Override // x6.b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        return super.contains((j) obj);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        return this.f6537a[i10];
    }

    @Override // x6.e, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof j)) {
            return -1;
        }
        return super.indexOf((j) obj);
    }

    @Override // x6.e, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof j)) {
            return -1;
        }
        return super.lastIndexOf((j) obj);
    }
}
