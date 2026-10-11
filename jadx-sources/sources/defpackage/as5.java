package defpackage;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class as5 {
    public static final yr5 a(yr5 yr5Var) {
        if (!(yr5Var instanceof yr5)) {
            yr5Var = null;
        }
        if (yr5Var != null) {
            return yr5Var;
        }
        eu0.b("Inconsistent composition");
        v71.e();
        return null;
    }

    public static final int b(ArrayList arrayList, int i, int i2) {
        int c = c(arrayList, i, i2);
        if (c >= 0) {
            return c;
        }
        return -(c + 1);
    }

    public static final int c(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((ed2) arrayList.get(i4)).a;
            if (i5 < 0) {
                i5 += i2;
            }
            int D = a34.D(i5, i);
            if (D < 0) {
                i3 = i4 + 1;
            } else if (D > 0) {
                size = i4 - 1;
            } else {
                return i4;
            }
        }
        return -(i3 + 1);
    }

    public static final int d(int[] iArr, int i) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    public static final void e() {
        throw new ConcurrentModificationException();
    }

    public static final void f(int i, int i2, int[] iArr) {
        if (i2 >= 0) {
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }
}
