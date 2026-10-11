package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yn1 extends x45 implements ic2 {
    public byte A;
    public Object B;
    public /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ byte y = 1;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn1(vj1 vj1Var, i iVar, ic2 ic2Var, sb2 sb2Var, mm mmVar, vz0 vz0Var) {
        super(2, vz0Var);
        this.B = vj1Var;
        this.C = iVar;
        this.D = ic2Var;
        this.E = sb2Var;
        this.F = mmVar;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.y;
        Object obj2 = this.F;
        Object obj3 = this.E;
        Object obj4 = this.D;
        switch (b) {
            case 0:
                yn1 yn1Var = new yn1((vj1) this.B, (i) this.C, (ic2) obj4, (sb2) obj3, (mm) obj2, vz0Var);
                yn1Var.z = obj;
                return yn1Var;
            case 1:
                yn1 yn1Var2 = new yn1((ai4) obj4, (u22) obj3, (vs0) obj2, vz0Var);
                yn1Var2.C = obj;
                return yn1Var2;
            default:
                yn1 yn1Var3 = new yn1(vz0Var, (v11) this.C, (ub2) obj3, (jc2) obj4, (ot4) obj2);
                yn1Var3.z = obj;
                return yn1Var3;
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.y;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                return ((yn1) create((z36) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 1:
                return ((yn1) create((ri5) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            default:
                return ((yn1) create((z36) obj, (vz0) obj2)).invokeSuspend(pn6Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0091, code lost:
    
        if (r5 == r9) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
    
        if (r10 == r9) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0135, code lost:
    
        if (r3 == r9) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [h43] */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yn1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn1(vz0 vz0Var, v11 v11Var, ub2 ub2Var, jc2 jc2Var, ot4 ot4Var) {
        super(2, vz0Var);
        this.C = v11Var;
        this.D = jc2Var;
        this.E = ub2Var;
        this.F = ot4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn1(ai4 ai4Var, u22 u22Var, vs0 vs0Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.D = ai4Var;
        this.E = u22Var;
        this.F = vs0Var;
    }
}
