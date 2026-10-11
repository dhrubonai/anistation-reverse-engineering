package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class u65 extends t36 implements ic2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ String[] B;
    public byte x;
    public /* synthetic */ Object y;
    public final /* synthetic */ v65 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u65(v65 v65Var, boolean z, String[] strArr, vz0 vz0Var) {
        super(2, vz0Var);
        this.z = v65Var;
        this.A = z;
        this.B = strArr;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        u65 u65Var = new u65(this.z, this.A, this.B, vz0Var);
        u65Var.y = obj;
        return u65Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((u65) create((vh6) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b1, code lost:
    
        if (defpackage.lt5.l(r0, "VACUUM", r7) == r3) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a3, code lost:
    
        if (defpackage.lt5.l(r0, "PRAGMA wal_checkpoint(FULL)", r7) == r3) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008d, code lost:
    
        if (r8 == r3) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
    
        if (r0.a(defpackage.uh6.y, r8, r7) == r3) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006a, code lost:
    
        if (r8.e(r7) == r3) goto L34;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            byte r0 = r7.x
            r1 = 0
            v65 r2 = r7.z
            w11 r3 = defpackage.w11.x
            switch(r0) {
                case 0: goto L3f;
                case 1: goto L37;
                case 2: goto L2f;
                case 3: goto L27;
                case 4: goto L1e;
                case 5: goto L15;
                case 6: goto L10;
                default: goto La;
            }
        La:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r7)
            return r1
        L10:
            defpackage.m37.N(r8)
            goto Lb4
        L15:
            java.lang.Object r0 = r7.y
            vh6 r0 = (defpackage.vh6) r0
            defpackage.m37.N(r8)
            goto La6
        L1e:
            java.lang.Object r0 = r7.y
            vh6 r0 = (defpackage.vh6) r0
            defpackage.m37.N(r8)
            goto L90
        L27:
            java.lang.Object r0 = r7.y
            vh6 r0 = (defpackage.vh6) r0
            defpackage.m37.N(r8)
            goto L84
        L2f:
            java.lang.Object r0 = r7.y
            vh6 r0 = (defpackage.vh6) r0
            defpackage.m37.N(r8)
            goto L6d
        L37:
            java.lang.Object r0 = r7.y
            vh6 r0 = (defpackage.vh6) r0
            defpackage.m37.N(r8)
            goto L55
        L3f:
            defpackage.m37.N(r8)
            java.lang.Object r8 = r7.y
            vh6 r8 = (defpackage.vh6) r8
            r7.y = r8
            r0 = 1
            r7.x = r0
            java.lang.Boolean r0 = r8.b(r7)
            if (r0 != r3) goto L52
            goto Lb3
        L52:
            r6 = r0
            r0 = r8
            r8 = r6
        L55:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L6d
            i33 r8 = r2.getInvalidationTracker()
            r7.y = r0
            r4 = 2
            r7.x = r4
            java.lang.Object r8 = r8.e(r7)
            if (r8 != r3) goto L6d
            goto Lb3
        L6d:
            t65 r8 = new t65
            boolean r4 = r7.A
            java.lang.String[] r5 = r7.B
            r8.<init>(r4, r5, r1)
            r7.y = r0
            r4 = 3
            r7.x = r4
            uh6 r4 = defpackage.uh6.y
            java.lang.Object r8 = r0.a(r4, r8, r7)
            if (r8 != r3) goto L84
            goto Lb3
        L84:
            r7.y = r0
            r8 = 4
            r7.x = r8
            java.lang.Boolean r8 = r0.b(r7)
            if (r8 != r3) goto L90
            goto Lb3
        L90:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto Lbb
            r7.y = r0
            r8 = 5
            r7.x = r8
            java.lang.String r8 = "PRAGMA wal_checkpoint(FULL)"
            java.lang.Object r8 = defpackage.lt5.l(r0, r8, r7)
            if (r8 != r3) goto La6
            goto Lb3
        La6:
            r7.y = r1
            r8 = 6
            r7.x = r8
            java.lang.String r8 = "VACUUM"
            java.lang.Object r7 = defpackage.lt5.l(r0, r8, r7)
            if (r7 != r3) goto Lb4
        Lb3:
            return r3
        Lb4:
            i33 r7 = r2.getInvalidationTracker()
            r7.c()
        Lbb:
            pn6 r7 = defpackage.pn6.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u65.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
