package y1;

import c1.f1;

/* loaded from: classes.dex */
public final class g extends n implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public final int f11496e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11497f;

    public g(int i10, f1 f1Var, int i11, j jVar, int i12) {
        super(i10, i11, f1Var);
        this.f11496e = p.h(i12, jVar.N) ? 1 : 0;
        this.f11497f = this.f11509d.b();
    }

    @Override // y1.n
    public final int a() {
        return this.f11496e;
    }

    @Override // y1.n
    public final /* bridge */ /* synthetic */ boolean b(n nVar) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f11497f, ((g) obj).f11497f);
    }
}
