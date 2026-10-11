package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class c16 implements x42 {
    public final x42 x;
    public final ic2 y;

    public c16(x42 x42Var, ic2 ic2Var) {
        this.x = x42Var;
        this.y = ic2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.xz0 r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.b16
            if (r0 == 0) goto L13
            r0 = r10
            b16 r0 = (defpackage.b16) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            b16 r0 = new b16
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.y
            int r1 = r0.A
            r2 = 0
            pn6 r3 = defpackage.pn6.a
            x42 r4 = r9.x
            r5 = 2
            r6 = 1
            w11 r7 = defpackage.w11.x
            if (r1 == 0) goto L3d
            if (r1 == r6) goto L35
            if (r1 != r5) goto L2f
            defpackage.m37.N(r10)
            return r3
        L2f:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r9)
            return r2
        L35:
            q85 r9 = r0.x
            defpackage.m37.N(r10)     // Catch: java.lang.Throwable -> L3b
            goto L57
        L3b:
            r10 = move-exception
            goto L70
        L3d:
            defpackage.m37.N(r10)
            q85 r10 = new q85
            l11 r1 = r0.getContext()
            r10.<init>(r4, r1)
            ic2 r9 = r9.y     // Catch: java.lang.Throwable -> L6c
            r0.x = r10     // Catch: java.lang.Throwable -> L6c
            r0.A = r6     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r9 = r9.invoke(r10, r0)     // Catch: java.lang.Throwable -> L6c
            if (r9 != r7) goto L56
            goto L6a
        L56:
            r9 = r10
        L57:
            r9.releaseIntercepted()
            boolean r9 = r4 instanceof defpackage.c16
            if (r9 == 0) goto L6b
            c16 r4 = (defpackage.c16) r4
            r0.x = r2
            r0.A = r5
            java.lang.Object r9 = r4.a(r0)
            if (r9 != r7) goto L6b
        L6a:
            return r7
        L6b:
            return r3
        L6c:
            r9 = move-exception
            r8 = r10
            r10 = r9
            r9 = r8
        L70:
            r9.releaseIntercepted()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c16.a(xz0):java.lang.Object");
    }

    @Override // defpackage.x42
    public final Object emit(Object obj, vz0 vz0Var) {
        return this.x.emit(obj, vz0Var);
    }
}
