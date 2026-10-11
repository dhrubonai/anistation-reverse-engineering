package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class x36 extends t36 implements ic2 {
    public byte x;
    public final /* synthetic */ long y;
    public final /* synthetic */ z36 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x36(long j, z36 z36Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.y = j;
        this.z = z36Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new x36(this.y, this.z, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((x36) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (defpackage.x97.u(8, r10) == r7) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002a, code lost:
    
        if (defpackage.x97.u(r3 - 8, r10) == r7) goto L15;
     */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            byte r0 = r10.x
            r1 = 8
            long r3 = r10.y
            r5 = 2
            r6 = 1
            w11 r7 = defpackage.w11.x
            if (r0 == 0) goto L1f
            if (r0 == r6) goto L1b
            if (r0 != r5) goto L14
            defpackage.m37.N(r11)
            goto L36
        L14:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r10)
            r10 = 0
            return r10
        L1b:
            defpackage.m37.N(r11)
            goto L2d
        L1f:
            defpackage.m37.N(r11)
            long r8 = r3 - r1
            r10.x = r6
            java.lang.Object r11 = defpackage.x97.u(r8, r10)
            if (r11 != r7) goto L2d
            goto L35
        L2d:
            r10.x = r5
            java.lang.Object r11 = defpackage.x97.u(r1, r10)
            if (r11 != r7) goto L36
        L35:
            return r7
        L36:
            z36 r10 = r10.z
            qg0 r10 = r10.z
            if (r10 == 0) goto L49
            pq4 r11 = new pq4
            r11.<init>(r3)
            y45 r0 = new y45
            r0.<init>(r11)
            r10.resumeWith(r0)
        L49:
            pn6 r10 = defpackage.pn6.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x36.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
