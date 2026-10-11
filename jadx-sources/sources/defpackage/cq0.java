package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cq0 extends t36 implements ic2 {
    public int A;
    public int B;
    public int C;
    public byte D;
    public /* synthetic */ Object E;
    public final /* synthetic */ w42[] F;
    public final /* synthetic */ sb2 G;
    public final /* synthetic */ jc2 H;
    public final /* synthetic */ x42 I;
    public Object[] x;
    public lj0 y;
    public byte[] z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq0(vz0 vz0Var, x42 x42Var, sb2 sb2Var, jc2 jc2Var, w42[] w42VarArr) {
        super(2, vz0Var);
        this.F = w42VarArr;
        this.G = sb2Var;
        this.H = jc2Var;
        this.I = x42Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        cq0 cq0Var = new cq0(vz0Var, this.I, this.G, this.H, this.F);
        cq0Var.E = obj;
        return cq0Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((cq0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0133, code lost:
    
        if (r15.invoke(r14, r7, r19) == r9) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ce A[LOOP:0: B:18:0x00ce->B:25:0x00ef, LOOP_START, PHI: r2 r14
      0x00ce: PHI (r2v4 int) = (r2v3 int), (r2v5 int) binds: [B:14:0x00c9, B:25:0x00ef] A[DONT_GENERATE, DONT_INLINE]
      0x00ce: PHI (r14v6 xx2) = (r14v5 xx2), (r14v10 xx2) binds: [B:14:0x00c9, B:25:0x00ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0133 -> B:7:0x002e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0138 -> B:9:0x0118). Please report as a decompilation issue!!! */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cq0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
