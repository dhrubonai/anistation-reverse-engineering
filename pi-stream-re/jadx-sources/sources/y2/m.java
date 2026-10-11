package y2;

import android.util.SparseArray;
import d2.p;
import d2.q;
import d2.r;
import d2.t;

/* loaded from: classes.dex */
public final class m implements p {

    /* renamed from: a, reason: collision with root package name */
    public final p f11564a;

    /* renamed from: b, reason: collision with root package name */
    public final k f11565b;

    /* renamed from: c, reason: collision with root package name */
    public n f11566c;

    public m(p pVar, k kVar) {
        this.f11564a = pVar;
        this.f11565b = kVar;
    }

    @Override // d2.p
    public final void a() {
        this.f11564a.a();
    }

    @Override // d2.p
    public final p c() {
        return this.f11564a;
    }

    @Override // d2.p
    public final void e(long j4, long j10) {
        n nVar = this.f11566c;
        if (nVar != null) {
            int i10 = 0;
            while (true) {
                SparseArray sparseArray = nVar.f11569c;
                if (i10 >= sparseArray.size()) {
                    break;
                }
                l lVar = ((o) sparseArray.valueAt(i10)).f11577h;
                if (lVar != null) {
                    lVar.f();
                }
                i10++;
            }
        }
        this.f11564a.e(j4, j10);
    }

    @Override // d2.p
    public final void f(r rVar) {
        n nVar = new n(rVar, this.f11565b);
        this.f11566c = nVar;
        this.f11564a.f(nVar);
    }

    @Override // d2.p
    public final boolean h(q qVar) {
        return this.f11564a.h(qVar);
    }

    @Override // d2.p
    public final int i(q qVar, t tVar) {
        return this.f11564a.i(qVar, tVar);
    }
}
