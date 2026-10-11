package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class aq6 {
    public static final nu5 a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [nu5] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    static {
        ?? r0;
        if (ro6.e && ro6.d && !i9.a()) {
            r0 = new Object();
        } else {
            r0 = new Object();
        }
        a = r0;
    }

    public static String a(ByteBuffer byteBuffer, int i, int i2) {
        nu5 nu5Var = a;
        nu5Var.getClass();
        if (byteBuffer.hasArray()) {
            return nu5Var.b(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2);
        }
        if (byteBuffer.isDirect()) {
            return nu5Var.e(byteBuffer, i, i2);
        }
        return nu5.d(byteBuffer, i, i2);
    }

    public static void b(String str, ByteBuffer byteBuffer) {
        nu5 nu5Var = a;
        nu5Var.getClass();
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(nu5Var.f(str, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
        } else if (byteBuffer.isDirect()) {
            nu5Var.h(str, byteBuffer);
        } else {
            nu5.g(str, byteBuffer);
        }
    }

    public static int c(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = str.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = str.length();
                while (i2 < length2) {
                    char charAt2 = str.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new yp6(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i3 + 4294967296L));
    }

    public static int d(int i, int i2) {
        if (i <= -12 && i2 <= -65) {
            return i ^ (i2 << 8);
        }
        return -1;
    }

    public static int e(int i, int i2, int i3) {
        if (i <= -12 && i2 <= -65 && i3 <= -65) {
            return (i ^ (i2 << 8)) ^ (i3 << 16);
        }
        return -1;
    }

    public static int f(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    return e(i, byteBuffer.get(i2), byteBuffer.get(i2 + 1));
                }
                p65.o();
                return 0;
            }
            return d(i, byteBuffer.get(i2));
        }
        if (i > -12) {
            return -1;
        }
        return i;
    }

    public static int g(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    return e(b, bArr[i], bArr[i + 1]);
                }
                p65.o();
                return 0;
            }
            return d(b, bArr[i]);
        }
        if (b > -12) {
            return -1;
        }
        return b;
    }
}
