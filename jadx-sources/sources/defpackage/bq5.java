package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bq5 {
    public final m54 a = new m54();
    public final af2 b = new af2((byte) 8);
    public final mx0 c = new mx0(new pf(2, null, 1), 5);

    public bq5(String str) {
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.b.y).get());
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r8 != r5) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        if (r8 == r5) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r6v0, types: [bq5] */
    /* JADX WARN: Type inference failed for: r6v1, types: [k54] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v4, types: [k54] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ub2 r7, defpackage.xz0 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.zp5
            if (r0 == 0) goto L13
            r0 = r8
            zp5 r0 = (defpackage.zp5) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            zp5 r0 = new zp5
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.z
            int r1 = r0.B
            r2 = 2
            r3 = 1
            r4 = 0
            w11 r5 = defpackage.w11.x
            if (r1 == 0) goto L41
            if (r1 == r3) goto L37
            if (r1 != r2) goto L31
            java.lang.Object r6 = r0.x
            k54 r6 = (defpackage.k54) r6
            defpackage.m37.N(r8)     // Catch: java.lang.Throwable -> L2f
            goto L60
        L2f:
            r7 = move-exception
            goto L64
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r6)
            return r4
        L37:
            m54 r6 = r0.y
            java.lang.Object r7 = r0.x
            ub2 r7 = (defpackage.ub2) r7
            defpackage.m37.N(r8)
            goto L53
        L41:
            defpackage.m37.N(r8)
            r0.x = r7
            m54 r6 = r6.a
            r0.y = r6
            r0.B = r3
            java.lang.Object r8 = r6.a(r0)
            if (r8 != r5) goto L53
            goto L5f
        L53:
            r0.x = r6     // Catch: java.lang.Throwable -> L2f
            r0.y = r4     // Catch: java.lang.Throwable -> L2f
            r0.B = r2     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r8 = r7.invoke(r0)     // Catch: java.lang.Throwable -> L2f
            if (r8 != r5) goto L60
        L5f:
            return r5
        L60:
            r6.l(r4)
            return r8
        L64:
            r6.l(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bq5.b(ub2, xz0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ic2 r6, defpackage.xz0 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.aq5
            if (r0 == 0) goto L13
            r0 = r7
            aq5 r0 = (defpackage.aq5) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            aq5 r0 = new aq5
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.z
            int r1 = r0.B
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            boolean r5 = r0.y
            m54 r6 = r0.x
            defpackage.m37.N(r7)     // Catch: java.lang.Throwable -> L2a
            goto L52
        L2a:
            r7 = move-exception
            goto L5d
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r5)
            return r3
        L32:
            defpackage.m37.N(r7)
            m54 r5 = r5.a
            boolean r7 = r5.f()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> L58
            r0.x = r5     // Catch: java.lang.Throwable -> L58
            r0.y = r7     // Catch: java.lang.Throwable -> L58
            r0.B = r2     // Catch: java.lang.Throwable -> L58
            java.lang.Object r6 = r6.invoke(r1, r0)     // Catch: java.lang.Throwable -> L58
            w11 r0 = defpackage.w11.x
            if (r6 != r0) goto L4e
            return r0
        L4e:
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L52:
            if (r5 == 0) goto L57
            r6.l(r3)
        L57:
            return r7
        L58:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L5d:
            if (r5 == 0) goto L62
            r6.l(r3)
        L62:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bq5.c(ic2, xz0):java.lang.Object");
    }
}
