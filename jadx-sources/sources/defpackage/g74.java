package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class g74 extends t36 implements ic2 {
    public final /* synthetic */ sf5 A;
    public final /* synthetic */ wp5 B;
    public byte x;
    public final /* synthetic */ float y;
    public final /* synthetic */ float z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g74(float f, float f2, sf5 sf5Var, wp5 wp5Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.y = f;
        this.z = f2;
        this.A = sf5Var;
        this.B = wp5Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new g74(this.y, this.z, this.A, this.B, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((g74) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        if (defpackage.a34.i(r3.y.getValue(), r4) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        if (r9 != r8) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0037, code lost:
    
        if (r3.R(r4, r3.y.getValue(), r9) == r8) goto L30;
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
            pn6 r1 = defpackage.pn6.a
            sf5 r3 = r9.A
            float r2 = r9.z
            float r4 = r9.y
            r5 = 2
            r6 = 1
            w11 r8 = defpackage.w11.x
            if (r0 == 0) goto L23
            if (r0 == r6) goto L1f
            if (r0 != r5) goto L18
            defpackage.m37.N(r10)
            return r1
        L18:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r9)
            r9 = 0
            return r9
        L1f:
            defpackage.m37.N(r10)
            goto L3a
        L23:
            defpackage.m37.N(r10)
            int r10 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r10 != 0) goto L2b
            goto L3a
        L2b:
            r9.x = r6
            ti4 r10 = r3.y
            java.lang.Object r10 = r10.getValue()
            java.lang.Object r10 = r3.R(r4, r10, r9)
            if (r10 != r8) goto L3a
            goto L72
        L3a:
            int r10 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r10 != 0) goto L73
            r9.x = r5
            xi6 r5 = r3.B
            if (r5 != 0) goto L46
        L44:
            r9 = r1
            goto L70
        L46:
            ti4 r10 = r3.z
            java.lang.Object r10 = r10.getValue()
            wp5 r4 = r9.B
            boolean r10 = defpackage.a34.i(r10, r4)
            if (r10 == 0) goto L61
            ti4 r10 = r3.y
            java.lang.Object r10 = r10.getValue()
            boolean r10 = defpackage.a34.i(r10, r4)
            if (r10 == 0) goto L61
            goto L44
        L61:
            j54 r10 = r3.I
            mf5 r2 = new mf5
            r6 = 0
            r7 = 1
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Object r9 = defpackage.j54.a(r10, r2, r9)
            if (r9 != r8) goto L44
        L70:
            if (r9 != r8) goto L73
        L72:
            return r8
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g74.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
