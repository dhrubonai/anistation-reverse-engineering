package y2;

import android.util.SparseArray;
import d2.b0;
import d2.g0;
import d2.r;

/* loaded from: classes.dex */
public final class n implements r {

    /* renamed from: a, reason: collision with root package name */
    public final r f11567a;

    /* renamed from: b, reason: collision with root package name */
    public final k f11568b;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f11569c = new SparseArray();

    public n(r rVar, k kVar) {
        this.f11567a = rVar;
        this.f11568b = kVar;
    }

    @Override // d2.r
    public final void b() {
        this.f11567a.b();
    }

    @Override // d2.r
    public final g0 i(int i10, int i11) {
        r rVar = this.f11567a;
        if (i11 != 3) {
            return rVar.i(i10, i11);
        }
        SparseArray sparseArray = this.f11569c;
        o oVar = (o) sparseArray.get(i10);
        if (oVar != null) {
            return oVar;
        }
        o oVar2 = new o(rVar.i(i10, i11), this.f11568b);
        sparseArray.put(i10, oVar2);
        return oVar2;
    }

    @Override // d2.r
    public final void s(b0 b0Var) {
        this.f11567a.s(b0Var);
    }
}
