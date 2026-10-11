package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class g50 extends x45 implements ic2 {
    public long A;
    public byte B;
    public /* synthetic */ Object C;
    public final /* synthetic */ v11 D;
    public final /* synthetic */ ng6 E;
    public x44 y;
    public oq4 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g50(v11 v11Var, ng6 ng6Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.D = v11Var;
        this.E = ng6Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        g50 g50Var = new g50(this.D, this.E, vz0Var);
        g50Var.C = obj;
        return g50Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((g50) create((z36) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00c3 A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #1 {all -> 0x0019, blocks: (B:8:0x0014, B:9:0x00bf, B:11:0x00c3), top: B:7:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00be  */
    /* JADX WARN: Type inference failed for: r6v8, types: [x44] */
    /* JADX WARN: Type inference failed for: r8v3, types: [x44] */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g50.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
