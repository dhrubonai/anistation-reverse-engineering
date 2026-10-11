package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class b27 extends t36 implements ic2 {
    public final /* synthetic */ String A;
    public final /* synthetic */ byte x;
    public byte y;
    public final /* synthetic */ v27 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b27(v27 v27Var, String str, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = v27Var;
        this.A = str;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        String str = this.A;
        v27 v27Var = this.z;
        switch (b) {
            case 0:
                return new b27(v27Var, str, vz0Var, (byte) 0);
            default:
                return new b27(v27Var, str, vz0Var, (byte) 1);
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
                return ((b27) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((b27) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r11 == r5) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008d, code lost:
    
        if (r11 == r5) goto L30;
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
            pn6 r1 = defpackage.pn6.a
            r2 = 5
            java.lang.String r3 = r10.A
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            w11 r5 = defpackage.w11.x
            r6 = 1
            r7 = 2
            v27 r8 = r10.z
            r9 = 0
            switch(r0) {
                case 0: goto L5a;
                default: goto L13;
            }
        L13:
            byte r0 = r10.y
            if (r0 == 0) goto L28
            if (r0 == r6) goto L24
            if (r0 != r7) goto L1f
            defpackage.m37.N(r11)
            goto L59
        L1f:
            defpackage.ze0.m(r4)
            r1 = r9
            goto L59
        L24:
            defpackage.m37.N(r11)
            goto L49
        L28:
            defpackage.m37.N(r11)
            pn r11 = r8.c
            r10.y = r6
            zn r11 = (defpackage.zn) r11
            r11.getClass()
            tn r0 = new tn
            r0.<init>(r9, r11, r3)
            mx0 r11 = new mx0
            r11.<init>(r0, r2)
            ja1 r0 = defpackage.rh1.a
            j91 r0 = defpackage.j91.y
            w42 r11 = defpackage.zz.D(r11, r0)
            if (r11 != r5) goto L49
            goto L58
        L49:
            w42 r11 = (defpackage.w42) r11
            f27 r0 = new f27
            r0.<init>(r8, r9)
            r10.y = r7
            java.lang.Object r10 = defpackage.iv.q(r11, r0, r10)
            if (r10 != r5) goto L59
        L58:
            r1 = r5
        L59:
            return r1
        L5a:
            byte r0 = r10.y
            if (r0 == 0) goto L6f
            if (r0 == r6) goto L6b
            if (r0 != r7) goto L66
            defpackage.m37.N(r11)
            goto La0
        L66:
            defpackage.ze0.m(r4)
            r1 = r9
            goto La0
        L6b:
            defpackage.m37.N(r11)
            goto L90
        L6f:
            defpackage.m37.N(r11)
            pn r11 = r8.c
            r10.y = r6
            zn r11 = (defpackage.zn) r11
            r11.getClass()
            qn r0 = new qn
            r0.<init>(r9, r11, r3)
            mx0 r11 = new mx0
            r11.<init>(r0, r2)
            ja1 r0 = defpackage.rh1.a
            j91 r0 = defpackage.j91.y
            w42 r11 = defpackage.zz.D(r11, r0)
            if (r11 != r5) goto L90
            goto L9f
        L90:
            w42 r11 = (defpackage.w42) r11
            a27 r0 = new a27
            r0.<init>(r8, r3, r9)
            r10.y = r7
            java.lang.Object r10 = defpackage.iv.q(r11, r0, r10)
            if (r10 != r5) goto La0
        L9f:
            r1 = r5
        La0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b27.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
