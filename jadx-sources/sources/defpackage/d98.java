package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class d98 implements Iterable, Serializable {
    public static final f98 y = new f98(la8.b);
    public int x = 0;

    static {
        int i = b98.a;
    }

    public static int j(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i >= 0) {
                if (i2 < i) {
                    jz7.d(String.valueOf(i).length() + 44 + String.valueOf(i2).length(), "Beginning index larger than ending index: ", i, ", ", i2);
                    return 0;
                }
                jz7.d(String.valueOf(i2).length() + 15 + String.valueOf(i3).length(), "End index: ", i2, " >= ", i3);
                return 0;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        return i4;
    }

    public static /* synthetic */ boolean k(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        int i4 = i + i3;
        j(i, i4, bArr.length);
        j(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public abstract byte b(int i);

    public abstract byte c(int i);

    public abstract int d();

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof d98) {
                d98 d98Var = (d98) obj;
                int d = d();
                if (d == d98Var.d()) {
                    if (d != 0) {
                        int i = this.x;
                        int i2 = d98Var.x;
                        if (i != 0 && i2 != 0 && i != i2) {
                            return false;
                        }
                        return h(d98Var);
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public abstract d98 f(int i, int i2);

    public abstract void g(j98 j98Var);

    public abstract boolean h(d98 d98Var);

    public final int hashCode() {
        int i = this.x;
        if (i == 0) {
            int d = d();
            i = i(d, d);
            if (i == 0) {
                i = 1;
            }
            this.x = i;
        }
        return i;
    }

    public abstract int i(int i, int i2);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new qd0(this);
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int d = d();
        if (d() <= 50) {
            concat = ct5.r(this);
        } else {
            concat = ct5.r(f(0, 47)).concat("...");
        }
        return h11.k(h11.m(d, "<ByteString@", hexString, " size=", " contents=\""), concat, "\">");
    }
}
