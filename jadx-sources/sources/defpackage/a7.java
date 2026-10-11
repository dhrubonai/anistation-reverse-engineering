package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class a7 extends t36 implements jc2 {
    public Object A;
    public Object B;
    public final /* synthetic */ byte x;
    public byte y;
    public /* synthetic */ v11 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a7(Object obj, vz0 vz0Var, byte b) {
        super(3, vz0Var);
        this.x = b;
        this.B = obj;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.x;
        byte b2 = 3;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                a7 a7Var = new a7((ic2) this.B, (vz0) obj3, (byte) 0);
                a7Var.z = (yl4) obj;
                a7Var.A = (f91) obj2;
                return a7Var.invokeSuspend(pn6Var);
            case 1:
                a7 a7Var2 = new a7(b2, (vz0) obj3);
                a7Var2.z = (yl4) obj;
                a7Var2.A = (f91) obj2;
                return a7Var2.invokeSuspend(pn6Var);
            case 2:
                a7 a7Var3 = new a7((wp2) this.B, (vz0) obj3, (byte) 2);
                a7Var3.z = (yl4) obj;
                a7Var3.A = obj2;
                return a7Var3.invokeSuspend(pn6Var);
            case 3:
                a7 a7Var4 = new a7((cn0) this.B, (vz0) obj3, b2);
                a7Var4.z = (ji5) obj;
                a7Var4.A = (or2) obj2;
                return a7Var4.invokeSuspend(pn6Var);
            default:
                a7 a7Var5 = new a7((lc2) this.B, (vz0) obj3, (byte) 4);
                a7Var5.z = (yl4) obj;
                return a7Var5.invokeSuspend(pn6Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x02bd, code lost:
    
        if (r14 == r3) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cf, code lost:
    
        if (r14 == r3) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0133, code lost:
    
        if (r14 == r3) goto L62;
     */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a7.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a7(int i, vz0 vz0Var) {
        super(i, vz0Var);
        this.x = (byte) 1;
    }
}
