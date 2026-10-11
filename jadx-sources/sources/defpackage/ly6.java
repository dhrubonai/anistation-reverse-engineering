package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ly6 extends t36 implements ic2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public byte x;
    public final /* synthetic */ ny6 y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly6(ny6 ny6Var, String str, int i, int i2, vz0 vz0Var) {
        super(2, vz0Var);
        this.y = ny6Var;
        this.z = str;
        this.A = i;
        this.B = i2;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new ly6(this.y, this.z, this.A, this.B, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((ly6) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (r9 == r7) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        if (r9.promoteLegacyIdentity(r3, r2, r8) == r7) goto L15;
     */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            byte r0 = r8.x
            r1 = 0
            int r2 = r8.A
            java.lang.String r3 = r8.z
            ny6 r4 = r8.y
            r5 = 2
            r6 = 1
            w11 r7 = defpackage.w11.x
            if (r0 == 0) goto L21
            if (r0 == r6) goto L1d
            if (r0 != r5) goto L17
            defpackage.m37.N(r9)
            goto L3c
        L17:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r8)
            return r1
        L1d:
            defpackage.m37.N(r9)
            goto L2f
        L21:
            defpackage.m37.N(r9)
            zx6 r9 = r4.a
            r8.x = r6
            java.lang.Object r9 = r9.promoteLegacyIdentity(r3, r2, r8)
            if (r9 != r7) goto L2f
            goto L3b
        L2f:
            zx6 r9 = r4.a
            r8.x = r5
            int r0 = r8.B
            java.lang.Object r9 = r9.getProgress(r3, r2, r0, r8)
            if (r9 != r7) goto L3c
        L3b:
            return r7
        L3c:
            com.anistation.local.entity.WatchProgress r9 = (com.anistation.local.entity.WatchProgress) r9
            if (r9 == 0) goto L45
            com.anistation.model.library.WatchProgress r8 = defpackage.bx7.f(r9)
            return r8
        L45:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ly6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
