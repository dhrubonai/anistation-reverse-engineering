package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class x92 extends x45 implements ic2 {
    public /* synthetic */ Object A;
    public Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ byte y;
    public byte z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x92(Object obj, Object obj2, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.y = b;
        this.B = obj;
        this.C = obj2;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.y;
        Object obj2 = this.C;
        switch (b) {
            case 0:
                x92 x92Var = new x92((l11) this.B, (ic2) obj2, vz0Var, (byte) 0);
                x92Var.A = obj;
                return x92Var;
            case 1:
                x92 x92Var2 = new x92((k96) obj2, vz0Var);
                x92Var2.A = obj;
                return x92Var2;
            default:
                x92 x92Var3 = new x92((oq4) this.B, (w05) obj2, vz0Var, (byte) 2);
                x92Var3.A = obj;
                return x92Var3;
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.y;
        pn6 pn6Var = pn6.a;
        z36 z36Var = (z36) obj;
        vz0 vz0Var = (vz0) obj2;
        switch (b) {
            case 0:
                return ((x92) create(z36Var, vz0Var)).invokeSuspend(pn6Var);
            case 1:
                return ((x92) create(z36Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((x92) create(z36Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x01d4, code lost:
    
        if (defpackage.n77.r(r5, r2, r18) == r7) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r5 != r7) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ae, code lost:
    
        if (r3 == r7) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x013f, code lost:
    
        if (r4 != r7) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0124, code lost:
    
        if (r3 == r7) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01c3, code lost:
    
        if (defpackage.n77.r(r5, r2, r18) != r7) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ad A[Catch: CancellationException -> 0x0194, TRY_ENTER, TryCatch #0 {CancellationException -> 0x0194, blocks: (B:91:0x01ad, B:96:0x01bb, B:104:0x0190, B:106:0x019b), top: B:82:0x0176 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00ae -> B:8:0x00b2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x013f -> B:49:0x0143). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x01c3 -> B:74:0x01a7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x01d4 -> B:74:0x01a7). Please report as a decompilation issue!!! */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x92.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x92(k96 k96Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.y = (byte) 1;
        this.C = k96Var;
    }
}
