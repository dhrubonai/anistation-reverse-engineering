package defpackage;

import android.util.SparseArray;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class my3 {
    public final SparseArray a;
    public gl6 b;

    public my3(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(gl6 gl6Var, int i, int i2) {
        int a = gl6Var.a(i);
        SparseArray sparseArray = this.a;
        my3 my3Var = (my3) sparseArray.get(a);
        if (my3Var == null) {
            my3Var = new my3(1);
            sparseArray.put(gl6Var.a(i), my3Var);
        }
        if (i2 > i) {
            my3Var.a(gl6Var, i + 1, i2);
        } else {
            my3Var.b = gl6Var;
        }
    }
}
