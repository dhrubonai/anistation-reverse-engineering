package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class o51 extends t36 implements ic2 {
    public final /* synthetic */ u05 A;
    public final /* synthetic */ p51 B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ boolean D;
    public u05 x;
    public byte y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o51(u05 u05Var, p51 p51Var, Object obj, boolean z, vz0 vz0Var) {
        super(2, vz0Var);
        this.A = u05Var;
        this.B = p51Var;
        this.C = obj;
        this.D = z;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        o51 o51Var = new o51(this.A, this.B, this.C, this.D, vz0Var);
        o51Var.z = obj;
        return o51Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((o51) create((x22) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
    
        if (r10 == r8) goto L21;
     */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            byte r0 = r9.y
            pn6 r1 = defpackage.pn6.a
            java.lang.Object r2 = r9.C
            p51 r3 = r9.B
            u05 r4 = r9.A
            r5 = 2
            r6 = 1
            r7 = 0
            w11 r8 = defpackage.w11.x
            if (r0 == 0) goto L29
            if (r0 == r6) goto L1f
            if (r0 != r5) goto L19
            defpackage.m37.N(r10)
            goto L78
        L19:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r9)
            return r7
        L1f:
            u05 r0 = r9.x
            java.lang.Object r6 = r9.z
            x22 r6 = (defpackage.x22) r6
            defpackage.m37.N(r10)
            goto L50
        L29:
            defpackage.m37.N(r10)
            java.lang.Object r10 = r9.z
            x22 r10 = (defpackage.x22) r10
            bq5 r0 = r3.c()
            r9.z = r10
            r9.x = r4
            r9.y = r6
            af2 r0 = r0.b
            java.lang.Object r0 = r0.y
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            int r0 = r0.incrementAndGet()
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r0)
            if (r6 != r8) goto L4c
            goto L77
        L4c:
            r0 = r6
            r6 = r10
            r10 = r0
            r0 = r4
        L50:
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            r0.x = r10
            r9.z = r7
            r9.x = r7
            r9.y = r5
            java.util.concurrent.atomic.AtomicBoolean r10 = r6.c
            boolean r10 = r10.get()
            if (r10 != 0) goto L91
            java.io.File r10 = r6.a
            w22 r0 = new w22
            r0.<init>(r6, r2, r7)
            java.lang.Object r10 = defpackage.n77.e0(r10, r0, r9)
            if (r10 != r8) goto L74
            goto L75
        L74:
            r10 = r1
        L75:
            if (r10 != r8) goto L78
        L77:
            return r8
        L78:
            boolean r9 = r9.D
            if (r9 == 0) goto L90
            af2 r9 = r3.h
            f41 r10 = new f41
            if (r2 == 0) goto L87
            int r0 = r2.hashCode()
            goto L88
        L87:
            r0 = 0
        L88:
            int r3 = r4.x
            r10.<init>(r0, r3, r2)
            r9.t(r10)
        L90:
            return r1
        L91:
            java.lang.String r9 = "This scope has already been closed."
            defpackage.ze0.m(r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o51.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
