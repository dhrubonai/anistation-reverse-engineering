package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class we7 implements Iterable, Serializable {
    public static final ve7 y = new ve7(wf7.a);
    public int x = 0;

    static {
        int i = se7.a;
    }

    public static ve7 j(byte[] bArr, int i, int i2) {
        try {
            return k(bArr, i, i2);
        } catch (ag7 e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static ve7 k(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return y;
        }
        n(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new ve7(bArr2);
    }

    public static int n(int i, int i2, int i3) {
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

    public static /* synthetic */ boolean o(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        int i4 = i + i3;
        n(i, i4, bArr.length);
        n(i2, i3 + i2, bArr2.length);
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

    public abstract int c();

    public abstract ue7 d(int i, int i2);

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof we7) {
                we7 we7Var = (we7) obj;
                int c = c();
                if (c == we7Var.c()) {
                    if (c != 0) {
                        int i = this.x;
                        int i2 = we7Var.x;
                        if (i != 0 && i2 != 0 && i != i2) {
                            return false;
                        }
                        return h(we7Var);
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public abstract void f(int i, byte[] bArr);

    public abstract void g(ef7 ef7Var);

    public abstract boolean h(we7 we7Var);

    public final int hashCode() {
        int i = this.x;
        if (i == 0) {
            int c = c();
            i = i(c, c);
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

    public final byte[] m() {
        int c = c();
        if (c == 0) {
            return wf7.a;
        }
        byte[] bArr = new byte[c];
        f(c, bArr);
        return bArr;
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int c = c();
        if (c() <= 50) {
            concat = wt5.l(m());
        } else {
            concat = wt5.l(d(0, 47).m()).concat("...");
        }
        return h11.k(h11.m(c, "<ByteString@", hexString, " size=", " contents=\""), concat, "\">");
    }
}
