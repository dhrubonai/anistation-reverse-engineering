package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class yn0 implements ae0 {
    public final ae0 b;
    public final id0 c;

    public yn0(ae0 ae0Var, id0 id0Var) {
        this.b = ae0Var;
        this.c = id0Var;
    }

    @Override // defpackage.ae0
    public final void a(Throwable th) {
        this.b.a(th);
    }

    @Override // defpackage.ae0
    public final Throwable b() {
        return this.b.b();
    }

    @Override // defpackage.ae0
    public final Object d(vz0 vz0Var) {
        return this.b.d(vz0Var);
    }

    @Override // defpackage.ae0
    public final qq5 e() {
        return this.b.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        if (r5.c.invoke(r0) != r4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        if (r5.b.f(r0) == r4) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.ae0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.vz0 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.xn0
            if (r0 == 0) goto L13
            r0 = r6
            xn0 r0 = (defpackage.xn0) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            xn0 r0 = new xn0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.x
            int r1 = r0.z
            r2 = 2
            r3 = 1
            w11 r4 = defpackage.w11.x
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            defpackage.m37.N(r6)
            goto L4e
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r5)
            r5 = 0
            return r5
        L31:
            defpackage.m37.N(r6)
            goto L43
        L35:
            defpackage.m37.N(r6)
            r0.z = r3
            ae0 r6 = r5.b
            java.lang.Object r6 = r6.f(r0)
            if (r6 != r4) goto L43
            goto L4d
        L43:
            r0.z = r2
            id0 r5 = r5.c
            java.lang.Object r5 = r5.invoke(r0)
            if (r5 != r4) goto L4e
        L4d:
            return r4
        L4e:
            pn6 r5 = defpackage.pn6.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yn0.f(vz0):java.lang.Object");
    }

    @Override // defpackage.ae0
    public final boolean i() {
        return this.b.i();
    }
}
