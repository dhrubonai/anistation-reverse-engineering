package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class k52 implements w42 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ w42 y;
    public final /* synthetic */ ic2 z;

    public k52(ic2 ic2Var, w42 w42Var) {
        this.x = (byte) 0;
        this.z = ic2Var;
        this.y = w42Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0084, code lost:
    
        if (r4 == r3) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v2, types: [xz0] */
    /* JADX WARN: Type inference failed for: r11v4, types: [xz0] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    @Override // defpackage.w42
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(defpackage.x42 r10, defpackage.vz0 r11) {
        /*
            r9 = this;
            byte r0 = r9.x
            r1 = 2
            pn6 r2 = defpackage.pn6.a
            w11 r3 = defpackage.w11.x
            ic2 r4 = r9.z
            w42 r5 = r9.y
            switch(r0) {
                case 0: goto L2e;
                case 1: goto L1c;
                default: goto Le;
            }
        Le:
            ii r9 = new ii
            r0 = 6
            r9.<init>(r10, r4, r0)
            java.lang.Object r9 = r5.collect(r9, r11)
            if (r9 != r3) goto L1b
            r2 = r9
        L1b:
            return r2
        L1c:
            r05 r9 = new r05
            r9.<init>()
            zk r0 = new zk
            r0.<init>(r9, r10, r4, r1)
            java.lang.Object r9 = r5.collect(r0, r11)
            if (r9 != r3) goto L2d
            r2 = r9
        L2d:
            return r2
        L2e:
            boolean r0 = r11 instanceof defpackage.j52
            if (r0 == 0) goto L41
            r0 = r11
            j52 r0 = (defpackage.j52) r0
            int r6 = r0.y
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L41
            int r6 = r6 - r7
            r0.y = r6
            goto L46
        L41:
            j52 r0 = new j52
            r0.<init>(r9, r11)
        L46:
            java.lang.Object r9 = r0.x
            int r11 = r0.y
            r6 = 0
            r7 = 1
            if (r11 == 0) goto L6b
            if (r11 == r7) goto L5d
            if (r11 != r1) goto L56
            defpackage.m37.N(r9)
            goto L99
        L56:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r9)
            r2 = r6
            goto L99
        L5d:
            int r10 = r0.C
            q85 r11 = r0.B
            x42 r4 = r0.A
            defpackage.m37.N(r9)     // Catch: java.lang.Throwable -> L69
            r9 = r10
            r10 = r4
            goto L87
        L69:
            r9 = move-exception
            goto L9a
        L6b:
            defpackage.m37.N(r9)
            q85 r11 = new q85
            l11 r9 = r0.getContext()
            r11.<init>(r10, r9)
            r0.A = r10     // Catch: java.lang.Throwable -> L69
            r0.B = r11     // Catch: java.lang.Throwable -> L69
            r9 = 0
            r0.C = r9     // Catch: java.lang.Throwable -> L69
            r0.y = r7     // Catch: java.lang.Throwable -> L69
            java.lang.Object r4 = r4.invoke(r11, r0)     // Catch: java.lang.Throwable -> L69
            if (r4 != r3) goto L87
            goto L98
        L87:
            r11.releaseIntercepted()
            r0.A = r6
            r0.B = r6
            r0.C = r9
            r0.y = r1
            java.lang.Object r9 = r5.collect(r10, r0)
            if (r9 != r3) goto L99
        L98:
            r2 = r3
        L99:
            return r2
        L9a:
            r11.releaseIntercepted()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k52.collect(x42, vz0):java.lang.Object");
    }

    public /* synthetic */ k52(w42 w42Var, ic2 ic2Var, byte b) {
        this.x = b;
        this.y = w42Var;
        this.z = ic2Var;
    }
}
