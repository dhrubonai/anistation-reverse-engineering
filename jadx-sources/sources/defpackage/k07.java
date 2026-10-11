package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class k07 extends t36 implements ic2 {
    public final /* synthetic */ xx6 A;
    public final /* synthetic */ y71 B;
    public final /* synthetic */ px5 C;
    public final /* synthetic */ w44 D;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ e9 y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k07(boolean z, e9 e9Var, boolean z2, xx6 xx6Var, y71 y71Var, px5 px5Var, w44 w44Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.x = z;
        this.y = e9Var;
        this.z = z2;
        this.A = xx6Var;
        this.B = y71Var;
        this.C = px5Var;
        this.D = w44Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new k07(this.x, this.y, this.z, this.A, this.B, this.C, this.D, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        k07 k07Var = (k07) create((v11) obj, (vz0) obj2);
        pn6 pn6Var = pn6.a;
        k07Var.invokeSuspend(pn6Var);
        return pn6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r7.z == false) goto L14;
     */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            defpackage.m37.N(r8)
            tw5 r8 = defpackage.s07.a
            px5 r8 = r7.C
            java.lang.Object r8 = r8.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L82
            w44 r8 = r7.D
            boolean r8 = defpackage.s07.e(r8)
            if (r8 != 0) goto L82
            boolean r8 = r7.x
            e9 r0 = r7.y
            if (r8 == 0) goto L30
            ti4 r8 = r0.d
            java.lang.Object r8 = r8.getValue()
            xx6 r1 = defpackage.xx6.x
            if (r8 != r1) goto L30
            boolean r8 = r7.z
            if (r8 != 0) goto L30
            goto L32
        L30:
            xx6 r1 = r7.A
        L32:
            y71 r8 = r0.b()
            ti4 r2 = r0.h
            y71 r7 = r7.B
            boolean r8 = defpackage.a34.i(r8, r7)
            if (r8 != 0) goto L82
            ti4 r8 = r0.i
            r8.setValue(r7)
            i54 r7 = r0.b
            m54 r8 = r7.b
            m54 r7 = r7.b
            boolean r8 = r8.f()
            if (r8 == 0) goto L7d
            r3 = 0
            a9 r4 = r0.j     // Catch: java.lang.Throwable -> L69
            y71 r5 = r0.b()     // Catch: java.lang.Throwable -> L69
            float r5 = r5.c(r1)     // Catch: java.lang.Throwable -> L69
            boolean r6 = java.lang.Float.isNaN(r5)     // Catch: java.lang.Throwable -> L69
            if (r6 != 0) goto L6b
            defpackage.a9.b(r4, r5)     // Catch: java.lang.Throwable -> L69
            r2.setValue(r3)     // Catch: java.lang.Throwable -> L69
            goto L6b
        L69:
            r8 = move-exception
            goto L79
        L6b:
            ti4 r4 = r0.c     // Catch: java.lang.Throwable -> L69
            r4.setValue(r1)     // Catch: java.lang.Throwable -> L69
            ti4 r0 = r0.d     // Catch: java.lang.Throwable -> L69
            r0.setValue(r1)     // Catch: java.lang.Throwable -> L69
            r7.l(r3)
            goto L7d
        L79:
            r7.l(r3)
            throw r8
        L7d:
            if (r8 != 0) goto L82
            r2.setValue(r1)
        L82:
            pn6 r7 = defpackage.pn6.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k07.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
