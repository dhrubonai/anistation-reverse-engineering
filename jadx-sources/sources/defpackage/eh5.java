package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class eh5 extends x45 implements ic2 {
    public boolean A;
    public /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ byte y = 0;
    public long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh5(long j, v05 v05Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.z = j;
        this.C = v05Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.y;
        Object obj2 = this.C;
        switch (b) {
            case 0:
                eh5 eh5Var = new eh5(this.z, (v05) obj2, vz0Var);
                eh5Var.B = obj;
                return eh5Var;
            default:
                eh5 eh5Var2 = new eh5((uq4) obj2, vz0Var);
                eh5Var2.B = obj;
                return eh5Var2;
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.y;
        pn6 pn6Var = pn6.a;
        z36 z36Var = (z36) obj;
        vz0 vz0Var = (vz0) obj2;
        switch (b) {
            case 0:
                return ((eh5) create(z36Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((eh5) create(z36Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0043 -> B:7:0x0047). Please report as a decompilation issue!!! */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            byte r0 = r9.y
            java.lang.Object r1 = r9.C
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            w11 r4 = defpackage.w11.x
            r5 = 1
            switch(r0) {
                case 0: goto L51;
                default: goto Ld;
            }
        Ld:
            boolean r0 = r9.A
            if (r0 == 0) goto L21
            if (r0 != r5) goto L1d
            long r0 = r9.z
            java.lang.Object r2 = r9.B
            z36 r2 = (defpackage.z36) r2
            defpackage.m37.N(r10)
            goto L47
        L1d:
            defpackage.ze0.m(r3)
            goto L50
        L21:
            defpackage.m37.N(r10)
            java.lang.Object r10 = r9.B
            z36 r10 = (defpackage.z36) r10
            uq4 r1 = (defpackage.uq4) r1
            long r0 = r1.b
            rv6 r2 = r10.f()
            r2.getClass()
            r2 = 40
            long r2 = r2 + r0
            r0 = r2
            r2 = r10
        L38:
            r9.B = r2
            r9.z = r0
            r9.A = r5
            r10 = 3
            java.lang.Object r10 = defpackage.j76.b(r2, r9, r10)
            if (r10 != r4) goto L47
            r2 = r4
            goto L50
        L47:
            uq4 r10 = (defpackage.uq4) r10
            long r6 = r10.b
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 < 0) goto L38
            r2 = r10
        L50:
            return r2
        L51:
            v05 r1 = (defpackage.v05) r1
            boolean r0 = r9.A
            if (r0 == 0) goto L65
            if (r0 != r5) goto L61
            java.lang.Object r9 = r9.B
            z36 r9 = (defpackage.z36) r9
            defpackage.m37.N(r10)
            goto L84
        L61:
            defpackage.ze0.m(r3)
            goto Lb6
        L65:
            defpackage.m37.N(r10)
            java.lang.Object r10 = r9.B
            z36 r10 = (defpackage.z36) r10
            long r2 = r9.z
            o0 r0 = new o0
            r6 = 27
            r0.<init>(r1, r6)
            r9.B = r10
            r9.A = r5
            java.lang.Object r9 = defpackage.bo1.c(r10, r2, r0, r9)
            if (r9 != r4) goto L81
            r2 = r4
            goto Lb6
        L81:
            r8 = r10
            r10 = r9
            r9 = r8
        L84:
            uq4 r10 = (defpackage.uq4) r10
            if (r10 == 0) goto L9c
            long r0 = r1.x
            r2 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r0 = r0 & r2
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 == 0) goto L9c
            bj1 r2 = defpackage.bj1.y
            goto Lb6
        L9c:
            a46 r9 = r9.B
            nq4 r9 = r9.Q
            java.util.List r9 = r9.a
            java.lang.Object r9 = defpackage.yo0.k0(r9)
            uq4 r9 = (defpackage.uq4) r9
            boolean r10 = defpackage.t80.y(r9)
            if (r10 == 0) goto Lb4
            r9.a()
            bj1 r2 = defpackage.bj1.x
            goto Lb6
        Lb4:
            bj1 r2 = defpackage.bj1.A
        Lb6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eh5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh5(uq4 uq4Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.C = uq4Var;
    }
}
