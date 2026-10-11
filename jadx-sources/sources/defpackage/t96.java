package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class t96 extends t36 implements ic2 {
    public final /* synthetic */ u96 A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ long C;
    public final /* synthetic */ n05 D;
    public float x;
    public byte y;
    public final /* synthetic */ float z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t96(float f, u96 u96Var, boolean z, long j, n05 n05Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.z = f;
        this.A = u96Var;
        this.B = z;
        this.C = j;
        this.D = n05Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new t96(this.z, this.A, this.B, this.C, this.D, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((t96) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008e, code lost:
    
        if (r9.a(r6, r8) == r5) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0090, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004f, code lost:
    
        if (r9 == r5) goto L36;
     */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            byte r0 = r8.y
            u96 r1 = r8.A
            r2 = 0
            r3 = 2
            r4 = 1
            w11 r5 = defpackage.w11.x
            if (r0 == 0) goto L21
            if (r0 == r4) goto L1b
            if (r0 != r3) goto L14
            defpackage.m37.N(r9)
            goto L91
        L14:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r8)
            r8 = 0
            return r8
        L1b:
            float r0 = r8.x
            defpackage.m37.N(r9)
            goto L52
        L21:
            defpackage.m37.N(r9)
            float r9 = r8.z
            boolean r0 = java.lang.Float.isNaN(r9)
            if (r0 != 0) goto L3d
            boolean r0 = java.lang.Float.isInfinite(r9)
            if (r0 == 0) goto L33
            goto L3d
        L33:
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 <= 0) goto L3f
            double r6 = (double) r9
            double r6 = java.lang.Math.ceil(r6)
        L3c:
            float r9 = (float) r6
        L3d:
            r0 = r9
            goto L45
        L3f:
            double r6 = (double) r9
            double r6 = java.lang.Math.floor(r6)
            goto L3c
        L45:
            yc5 r9 = r1.U
            r8.x = r0
            r8.y = r4
            java.lang.Object r9 = defpackage.jf7.I(r9, r0, r8)
            if (r9 != r5) goto L52
            goto L90
        L52:
            java.lang.Number r9 = (java.lang.Number) r9
            float r9 = r9.floatValue()
            boolean r4 = r8.B
            if (r4 == 0) goto L91
            long r6 = r8.C
            boolean r4 = defpackage.nd6.d(r6)
            n05 r6 = r8.D
            if (r4 == 0) goto L84
            float r4 = r6.c
            float r7 = r6.a
            float r4 = r4 - r7
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 > 0) goto L84
            float r0 = r0 - r9
            float r9 = java.lang.Math.abs(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 >= 0) goto L7b
            goto L84
        L7b:
            float r9 = r6.c
            float r9 = r9 + r0
            r0 = 11
            n05 r6 = defpackage.n05.b(r6, r2, r9, r0)
        L84:
            dd6 r9 = r1.P
            y90 r9 = r9.g
            r8.y = r3
            java.lang.Object r8 = r9.a(r6, r8)
            if (r8 != r5) goto L91
        L90:
            return r5
        L91:
            pn6 r8 = defpackage.pn6.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t96.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
