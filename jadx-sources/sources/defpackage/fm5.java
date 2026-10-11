package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fm5 extends t36 implements ic2 {
    public byte x;
    public final /* synthetic */ hm5 y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fm5(hm5 hm5Var, boolean z, vz0 vz0Var) {
        super(2, vz0Var);
        this.y = hm5Var;
        this.z = z;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new fm5(this.y, this.z, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((fm5) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        if (r8 == r6) goto L23;
     */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            byte r0 = r7.x
            pn6 r1 = defpackage.pn6.a
            boolean r2 = r7.z
            hm5 r3 = r7.y
            r4 = 2
            r5 = 1
            w11 r6 = defpackage.w11.x
            if (r0 == 0) goto L21
            if (r0 == r5) goto L1d
            if (r0 != r4) goto L16
            defpackage.m37.N(r8)
            return r1
        L16:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r7)
            r7 = 0
            return r7
        L1d:
            defpackage.m37.N(r8)
            goto L37
        L21:
            defpackage.m37.N(r8)
            kf2 r8 = r3.d
            r7.x = r5
            mf2 r8 = (defpackage.mf2) r8
            hh2 r8 = r8.a
            java.lang.Object r8 = r8.g(r2, r7)
            if (r8 != r6) goto L33
            goto L34
        L33:
            r8 = r1
        L34:
            if (r8 != r6) goto L37
            goto L4c
        L37:
            if (r2 != 0) goto L4d
            kf2 r8 = r3.d
            r7.x = r4
            mf2 r8 = (defpackage.mf2) r8
            hh2 r8 = r8.a
            r0 = 0
            java.lang.Object r7 = r8.h(r0, r7)
            if (r7 != r6) goto L49
            goto L4a
        L49:
            r7 = r1
        L4a:
            if (r7 != r6) goto L4d
        L4c:
            return r6
        L4d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fm5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
