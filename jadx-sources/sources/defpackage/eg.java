package defpackage;

import android.os.Parcelable;
import android.util.SparseArray;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class eg implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ sv6 y;

    public /* synthetic */ eg(sv6 sv6Var, byte b) {
        this.x = b;
        this.y = sv6Var;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        sv6 sv6Var = this.y;
        switch (b) {
            case 0:
                jg.m(sv6Var);
                return pn6Var;
            case 1:
                sv6Var.W.D();
                return pn6Var;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                sv6Var.b0.saveHierarchyState(sparseArray);
                return sparseArray;
            case 3:
                sv6.n(sv6Var);
                return pn6Var;
            case 4:
                sv6Var.f0.invoke(sv6Var.b0);
                return pn6Var;
            default:
                sv6Var.e0.invoke(sv6Var.b0);
                return pn6Var;
        }
    }
}
