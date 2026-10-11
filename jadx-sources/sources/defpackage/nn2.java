package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nn2 extends t36 implements ub2 {
    public byte x;
    public final /* synthetic */ rn2 y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn2(rn2 rn2Var, String str, vz0 vz0Var) {
        super(1, vz0Var);
        this.y = rn2Var;
        this.z = str;
    }

    @Override // defpackage.h30
    public final vz0 create(vz0 vz0Var) {
        return new nn2(this.y, this.z, vz0Var);
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        return ((nn2) create((vz0) obj)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x009d, code lost:
    
        if (defpackage.iv.q((defpackage.w42) r1, r4, r18) == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009f, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008c, code lost:
    
        if (r1 == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (r7.e(r18) == r8) goto L27;
     */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            byte r1 = r0.x
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            java.lang.String r6 = r0.z
            rn2 r7 = r0.y
            w11 r8 = defpackage.w11.x
            if (r1 == 0) goto L2b
            if (r1 == r5) goto L27
            if (r1 == r4) goto L21
            if (r1 != r3) goto L1b
            defpackage.m37.N(r19)
            goto La0
        L1b:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r0)
            return r2
        L21:
            defpackage.m37.N(r19)
            r1 = r19
            goto L8f
        L27:
            defpackage.m37.N(r19)
            goto L70
        L2b:
            defpackage.m37.N(r19)
            sx5 r1 = r7.e
        L30:
            java.lang.Object r9 = r1.getValue()
            r10 = r9
            tm6 r10 = (defpackage.tm6) r10
            java.util.Map r11 = r10.a
            com.anistation.model.Resource$Loading r12 = com.anistation.model.Resource.Loading.INSTANCE
            r11.getClass()
            boolean r13 = r11.isEmpty()
            if (r13 == 0) goto L4c
            java.util.Map r11 = java.util.Collections.singletonMap(r6, r12)
            r11.getClass()
            goto L55
        L4c:
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>(r11)
            r13.put(r6, r12)
            r11 = r13
        L55:
            r16 = 0
            r17 = 62
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            tm6 r10 = defpackage.tm6.a(r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r9 = r1.j(r9, r10)
            if (r9 == 0) goto L30
            r0.x = r5
            java.lang.Object r1 = r7.e(r0)
            if (r1 != r8) goto L70
            goto L9f
        L70:
            pn r1 = r7.b
            r0.x = r4
            zn r1 = (defpackage.zn) r1
            r1.getClass()
            sn r4 = new sn
            r4.<init>(r2, r1, r6)
            mx0 r1 = new mx0
            r5 = 5
            r1.<init>(r4, r5)
            ja1 r4 = defpackage.rh1.a
            j91 r4 = defpackage.j91.y
            w42 r1 = defpackage.zz.D(r1, r4)
            if (r1 != r8) goto L8f
            goto L9f
        L8f:
            w42 r1 = (defpackage.w42) r1
            mn2 r4 = new mn2
            r5 = 0
            r4.<init>(r7, r6, r2, r5)
            r0.x = r3
            java.lang.Object r0 = defpackage.iv.q(r1, r4, r0)
            if (r0 != r8) goto La0
        L9f:
            return r8
        La0:
            pn6 r0 = defpackage.pn6.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nn2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
