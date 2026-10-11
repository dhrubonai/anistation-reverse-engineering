package defpackage;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vj0 implements x42 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public vj0(x42 x42Var, Charset charset, vk6 vk6Var, wc0 wc0Var) {
        this.x = (byte) 1;
        this.y = x42Var;
        this.z = charset;
        this.A = vk6Var;
        this.B = wc0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (r1.emit(r13, r3) == r4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0097, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0095, code lost:
    
        if (r1.emit(r13, r3) == r4) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(int[] r14, defpackage.vz0 r15) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.A
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.lang.Object r1 = r13.y
            x42 r1 = (defpackage.x42) r1
            java.lang.Object r2 = r13.z
            w05 r2 = (defpackage.w05) r2
            boolean r3 = r15 instanceof defpackage.tj6
            if (r3 == 0) goto L1f
            r3 = r15
            tj6 r3 = (defpackage.tj6) r3
            int r4 = r3.A
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1f
            int r4 = r4 - r5
            r3.A = r4
            goto L24
        L1f:
            tj6 r3 = new tj6
            r3.<init>(r13, r15)
        L24:
            java.lang.Object r15 = r3.y
            int r4 = r3.A
            r5 = 0
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L3e
            if (r4 == r7) goto L38
            if (r4 != r6) goto L32
            goto L38
        L32:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r13)
            return r5
        L38:
            int[] r14 = r3.x
            defpackage.m37.N(r15)
            goto L98
        L3e:
            defpackage.m37.N(r15)
            java.lang.Object r15 = r2.x
            w11 r4 = defpackage.w11.x
            if (r15 != 0) goto L56
            java.util.Set r13 = defpackage.ms.U0(r0)
            r3.x = r14
            r3.A = r7
            java.lang.Object r13 = r1.emit(r13, r3)
            if (r13 != r4) goto L98
            goto L97
        L56:
            java.lang.Object r13 = r13.B
            int[] r13 = (int[]) r13
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            int r7 = r0.length
            r8 = 0
            r9 = r8
        L62:
            if (r8 >= r7) goto L83
            r10 = r0[r8]
            int r11 = r9 + 1
            java.lang.Object r12 = r2.x
            if (r12 == 0) goto L7d
            int[] r12 = (int[]) r12
            r9 = r13[r9]
            r12 = r12[r9]
            r9 = r14[r9]
            if (r12 == r9) goto L79
            r15.add(r10)
        L79:
            int r8 = r8 + 1
            r9 = r11
            goto L62
        L7d:
            java.lang.String r13 = "Required value was null."
            defpackage.ze0.m(r13)
            return r5
        L83:
            boolean r13 = r15.isEmpty()
            if (r13 != 0) goto L98
            java.util.Set r13 = defpackage.yo0.N0(r15)
            r3.x = r14
            r3.A = r6
            java.lang.Object r13 = r1.emit(r13, r3)
            if (r13 != r4) goto L98
        L97:
            return r4
        L98:
            r2.x = r14
            pn6 r13 = defpackage.pn6.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vj0.a(int[], vz0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x015b  */
    @Override // defpackage.x42
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r19, defpackage.vz0 r20) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vj0.emit(java.lang.Object, vz0):java.lang.Object");
    }

    public vj0(w05 w05Var, x42 x42Var, String[] strArr, int[] iArr) {
        this.x = (byte) 4;
        this.z = w05Var;
        this.y = x42Var;
        this.A = strArr;
        this.B = iArr;
    }

    public /* synthetic */ vj0(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.x = b;
        this.z = obj;
        this.A = obj2;
        this.B = obj3;
        this.y = obj4;
    }
}
