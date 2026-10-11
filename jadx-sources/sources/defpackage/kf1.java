package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kf1 extends t36 implements ic2 {
    public final /* synthetic */ byte x;
    public byte y;
    public final /* synthetic */ pf1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kf1(pf1 pf1Var, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = pf1Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        pf1 pf1Var = this.z;
        switch (b) {
            case 0:
                return new kf1(pf1Var, vz0Var, (byte) 0);
            default:
                return new kf1(pf1Var, vz0Var, (byte) 1);
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
                return ((kf1) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((kf1) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r10 == r4) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008f, code lost:
    
        if (r10 == r4) goto L30;
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
            r2 = 5
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            w11 r4 = defpackage.w11.x
            r5 = 1
            r6 = 2
            pf1 r7 = r9.z
            r8 = 0
            switch(r0) {
                case 0: goto L5a;
                default: goto L11;
            }
        L11:
            byte r0 = r9.y
            if (r0 == 0) goto L26
            if (r0 == r5) goto L22
            if (r0 != r6) goto L1d
            defpackage.m37.N(r10)
            goto L59
        L1d:
            defpackage.ze0.m(r3)
            r1 = r8
            goto L59
        L22:
            defpackage.m37.N(r10)
            goto L49
        L26:
            defpackage.m37.N(r10)
            pn r10 = r7.b
            java.lang.String r0 = r7.e
            r9.y = r5
            zn r10 = (defpackage.zn) r10
            r10.getClass()
            tn r3 = new tn
            r3.<init>(r8, r10, r0)
            mx0 r10 = new mx0
            r10.<init>(r3, r2)
            ja1 r0 = defpackage.rh1.a
            j91 r0 = defpackage.j91.y
            w42 r10 = defpackage.zz.D(r10, r0)
            if (r10 != r4) goto L49
            goto L58
        L49:
            w42 r10 = (defpackage.w42) r10
            mf1 r0 = new mf1
            r0.<init>(r7, r8)
            r9.y = r6
            java.lang.Object r9 = defpackage.iv.q(r10, r0, r9)
            if (r9 != r4) goto L59
        L58:
            r1 = r4
        L59:
            return r1
        L5a:
            byte r0 = r9.y
            if (r0 == 0) goto L6f
            if (r0 == r5) goto L6b
            if (r0 != r6) goto L66
            defpackage.m37.N(r10)
            goto La3
        L66:
            defpackage.ze0.m(r3)
            r1 = r8
            goto La3
        L6b:
            defpackage.m37.N(r10)
            goto L92
        L6f:
            defpackage.m37.N(r10)
            pn r10 = r7.b
            java.lang.String r0 = r7.e
            r9.y = r5
            zn r10 = (defpackage.zn) r10
            r10.getClass()
            qn r3 = new qn
            r3.<init>(r8, r10, r0)
            mx0 r10 = new mx0
            r10.<init>(r3, r2)
            ja1 r0 = defpackage.rh1.a
            j91 r0 = defpackage.j91.y
            w42 r10 = defpackage.zz.D(r10, r0)
            if (r10 != r4) goto L92
            goto La2
        L92:
            w42 r10 = (defpackage.w42) r10
            jf1 r0 = new jf1
            r2 = 0
            r0.<init>(r7, r8, r2)
            r9.y = r6
            java.lang.Object r9 = defpackage.iv.q(r10, r0, r9)
            if (r9 != r4) goto La3
        La2:
            r1 = r4
        La3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kf1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
