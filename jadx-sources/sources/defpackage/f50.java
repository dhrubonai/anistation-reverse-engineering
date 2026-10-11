package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class f50 extends x45 implements ic2 {
    public /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ byte y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f50(Object obj, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.y = b;
        this.B = obj;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.y;
        Object obj2 = this.B;
        switch (b) {
            case 0:
                f50 f50Var = new f50((oq4) obj2, vz0Var, (byte) 0);
                f50Var.A = obj;
                return f50Var;
            case 1:
                f50 f50Var2 = new f50((r01) obj2, vz0Var, (byte) 1);
                f50Var2.A = obj;
                return f50Var2;
            default:
                f50 f50Var3 = new f50((cc6) obj2, vz0Var, (byte) 2);
                f50Var3.A = obj;
                return f50Var3;
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.y;
        w11 w11Var = w11.x;
        pn6 pn6Var = pn6.a;
        z36 z36Var = (z36) obj;
        vz0 vz0Var = (vz0) obj2;
        switch (b) {
            case 0:
                return ((f50) create(z36Var, vz0Var)).invokeSuspend(pn6Var);
            case 1:
                ((f50) create(z36Var, vz0Var)).invokeSuspend(pn6Var);
                return w11Var;
            default:
                ((f50) create(z36Var, vz0Var)).invokeSuspend(pn6Var);
                return w11Var;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0065 -> B:19:0x0069). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0031 -> B:7:0x0035). Please report as a decompilation issue!!! */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            byte r0 = r7.y
            oq4 r1 = defpackage.oq4.x
            java.lang.Object r2 = r7.B
            r3 = 0
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            w11 r5 = defpackage.w11.x
            r6 = 1
            switch(r0) {
                case 0: goto L7b;
                case 1: goto L43;
                default: goto Lf;
            }
        Lf:
            boolean r0 = r7.z
            if (r0 == 0) goto L21
            if (r0 != r6) goto L1d
            java.lang.Object r0 = r7.A
            z36 r0 = (defpackage.z36) r0
            defpackage.m37.N(r8)
            goto L35
        L1d:
            defpackage.ze0.m(r4)
            goto L34
        L21:
            defpackage.m37.N(r8)
            java.lang.Object r8 = r7.A
            z36 r8 = (defpackage.z36) r8
            r0 = r8
        L29:
            r7.A = r0
            r7.z = r6
            java.lang.Object r8 = r0.d(r1, r7)
            if (r8 != r5) goto L35
            r3 = r5
        L34:
            return r3
        L35:
            nq4 r8 = (defpackage.nq4) r8
            r3 = r2
            cc6 r3 = (defpackage.cc6) r3
            boolean r8 = defpackage.fh5.a(r8)
            r8 = r8 ^ r6
            r3.v(r8)
            goto L29
        L43:
            boolean r0 = r7.z
            if (r0 == 0) goto L55
            if (r0 != r6) goto L51
            java.lang.Object r0 = r7.A
            z36 r0 = (defpackage.z36) r0
            defpackage.m37.N(r8)
            goto L69
        L51:
            defpackage.ze0.m(r4)
            goto L68
        L55:
            defpackage.m37.N(r8)
            java.lang.Object r8 = r7.A
            z36 r8 = (defpackage.z36) r8
            r0 = r8
        L5d:
            r7.A = r0
            r7.z = r6
            java.lang.Object r8 = r0.d(r1, r7)
            if (r8 != r5) goto L69
            r3 = r5
        L68:
            return r3
        L69:
            nq4 r8 = (defpackage.nq4) r8
            r3 = r2
            r01 r3 = (defpackage.r01) r3
            boolean r8 = defpackage.fh5.a(r8)
            r8 = r8 ^ r6
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r3.invoke(r8)
            goto L5d
        L7b:
            boolean r0 = r7.z
            if (r0 == 0) goto L8a
            if (r0 != r6) goto L85
            defpackage.m37.N(r8)
            goto L9c
        L85:
            defpackage.ze0.m(r4)
            r8 = r3
            goto L9c
        L8a:
            defpackage.m37.N(r8)
            java.lang.Object r8 = r7.A
            z36 r8 = (defpackage.z36) r8
            oq4 r2 = (defpackage.oq4) r2
            r7.z = r6
            java.lang.Object r8 = defpackage.j76.i(r8, r2, r7)
            if (r8 != r5) goto L9c
            r8 = r5
        L9c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f50.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
