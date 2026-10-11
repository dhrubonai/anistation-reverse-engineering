package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class wz4 extends t36 implements jc2 {
    public final /* synthetic */ ec2 A;
    public final /* synthetic */ byte x;
    public byte y;
    public /* synthetic */ yl4 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wz4(ec2 ec2Var, vz0 vz0Var, byte b) {
        super(3, vz0Var);
        this.x = b;
        this.A = ec2Var;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        ec2 ec2Var = this.A;
        yl4 yl4Var = (yl4) obj;
        switch (b) {
            case 0:
                wz4 wz4Var = new wz4((jc2) ec2Var, (vz0) obj3, (byte) 0);
                wz4Var.z = yl4Var;
                return wz4Var.invokeSuspend(pn6Var);
            case 1:
                wz4 wz4Var2 = new wz4((jc2) ec2Var, (vz0) obj3, (byte) 1);
                wz4Var2.z = yl4Var;
                return wz4Var2.invokeSuspend(pn6Var);
            default:
                wz4 wz4Var3 = new wz4((lc2) ec2Var, (vz0) obj3, (byte) 2);
                wz4Var3.z = yl4Var;
                return wz4Var3.invokeSuspend(pn6Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        if (r0 == r7) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [ec2] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [jc2] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [jc2] */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wz4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
