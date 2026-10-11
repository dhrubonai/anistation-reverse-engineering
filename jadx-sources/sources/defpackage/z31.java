package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class z31 extends t36 implements ic2 {
    public /* synthetic */ Object A;
    public final /* synthetic */ v65 B;
    public final /* synthetic */ ub2 C;
    public final /* synthetic */ byte x;
    public uh6 y;
    public byte z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z31(byte b, vz0 vz0Var, ub2 ub2Var, v65 v65Var) {
        super(2, vz0Var);
        this.x = b;
        this.B = v65Var;
        this.C = ub2Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        switch (this.x) {
            case 0:
                z31 z31Var = new z31((byte) 0, vz0Var, this.C, this.B);
                z31Var.A = obj;
                return z31Var;
            default:
                z31 z31Var2 = new z31((byte) 1, vz0Var, this.C, this.B);
                z31Var2.A = obj;
                return z31Var2;
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        vh6 vh6Var = (vh6) obj;
        vz0 vz0Var = (vz0) obj2;
        switch (b) {
            case 0:
                return ((z31) create(vh6Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((z31) create(vh6Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0096, code lost:
    
        if (r14 != r3) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        if (r14.e(r13) == r3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013c, code lost:
    
        if (r14 != r3) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0127, code lost:
    
        if (r14.e(r13) == r3) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0156  */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z31.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
