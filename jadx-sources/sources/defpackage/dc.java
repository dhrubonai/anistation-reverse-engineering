package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dc extends x45 implements ic2 {
    public /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ byte y;
    public byte z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dc(Object obj, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.y = b;
        this.B = obj;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.y;
        Object obj2 = this.B;
        switch (b) {
            case 0:
                dc dcVar = new dc((fc) obj2, vz0Var, (byte) 0);
                dcVar.A = obj;
                return dcVar;
            default:
                dc dcVar2 = new dc((ub2) obj2, vz0Var, (byte) 1);
                dcVar2.A = obj;
                return dcVar2;
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
                return ((dc) create(z36Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((dc) create(z36Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if (r15 == r5) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
    
        if (r15 == r5) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a8, code lost:
    
        if (r15 != r5) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0093, code lost:
    
        if (r15 == r5) goto L34;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00a8 -> B:25:0x00ac). Please report as a decompilation issue!!! */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
