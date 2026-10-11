package k9;

import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;
import r6.h0;

/* loaded from: classes.dex */
public class j implements Serializable, Comparable {

    /* renamed from: d, reason: collision with root package name */
    public static final j f6522d;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f6523a;

    /* renamed from: b, reason: collision with root package name */
    public transient int f6524b;

    /* renamed from: c, reason: collision with root package name */
    public transient String f6525c;

    static {
        new f9.x(21, 0);
        f6522d = new j(new byte[0]);
    }

    public j(byte[] bArr) {
        h0.u(bArr, "data");
        this.f6523a = bArr;
    }

    public String a() {
        byte[] bArr = a.f6503a;
        byte[] bArr2 = this.f6523a;
        h0.u(bArr2, "<this>");
        h0.u(bArr, "map");
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i10 + 1;
            byte b10 = bArr2[i10];
            int i13 = i12 + 1;
            byte b11 = bArr2[i12];
            int i14 = i13 + 1;
            byte b12 = bArr2[i13];
            int i15 = i11 + 1;
            bArr3[i11] = bArr[(b10 & 255) >> 2];
            int i16 = i15 + 1;
            bArr3[i15] = bArr[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
            int i17 = i16 + 1;
            bArr3[i16] = bArr[((b11 & 15) << 2) | ((b12 & 255) >> 6)];
            i11 = i17 + 1;
            bArr3[i17] = bArr[b12 & 63];
            i10 = i14;
        }
        int length2 = bArr2.length - length;
        if (length2 != 1) {
            if (length2 == 2) {
                int i18 = i10 + 1;
                byte b13 = bArr2[i10];
                byte b14 = bArr2[i18];
                int i19 = i11 + 1;
                bArr3[i11] = bArr[(b13 & 255) >> 2];
                int i20 = i19 + 1;
                bArr3[i19] = bArr[((b13 & 3) << 4) | ((b14 & 255) >> 4)];
                bArr3[i20] = bArr[(b14 & 15) << 2];
                bArr3[i20 + 1] = 61;
            }
        } else {
            byte b15 = bArr2[i10];
            int i21 = i11 + 1;
            bArr3[i11] = bArr[(b15 & 255) >> 2];
            int i22 = i21 + 1;
            bArr3[i21] = bArr[(b15 & 3) << 4];
            bArr3[i22] = 61;
            bArr3[i22 + 1] = 61;
        }
        return new String(bArr3, o7.a.f8311a);
    }

    public j b(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f6523a, 0, c());
        byte[] digest = messageDigest.digest();
        h0.q(digest);
        return new j(digest);
    }

    public int c() {
        return this.f6523a.length;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032 A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compareTo(java.lang.Object r8) {
        /*
            r7 = this;
            k9.j r8 = (k9.j) r8
            java.lang.String r0 = "other"
            r6.h0.u(r8, r0)
            int r0 = r7.c()
            int r1 = r8.c()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L15:
            if (r4 >= r2) goto L2b
            byte r5 = r7.f(r4)
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r6 = r8.f(r4)
            r6 = r6 & 255(0xff, float:3.57E-43)
            if (r5 != r6) goto L28
            int r4 = r4 + 1
            goto L15
        L28:
            if (r5 >= r6) goto L32
            goto L30
        L2b:
            if (r0 != r1) goto L2e
            goto L33
        L2e:
            if (r0 >= r1) goto L32
        L30:
            r3 = -1
            goto L33
        L32:
            r3 = 1
        L33:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.j.compareTo(java.lang.Object):int");
    }

    public String d() {
        byte[] bArr = this.f6523a;
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = w7.b.f11024d;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 = i11 + 1;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public byte[] e() {
        return this.f6523a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            int c6 = jVar.c();
            byte[] bArr = this.f6523a;
            if (c6 == bArr.length && jVar.g(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public byte f(int i10) {
        return this.f6523a[i10];
    }

    public boolean g(int i10, byte[] bArr, int i11, int i12) {
        h0.u(bArr, "other");
        if (i10 >= 0) {
            byte[] bArr2 = this.f6523a;
            if (i10 <= bArr2.length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && q6.g.b(bArr2, i10, bArr, i11, i12)) {
                return true;
            }
        }
        return false;
    }

    public boolean h(j jVar, int i10) {
        h0.u(jVar, "other");
        return jVar.g(0, this.f6523a, 0, i10);
    }

    public int hashCode() {
        int i10 = this.f6524b;
        if (i10 == 0) {
            int hashCode = Arrays.hashCode(this.f6523a);
            this.f6524b = hashCode;
            return hashCode;
        }
        return i10;
    }

    public j i() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f6523a;
            if (i10 < bArr.length) {
                byte b10 = bArr[i10];
                if (b10 >= 65 && b10 <= 90) {
                    byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                    h0.s(copyOf, "copyOf(this, size)");
                    copyOf[i10] = (byte) (b10 + 32);
                    for (int i11 = i10 + 1; i11 < copyOf.length; i11++) {
                        byte b11 = copyOf[i11];
                        if (b11 >= 65 && b11 <= 90) {
                            copyOf[i11] = (byte) (b11 + 32);
                        }
                    }
                    return new j(copyOf);
                }
                i10++;
            } else {
                return this;
            }
        }
    }

    public final String j() {
        String str = this.f6525c;
        if (str == null) {
            byte[] e10 = e();
            h0.u(e10, "<this>");
            String str2 = new String(e10, o7.a.f8311a);
            this.f6525c = str2;
            return str2;
        }
        return str;
    }

    public void k(g gVar, int i10) {
        h0.u(gVar, "buffer");
        gVar.J(this.f6523a, 0, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x010e, code lost:
    
        if (r6 == 64) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00fd, code lost:
    
        if (r6 == 64) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x01de, code lost:
    
        if (r6 == 64) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01d7, code lost:
    
        if (r6 == 64) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x01ca, code lost:
    
        if (r6 == 64) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x01b4, code lost:
    
        if (r6 == 64) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x01a5, code lost:
    
        if (r6 == 64) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0194, code lost:
    
        if (r6 == 64) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0183, code lost:
    
        if (r6 == 64) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x021d, code lost:
    
        if (r6 == 64) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x00b5, code lost:
    
        if (r6 == 64) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x00aa, code lost:
    
        if (r6 == 64) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x009b, code lost:
    
        if (r6 == 64) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0220, code lost:
    
        r7 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x013c, code lost:
    
        if (r6 == 64) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x012f, code lost:
    
        if (r6 == 64) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x011d, code lost:
    
        if (r6 == 64) goto L249;
     */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0220 A[EDGE_INSN: B:148:0x0220->B:52:0x0220 BREAK  A[LOOP:0: B:8:0x0014->B:89:0x0014], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0220 A[EDGE_INSN: B:204:0x0220->B:52:0x0220 BREAK  A[LOOP:0: B:8:0x0014->B:89:0x0014], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0220 A[EDGE_INSN: B:240:0x0220->B:52:0x0220 BREAK  A[LOOP:0: B:8:0x0014->B:89:0x0014], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0220 A[EDGE_INSN: B:266:0x0220->B:52:0x0220 BREAK  A[LOOP:0: B:8:0x0014->B:89:0x0014, LOOP_LABEL: LOOP:0: B:8:0x0014->B:89:0x0014], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0220 A[EDGE_INSN: B:51:0x0220->B:52:0x0220 BREAK  A[LOOP:0: B:8:0x0014->B:89:0x0014], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 751
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.j.toString():java.lang.String");
    }
}
