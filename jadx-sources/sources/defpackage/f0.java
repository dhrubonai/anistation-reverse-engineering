package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class f0 extends t36 implements ic2 {
    public Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ byte x;
    public byte y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(u86 u86Var, long j, y86 y86Var, t86 t86Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.x = (byte) 2;
        this.A = u86Var;
        this.z = j;
        this.B = y86Var;
        this.C = t86Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        Object obj2 = this.C;
        Object obj3 = this.B;
        switch (b) {
            case 0:
                return new f0(obj3, this.z, (u34) obj2, vz0Var, (byte) 0);
            case 1:
                return new f0((kd3) obj3, (j32) obj2, this.z, vz0Var);
            case 2:
                return new f0((u86) this.A, this.z, (y86) obj3, (t86) obj2, vz0Var);
            default:
                return new f0(obj3, this.z, (u34) obj2, vz0Var, (byte) 3);
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
                return ((f0) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 1:
                return ((f0) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 2:
                return ((f0) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((f0) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        if (r9.a(r0, r14) != r7) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008e, code lost:
    
        if (r0.invoke(r3, r14) == r7) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0111, code lost:
    
        if (defpackage.wj.a(r0, r9, r12, r3, r14, 4) != r7) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x014d, code lost:
    
        if (((defpackage.h43) r8).G(r14) == r7) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(kd3 kd3Var, j32 j32Var, long j, vz0 vz0Var) {
        super(2, vz0Var);
        this.x = (byte) 1;
        this.B = kd3Var;
        this.C = j32Var;
        this.z = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(Object obj, long j, u34 u34Var, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.B = obj;
        this.z = j;
        this.C = u34Var;
    }
}
