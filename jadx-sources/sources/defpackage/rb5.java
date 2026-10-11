package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rb5 extends t36 implements ic2 {
    public final /* synthetic */ long A;
    public final /* synthetic */ String B;
    public byte x;
    public final /* synthetic */ sb5 y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb5(sb5 sb5Var, long j, long j2, String str, vz0 vz0Var) {
        super(2, vz0Var);
        this.y = sb5Var;
        this.z = j;
        this.A = j2;
        this.B = str;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new rb5(this.y, this.z, this.A, this.B, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((rb5) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0096, code lost:
    
        if (defpackage.iv.q((defpackage.w42) r1, r5, r18) == r7) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0098, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        if (r1 == r7) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.Map, java.lang.Object] */
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
            java.lang.String r3 = r0.B
            r4 = 2
            r5 = 1
            sb5 r6 = r0.y
            w11 r7 = defpackage.w11.x
            if (r1 == 0) goto L24
            if (r1 == r5) goto L1e
            if (r1 != r4) goto L18
            defpackage.m37.N(r19)
            goto L99
        L18:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r0)
            return r2
        L1e:
            defpackage.m37.N(r19)
            r1 = r19
            goto L88
        L24:
            defpackage.m37.N(r19)
            sx5 r1 = r6.c
        L29:
            java.lang.Object r8 = r1.getValue()
            r9 = r8
            vm6 r9 = (defpackage.vm6) r9
            java.util.Map r10 = r9.e
            com.anistation.model.Resource$Loading r11 = com.anistation.model.Resource.Loading.INSTANCE
            r10.getClass()
            boolean r12 = r10.isEmpty()
            if (r12 == 0) goto L47
            java.util.Map r10 = java.util.Collections.singletonMap(r3, r11)
            r10.getClass()
            r16 = r10
            goto L51
        L47:
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            r12.<init>(r10)
            r12.put(r3, r11)
            r16 = r12
        L51:
            r17 = 15
            r10 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            vm6 r9 = defpackage.vm6.a(r9, r10, r11, r13, r15, r16, r17)
            boolean r8 = r1.j(r8, r9)
            if (r8 == 0) goto L29
            pn r1 = r6.b
            r0.x = r5
            r10 = r1
            zn r10 = (defpackage.zn) r10
            r10.getClass()
            un r8 = new un
            r9 = 0
            long r11 = r0.z
            long r13 = r0.A
            r8.<init>(r9, r10, r11, r13)
            mx0 r1 = new mx0
            r5 = 5
            r1.<init>(r8, r5)
            ja1 r5 = defpackage.rh1.a
            j91 r5 = defpackage.j91.y
            w42 r1 = defpackage.zz.D(r1, r5)
            if (r1 != r7) goto L88
            goto L98
        L88:
            w42 r1 = (defpackage.w42) r1
            xg r5 = new xg
            r8 = 6
            r5.<init>(r6, r3, r2, r8)
            r0.x = r4
            java.lang.Object r0 = defpackage.iv.q(r1, r5, r0)
            if (r0 != r7) goto L99
        L98:
            return r7
        L99:
            pn6 r0 = defpackage.pn6.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rb5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
