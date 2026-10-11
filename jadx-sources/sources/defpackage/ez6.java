package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ez6 extends t36 implements ic2 {
    public final /* synthetic */ p90 A;
    public final /* synthetic */ w44 B;
    public final /* synthetic */ qi4 C;
    public final /* synthetic */ w44 D;
    public final /* synthetic */ af3 E;
    public byte x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez6(boolean z, boolean z2, p90 p90Var, w44 w44Var, qi4 qi4Var, w44 w44Var2, af3 af3Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.y = z;
        this.z = z2;
        this.A = p90Var;
        this.B = w44Var;
        this.C = qi4Var;
        this.D = w44Var2;
        this.E = af3Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new ez6(this.y, this.z, this.A, this.B, this.C, this.D, this.E, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((ez6) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x008c, code lost:
    
        if (defpackage.sw0.q(r9, r0, r8) == r6) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008e, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
    
        if (defpackage.t80.P(getContext()).a(r9, r8) == r6) goto L28;
     */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            byte r0 = r8.x
            r1 = 0
            pn6 r2 = defpackage.pn6.a
            w44 r3 = r8.B
            r4 = 2
            r5 = 1
            w11 r6 = defpackage.w11.x
            if (r0 == 0) goto L20
            if (r0 == r5) goto L1c
            if (r0 != r4) goto L16
            defpackage.m37.N(r9)
            goto L8f
        L16:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r8)
            return r1
        L1c:
            defpackage.m37.N(r9)
            goto L76
        L20:
            defpackage.m37.N(r9)
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r3.setValue(r9)
            boolean r9 = r8.y
            if (r9 == 0) goto L94
            boolean r9 = r8.z
            if (r9 != 0) goto L94
            qi4 r9 = r8.C
            int r9 = r9.h()
            if (r9 != 0) goto L94
            w44 r9 = r8.D
            java.lang.Object r9 = r9.getValue()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L94
            p90 r9 = r8.A
            float r0 = r9.c()
            r7 = 0
            int r0 = defpackage.vm1.b(r0, r7)
            if (r0 <= 0) goto L94
            float r9 = r9.b()
            int r9 = defpackage.vm1.b(r9, r7)
            if (r9 > 0) goto L5e
            goto L94
        L5e:
            dr6 r9 = new dr6
            r0 = 18
            r9.<init>(r0)
            r8.x = r5
            l11 r0 = r8.getContext()
            uf r0 = defpackage.t80.P(r0)
            java.lang.Object r9 = r0.a(r9, r8)
            if (r9 != r6) goto L76
            goto L8e
        L76:
            ge3 r9 = new ge3
            af3 r0 = r8.E
            r9.<init>(r0, r4)
            mx0 r9 = defpackage.wt5.j(r9)
            cz6 r0 = new cz6
            r0.<init>(r4, r1, r5)
            r8.x = r4
            java.lang.Object r8 = defpackage.sw0.q(r9, r0, r8)
            if (r8 != r6) goto L8f
        L8e:
            return r6
        L8f:
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r3.setValue(r8)
        L94:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
