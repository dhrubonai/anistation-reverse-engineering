package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class p14 extends qa0 {
    public final ArrayList A;
    public final ArrayList B;
    public final long z;

    public p14(int i, long j) {
        super(i);
        this.z = j;
        this.A = new ArrayList();
        this.B = new ArrayList();
    }

    public final p14 f(int i) {
        ArrayList arrayList = this.B;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            p14 p14Var = (p14) arrayList.get(i2);
            if (p14Var.y == i) {
                return p14Var;
            }
        }
        return null;
    }

    public final q14 i(int i) {
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            q14 q14Var = (q14) arrayList.get(i2);
            if (q14Var.y == i) {
                return q14Var;
            }
        }
        return null;
    }

    @Override // defpackage.qa0
    public final String toString() {
        return qa0.c(this.y) + " leaves: " + Arrays.toString(this.A.toArray()) + " containers: " + Arrays.toString(this.B.toArray());
    }
}
