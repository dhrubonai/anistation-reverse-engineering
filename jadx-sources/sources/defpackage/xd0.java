package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class xd0 implements Iterable, Serializable {
    public static final ud0 A;
    public static final xd0 z = new xd0(y13.b);
    public int x = 0;
    public final byte[] y;

    static {
        ud0 q18Var;
        if (j9.a()) {
            q18Var = new m18((byte) 9);
        } else {
            q18Var = new q18((byte) 8);
        }
        A = q18Var;
    }

    public xd0(byte[] bArr) {
        bArr.getClass();
        this.y = bArr;
    }

    public static int c(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i >= 0) {
                if (i2 < i) {
                    ze0.g(zo5.m("Beginning index larger than ending index: ", ", ", i, i2));
                    return 0;
                }
                ze0.g(zo5.m("End index: ", " >= ", i2, i3));
                return 0;
            }
            ze0.g(qx1.i(i, "Beginning index: ", " < 0"));
            return 0;
        }
        return i4;
    }

    public static xd0 d(byte[] bArr, int i, int i2) {
        c(i, i + i2, bArr.length);
        return new xd0(A.b(bArr, i, i2));
    }

    public byte b(int i) {
        return this.y[i];
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof xd0) && size() == ((xd0) obj).size()) {
                if (size() != 0) {
                    if (obj instanceof xd0) {
                        xd0 xd0Var = (xd0) obj;
                        int i = this.x;
                        int i2 = xd0Var.x;
                        if (i == 0 || i2 == 0 || i == i2) {
                            int size = size();
                            if (size <= xd0Var.size()) {
                                if (size <= xd0Var.size()) {
                                    byte[] bArr = xd0Var.y;
                                    int g = g() + size;
                                    int g2 = g();
                                    int g3 = xd0Var.g();
                                    while (g2 < g) {
                                        if (this.y[g2] != bArr[g3]) {
                                            return false;
                                        }
                                        g2++;
                                        g3++;
                                    }
                                    return true;
                                }
                                StringBuilder s = qx1.s(size, "Ran off end of other: 0, ", ", ");
                                s.append(xd0Var.size());
                                throw new IllegalArgumentException(s.toString());
                            }
                            throw new IllegalArgumentException("Length too large: " + size + size());
                        }
                        return false;
                    }
                    return obj.equals(this);
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public void f(int i, byte[] bArr) {
        System.arraycopy(this.y, 0, bArr, 0, i);
    }

    public int g() {
        return 0;
    }

    public byte h(int i) {
        return this.y[i];
    }

    public final int hashCode() {
        int i = this.x;
        if (i == 0) {
            int size = size();
            int g = g();
            int i2 = size;
            for (int i3 = g; i3 < g + size; i3++) {
                i2 = (i2 * 31) + this.y[i3];
            }
            if (i2 == 0) {
                i2 = 1;
            }
            this.x = i2;
            return i2;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new qd0(this);
    }

    public int size() {
        return this.y.length;
    }

    public final String toString() {
        xd0 sd0Var;
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            concat = mv5.c(this);
        } else {
            int c = c(0, 47, size());
            if (c == 0) {
                sd0Var = z;
            } else {
                sd0Var = new sd0(this.y, g(), c);
            }
            concat = mv5.c(sd0Var).concat("...");
        }
        return h11.k(h11.m(size, "<ByteString@", hexString, " size=", " contents=\""), concat, "\">");
    }
}
