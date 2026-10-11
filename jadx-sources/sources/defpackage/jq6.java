package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class jq6 extends t36 implements ic2 {
    public final /* synthetic */ yg4 A;
    public final /* synthetic */ ae0 B;
    public final /* synthetic */ py4 C;
    public final /* synthetic */ ae0 D;
    public final /* synthetic */ boolean E;
    public Throwable x;
    public byte y;
    public final /* synthetic */ ls0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq6(ls0 ls0Var, yg4 yg4Var, ae0 ae0Var, py4 py4Var, ae0 ae0Var2, boolean z, vz0 vz0Var) {
        super(2, vz0Var);
        this.z = ls0Var;
        this.A = yg4Var;
        this.B = ae0Var;
        this.C = py4Var;
        this.D = ae0Var2;
        this.E = z;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new jq6(this.z, this.A, this.B, this.C, this.D, this.E, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((jq6) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0074, code lost:
    
        if (r13 == r12) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0058, code lost:
    
        if (r11.d(r13) == r12) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x004e, code lost:
    
        if (defpackage.ov5.c(r14, r11, r13) == r12) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x009d, code lost:
    
        if (r11.d(r13) != r12) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008c  */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jq6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
