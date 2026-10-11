package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dc6 extends t36 implements ic2 {
    public final /* synthetic */ cc6 A;
    public final /* synthetic */ long B;
    public final /* synthetic */ u34 C;
    public byte x;
    public /* synthetic */ Object y;
    public final /* synthetic */ ot4 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc6(ot4 ot4Var, cc6 cc6Var, long j, u34 u34Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.z = ot4Var;
        this.A = cc6Var;
        this.B = j;
        this.C = u34Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        dc6 dc6Var = new dc6(this.z, this.A, this.B, this.C, vz0Var);
        dc6Var.y = obj;
        return dc6Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((dc6) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        if (r13.C.a(r14, r13) == r5) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
    
        if (r14 == r5) goto L20;
     */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            byte r0 = r13.x
            r1 = 0
            cc6 r2 = r13.A
            r3 = 2
            r4 = 1
            w11 r5 = defpackage.w11.x
            if (r0 == 0) goto L1d
            if (r0 == r4) goto L19
            if (r0 != r3) goto L13
            defpackage.m37.N(r14)
            goto L62
        L13:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r13)
            return r1
        L19:
            defpackage.m37.N(r14)
            goto L40
        L1d:
            defpackage.m37.N(r14)
            java.lang.Object r14 = r13.y
            v11 r14 = (defpackage.v11) r14
            f0 r6 = new f0
            r11 = 0
            r12 = 3
            cc6 r7 = r13.A
            long r8 = r13.B
            u34 r10 = r13.C
            r6.<init>(r7, r8, r10, r11, r12)
            r0 = 3
            defpackage.tl7.z(r14, r1, r1, r6, r0)
            r13.x = r4
            ot4 r14 = r13.z
            java.lang.Object r14 = r14.e(r13)
            if (r14 != r5) goto L40
            goto L61
        L40:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            qt4 r0 = r2.w
            if (r0 == 0) goto L62
            if (r14 == 0) goto L52
            rt4 r14 = new rt4
            r14.<init>(r0)
            goto L57
        L52:
            pt4 r14 = new pt4
            r14.<init>(r0)
        L57:
            r13.x = r3
            u34 r0 = r13.C
            java.lang.Object r13 = r0.a(r14, r13)
            if (r13 != r5) goto L62
        L61:
            return r5
        L62:
            r2.w = r1
            pn6 r13 = defpackage.pn6.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dc6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
