package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class t65 extends t36 implements ic2 {
    public byte A;
    public /* synthetic */ Object B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ String[] D;
    public String[] x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t65(boolean z, String[] strArr, vz0 vz0Var) {
        super(2, vz0Var);
        this.C = z;
        this.D = strArr;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        t65 t65Var = new t65(this.C, this.D, vz0Var);
        t65Var.B = obj;
        return t65Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((t65) create((ij4) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0066, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        if (defpackage.lt5.l(r0, "PRAGMA defer_foreign_keys = TRUE", r9) == r3) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0064, code lost:
    
        if (defpackage.lt5.l(r6, r10, r9) == r3) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0064 -> B:6:0x0067). Please report as a decompilation issue!!! */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            byte r0 = r9.A
            r1 = 2
            r2 = 1
            w11 r3 = defpackage.w11.x
            if (r0 == 0) goto L29
            if (r0 == r2) goto L21
            if (r0 != r1) goto L1a
            int r0 = r9.z
            int r4 = r9.y
            java.lang.String[] r5 = r9.x
            java.lang.Object r6 = r9.B
            ij4 r6 = (defpackage.ij4) r6
            defpackage.m37.N(r10)
            goto L67
        L1a:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r9)
            r9 = 0
            return r9
        L21:
            java.lang.Object r0 = r9.B
            ij4 r0 = (defpackage.ij4) r0
            defpackage.m37.N(r10)
            goto L42
        L29:
            defpackage.m37.N(r10)
            java.lang.Object r10 = r9.B
            r0 = r10
            ij4 r0 = (defpackage.ij4) r0
            boolean r10 = r9.C
            if (r10 == 0) goto L42
            r9.B = r0
            r9.A = r2
            java.lang.String r10 = "PRAGMA defer_foreign_keys = TRUE"
            java.lang.Object r10 = defpackage.lt5.l(r0, r10, r9)
            if (r10 != r3) goto L42
            goto L66
        L42:
            java.lang.String[] r10 = r9.D
            int r4 = r10.length
            r5 = 0
            r6 = r0
            r0 = r4
            r4 = r5
            r5 = r10
        L4a:
            if (r4 >= r0) goto L69
            r10 = r5[r4]
            java.lang.String r7 = "DELETE FROM `"
            r8 = 96
            java.lang.String r10 = defpackage.qx1.g(r8, r7, r10)
            r9.B = r6
            r9.x = r5
            r9.y = r4
            r9.z = r0
            r9.A = r1
            java.lang.Object r10 = defpackage.lt5.l(r6, r10, r9)
            if (r10 != r3) goto L67
        L66:
            return r3
        L67:
            int r4 = r4 + r2
            goto L4a
        L69:
            pn6 r9 = defpackage.pn6.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t65.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
