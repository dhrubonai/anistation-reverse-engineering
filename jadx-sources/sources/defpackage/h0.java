package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class h0 extends t36 implements ic2 {
    public final /* synthetic */ qt4 A;
    public final /* synthetic */ k0 B;
    public final /* synthetic */ byte x;
    public byte y;
    public final /* synthetic */ u34 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(u34 u34Var, qt4 qt4Var, k0 k0Var, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = u34Var;
        this.A = qt4Var;
        this.B = k0Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        switch (this.x) {
            case 0:
                return new h0(this.z, this.A, this.B, vz0Var, (byte) 0);
            default:
                return new h0(this.z, this.A, this.B, vz0Var, (byte) 1);
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
                return ((h0) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((h0) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r3.a(r9, r10) == r6) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        if (defpackage.x97.u(r4, r10) == r6) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
    
        if (r3.a(r9, r10) == r6) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0064, code lost:
    
        if (defpackage.x97.u(r4, r10) == r6) goto L31;
     */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            byte r0 = r10.x
            pn6 r1 = defpackage.pn6.a
            k0 r2 = r10.B
            u34 r3 = r10.z
            r4 = 0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            w11 r6 = defpackage.w11.x
            r7 = 1
            r8 = 2
            qt4 r9 = r10.A
            switch(r0) {
                case 0: goto L44;
                default: goto L14;
            }
        L14:
            byte r0 = r10.y
            if (r0 == 0) goto L29
            if (r0 == r7) goto L25
            if (r0 != r8) goto L20
            defpackage.m37.N(r11)
            goto L41
        L20:
            defpackage.ze0.m(r5)
            r1 = r4
            goto L43
        L25:
            defpackage.m37.N(r11)
            goto L37
        L29:
            defpackage.m37.N(r11)
            long r4 = defpackage.vm0.a
            r10.y = r7
            java.lang.Object r11 = defpackage.x97.u(r4, r10)
            if (r11 != r6) goto L37
            goto L3f
        L37:
            r10.y = r8
            java.lang.Object r10 = r3.a(r9, r10)
            if (r10 != r6) goto L41
        L3f:
            r1 = r6
            goto L43
        L41:
            r2.Z = r9
        L43:
            return r1
        L44:
            byte r0 = r10.y
            if (r0 == 0) goto L59
            if (r0 == r7) goto L55
            if (r0 != r8) goto L50
            defpackage.m37.N(r11)
            goto L71
        L50:
            defpackage.ze0.m(r5)
            r1 = r4
            goto L73
        L55:
            defpackage.m37.N(r11)
            goto L67
        L59:
            defpackage.m37.N(r11)
            long r4 = defpackage.vm0.a
            r10.y = r7
            java.lang.Object r11 = defpackage.x97.u(r4, r10)
            if (r11 != r6) goto L67
            goto L6f
        L67:
            r10.y = r8
            java.lang.Object r10 = r3.a(r9, r10)
            if (r10 != r6) goto L71
        L6f:
            r1 = r6
            goto L73
        L71:
            r2.d0 = r9
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
