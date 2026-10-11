package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class lo0 {
    public static final ss a;
    public static final ss b;
    public static final ss c;
    public static final ss d;
    public static final ss e;

    static {
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterable el0Var = new el0('a', 'z');
        el0 el0Var2 = new el0('A', 'Z');
        if (el0Var instanceof Collection) {
            arrayList = yo0.u0(el0Var2, (Collection) el0Var);
        } else {
            ArrayList arrayList3 = new ArrayList();
            dp0.Y(el0Var, arrayList3);
            dp0.Y(el0Var2, arrayList3);
            arrayList = arrayList3;
        }
        ss y = jf7.y(yo0.u0(new el0('0', '9'), arrayList));
        a = y;
        Iterable el0Var3 = new el0('a', 'f');
        el0 el0Var4 = new el0('A', 'F');
        if (el0Var3 instanceof Collection) {
            arrayList2 = yo0.u0(el0Var4, (Collection) el0Var3);
        } else {
            ArrayList arrayList4 = new ArrayList();
            dp0.Y(el0Var3, arrayList4);
            dp0.Y(el0Var4, arrayList4);
            arrayList2 = arrayList4;
        }
        b = jf7.y(yo0.u0(new el0('0', '9'), arrayList2));
        c = jf7.z(":/?#[]@!$&'()*,;=-._~+");
        d = jf7.z(":@!$&'()*+,;=-._~");
        jf7.z("!#$&+-.^_`|~");
        e = y.b(jf7.z("-._~"));
    }

    public static final void a(StringBuilder sb, byte b2) {
        int i;
        int i2;
        sb.append('%');
        int i3 = (b2 & 255) >> 4;
        if (i3 >= 0 && i3 < 10) {
            i = i3 + 48;
        } else {
            i = ((char) (i3 + 65)) - '\n';
        }
        sb.append((char) i);
        int i4 = b2 & 15;
        if (i4 >= 0 && i4 < 10) {
            i2 = i4 + 48;
        } else {
            i2 = ((char) (i4 + 65)) - '\n';
        }
        sb.append((char) i2);
    }

    public static final int b(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        return -1;
    }

    public static final String c(int i, int i2, String str, boolean z) {
        int i3 = i;
        while (i3 < i2) {
            char charAt = str.charAt(i3);
            if (charAt != '%' && (!z || charAt != '+')) {
                i3++;
            } else {
                int i4 = i2 - i;
                if (i4 > 255) {
                    i4 /= 3;
                }
                StringBuilder sb = new StringBuilder(i4);
                if (i3 > i) {
                    sb.append((CharSequence) str, i, i3);
                }
                byte[] bArr = null;
                while (i3 < i2) {
                    char charAt2 = str.charAt(i3);
                    if (z && charAt2 == '+') {
                        sb.append(' ');
                    } else if (charAt2 == '%') {
                        if (bArr == null) {
                            bArr = new byte[(i2 - i3) / 3];
                        }
                        int i5 = 0;
                        while (i3 < i2 && str.charAt(i3) == '%') {
                            int i6 = i3 + 2;
                            if (i6 < i2) {
                                int i7 = i3 + 1;
                                int b2 = b(str.charAt(i7));
                                int b3 = b(str.charAt(i6));
                                if (b2 != -1 && b3 != -1) {
                                    bArr[i5] = (byte) ((b2 * 16) + b3);
                                    i3 += 3;
                                    i5++;
                                } else {
                                    throw new nw("Wrong HEX escape: %" + str.charAt(i7) + str.charAt(i6) + ", in " + ((Object) str) + ", at " + i3, (byte) 9);
                                }
                            } else {
                                StringBuilder sb2 = new StringBuilder("Incomplete trailing HEX escape: ");
                                sb2.append(str.subSequence(i3, str.length()).toString());
                                sb2.append(", in ");
                                sb2.append((Object) str);
                                throw new nw(h11.g(i3, " at ", sb2), (byte) 9);
                            }
                        }
                        sb.append(b06.z(bArr, i5, 4));
                    } else {
                        sb.append(charAt2);
                    }
                    i3++;
                }
                return sb.toString();
            }
        }
        if (i == 0 && i2 == str.length()) {
            return str.toString();
        }
        return str.substring(i, i2);
    }

    public static String d(String str) {
        int length = str.length();
        Charset charset = kl0.a;
        str.getClass();
        charset.getClass();
        return c(0, length, str, false);
    }

    public static String e(String str, int i, int i2, int i3) {
        boolean z = false;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) == 0) {
            z = true;
        }
        Charset charset = kl0.a;
        str.getClass();
        charset.getClass();
        return c(i, i2, str, z);
    }

    public static final String f(String str, boolean z) {
        str.getClass();
        byte[] l = et5.l(str, kl0.a);
        StringBuilder sb = new StringBuilder(l.length);
        for (byte b2 : l) {
            if (e.a(b2)) {
                sb.append((char) b2);
            } else if (z && b2 == 32) {
                sb.append('+');
            } else {
                a(sb, b2);
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, oa0] */
    public static String g(int i, String str) {
        boolean z;
        boolean z2;
        int i2;
        int i3;
        int i4 = 0;
        if ((i & 1) != 0) {
            z = false;
        } else {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        str.getClass();
        StringBuilder sb = new StringBuilder();
        Charset charset = kl0.a;
        while (i4 < str.length()) {
            char charAt = str.charAt(i4);
            if ((z || charAt != '/') && !a.a(charAt) && !d.a(charAt)) {
                if (!z2 && charAt == '%' && (i3 = i4 + 2) < str.length()) {
                    int i5 = i4 + 1;
                    char charAt2 = str.charAt(i5);
                    ss ssVar = b;
                    if (ssVar.a(charAt2) && ssVar.a(str.charAt(i3))) {
                        sb.append(charAt);
                        sb.append(str.charAt(i5));
                        sb.append(str.charAt(i3));
                        i4 += 3;
                    }
                }
                if (charAt < 128) {
                    a(sb, (byte) charAt);
                } else {
                    if (55296 <= charAt && charAt < 57344) {
                        i2 = 2;
                    } else {
                        i2 = 1;
                    }
                    CharsetEncoder newEncoder = charset.newEncoder();
                    newEncoder.getClass();
                    int i6 = i2 + i4;
                    ?? obj = new Object();
                    iv.t(newEncoder, obj, str, i4, i6);
                    while (!obj.D()) {
                        while (!obj.D()) {
                            a(sb, obj.readByte());
                        }
                    }
                    i4 = i6;
                }
            } else {
                sb.append(charAt);
            }
            i4++;
        }
        return sb.toString();
    }
}
