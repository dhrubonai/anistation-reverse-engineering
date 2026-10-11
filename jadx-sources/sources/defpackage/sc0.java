package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class sc0 {
    public final wc0 a;
    public final yd0 b;
    public final ae0 c;
    public final int d;
    public final cv5 e;
    public final int[] f;
    public final oa0 g;
    public long h;
    public int i;

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, oa0] */
    public sc0(wc0 wc0Var, yd0 yd0Var, ae0 ae0Var, long j) {
        wc0Var.getClass();
        yd0Var.getClass();
        ae0Var.getClass();
        this.a = wc0Var;
        this.b = yd0Var;
        this.c = ae0Var;
        this.d = (int) j;
        byte[] bArr = yd0Var.x;
        if (bArr.length > 0) {
            this.e = wc0Var.g();
            int[] iArr = new int[bArr.length];
            int length = bArr.length;
            int i = 0;
            for (int i2 = 1; i2 < length; i2++) {
                while (i > 0 && yd0Var.a(i2) != yd0Var.a(i)) {
                    i = iArr[i - 1];
                }
                if (yd0Var.a(i2) == yd0Var.a(i)) {
                    i++;
                }
                iArr[i2] = i;
            }
            this.f = iArr;
            this.g = new Object();
            return;
        }
        ze0.k("Empty match string not permitted for scanning");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        if (((java.lang.Boolean) r13).booleanValue() != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008e, code lost:
    
        if (defpackage.sw0.t(r1, r0) == r7) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        if (r13 == r7) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x008e -> B:23:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.xz0 r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof defpackage.pc0
            if (r0 == 0) goto L13
            r0 = r13
            pc0 r0 = (defpackage.pc0) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            pc0 r0 = new pc0
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.x
            int r1 = r0.z
            pn6 r2 = defpackage.pn6.a
            r3 = 3
            r4 = 2
            r5 = 1
            cv5 r6 = r12.e
            w11 r7 = defpackage.w11.x
            if (r1 == 0) goto L3c
            if (r1 == r5) goto L38
            if (r1 == r4) goto L3c
            if (r1 != r3) goto L31
            defpackage.m37.N(r13)
            return r2
        L31:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r12)
            r12 = 0
            return r12
        L38:
            defpackage.m37.N(r13)
            goto L52
        L3c:
            defpackage.m37.N(r13)
        L3f:
            boolean r13 = r6.D()
            if (r13 == 0) goto L5a
            r0.z = r5
            vc0 r13 = defpackage.wc0.a
            wc0 r13 = r12.a
            java.lang.Object r13 = r13.c(r5, r0)
            if (r13 != r7) goto L52
            goto Lae
        L52:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto Laf
        L5a:
            yd0 r13 = r12.b
            r1 = 0
            byte r13 = r13.a(r1)
            r8 = 0
            r1 = 6
            long r8 = defpackage.nv5.l(r6, r13, r8, r1)
            r10 = -1
            int r13 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            ae0 r1 = r12.c
            if (r13 != 0) goto L91
            r6.getClass()
            r13 = r6
            oa0 r13 = (defpackage.oa0) r13
            long r8 = r13.z
            r12.b(r8)
            long r8 = r12.h
            qq5 r10 = r1.e()
            long r10 = r13.I(r10)
            long r10 = r10 + r8
            r12.h = r10
            r0.z = r4
            java.lang.Object r13 = defpackage.sw0.t(r1, r0)
            if (r13 != r7) goto L3f
            goto Lae
        L91:
            r12.b(r8)
            long r4 = r12.h
            qq5 r13 = r1.e()
            r13.getClass()
            oa0 r13 = (defpackage.oa0) r13
            long r8 = r6.C(r13, r8)
            long r8 = r8 + r4
            r12.h = r8
            r0.z = r3
            java.lang.Object r12 = defpackage.sw0.t(r1, r0)
            if (r12 != r7) goto Laf
        Lae:
            return r7
        Laf:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sc0.a(xz0):java.lang.Object");
    }

    public final void b(long j) {
        long j2 = this.h + j;
        long j3 = this.d;
        if (j2 <= j3) {
            return;
        }
        StringBuilder n = zo5.n(j3, "Limit of ", " bytes exceeded while searching for \"");
        yd0 yd0Var = this.b;
        yd0Var.getClass();
        byte[] bArr = yd0Var.x;
        bArr.getClass();
        n.append(b06.G(new String(bArr, kl0.a), "\n", "\\n"));
        n.append('\"');
        throw new IOException(n.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ae, code lost:
    
        if (defpackage.h41.l0(r1, r14, r0) != r5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b0, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x004b, code lost:
    
        if (r14 == r5) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x003f -> B:21:0x005a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x004b -> B:17:0x004e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.xz0 r14) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sc0.c(xz0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r11 == r6) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
    
        if (r1.d(r0) == r6) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e0, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d3, code lost:
    
        if (a(r0) == r6) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00de, code lost:
    
        if (r11 == r6) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00de -> B:19:0x00e1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(boolean r10, defpackage.xz0 r11) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sc0.d(boolean, xz0):java.lang.Object");
    }
}
