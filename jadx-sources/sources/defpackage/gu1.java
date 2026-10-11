package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gu1 extends t36 implements ic2 {
    public Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ byte x = 1;
    public byte y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gu1(e9 e9Var, xx6 xx6Var, boolean z, wj wjVar, w44 w44Var, w44 w44Var2, w44 w44Var3, w44 w44Var4, vz0 vz0Var) {
        super(2, vz0Var);
        this.A = e9Var;
        this.B = xx6Var;
        this.z = z;
        this.C = wjVar;
        this.D = w44Var;
        this.E = w44Var2;
        this.F = w44Var3;
        this.G = w44Var4;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        Object obj2 = this.G;
        Object obj3 = this.F;
        Object obj4 = this.E;
        Object obj5 = this.D;
        Object obj6 = this.C;
        Object obj7 = this.B;
        switch (b) {
            case 0:
                return new gu1((ls0) obj7, (yn0) obj6, this.z, (dd2) obj5, (nc0) obj4, (nc0) obj3, (l11) obj2, vz0Var);
            default:
                return new gu1((e9) this.A, (xx6) obj7, this.z, (wj) obj6, (w44) obj5, (w44) obj4, (w44) obj3, (w44) obj2, vz0Var);
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
                return ((gu1) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((gu1) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x01da, code lost:
    
        if (r0 == r7) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x013b, code lost:
    
        if (r0 == r7) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x011f, code lost:
    
        if (r0 == r7) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x010c, code lost:
    
        if (defpackage.ov5.k(r11, r1, r12, true, r27) == r7) goto L77;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:41:0x00cf. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v13, types: [nk2, sz5] */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gu1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gu1(ls0 ls0Var, yn0 yn0Var, boolean z, dd2 dd2Var, nc0 nc0Var, nc0 nc0Var2, l11 l11Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.B = ls0Var;
        this.C = yn0Var;
        this.z = z;
        this.D = dd2Var;
        this.E = nc0Var;
        this.F = nc0Var2;
        this.G = l11Var;
    }
}
