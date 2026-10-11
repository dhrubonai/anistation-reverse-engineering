package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lx5 extends t36 implements jc2 {
    public final /* synthetic */ mx5 A;
    public byte x;
    public /* synthetic */ x42 y;
    public /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lx5(mx5 mx5Var, vz0 vz0Var) {
        super(3, vz0Var);
        this.A = mx5Var;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        lx5 lx5Var = new lx5(this.A, (vz0) obj3);
        lx5Var.y = (x42) obj;
        lx5Var.z = intValue;
        return lx5Var.invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0081, code lost:
    
        if (r0.emit(defpackage.tn5.z, r10) == r9) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
    
        if (defpackage.x97.u(Long.MAX_VALUE, r10) == r9) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r0.emit(defpackage.tn5.y, r10) == r9) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0042, code lost:
    
        if (r0.emit(defpackage.tn5.x, r10) == r9) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
    
        if (defpackage.x97.u(0, r10) == r9) goto L32;
     */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            x42 r0 = r10.y
            int r1 = r10.z
            byte r2 = r10.x
            r3 = 0
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            w11 r9 = defpackage.w11.x
            if (r2 == 0) goto L31
            if (r2 == r8) goto L2d
            if (r2 == r7) goto L29
            if (r2 == r6) goto L25
            if (r2 == r5) goto L21
            if (r2 != r4) goto L1b
            goto L2d
        L1b:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r10)
            return r3
        L21:
            defpackage.m37.N(r11)
            goto L75
        L25:
            defpackage.m37.N(r11)
            goto L63
        L29:
            defpackage.m37.N(r11)
            goto L54
        L2d:
            defpackage.m37.N(r11)
            goto L84
        L31:
            defpackage.m37.N(r11)
            if (r1 <= 0) goto L45
            r10.y = r3
            r10.z = r1
            r10.x = r8
            tn5 r11 = defpackage.tn5.x
            java.lang.Object r10 = r0.emit(r11, r10)
            if (r10 != r9) goto L84
            goto L83
        L45:
            r10.y = r0
            r10.z = r1
            r10.x = r7
            r7 = 0
            java.lang.Object r11 = defpackage.x97.u(r7, r10)
            if (r11 != r9) goto L54
            goto L83
        L54:
            r10.y = r0
            r10.z = r1
            r10.x = r6
            tn5 r11 = defpackage.tn5.y
            java.lang.Object r11 = r0.emit(r11, r10)
            if (r11 != r9) goto L63
            goto L83
        L63:
            r10.y = r0
            r10.z = r1
            r10.x = r5
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r11 = defpackage.x97.u(r5, r10)
            if (r11 != r9) goto L75
            goto L83
        L75:
            r10.y = r3
            r10.z = r1
            r10.x = r4
            tn5 r11 = defpackage.tn5.z
            java.lang.Object r10 = r0.emit(r11, r10)
            if (r10 != r9) goto L84
        L83:
            return r9
        L84:
            pn6 r10 = defpackage.pn6.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lx5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
