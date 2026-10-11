package q0;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f8966a;

    /* renamed from: b, reason: collision with root package name */
    public r f8967b;

    public x(int i10) {
        this.f8966a = new SparseArray(i10);
    }

    public final void a(r rVar, int i10, int i11) {
        x xVar;
        int a10 = rVar.a(i10);
        SparseArray sparseArray = this.f8966a;
        if (sparseArray == null) {
            xVar = null;
        } else {
            xVar = (x) sparseArray.get(a10);
        }
        if (xVar == null) {
            xVar = new x(1);
            sparseArray.put(rVar.a(i10), xVar);
        }
        if (i11 > i10) {
            xVar.a(rVar, i10 + 1, i11);
        } else {
            xVar.f8967b = rVar;
        }
    }
}
