package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class i10 extends t36 implements ub2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ byte x;
    public byte y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i10(Object obj, Object obj2, vz0 vz0Var, byte b) {
        super(1, vz0Var);
        this.x = b;
        this.z = obj;
        this.A = obj2;
    }

    @Override // defpackage.h30
    public final vz0 create(vz0 vz0Var) {
        byte b = this.x;
        Object obj = this.A;
        switch (b) {
            case 0:
                return new i10((m10) this.z, (y00) obj, vz0Var, (byte) 0);
            case 1:
                return new i10((p51) obj, vz0Var, (byte) 1);
            case 2:
                return new i10((h22) obj, vz0Var, (byte) 2);
            default:
                return new i10((rn2) this.z, (String) obj, vz0Var, (byte) 3);
        }
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        vz0 vz0Var = (vz0) obj;
        switch (b) {
            case 0:
                return ((i10) create(vz0Var)).invokeSuspend(pn6Var);
            case 1:
                return ((i10) create(vz0Var)).invokeSuspend(pn6Var);
            case 2:
                return ((i10) create(vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((i10) create(vz0Var)).invokeSuspend(pn6Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x0230, code lost:
    
        if (r0.upsertAllProgress(r13, r21) == r6) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0221, code lost:
    
        if (r11.upsertAll(r14, r21) == r6) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0211, code lost:
    
        if (r11.clearAll(r21) == r6) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0204, code lost:
    
        if (r0.clearRemovedWatchHistory(r21) == r6) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x01fb, code lost:
    
        if (r0.clearAll(r21) == r6) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0094, code lost:
    
        if (defpackage.iv.q((defpackage.w42) r3, r5, r21) != r6) goto L29;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:134:0x01d0. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x022a  */
    /* JADX WARN: Type inference failed for: r2v0, types: [pn6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.Closeable] */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i10.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i10(Object obj, vz0 vz0Var, byte b) {
        super(1, vz0Var);
        this.x = b;
        this.A = obj;
    }
}
