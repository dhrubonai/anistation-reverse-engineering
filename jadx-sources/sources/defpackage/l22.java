package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class l22 implements ao0 {
    public final File a;
    public final nj5 b;
    public final bq5 c;
    public final vt0 d;
    public final AtomicBoolean e;
    public final m54 f;

    public l22(File file, nj5 nj5Var, bq5 bq5Var, vt0 vt0Var) {
        bq5Var.getClass();
        this.a = file;
        this.b = nj5Var;
        this.c = bq5Var;
        this.d = vt0Var;
        this.e = new AtomicBoolean(false);
        this.f = new m54();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(2:34|(7:36|37|38|40|41|42|(1:44)(1:45))(2:53|54))|13|14|15|(2:(1:18)|19)(1:21)))|57|6|7|(0)(0)|13|14|15|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        r7 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[Catch: all -> 0x0072, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0072, blocks: (B:21:0x0071, B:31:0x007f, B:28:0x0082, B:27:0x007a), top: B:7:0x0020, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r6v0, types: [l22] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [c51] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.c51 r7, defpackage.xz0 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.j22
            if (r0 == 0) goto L13
            r0 = r8
            j22 r0 = (defpackage.j22) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            j22 r0 = new j22
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.z
            int r1 = r0.B
            m54 r2 = r6.f
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2e
            boolean r6 = r0.x
            h22 r7 = r0.y
            defpackage.m37.N(r8)     // Catch: java.lang.Throwable -> L2c
            goto L63
        L2c:
            r8 = move-exception
            goto L7a
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r6)
            return r4
        L34:
            defpackage.m37.N(r8)
            java.util.concurrent.atomic.AtomicBoolean r8 = r6.e
            boolean r8 = r8.get()
            if (r8 != 0) goto L8a
            boolean r8 = r2.f()
            h22 r1 = new h22     // Catch: java.lang.Throwable -> L83
            java.io.File r5 = r6.a     // Catch: java.lang.Throwable -> L83
            nj5 r6 = r6.b     // Catch: java.lang.Throwable -> L83
            r1.<init>(r5, r6)     // Catch: java.lang.Throwable -> L83
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Throwable -> L75
            r0.y = r1     // Catch: java.lang.Throwable -> L75
            r0.x = r8     // Catch: java.lang.Throwable -> L75
            r0.B = r3     // Catch: java.lang.Throwable -> L75
            java.lang.Object r6 = r7.invoke(r1, r6, r0)     // Catch: java.lang.Throwable -> L75
            w11 r7 = defpackage.w11.x
            if (r6 != r7) goto L5f
            return r7
        L5f:
            r7 = r8
            r8 = r6
            r6 = r7
            r7 = r1
        L63:
            r7.close()     // Catch: java.lang.Throwable -> L68
            r7 = r4
            goto L69
        L68:
            r7 = move-exception
        L69:
            if (r7 != 0) goto L71
            if (r6 == 0) goto L70
            r2.l(r4)
        L70:
            return r8
        L71:
            throw r7     // Catch: java.lang.Throwable -> L72
        L72:
            r7 = move-exception
            r8 = r6
            goto L84
        L75:
            r6 = move-exception
            r7 = r8
            r8 = r6
            r6 = r7
            r7 = r1
        L7a:
            r7.close()     // Catch: java.lang.Throwable -> L7e
            goto L82
        L7e:
            r7 = move-exception
            defpackage.n03.i(r8, r7)     // Catch: java.lang.Throwable -> L72
        L82:
            throw r8     // Catch: java.lang.Throwable -> L72
        L83:
            r7 = move-exception
        L84:
            if (r8 == 0) goto L89
            r2.l(r4)
        L89:
            throw r7
        L8a:
            java.lang.String r6 = "StorageConnection has already been disposed."
            defpackage.ze0.m(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l22.a(c51, xz0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0082, code lost:
    
        if (r2 == r7) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c0 A[Catch: all -> 0x00fa, IOException -> 0x00fc, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x00fa, blocks: (B:19:0x00c0, B:25:0x00c6, B:27:0x00db, B:28:0x00f9, B:29:0x0106, B:38:0x0111, B:35:0x0114), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0106 A[Catch: all -> 0x00fa, IOException -> 0x00fc, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x00fa, blocks: (B:19:0x00c0, B:25:0x00c6, B:27:0x00db, B:28:0x00f9, B:29:0x0106, B:38:0x0111, B:35:0x0114), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v2, types: [ic2] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [k54] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.io.File] */
    /* JADX WARN: Type inference failed for: r8v2, types: [h22, x22, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.o51 r11, defpackage.xz0 r12) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l22.b(o51, xz0):java.lang.Object");
    }

    @Override // defpackage.ao0
    public final void close() {
        this.e.set(true);
        this.d.invoke();
    }
}
