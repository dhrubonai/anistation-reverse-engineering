package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class iw2 implements Serializable {
    public static final iw2 z = new iw2(new int[0], 0);
    public final int[] x;
    public final int y;

    public iw2(int[] iArr, int i) {
        this.x = iArr;
        this.y = i;
    }

    public static iw2 c(int... iArr) {
        boolean z2;
        if (iArr.length <= 2147483646) {
            z2 = true;
        } else {
            z2 = false;
        }
        io3.m("the total number of elements must fit in an int", z2);
        int length = iArr.length + 1;
        int[] iArr2 = new int[length];
        iArr2[0] = 0;
        System.arraycopy(iArr, 0, iArr2, 1, iArr.length);
        return new iw2(iArr2, length);
    }

    public final boolean a(int i) {
        int i2 = 0;
        while (true) {
            if (i2 < this.y) {
                if (this.x[i2] == i) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 < 0) {
            return false;
        }
        return true;
    }

    public final int b(int i) {
        io3.r(i, this.y);
        return this.x[i];
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof iw2) {
                iw2 iw2Var = (iw2) obj;
                int i = iw2Var.y;
                int i2 = this.y;
                if (i2 == i) {
                    for (int i3 = 0; i3 < i2; i3++) {
                        if (b(i3) == iw2Var.b(i3)) {
                        }
                    }
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.y; i2++) {
            i = (i * 31) + this.x[i2];
        }
        return i;
    }

    public final String toString() {
        int i = this.y;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.x;
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(iArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }
}
