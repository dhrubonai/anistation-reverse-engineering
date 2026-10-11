package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class s96 extends t36 implements ub2 {
    public final /* synthetic */ byte x;
    public byte y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s96(Object obj, vz0 vz0Var, byte b) {
        super(1, vz0Var);
        this.x = b;
        this.z = obj;
    }

    @Override // defpackage.h30
    public final vz0 create(vz0 vz0Var) {
        byte b = this.x;
        Object obj = this.z;
        switch (b) {
            case 0:
                return new s96((u96) obj, vz0Var, (byte) 0);
            default:
                return new s96((jb6) obj, vz0Var, (byte) 1);
        }
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        vz0 vz0Var = (vz0) obj;
        switch (b) {
            case 0:
                return ((s96) create(vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((s96) create(vz0Var)).invokeSuspend(pn6Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r8 == r3) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002f, code lost:
    
        if (r4.t(r8) == r3) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009d, code lost:
    
        if (r8 == r3) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0078, code lost:
    
        if (r7 == r3) goto L43;
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
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            w11 r3 = defpackage.w11.x
            java.lang.Object r4 = r8.z
            r5 = 1
            r6 = 2
            pn6 r7 = defpackage.pn6.a
            switch(r0) {
                case 0: goto L58;
                default: goto L10;
            }
        L10:
            jb6 r4 = (defpackage.jb6) r4
            byte r0 = r8.y
            if (r0 == 0) goto L26
            if (r0 == r5) goto L22
            if (r0 != r6) goto L1e
            defpackage.m37.N(r9)
            goto L54
        L1e:
            defpackage.ze0.m(r2)
            goto L57
        L22:
            defpackage.m37.N(r9)
            goto L32
        L26:
            defpackage.m37.N(r9)
            r8.y = r5
            java.lang.Object r9 = r4.t(r8)
            if (r9 != r3) goto L32
            goto L52
        L32:
            ai4 r9 = r4.f()
            if (r9 == 0) goto L54
            java.lang.Object r0 = r9.x
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r9 = r9.y
            nd6 r9 = (defpackage.nd6) r9
            long r1 = r9.a
            bn4 r9 = r4.i
            if (r9 == 0) goto L54
            r8.y = r6
            java.lang.Object r8 = r9.d(r0, r1, r8)
            if (r8 != r3) goto L4f
            goto L50
        L4f:
            r8 = r7
        L50:
            if (r8 != r3) goto L54
        L52:
            r1 = r3
            goto L57
        L54:
            r4.A = r5
            r1 = r7
        L57:
            return r1
        L58:
            u96 r4 = (defpackage.u96) r4
            byte r0 = r8.y
            if (r0 == 0) goto L6e
            if (r0 == r5) goto L6a
            if (r0 != r6) goto L66
            defpackage.m37.N(r9)
            goto La1
        L66:
            defpackage.ze0.m(r2)
            goto Lab
        L6a:
            defpackage.m37.N(r9)
            goto L7b
        L6e:
            defpackage.m37.N(r9)
            cc6 r9 = r4.R
            r8.y = r5
            r9.z()
            if (r7 != r3) goto L7b
            goto L9f
        L7b:
            bn4 r9 = r4.X
            if (r9 == 0) goto La1
            cc6 r0 = r4.R
            gi6 r0 = r0.a
            p96 r0 = r0.d()
            java.lang.CharSequence r0 = r0.A
            cc6 r1 = r4.R
            gi6 r1 = r1.a
            p96 r1 = r1.d()
            long r1 = r1.B
            r8.y = r6
            java.lang.Object r8 = r9.d(r0, r1, r8)
            if (r8 != r3) goto L9c
            goto L9d
        L9c:
            r8 = r7
        L9d:
            if (r8 != r3) goto La1
        L9f:
            r1 = r3
            goto Lab
        La1:
            cc6 r8 = r4.R
            ti4 r8 = r8.t
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            r8.setValue(r9)
            r1 = r7
        Lab:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s96.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
