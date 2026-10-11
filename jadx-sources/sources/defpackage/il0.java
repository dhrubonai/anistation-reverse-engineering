package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class il0 {
    public static final long[] a;
    public static final byte[] b;

    static {
        int i;
        long j;
        long j2;
        long j3;
        tl7.j(xq2.g, new hi0((byte) 7), new vs0((byte) 22));
        d13 d13Var = new d13(0, 255, 1);
        ArrayList arrayList = new ArrayList(zo0.V(d13Var, 10));
        Iterator it = d13Var.iterator();
        while (true) {
            e13 e13Var = (e13) it;
            if (!e13Var.z) {
                break;
            }
            int nextInt = e13Var.nextInt();
            if (48 <= nextInt && nextInt < 58) {
                j = nextInt;
                j3 = 48;
            } else {
                j = nextInt;
                if (j >= 97 && j <= 102) {
                    j3 = 87;
                } else if (j >= 65 && j <= 70) {
                    j3 = 55;
                } else {
                    j2 = -1;
                    arrayList.add(Long.valueOf(j2));
                }
            }
            j2 = j - j3;
            arrayList.add(Long.valueOf(j2));
        }
        a = yo0.J0(arrayList);
        d13 d13Var2 = new d13(0, 15, 1);
        ArrayList arrayList2 = new ArrayList(zo0.V(d13Var2, 10));
        Iterator it2 = d13Var2.iterator();
        while (true) {
            e13 e13Var2 = (e13) it2;
            if (e13Var2.z) {
                int nextInt2 = e13Var2.nextInt();
                if (nextInt2 < 10) {
                    i = nextInt2 + 48;
                } else {
                    i = (char) (((char) (nextInt2 + 97)) - '\n');
                }
                arrayList2.add(Byte.valueOf((byte) i));
            } else {
                b = yo0.F0(arrayList2);
                return;
            }
        }
    }

    public static final boolean a(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 - i != charSequence2.length()) {
            return false;
        }
        for (int i3 = i; i3 < i2; i3++) {
            int charAt = charSequence.charAt(i3);
            if (65 <= charAt && charAt < 91) {
                charAt += 32;
            }
            int charAt2 = charSequence2.charAt(i3 - i);
            if (65 <= charAt2 && charAt2 < 91) {
                charAt2 += 32;
            }
            if (charAt != charAt2) {
                return false;
            }
        }
        return true;
    }

    public static final int b(CharSequence charSequence, int i, int i2) {
        charSequence.getClass();
        int i3 = 0;
        while (i < i2) {
            int charAt = charSequence.charAt(i);
            if (65 <= charAt && charAt < 91) {
                charAt += 32;
            }
            i3 = (i3 * 31) + charAt;
            i++;
        }
        return i3;
    }

    public static final void c(kk0 kk0Var, int i) {
        throw new NumberFormatException("Invalid number: " + ((Object) kk0Var) + ", wrong digit: " + kk0Var.charAt(i) + " at position " + i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0069, code lost:
    
        if (defpackage.h41.l0(r8, r10, r0) == r6) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.ae0 r8, int r9, defpackage.xz0 r10) {
        /*
            boolean r0 = r10 instanceof defpackage.hl0
            if (r0 == 0) goto L13
            r0 = r10
            hl0 r0 = (defpackage.hl0) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.D = r1
            goto L18
        L13:
            hl0 r0 = new hl0
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.C
            int r1 = r0.D
            r2 = 0
            r3 = 8
            r4 = 2
            r5 = 1
            w11 r6 = defpackage.w11.x
            if (r1 == 0) goto L44
            if (r1 == r5) goto L30
            if (r1 != r4) goto L2a
            goto L30
        L2a:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r8)
            return r2
        L30:
            int r8 = r0.B
            int r9 = r0.A
            int r1 = r0.z
            byte[] r2 = r0.y
            ae0 r5 = r0.x
            defpackage.m37.N(r10)
            r7 = r1
            r1 = r9
            r9 = r7
            r7 = r2
            r2 = r8
            r8 = r5
            goto L6e
        L44:
            defpackage.m37.N(r10)
            if (r9 <= 0) goto L90
            r10 = 0
            r1 = r9
        L4b:
            int r2 = r10 + 1
            byte[] r7 = defpackage.il0.b
            if (r10 >= r3) goto L6e
            int r10 = r1 >>> 28
            int r1 = r1 << 4
            if (r10 == 0) goto L6c
            r10 = r7[r10]
            r0.x = r8
            r0.y = r7
            r0.z = r9
            r0.A = r1
            r0.B = r2
            r0.D = r5
            java.lang.Object r10 = defpackage.h41.l0(r8, r10, r0)
            if (r10 != r6) goto L6e
            goto L8a
        L6c:
            r10 = r2
            goto L4b
        L6e:
            int r10 = r2 + 1
            if (r2 >= r3) goto L8d
            int r2 = r1 >>> 28
            int r1 = r1 << 4
            r2 = r7[r2]
            r0.x = r8
            r0.y = r7
            r0.z = r9
            r0.A = r1
            r0.B = r10
            r0.D = r4
            java.lang.Object r2 = defpackage.h41.l0(r8, r2, r0)
            if (r2 != r6) goto L8b
        L8a:
            return r6
        L8b:
            r2 = r10
            goto L6e
        L8d:
            pn6 r8 = defpackage.pn6.a
            return r8
        L90:
            java.lang.String r8 = "Does only work for positive numbers"
            defpackage.ze0.k(r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.il0.d(ae0, int, xz0):java.lang.Object");
    }
}
