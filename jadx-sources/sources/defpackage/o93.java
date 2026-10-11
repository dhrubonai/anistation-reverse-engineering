package defpackage;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class o93 implements x42 {
    public final /* synthetic */ q93 A;
    public final /* synthetic */ x73 B;
    public final /* synthetic */ Charset C;
    public int x;
    public final /* synthetic */ ae0 y;
    public final /* synthetic */ d53 z;

    public o93(ae0 ae0Var, d53 d53Var, q93 q93Var, x73 x73Var, Charset charset) {
        this.y = ae0Var;
        this.z = d53Var;
        this.A = q93Var;
        this.B = x73Var;
        this.C = charset;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009e, code lost:
    
        if (r2.d(r0) != r8) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006a, code lost:
    
        if (defpackage.h41.m0(r2, r12, 0, r12.length, r0) == r8) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.x42
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r11, defpackage.vz0 r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.n93
            if (r0 == 0) goto L13
            r0 = r12
            n93 r0 = (defpackage.n93) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.y = r1
            goto L18
        L13:
            n93 r0 = new n93
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.x
            int r1 = r0.y
            ae0 r2 = r10.y
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            w11 r8 = defpackage.w11.x
            if (r1 == 0) goto L4c
            if (r1 == r6) goto L40
            if (r1 == r5) goto L38
            if (r1 != r4) goto L32
            defpackage.m37.N(r12)
            goto La1
        L32:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r10)
            return r7
        L38:
            int r10 = r0.C
            int r11 = r0.B
            defpackage.m37.N(r12)
            goto L92
        L40:
            int r11 = r0.C
            int r1 = r0.B
            java.lang.Object r6 = r0.A
            defpackage.m37.N(r12)
            r12 = r11
            r11 = r6
            goto L6e
        L4c:
            defpackage.m37.N(r12)
            int r1 = r10.x
            int r12 = r1 + 1
            r10.x = r12
            if (r1 < 0) goto La4
            if (r1 <= 0) goto L6d
            d53 r12 = r10.z
            byte[] r12 = r12.c
            r0.A = r11
            r0.B = r1
            r0.C = r3
            r0.y = r6
            int r6 = r12.length
            java.lang.Object r12 = defpackage.h41.m0(r2, r12, r3, r6, r0)
            if (r12 != r8) goto L6d
            goto La0
        L6d:
            r12 = r3
        L6e:
            q93 r6 = r10.A
            y43 r6 = r6.a
            x73 r9 = r10.B
            mj5 r9 = (defpackage.mj5) r9
            java.lang.String r11 = r6.b(r9, r11)
            java.nio.charset.Charset r10 = r10.C
            byte[] r10 = defpackage.et5.l(r11, r10)
            r0.A = r7
            r0.B = r1
            r0.C = r12
            r0.y = r5
            int r11 = r10.length
            java.lang.Object r10 = defpackage.h41.m0(r2, r10, r3, r11, r0)
            if (r10 != r8) goto L90
            goto La0
        L90:
            r10 = r12
            r11 = r1
        L92:
            r0.A = r7
            r0.B = r11
            r0.C = r10
            r0.y = r4
            java.lang.Object r10 = r2.d(r0)
            if (r10 != r8) goto La1
        La0:
            return r8
        La1:
            pn6 r10 = defpackage.pn6.a
            return r10
        La4:
            java.lang.ArithmeticException r10 = new java.lang.ArithmeticException
            java.lang.String r11 = "Index overflow has happened"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o93.emit(java.lang.Object, vz0):java.lang.Object");
    }
}
