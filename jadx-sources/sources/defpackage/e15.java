package defpackage;

import android.util.SparseArray;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class e15 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ f15 y;

    public /* synthetic */ e15(f15 f15Var, byte b) {
        this.x = b;
        this.y = f15Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        f15 f15Var = this.y;
        switch (b) {
            case 0:
                SparseArray sparseArray = f15Var.h;
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    ((i15) sparseArray.valueAt(i)).getClass();
                    i15.a(null, null);
                }
                sparseArray.clear();
                return;
            default:
                l15 l15Var = f15Var.i;
                if (l15Var.K == f15Var) {
                    l15Var.j();
                    return;
                }
                return;
        }
    }
}
