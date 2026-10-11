package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class g21 implements wc0 {
    public final wc0 b;
    public final oa0 c = new Object();
    public long d;
    public long e;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, oa0] */
    public g21(wc0 wc0Var) {
        this.b = wc0Var;
    }

    @Override // defpackage.wc0
    public final void a(Throwable th) {
        this.b.a(th);
    }

    @Override // defpackage.wc0
    public final Throwable b() {
        return this.b.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // defpackage.wc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(int r8, defpackage.xz0 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.f21
            if (r0 == 0) goto L13
            r0 = r9
            f21 r0 = (defpackage.f21) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            f21 r0 = new f21
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.x
            int r1 = r0.z
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.m37.N(r9)
            goto L4b
        L25:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r7)
            r7 = 0
            return r7
        L2c:
            defpackage.m37.N(r9)
            r7.d()
            oa0 r9 = r7.c
            long r3 = r9.z
            long r5 = (long) r8
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 < 0) goto L3e
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        L3e:
            r0.z = r2
            wc0 r9 = r7.b
            java.lang.Object r9 = r9.c(r8, r0)
            w11 r8 = defpackage.w11.x
            if (r9 != r8) goto L4b
            return r8
        L4b:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r8 = r9.booleanValue()
            if (r8 == 0) goto L59
            r7.d()
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        L59:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g21.c(int, xz0):java.lang.Object");
    }

    public final void d() {
        e();
        this.d += this.c.G(this.b.g());
    }

    public final void e() {
        long j = this.e;
        long j2 = this.d;
        long j3 = this.c.z;
        this.e = (j2 - j3) + j;
        this.d = j3;
    }

    @Override // defpackage.wc0
    public final oa0 g() {
        d();
        return this.c;
    }

    @Override // defpackage.wc0
    public final boolean h() {
        if (this.c.D() && this.b.h()) {
            return true;
        }
        return false;
    }
}
