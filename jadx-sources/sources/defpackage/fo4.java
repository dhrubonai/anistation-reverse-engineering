package defpackage;

import android.util.SparseBooleanArray;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fo4 {
    public static final g42 b;
    public static final g42 c;
    public final mn0 a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i : new int[]{16, 17, 18, 21, 22, 23, 28, 30}) {
            io3.B(!false);
            sparseBooleanArray.append(i, true);
        }
        io3.B(!false);
        b = new g42(sparseBooleanArray);
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
        for (int i2 : new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 19, 31, 20, 24, 25, 33, 26, 34, 35, 27, 29, 32}) {
            io3.B(!false);
            sparseBooleanArray2.append(i2, true);
        }
        io3.B(!false);
        c = new g42(sparseBooleanArray2);
    }

    public fo4(go4 go4Var) {
        mn0 mn0Var = new mn0();
        this.a = mn0Var;
        mn0Var.b(go4Var.a);
    }

    public final void a(int i, boolean z) {
        if (z) {
            this.a.a(i);
        }
    }

    public final go4 b() {
        return new go4(this.a.d());
    }

    public fo4() {
        this.a = new mn0();
    }
}
