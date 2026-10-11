package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class h54 extends t36 implements ic2 {
    public i54 A;
    public byte B;
    public /* synthetic */ Object C;
    public final /* synthetic */ c54 D;
    public final /* synthetic */ i54 E;
    public final /* synthetic */ ic2 F;
    public final /* synthetic */ Object G;
    public k54 x;
    public Object y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h54(c54 c54Var, i54 i54Var, ic2 ic2Var, Object obj, vz0 vz0Var) {
        super(2, vz0Var);
        this.D = c54Var;
        this.E = i54Var;
        this.F = ic2Var;
        this.G = obj;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        h54 h54Var = new h54(this.D, this.E, this.F, this.G, vz0Var);
        h54Var.C = obj;
        return h54Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((h54) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // defpackage.h30
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            byte r0 = r8.B
            r1 = 2
            r2 = 1
            r3 = 0
            w11 r4 = defpackage.w11.x
            if (r0 == 0) goto L3c
            if (r0 == r2) goto L25
            if (r0 != r1) goto L1f
            java.lang.Object r0 = r8.y
            i54 r0 = (defpackage.i54) r0
            k54 r1 = r8.x
            java.lang.Object r8 = r8.C
            f54 r8 = (defpackage.f54) r8
            defpackage.m37.N(r9)     // Catch: java.lang.Throwable -> L1c
            goto L90
        L1c:
            r9 = move-exception
            goto Lab
        L1f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r8)
            return r3
        L25:
            i54 r0 = r8.A
            java.lang.Object r2 = r8.z
            java.lang.Object r5 = r8.y
            ic2 r5 = (defpackage.ic2) r5
            k54 r6 = r8.x
            java.lang.Object r7 = r8.C
            f54 r7 = (defpackage.f54) r7
            defpackage.m37.N(r9)
            r9 = r6
            r6 = r5
            r5 = r9
            r9 = r0
            r0 = r7
            goto L78
        L3c:
            defpackage.m37.N(r9)
            java.lang.Object r9 = r8.C
            v11 r9 = (defpackage.v11) r9
            f54 r0 = new f54
            l11 r9 = r9.getCoroutineContext()
            h95 r5 = defpackage.h95.F
            j11 r9 = r9.get(r5)
            r9.getClass()
            h43 r9 = (defpackage.h43) r9
            c54 r5 = r8.D
            r0.<init>(r5, r9)
            i54 r9 = r8.E
            r9.a(r0)
            m54 r5 = r9.b
            r8.C = r0
            r8.x = r5
            ic2 r6 = r8.F
            r8.y = r6
            java.lang.Object r7 = r8.G
            r8.z = r7
            r8.A = r9
            r8.B = r2
            java.lang.Object r2 = r5.a(r8)
            if (r2 != r4) goto L77
            goto L8a
        L77:
            r2 = r7
        L78:
            r8.C = r0     // Catch: java.lang.Throwable -> La5
            r8.x = r5     // Catch: java.lang.Throwable -> La5
            r8.y = r9     // Catch: java.lang.Throwable -> La5
            r8.z = r3     // Catch: java.lang.Throwable -> La5
            r8.A = r3     // Catch: java.lang.Throwable -> La5
            r8.B = r1     // Catch: java.lang.Throwable -> La5
            java.lang.Object r8 = r6.invoke(r2, r8)     // Catch: java.lang.Throwable -> La5
            if (r8 != r4) goto L8b
        L8a:
            return r4
        L8b:
            r1 = r9
            r9 = r8
            r8 = r0
            r0 = r1
            r1 = r5
        L90:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch: java.lang.Throwable -> La3
        L92:
            boolean r2 = r0.compareAndSet(r8, r3)     // Catch: java.lang.Throwable -> La3
            if (r2 == 0) goto L99
            goto L9f
        L99:
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> La3
            if (r2 == r8) goto L92
        L9f:
            r1.l(r3)
            return r9
        La3:
            r8 = move-exception
            goto Lbb
        La5:
            r8 = move-exception
            r1 = r9
            r9 = r8
            r8 = r0
            r0 = r1
            r1 = r5
        Lab:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch: java.lang.Throwable -> La3
        Lad:
            boolean r2 = r0.compareAndSet(r8, r3)     // Catch: java.lang.Throwable -> La3
            if (r2 != 0) goto Lba
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> La3
            if (r2 != r8) goto Lba
            goto Lad
        Lba:
            throw r9     // Catch: java.lang.Throwable -> La3
        Lbb:
            r1.l(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h54.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
