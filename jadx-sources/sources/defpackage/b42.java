package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class b42 {
    public final b60 a;
    public final f60 b;
    public c60 c;
    public final int d;

    public b42(d60 d60Var, f60 f60Var, long j, long j2, long j3, long j4, long j5, int i) {
        this.b = f60Var;
        this.d = i;
        this.a = new b60(d60Var, j, j2, j3, j4, j5);
    }

    public static int b(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static int c(c12 c12Var, long j, d42 d42Var) {
        if (j == c12Var.getPosition()) {
            return 0;
        }
        d42Var.a = j;
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cb, code lost:
    
        return c(r28, r8, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(defpackage.c12 r28, defpackage.d42 r29) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
        L6:
            c60 r3 = r0.c
            r3.getClass()
            long r4 = r3.f
            long r6 = r3.g
            long r8 = r3.h
            long r6 = r6 - r4
            int r10 = r0.d
            long r10 = (long) r10
            int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            r7 = 0
            f60 r10 = r0.b
            if (r6 > 0) goto L26
            r0.c = r7
            r10.b()
            int r0 = c(r1, r4, r2)
            return r0
        L26:
            long r4 = r1.getPosition()
            long r4 = r8 - r4
            r11 = 0
            int r6 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r6 < 0) goto Lc7
            r13 = 262144(0x40000, double:1.295163E-318)
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 > 0) goto Lc7
            int r4 = (int) r4
            r1.v(r4)
            r1.u()
            long r4 = r3.b
            e60 r4 = r10.a(r1, r4)
            int r5 = r4.a
            r15 = r11
            long r11 = r4.b
            r17 = r13
            long r13 = r4.c
            r4 = -3
            if (r5 == r4) goto Lbd
            r4 = -2
            if (r5 == r4) goto L9c
            r4 = -1
            if (r5 == r4) goto L7d
            if (r5 != 0) goto L76
            long r3 = r1.getPosition()
            long r3 = r13 - r3
            int r5 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r5 < 0) goto L6c
            int r5 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r5 > 0) goto L6c
            int r3 = (int) r3
            r1.v(r3)
        L6c:
            r0.c = r7
            r10.b()
            int r0 = c(r1, r13, r2)
            return r0
        L76:
            java.lang.String r0 = "Invalid case"
            defpackage.ze0.m(r0)
            r0 = 0
            return r0
        L7d:
            r3.e = r11
            r3.g = r13
            long r4 = r3.b
            long r6 = r3.d
            long r8 = r3.f
            r15 = r4
            long r4 = r3.c
            r25 = r4
            r17 = r6
            r21 = r8
            r19 = r11
            r23 = r13
            long r4 = defpackage.c60.a(r15, r17, r19, r21, r23, r25)
            r3.h = r4
            goto L6
        L9c:
            r4 = r11
            r6 = r13
            r3.d = r4
            r3.f = r6
            long r8 = r3.b
            long r10 = r3.e
            long r12 = r3.g
            long r14 = r3.c
            r17 = r4
            r21 = r6
            r19 = r10
            r23 = r12
            r25 = r14
            r15 = r8
            long r4 = defpackage.c60.a(r15, r17, r19, r21, r23, r25)
            r3.h = r4
            goto L6
        Lbd:
            r0.c = r7
            r10.b()
            int r0 = c(r1, r8, r2)
            return r0
        Lc7:
            int r0 = c(r1, r8, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b42.a(c12, d42):int");
    }

    public final void d(long j) {
        c60 c60Var = this.c;
        if (c60Var != null && c60Var.a == j) {
            return;
        }
        b60 b60Var = this.a;
        this.c = new c60(j, b60Var.a.g(j), b60Var.c, b60Var.d, b60Var.e, b60Var.f);
    }
}
