package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class z extends x62 implements Runnable {
    public static final /* synthetic */ int I = 0;
    public ii3 F;
    public Class G;
    public Object H;

    public z(ii3 ii3Var, Class cls, Object obj) {
        this.F = ii3Var;
        this.G = cls;
        this.H = obj;
    }

    @Override // defpackage.j1
    public final void c() {
        boolean z;
        ii3 ii3Var = this.F;
        if (ii3Var != null) {
            z = true;
        } else {
            z = false;
        }
        if (z & (this.x instanceof x0)) {
            ii3Var.cancel(p());
        }
        this.F = null;
        this.G = null;
        this.H = null;
    }

    @Override // defpackage.j1
    public final String j() {
        String str;
        ii3 ii3Var = this.F;
        Class cls = this.G;
        Object obj = this.H;
        String j = super.j();
        if (ii3Var != null) {
            str = "inputFuture=[" + ii3Var + "], ";
        } else {
            str = "";
        }
        if (cls != null && obj != null) {
            return str + "exceptionType=[" + cls + "], fallback=[" + obj + "]";
        }
        if (j != null) {
            return str.concat(j);
        }
        return null;
    }

    public Object q(Object obj, Throwable th) {
        gt gtVar = (gt) obj;
        ii3 apply = gtVar.apply(th);
        io3.u(apply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", gtVar);
        return apply;
    }

    public void r(Object obj) {
        n((ii3) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r8 = this;
            ii3 r0 = r8.F
            java.lang.Class r1 = r8.G
            java.lang.Object r2 = r8.H
            r3 = 0
            r4 = 1
            if (r0 != 0) goto Lc
            r5 = r4
            goto Ld
        Lc:
            r5 = r3
        Ld:
            if (r1 != 0) goto L11
            r6 = r4
            goto L12
        L11:
            r6 = r3
        L12:
            r5 = r5 | r6
            if (r2 != 0) goto L16
            r3 = r4
        L16:
            r3 = r3 | r5
            if (r3 != 0) goto La4
            java.lang.Object r3 = r8.x
            boolean r3 = r3 instanceof defpackage.x0
            if (r3 == 0) goto L21
            goto La4
        L21:
            r3 = 0
            r8.F = r3
            boolean r4 = r0 instanceof defpackage.j1     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            if (r4 == 0) goto L34
            r4 = r0
            j1 r4 = (defpackage.j1) r4     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            java.lang.Throwable r4 = r4.o()     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            goto L35
        L30:
            r4 = move-exception
            goto L3c
        L32:
            r4 = move-exception
            goto L3e
        L34:
            r4 = r3
        L35:
            if (r4 != 0) goto L3c
            java.lang.Object r5 = defpackage.wc7.s(r0)     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            goto L6e
        L3c:
            r5 = r3
            goto L6e
        L3e:
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L6c
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Future type "
            r6.<init>(r7)
            java.lang.Class r7 = r0.getClass()
            r6.append(r7)
            java.lang.String r7 = " threw "
            r6.append(r7)
            java.lang.Class r4 = r4.getClass()
            r6.append(r4)
            java.lang.String r4 = " without a cause"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
        L6c:
            r4 = r5
            goto L3c
        L6e:
            if (r4 != 0) goto L74
            r8.l(r5)
            return
        L74:
            boolean r1 = r1.isInstance(r4)
            if (r1 != 0) goto L7e
            r8.n(r0)
            return
        L7e:
            java.lang.Object r0 = r8.q(r2, r4)     // Catch: java.lang.Throwable -> L8a
            r8.G = r3
            r8.H = r3
            r8.r(r0)
            return
        L8a:
            r0 = move-exception
            boolean r1 = r0 instanceof java.lang.InterruptedException     // Catch: java.lang.Throwable -> L9e
            if (r1 == 0) goto L96
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L9e
            r1.interrupt()     // Catch: java.lang.Throwable -> L9e
        L96:
            r8.m(r0)     // Catch: java.lang.Throwable -> L9e
            r8.G = r3
            r8.H = r3
            return
        L9e:
            r0 = move-exception
            r8.G = r3
            r8.H = r3
            throw r0
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z.run():void");
    }
}
