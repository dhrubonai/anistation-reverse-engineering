package defpackage;

import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public class zd0 implements Serializable, Comparable {
    public static final zd0 A = new zd0(new byte[0]);
    public final byte[] x;
    public transient int y;
    public transient String z;

    public zd0(byte[] bArr) {
        bArr.getClass();
        this.x = bArr;
    }

    public static int g(zd0 zd0Var, zd0 zd0Var2) {
        zd0Var.getClass();
        zd0Var2.getClass();
        return zd0Var.f(0, zd0Var2.h());
    }

    public static int k(zd0 zd0Var, zd0 zd0Var2) {
        int d = zd0Var.d();
        zd0Var.getClass();
        zd0Var2.getClass();
        return zd0Var.j(d, zd0Var2.h());
    }

    public static zd0 o(zd0 zd0Var, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = zd0Var.d();
        }
        return zd0Var.n(i, i2);
    }

    public String a() {
        byte[] bArr = a.a;
        byte[] bArr2 = this.x;
        bArr2.getClass();
        bArr.getClass();
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr2[i];
            int i3 = i + 2;
            byte b2 = bArr2[i + 1];
            i += 3;
            byte b3 = bArr2[i3];
            bArr3[i2] = bArr[(b & 255) >> 2];
            bArr3[i2 + 1] = bArr[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i4 = i2 + 3;
            bArr3[i2 + 2] = bArr[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 += 4;
            bArr3[i4] = bArr[b3 & 63];
        }
        int length2 = bArr2.length - length;
        if (length2 != 1) {
            if (length2 == 2) {
                int i5 = i + 1;
                byte b4 = bArr2[i];
                byte b5 = bArr2[i5];
                bArr3[i2] = bArr[(b4 & 255) >> 2];
                bArr3[i2 + 1] = bArr[((b4 & 3) << 4) | ((b5 & 255) >> 4)];
                bArr3[i2 + 2] = bArr[(b5 & 15) << 2];
                bArr3[i2 + 3] = 61;
            }
        } else {
            byte b6 = bArr2[i];
            bArr3[i2] = bArr[(b6 & 255) >> 2];
            bArr3[i2 + 1] = bArr[(b6 & 3) << 4];
            bArr3[i2 + 2] = 61;
            bArr3[i2 + 3] = 61;
        }
        return new String(bArr3, kl0.a);
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zd0 zd0Var) {
        zd0Var.getClass();
        int d = d();
        int d2 = zd0Var.d();
        int min = Math.min(d, d2);
        for (int i = 0; i < min; i++) {
            int i2 = i(i) & 255;
            int i3 = zd0Var.i(i) & 255;
            if (i2 != i3) {
                if (i2 < i3) {
                    return -1;
                }
                return 1;
            }
        }
        if (d == d2) {
            return 0;
        }
        if (d < d2) {
            return -1;
        }
        return 1;
    }

    public zd0 c(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.x, 0, d());
        byte[] digest = messageDigest.digest();
        digest.getClass();
        return new zd0(digest);
    }

    public int d() {
        return this.x.length;
    }

    public String e() {
        byte[] bArr = this.x;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = db.a;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof zd0) {
                zd0 zd0Var = (zd0) obj;
                int d = zd0Var.d();
                byte[] bArr = this.x;
                if (d == bArr.length && zd0Var.l(0, 0, bArr.length, bArr)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public int f(int i, byte[] bArr) {
        bArr.getClass();
        byte[] bArr2 = this.x;
        int length = bArr2.length - bArr.length;
        int max = Math.max(i, 0);
        if (max <= length) {
            while (!tl7.g(max, 0, bArr.length, bArr2, bArr)) {
                if (max != length) {
                    max++;
                } else {
                    return -1;
                }
            }
            return max;
        }
        return -1;
    }

    public byte[] h() {
        return this.x;
    }

    public int hashCode() {
        int i = this.y;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.x);
        this.y = hashCode;
        return hashCode;
    }

    public byte i(int i) {
        return this.x[i];
    }

    public int j(int i, byte[] bArr) {
        bArr.getClass();
        byte[] bArr2 = this.x;
        for (int min = Math.min(i, bArr2.length - bArr.length); -1 < min; min--) {
            if (tl7.g(min, 0, bArr.length, bArr2, bArr)) {
                return min;
            }
        }
        return -1;
    }

    public boolean l(int i, int i2, int i3, byte[] bArr) {
        bArr.getClass();
        if (i >= 0) {
            byte[] bArr2 = this.x;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && tl7.g(i, i2, i3, bArr2, bArr)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean m(int i, zd0 zd0Var, int i2) {
        zd0Var.getClass();
        return zd0Var.l(0, i, i2, this.x);
    }

    public zd0 n(int i, int i2) {
        if (i >= 0) {
            byte[] bArr = this.x;
            if (i2 <= bArr.length) {
                if (i2 - i >= 0) {
                    if (i == 0 && i2 == bArr.length) {
                        return this;
                    }
                    return new zd0(ms.C0(bArr, i, i2));
                }
                ze0.k("endIndex < beginIndex");
                return null;
            }
            ze0.e(qx1.o(new StringBuilder("endIndex > length("), bArr.length, ')'));
            return null;
        }
        ze0.k("beginIndex < 0");
        return null;
    }

    public zd0 p() {
        int i = 0;
        while (true) {
            byte[] bArr = this.x;
            if (i < bArr.length) {
                byte b = bArr[i];
                if (b >= 65 && b <= 90) {
                    byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                    copyOf[i] = (byte) (b + 32);
                    for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                        byte b2 = copyOf[i2];
                        if (b2 >= 65 && b2 <= 90) {
                            copyOf[i2] = (byte) (b2 + 32);
                        }
                    }
                    return new zd0(copyOf);
                }
                i++;
            } else {
                return this;
            }
        }
    }

    public final String q() {
        String str = this.z;
        if (str == null) {
            byte[] h = h();
            h.getClass();
            String str2 = new String(h, kl0.a);
            this.z = str2;
            return str2;
        }
        return str;
    }

    public void r(pa0 pa0Var, int i) {
        pa0Var.l0(i, this.x);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x00ef, code lost:
    
        if (r6 == 64) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0127, code lost:
    
        if (r6 == 64) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x012b, code lost:
    
        if (r6 == 64) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00cf, code lost:
    
        if (r6 == 64) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x016a, code lost:
    
        if (r6 == 64) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0171, code lost:
    
        if (r6 == 64) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0163, code lost:
    
        if (r6 == 64) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01a2, code lost:
    
        if (r6 == 64) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01a5, code lost:
    
        if (r6 == 64) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01a8, code lost:
    
        if (r6 == 64) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0137, code lost:
    
        if (r6 == 64) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01ab, code lost:
    
        if (r6 == 64) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0092, code lost:
    
        if (r6 == 64) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00bd, code lost:
    
        if (r6 == 64) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0081, code lost:
    
        if (r6 == 64) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00f7, code lost:
    
        if (r6 == 64) goto L178;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zd0.toString():java.lang.String");
    }
}
