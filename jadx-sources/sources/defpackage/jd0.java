package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jd0 extends t36 implements ic2 {
    public byte A;
    public /* synthetic */ Object B;
    public final /* synthetic */ ic2 C;
    public final /* synthetic */ nc0 D;
    public final /* synthetic */ byte x;
    public j43 y;
    public Throwable z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jd0(ic2 ic2Var, nc0 nc0Var, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.C = ic2Var;
        this.D = nc0Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        nc0 nc0Var = this.D;
        ic2 ic2Var = this.C;
        switch (b) {
            case 0:
                jd0 jd0Var = new jd0(ic2Var, nc0Var, vz0Var, (byte) 0);
                jd0Var.B = obj;
                return jd0Var;
            default:
                jd0 jd0Var2 = new jd0(ic2Var, nc0Var, vz0Var, (byte) 1);
                jd0Var2.B = obj;
                return jd0Var2;
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
                return ((jd0) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((jd0) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f9, code lost:
    
        if (r9.f(r12) == r8) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d8, code lost:
    
        if (r9.f(r12) == r8) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b1, code lost:
    
        if (r9.f(r12) == r8) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a2, code lost:
    
        if (r5.G(r12) != r8) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c8, code lost:
    
        if (r5.G(r12) == r8) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e9, code lost:
    
        if (r5.G(r12) != r8) goto L110;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0089 A[Catch: all -> 0x004a, TRY_LEAVE, TryCatch #4 {all -> 0x004a, blocks: (B:38:0x0046, B:39:0x0078, B:41:0x0089), top: B:37:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jd0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
