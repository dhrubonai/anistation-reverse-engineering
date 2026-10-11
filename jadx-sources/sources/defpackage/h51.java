package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class h51 extends t36 implements ic2 {
    public final /* synthetic */ byte x;
    public byte y;
    public final /* synthetic */ p51 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h51(p51 p51Var, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = p51Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        p51 p51Var = this.z;
        switch (b) {
            case 0:
                return new h51(p51Var, vz0Var, (byte) 0);
            default:
                return new h51(p51Var, vz0Var, (byte) 1);
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        v11 v11Var = (v11) obj;
        vz0 vz0Var = (vz0) obj2;
        switch (b) {
            case 0:
                return ((h51) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((h51) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (r10 == r4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003d, code lost:
    
        if (r5.f(r9) == r4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0098, code lost:
    
        if (r10.collect(r0, r9) == r4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009b, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x007f, code lost:
    
        if (r10 == r4) goto L42;
     */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            byte r0 = r9.x
            r1 = -1
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            w11 r4 = defpackage.w11.x
            p51 r5 = r9.z
            r6 = 1
            r7 = 2
            switch(r0) {
                case 0: goto L55;
                default: goto Lf;
            }
        Lf:
            af2 r0 = r5.h
            byte r8 = r9.y
            if (r8 == 0) goto L27
            if (r8 == r6) goto L21
            if (r8 != r7) goto L1d
            defpackage.m37.N(r10)
            goto L4b
        L1d:
            defpackage.ze0.m(r3)
            goto L54
        L21:
            defpackage.m37.N(r10)     // Catch: java.lang.Throwable -> L25
            goto L40
        L25:
            r9 = move-exception
            goto L4f
        L27:
            defpackage.m37.N(r10)
            ox5 r10 = r0.f()
            boolean r10 = r10 instanceof defpackage.e32
            if (r10 == 0) goto L37
            ox5 r2 = r0.f()
            goto L54
        L37:
            r9.y = r6     // Catch: java.lang.Throwable -> L25
            java.lang.Object r10 = r5.f(r9)     // Catch: java.lang.Throwable -> L25
            if (r10 != r4) goto L40
            goto L49
        L40:
            r9.y = r7
            r10 = 0
            java.lang.Object r10 = r5.g(r10, r9)
            if (r10 != r4) goto L4b
        L49:
            r2 = r4
            goto L54
        L4b:
            r2 = r10
            ox5 r2 = (defpackage.ox5) r2
            goto L54
        L4f:
            ny4 r2 = new ny4
            r2.<init>(r9, r1)
        L54:
            return r2
        L55:
            byte r0 = r9.y
            pn6 r8 = defpackage.pn6.a
            if (r0 == 0) goto L6c
            if (r0 == r6) goto L68
            if (r0 != r7) goto L64
            defpackage.m37.N(r10)
        L62:
            r2 = r8
            goto L9b
        L64:
            defpackage.ze0.m(r3)
            goto L9b
        L68:
            defpackage.m37.N(r10)
            goto L82
        L6c:
            defpackage.m37.N(r10)
            zp2 r10 = r5.i
            r9.y = r6
            java.lang.Object r10 = r10.y
            zq0 r10 = (defpackage.zq0) r10
            java.lang.Object r10 = r10.o(r9)
            if (r10 != r4) goto L7e
            goto L7f
        L7e:
            r10 = r8
        L7f:
            if (r10 != r4) goto L82
            goto L9a
        L82:
            bq5 r10 = r5.c()
            mx0 r10 = r10.c
            w42 r10 = defpackage.zz.l(r10, r1)
            rc r0 = new rc
            r1 = 3
            r0.<init>(r5, r1)
            r9.y = r7
            java.lang.Object r9 = r10.collect(r0, r9)
            if (r9 != r4) goto L62
        L9a:
            r2 = r4
        L9b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h51.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
