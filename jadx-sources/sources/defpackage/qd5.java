package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qd5 extends t36 implements ic2 {
    public final /* synthetic */ rd5 A;
    public long x;
    public byte y;
    public /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd5(rd5 rd5Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.A = rd5Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        qd5 qd5Var = new qd5(this.A, vz0Var);
        qd5Var.z = ((ur6) obj).a;
        return qd5Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        long j = ((ur6) obj).a;
        qd5 qd5Var = new qd5(this.A, (vz0) obj2);
        qd5Var.z = j;
        return qd5Var.invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        if (r15 == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            byte r0 = r14.y
            r1 = 3
            r2 = 2
            r3 = 1
            rd5 r4 = r14.A
            w11 r5 = defpackage.w11.x
            if (r0 == 0) goto L2e
            if (r0 == r3) goto L28
            if (r0 == r2) goto L20
            if (r0 != r1) goto L19
            long r0 = r14.x
            long r2 = r14.z
            defpackage.m37.N(r15)
            goto L70
        L19:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r14)
            r14 = 0
            return r14
        L20:
            long r2 = r14.x
            long r6 = r14.z
            defpackage.m37.N(r15)
            goto L56
        L28:
            long r6 = r14.z
            defpackage.m37.N(r15)
            goto L40
        L2e:
            defpackage.m37.N(r15)
            long r6 = r14.z
            g84 r15 = r4.f
            r14.z = r6
            r14.y = r3
            java.lang.Object r15 = r15.b(r6, r14)
            if (r15 != r5) goto L40
            goto L6d
        L40:
            ur6 r15 = (defpackage.ur6) r15
            long r8 = r15.a
            long r8 = defpackage.ur6.d(r6, r8)
            r14.z = r6
            r14.x = r8
            r14.y = r2
            java.lang.Object r15 = r4.a(r8, r14)
            if (r15 != r5) goto L55
            goto L6d
        L55:
            r2 = r8
        L56:
            ur6 r15 = (defpackage.ur6) r15
            long r11 = r15.a
            g84 r8 = r4.f
            long r9 = defpackage.ur6.d(r2, r11)
            r14.z = r6
            r14.x = r11
            r14.y = r1
            r13 = r14
            java.lang.Object r15 = r8.a(r9, r11, r13)
            if (r15 != r5) goto L6e
        L6d:
            return r5
        L6e:
            r2 = r6
            r0 = r11
        L70:
            ur6 r15 = (defpackage.ur6) r15
            long r14 = r15.a
            long r14 = defpackage.ur6.d(r0, r14)
            long r14 = defpackage.ur6.d(r2, r14)
            ur6 r0 = new ur6
            r0.<init>(r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qd5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
