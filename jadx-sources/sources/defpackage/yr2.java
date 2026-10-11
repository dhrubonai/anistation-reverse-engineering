package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class yr2 {
    public static final yk3 a;
    public static final q18 b;
    public static final dn0 c;
    public static final ou d;
    public static final ou e;
    public static final ou f;
    public static final ou g;
    public static final ou h;

    static {
        al6 al6Var;
        al6 al6Var2;
        al6 al6Var3;
        al6 al6Var4;
        Class cls = Boolean.TYPE;
        Class cls2 = Integer.TYPE;
        a = u93.a("io.ktor.client.plugins.HttpRequestRetry");
        b = new q18((byte) 17);
        c = new dn0("RetryFeature", ur2.x, new t72((byte) 21));
        im0 a2 = z05.a(Integer.class);
        al6 al6Var5 = null;
        try {
            al6Var = z05.c(cls2);
        } catch (Throwable unused) {
            al6Var = null;
        }
        d = new ou("MaxRetriesPerRequestAttributeKey", new vk6(a2, false, al6Var));
        im0 a3 = z05.a(jc2.class);
        boolean u = wk6.u(3, null);
        try {
            a83 a83Var = a83.c;
            al6Var2 = z05.e(jc2.class, sw0.y(z05.c(gs2.class)), sw0.y(z05.c(nr2.class)), sw0.y(z05.c(f91.class)), sw0.y(z05.c(cls)));
        } catch (Throwable unused2) {
            al6Var2 = null;
        }
        e = new ou("ShouldRetryPerRequestAttributeKey", new vk6(a3, u, al6Var2));
        im0 a4 = z05.a(jc2.class);
        boolean u2 = wk6.u(3, null);
        try {
            a83 a83Var2 = a83.c;
            al6Var3 = z05.e(jc2.class, sw0.y(z05.c(gs2.class)), sw0.y(z05.c(or2.class)), sw0.y(z05.c(Throwable.class)), sw0.y(z05.c(cls)));
        } catch (Throwable unused3) {
            al6Var3 = null;
        }
        f = new ou("ShouldRetryOnExceptionPerRequestAttributeKey", new vk6(a4, u2, al6Var3));
        im0 a5 = z05.a(ic2.class);
        boolean u3 = wk6.u(2, null);
        try {
            a83 a83Var3 = a83.c;
            al6Var4 = z05.e(ic2.class, sw0.y(z05.c(fs2.class)), sw0.y(z05.c(or2.class)), sw0.y(z05.c(pn6.class)));
        } catch (Throwable unused4) {
            al6Var4 = null;
        }
        g = new ou("ModifyRequestPerRequestAttributeKey", new vk6(a5, u3, al6Var4));
        im0 a6 = z05.a(ic2.class);
        boolean u4 = wk6.u(2, null);
        try {
            a83 a83Var4 = a83.c;
            al6Var5 = z05.e(ic2.class, sw0.y(z05.c(es2.class)), sw0.y(z05.c(cls2)), sw0.y(z05.c(Long.TYPE)));
        } catch (Throwable unused5) {
        }
        h = new ou("RetryDelayPerRequestAttributeKey", new vk6(a6, u4, al6Var5));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(2:3|(9:5|6|7|(1:(2:10|11)(2:27|28))(5:29|(4:31|32|33|(1:35))|19|20|21)|12|13|14|15|(1:17)))|7|(0)(0)|12|13|14|15|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0084, code lost:
    
        if (r7 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        r4 = new defpackage.y45(r6);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r0v2, types: [xr2, xz0] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, f91] */
    /* JADX WARN: Type inference failed for: r6v1, types: [wc0] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v4, types: [wc0] */
    /* JADX WARN: Type inference failed for: r6v6, types: [wc0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.f91 r6, defpackage.xz0 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.xr2
            if (r0 == 0) goto L13
            r0 = r7
            xr2 r0 = (defpackage.xr2) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            xr2 r0 = new xr2
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.y
            int r1 = r0.z
            java.lang.String r2 = "Failed to close response body channel"
            yk3 r3 = defpackage.yr2.a
            pn6 r4 = defpackage.pn6.a
            r5 = 1
            if (r1 == 0) goto L36
            if (r1 != r5) goto L2f
            wc0 r6 = r0.x
            defpackage.m37.N(r7)     // Catch: java.lang.Throwable -> L2d
            goto L6b
        L2d:
            r7 = move-exception
            goto L87
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r6)
            r6 = 0
            return r6
        L36:
            defpackage.m37.N(r7)
            ou r7 = defpackage.zi1.a
            r6.getClass()
            yp2 r7 = r6.d0()
            mv0 r7 = r7.getAttributes()
            ou r1 = defpackage.zi1.b
            r7.getClass()
            r1.getClass()
            java.util.Map r7 = r7.c()
            boolean r7 = r7.containsKey(r1)
            if (r7 == 0) goto L9b
            wc0 r6 = r6.b()
            r0.x = r6     // Catch: java.lang.Throwable -> L2d
            r0.z = r5     // Catch: java.lang.Throwable -> L2d
            vc0 r7 = defpackage.wc0.a     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r7 = r6.c(r5, r0)     // Catch: java.lang.Throwable -> L2d
            w11 r0 = defpackage.w11.x
            if (r7 != r0) goto L6b
            return r0
        L6b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L2d
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L2d
            defpackage.iv.p(r6)     // Catch: java.lang.Throwable -> L75
            goto L7b
        L75:
            r6 = move-exception
            y45 r4 = new y45
            r4.<init>(r6)
        L7b:
            java.lang.Throwable r6 = defpackage.z45.b(r4)
            if (r6 == 0) goto L84
            r3.f(r2, r6)
        L84:
            if (r7 == 0) goto L9b
            goto L9c
        L87:
            defpackage.iv.p(r6)     // Catch: java.lang.Throwable -> L8b
            goto L91
        L8b:
            r6 = move-exception
            y45 r4 = new y45
            r4.<init>(r6)
        L91:
            java.lang.Throwable r6 = defpackage.z45.b(r4)
            if (r6 == 0) goto L9a
            r3.f(r2, r6)
        L9a:
            throw r7
        L9b:
            r5 = 0
        L9c:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yr2.a(f91, xz0):java.lang.Object");
    }
}
