package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class y56 implements v11, gu5 {
    public final g56 x;
    public final gu5 y;
    public final l11 z;

    public y56(g56 g56Var, gu5 gu5Var, l11 l11Var) {
        g56Var.getClass();
        gu5Var.getClass();
        l11Var.getClass();
        this.x = g56Var;
        this.y = gu5Var;
        this.z = l11Var;
    }

    @Override // defpackage.e
    public final py4 a(nc0 nc0Var) {
        return zz.Z(this, this.z.plus(new r11("cio-tls-output-loop")), nc0Var, new x56(this, null, (byte) 1));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        g56 g56Var = this.x;
        g56Var.E.l(null);
        g56Var.G.f(null);
        ((t43) g56Var.z).l0(new pp5((Object) this, (byte) 6));
    }

    @Override // defpackage.ei1
    public final void dispose() {
        close();
    }

    @Override // defpackage.v11
    public final l11 getCoroutineContext() {
        return this.z;
    }

    @Override // defpackage.d
    public final k97 p(nc0 nc0Var) {
        return h41.p0(this, this.z.plus(new r11("cio-tls-input-loop")), nc0Var, new x56(this, null, (byte) 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0165, code lost:
    
        if (r1.f(r2) != r7) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0147, code lost:
    
        if (r1.f(r2) == r7) goto L66;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0025. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x004a: MOVE (r1 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:75), block:B:80:0x0049 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b7 A[Catch: all -> 0x010f, TryCatch #7 {all -> 0x010f, blocks: (B:21:0x0099, B:25:0x00af, B:27:0x00b7, B:29:0x00cf, B:50:0x0113, B:51:0x0136), top: B:20:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0137 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r10v1, types: [su4, nj0] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [vz4] */
    /* JADX WARN: Type inference failed for: r10v9, types: [vz4] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x010b -> B:20:0x0099). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(defpackage.ae0 r19, defpackage.xz0 r20) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y56.q(ae0, xz0):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(2:3|(4:5|6|7|(1:(1:(6:11|12|13|14|15|(2:17|18)(6:20|21|(1:23)|25|26|27))(2:29|30))(7:31|32|21|(0)|25|26|27))(6:33|34|35|36|15|(0)(0))))|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c0, code lost:
    
        if (r1.b(r2, r15) == r7) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0042, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cf, code lost:
    
        r6.G.f(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d4, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0098 A[Catch: all -> 0x0042, go0 -> 0x00c5, TRY_LEAVE, TryCatch #4 {go0 -> 0x00c5, all -> 0x0042, blocks: (B:12:0x0039, B:15:0x006d, B:21:0x008f, B:23:0x0098, B:32:0x0057), top: B:7:0x0027, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r11v7, types: [gc4] */
    /* JADX WARN: Type inference failed for: r11v8, types: [gc4] */
    /* JADX WARN: Type inference failed for: r14v0, types: [cv5, java.lang.Object, oa0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00c0 -> B:13:0x003c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(defpackage.wc0 r18, defpackage.xz0 r19) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y56.t(wc0, xz0):java.lang.Object");
    }
}
