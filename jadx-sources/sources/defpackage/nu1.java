package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nu1 extends t36 implements ic2 {
    public final /* synthetic */ ev2 A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ h95 C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ byte x = 1;
    public boolean y;
    public final /* synthetic */ qu1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu1(qu1 qu1Var, ev2 ev2Var, Object obj, mg4 mg4Var, h95 h95Var, gx3 gx3Var, mz4 mz4Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.z = qu1Var;
        this.A = ev2Var;
        this.B = obj;
        this.D = mg4Var;
        this.C = h95Var;
        this.E = gx3Var;
        this.F = mz4Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        Object obj2 = this.F;
        Object obj3 = this.E;
        Object obj4 = this.D;
        switch (b) {
            case 0:
                h95 h95Var = this.C;
                return new nu1(this.z, (w05) obj4, (w05) obj3, this.A, this.B, (w05) obj2, h95Var, vz0Var);
            default:
                return new nu1(this.z, this.A, this.B, (mg4) obj4, this.C, (gx3) obj3, (mz4) obj2, vz0Var);
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
                return ((nu1) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((nu1) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0033, code lost:
    
        if (r0 == r8) goto L11;
     */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nu1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu1(qu1 qu1Var, w05 w05Var, w05 w05Var2, ev2 ev2Var, Object obj, w05 w05Var3, h95 h95Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.z = qu1Var;
        this.D = w05Var;
        this.E = w05Var2;
        this.A = ev2Var;
        this.B = obj;
        this.F = w05Var3;
        this.C = h95Var;
    }
}
