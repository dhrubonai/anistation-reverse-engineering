package m3;

import android.util.SparseArray;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f7349a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public int f7350b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Set f7351c = Collections.newSetFromMap(new IdentityHashMap());

    public final p0 a(int i10) {
        SparseArray sparseArray = this.f7349a;
        p0 p0Var = (p0) sparseArray.get(i10);
        if (p0Var == null) {
            p0 p0Var2 = new p0();
            sparseArray.put(i10, p0Var2);
            return p0Var2;
        }
        return p0Var;
    }
}
