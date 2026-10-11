package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class b7 extends t36 implements jc2 {
    public /* synthetic */ Object A;
    public final /* synthetic */ jc2 B;
    public final /* synthetic */ byte x;
    public byte y;
    public /* synthetic */ yl4 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b7(jc2 jc2Var, vz0 vz0Var, byte b) {
        super(3, vz0Var);
        this.x = b;
        this.B = jc2Var;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        jc2 jc2Var = this.B;
        yl4 yl4Var = (yl4) obj;
        vz0 vz0Var = (vz0) obj3;
        switch (b) {
            case 0:
                b7 b7Var = new b7(jc2Var, vz0Var, (byte) 0);
                b7Var.z = yl4Var;
                b7Var.A = obj2;
                return b7Var.invokeSuspend(pn6Var);
            default:
                b7 b7Var2 = new b7(jc2Var, vz0Var, (byte) 1);
                b7Var2.z = yl4Var;
                b7Var2.A = obj2;
                return b7Var2.invokeSuspend(pn6Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
    
        if (r11 == r4) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007a, code lost:
    
        if (r11 == r4) goto L38;
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
            jc2 r2 = r10.B
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            w11 r4 = defpackage.w11.x
            r5 = 1
            r6 = 2
            r7 = 0
            switch(r0) {
                case 0: goto L4d;
                default: goto L10;
            }
        L10:
            yl4 r0 = r10.z
            java.lang.Object r8 = r10.A
            byte r9 = r10.y
            if (r9 == 0) goto L29
            if (r9 == r5) goto L25
            if (r9 != r6) goto L20
            defpackage.m37.N(r11)
            goto L4c
        L20:
            defpackage.ze0.m(r3)
            r1 = r7
            goto L4c
        L25:
            defpackage.m37.N(r11)
            goto L3b
        L29:
            defpackage.m37.N(r11)
            java.lang.Object r11 = r0.x
            r10.z = r0
            r10.A = r7
            r10.y = r5
            java.lang.Object r11 = r2.invoke(r11, r8, r10)
            if (r11 != r4) goto L3b
            goto L4b
        L3b:
            yg4 r11 = (defpackage.yg4) r11
            if (r11 == 0) goto L4c
            r10.z = r7
            r10.A = r7
            r10.y = r6
            java.lang.Object r10 = r0.d(r10, r11)
            if (r10 != r4) goto L4c
        L4b:
            r1 = r4
        L4c:
            return r1
        L4d:
            yl4 r0 = r10.z
            java.lang.Object r8 = r10.A
            byte r9 = r10.y
            if (r9 == 0) goto L66
            if (r9 == r5) goto L62
            if (r9 != r6) goto L5d
            defpackage.m37.N(r11)
            goto L8f
        L5d:
            defpackage.ze0.m(r3)
            r1 = r7
            goto L8f
        L62:
            defpackage.m37.N(r11)
            goto L7d
        L66:
            defpackage.m37.N(r11)
            boolean r11 = r8 instanceof defpackage.yg4
            if (r11 != 0) goto L6e
            goto L8f
        L6e:
            java.lang.Object r11 = r0.x
            r10.z = r0
            r10.A = r7
            r10.y = r5
            java.lang.Object r11 = r2.invoke(r11, r8, r10)
            if (r11 != r4) goto L7d
            goto L8e
        L7d:
            yg4 r11 = (defpackage.yg4) r11
            if (r11 != 0) goto L82
            goto L8f
        L82:
            r10.z = r7
            r10.A = r7
            r10.y = r6
            java.lang.Object r10 = r0.d(r10, r11)
            if (r10 != r4) goto L8f
        L8e:
            r1 = r4
        L8f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
